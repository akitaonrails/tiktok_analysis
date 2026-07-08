package com.tiktok.strategycenter.settings;

/* JADX INFO: loaded from: classes35.dex */
public final class SettingsManager {
    public static final SettingsManager INSTANCE = new SettingsManager();
    public static ISettingsManagerDelegate instance;

    public final ISettingsManagerDelegate getInstance$ttm_strategy_center_release() {
        return instance;
    }

    public final void setInstance$ttm_strategy_center_release(ISettingsManagerDelegate iSettingsManagerDelegate) {
        instance = iSettingsManagerDelegate;
    }

    public static final String nativeGetSettingsString(String str, boolean z) {
        if (z) {
            ISettingsManagerDelegate iSettingsManagerDelegate = instance;
            if (iSettingsManagerDelegate == null) {
                return null;
            }
            return iSettingsManagerDelegate.getSettingsJsonValue(str);
        }
        ISettingsManagerDelegate iSettingsManagerDelegate2 = instance;
        if (iSettingsManagerDelegate2 == null) {
            return null;
        }
        return iSettingsManagerDelegate2.getSettingsString(str, null);
    }

    public static final double nativeGetSettingsDouble(String str, double d, int i) {
        if (i == 0) {
            ISettingsManagerDelegate iSettingsManagerDelegate = instance;
            if (iSettingsManagerDelegate != null) {
                return iSettingsManagerDelegate.getSettingsDouble(str, d);
            }
            return d;
        }
        if (instance == null) {
            return d;
        }
        return r1.getSettingsFloat(str, (float) d);
    }

    public static final long nativeGetSettingsLong(String str, long j, int i) {
        boolean z;
        if (i != 0) {
            if (i != 1) {
                ISettingsManagerDelegate iSettingsManagerDelegate = instance;
                if (iSettingsManagerDelegate != null) {
                    return iSettingsManagerDelegate.getSettingsLong(str, j);
                }
                return j;
            }
            if (instance == null) {
                return j;
            }
            return r1.getSettingsInt(str, (int) j);
        }
        ISettingsManagerDelegate iSettingsManagerDelegate2 = instance;
        if (iSettingsManagerDelegate2 != null) {
            if (j == 0) {
                z = true;
            } else {
                z = false;
            }
            if (iSettingsManagerDelegate2.getSettingsBoolean(str, z)) {
                return 1L;
            }
            return 0L;
        }
        return 0L;
    }
}
