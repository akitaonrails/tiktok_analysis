package com.ss.android.ugc.aweme.services.autologin;

import X.AnonymousClass0958;
import X.C099R;
import X.C09AE;
import X.C09AX;
import X.C09DV;
import X.C0FNV;
import X.C0PEM;
import X.C0XFF;
import X.C0XU4;
import X.C0XUD;
import X.C0XW9;
import X.C0XWB;
import X.C0XXB;
import X.C0XXD;
import X.C1514430pVp;
import X.C155000ia;
import X.C19254610Um;
import X.C1954807lC;
import X.C1BV9;
import X.C1C7U;
import X.C2097608Jq;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.C844470XAv;
import X.C846430XIj;
import X.C849680XUw;
import X.C852170Xbr;
import X.DialogC1389620mGW;
import X.InterfaceC1364105Vn;
import X.InterfaceC420801kM;
import X.InterfaceC497601wk;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.IAutoLoginService;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: loaded from: classes14.dex */
public final class AutoLoginService implements IAutoLoginService {
    public final MutableLiveData<C0XXD> _autoLoginState;
    public final LiveData<C0XXD> autoLoginState;
    public C09AE countDownJob;
    public DialogC1389620mGW loadingDialog;
    public final IOneClickLoginService oclService;
    public final IPluginService pluginService;
    public long startTime;
    public int timeoutThresholdInSeconds;
    public final Handler uiHandler = new BPEAHandler(Looper.getMainLooper());
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public static volatile C0XW9 appType = C0XW9.UNKNOWN;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C0XXD.values().length];
            try {
                iArr[C0XXD.NOT_APPLICABLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[C0XXD.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[C0XXD.IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void hideLoading() {
        C786410Ut5.LJJZZIII(this.uiHandler, new Runnable() { // from class: com.ss.android.ugc.aweme.services.autologin.AutoLoginService.hideLoading.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("AutoLoginService@a7a8.hideLoading$1");
                com_ss_android_ugc_aweme_services_autologin_AutoLoginService$hideLoading$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("AutoLoginService@a7a8.hideLoading$1");
            }

            public final void com_ss_android_ugc_aweme_services_autologin_AutoLoginService$hideLoading$1__run$___twin___() {
                DialogC1389620mGW dialogC1389620mGW = AutoLoginService.this.loadingDialog;
                if (dialogC1389620mGW != null) {
                    C0FNV.LIZ(dialogC1389620mGW);
                }
            }

            public static void com_ss_android_ugc_aweme_services_autologin_AutoLoginService$hideLoading$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325891 runnableC2325891) {
                try {
                    runnableC2325891.com_ss_android_ugc_aweme_services_autologin_AutoLoginService$hideLoading$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    private final void showLoading() {
        C786410Ut5.LJJZZIII(this.uiHandler, new Runnable() { // from class: com.ss.android.ugc.aweme.services.autologin.AutoLoginService.showLoading.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("AutoLoginService@a7a8.showLoading$1");
                com_ss_android_ugc_aweme_services_autologin_AutoLoginService$showLoading$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("AutoLoginService@a7a8.showLoading$1");
            }

            public final void com_ss_android_ugc_aweme_services_autologin_AutoLoginService$showLoading$1__run$___twin___() {
                AutoLoginService autoLoginService = AutoLoginService.this;
                if (autoLoginService.loadingDialog == null) {
                    C844470XAv.LIZ.getClass();
                    autoLoginService.loadingDialog = new DialogC1389620mGW(C844470XAv.LIZ());
                }
                DialogC1389620mGW dialogC1389620mGW = AutoLoginService.this.loadingDialog;
                if (dialogC1389620mGW != null) {
                    C0FNV.LIZJ(dialogC1389620mGW);
                }
            }

            public static void com_ss_android_ugc_aweme_services_autologin_AutoLoginService$showLoading$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325901 runnableC2325901) {
                try {
                    runnableC2325901.com_ss_android_ugc_aweme_services_autologin_AutoLoginService$showLoading$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public void autoLoginUser() {
        BaseLoginMethod next;
        BaseLoginMethod baseLoginMethod;
        showLoading();
        List<BaseLoginMethod> listLIZJ = this.oclService.LIZJ();
        if (listLIZJ.isEmpty()) {
            AutoLoginET.INSTANCE.checkEligibilityET(appType, true, C0XXB.NO_ACCOUNTS);
            finishAutoLoginProcess();
            C0XFF.LIZJ("AutoLogin", "oclMethods.isEmpty()");
            return;
        }
        if (C846430XIj.LIZIZ()) {
            Iterator<BaseLoginMethod> it2 = listLIZJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                BaseLoginMethod baseLoginMethod2 = next;
                Boolean boolIsOneClickLogin = baseLoginMethod2.isOneClickLogin();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(boolIsOneClickLogin, bool)) {
                    if (baseLoginMethod2.getOneClickLoginToken() != null) {
                        break;
                    }
                    if (!C846430XIj.LIZJ()) {
                        C0XU4 c0xu4 = C0XU4.LIZ;
                        String uid = baseLoginMethod2.getUid();
                        c0xu4.getClass();
                        if (C0XU4.LIZIZ(uid) != null) {
                            break;
                        }
                    } else if (Intrinsics.LJFF(baseLoginMethod2.getHasOIDC(), bool)) {
                        break;
                    }
                }
            }
            baseLoginMethod = next;
        } else {
            baseLoginMethod = (BaseLoginMethod) ListProtector.get(listLIZJ, 0);
        }
        if (baseLoginMethod == null) {
            AutoLoginET.INSTANCE.checkEligibilityET(appType, true, C0XXB.ALL_ACCOUNTS_FILTERED);
            finishAutoLoginProcess();
            C0XFF.LIZJ("AutoLogin", "accountForAutoLogin == null");
            return;
        }
        AutoLoginET.INSTANCE.checkEligibilityET(appType, true, C0XXB.FOUND_ACCOUNTS);
        C19254610Um.LIZIZ.LJIIJJI().LIZIZ();
        C1BV9 c1bv9CreateMobParams = createMobParams(baseLoginMethod.getLoginMethodName(), listLIZJ.size());
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("account_type", C849680XUw.LIZ(baseLoginMethod)), new Pair("platform", "auto_login"), new Pair("MOB_PARAMS_PROVIDER", c1bv9CreateMobParams));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJIIIIZZ);
        linkedHashMap.remove("MOB_PARAMS_PROVIDER");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Calling Cloud token login API for method: ");
        sbLIZ.append(baseLoginMethod);
        C0XFF.LIZ("AutoLogin", C2188811AlT.LIZIZ(sbLIZ));
        if (C846430XIj.LIZIZ()) {
            this.countDownJob = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new AnonymousClass1(this.oclService.LJIILJJIL(null, baseLoginMethod, C0XWB.AUTO_LOGIN, mapLJIIIIZZ, new AwS557S0100000_13(this, 125), new AwS592S0100000_13(this, 48)), null), 3);
        } else {
            this.countDownJob = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new AnonymousClass2(this.oclService.LJFF(null, baseLoginMethod, C0XWB.AUTO_LOGIN, mapLJIIIIZZ, new AwS557S0100000_13(this, 124), new AwS592S0100000_13(this, 47)), c1bv9CreateMobParams, linkedHashMap, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAutoLoginService
    public void cancelTimeoutFor2SVOrIDVScene() {
        C0XFF.LIZJ("AutoLogin", "Cancel timeout job");
        C09AE c09ae = this.countDownJob;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    public final void finishAutoLoginProcess() {
        this._autoLoginState.postValue(C0XXD.FINISHED);
        hideLoading();
    }

    @Override // com.ss.android.ugc.aweme.IAutoLoginService
    public void initOCLDataBeforeAutoLogin() {
        C0XW9 next;
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService == null || !iAccountLoginMethodsService.LIZJ() || iAccountLoginMethodsService.LIZIZ()) {
            if (!C1514430pVp.LIZLLL().booleanValue()) {
                C0XFF.LIZJ("AutoLogin", "Auto-login was not initiated as isFirstInstallAndFirstLaunch is false");
                return;
            }
            C0XFF.LIZJ("AutoLogin", "Begin auto login");
            IPluginService.ReinstallCheck deviceCheckResult = this.pluginService.getDeviceCheckResult();
            Iterator<C0XW9> it2 = C0XW9.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next.getValue() == deviceCheckResult.getValue()) {
                        break;
                    }
                }
            }
            C0XW9 c0xw9 = next;
            if (c0xw9 == null) {
                c0xw9 = C0XW9.UNKNOWN;
            }
            appType = c0xw9;
            this._autoLoginState.postValue(C0XXD.IN_PROGRESS);
            this.startTime = System.currentTimeMillis();
            C0XUD c0xud = C0XUD.LIZ;
            AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(this, 49);
            c0xud.getClass();
            C0XUD.LIZLLL("AutoLogin", awS592S0100000_13);
        }
    }

    public AutoLoginService() {
        MutableLiveData<C0XXD> mutableLiveData = new MutableLiveData<>(C0XXD.NOT_APPLICABLE);
        this._autoLoginState = mutableLiveData;
        this.autoLoginState = mutableLiveData;
        this.oclService = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
        this.pluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        this.timeoutThresholdInSeconds = 10;
    }

    public static final class Companion {
        public final C0XW9 getAppType() {
            return AutoLoginService.appType;
        }

        public final void setAppType(C0XW9 c0xw9) {
            AutoLoginService.appType = c0xw9;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAutoLoginService
    public LiveData<C0XXD> getAutoLoginState() {
        return this.autoLoginState;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.autologin.AutoLoginService$autoLoginUser$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    @C09DV(c = "com.ss.android.ugc.aweme.services.autologin.AutoLoginService$autoLoginUser$1", f = "AutoLoginService.kt", l = {162}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ C09AE $job;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C09AE c09ae, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$job = c09ae;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return AutoLoginService.this.new AnonymousClass1(this.$job, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("AutoLoginService@a7a8.autoLoginUser$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                long j = ((long) AutoLoginService.this.timeoutThresholdInSeconds) * 1000;
                this.label = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("AutoLoginService@a7a8.autoLoginUser$1");
                    return objLJFF;
                }
            }
            C09AE c09ae = this.$job;
            if (c09ae != null && !c09ae.isCompleted()) {
                this.$job.LIZIZ(null);
                AutoLoginService.this.finishAutoLoginProcess();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AutoLoginService@a7a8.autoLoginUser$1");
            return unit;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.autologin.AutoLoginService$autoLoginUser$2, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.autologin.AutoLoginService$autoLoginUser$2", f = "AutoLoginService.kt", l = {190}, m = "invokeSuspend")
    public final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ InterfaceC420801kM $disposable;
        public final /* synthetic */ Map<String, Object> $mobParamsWithoutMobProvider;
        public final /* synthetic */ C1BV9 $mobProvider;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC420801kM interfaceC420801kM, C1BV9 c1bv9, Map<String, Object> map, InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$disposable = interfaceC420801kM;
            this.$mobProvider = c1bv9;
            this.$mobParamsWithoutMobProvider = map;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return AutoLoginService.this.new AnonymousClass2(this.$disposable, this.$mobProvider, this.$mobParamsWithoutMobProvider, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("AutoLoginService@a7a8.autoLoginUser$2");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                long j = ((long) AutoLoginService.this.timeoutThresholdInSeconds) * 1000;
                this.label = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("AutoLoginService@a7a8.autoLoginUser$2");
                    return objLJFF;
                }
            }
            InterfaceC420801kM interfaceC420801kM = this.$disposable;
            if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                C0XFF.LIZJ("AutoLogin", "Dispose cloud token API call due to timeout error. Auto Login failed.");
                this.$disposable.dispose();
                C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                C1BV9 c1bv9 = this.$mobProvider;
                Map<String, Object> map = this.$mobParamsWithoutMobProvider;
                c852170Xbr.getClass();
                C852170Xbr.LJIIIIZZ(false, 408, "auto_login", c1bv9, map);
                AutoLoginService.this.finishAutoLoginProcess();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AutoLoginService@a7a8.autoLoginUser$2");
            return unit;
        }
    }

    private final C1BV9 createMobParams(LoginMethodName loginMethodName, int i) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("login_panel_type", "auto_login", bundle);
        C786410Ut5.LJJJI("auto_login_platform", AutoLoginET.INSTANCE.getAutoLoginPlatform(loginMethodName), bundle);
        int i2 = 1;
        if (i <= 1) {
            i2 = 0;
        }
        bundle.putInt("multiple_auto_login_accounts", i2);
        return new C1BV9("cold_launch", "welcome_screen", "auto_login", "auto_login", "", bundle);
    }

    @Override // com.ss.android.ugc.aweme.IAutoLoginService
    public void handleLoadingDialogForAutoLogin(C0XXD c0xxd, Function1<? super Boolean, Unit> function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[c0xxd.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                C0XFF.LIZJ("AutoLogin", "Show load");
                function1.invoke(Boolean.TRUE);
                return;
            }
            throw new C1954807lC();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Dismiss load: ");
        sbLIZ.append(c0xxd);
        C0XFF.LIZJ("AutoLogin", C2188811AlT.LIZIZ(sbLIZ));
        function1.invoke(Boolean.FALSE);
    }
}
