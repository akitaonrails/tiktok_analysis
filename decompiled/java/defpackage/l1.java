package defpackage;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes36.dex */
public final class l1 {
    public static final DspPreloadConfigModel LIZ = new DspPreloadConfigModel();

    public static Config LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DspPreloadConfigModel dspPreloadConfigModel = LIZ;
        DspPreloadConfigModel dspPreloadConfigModel2 = (DspPreloadConfigModel) settingsManagerLIZLLL.LJIIIIZZ("dsp_preload_config", DspPreloadConfigModel.class, dspPreloadConfigModel);
        if (dspPreloadConfigModel2 != null) {
            dspPreloadConfigModel = dspPreloadConfigModel2;
        }
        return dspPreloadConfigModel.freeUserConfig;
    }
}
