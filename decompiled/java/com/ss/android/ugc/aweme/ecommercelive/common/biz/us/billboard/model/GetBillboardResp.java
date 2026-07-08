package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class GetBillboardResp {

    @C09CT("billboard_version")
    public final Integer billboardVersion;

    @C09CT("billboards")
    public final List<ECBillboard> billboards;

    @C09CT("da_info")
    public Map<String, ? extends Object> daInfo;

    @C09CT("water_mark")
    public final ECWatcherWaterMark waterMark;

    public GetBillboardResp() {
        this(null, null, null, null);
    }

    public GetBillboardResp(List<ECBillboard> list, ECWatcherWaterMark eCWatcherWaterMark, Map<String, ? extends Object> map, Integer num) {
        this.billboards = list;
        this.waterMark = eCWatcherWaterMark;
        this.daInfo = map;
        this.billboardVersion = num;
    }
}
