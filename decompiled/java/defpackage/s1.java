package defpackage;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes32.dex */
public final class s1 {
    public static final EcSvPipFeatureSwitchesModel LIZ = new EcSvPipFeatureSwitchesModel(false, false, false, false);

    public static final boolean LIZ() {
        return LIZIZ().enableHideToSide;
    }

    public static final EcSvPipFeatureSwitchesModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcSvPipFeatureSwitchesModel ecSvPipFeatureSwitchesModel = LIZ;
        EcSvPipFeatureSwitchesModel ecSvPipFeatureSwitchesModel2 = (EcSvPipFeatureSwitchesModel) settingsManagerLIZLLL.LJIIIIZZ("ec_sv_pip_feature_switches", EcSvPipFeatureSwitchesModel.class, ecSvPipFeatureSwitchesModel);
        return ecSvPipFeatureSwitchesModel2 != null ? ecSvPipFeatureSwitchesModel2 : ecSvPipFeatureSwitchesModel;
    }
}
