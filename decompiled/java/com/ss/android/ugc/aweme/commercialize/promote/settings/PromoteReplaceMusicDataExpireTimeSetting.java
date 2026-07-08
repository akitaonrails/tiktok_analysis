package com.ss.android.ugc.aweme.commercialize.promote.settings;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class PromoteReplaceMusicDataExpireTimeSetting {
    public static final PromoteReplaceMusicDataExpireTimeSetting INSTANCE = new PromoteReplaceMusicDataExpireTimeSetting();
    public static final int DEFAULT = 72;

    public static final int get() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LJ("promote_music_change_request_info_save_time", 72);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT;
        }
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
