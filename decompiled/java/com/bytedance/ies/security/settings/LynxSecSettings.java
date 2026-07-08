package com.bytedance.ies.security.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class LynxSecSettings {
    public static final LynxSecConfig LIZ = new LynxSecConfig(false, false, false, new ArrayList());

    public static LynxSecConfig LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            LynxSecConfig lynxSecConfig = LIZ;
            LynxSecConfig lynxSecConfig2 = (LynxSecConfig) settingsManagerLIZLLL.LJIIIIZZ("lynx_sec_loadurl", LynxSecConfig.class, lynxSecConfig);
            return lynxSecConfig2 != null ? lynxSecConfig2 : lynxSecConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }

    public static final class LynxSecConfig {

        @C09CT("enabled")
        public final boolean enable;

        @C09CT("force_https")
        public final boolean forceHttps;

        @C09CT("domains_intercept")
        public final boolean intercept;

        @C09CT("domains")
        public final List<String> whiteList;

        public LynxSecConfig() {
            this(false, false, false, new ArrayList());
        }

        public LynxSecConfig(boolean z, boolean z2, boolean z3, List<String> list) {
            this.enable = z;
            this.forceHttps = z2;
            this.intercept = z3;
            this.whiteList = list;
        }
    }
}
