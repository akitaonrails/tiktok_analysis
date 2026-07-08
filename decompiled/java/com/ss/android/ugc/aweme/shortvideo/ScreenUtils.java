package com.ss.android.ugc.aweme.shortvideo;

import X.C01GW;
import X.C0FNT;
import X.C0WZX;
import X.C12VA;
import X.C1409905fV;
import X.C1442410ndf;
import X.C14KR;
import X.C2204961BRm;
import X.C257250A6h;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class ScreenUtils {
    public static boolean disableWindowsMetricCache;
    public static int sStatusBarHeight;
    public static volatile WindowMetrics windowMetricsInstance;
    public static volatile WeakReference<WindowMetrics> windowMetricsInstanceWeakRef;

    public static int getNavigationBarHeight(Context context) {
        return com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context);
    }

    public static void log(String str, int i, boolean z) {
    }

    public static boolean checkDeviceHasNavigationBar(Context context) {
        boolean z;
        Resources resources = context.getResources();
        int iN3 = C786410Ut5.n3(resources, "config_showNavigationBar", "bool", "android");
        if (iN3 > 0 && resources.getBoolean(iN3)) {
            z = true;
        } else {
            z = false;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if (CardStruct.IStatusCode.DEFAULT.equals(str)) {
                return true;
            }
            if ("1".equals(str)) {
                return false;
            }
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }

    public static int com_ss_android_ugc_aweme_shortvideo_ScreenUtils__getNavigationBarHeight$___twin___(Context context) {
        int dimensionPixelSize;
        Resources resources = context.getResources();
        int iN3 = C786410Ut5.n3(resources, "navigation_bar_height", "dimen", "android");
        if (iN3 > 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(iN3);
        } else {
            dimensionPixelSize = 0;
        }
        Rect rect = new Rect();
        Activity activityLIZ = C0FNT.LIZ(context);
        if (activityLIZ != null) {
            activityLIZ.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return Math.min(Math.max((getFullScreenHeight(context) - getStatusBarHeight(context)) - rect.height(), 0), dimensionPixelSize);
        }
        if (!checkDeviceHasNavigationBar(context)) {
            return 0;
        }
        return dimensionPixelSize;
    }

    public static int com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(Context context) {
        if (C1442410ndf.LIZ() > 0) {
            if (C1409905fV.LJIIIIZZ == null) {
                C1409905fV.LJIIIIZZ = Integer.valueOf(com_ss_android_ugc_aweme_shortvideo_ScreenUtils__getNavigationBarHeight$___twin___(context));
            }
            return C1409905fV.LJIIIIZZ.intValue();
        }
        return com_ss_android_ugc_aweme_shortvideo_ScreenUtils__getNavigationBarHeight$___twin___(context);
    }

    public static Display getDefaultDisplay(Context context) {
        Display display;
        if (C14KR.LIZIZ()) {
            WeakReference<Display> weakReference = C14KR.LIZJ;
            if (weakReference == null || (display = weakReference.get()) == null) {
                Display defaultDisplayCore = getDefaultDisplayCore(context);
                C14KR.LIZJ = new WeakReference<>(defaultDisplayCore);
                return defaultDisplayCore;
            }
            return display;
        }
        return getDefaultDisplayCore(context);
    }

    public static Display getDefaultDisplayCore(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            if (Build.VERSION.SDK_INT >= 30) {
                return ((Activity) context).getDisplay();
            }
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        }
        return C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhr8HXjIkTPO7x27s=", null));
    }

    public static int getFullScreenHeight(Display display) {
        Display display2;
        if (display == null) {
            return 0;
        }
        if (C14KR.LIZIZ()) {
            WeakReference<Display> weakReference = C14KR.LIZJ;
            if (weakReference != null) {
                display2 = weakReference.get();
            } else {
                display2 = null;
            }
            if (Intrinsics.LJFF(display2, display)) {
                int i = C14KR.LIZ;
                if (i <= 0) {
                    int iIntValue = Integer.valueOf(getFullScreenHeightCore(display)).intValue();
                    C14KR.LIZ = iIntValue;
                    return iIntValue;
                }
                return i;
            }
            Integer numValueOf = Integer.valueOf(getFullScreenHeightCore(display));
            numValueOf.intValue();
            return numValueOf.intValue();
        }
        int fullScreenHeightCore = getFullScreenHeightCore(display);
        log("getFullScreenHeight", fullScreenHeightCore, false);
        return fullScreenHeightCore;
    }

    public static int getFullScreenHeightCore(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int getScreenHeight(Display display) {
        Display display2;
        int i;
        if (display == null) {
            return 0;
        }
        if (C14KR.LIZIZ()) {
            WeakReference<Display> weakReference = C14KR.LIZJ;
            if (weakReference != null) {
                display2 = weakReference.get();
            } else {
                display2 = null;
            }
            if (Intrinsics.LJFF(display2, display)) {
                Point point = C14KR.LIZIZ;
                if (point != null) {
                    i = point.y;
                } else {
                    Point point2 = new Point();
                    display.getSize(point2);
                    C14KR.LIZIZ = point2;
                    i = point2.y;
                }
                if (i > 0) {
                    return i;
                }
            }
        }
        Point point3 = new Point();
        display.getSize(point3);
        log("getScreenHeight", point3.y, false);
        return point3.y;
    }

    public static int getScreenWidth(Display display) {
        Display display2;
        int i;
        if (display == null) {
            return 0;
        }
        if (C14KR.LIZIZ()) {
            WeakReference<Display> weakReference = C14KR.LIZJ;
            if (weakReference != null) {
                display2 = weakReference.get();
            } else {
                display2 = null;
            }
            if (Intrinsics.LJFF(display2, display)) {
                Point point = C14KR.LIZIZ;
                if (point != null) {
                    i = point.x;
                } else {
                    Point point2 = new Point();
                    display.getSize(point2);
                    C14KR.LIZIZ = point2;
                    i = point2.x;
                }
                if (i > 0) {
                    return i;
                }
            }
        }
        Point point3 = new Point();
        display.getSize(point3);
        log("getScreenWidth", point3.x, false);
        return point3.x;
    }

    public static int getStatusBarHeight(Context context) {
        int dimensionPixelSize;
        int i = sStatusBarHeight;
        if (i != 0) {
            return i;
        }
        Resources resources = context.getResources();
        int iN3 = C786410Ut5.n3(resources, "status_bar_height", "dimen", "android");
        if (iN3 > 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(iN3);
        } else {
            dimensionPixelSize = 0;
        }
        sStatusBarHeight = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static WindowMetrics getWindowMetrics(Context context) {
        return getWindowMetricsInstance(context);
    }

    public static WindowMetrics getWindowMetricsInstance(Context context) {
        if (C12VA.LIZ().LJIIJJI.invoke().booleanValue()) {
            return getWindowMetricsInternal(C786410Ut5.N3(context));
        }
        C01GW c01gw = C257250A6h.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            if (disableWindowsMetricCache) {
                return getWindowMetricsInternal(context);
            }
            if (windowMetricsInstanceWeakRef == null || windowMetricsInstanceWeakRef.get() == null) {
                synchronized (ScreenUtils.class) {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            disableWindowsMetricCache = context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
                        }
                        windowMetricsInstanceWeakRef = new WeakReference<>(getWindowMetricsInternal(context));
                    } finally {
                    }
                }
            }
        } else {
            if (disableWindowsMetricCache) {
                return getWindowMetricsInternal(context);
            }
            if (windowMetricsInstance == null) {
                synchronized (ScreenUtils.class) {
                    try {
                        if (windowMetricsInstance == null) {
                            if (Build.VERSION.SDK_INT >= 30) {
                                disableWindowsMetricCache = context.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle");
                            }
                            windowMetricsInstance = getWindowMetricsInternal(context);
                        }
                    } finally {
                    }
                }
            }
        }
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            return windowMetricsInstanceWeakRef.get();
        }
        return windowMetricsInstance;
    }

    public static WindowMetrics getWindowMetricsInternal(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        }
        return C2204961BRm.LLILZ(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhr8HXjIkTPO7x27s=", null));
    }

    public static Size getWindowSizeExcludingInsets(WindowMetrics windowMetrics) {
        Insets insetsIgnoringVisibility = windowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        Rect bounds = windowMetrics.getBounds();
        return new Size(bounds.width() - i, bounds.height() - i2);
    }

    public static int getFullScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return getFullScreenHeight(getWindowMetricsInstance(context));
        }
        return getFullScreenHeight(getDefaultDisplay(context));
    }

    public static int getScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return getScreenHeight(getWindowMetricsInstance(context));
        }
        return getScreenHeight(getDefaultDisplay(context));
    }

    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return getScreenWidth(getWindowMetricsInstance(context));
        }
        return getScreenWidth(getDefaultDisplay(context));
    }

    public static int getFullScreenHeight(WindowMetrics windowMetrics) {
        if (windowMetrics == null) {
            return 0;
        }
        return windowMetrics.getBounds().height();
    }

    public static int getScreenHeight(WindowMetrics windowMetrics) {
        if (windowMetrics == null) {
            return 0;
        }
        return getWindowSizeExcludingInsets(windowMetrics).getHeight();
    }

    public static int getScreenWidth(WindowMetrics windowMetrics) {
        if (windowMetrics == null) {
            return 0;
        }
        return windowMetrics.getBounds().width();
    }

    public static boolean isSmallScreen(Context context, int i) {
        try {
            if (getFullScreenHeight(context) / context.getResources().getDisplayMetrics().density >= ((double) (i * 52)) + 274.5d) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean isVideoMatch16VS9(int i, int i2) {
        if (i2 * 9 < i * 16 && Math.abs((((double) i2) / ((double) i)) - 1.7777777910232544d) >= 0.1d) {
            return false;
        }
        return true;
    }

    public static int getScreenRotation(Context context, Display display, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 30 && (context instanceof Activity) && ((Activity) context).isInMultiWindowMode()) {
            if (i2 <= i) {
                return 0;
            }
            return 1;
        }
        if (display == null) {
            return 0;
        }
        return display.getRotation();
    }
}
