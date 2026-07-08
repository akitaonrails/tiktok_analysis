package com.ss.android.ugc.aweme.services;

import X.AbstractC1387200mCc;
import X.C0WZX;
import X.C13LP;
import X.C1701330uNH;
import X.C1906580ziK;
import X.C1C7U;
import X.C20085613iQ;
import X.C2179971ATj;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivityWithNoAnimation;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SignupAndLoginPanelReorderService implements ISignupAndLoginPanelReorderService {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    private final List<Activity> collectSignupAndLoginPanelTargets() {
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        ArrayList arrayList = new ArrayList();
        for (AbstractC1387200mCc abstractC1387200mCc : abstractC1387200mCcArrLJII) {
            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
            if (((activityLIZIZ instanceof SignUpOrLoginActivity) || (activityLIZIZ instanceof I18nSignUpActivity)) && activityLIZIZ != null) {
                arrayList.add(activityLIZIZ);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((Activity) obj).isFinishing()) {
                arrayList2.add(obj);
            }
        }
        return C13LP.LJLLLL(new Comparator() { // from class: com.ss.android.ugc.aweme.services.SignupAndLoginPanelReorderService$collectSignupAndLoginPanelTargets$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Integer.valueOf(!(t instanceof SignUpOrLoginActivity) ? 1 : 0), Integer.valueOf(!(t2 instanceof SignUpOrLoginActivity) ? 1 : 0));
            }
        }, arrayList2);
    }

    public final void finishSignupAndLoginPanelTargets(List<? extends Activity> list) {
        for (Activity activity : list) {
            if (!activity.isFinishing()) {
                if (activity instanceof I18nSignUpActivity) {
                    ((I18nSignUpActivity) activity).LLLLZLLIL();
                } else {
                    activity.finish();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ISignupAndLoginPanelReorderService
    public boolean finishSkippableSignupAndLoginPanelIfExists(Activity activity) {
        final List<Activity> listCollectSignupAndLoginPanelTargets = collectSignupAndLoginPanelTargets();
        if (listCollectSignupAndLoginPanelTargets.isEmpty()) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: com.ss.android.ugc.aweme.services.SignupAndLoginPanelReorderService$finishSkippableSignupAndLoginPanelIfExists$action$1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("SignupAndLoginPanelReorderService@f6af.finishSkippableSignupAndLoginPanelIfExists$action$1");
                com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService$finishSkippableSignupAndLoginPanelIfExists$action$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("SignupAndLoginPanelReorderService@f6af.finishSkippableSignupAndLoginPanelIfExists$action$1");
            }

            public final void com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService$finishSkippableSignupAndLoginPanelIfExists$action$1__run$___twin___() {
                this.this$0.finishSignupAndLoginPanelTargets(listCollectSignupAndLoginPanelTargets);
            }

            public static void com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService$finishSkippableSignupAndLoginPanelIfExists$action$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(SignupAndLoginPanelReorderService$finishSkippableSignupAndLoginPanelIfExists$action$1 signupAndLoginPanelReorderService$finishSkippableSignupAndLoginPanelIfExists$action$1) {
                try {
                    signupAndLoginPanelReorderService$finishSkippableSignupAndLoginPanelIfExists$action$1.com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService$finishSkippableSignupAndLoginPanelIfExists$action$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
            return true;
        }
        activity.runOnUiThread(runnable);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.ISignupAndLoginPanelReorderService
    public boolean reorderSignupAndLoginPanelToForeground(Activity activity) {
        boolean z;
        if (activity == null) {
            return false;
        }
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        int length = abstractC1387200mCcArrLJII.length;
        int i = 0;
        while (true) {
            if (i < length) {
                Activity activityLIZIZ = abstractC1387200mCcArrLJII[i].LIZIZ();
                if ((activityLIZIZ instanceof I18nSignUpActivityWithNoAnimation) && activityLIZIZ != null && !activityLIZIZ.isFinishing()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, new Intent(activity, (Class<?>) I18nSignUpActivityWithNoAnimation.class).addFlags(537001984).putExtra("extra_login_notify_reentry", true).putExtra("extra_login_notify_reentry_enter_method", "age_gate_back"));
            C786410Ut5.ae(0, activity, 0);
            return true;
        }
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            Activity activityLIZIZ2 = abstractC1387200mCc.LIZIZ();
            if ((activityLIZIZ2 instanceof I18nSignUpActivity) && activityLIZIZ2 != null && !activityLIZIZ2.isFinishing()) {
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, new Intent(activity, (Class<?>) I18nSignUpActivity.class).addFlags(537001984).putExtra("extra_login_notify_reentry", true).putExtra("extra_login_notify_reentry_enter_method", "age_gate_back"));
                C786410Ut5.ae(0, activity, 0);
                return true;
            }
        }
        return false;
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6BW9MoXyTMJBIe6QaG2spVEDRGHNpauf/FmYQJabajpWKg==", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_SignupAndLoginPanelReorderService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }
}
