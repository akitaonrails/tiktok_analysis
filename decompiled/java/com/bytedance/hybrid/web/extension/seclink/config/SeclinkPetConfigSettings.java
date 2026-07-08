package com.bytedance.hybrid.web.extension.seclink.config;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes35.dex */
public final class SeclinkPetConfigSettings {
    public static final SeclinkPetConfigModel LIZ = new SeclinkPetConfigModel(false, false);

    public static final SeclinkPetConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SeclinkPetConfigModel seclinkPetConfigModel = LIZ;
        SeclinkPetConfigModel seclinkPetConfigModel2 = (SeclinkPetConfigModel) settingsManagerLIZLLL.LJIIIIZZ("seclink_pet_config", SeclinkPetConfigModel.class, seclinkPetConfigModel);
        return seclinkPetConfigModel2 != null ? seclinkPetConfigModel2 : seclinkPetConfigModel;
    }

    public static final class SeclinkPetConfigModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("risk_diff")
        public final boolean riskDiff;

        public SeclinkPetConfigModel() {
            this(false, false);
        }

        public SeclinkPetConfigModel(boolean z, boolean z2) {
            this.enable = z;
            this.riskDiff = z2;
        }
    }
}
