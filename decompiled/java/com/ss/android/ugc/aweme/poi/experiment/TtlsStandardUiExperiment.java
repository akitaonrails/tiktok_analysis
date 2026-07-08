package com.ss.android.ugc.aweme.poi.experiment;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TtlsStandardUiExperiment {
    public static final TtlsStandardUiExperiment LIZ = new TtlsStandardUiExperiment();
    public static final TtlsStandardUiConfigModel LIZIZ = new TtlsStandardUiConfigModel(null, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(519));

    public static final class TtlsStandardUiConfigModel {

        @C09CT("ttls_standard_ui_rating_bar")
        public final Integer ratingBar;

        @C09CT("ttls_standard_ui_rating_input")
        public final Integer ratingInput;

        public TtlsStandardUiConfigModel() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TtlsStandardUiConfigModel)) {
                return false;
            }
            TtlsStandardUiConfigModel ttlsStandardUiConfigModel = (TtlsStandardUiConfigModel) obj;
            return Intrinsics.LJFF(this.ratingInput, ttlsStandardUiConfigModel.ratingInput) && Intrinsics.LJFF(this.ratingBar, ttlsStandardUiConfigModel.ratingBar);
        }

        public final int hashCode() {
            Integer num = this.ratingInput;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.ratingBar;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TtlsStandardUiConfigModel(ratingInput=");
            sbLIZ.append(this.ratingInput);
            sbLIZ.append(", ratingBar=");
            sbLIZ.append(this.ratingBar);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public TtlsStandardUiConfigModel(Integer num, Integer num2) {
            this.ratingInput = num;
            this.ratingBar = num2;
        }
    }
}
