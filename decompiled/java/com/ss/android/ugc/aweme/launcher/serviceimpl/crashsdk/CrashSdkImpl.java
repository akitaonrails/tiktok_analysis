package com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk;

import X.C085U;
import X.C1977307op;
import X.C1BWL;
import X.C786410Ut5;
import X.C805380Via;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.crash.launchguard.LaunchCrashGuard;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;
import com.ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class CrashSdkImpl implements ICrashSdkApi {
    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LJIJ() {
        if (C085U.LIZ == null) {
            synchronized (C085U.class) {
                try {
                    C085U.LIZ = new C085U();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C085U.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final Application.ActivityLifecycleCallbacks LJIJJ() {
        return new Application.ActivityLifecycleCallbacks() { // from class: X.085O
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                if (Build.VERSION.SDK_INT > 28) {
                    return;
                }
                PreventServerSideCrashes.LL = null;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                if (Build.VERSION.SDK_INT > 28) {
                    return;
                }
                PreventServerSideCrashes.LL = null;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (Build.VERSION.SDK_INT > 28) {
                    return;
                }
                PreventServerSideCrashes.LL = activity;
                if (activity != null && !TextUtils.isEmpty("mStartedActivity")) {
                    for (Class<?> superclass = activity.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                        Field fieldLIZ = C1954407l8.LIZ(superclass, "mStartedActivity");
                        if (fieldLIZ != null) {
                            try {
                                fieldLIZ.setAccessible(true);
                                fieldLIZ.set(activity, Boolean.TRUE);
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return;
                            }
                        }
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT > 28) {
                    return;
                }
                C1150504el.LIZ().LIZLLL("method_hook_ams_duration", false);
                PreventServerSideCrashes.LL = activity;
                PreventServerSideCrashes.LIZ();
                Field field = PreventServerSideCrashes.LLILZ;
                if (field != null) {
                    try {
                        field.set(PreventServerSideCrashes.LLILZIL, PreventServerSideCrashes.LLILZLL);
                        PreventServerSideCrashes.LLILZ = null;
                        PreventServerSideCrashes.LLILZIL = null;
                        PreventServerSideCrashes.LLILZLL = null;
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C1150504el.LIZ().LJI("method_hook_ams_duration", false);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LJIJI() {
        LaunchCrashGuard.registerGuardExceptionHandlerAfterNpthInit();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LJIIZILJ(Context context) throws Throwable {
        if (C1BWL.LIZ() == null && context != null && C786410Ut5.N3(context) != null && context.getApplicationInfo() != null && TextUtils.equals(Application.class.getName(), context.getApplicationInfo().className)) {
            Application application = (Application) C786410Ut5.N3(context);
            try {
                try {
                    C1977307op.LIZ = (Application) Class.forName(context.getApplicationInfo().className).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1977307op.LIZJ(application, application, C1977307op.LIZ);
                C1977307op.LIZLLL(application.getBaseContext());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void ensureNotReachHere(Throwable th, String str) {
        C805380Via.LIZJ(th, str);
    }
}
