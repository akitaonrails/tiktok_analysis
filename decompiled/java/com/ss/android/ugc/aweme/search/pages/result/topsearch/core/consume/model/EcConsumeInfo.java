package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.consume.model;

import X.C09CT;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class EcConsumeInfo {

    @C09CT("ec_buy_button_click")
    public Map<String, ? extends Set<String>> ecCartClickInfo;

    @C09CT("ec_product_show")
    public Map<String, ? extends Set<String>> ecProductInfo;

    @C09CT("ec_enter_pdp")
    public Map<String, ? extends Set<String>> enterPdpInfo;

    public EcConsumeInfo() {
        this(null, null, null);
    }

    public EcConsumeInfo(Map<String, ? extends Set<String>> map, Map<String, ? extends Set<String>> map2, Map<String, ? extends Set<String>> map3) {
        this.enterPdpInfo = map;
        this.ecCartClickInfo = map2;
        this.ecProductInfo = map3;
    }
}
