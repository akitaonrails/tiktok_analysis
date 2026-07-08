package com.ss.android.ugc.aweme.childhook;

import X.C1AF0;
import X.C20684815ws;
import X.C2093808Ie;
import X.C2344009Gk;
import X.C2412109cl;
import X.C844470XAv;
import X.InterfaceC842850X4p;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.childhook.ChildActivityInstrumentation;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import jv6.a;

/* JADX INFO: loaded from: classes4.dex */
public class ChildActivityInstrumentation extends Instrumentation {
    public static volatile boolean kidsAabInstalledCached;
    public final Instrumentation mBaseInstrumentation;
    public static final String DEEPLINK = ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLIIIIJ("ChildActivityInstrumentation#static");
    public static final String APPLINK = ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJLIIIJJIZ();
    public static final AtomicBoolean KIDS_DF_INSTALL_PENDING = new AtomicBoolean(false);

    public static void requestKidsDynamicFeatureInstallIfNeeded() {
        if (!kidsAabInstalledCached && KIDS_DF_INSTALL_PENDING.compareAndSet(false, true)) {
            ComplianceServiceProvider.LJII().LJIIJ(new InterfaceC842850X4p() { // from class: X.09ck
                @Override // X.InterfaceC842850X4p
                public final void LIZJ(String str, boolean z) {
                    ChildActivityInstrumentation.kidsAabInstalledCached = true;
                    ChildActivityInstrumentation.KIDS_DF_INSTALL_PENDING.set(false);
                    IChildModeService iChildModeServiceLJII = ComplianceServiceProvider.LJII();
                    C844470XAv.LIZ.getClass();
                    iChildModeServiceLJII.LJJI(C844470XAv.LIZ());
                }

                @Override // X.InterfaceC842850X4p
                public final void LIZ(int i, String str, boolean z) {
                    ChildActivityInstrumentation.KIDS_DF_INSTALL_PENDING.set(false);
                }
            }, "child_activity_hook_df", false);
        }
    }

    public static boolean probeKidsAabInstalledOnce() {
        boolean zLJIIIIZZ = ComplianceServiceProvider.LJII().LJIIIIZZ();
        if (zLJIIIIZZ) {
            kidsAabInstalledCached = true;
        }
        return zLJIIIIZZ;
    }

    public static boolean probeWithSplitCompatFallback() {
        if (probeKidsAabInstalledOnce()) {
            return true;
        }
        try {
            C844470XAv.LIZ.getClass();
            a.install(C844470XAv.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return probeKidsAabInstalledOnce();
    }

    public ChildActivityInstrumentation(Instrumentation instrumentation) {
        this.mBaseInstrumentation = instrumentation;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnDestroy(activity);
        } else {
            super.callActivityOnDestroy(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnPause(activity);
        } else {
            super.callActivityOnPause(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestart(activity);
        } else {
            super.callActivityOnRestart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnResume(activity);
        } else {
            super.callActivityOnResume(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnStart(activity);
        } else {
            super.callActivityOnStart(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnStop(activity);
        } else {
            super.callActivityOnStop(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(Activity activity) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnUserLeaving(activity);
        } else {
            super.callActivityOnUserLeaving(activity);
        }
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(Application application) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callApplicationOnCreate(application);
        } else {
            super.callApplicationOnCreate(application);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnCreate(activity, bundle);
        } else {
            super.callActivityOnCreate(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnNewIntent(activity, intent);
        } else {
            super.callActivityOnNewIntent(activity, intent);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnRestoreInstanceState(activity, bundle);
        } else {
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            instrumentation.callActivityOnSaveInstanceState(activity, bundle);
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Instrumentation
    public boolean onException(Object obj, Throwable th) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.onException(obj, th);
        }
        return super.onException(obj, th);
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        if (str.equals("com.ss.android.ugc.aweme.main.MainActivity")) {
            if (!kidsAabInstalledCached && !probeWithSplitCompatFallback()) {
                requestKidsDynamicFeatureInstallIfNeeded();
            } else {
                C2093808Ie.LIZ.getClass();
                MajorComponentsAllowList majorComponentsAllowList = C2093808Ie.LIZIZ;
                if (majorComponentsAllowList == null || (str = majorComponentsAllowList.launchActivity) == null) {
                    str = "";
                }
            }
        } else if (!str.equals(DEEPLINK) && !str.equals(APPLINK)) {
            if (!C2412109cl.LIZ(intent)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "activity_not_allowed");
                c2344009Gk.LJIIIIZZ("description", str);
                C20684815ws.LJIILLIIL("pns_analysis_event", c2344009Gk.LIZ);
                str = "com.ss.android.ugc.aweme.child.ChildEmptyFinishActivity";
            }
        } else if (!kidsAabInstalledCached && !probeWithSplitCompatFallback()) {
            requestKidsDynamicFeatureInstallIfNeeded();
        } else {
            str = "com.ss.android.ugc.aweme.kids.homepage.deeplink.KidsDeepLinkHandlerActivity";
        }
        return this.mBaseInstrumentation.newActivity(classLoader, str, intent);
    }

    @Override // android.app.Instrumentation
    public Application newApplication(ClassLoader classLoader, String str, Context context) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.newApplication(classLoader, str, context);
        }
        return super.newApplication(classLoader, str, context);
    }

    public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
        Method declaredMethod;
        if (!C2412109cl.LIZ(intent)) {
            return new Instrumentation.ActivityResult(0, new Intent());
        }
        try {
            declaredMethod = Instrumentation.class.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class);
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            e = e;
        }
        try {
            return (Instrumentation.ActivityResult) declaredMethod.invoke(this.mBaseInstrumentation, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "execStartActivity");
            return new Instrumentation.ActivityResult(0, new Intent());
        }
    }

    @Override // android.app.Instrumentation
    public Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) {
        Instrumentation instrumentation = this.mBaseInstrumentation;
        if (instrumentation != null) {
            return instrumentation.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
        return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
    }
}
