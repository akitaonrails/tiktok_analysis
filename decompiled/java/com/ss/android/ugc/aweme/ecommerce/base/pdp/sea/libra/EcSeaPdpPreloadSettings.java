package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcSeaPdpPreloadSettings {
    public static final EcSeaPdpPreloadModel LIZ;
    public static final EcSeaPdpPreloadModel LIZIZ;

    static {
        EcSeaPdpPreloadModel ecSeaPdpPreloadModel = new EcSeaPdpPreloadModel(2, 3000L, 2);
        LIZ = ecSeaPdpPreloadModel;
        try {
            EcSeaPdpPreloadModel ecSeaPdpPreloadModel2 = (EcSeaPdpPreloadModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_sea_pdp_preload_config", EcSeaPdpPreloadModel.class, ecSeaPdpPreloadModel);
            if (ecSeaPdpPreloadModel2 != null) {
                ecSeaPdpPreloadModel = ecSeaPdpPreloadModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ecSeaPdpPreloadModel = LIZ;
        }
        LIZIZ = ecSeaPdpPreloadModel;
    }

    public static final class EcSeaPdpPreloadModel {

        @C09CT("anchor_api_preload_duration")
        public final long anchorApiPreloadDuration;

        @C09CT("enable_anchor_api_preload")
        public final int enableAnchorApiPreload;

        @C09CT("enable_anchor_image_preload")
        public final int enableAnchorImagePreload;

        public EcSeaPdpPreloadModel() {
            this(2, 3000L, 2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcSeaPdpPreloadModel)) {
                return false;
            }
            EcSeaPdpPreloadModel ecSeaPdpPreloadModel = (EcSeaPdpPreloadModel) obj;
            return this.enableAnchorApiPreload == ecSeaPdpPreloadModel.enableAnchorApiPreload && this.anchorApiPreloadDuration == ecSeaPdpPreloadModel.anchorApiPreloadDuration && this.enableAnchorImagePreload == ecSeaPdpPreloadModel.enableAnchorImagePreload;
        }

        public final int hashCode() {
            return (((this.enableAnchorApiPreload * 31) + C786410Ut5.Y2(this.anchorApiPreloadDuration)) * 31) + this.enableAnchorImagePreload;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcSeaPdpPreloadModel(enableAnchorApiPreload=");
            sbLIZ.append(this.enableAnchorApiPreload);
            sbLIZ.append(", anchorApiPreloadDuration=");
            sbLIZ.append(this.anchorApiPreloadDuration);
            sbLIZ.append(", enableAnchorImagePreload=");
            sbLIZ.append(this.enableAnchorImagePreload);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcSeaPdpPreloadModel(int i, long j, int i2) {
            this.enableAnchorApiPreload = i;
            this.anchorApiPreloadDuration = j;
            this.enableAnchorImagePreload = i2;
        }
    }
}
