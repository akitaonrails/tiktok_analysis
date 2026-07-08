package com.ss.android.ugc.aweme.pipo.cashier.cashier.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoQueryConfigSettings {
    public static final Config LIZ = new Config(30000L, 10);

    public static final class Config {

        @C09CT("query_trade_result_retry_count")
        public final Integer queryTradeResultRetryCount;

        @C09CT("query_trade_result_timeout")
        public final Long queryTradeResultTimeout;

        public Config() {
            this(30000L, 10);
        }

        public Config(Long l, Integer num) {
            this.queryTradeResultTimeout = l;
            this.queryTradeResultRetryCount = num;
        }
    }
}
