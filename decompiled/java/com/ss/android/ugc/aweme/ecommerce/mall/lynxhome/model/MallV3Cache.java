package com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MallV3Cache {

    @C09CT("data")
    public final Map<String, Object> data;

    @C09CT("log_id")
    public final String logId;

    public MallV3Cache() {
        this(null, null);
    }

    public MallV3Cache(Map<String, ? extends Object> map, String str) {
        this.data = map;
        this.logId = str;
    }
}
