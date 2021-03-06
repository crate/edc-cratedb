/**
 * Copyright (C) Zoomdata, Inc. 2012-2017. All rights reserved.
 */
package com.zoomdata.connector.example.framework.common.sql;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Path;
import com.zoomdata.gen.edc.sort.AggSort;

import java.util.List;

public interface AggSortsProcessor {
    /**
     * Initializes processor and does all work.
     * @param table table.
     * @param sorts list of {@link AggSort}
     * @param metricsProcessor metric processor. Can't be <code>null</code>. If request has no metrics, this processor
     *                         will not be initialized.
     * @param groupsProcessor  group processor. Can't be <code>null</code>. If request has no groups, this processor
     *                         will not be initialized.
     * @return list of {@link OrderSpecifier} for ORDER BY.
     */
    List<OrderSpecifier> process(Path<?> table, List<AggSort> sorts,
                                 MetricsProcessor metricsProcessor, IGroupExpressionProducer groupsProcessor);
}
