package com.gyf.barlibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class NotchUtils {
    public static boolean isNotchResultInitialized;
    public static boolean sNotchResult;

    public static DisplayCutout getDisplayCutout(Activity activity) {
        Window window;
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 28 && activity != null && (window = activity.getWindow()) != null && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null) {
            return rootWindowInsets.getDisplayCutout();
        }
        return null;
    }

    public static boolean hasNotchAtAndroidP(Activity activity) {
        if (getDisplayCutout(activity) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasNotchAtHuaWei(Context context) {
        boolean zBooleanValue = false;
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            zBooleanValue = ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(clsLoadClass, new Object[0])).booleanValue();
            return zBooleanValue;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return zBooleanValue;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return zBooleanValue;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return zBooleanValue;
        }
    }

    public static boolean hasNotchAtOPPO(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean hasNotchAtVIVO(Context context) {
        boolean zBooleanValue = false;
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            zBooleanValue = ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
            return zBooleanValue;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return zBooleanValue;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return zBooleanValue;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return zBooleanValue;
        }
    }

    public static boolean hasNotchAtXiaoMi(Context context) {
        if ("Xiaomi".equals(Build.MANUFACTURER)) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                if (((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, "ro.miui.notch", 0)).intValue() == 1) {
                    return true;
                }
                return false;
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
                return false;
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
                return false;
            }
        }
        return false;
    }

    public static boolean hasNotchScreen(View view) {
        if (isNotchResultInitialized) {
            return sNotchResult;
        }
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (hasNotchAtXiaoMi(view.getContext()) || hasNotchAtHuaWei(view.getContext()) || hasNotchAtOPPO(view.getContext()) || hasNotchAtVIVO(view.getContext()) || hasNotchAtAndroidP(view)) {
            z = true;
        }
        sNotchResult = z;
        isNotchResultInitialized = true;
        return z;
    }

    public static DisplayCutout getDisplayCutout(View view) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 28 && view != null && (rootWindowInsets = view.getRootWindowInsets()) != null) {
            return rootWindowInsets.getDisplayCutout();
        }
        return null;
    }

    public static boolean hasNotchAtAndroidP(View view) {
        if (getDisplayCutout(view) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasNotchScreen(Activity activity) {
        if (isNotchResultInitialized) {
            return sNotchResult;
        }
        boolean z = false;
        if (activity == null) {
            return false;
        }
        if (hasNotchAtXiaoMi(activity) || hasNotchAtHuaWei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVIVO(activity) || hasNotchAtAndroidP(activity)) {
            z = true;
        }
        sNotchResult = z;
        isNotchResultInitialized = true;
        return z;
    }
}
