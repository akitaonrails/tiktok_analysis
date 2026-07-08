package com.ss.android.ugc.aweme.tako.performance.mob.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoFluencyOptExp {
    public static final TakoFluencyOptConfig LIZ = new TakoFluencyOptConfig(false, false, false);
    public static final C01GW LIZIZ;

    static {
        new TakoFluencyOptConfig(true, true, true);
        LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(206));
    }

    public static final class TakoFluencyOptConfig {

        @C09CT("enable_gson_opt")
        public final boolean enableGsonOpt;

        @C09CT("enable_html_escape_opt")
        public final boolean enableHtmlEscapeOpt;

        @C09CT("enable_placeholder_source_log_opt")
        public final boolean enablePlaceholderSourceLogOpt;

        public TakoFluencyOptConfig() {
            this(false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TakoFluencyOptConfig)) {
                return false;
            }
            TakoFluencyOptConfig takoFluencyOptConfig = (TakoFluencyOptConfig) obj;
            return this.enablePlaceholderSourceLogOpt == takoFluencyOptConfig.enablePlaceholderSourceLogOpt && this.enableGsonOpt == takoFluencyOptConfig.enableGsonOpt && this.enableHtmlEscapeOpt == takoFluencyOptConfig.enableHtmlEscapeOpt;
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.enablePlaceholderSourceLogOpt) * 31) + C786410Ut5.Z2(this.enableGsonOpt)) * 31) + C786410Ut5.Z2(this.enableHtmlEscapeOpt);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TakoFluencyOptConfig(enablePlaceholderSourceLogOpt=");
            sbLIZ.append(this.enablePlaceholderSourceLogOpt);
            sbLIZ.append(", enableGsonOpt=");
            sbLIZ.append(this.enableGsonOpt);
            sbLIZ.append(", enableHtmlEscapeOpt=");
            sbLIZ.append(this.enableHtmlEscapeOpt);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TakoFluencyOptConfig(boolean z, boolean z2, boolean z3) {
            this.enablePlaceholderSourceLogOpt = z;
            this.enableGsonOpt = z2;
            this.enableHtmlEscapeOpt = z3;
        }
    }
}
