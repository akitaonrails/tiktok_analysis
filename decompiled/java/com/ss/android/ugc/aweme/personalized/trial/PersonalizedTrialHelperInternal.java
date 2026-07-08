package com.ss.android.ugc.aweme.personalized.trial;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C0XK4;
import X.C10SI;
import X.C10SM;
import X.C1800440wx8;
import X.C1800450wx9;
import X.C2188811AlT;
import X.C23250099c;
import X.C356901a3;
import X.C786410Ut5;
import X.C817503Hh;
import X.InterfaceC427710Gpt;
import Y.ARunnableS127S0100000_27;
import android.app.Activity;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.personalized.trial.PersonalizedTrialHelperInternal;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PersonalizedTrialHelperInternal implements C10SM {
    public static final PersonalizedTrialHelperInternal LIZ = new PersonalizedTrialHelperInternal();
    public static AppLifecycleObserver LIZIZ;
    public static AnonymousClass0956 LIZJ;
    public static boolean LIZLLL;

    @Override // X.C10SM
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C10SM
    public final void LJI() {
    }

    @Override // X.C10SM
    public final void LJIIJJI(Activity activity, Aweme aweme, String str) {
    }

    static {
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("forced_login_after_12hours_br", true)) {
                C10SI.LIZ.getClass();
                C10SI.LJIILJJIL("PNUJ Killswitch ends PNUJ");
                LIZ.getClass();
                LJIILJJIL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ.getClass();
        LJIILIIL();
    }

    public static int LJIIL() {
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        return (iNewUserDebugService == null || !Intrinsics.LJFF(iNewUserDebugService.LJFF(), Boolean.TRUE)) ? C0XK4.LIZ() : (int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public static void LJIILIIL() {
        C10SI c10si = C10SI.LIZ;
        c10si.getClass();
        if (Intrinsics.LJFF(C10SI.LJIILIIL(false).enableAppUsageUnloginTimeLimit, Boolean.TRUE)) {
            c10si.getClass();
            if (C10SI.LIZLLL.getBoolean("is_trial_expired", false) || C1800450wx9.LIZ() <= 0) {
                return;
            }
            LJIILL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Init PNUJ time tracking: trialLastActiveTimestamp=");
            sbLIZ.append(C1800450wx9.LIZ.get());
            C10SI.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            if (LIZIZ == null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0wxA
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PersonalizedTrialHelperInternal@104a.startProcessObserver$1");
                        try {
                            C10SI.LIZ.getClass();
                            C10SI.LJIILJJIL("Init PNUJ time tracking: register process observer");
                            PersonalizedTrialHelperInternal.AppLifecycleObserver appLifecycleObserver = new PersonalizedTrialHelperInternal.AppLifecycleObserver();
                            PersonalizedTrialHelperInternal.LIZIZ = appLifecycleObserver;
                            ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(appLifecycleObserver);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PersonalizedTrialHelperInternal@104a.startProcessObserver$1");
                    }
                });
            }
            LJIILLIIL();
        }
    }

    public static void LJIILJJIL() {
        C10SI c10si = C10SI.LIZ;
        c10si.getClass();
        C10SI.LIZLLL.storeBoolean("is_trial_expired", true);
        IGuestModeService iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null);
        if (iGuestModeService != null) {
            iGuestModeService.LJIIIIZZ("trial_expired");
        }
        if (Intrinsics.LJFF(C10SI.LJIILIIL(false).enableAppUsageUnloginTimeLimit, Boolean.TRUE)) {
            AppLifecycleObserver appLifecycleObserver = LIZIZ;
            if (appLifecycleObserver != null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS127S0100000_27(appLifecycleObserver, 26));
            }
            c10si.getClass();
            C10SI.LJIILJJIL("Stop heartbeat time tracking");
            AnonymousClass0956 anonymousClass0956 = LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LIZJ = null;
            IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) PluggableExtentionKt.pluggableSpi$default(IMandatoryLoginService.class, false, false, false, 14, null);
            if (iMandatoryLoginService != null) {
                iMandatoryLoginService.tryShowMandatoryLoginPage(null, true, "pnuj_background", "nvv_forced_login", null, null);
            }
        }
    }

    public static void LJIILL() {
        AtomicLong atomicLong = C1800450wx9.LIZ;
        atomicLong.set(System.currentTimeMillis());
        C10SI c10si = C10SI.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reset app usage timestamp: ");
        sbLIZ.append(atomicLong.get());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c10si.getClass();
        C10SI.LJIILJJIL(strLIZIZ);
    }

    public static void LJIILLIIL() {
        AnonymousClass0956 anonymousClass0956 = LIZJ;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            C10SI.LIZ.getClass();
            C10SI.LJIILJJIL("Init PNUJ time tracking: start heartbeat time tracking");
            LIZJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1800440wx8(null), 2);
        }
    }

    @Override // X.C10SM
    public final boolean LIZ() {
        C10SI.LIZ.getClass();
        return C10SI.LIZLLL.getBoolean("need_trial_expires_copy", true);
    }

    @Override // X.C10SM
    public final String LIZIZ() {
        C10SI.LIZ.getClass();
        return C10SI.LIZLLL.getString("pnuj_date", "");
    }

    @Override // X.C10SM
    public final boolean LJ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || accountUserServiceLJIIJ.isLogin()) {
            return false;
        }
        C10SI c10si = C10SI.LIZ;
        return (c10si.LJIIIIZZ() || c10si.LJFF()) ? false : true;
    }

    @Override // X.C10SM
    public final boolean LJIIIIZZ() {
        AccountUserService accountUserServiceLJIIJ;
        C10SI c10si = C10SI.LIZ;
        c10si.getClass();
        Keva keva = C10SI.LIZLLL;
        if (keva.getBoolean("is_trial_expired", false)) {
            c10si.getClass();
            C10SI.LJIILJJIL("isTrialExpires: TrialConfig.isTrialExpired, return true");
            return true;
        }
        if (C1800450wx9.LIZ() == 0) {
            c10si.getClass();
            C10SI.LJIILJJIL("isTrialExpires: deviceRegisterTime == 0, return false");
            return false;
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.isLogin()) {
            LJIILJJIL();
            c10si.getClass();
            C10SI.LJIILJJIL("isTrialExpires: isLogin, return false");
            return false;
        }
        c10si.getClass();
        Boolean bool = C10SI.LJIILIIL(false).enableUnloginTimeLimit;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            PersonalizedNUJV2Data personalizedNUJV2DataLJIILIIL = C10SI.LJIILIIL(false);
            int iLJIIL = LJIIL();
            long jIntValue = personalizedNUJV2DataLJIILIIL.loginTimeLimitMin != null ? r0.intValue() : 0L;
            int iLIZ = iLJIIL - C1800450wx9.LIZ();
            long seconds = TimeUnit.MINUTES.toSeconds(jIntValue);
            if (iLJIIL <= 0 || iLIZ < seconds) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isTrialExpires: calendar time: ");
                sbLIZ.append(iLIZ);
                sbLIZ.append(" < ");
                sbLIZ.append(jIntValue);
                C10SI.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isTrialExpires: calendar time: ");
            sbLIZ2.append(iLIZ);
            sbLIZ2.append(" > ");
            sbLIZ2.append(jIntValue);
            C10SI.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            if (!Intrinsics.LJFF(C10SI.LJIILIIL(false).enableAppUsageUnloginTimeLimit, bool2)) {
                C10SI.LJIILJJIL("isTrialExpires: default False!!!");
                return false;
            }
            long jIntValue2 = C10SI.LJIILIIL(false).appUsageUnloginTimeLimitMin != null ? r0.intValue() : 0L;
            c10si.getClass();
            long j = keva.getLong("trial_app_usage_passed_time_ms", 0L);
            long millis = TimeUnit.MINUTES.toMillis(jIntValue2);
            if (j <= millis) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("isTrialExpires: app usage: ");
                sbLIZ3.append(j);
                sbLIZ3.append(" < ");
                sbLIZ3.append(millis);
                C10SI.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ3));
                return false;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("isTrialExpires: app usage: ");
            sbLIZ4.append(j);
            sbLIZ4.append(" > ");
            sbLIZ4.append(millis);
            C10SI.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ4));
        }
        LJIILJJIL();
        return true;
    }

    @Override // X.C10SM
    public final void LJIIJ() {
        AccountUserService accountUserServiceLJIIJ;
        if (LIZLLL) {
            return;
        }
        LIZLLL = true;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return;
        }
        accountUserServiceLJIIJ.LJJIFFI(new InterfaceC427710Gpt() { // from class: X.0wxB
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                PersonalizedTrialHelperInternal.LIZ.getClass();
                PersonalizedTrialHelperInternal.LJIILJJIL();
                C10SI c10si = C10SI.LIZ;
                c10si.getClass();
                Keva keva = C10SI.LIZLLL;
                keva.storeBoolean("need_trial_expires_copy", false);
                c10si.getClass();
                keva.storeString("pnuj_date", "");
            }
        });
    }

    @Override // X.C10SM
    public final void LJII() {
        int iLJIIL = LJIIL();
        if (iLJIIL > 0 && C1800450wx9.LIZ() == 0) {
            C10SI.LIZ.getClass();
            C10SI.LIZLLL.storeInt("trial_start_time", iLJIIL);
            LJIILIIL();
        }
        C10SI c10si = C10SI.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Trial Start Time: ");
        sbLIZ.append(C1800450wx9.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c10si.getClass();
        C10SI.LJIILJJIL(strLIZIZ);
    }

    public static final class AppLifecycleObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
            C10SI c10si = C10SI.LIZ;
            c10si.getClass();
            C10SI.LJIILJJIL("AppLifecycleObserver: onPause");
            PersonalizedTrialHelperInternal.LIZ.getClass();
            c10si.getClass();
            C10SI.LJIILJJIL("Stop heartbeat time tracking");
            AnonymousClass0956 anonymousClass0956 = PersonalizedTrialHelperInternal.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            PersonalizedTrialHelperInternal.LIZJ = null;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
            C10SI.LIZ.getClass();
            C10SI.LJIILJJIL("AppLifecycleObserver: onResume");
            PersonalizedTrialHelperInternal.LIZ.getClass();
            PersonalizedTrialHelperInternal.LJIILL();
            PersonalizedTrialHelperInternal.LJIILLIIL();
        }
    }

    @Override // X.C10SM
    public final boolean LIZJ(String str) {
        return Intrinsics.LJFF("nvv_forced_login", str);
    }

    @Override // X.C10SM
    public final void LIZLLL(String str) {
        if (str == null) {
            str = "";
        }
        C10SI.LIZ.getClass();
        C10SI.LIZLLL.storeString("pnuj_date", str);
    }

    @Override // X.C10SM
    public final boolean LJIIIZ(long j) {
        if (j == 0) {
            return true;
        }
        int iLIZ = C1800450wx9.LIZ();
        if (iLIZ == 0) {
            C10SI.LIZ.getClass();
            C10SI.LJIILJJIL("isTrialExpires: deviceRegisterTime == 0, return false");
            return true;
        }
        int iLJIIL = LJIIL();
        int i = iLJIIL - iLIZ;
        if (iLJIIL <= 0 || i < TimeUnit.MINUTES.toSeconds(j)) {
            return true;
        }
        return false;
    }
}
