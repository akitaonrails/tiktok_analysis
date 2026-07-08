package com.ss.android.ugc.aweme.anchor.expriment;

import X.C01GW;
import X.C09CT;
import X.C1868960yje;
import X.C452501pT;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorMonitorSettings {
    public static final AnchorMonitorSettingsModel LIZ = new AnchorMonitorSettingsModel(false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1868960yje());

    public static final boolean LIZ() {
        return ((AnchorMonitorSettingsModel) LIZIZ.getValue()).enable;
    }

    public static final class AnchorMonitorSettingsModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_apm")
        public final boolean enableApm;

        @C09CT("enable_applog")
        public final boolean enableAppLog;

        public AnchorMonitorSettingsModel() {
            this(false, false, false);
        }

        public AnchorMonitorSettingsModel(boolean z, boolean z2, boolean z3) {
            this.enable = z;
            this.enableApm = z2;
            this.enableAppLog = z3;
        }
    }
}
