package com.ss.android.ugc.aweme.services;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.AbstractDialogC1239060iLg;
import X.C05X2;
import X.C0BTM;
import X.C0FNV;
import X.C0R1H;
import X.C0TT5;
import X.C0WZX;
import X.C0XGR;
import X.C0XGX;
import X.C0XPY;
import X.C0XQ5;
import X.C0XQ7;
import X.C0XQT;
import X.C0XTQ;
import X.C0XTT;
import X.C0XTU;
import X.C0XUE;
import X.C0XUK;
import X.C0XUU;
import X.C0XWE;
import X.C0XZ2;
import X.C1227904rF;
import X.C1238110iK9;
import X.C1239220iLw;
import X.C1387310mCn;
import X.C13LP;
import X.C1701330uNH;
import X.C1720106oR;
import X.C1906580ziK;
import X.C1913610ztf;
import X.C19314110hH;
import X.C19EG;
import X.C1BV2;
import X.C1BV9;
import X.C1C7U;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C293990Bfh;
import X.C785410UrT;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C816490W1f;
import X.C844470XAv;
import X.C848230XPh;
import X.C852510XcP;
import X.C852680Xcg;
import X.C852790Xcr;
import X.C852810Xct;
import X.DialogC1389620mGW;
import X.EnumC1239210iLv;
import X.EnumC1913590ztd;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1699660uKa;
import X.InterfaceC1748950vc5;
import X.InterfaceC1913620ztg;
import X.InterfaceC586170Myt;
import X.InterfaceC849490XUd;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysUserData;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.model.AccountSelectionOption;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.model.OrgUserInfo;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.LoginService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class LoginService extends BaseLoginService {
    public Dialog mLoginDialog;

    public static /* synthetic */ void lambda$openPrivacyPolicy$8(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public boolean needRedirectToMainAfterLogin() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.LoginService$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName;

        static {
            int[] iArr = new int[LoginMethodName.values().length];
            $SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName = iArr;
            try {
                iArr[LoginMethodName.THIRD_PARTY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName[LoginMethodName.PHONE_NUMBER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName[LoginMethodName.PHONE_SMS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName[LoginMethodName.EMAIL_PASS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName[LoginMethodName.USER_NAME_PASS.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName[LoginMethodName.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName[LoginMethodName.PASSKEY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$retryLogin$9() {
        C1C7U.LIZ("LoginService@20ae.retryLogin$1L");
        C0XUE.LIZ.LJI(new BaseLoginMethod(), true);
        if (getLoginParam() != null) {
            showLoginAndRegisterView(getLoginParam());
        }
        C1C7U.LIZIZ("LoginService@20ae.retryLogin$1L");
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public List<C0XTT> getAllSupportedLoginPlatform() {
        C0XTT c0xtt;
        LinkedList linkedList = new LinkedList(super.getAllSupportedLoginPlatform());
        linkedList.add(new C0XTT("email"));
        EnumC1239210iLv[] enumC1239210iLvArrValues = EnumC1239210iLv.values();
        LinkedList linkedList2 = new LinkedList();
        if (enumC1239210iLvArrValues.length != 0) {
            for (EnumC1239210iLv enumC1239210iLv : enumC1239210iLvArrValues) {
                C19314110hH.LIZ.getClass();
                if (C19314110hH.LIZIZ(enumC1239210iLv)) {
                    switch (C1239220iLw.LIZ[enumC1239210iLv.ordinal()]) {
                        case 1:
                            c0xtt = new C0XTT(enumC1239210iLv.getPassportName());
                            linkedList2.add(c0xtt);
                            break;
                        case 2:
                            c0xtt = new C0XTT(enumC1239210iLv.getPassportName());
                            linkedList2.add(c0xtt);
                            break;
                        case 3:
                            c0xtt = new C0XTT(enumC1239210iLv.getPassportName());
                            linkedList2.add(c0xtt);
                            break;
                        case 4:
                            c0xtt = new C0XTT(enumC1239210iLv.getPassportName());
                            linkedList2.add(c0xtt);
                            break;
                        case 5:
                            c0xtt = new C0XTT(enumC1239210iLv.getPassportName());
                            linkedList2.add(c0xtt);
                            break;
                        case 6:
                            c0xtt = new C0XTT(enumC1239210iLv.getPassportName());
                            linkedList2.add(c0xtt);
                            break;
                        case 7:
                            c0xtt = new C0XTT(enumC1239210iLv.getPassportName());
                            linkedList2.add(c0xtt);
                            break;
                    }
                }
            }
        }
        linkedList.addAll(linkedList2);
        return linkedList;
    }

    public void retryLogin() {
        C786410Ut5.LJLIIL(300L, new BPEAHandler(), new Runnable() { // from class: X.0Xcp
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$retryLogin$9();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public boolean isEnableMultiAccountLogin() {
        if (!((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            if (!C0BTM.LIZ().getBoolean("disable_switch_account", false)) {
                return true;
            }
            try {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("clear_account_disable_switch_account_android", false)) {
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public boolean isReactivePageShowing() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        return abstractC1387200mCcLIZIZ != null && (abstractC1387200mCcLIZIZ.LIZIZ() instanceof ReactiveAccountActivity);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.mLoginDialog;
        if (dialog != null) {
            C786410Ut5.LIZIZ(dialog);
            this.mLoginDialog = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public Class<? extends Activity> getPushLoginActivityClass() {
        return PushLoginActivity.class;
    }

    public static void downgradeToNormalLogin(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void fallBackPhoneSMSLogin(Bundle bundle) {
        bundle.putInt("next_page", EnumC852910Xd3.PHONE_EMAIL_LOGIN.getValue());
        bundle.putInt("current_scene", EnumC852660Xce.HISTORY_LOGIN.getValue());
    }

    public static void fallbackFromEmailLogin(Bundle bundle) {
        bundle.putInt("next_page", EnumC852910Xd3.PHONE_EMAIL_LOGIN.getValue());
        bundle.putInt("child_page", EnumC852910Xd3.INPUT_EMAIL_LOGIN.getValue());
        bundle.putInt("current_scene", EnumC852660Xce.HISTORY_LOGIN.getValue());
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public boolean isLoginActivity(Activity activity) {
        return activity instanceof SignUpOrLoginActivity;
    }

    public boolean needShowAgeGateBlockingLoginDialog(boolean z) {
        if (ComplianceServiceProvider.LIZLLL().LJFF() && !z) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService
    public void openPrivacyPolicy(Activity activity) {
        ComplianceServiceProvider.LJIIIIZZ().LIZ(new C1913610ztf(EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue(), "privacy-policy", null, false, true, true, false), new InterfaceC1913620ztg() { // from class: X.0Xcq
            @Override // X.InterfaceC1913620ztg
            public final void onComplete() {
                LoginService.lambda$openPrivacyPolicy$8(true);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public void showLoginAndRegisterView(C0XQT c0xqt) {
        super.showLoginAndRegisterView(c0xqt);
        Activity activity = c0xqt.LIZ;
        if (activity != null && !C0R1H.LIZ(activity)) {
            boolean z = c0xqt.LIZJ.getBoolean("is_fullscreen_dialog");
            C0XTQ.LIZ = c0xqt.LIZJ.getString("enter_method", "");
            C0XTQ.LIZIZ = c0xqt.LIZJ.getString("enter_from", "");
            C0XTQ.LIZJ = c0xqt.LIZJ.getString("login_panel_type", "");
            if (needShowAgeGateBlockingLoginDialog(z)) {
                final Activity activity2 = c0xqt.LIZ;
                final Bundle bundle = c0xqt.LIZJ;
                AbstractDialogC1239060iLg abstractDialogC1239060iLg = new AbstractDialogC1239060iLg(activity2, bundle) { // from class: X.0iMM
                    @Override // X.AbstractDialogC1239060iLg
                    public final void LJJLJ() {
                        View viewSd = C786410Ut5.Sd(R.layout.xp, getLayoutInflater(), null);
                        this.LLJILLL = viewSd;
                        if (viewSd != null) {
                            this.LLILZIL.putBoolean("age_gate_block", true);
                            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 279), viewSd.findViewById(R.id.exg));
                            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 280), viewSd.findViewById(R.id.npi));
                            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 281), viewSd.findViewById(R.id.vfu));
                        }
                        setContentView(this.LLJILLL);
                        ((CopyOnWriteArrayList) C1238280iKQ.LIZIZ).add(this);
                    }

                    {
                        LJJLJ();
                    }
                };
                Window window = abstractDialogC1239060iLg.getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 80;
                    attributes.flags |= 2;
                    window.setAttributes(attributes);
                    window.setWindowAnimations(R.style.a_b);
                }
                abstractDialogC1239060iLg.show();
                C785410UrT.LIZIZ(abstractDialogC1239060iLg);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(abstractDialogC1239060iLg);
                C816490W1f.LIZ(abstractDialogC1239060iLg);
                this.mLoginDialog = abstractDialogC1239060iLg;
                return;
            }
            showLoginAndRegisterViewInner(c0xqt);
        }
    }

    public void showLoginAndRegisterViewInner(final C0XQT c0xqt) {
        final String str;
        C852810Xct.LIZ.getClass();
        C852810Xct.LIZIZ = ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode();
        boolean z = c0xqt.LIZJ.getBoolean("show_login_page_first", ((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowLoginTabFirst());
        C786410Ut5.LJJJI("previous_uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), c0xqt.LIZJ);
        final String string = c0xqt.LIZJ.getString("enter_type");
        if (string == null) {
            if (z) {
                str = "click_login";
            } else {
                str = "click_sign_up";
            }
        } else {
            str = string;
        }
        final IOneClickLoginService iOneClickLoginService = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
        if (!iOneClickLoginService.LJ()) {
            goToLoginOrSignup(c0xqt, str);
            return;
        }
        if (iOneClickLoginService.LJIILLIIL() && iOneClickLoginService.LJIIJ(null)) {
            if (string == null) {
                string = "oneclick_login";
            }
            goToLoginOrSignup(c0xqt, string);
            return;
        }
        final DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c0xqt.LIZ);
        dialogC1389620mGW.setCancelable(false);
        dialogC1389620mGW.LJJLIIJ(false);
        if (!c0xqt.LIZJ.getBoolean("is_disable_ocl_loading", false)) {
            C0FNV.LIZJ(dialogC1389620mGW);
        }
        iOneClickLoginService.LJI(new Function0() { // from class: X.0Xcn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.LL.lambda$showLoginAndRegisterViewInner$1(dialogC1389620mGW, c0xqt, str);
            }
        }, new Function1() { // from class: X.0Xcl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.LL.lambda$showLoginAndRegisterViewInner$0(dialogC1389620mGW, iOneClickLoginService, c0xqt, string, str, (List) obj);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public void showLoginView(C0XQT c0xqt) {
        super.showLoginView(c0xqt);
        C852810Xct.LIZ.getClass();
        C852810Xct.LIZIZ = ((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", C0XTQ.LIZ);
        C20684815ws.LJIILLIIL("click_login", c0xgr.LIZ);
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C0XPY.LIZIZ(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.LIZIZ();
            iFeed0VVManagerService.LIZJ("LOGIN");
        }
        SmartRoute smartRouteLIZ = C852680Xcg.LIZ(c0xqt.LIZ);
        if (TextUtils.isEmpty(c0xqt.LIZJ.getString("enter_type"))) {
            C786410Ut5.LJJJI("enter_type", "click_login", c0xqt.LIZJ);
        }
        smartRouteLIZ.withParam(c0xqt.LIZJ);
        smartRouteLIZ.open();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb A[PHI: r2
      0x00bb: PHI (r2v1 android.content.Context) = (r2v0 android.content.Context), (r2v3 android.content.Context) binds: [B:9:0x0068, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean toRecoverDeletedAccount(java.lang.String r30) throws java.lang.Throwable {
        /*
            r29 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = X.C0XQ5.LIZJ()
            boolean r0 = r0.isUserCancelled()
            r12 = 0
            if (r0 == 0) goto Lbe
            java.lang.Class<com.ss.android.ugc.aweme.IAccountMainModuleService> r0 = com.ss.android.ugc.aweme.IAccountMainModuleService.class
            java.lang.Object r0 = X.C0XPY.LIZIZ(r0)
            com.ss.android.ugc.aweme.IAccountMainModuleService r0 = (com.ss.android.ugc.aweme.IAccountMainModuleService) r0
            r0.LIZ()
            X.C0XVS.LIZ()
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r2 = X.C844470XAv.LIZ()
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6Aq7MoLpb+ZdM8ucag=="
            r8 = 0
            r1.<init>(r0, r8)
            X.0WST r4 = new X.0WST
            r4.<init>()
            r0 = 2
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r12] = r2
            r20 = 1
            r9[r20] = r30
            X.0WZW r11 = new X.0WZW
            java.lang.String r0 = "(Landroid/content/Context;Ljava/lang/String;)V"
            r11.<init>(r12, r0, r1)
            r5 = 11098(0x2b5a, float:1.5552E-41)
            java.lang.String r23 = "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity"
            java.lang.String r24 = "startActivity"
            java.lang.Class<com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity> r25 = com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity.class
            java.lang.String r27 = "void"
            r21 = r4
            r22 = r5
            r26 = r9
            r28 = r11
            X.0WSU r1 = r21.LIZIZ(r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L66
            java.lang.String r6 = "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity"
            java.lang.String r7 = "startActivity"
            java.lang.Class<com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity> r10 = com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity.class
            r4.LIZ(r5, r6, r7, r8, r9, r10, r11, r12)
            return r20
        L66:
            java.lang.Object[] r1 = r1.LIZJ
            if (r1 == 0) goto Lbb
            r0 = r1[r12]
            if (r0 == 0) goto L71
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
        L71:
            r1 = r1[r20]
            if (r1 == 0) goto Lbb
            java.lang.String r1 = (java.lang.String) r1
        L77:
            java.lang.String r0 = com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity._pnsPageId
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity> r0 = com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity.class
            r3.<init>(r2, r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L90
            java.lang.String r0 = "enter_from"
            r3.putExtra(r0, r1)
        L90:
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r1 = r0.getDispatcher()
            java.lang.String r0 = "Context_startActivity_1"
            r1.dispatchActivityOpReached(r2, r3, r0)
            X.C1701330uNH.LIZ(r3, r2)
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEF/tzqRFj1KYptJo3ErO7c6SlQ9IaaTgKz4UvAJ89pcY="
            r1.<init>(r0, r8)
            X.C2204961BRm.LJJJJJL(r2, r3, r1)
            java.lang.String r14 = "com/ss/android/ugc/aweme/account/reactive/ReactiveAccountActivity"
            java.lang.String r15 = "startActivity"
            java.lang.Class<com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity> r18 = com.ss.android.ugc.aweme.account.reactive.ReactiveAccountActivity.class
            r12 = r4
            r13 = r5
            r16 = r8
            r17 = r9
            r19 = r11
            r12.LIZ(r13, r14, r15, r16, r17, r18, r19, r20)
            return r20
        Lbb:
            r1 = r30
            goto L77
        Lbe:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.LoginService.toRecoverDeletedAccount(java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public void uploadAccountNum(boolean z) {
        if (C0XQ5.LJ().isEnableMultiAccountLogin()) {
            if (C852790Xcr.LIZIZ == 0) {
                C844470XAv.LIZ.getClass();
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "ProfilePreferences");
                C852790Xcr.LIZ = sharedPreferencesLIZJ.getInt("last_upload_account_num", 0);
                C852790Xcr.LIZIZ = sharedPreferencesLIZJ.getLong("last_upload_account_num_time", 0L);
            }
            if (C0XQ5.LJFF()) {
                if (!C1387310mCn.LJFF(C852790Xcr.LIZIZ) || C852790Xcr.LIZ != ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI().size()) {
                    C852790Xcr.LIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI().size();
                    C852790Xcr.LIZIZ = Calendar.getInstance().getTime().getTime();
                    C844470XAv.LIZ.getClass();
                    C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "ProfilePreferences").edit().putInt("last_upload_account_num", C852790Xcr.LIZ).putLong("last_upload_account_num_time", C852790Xcr.LIZIZ).apply();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(C852790Xcr.LIZ, "account_num");
                    List<String> listLJJI = C0XQ5.LIZ().LJJI();
                    ArrayList arrayList = new ArrayList();
                    for (String str : listLJJI) {
                        if (str != null) {
                            C848230XPh.LL.getClass();
                            SignificantUserInfo significantUserInfoLJIIJJI = C848230XPh.LJIIJJI(str);
                            if (significantUserInfoLJIIJJI != null) {
                                arrayList.add(significantUserInfoLJIIJJI);
                            }
                        }
                    }
                    c2344009Gk.LJIIIIZZ("user_ids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS247S0000000_13.get$arr$(55), 30));
                    C20684815ws.LJIILLIIL("multi_account_status", c2344009Gk.LIZ);
                }
            }
        }
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_LoginService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6Aq7MoLpb+ZdM8ucag==", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_LoginService_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_LoginService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    public static void appendSectionOption(Bundle bundle, BaseLoginMethod baseLoginMethod) {
        boolean zIsOrgAccount;
        if (baseLoginMethod instanceof PhoneLoginMethod) {
            zIsOrgAccount = ((PhoneLoginMethod) baseLoginMethod).isOrgAccount();
        } else {
            zIsOrgAccount = false;
        }
        C786410Ut5.LJJIJL(bundle, "account_selections_option", new AccountSelectionOption.TargetAccount(baseLoginMethod.getUid(), zIsOrgAccount));
    }

    public static void appendSectionOptionAndApproach(Bundle bundle, BaseLoginMethod baseLoginMethod) {
        boolean zEquals;
        if (baseLoginMethod instanceof AccountPassLoginMethod) {
            zEquals = Boolean.TRUE.equals(((AccountPassLoginMethod) baseLoginMethod).isOrgAccount());
        } else {
            zEquals = false;
        }
        C786410Ut5.LJJIJL(bundle, "account_selections_option", new AccountSelectionOption.TargetAccount(baseLoginMethod.getUid(), zEquals));
        C786410Ut5.LJJIJL(bundle, "get_available_ways_approach", new AvailableWaysViewModel.GetAvailableWayType(!zEquals, false));
    }

    public static void doEmailPassLogin(Bundle bundle, BaseLoginMethod baseLoginMethod) {
        AccountPassLoginMethod accountPassLoginMethod = (AccountPassLoginMethod) baseLoginMethod;
        String name = accountPassLoginMethod.getName();
        if (TextUtils.isEmpty(name)) {
            fallbackFromEmailLogin(bundle);
            return;
        }
        bundle.putInt("current_scene", EnumC852660Xce.EMAIL_OTP_LOGIN.getValue());
        C786410Ut5.LJJIZ(bundle, "auto_fill_account_name", name);
        if (C0XZ2.LIZIZ(name)) {
            bundle.putInt("next_page", EnumC852910Xd3.EMAIL_LINK_LOGIN_OR_SIGNUP.getValue());
        } else {
            bundle.putInt("next_page", EnumC852910Xd3.EMAIL_OTP_LOGIN.getValue());
        }
        bundle.putBoolean("user_cross_activity_timer", true);
        boolean zEquals = Boolean.TRUE.equals(accountPassLoginMethod.isOrgAccount());
        C786410Ut5.LJJIJL(bundle, "account_selections_option", new AccountSelectionOption.TargetAccount(baseLoginMethod.getUid(), zEquals));
        C786410Ut5.LJJIJL(bundle, "get_available_ways_approach", new AvailableWaysViewModel.GetAvailableWayType(!zEquals, false));
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILLIIL(bundle, name);
        bundle.putBoolean("code_sent", false);
    }

    public static void doPhoneSMSLogin(Bundle bundle, BaseLoginMethod baseLoginMethod) {
        PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) baseLoginMethod;
        C786410Ut5.LJJIZ(bundle, "auto_fill_phone_number", phoneLoginMethod.getPhoneNumber());
        PhoneNumberUtil.PhoneNumber phoneNumber = phoneLoginMethod.getPhoneNumber();
        if (PhoneNumberUtil.LJFF(String.valueOf(phoneNumber.getCountryCode()), phoneNumber.getNationalNumber())) {
            bundle.putInt("next_page", EnumC852910Xd3.PHONE_SMS_LOGIN.getValue());
            bundle.putInt("current_scene", EnumC852660Xce.HISTORY_LOGIN.getValue());
            C786410Ut5.LJJIZ(bundle, "args_phone_number", phoneNumber);
            bundle.putBoolean("user_cross_activity_timer", true);
            bundle.putBoolean("code_sent", false);
            C786410Ut5.LJJIJL(bundle, "account_selections_option", new AccountSelectionOption.TargetAccount(baseLoginMethod.getUid(), ((PhoneLoginMethod) baseLoginMethod).isOrgAccount()));
            return;
        }
        fallBackPhoneSMSLogin(bundle);
    }

    public static void doUserNamePassLogin(Bundle bundle, AccountPassLoginMethod accountPassLoginMethod) {
        OrgUserInfo orgUserInfo;
        int value = EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD.getValue();
        if (Boolean.TRUE.equals(accountPassLoginMethod.isOrgOtp()) && (orgUserInfo = accountPassLoginMethod.getOrgUserInfo()) != null) {
            value = EnumC852910Xd3.ORG_OTP_LOGIN.getValue();
            C786410Ut5.LJJJI("is_org_account", "1", bundle);
            C786410Ut5.LJJJI("tt_account_type", orgUserInfo.accountType, bundle);
            C786410Ut5.LJJJI("org_platform_name", orgUserInfo.orgName, bundle);
            C786410Ut5.LJJJI("is_org_account_inter_period", orgUserInfo.isOrgPeriod(), bundle);
        }
        bundle.putInt("current_scene", EnumC852660Xce.HISTORY_LOGIN.getValue());
        String name = accountPassLoginMethod.getName();
        C786410Ut5.LJJIZ(bundle, "auto_fill_account_name", name);
        bundle.putInt("next_page", value);
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILLIIL(bundle, name);
    }

    private void goToLoginOrSignup(C0XQT c0xqt, String str) {
        boolean z;
        String str2;
        String strName;
        boolean z2 = c0xqt.LIZJ.getBoolean("is_disable_animation", false);
        boolean z3 = c0xqt.LIZJ.getBoolean("is_fullscreen_dialog");
        int i = 1;
        if (!c0xqt.LIZJ.getBoolean("force_use_default_login_method", false) && !z3) {
            z = false;
        } else {
            z = true;
        }
        boolean z4 = c0xqt.LIZJ.getBoolean("show_login_page_first", ((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowLoginTabFirst());
        Serializable serializable = c0xqt.LIZJ.getSerializable("extra_param");
        if (serializable == null) {
            serializable = new HashMap();
            C786410Ut5.LJJIZ(c0xqt.LIZJ, "extra_param", serializable);
        }
        Map map = (Map) serializable;
        map.put("params_for_special", "uc_login");
        BaseLoginMethod baseLoginMethodLJFF = C0XUE.LIZ.LJFF();
        LoginMethodName loginMethodName = baseLoginMethodLJFF.getLoginMethodName();
        if (loginMethodName != LoginMethodName.DEFAULT && !z) {
            i = 0;
        }
        int i2 = i ^ 1;
        map.put("login_last_time", Integer.valueOf(i2));
        c0xqt.LIZJ.putInt("login_last_time", i2);
        if (z4) {
            str2 = "login";
        } else {
            str2 = "signup";
        }
        String string = c0xqt.LIZJ.getString("login_panel_type_m2", null);
        if (string != null) {
            str2 = string;
        }
        C786410Ut5.LJJJI("login_panel_type", str2, c0xqt.LIZJ);
        if (i == 0) {
            C786410Ut5.LJJJI("enter_type", str, c0xqt.LIZJ);
            C786410Ut5.LJJJI("login_panel_type", str2, c0xqt.LIZJ);
            if (loginMethodName == LoginMethodName.THIRD_PARTY) {
                strName = baseLoginMethodLJFF.findPlatform();
            } else {
                strName = loginMethodName.name();
            }
            C786410Ut5.LJJJI("previous_login_method", strName, c0xqt.LIZJ);
        }
        boolean z5 = c0xqt.LIZJ.getBoolean("need_callback", false);
        String str3 = I18nSignUpActivity._pnsPageId;
        C0XTU.LIZIZ(c0xqt.LIZ, c0xqt.LIZJ, z4, z5, z2, c0xqt.LIZIZ);
    }

    public static /* synthetic */ void lambda$loginByMethodName$7(Runnable runnable, Throwable th) {
        C1C7U.LIZ("LoginService@20ae.loginByMethodName$1L");
        downgradeToNormalLogin(runnable);
        C1C7U.LIZIZ("LoginService@20ae.loginByMethodName$1L");
    }

    private void reportHLClassCastException(BaseLoginMethod baseLoginMethod, String str) {
        try {
            HashMap map = new HashMap();
            map.put("login_method", baseLoginMethod.toString());
            map.put("expected_login_method", str);
            String string = map.toString();
            Npth.reportBizException("TheOneHLClassCastException", new Throwable(string), string, (Map<String, String>) map, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private void startFailed3pDeprecation(String str, Activity activity) {
        C1BV2 c1bv2;
        if (activity instanceof I18nSignUpActivity) {
            I18nSignUpActivity i18nSignUpActivity = (I18nSignUpActivity) activity;
            i18nSignUpActivity.getClass();
            if (C0XGX.LIZ()) {
                LoginSignupTabFragment loginSignupTabFragmentLLLLZLL = i18nSignUpActivity.LLLLZLL();
                if (loginSignupTabFragmentLLLLZLL != null) {
                    c1bv2 = loginSignupTabFragmentLLLLZLL.LLILLJJLI;
                } else {
                    return;
                }
            } else {
                c1bv2 = i18nSignUpActivity.LLJJI;
            }
            if (c1bv2 != null) {
                c1bv2.LIZLLL(0L, str, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public void loginByPlatform(C0XQT c0xqt, C0XTT c0xtt) {
        EnumC852910Xd3 enumC852910Xd3;
        LoginMethodName loginMethodName;
        super.loginByPlatform(c0xqt, c0xtt);
        C786410Ut5.LJJJI("previous_uid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), c0xqt.LIZJ);
        if (c0xqt.LIZIZ.equals("find_account")) {
            try {
                JSONObject jSONObject = new JSONObject(c0xqt.LIZJ.getString("jsb_parmas"));
                String strOptString = jSONObject.optString("nickname", "");
                String strOptString2 = jSONObject.optString("email", "");
                String strOptString3 = jSONObject.optString("mobile", "");
                String strOptString4 = jSONObject.optString("not_login_ticket", "");
                Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean("is_safe", false));
                String str = c0xtt.LIZ;
                C852510XcP c852510XcP = new C852510XcP("", strOptString, strOptString2, strOptString3, null, strOptString4, boolValueOf.booleanValue(), boolValueOf.booleanValue());
                C786410Ut5.LJJJI("args_email", strOptString2, c0xqt.LIZJ);
                C786410Ut5.LJJJI("enter_from", "find_account", c0xqt.LIZJ);
                C786410Ut5.LJJJI("enter_method", "find_account", c0xqt.LIZJ);
                C786410Ut5.LJJIZ(c0xqt.LIZJ, "recover_account_data", c852510XcP);
                Bundle bundle = c0xqt.LIZJ;
                EnumC852660Xce enumC852660Xce = EnumC852660Xce.RECOVER_ACCOUNT;
                bundle.putInt("current_scene", enumC852660Xce.getValue());
                if (boolValueOf.booleanValue() && !strOptString4.isEmpty() && "mobile".equals(str)) {
                    Bundle bundle2 = c0xqt.LIZJ;
                    EnumC852910Xd3 enumC852910Xd32 = EnumC852910Xd3.PHONE_SMS_LOGIN;
                    bundle2.putInt("next_page", enumC852910Xd32.getValue());
                    c0xqt.LIZJ.putInt("current_scene", enumC852660Xce.getValue());
                    c0xqt.LIZJ.putInt("next_page", enumC852910Xd32.getValue());
                    c0xqt.LIZJ.putBoolean("email_should_add_email", true);
                } else if ("mobile".equals(str)) {
                    c0xqt.LIZJ.putInt("next_page", EnumC852910Xd3.PHONE_EMAIL_LOGIN.getValue());
                    c0xqt.LIZJ.putInt("child_page", EnumC852910Xd3.INPUT_PHONE_LOGIN.getValue());
                } else if ("email".equals(str)) {
                    c0xqt.LIZJ.putInt("next_page", EnumC852910Xd3.PHONE_EMAIL_LOGIN.getValue());
                    c0xqt.LIZJ.putInt("child_page", EnumC852910Xd3.INPUT_EMAIL_LOGIN.getValue());
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c0xqt.LIZJ.getBoolean("is_login", true)) {
            if (TextUtils.equals(c0xtt.LIZ, "mobile")) {
                loginMethodName = LoginMethodName.PHONE_SMS;
            } else if (TextUtils.equals(c0xtt.LIZ, "email")) {
                loginMethodName = LoginMethodName.EMAIL_PASS;
            }
            if (loginMethodName != null) {
                loginByMethodName(c0xqt.LIZ, c0xqt.LIZJ, loginMethodName, null, null);
                return;
            }
        }
        String str2 = c0xtt.LIZ;
        str2.getClass();
        if (!str2.equals("mobile") && !str2.equals("email")) {
            if (TextUtils.isEmpty(c0xqt.LIZJ.getString("enter_type"))) {
                C786410Ut5.LJJJI("enter_type", "click_login", c0xqt.LIZJ);
            }
            C1238110iK9 c1238110iK9 = C1238110iK9.LIZ;
            Activity activity = c0xqt.LIZ;
            String str3 = c0xtt.LIZ;
            C1BV9 c1bv9 = new C1BV9(c0xqt.LIZJ.getString("enter_from", ""), c0xqt.LIZJ.getString("enter_method", ""), "click_login", "login", "", c0xqt.LIZJ);
            c1238110iK9.getClass();
            Intent intentLIZ = C1238110iK9.LIZ(activity, false, str3, c1bv9);
            if (intentLIZ != null) {
                C0TT5.LIZIZ(activity, intentLIZ, str3);
                return;
            }
            return;
        }
        SmartRoute smartRouteLIZJ = C852680Xcg.LIZJ(c0xqt.LIZ);
        if (TextUtils.equals(c0xtt.LIZ, "mobile")) {
            enumC852910Xd3 = EnumC852910Xd3.INPUT_PHONE_SIGN_UP;
        } else {
            enumC852910Xd3 = EnumC852910Xd3.INPUT_EMAIL_SIGN_UP;
        }
        smartRouteLIZJ.withParam("child_page", enumC852910Xd3.getValue());
        if (TextUtils.isEmpty(c0xqt.LIZJ.getString("enter_type"))) {
            C786410Ut5.LJJJI("enter_type", "click_sign_up", c0xqt.LIZJ);
        }
        smartRouteLIZJ.withParam(c0xqt.LIZJ);
        smartRouteLIZJ.open();
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public void openCountryListActivity(Activity activity, InterfaceC1748950vc5 interfaceC1748950vc5) {
        Intent intent = new Intent(activity, (Class<?>) MusCountryListActivity.class);
        MusCountryListActivity.LLJILJILJ = interfaceC1748950vc5;
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_LoginService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public void showFTCCreateAccountView(Activity activity, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("next_page", EnumC852910Xd3.FTC_CREATE_ACCOUNT.getValue());
        if (z) {
            bundle.putBoolean("show_consent", true);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//account/ftc");
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.open();
    }

    private void do3RDPlatformLogin(C19EG c19eg, Bundle bundle, String str) {
        bundle.putInt("current_scene", EnumC852660Xce.HISTORY_LOGIN.getValue());
        loginByMethodName(c19eg, bundle, LoginMethodName.THIRD_PARTY, str, null);
    }

    private void doUserNamePassLoginWithUserName(C19EG c19eg, Bundle bundle, String str) {
        int value = EnumC852910Xd3.EMAIL_OTP_LOGIN_SWITCH_TO_PASSWORD.getValue();
        bundle.putInt("current_scene", EnumC852660Xce.HISTORY_LOGIN.getValue());
        C786410Ut5.LJJIZ(bundle, "auto_fill_account_name", str);
        bundle.putInt("next_page", value);
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILLIIL(bundle, str);
        loginByMethodName(c19eg, bundle, LoginMethodName.EMAIL_PASS, "", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getAvailableWaysAndLogin$6(C19EG c19eg, Bundle bundle, String str) {
        do3RDPlatformLogin(c19eg, bundle, str);
        return Unit.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showLoginAndRegisterViewInner$1(DialogC1389620mGW dialogC1389620mGW, C0XQT c0xqt, String str) {
        C0FNV.LIZ(dialogC1389620mGW);
        goToLoginOrSignup(c0xqt, str);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.ILoginService
    public void switchAccount(SignificantUserInfo significantUserInfo, Bundle bundle, InterfaceC849490XUd interfaceC849490XUd) {
        boolean zLJI = MethodIDManager.LJI(196714);
        C0XUU.LJ(significantUserInfo, bundle, false, false, interfaceC849490XUd);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    private boolean checkAndGetAvailableWaysLogin(C19EG c19eg, Bundle bundle, BaseLoginMethod baseLoginMethod, Function1<UiRefreshEventType, Unit> function1) {
        if (C0XUK.LIZ()) {
            getAvailableWaysAndLogin(c19eg, bundle, baseLoginMethod, function1);
            return true;
        }
        return false;
    }

    private void getAvailableWaysAndLogin(final C19EG c19eg, final Bundle bundle, final BaseLoginMethod baseLoginMethod, Function1<UiRefreshEventType, Unit> function1) {
        GetAvailableWaysKt.getAvailableWaysAndLogin(c19eg, bundle, baseLoginMethod, new InterfaceC1631620sYq() { // from class: X.0Xci
            @Override // X.InterfaceC1631620sYq
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return this.LL.lambda$getAvailableWaysAndLogin$3(bundle, baseLoginMethod, c19eg, (String) obj, (String) obj2, (LoginMethodName) obj3);
            }
        }, new InterfaceC1631630sYr() { // from class: X.0Xch
            @Override // X.InterfaceC1631630sYr
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.LL.lambda$getAvailableWaysAndLogin$4(bundle, baseLoginMethod, c19eg, (String) obj, (String) obj2, (LoginMethodName) obj3, (AvailableWaysUserData) obj4);
            }
        }, new Function2() { // from class: X.0Xcm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return this.LL.lambda$getAvailableWaysAndLogin$5(c19eg, bundle, (String) obj, (String) obj2);
            }
        }, new Function1() { // from class: X.0Xco
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.LL.lambda$getAvailableWaysAndLogin$6(c19eg, bundle, (String) obj);
            }
        }, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getAvailableWaysAndLogin$5(C19EG c19eg, Bundle bundle, String str, String str2) {
        doUserNamePassLoginWithUserName(c19eg, bundle, str2);
        return Unit.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loginByMethodForHistoryLogin$2(C19EG c19eg, Bundle bundle, BaseLoginMethod baseLoginMethod, Function1 function1) {
        C1C7U.LIZ("LoginService@20ae.loginByMethodForHistoryLogin$1L");
        checkAndGetAvailableWaysLogin(c19eg, bundle, baseLoginMethod, function1);
        C1C7U.LIZIZ("LoginService@20ae.loginByMethodForHistoryLogin$1L");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loginByMethodForHistoryLogin(final X.C19EG r13, final android.os.Bundle r14, final com.ss.android.ugc.aweme.account.model.BaseLoginMethod r15, final kotlin.jvm.functions.Function1<com.ss.android.ugc.aweme.services.UiRefreshEventType, kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.LoginService.loginByMethodForHistoryLogin(X.19EG, android.os.Bundle, com.ss.android.ugc.aweme.account.model.BaseLoginMethod, kotlin.jvm.functions.Function1):void");
    }

    private void doPhoneSMSLoginWithPassportTicket(C19EG c19eg, Bundle bundle, String str, String str2, LoginMethodName loginMethodName) {
        if (str.isEmpty()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("GetAvailableWays", "fallBackPhoneSMSLogin");
            fallBackPhoneSMSLogin(bundle);
        } else {
            bundle.putInt("next_page", EnumC852910Xd3.PHONE_SMS_LOGIN.getValue());
            bundle.putInt("current_scene", EnumC852660Xce.HISTORY_LOGIN_WITH_PASSPORT_TICKET.getValue());
            C786410Ut5.LJJJI("args_string_phone_number", str2, bundle);
            C786410Ut5.LJJJI("passport_ticket", str, bundle);
            bundle.putBoolean("user_cross_activity_timer", true);
            bundle.putBoolean("code_sent", false);
            bundle.putBoolean("use_last_ttp_context", true);
        }
        loginByMethodName(c19eg, bundle, loginMethodName, "", null);
    }

    private void loginByMethodName(Activity activity, Bundle bundle, LoginMethodName loginMethodName, String str, final Runnable runnable) {
        C05X2 c05x2;
        String str2;
        String string = bundle.getString("enter_type");
        if (string == null || TextUtils.isEmpty(string)) {
            string = "click_login";
        }
        int i = AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$model$LoginMethodName[loginMethodName.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4 && i != 5) {
                    if (i != 7) {
                        return;
                    }
                    ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi(ICredentialManagerService.class);
                    if (iCredentialManagerService == null) {
                        downgradeToNormalLogin(runnable);
                        return;
                    }
                    if (!iCredentialManagerService.LJIILL()) {
                        downgradeToNormalLogin(runnable);
                        return;
                    }
                    if (iCredentialManagerService.LJIIJ()) {
                        c05x2 = C05X2.PASSKEY_AND_GOOGLE_ONETAP;
                    } else {
                        c05x2 = C05X2.PASSKEY;
                    }
                    String string2 = bundle.getString("enter_from", "");
                    String string3 = bundle.getString("enter_method", "");
                    if (iCredentialManagerService.LJIIJ()) {
                        str2 = "passkey_google_onetap";
                    } else {
                        str2 = "passkey_login";
                    }
                    iCredentialManagerService.LJIL(activity, c05x2, new C1BV9(string2, string3, string, str2, "", bundle), new InterfaceC1699660uKa() { // from class: X.0Xck
                        @Override // X.InterfaceC1699660uKa
                        public final void onFailure(Throwable th) {
                            LoginService.lambda$loginByMethodName$7(runnable, th);
                        }
                    });
                    return;
                }
                SmartRoute smartRouteLIZ = C852680Xcg.LIZ(activity);
                smartRouteLIZ.withParam("child_page", EnumC852910Xd3.INPUT_EMAIL_LOGIN.getValue());
                C786410Ut5.LJJJI("enter_type", string, bundle);
                smartRouteLIZ.withParam(bundle);
                smartRouteLIZ.open();
                return;
            }
            SmartRoute smartRouteLIZ2 = C852680Xcg.LIZ(activity);
            smartRouteLIZ2.withParam("child_page", EnumC852910Xd3.INPUT_PHONE_LOGIN.getValue());
            C786410Ut5.LJJJI("enter_type", string, bundle);
            smartRouteLIZ2.withParam(bundle);
            smartRouteLIZ2.open();
            return;
        }
        if (str.isEmpty()) {
            return;
        }
        if (ThirdPartyDeprecationExperiment5.LJFF(str)) {
            startFailed3pDeprecation(str, activity);
            return;
        }
        if ("google_onetap".equals(str)) {
            ICredentialManagerService iCredentialManagerService2 = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi(ICredentialManagerService.class);
            if (iCredentialManagerService2 != null) {
                iCredentialManagerService2.LJIL(activity, C05X2.GOOGLE_ONETAP, new C1BV9(bundle.getString("enter_from", ""), bundle.getString("enter_method", ""), string, "google_onetap", "", bundle), null);
                return;
            }
            return;
        }
        C1238110iK9 c1238110iK9 = C1238110iK9.LIZ;
        C1BV9 c1bv9 = new C1BV9(bundle.getString("enter_from", ""), bundle.getString("enter_method", ""), string, bundle.getString("login_panel_type", "login"), "", bundle);
        c1238110iK9.getClass();
        Intent intentLIZ = C1238110iK9.LIZ(activity, false, str, c1bv9);
        if (intentLIZ == null) {
            return;
        }
        C0TT5.LIZIZ(activity, intentLIZ, str);
    }

    private void doEmailPassLoginWithPassportTicket(C19EG c19eg, Bundle bundle, String str, String str2, LoginMethodName loginMethodName, AvailableWaysUserData availableWaysUserData) {
        if (str.isEmpty()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("GetAvailableWays", "fallbackFromEmailLogin");
            fallbackFromEmailLogin(bundle);
        } else {
            bundle.putInt("current_scene", EnumC852660Xce.HISTORY_LOGIN_WITH_PASSPORT_TICKET.getValue());
            C786410Ut5.LJJJI("passport_ticket", str, bundle);
            if (C0XZ2.LIZIZ(str2)) {
                bundle.putInt("next_page", EnumC852910Xd3.EMAIL_LINK_LOGIN_OR_SIGNUP.getValue());
            } else {
                bundle.putInt("next_page", EnumC852910Xd3.EMAIL_OTP_LOGIN.getValue());
            }
            bundle.putBoolean("user_cross_activity_timer", true);
            bundle.putBoolean("use_last_ttp_context", true);
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIILLIIL(bundle, str2);
            bundle.putBoolean("code_sent", false);
            if (C293990Bfh.LIZ() && availableWaysUserData != null) {
                Keva keva = AvailableWaysViewModel.LLILLL;
                Boolean bool = availableWaysUserData.has_mobile;
                Boolean bool2 = Boolean.TRUE;
                AvailableWaysViewModel.AvailableWays availableWays = new AvailableWaysViewModel.AvailableWays(Intrinsics.LJFF(bool, bool2), availableWaysUserData.mobile, Intrinsics.LJFF(availableWaysUserData.has_pwd, bool2), true);
                Keva keva2 = AvailableWaysViewModel.LLILLL;
                C1227904rF.LIZ.getClass();
                keva2.storeString(str2, C1227904rF.LJI(availableWays));
            }
        }
        loginByMethodName(c19eg, bundle, loginMethodName, "", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getAvailableWaysAndLogin$3(Bundle bundle, BaseLoginMethod baseLoginMethod, C19EG c19eg, String str, String str2, LoginMethodName loginMethodName) {
        appendSectionOption(bundle, baseLoginMethod);
        doPhoneSMSLoginWithPassportTicket(c19eg, bundle, str, str2, loginMethodName);
        return Unit.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showLoginAndRegisterViewInner$0(DialogC1389620mGW dialogC1389620mGW, IOneClickLoginService iOneClickLoginService, C0XQT c0xqt, String str, String str2, List list) {
        C0FNV.LIZ(dialogC1389620mGW);
        if (iOneClickLoginService.LJIIJ(C0XWE.THE_ONE)) {
            if (str == null) {
                str = "oneclick_login";
            }
            goToLoginOrSignup(c0xqt, str);
            return null;
        }
        goToLoginOrSignup(c0xqt, str2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getAvailableWaysAndLogin$4(Bundle bundle, BaseLoginMethod baseLoginMethod, C19EG c19eg, String str, String str2, LoginMethodName loginMethodName, AvailableWaysUserData availableWaysUserData) {
        appendSectionOptionAndApproach(bundle, baseLoginMethod);
        doEmailPassLoginWithPassportTicket(c19eg, bundle, str, str2, loginMethodName, availableWaysUserData);
        return Unit.LIZ;
    }
}
