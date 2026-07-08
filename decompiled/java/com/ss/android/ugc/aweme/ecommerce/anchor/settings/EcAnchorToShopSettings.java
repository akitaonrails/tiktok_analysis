package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class EcAnchorToShopSettings {
    public static final EcAnchorToShopModel LIZ = new EcAnchorToShopModel(false, C1697810uHb.LJIILJJIL("snssdk1180.onelink.me"), C1697810uHb.LJIILJJIL("new_user_deal_page.js"));

    public static final class EcAnchorToShopModel {

        @C09CT("enable_anchor_to_shop")
        public final boolean enableAnchorToShop;

        @C09CT("host_white_list")
        public final List<String> hostWhiteList;

        @C09CT("path_white_list")
        public final List<String> pathWhiteList;

        public EcAnchorToShopModel(boolean z, List<String> list, List<String> list2) {
            this.enableAnchorToShop = z;
            this.hostWhiteList = list;
            this.pathWhiteList = list2;
        }
    }
}
