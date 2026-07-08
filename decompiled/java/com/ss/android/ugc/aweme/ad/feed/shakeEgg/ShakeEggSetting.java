package com.ss.android.ugc.aweme.ad.feed.shakeEgg;

import X.C09CT;
import X.C988940bqG;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes17.dex */
public final class ShakeEggSetting {
    public static final ShakeEggSettingModel LIZ = new ShakeEggSettingModel(false, 0, 6);
    public static long LIZIZ;
    public static ShakeEggSettingModel LIZJ;

    public static final ShakeEggSettingModel LIZ() {
        ShakeEggSettingModel shakeEggSettingModel;
        if (!C988940bqG.LIZ()) {
            try {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                ShakeEggSettingModel shakeEggSettingModel2 = LIZ;
                ShakeEggSettingModel shakeEggSettingModel3 = (ShakeEggSettingModel) settingsManagerLIZLLL.LJIIIIZZ("shake_egg_setting", ShakeEggSettingModel.class, shakeEggSettingModel2);
                return shakeEggSettingModel3 != null ? shakeEggSettingModel3 : shakeEggSettingModel2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return LIZ;
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - LIZIZ >= 20000) {
            LIZIZ = jElapsedRealtime;
            try {
                SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                shakeEggSettingModel = LIZ;
                ShakeEggSettingModel shakeEggSettingModel4 = (ShakeEggSettingModel) settingsManagerLIZLLL2.LJIIIIZZ("shake_egg_setting", ShakeEggSettingModel.class, shakeEggSettingModel);
                if (shakeEggSettingModel4 != null) {
                    shakeEggSettingModel = shakeEggSettingModel4;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                shakeEggSettingModel = LIZ;
            }
            LIZJ = shakeEggSettingModel;
        }
        ShakeEggSettingModel shakeEggSettingModel5 = LIZJ;
        return shakeEggSettingModel5 == null ? LIZ : shakeEggSettingModel5;
    }

    public static final class ShakeEggSettingModel {

        @C09CT("close_shake_egg")
        public final boolean closeShakeEgg;

        @C09CT("destroy_count")
        public final int destroyCount;

        @C09CT("load_delay")
        public final long loadDelay;

        public ShakeEggSettingModel() {
            this(false, 0L, 6);
        }

        public ShakeEggSettingModel(boolean z, long j, int i) {
            this.closeShakeEgg = z;
            this.loadDelay = j;
            this.destroyCount = i;
        }
    }
}
