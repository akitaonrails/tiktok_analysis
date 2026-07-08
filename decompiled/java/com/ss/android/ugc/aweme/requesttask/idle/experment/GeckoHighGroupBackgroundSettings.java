package com.ss.android.ugc.aweme.requesttask.idle.experment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes34.dex */
public final class GeckoHighGroupBackgroundSettings {
    public static final GeckoHighGroupBackgroundModel LIZ;

    public static class GeckoHighGroupBackgroundModel {

        @C09CT("delay_time")
        public long delayTime;

        @C09CT("trigger_foreground_download")
        public boolean triggerForegroundDownload;
    }

    static {
        GeckoHighGroupBackgroundModel geckoHighGroupBackgroundModel = new GeckoHighGroupBackgroundModel();
        LIZ = geckoHighGroupBackgroundModel;
        geckoHighGroupBackgroundModel.delayTime = Mp4ScreenVideoLoadTimeout.CONTROL;
        geckoHighGroupBackgroundModel.triggerForegroundDownload = false;
    }

    public static GeckoHighGroupBackgroundModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        GeckoHighGroupBackgroundModel geckoHighGroupBackgroundModel = LIZ;
        GeckoHighGroupBackgroundModel geckoHighGroupBackgroundModel2 = (GeckoHighGroupBackgroundModel) settingsManagerLIZLLL.LJIIIIZZ("gecko_high_group_background", GeckoHighGroupBackgroundModel.class, geckoHighGroupBackgroundModel);
        return geckoHighGroupBackgroundModel2 != null ? geckoHighGroupBackgroundModel2 : geckoHighGroupBackgroundModel;
    }
}
