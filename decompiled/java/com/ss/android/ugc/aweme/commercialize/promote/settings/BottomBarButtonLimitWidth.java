package com.ss.android.ugc.aweme.commercialize.promote.settings;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class BottomBarButtonLimitWidth {
    public static final BottomBarButtonLimitWidth INSTANCE = new BottomBarButtonLimitWidth();
    public static final float DEFAULT = 360.0f;

    public static final float get() {
        try {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZJ("bottom_bar_button_limit_width", 360.0f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT;
        }
    }

    public final float getDEFAULT() {
        return DEFAULT;
    }
}
