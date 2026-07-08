package com.bytedance.android.livesdk.livesetting.privilege;

import X.C13LQ;
import X.C2095008Iq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("enigma_refresh_opt_timer")
public final class LiveEnigmaRefreshOptimizationTimerSetting {
    public static final LiveEnigmaRefreshOptimizationTimerSetting INSTANCE = new LiveEnigmaRefreshOptimizationTimerSetting();
    public static final String[] DEFAULT = {"3", "4", "500"};

    public final int getInitialDelay() {
        Integer numLJIIJJI;
        int value = LiveEnigmaToggleDelaySetting.INSTANCE.getValue();
        if (getValue().length != 3) {
            return value;
        }
        try {
            String str = (String) C13LQ.LJJIFFI(getValue());
            if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                value = numLJIIJJI.intValue();
                return value;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return value;
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("enigma_refresh_opt_timer", DEFAULT);
    }

    public final int getMaxRetries() {
        int iIntValue = 3;
        if (getValue().length != 3) {
            return 3;
        }
        try {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(getValue()[1]);
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
                return iIntValue;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iIntValue;
    }

    public final int getRetryInterval() {
        Integer numLJIIJJI;
        int iIntValue = 500;
        if (getValue().length != 3) {
            return 500;
        }
        try {
            String str = (String) C13LQ.LJJJJIZL(getValue());
            if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                iIntValue = numLJIIJJI.intValue();
                return iIntValue;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iIntValue;
    }
}
