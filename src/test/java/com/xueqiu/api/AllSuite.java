package com.xueqiu.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Stocks.class,
        StocksAddDelete.class
})
public class AllSuite {
}
