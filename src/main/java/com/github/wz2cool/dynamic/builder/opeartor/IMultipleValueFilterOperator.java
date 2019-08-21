package com.github.wz2cool.dynamic.builder.opeartor;

import java.util.List;

/**
 * @author Frank
 */
public interface IMultipleValueFilterOperator<T> extends IFilterOperator<T> {
    /**
     * Get filter value.
     *
     * @return filter value.
     */
    @Override
    List<T> getValue();
}