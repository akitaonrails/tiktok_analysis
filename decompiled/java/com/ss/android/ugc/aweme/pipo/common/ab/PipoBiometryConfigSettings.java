package com.ss.android.ugc.aweme.pipo.common.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoBiometryConfigSettings {
    public static final PipoBiometryConfigModel LIZ = new PipoBiometryConfigModel(Boolean.FALSE, Boolean.FALSE);

    public static final class PipoBiometryConfigModel {

        @C09CT("android_allow_user_back")
        public final Boolean allowUserBack;

        @C09CT("is_biometry_restricted")
        public final Boolean isRestricted;

        public PipoBiometryConfigModel() {
            this(Boolean.FALSE, Boolean.FALSE);
        }

        public PipoBiometryConfigModel(Boolean bool, Boolean bool2) {
            this.allowUserBack = bool;
            this.isRestricted = bool2;
        }
    }

    public static final PipoBiometryConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoBiometryConfigModel pipoBiometryConfigModel = LIZ;
        PipoBiometryConfigModel pipoBiometryConfigModel2 = (PipoBiometryConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_biometry_config", PipoBiometryConfigModel.class, pipoBiometryConfigModel);
        return pipoBiometryConfigModel2 != null ? pipoBiometryConfigModel2 : pipoBiometryConfigModel;
    }
}
