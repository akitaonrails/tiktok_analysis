package com.ss.android.ugc.aweme.verify.ab;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoVerificationRetentionPopupSettings {
    public static final PipoVerificationRetentionPopupModel LIZ = new PipoVerificationRetentionPopupModel(null);

    public static final class DataObject {

        @C09CT("is_use_verification_retention_popup")
        public final Boolean isUseVerificationRetentionPopup;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataObject) && Intrinsics.LJFF(this.isUseVerificationRetentionPopup, ((DataObject) obj).isUseVerificationRetentionPopup);
        }

        public final int hashCode() {
            Boolean bool = this.isUseVerificationRetentionPopup;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DataObject(isUseVerificationRetentionPopup=");
            sbLIZ.append(this.isUseVerificationRetentionPopup);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public DataObject() {
            this(Boolean.FALSE);
        }

        public DataObject(Boolean bool) {
            this.isUseVerificationRetentionPopup = bool;
        }
    }

    public static final class PipoVerificationRetentionPopupModel {

        @C09CT("data")
        public final DataObject dataObject;

        public PipoVerificationRetentionPopupModel() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PipoVerificationRetentionPopupModel) && Intrinsics.LJFF(this.dataObject, ((PipoVerificationRetentionPopupModel) obj).dataObject);
        }

        public final int hashCode() {
            DataObject dataObject = this.dataObject;
            if (dataObject == null) {
                return 0;
            }
            return dataObject.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PipoVerificationRetentionPopupModel(dataObject=");
            sbLIZ.append(this.dataObject);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean LIZ() {
            DataObject dataObject = this.dataObject;
            return dataObject != null && Intrinsics.LJFF(dataObject.isUseVerificationRetentionPopup, Boolean.TRUE);
        }

        public PipoVerificationRetentionPopupModel(DataObject dataObject) {
            this.dataObject = dataObject;
        }
    }

    public static final PipoVerificationRetentionPopupModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoVerificationRetentionPopupModel pipoVerificationRetentionPopupModel = LIZ;
        PipoVerificationRetentionPopupModel pipoVerificationRetentionPopupModel2 = (PipoVerificationRetentionPopupModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_verification_retention_popup", PipoVerificationRetentionPopupModel.class, pipoVerificationRetentionPopupModel);
        return pipoVerificationRetentionPopupModel2 != null ? pipoVerificationRetentionPopupModel2 : pipoVerificationRetentionPopupModel;
    }
}
