package com.ss.android.ugc.aweme.search.lynx.xsearch.config;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.text.u;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEcomDecouplingChannelSettings {
    public static final ChannelList LIZ = new ChannelList(C1697810uHb.LJIIJJI("fe_tiktok_ecommerce_search_card", "tiktok_ecommerce_general_products_card_v3", "tiktok_ecommerce_search_llm_card", "tiktok_ecommerce_search_showcase_card", "tiktok_ecommerce_search_marketing_box", "tiktok_ecommerce_click_search_product_card", "tiktok_live_ecommerce_vertical_search", "fe_tiktok_ecommerce_search_transfer"));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(232));

    public static final class ChannelList {

        @C09CT("channal_list")
        public final List<String> channelList;

        public ChannelList(List<String> list) {
            this.channelList = list;
        }
    }

    public static boolean LIZ(String str) {
        List<String> list = ((ChannelList) LIZIZ.getValue()).channelList;
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (u.LJIJI(it2.next(), str, true)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
