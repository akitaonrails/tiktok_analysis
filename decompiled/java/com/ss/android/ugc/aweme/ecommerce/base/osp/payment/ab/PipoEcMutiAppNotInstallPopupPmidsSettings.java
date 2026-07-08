package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C2188811AlT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcMutiAppNotInstallPopupPmidsSettings {
    public static final PipoEcMutiAppNotInstallPopupPmidsModel LIZ;

    static {
        new PipoEcMutiAppNotInstallPopupPmidsSettings();
        LIZ = new PipoEcMutiAppNotInstallPopupPmidsModel(Collections.singletonList("pm_pi_mb_bancontact_c_r"));
    }

    public static final class PipoEcMutiAppNotInstallPopupPmidsModel {

        @C09CT("allow_pm_ids")
        public final List<String> allowPmIds;

        public PipoEcMutiAppNotInstallPopupPmidsModel() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PipoEcMutiAppNotInstallPopupPmidsModel) && Intrinsics.LJFF(this.allowPmIds, ((PipoEcMutiAppNotInstallPopupPmidsModel) obj).allowPmIds);
        }

        public final int hashCode() {
            return this.allowPmIds.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PipoEcMutiAppNotInstallPopupPmidsModel(allowPmIds=");
            sbLIZ.append(this.allowPmIds);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PipoEcMutiAppNotInstallPopupPmidsModel(List<String> list) {
            this.allowPmIds = list;
        }

        public PipoEcMutiAppNotInstallPopupPmidsModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }

    public static final boolean LIZ(String str) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoEcMutiAppNotInstallPopupPmidsModel pipoEcMutiAppNotInstallPopupPmidsModel = LIZ;
        PipoEcMutiAppNotInstallPopupPmidsModel pipoEcMutiAppNotInstallPopupPmidsModel2 = (PipoEcMutiAppNotInstallPopupPmidsModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ec_muti_app_not_install_popup_pmids", PipoEcMutiAppNotInstallPopupPmidsModel.class, pipoEcMutiAppNotInstallPopupPmidsModel);
        if (pipoEcMutiAppNotInstallPopupPmidsModel2 != null) {
            pipoEcMutiAppNotInstallPopupPmidsModel = pipoEcMutiAppNotInstallPopupPmidsModel2;
        }
        return C13LP.LJJJJ(str, pipoEcMutiAppNotInstallPopupPmidsModel.allowPmIds);
    }
}
