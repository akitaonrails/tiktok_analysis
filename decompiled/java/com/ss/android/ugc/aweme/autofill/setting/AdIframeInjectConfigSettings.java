package com.ss.android.ugc.aweme.autofill.setting;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class AdIframeInjectConfigSettings {
    public static final AdIframeInjectConfig LIZ = new AdIframeInjectConfig(false, 0);

    public static final AdIframeInjectConfig LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AdIframeInjectConfig adIframeInjectConfig = LIZ;
            AdIframeInjectConfig adIframeInjectConfig2 = (AdIframeInjectConfig) settingsManagerLIZLLL.LJIIIIZZ("ad_iframe_inject_config", AdIframeInjectConfig.class, adIframeInjectConfig);
            return adIframeInjectConfig2 != null ? adIframeInjectConfig2 : adIframeInjectConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final class AdIframeInjectConfig {

        @C09CT("iframe_inject_opt_strategy_first_enable")
        public final boolean iframeInjectOptStrategyFirstEnable;

        @C09CT("iframe_inject_opt_strategy")
        public final int iframeInjectStrategy;

        public AdIframeInjectConfig() {
            this(false, 0);
        }

        public AdIframeInjectConfig(boolean z, int i) {
            this.iframeInjectOptStrategyFirstEnable = z;
            this.iframeInjectStrategy = i;
        }
    }
}
