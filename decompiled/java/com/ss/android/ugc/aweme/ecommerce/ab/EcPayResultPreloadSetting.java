package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPayResultPreloadSetting {
    public static final PreloadConfig LIZ;

    static {
        PreloadConfig preloadConfig = new PreloadConfig(false, false, 0, null, null, null, null, null, null, 511, null);
        PreloadConfig preloadConfig2 = (PreloadConfig) SettingsManager.LIZLLL().LJIIIIZZ("ec_pay_result_preload_setting", PreloadConfig.class, preloadConfig);
        if (preloadConfig2 != null) {
            preloadConfig = preloadConfig2;
        }
        LIZ = preloadConfig;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class PreloadConfig {

        @C09CT("prerender_cache_enable")
        public final boolean cacheEnable;

        @C09CT("channel")
        public final String channel;

        @C09CT("expired_time")
        public final int expiredTime;

        @C09CT("gecko_version")
        public final Long geckoVersion;

        @C09CT("pm_allow_list")
        public final List<String> pmAllowList;

        @C09CT("pm_block_list")
        public final List<String> pmBlockList;

        @C09CT("preload_allow_list")
        public final List<String> preloadAllowList;

        @C09CT("preload_control_enable")
        public final boolean preloadControlEnable;

        @C09CT("ec_pay_result_prerender_schema")
        public final String schema;

        public PreloadConfig() {
            this(false, false, 0, null, null, null, null, null, null, 511, null);
        }

        public PreloadConfig(boolean z, boolean z2, int i, String str, Long l, String str2, List<String> list, List<String> list2, List<String> list3) {
            this.preloadControlEnable = z;
            this.cacheEnable = z2;
            this.expiredTime = i;
            this.channel = str;
            this.geckoVersion = l;
            this.schema = str2;
            this.pmAllowList = list;
            this.pmBlockList = list2;
            this.preloadAllowList = list3;
        }

        public PreloadConfig(boolean z, boolean z2, int i, String str, Long l, String str2, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) == 0 ? z2 : false, (i2 & 4) != 0 ? 60 : i, (i2 & 8) != 0 ? "fe_tiktok_ecommerce_pay_middle" : str, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? "aweme://webview?url=https%3A%2F%2Foec-api.tiktokv.com%2Fview%2Ffe_tiktok_ecommerce_pay_middle%2Findex.html&use_forest=1&target_handler=crossPlatform&opt_title=0&screen_orientation=auto&use_spark=1&isECPreRender=1" : str2, (i2 & 64) != 0 ? Collections.singletonList("") : list, (i2 & 128) != 0 ? Collections.singletonList("") : list2, (i2 & 256) == 0 ? list3 : null);
        }
    }
}
