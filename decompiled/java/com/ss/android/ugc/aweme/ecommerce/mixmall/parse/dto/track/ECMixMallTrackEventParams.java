package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallTrackEventParams {

    @C09CT("ad_params")
    public Map<String, Object> adParams;

    @C09CT("item_data_params")
    public Map<String, String> itemDataCommonParams;

    @C09CT("page_params")
    public Map<String, String> pageParams;

    @C09CT("static_params")
    public Map<String, Object> staticParams;

    @C09CT("trace_params")
    public Map<String, String> traceParams;

    @C09CT("append_biz_common_params")
    public int withBizParams;

    @C09CT("append_tech_common_params")
    public int withRdParams;

    public ECMixMallTrackEventParams() {
        this(0, 0, null, null, null, null, null);
    }

    public ECMixMallTrackEventParams(int i, int i2, Map<String, ? extends Object> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, Map<String, ? extends Object> map5) {
        this.withBizParams = i;
        this.withRdParams = i2;
        this.staticParams = map;
        this.pageParams = map2;
        this.traceParams = map3;
        this.itemDataCommonParams = map4;
        this.adParams = map5;
    }
}
