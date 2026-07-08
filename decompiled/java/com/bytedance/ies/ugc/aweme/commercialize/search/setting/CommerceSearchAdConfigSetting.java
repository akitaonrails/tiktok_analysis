package com.bytedance.ies.ugc.aweme.commercialize.search.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class CommerceSearchAdConfigSetting {
    public static final CommerceSearchAdConfig LIZ = new CommerceSearchAdConfig(true, false, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(52));

    public static final CommerceSearchAdConfig LIZ() {
        return (CommerceSearchAdConfig) LIZIZ.getValue();
    }

    public static final class CommerceSearchAdConfig {

        @C09CT("card_show_buffer_millseconds")
        public final Integer cardShowBufferMillSeconds;

        @C09CT("disable_perf_for_search_ad")
        public final boolean disableFpsMonitorForSearchAd;

        @C09CT("enable_dedup_show_and_omsdk")
        public final boolean enableDedupShowAndOmsdk;

        public CommerceSearchAdConfig() {
            this(true, false, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }

        public CommerceSearchAdConfig(boolean z, boolean z2, Integer num) {
            this.enableDedupShowAndOmsdk = z;
            this.disableFpsMonitorForSearchAd = z2;
            this.cardShowBufferMillSeconds = num;
        }
    }
}
