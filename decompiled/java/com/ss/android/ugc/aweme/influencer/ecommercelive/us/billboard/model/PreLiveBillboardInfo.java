package com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PreLiveBillboardInfo {

    @C09CT("da_info")
    public final Map<String, Object> daInfo;

    @C09CT("is_billboard_v1")
    public final Boolean isNewBillboard;

    @C09CT("v1_billboards")
    public final List<ECBillboard> v1Billboards;

    public PreLiveBillboardInfo() {
        this(Boolean.FALSE, null, null);
    }

    public PreLiveBillboardInfo(Boolean bool, List<ECBillboard> list, Map<String, ? extends Object> map) {
        this.isNewBillboard = bool;
        this.v1Billboards = list;
        this.daInfo = map;
    }
}
