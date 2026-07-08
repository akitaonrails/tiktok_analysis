package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public final class ShopRuntimeData {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("init_data")
    public final HashMap<String, Object> initData;

    @C09CT("schema")
    public final String schema;

    public ShopRuntimeData(String str, String str2, HashMap<String, Object> map) {
        this.id = str;
        this.schema = str2;
        this.initData = map;
    }
}
