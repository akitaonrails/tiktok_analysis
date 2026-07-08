package com.ss.android.ugc.aweme.ab.general;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ECGeneralSearchCardConfig {

    @C09CT("ec_search_lynx_channel")
    public final List<String> channelList;

    @C09CT("ec_search_lynx_origin_type_list")
    public final List<Integer> originTypeList;

    public ECGeneralSearchCardConfig() {
        this(C1697810uHb.LJIILJJIL(9, 21, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 97), C1697810uHb.LJIILJJIL("tiktok_ecommerce_click_search_product_card"));
    }

    public ECGeneralSearchCardConfig(List<Integer> list, List<String> list2) {
        this.originTypeList = list;
        this.channelList = list2;
    }
}
