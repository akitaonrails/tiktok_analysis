package com.ss.android.ugc.aweme.ecommerce.showcase.mix;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes19.dex */
public final class ShopHeaderChunkData {

    @C09CT("bff_type")
    public final Integer bffType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("lynx_data")
    public final n lynxData;

    @C09CT("schema")
    public final String schema;

    @C09CT("style")
    public final ShopHeaderStyleData style;

    @C09CT("timing_info")
    public n timingInfo;

    public ShopHeaderChunkData(String str, Integer num, n nVar, ShopHeaderStyleData shopHeaderStyleData, String str2, n nVar2) {
        this.id = str;
        this.bffType = num;
        this.lynxData = nVar;
        this.style = shopHeaderStyleData;
        this.schema = str2;
        this.timingInfo = nVar2;
    }
}
