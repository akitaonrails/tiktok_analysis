package com.ss.android.ugc.aweme.xtrace;

import X.C01GW;
import X.C0C64;
import X.C266620Ace;
import X.C786410Ut5;
import X.C805380Via;
import X.EnumC1998307sD;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.CommonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.xtrace.IXtrace;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class ViewTraceHelper {
    public static Method addViewInner;
    public static Method installDecorMethod;

    public static String buildViewInfoMessage(View view) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("ViewGroup child already has a parent crash, view info:");
            Context context = view.getContext();
            if (context instanceof Activity) {
                sb.append(" Activity: ");
                sb.append(context);
            } else if (context != null) {
                sb.append(" Context: ");
                sb.append(context);
            }
            sb.append(" childView: ");
            sb.append(view);
            sb.append(" view layout params:");
            sb.append(CommonUtils.getLayoutParams(view));
            sb.append(" view id:");
            sb.append(CommonUtils.getViewResourceId(view));
            sb.append("\n");
            sb.append("Parent view info:\n");
            ViewParent parent = view.getParent();
            for (int i = 0; parent != null && i < 5; i++) {
                if (parent instanceof View) {
                    sb.append(i);
                    sb.append(" layer");
                    sb.append(" parent view:");
                    sb.append(parent);
                    sb.append(" view layout params:");
                    sb.append(CommonUtils.getLayoutParams((View) parent));
                    sb.append(" view id:");
                    sb.append(CommonUtils.getViewResourceId((View) parent));
                    sb.append("\n");
                }
                parent = parent.getParent();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return sb.toString();
    }

    public static void doTrace(Context context) {
        if (Build.VERSION.SDK_INT < 26 || !Process.is64Bit()) {
            return;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_add_view_trace", true, false) && ((Number) C266620Ace.LIZ.getValue()).intValue() == 0) {
            return;
        }
        try {
            ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZ(EnumC1998307sD.MODE_REPLACE);
            if (((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).init(context).booleanValue()) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_add_view_trace", true, false)) {
                    hookViewGroupTroubleshootSystemCrash(context);
                }
                if (((Number) C266620Ace.LIZ.getValue()).intValue() != 0) {
                    hookInstallDecorTroubleshootSystemCrash(context);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void hookInstallDecorTroubleshootSystemCrash(Context context) {
        installDecorMethod = ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZLLL(new Object[0]);
        Method methodLIZIZ = ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZIZ(ViewTraceHelper.class, "installDecorProxy", Window.class);
        if (installDecorMethod != null && methodLIZIZ != null) {
            ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LJ(installDecorMethod, methodLIZIZ);
        }
    }

    public static void hookViewGroupTroubleshootSystemCrash(Context context) {
        IXtrace iXtrace = (IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class);
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        addViewInner = iXtrace.LIZIZ(ViewGroup.class, "addViewInner", View.class, cls, ViewGroup.LayoutParams.class, cls2);
        Method methodLIZIZ = ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZIZ(ViewTraceHelper.class, "addViewInnerProxy", ViewGroup.class, View.class, cls, ViewGroup.LayoutParams.class, cls2);
        if (addViewInner != null && methodLIZIZ != null) {
            ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LJ(addViewInner, methodLIZIZ);
        }
    }

    public static void installDecorProxy(Window window) throws Exception {
        C01GW c01gw = C266620Ace.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0 && C786410Ut5.u3() != Looper.getMainLooper().getThread()) {
            RuntimeException runtimeException = new RuntimeException("install decor thread not main");
            runtimeException.setStackTrace(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()));
            ALog.e("ViewTraceHelper", runtimeException);
            System.err.println(Log.getStackTraceString(runtimeException));
            Npth.reportBizException("reliability_monitor", (Throwable) runtimeException, "ViewTraceHelper", (Map<String, String>) new HashMap(), true);
            C805380Via.LJFF("AIR_CUSHION_UNPROTECT", "ViewTraceHelper", runtimeException);
        }
        try {
            if (((Number) c01gw.getValue()).intValue() == 2) {
                synchronized (window) {
                    try {
                        ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZJ(installDecorMethod, window, new Object[0]);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                return;
            }
            ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZJ(installDecorMethod, window, new Object[0]);
        } catch (Exception th) {
            throw th;
        }
    }

    public static void addViewInnerProxy(ViewGroup viewGroup, View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        boolean z2;
        if (view != null && view.getParent() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZJ(addViewInner, viewGroup, view, Integer.valueOf(i), layoutParams, Boolean.valueOf(z));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z2 && view != null) {
                String strBuildViewInfoMessage = buildViewInfoMessage(view);
                C805380Via.LJFF("AIR_CUSHION_UNPROTECT", "AddViewInnerHook", new RuntimeException(strBuildViewInfoMessage));
                throw new RuntimeException(strBuildViewInfoMessage, th);
            }
            throw th;
        }
    }
}
