package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class WebViewOverrideDedupConfig {
    public static final WebViewOverrideDedupModel LIZ = new WebViewOverrideDedupModel(false, 500);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(74));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(75));

    public static final class WebViewOverrideDedupModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("window_ms")
        public final long windowMs;

        public WebViewOverrideDedupModel() {
            this(false, 500L);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewOverrideDedupModel)) {
                return false;
            }
            WebViewOverrideDedupModel webViewOverrideDedupModel = (WebViewOverrideDedupModel) obj;
            return this.enable == webViewOverrideDedupModel.enable && this.windowMs == webViewOverrideDedupModel.windowMs;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Y2(this.windowMs);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WebViewOverrideDedupModel(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", windowMs=");
            sbLIZ.append(this.windowMs);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public WebViewOverrideDedupModel(boolean z, long j) {
            this.enable = z;
            this.windowMs = j;
        }
    }
}
