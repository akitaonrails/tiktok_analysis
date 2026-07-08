package com.ss.android.ugc.aweme.boot.live;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public class LiveRevenueBean {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    @C09CT("status_code")
    public int statusCode;

    public static class Data {

        @C09CT("disable_client_cache")
        public boolean disableClientCache;
    }

    public static class Extra {

        @C09CT("now")
        public long now;
    }
}
