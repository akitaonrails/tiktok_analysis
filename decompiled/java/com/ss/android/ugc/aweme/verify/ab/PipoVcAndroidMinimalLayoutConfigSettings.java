package com.ss.android.ugc.aweme.verify.ab;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoVcAndroidMinimalLayoutConfigSettings {
    public static final PipoVcAndroidMinimalLayoutConfigModel LIZ = new PipoVcAndroidMinimalLayoutConfigModel(null);
    public static final Map<String, Float> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("PIN", Float.valueOf(0.66f)), new Pair("OTP", Float.valueOf(0.7f)), new Pair("PI", Float.valueOf(0.78f)));

    public static final PipoVcAndroidMinimalLayoutConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoVcAndroidMinimalLayoutConfigModel pipoVcAndroidMinimalLayoutConfigModel = LIZ;
        PipoVcAndroidMinimalLayoutConfigModel pipoVcAndroidMinimalLayoutConfigModel2 = (PipoVcAndroidMinimalLayoutConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_vc_android_minimal_layout_config", PipoVcAndroidMinimalLayoutConfigModel.class, pipoVcAndroidMinimalLayoutConfigModel);
        return pipoVcAndroidMinimalLayoutConfigModel2 != null ? pipoVcAndroidMinimalLayoutConfigModel2 : pipoVcAndroidMinimalLayoutConfigModel;
    }

    public static final class PipoVcAndroidMinimalLayoutConfigModel {

        @C09CT("data")
        public List<HeightAndVerifyTypePair> pairs;

        public PipoVcAndroidMinimalLayoutConfigModel() {
            this(null);
        }

        public PipoVcAndroidMinimalLayoutConfigModel(List<HeightAndVerifyTypePair> list) {
            this.pairs = list;
        }

        public final boolean LIZ(String str) {
            List<HeightAndVerifyTypePair> list = this.pairs;
            if (list != null) {
                for (HeightAndVerifyTypePair heightAndVerifyTypePair : list) {
                    if (u.LJIJI(heightAndVerifyTypePair.verifyType, str, false) && heightAndVerifyTypePair.heightRatio != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final float LIZIZ(String str) {
            Float f;
            if (!LIZ(str)) {
                Float f2 = PipoVcAndroidMinimalLayoutConfigSettings.LIZIZ.get(str);
                if (f2 != null) {
                    return f2.floatValue();
                }
                return 0.6f;
            }
            List<HeightAndVerifyTypePair> list = this.pairs;
            float fFloatValue = 0.0f;
            if (list != null) {
                for (HeightAndVerifyTypePair heightAndVerifyTypePair : list) {
                    if (u.LJIJI(heightAndVerifyTypePair.verifyType, str, false) && (f = heightAndVerifyTypePair.heightRatio) != null) {
                        fFloatValue = f.floatValue();
                    }
                }
            }
            return fFloatValue;
        }
    }

    public static final class HeightAndVerifyTypePair {

        @C09CT("height_ratio")
        public final Float heightRatio;

        @C09CT("verify_type")
        public final String verifyType;

        public HeightAndVerifyTypePair() {
            this(null, null);
        }

        public HeightAndVerifyTypePair(Float f, String str) {
            this.heightRatio = f;
            this.verifyType = str;
        }
    }
}
