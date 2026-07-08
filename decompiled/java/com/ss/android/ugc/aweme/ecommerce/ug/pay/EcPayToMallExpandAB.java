package com.ss.android.ugc.aweme.ecommerce.ug.pay;

import X.C09CT;
import X.C0C64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EcPayToMallExpandAB {
    public static final Config LIZ;
    public static final Config LIZIZ;

    static {
        Config config = new Config(null, null, true, null, true);
        LIZ = config;
        try {
            Config config2 = (Config) C0C64.LJIILLIIL().LJJII(Config.class, config, "ec_pay_to_mall_expand", true);
            if (config2 != null) {
                config = config2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            config = LIZ;
        }
        LIZIZ = config;
    }

    public static final class Config {

        @C09CT("ec_pay_to_mall_order_bubble_enable")
        public final boolean orderBubbleEnable;

        @C09CT("ec_pay_to_mall_scroll_to_feed_enable")
        public final boolean scrollToFeed;

        @C09CT("ec_pay_to_mall_limit_sources")
        public final List<String> sourcePages;

        @C09CT("source_to_PTM_method")
        public final Map<String, Integer> sourceToPTMMethod;

        @C09CT("ec_pay_to_mall_no_back_button_in_tabs")
        public final List<String> tabsWithoutBack;

        public Config() {
            this(null, null, true, null, true);
        }

        public Config(List<String> list, List<String> list2, boolean z, Map<String, Integer> map, boolean z2) {
            this.sourcePages = list;
            this.tabsWithoutBack = list2;
            this.scrollToFeed = z;
            this.sourceToPTMMethod = map;
            this.orderBubbleEnable = z2;
        }
    }
}
