package defpackage;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes7.dex */
public final class r1 {
    public static final EcSvPipConfigVarsModel LIZ = new EcSvPipConfigVarsModel(250, 300, 500, 6000);

    public static final EcSvPipConfigVarsModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcSvPipConfigVarsModel ecSvPipConfigVarsModel = LIZ;
        EcSvPipConfigVarsModel ecSvPipConfigVarsModel2 = (EcSvPipConfigVarsModel) settingsManagerLIZLLL.LJIIIIZZ("ec_sv_pip_config_vars", EcSvPipConfigVarsModel.class, ecSvPipConfigVarsModel);
        return ecSvPipConfigVarsModel2 != null ? ecSvPipConfigVarsModel2 : ecSvPipConfigVarsModel;
    }
}
