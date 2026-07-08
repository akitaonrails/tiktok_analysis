package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes27.dex */
public final class ECWebViewWarmupAB {
    public static final EcWebViewWarmupConfig LIZ = new EcWebViewWarmupConfig(0, 0, 0, 0);

    public static boolean LIZ() {
        EcWebViewWarmupConfig ecWebViewWarmupConfig = (EcWebViewWarmupConfig) C0C64.LJIILLIIL().LJJII(EcWebViewWarmupConfig.class, LIZ, "is_webview_preload", true);
        return ecWebViewWarmupConfig != null && ecWebViewWarmupConfig.inSubmitOrder > 0;
    }

    public static final class EcWebViewWarmupConfig {

        @C09CT("is_webview_preload_in_inbox")
        public final int inInbox;

        @C09CT("is_webview_preload_in_order_center")
        public final int inOrderCenter;

        @C09CT("is_webview_preload_in_order_list")
        public final int inOrderList;

        @C09CT("is_webview_preload_in_checkout")
        public final int inSubmitOrder;

        public EcWebViewWarmupConfig() {
            this(0, 0, 0, 0);
        }

        public EcWebViewWarmupConfig(int i, int i2, int i3, int i4) {
            this.inSubmitOrder = i;
            this.inInbox = i2;
            this.inOrderCenter = i3;
            this.inOrderList = i4;
        }
    }
}
