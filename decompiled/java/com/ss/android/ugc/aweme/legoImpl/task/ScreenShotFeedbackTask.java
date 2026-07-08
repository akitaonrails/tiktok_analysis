package com.ss.android.ugc.aweme.legoImpl.task;

import X.C08A4;
import X.C0CCZ;
import X.C0VZ0;
import X.C1720106oR;
import X.C2187451AjH;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.ScreenshotFeedbackSettings;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenShotFeedbackTask implements C0CCZ {
    public static final ScreenShotFeedbackTask LL = new ScreenShotFeedbackTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ScreenShotFeedbackTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (context == null) {
            return;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ScreenshotFeedbackSettings.ScreenFeedbackConfig screenFeedbackConfig = ScreenshotFeedbackSettings.LIZ;
        ScreenshotFeedbackSettings.ScreenFeedbackConfig screenFeedbackConfig2 = (ScreenshotFeedbackSettings.ScreenFeedbackConfig) settingsManagerLIZLLL.LJIIIIZZ("screenshot_feedback_settings", ScreenshotFeedbackSettings.ScreenFeedbackConfig.class, screenFeedbackConfig);
        if (screenFeedbackConfig2 != null) {
            screenFeedbackConfig = screenFeedbackConfig2;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ScreenShotFeedbackTask", "settings=" + screenFeedbackConfig);
        C08A4.LIZ(Integer.valueOf(screenFeedbackConfig.feedbackUsable));
    }
}
