package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PollingResponse {

    @C09CT("data")
    public List<String> data;

    @C09CT("extra")
    public Extra extra;

    @C09CT("internal_ext")
    public String internalExt = "";

    @C09CT("status_code")
    public int statusCode;

    public static final class Extra {

        @C09CT("cursor")
        public String cursor = "";

        @C09CT("fetch_interval")
        public long fetchInterval;

        @C09CT("now")
        public long now;
    }
}
