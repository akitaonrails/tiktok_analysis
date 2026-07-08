package com.gyf.barlibrary;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class OSUtils {
    public static String getFlymeOSFlag() {
        return getSystemProperty("ro.build.display.id", "");
    }

    public static boolean isEMUI() {
        return !TextUtils.isEmpty(getSystemProperty("ro.build.version.emui", ""));
    }

    public static boolean isMIUI() {
        return !TextUtils.isEmpty(getSystemProperty("ro.miui.ui.version.name", ""));
    }

    public static String getEMUIVersion() {
        return isEMUI() ? getSystemProperty("ro.build.version.emui", "") : "";
    }

    public static String getFlymeOSVersion() {
        return isFlymeOS() ? getSystemProperty("ro.build.display.id", "") : "";
    }

    public static String getMIUIVersion() {
        return isMIUI() ? getSystemProperty("ro.miui.ui.version.name", "") : "";
    }

    public static boolean isEMUI3_0() {
        return getEMUIVersion().contains("EmotionUI_3.0");
    }

    public static boolean isEMUI3_1() {
        String eMUIVersion = getEMUIVersion();
        return "EmotionUI 3".equals(eMUIVersion) || eMUIVersion.contains("EmotionUI_3.1");
    }

    public static boolean isEMUI3_x() {
        return isEMUI3_0() || isEMUI3_1();
    }

    public static boolean isFlymeOS() {
        return getFlymeOSFlag().toLowerCase().contains("flyme");
    }

    public static boolean isFlymeOS4Later() {
        String flymeOSVersion = getFlymeOSVersion();
        if (!flymeOSVersion.isEmpty()) {
            try {
                return (flymeOSVersion.toLowerCase().contains("os") ? CastIntegerProtector.valueOf(flymeOSVersion.substring(9, 10)).intValue() : CastIntegerProtector.valueOf(flymeOSVersion.substring(6, 7)).intValue()) >= 4;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static boolean isFlymeOS5() {
        String flymeOSVersion = getFlymeOSVersion();
        if (!flymeOSVersion.isEmpty()) {
            try {
                return (flymeOSVersion.toLowerCase().contains("os") ? CastIntegerProtector.valueOf(flymeOSVersion.substring(9, 10)).intValue() : CastIntegerProtector.valueOf(flymeOSVersion.substring(6, 7)).intValue()) == 5;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static boolean isMIUI6Later() {
        String mIUIVersion = getMIUIVersion();
        if (!mIUIVersion.isEmpty()) {
            try {
                return CastIntegerProtector.valueOf(mIUIVersion.substring(1)).intValue() >= 6;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str2;
        }
    }
}
