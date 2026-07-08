package com.gyf.barlibrary;

import X.C0WZX;
import X.C2204961BRm;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public class FlymeOSStatusBarFontUtils {
    public static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    public static Method mSetStatusBarColorIcon;
    public static Method mSetStatusBarDarkIcon;
    public static Field mStatusBarColorFiled;

    public static int toGrey(int i) {
        return (((((i & 16711680) >> 16) * 38) + (((65280 & i) >> 8) * 75)) + ((i & 255) * 15)) >> 7;
    }

    static {
        try {
            mSetStatusBarColorIcon = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            mSetStatusBarDarkIcon = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            mStatusBarColorFiled = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (NoSuchFieldException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }

    public static boolean isBlackColor(int i, int i2) {
        if (toGrey(i) < i2) {
            return true;
        }
        return false;
    }

    public static void setStatusBarColor(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Field field = mStatusBarColorFiled;
        if (field != null) {
            try {
                if (field.getInt(attributes) != i) {
                    mStatusBarColorFiled.set(attributes, Integer.valueOf(i));
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, int i) {
        Method method = mSetStatusBarColorIcon;
        if (method != null) {
            try {
                C2204961BRm.a0(method, activity, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEgUjWYTeVEUtTBCWZ3wqfyVr2MSYsUlOZhDCCz/nz9ES3oR0LJNEolw=", null));
                return;
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        boolean zIsBlackColor = isBlackColor(i, 50);
        if (mStatusBarColorFiled != null) {
            setStatusBarDarkIcon(activity, zIsBlackColor, zIsBlackColor);
            setStatusBarDarkIcon(activity.getWindow(), i);
        } else {
            setStatusBarDarkIcon(activity, zIsBlackColor);
        }
    }

    public static void setStatusBarDarkIcon(View view, boolean z) {
        int i;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z) {
            i = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | systemUiVisibility;
        } else {
            i = (~SYSTEM_UI_FLAG_LIGHT_STATUS_BAR) & systemUiVisibility;
        }
        if (i != systemUiVisibility) {
            view.setSystemUiVisibility(i);
        }
    }

    public static void setStatusBarDarkIcon(Window window, int i) {
        try {
            setStatusBarColor(window, i);
            setStatusBarDarkIcon(window.getDecorView(), true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void setStatusBarDarkIcon(Window window, boolean z) {
        setStatusBarDarkIcon(window.getDecorView(), z);
        setStatusBarColor(window, 0);
    }

    public static void setStatusBarDarkIcon(Activity activity, boolean z) {
        setStatusBarDarkIcon(activity, z, true);
    }

    public static boolean changeMeizuFlag(WindowManager.LayoutParams layoutParams, String str, boolean z) {
        int i;
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i3 = declaredField2.getInt(layoutParams);
            if (!z) {
                i = (~i2) & i3;
            } else {
                i = i2 | i3;
            }
            if (i3 != i) {
                declaredField2.setInt(layoutParams, i);
                return true;
            }
            return false;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (IllegalArgumentException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        } catch (NoSuchFieldException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, boolean z, boolean z2) throws Throwable {
        Method method = mSetStatusBarDarkIcon;
        if (method != null) {
            try {
                C2204961BRm.a0(method, activity, new Object[]{Boolean.valueOf(z)}, new C0WZX("dzBzEgUjWYTeVEUtTBCWZ3wqfyVr2MSYsUlOZhDCCz/nz9ES3oR0LJNEolw=", null));
                return;
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        if (z2) {
            setStatusBarDarkIcon(activity.getWindow(), z);
        }
    }
}
