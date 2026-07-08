package com.ss.android.ugc.aweme.account.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes29.dex */
public final class SwitchAccountGestureGuardSettings {
    public static final Model LIZ = new Model(3000, true, Mp4ScreenVideoLoadTimeout.CONTROL);

    public static final class Model {

        @C09CT("confirm_pending_timeout_ms")
        public final long confirmPendingTimeoutMs;

        @C09CT("guard_window_ms")
        public final long guardWindowMs;

        @C09CT("loading_enabled")
        public final boolean loadingEnabled;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Model)) {
                return false;
            }
            Model model = (Model) obj;
            return this.guardWindowMs == model.guardWindowMs && this.loadingEnabled == model.loadingEnabled && this.confirmPendingTimeoutMs == model.confirmPendingTimeoutMs;
        }

        public final int hashCode() {
            return (((C786410Ut5.Y2(this.guardWindowMs) * 31) + C786410Ut5.Z2(this.loadingEnabled)) * 31) + C786410Ut5.Y2(this.confirmPendingTimeoutMs);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Model(guardWindowMs=");
            sbLIZ.append(this.guardWindowMs);
            sbLIZ.append(", loadingEnabled=");
            sbLIZ.append(this.loadingEnabled);
            sbLIZ.append(", confirmPendingTimeoutMs=");
            sbLIZ.append(this.confirmPendingTimeoutMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Model() {
            this(3000L, true, Mp4ScreenVideoLoadTimeout.CONTROL);
        }

        public Model(long j, boolean z, long j2) {
            this.guardWindowMs = j;
            this.loadingEnabled = z;
            this.confirmPendingTimeoutMs = j2;
        }
    }

    public static final Model LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Model model = LIZ;
        Model model2 = (Model) settingsManagerLIZLLL.LJIIIIZZ("switch_account_gesture_guard", Model.class, model);
        return model2 != null ? model2 : model;
    }
}
