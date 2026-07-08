package defpackage;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class LsInitialParamsCalibrationSettings {
    public static final LsInitialParamsConfigModel LIZ = new LsInitialParamsConfigModel(0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(0));

    public static final class LsInitialParamsConfigModel {

        @C09CT("local_service_btm_calibration")
        public final Integer enableCalibration;

        @C09CT("enable_replace")
        public final Integer enableReplace;

        public LsInitialParamsConfigModel() {
            this(0, 0);
        }

        public LsInitialParamsConfigModel(Integer num, Integer num2) {
            this.enableCalibration = num;
            this.enableReplace = num2;
        }
    }
}
