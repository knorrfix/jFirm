/*
 * Copyright (C) 1995-2008 University of Karlsruhe.  All right reserved.
 *
 * This file is part of libFirm.
 *
 * This file may be distributed and/or modified under the terms of the
 * GNU General Public License version 2 as published by the Free Software
 * Foundation and appearing in the file LICENSE.GPL included in the
 * packaging of this file.
 *
 * Licensees holding valid libFirm Professional Edition licenses may use
 * this file in accordance with the libFirm Commercial License.
 * Agreement provided with the Software.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */

/**
 * @file
 * @brief    Compute an estimate of field temperature, i.e., field access heuristic.
 * @author   Goetz Lindenmaier
 * @date     21.7.2004
 * @version  $Id: field_temperature.h 17143 2008-01-02 20:56:33Z beck $
 * @note
 *  Watch it! This is highly java dependent.
 *
 * - All Sel nodes get an array with possibly accessed entities.
 *   (resolve polymorphy on base of inherited entities.)
 *   (the mentioned entity in first approximation.)
 *
 * - We compute a value for the entity based on the Sel nodes.
 */
#ifndef FIRM_ANA_FIELD_TEMPERATURE_H
#define FIRM_ANA_FIELD_TEMPERATURE_H

#include "firm_types.h"

/* The number of array elements we assume if not both bounds are given. */
#define DEFAULT_N_ARRAY_ELEMENTS 1

/** The entities that can be accessed by this Sel node. *
int       get_Sel_n_accessed_entities(ir_node *sel);
ir_entity *get_Sel_accessed_entity    (ir_node *sel, int pos);
*/

int get_irn_loop_call_depth(ir_node *n);
/** Return loop depth of node.
 *
 *  Returns the loop depth of n in the control flow.  I.e., we
 *  go from the node to the block to the loop the block is in,
 *  and return its depth.  */
int get_irn_cfloop_depth(ir_node *n);
int get_irn_recursion_depth(ir_node *n);

/** Get the weighted interprocedural loop depth of the node.
    The depth is estimated by a heuristic. The heuristic considers
    loop and recursion depth. */
int get_weighted_loop_depth(ir_node *n);

/** Heuristic merging recursion and loop depth. */
double get_irn_final_cost(ir_node *n);

/** Get accumulated(really?) execution frequencies.
 *  A heuristic weights the recursions. */
double get_type_estimated_n_instances(ir_type *clss);
double get_type_estimated_mem_consumption_bytes(ir_type *tp);
/** Estimates the size of an object.
 *
 *  The heuristic mainly affects array sizes.
 *  Further this ignores padding for alignment, especially of small fields. */
int    get_type_estimated_size_bytes(ir_type *tp);
/** Estimates the number of fields of a single Object.
 *  The heuristic mainly affects array sizes.
 *  @@@ Misses inherited fields! */
int    get_type_estimated_n_fields(ir_type *tp);
double get_type_estimated_n_casts(ir_type *clss);

double get_class_estimated_n_upcasts(ir_type *clss);
double get_class_estimated_n_downcasts(ir_type *clss);
/** Returns the number of accesses to the dispatch table.
 *
 *  This includes the initialization of the pointer field, and accesses
 *  to virtual fields (as instance marker in Java).  Certainly this
 *  includes virtual method calls. */
double get_class_estimated_n_dyncalls(ir_type *clss);
/** Returns the number of writes to the dispatch pointer.
 *  This is the same as the number of allocations. */
double get_class_estimated_dispatch_writes(ir_type *clss);
/** Returns the number of reads of the dispatch pointer. */
double get_class_estimated_dispatch_reads (ir_type *clss);

double get_entity_estimated_n_loads(ir_entity *ent);
double get_entity_estimated_n_stores(ir_entity *ent);
double get_entity_estimated_n_calls(ir_entity *ent);
/** The number of accesses to dynamically called methods and
 *  to other static fields that overwrite/are overwritten. */
double get_entity_estimated_n_dyncalls(ir_entity *ent);

/* ------------------------------------------------------------------------- */
/* Accumulate information in the type hierarchy.                             */
/* ------------------------------------------------------------------------- */

typedef enum {
  temperature_none,
  temperature_consistent,
  temperature_inconsistent
} irp_temperature_state;

#if 0

/** An auxiliary/temporary function */
int is_jack_rts_class(ir_type *t);
int is_jack_rts_entity(ir_entity *e);

#endif

#endif
