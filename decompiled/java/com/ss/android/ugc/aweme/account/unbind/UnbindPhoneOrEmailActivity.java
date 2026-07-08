package com.ss.android.ugc.aweme.account.unbind;

import X.AbstractActivityC1237560iJG;
import X.AbstractC854370XfP;
import X.AbstractC857580Xka;
import X.C0XPY;
import X.C0XQ5;
import X.C0XUE;
import X.C1076010e6h;
import X.C1233040iBy;
import X.C1308910kAL;
import X.C13LP;
import X.C1440005kM;
import X.C1697810uHb;
import X.C257240A6g;
import X.C299020Bno;
import X.C335910DEv;
import X.C852970Xd9;
import X.C853670XeH;
import X.C854270XfF;
import X.C854460XfY;
import X.EnumC335920DEw;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC586170Myt;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.unbind.UnbindConfirmFragment;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class UnbindPhoneOrEmailActivity extends AbstractActivityC1237560iJG {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSPCExISsoZxo9KiwiLR87JyspBj0WJSQlJQ4wPCw6IDsq";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.AbstractActivityC1237560iJG
    public final void LLLLZLLIL(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        C852970Xd9 c852970Xd9 = EnumC852910Xd3.Companion;
        int i = bundle2.getInt("next_page", EnumC852910Xd3.UNBIND_PHONE_CONFIRM.getValue());
        c852970Xd9.getClass();
        EnumC852910Xd3 enumC852910Xd3LIZ = C852970Xd9.LIZ(i);
        bundle2.remove("next_page");
        bundle2.putInt("current_page", enumC852910Xd3LIZ.getValue());
        C853670XeH.LIZ.getClass();
        AbstractActivityC1237560iJG.LLLZ(this, C853670XeH.LIZ(enumC852910Xd3LIZ), bundle2);
    }

    @Override // X.AbstractActivityC1237560iJG
    public final void LLLLZLLLI(Bundle bundle) {
        boolean z;
        Integer numValueOf;
        String string;
        if (bundle != null) {
            z = bundle.getBoolean("unbind_success");
        } else {
            z = false;
        }
        if (bundle != null) {
            numValueOf = Integer.valueOf(bundle.getInt("unbind_type"));
        } else {
            numValueOf = null;
        }
        if (z) {
            int value = EnumC852660Xce.UNBIND_PHONE.getValue();
            if (numValueOf != null && numValueOf.intValue() == value) {
                C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
                c1076010e6h.LJIIJ().LJFF(false);
                c1076010e6h.LJII().LJFF(false);
            }
            int value2 = EnumC852660Xce.UNBIND_PHONE.getValue();
            if (numValueOf != null && numValueOf.intValue() == value2) {
                string = getString(2131839768);
            } else {
                int value3 = EnumC852660Xce.UNBIND_EMAIL.getValue();
                if (numValueOf != null && numValueOf.intValue() == value3) {
                    string = getString(2131833859);
                } else {
                    string = "";
                }
            }
        } else {
            string = getString(2131857858);
        }
        if (!TextUtils.isEmpty(string)) {
            List<InterfaceC586170Myt> list = C0XQ5.LIZ;
            C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
            c1233040iBy.LIZJ(string);
            c1233040iBy.LIZLLL();
        }
        if (z) {
            C1440005kM.LIZ(new C854270XfF());
            String strLIZLLL = C0XQ5.LIZLLL();
            int value4 = EnumC852660Xce.UNBIND_PHONE.getValue();
            if (numValueOf != null && numValueOf.intValue() == value4) {
                C0XUE c0xue = C0XUE.LIZ;
                if (C13LP.LJJJLL(c0xue.LJ(strLIZLLL)) instanceof PhoneLoginMethod) {
                    c0xue.LJIIIIZZ(strLIZLLL, true);
                }
                GSMAService gSMAService = GSMAService.INSTANCE;
                if (Intrinsics.LJFF(gSMAService.getGSMALocalCache(null, null).uid, strLIZLLL)) {
                    gSMAService.removeGSMALocalCache();
                }
            } else {
                int value5 = EnumC852660Xce.UNBIND_EMAIL.getValue();
                if (numValueOf != null && numValueOf.intValue() == value5) {
                    C0XUE c0xue2 = C0XUE.LIZ;
                    if (C13LP.LJJJLL(c0xue2.LJ(strLIZLLL)) instanceof AccountPassLoginMethod) {
                        c0xue2.LJIIIIZZ(strLIZLLL, true);
                    }
                }
            }
        }
        finish();
    }

    @Override // X.AbstractActivityC1237560iJG, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle == null) {
            MediatorLiveData<Bundle> mediatorLiveData = ((ActionResultModel) ViewModelProviders.of(this).get(ActionResultModel.class)).LL;
            try {
                extras = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            mediatorLiveData.postValue(extras);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public static final void LLLZLZ(Context context, ArrayList<String> arrayList, String str, Boolean bool, Bundle bundle) {
        Serializable serializable;
        if (C257240A6g.LIZIZ) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                serializable = new AbstractC854370XfP() { // from class: X.0Xf8
                    public static final int $stable = 0;

                    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                    public String getFirstStepId() {
                        return "safe_env_unbind_phone";
                    }

                    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                    public HashMap<String, HashMap<String, String>> getFlowGraph() {
                        return new HashMap<>();
                    }
                };
            } else {
                C854460XfY.LIZ.getClass();
                final List listLIZLLL = C854460XfY.LIZLLL(bundle);
                serializable = new AbstractC857580Xka(listLIZLLL) { // from class: X.0XfM
                    public static final int $stable = 8;
                    public final List<VerificationMethodType> LL;

                    @Override // X.AbstractC857580Xka, X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                    public String getFirstStepId() {
                        return "unsafe_env_unbind_phone";
                    }

                    @Override // X.AbstractC857580Xka, X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                    public HashMap<String, HashMap<String, String>> getFlowGraph() {
                        return C2097608Jq.LJI(new Pair(getFirstStepId(), C2097608Jq.LJI(new Pair(UnbindConfirmFragment.UnbindConfirmActions.ClickContinueAction.class.getSimpleName(), getInitialVerificationStepId()))), new Pair("verify_email_for_unbind_phone", C2097608Jq.LJI(new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction.class.getSimpleName(), "verify_phone_for_unbind_phone"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction.class.getSimpleName(), "verify_password_for_unbind_phone"))), new Pair("verify_phone_for_unbind_phone", C2097608Jq.LJI(new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction.class.getSimpleName(), "verify_email_for_unbind_phone"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction.class.getSimpleName(), "verify_password_for_unbind_phone"))), new Pair("verify_password_for_unbind_phone", C2097608Jq.LJI(new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction.class.getSimpleName(), "verify_phone_for_unbind_phone"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction.class.getSimpleName(), "verify_email_for_unbind_phone"))));
                    }

                    @Override // X.AbstractC857580Xka
                    public String getInitialVerificationStepId() {
                        if (getVerifyMethods().contains(VerificationMethodType.MOBILE)) {
                            return "verify_phone_for_unbind_phone";
                        }
                        VerificationMethodType verificationMethodType = (VerificationMethodType) C13LP.LJJJLL(getVerifyMethods());
                        if (verificationMethodType == null) {
                            return "";
                        }
                        int i = C1235360iFi.LIZ[verificationMethodType.ordinal()];
                        return i != 1 ? i != 2 ? i == 3 ? "verify_password_for_unbind_phone" : "" : "verify_phone_for_unbind_phone" : "verify_email_for_unbind_phone";
                    }

                    @Override // X.AbstractC857580Xka
                    public List<VerificationMethodType> getVerifyMethods() {
                        return this.LL;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LL = listLIZLLL;
                    }
                };
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//account/phone_or_email/unbind");
            smartRouteBuildRoute.withParam("flow", serializable);
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.UNBIND_PHONE.getValue());
            smartRouteBuildRoute.withParam("extra_eligible_login_methods", arrayList);
            smartRouteBuildRoute.withParam("is_safe_env", bool);
            smartRouteBuildRoute.withParam("page", "remove_phone");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
            return;
        }
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//account/phone_or_email/unbind");
        smartRouteBuildRoute2.withParam("enter_from", str);
        smartRouteBuildRoute2.withParam("current_scene", EnumC852660Xce.UNBIND_PHONE.getValue());
        smartRouteBuildRoute2.withParam("next_page", EnumC852910Xd3.UNBIND_PHONE_CONFIRM.getValue());
        smartRouteBuildRoute2.withParam("extra_eligible_login_methods", arrayList);
        smartRouteBuildRoute2.withParam("is_safe_env", bool);
        smartRouteBuildRoute2.withParam("page", "remove_phone");
        smartRouteBuildRoute2.withParam(bundle);
        smartRouteBuildRoute2.open();
    }

    public static final void LLLZIL(Context context, boolean z, ArrayList<String> arrayList, String str, Boolean bool, Bundle bundle) {
        Serializable serializable;
        if (C257240A6g.LIZIZ) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                serializable = new AbstractC854370XfP() { // from class: X.0Xf7
                    public static final int $stable = 0;

                    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                    public String getFirstStepId() {
                        return "safe_env_unbind_email";
                    }

                    @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                    public HashMap<String, HashMap<String, String>> getFlowGraph() {
                        return new HashMap<>();
                    }
                };
            } else {
                C854460XfY.LIZ.getClass();
                final List listLIZLLL = C854460XfY.LIZLLL(bundle);
                serializable = new AbstractC857580Xka(listLIZLLL) { // from class: X.0XfL
                    public static final int $stable = 8;
                    public final List<VerificationMethodType> LL;

                    @Override // X.AbstractC857580Xka, X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                    public String getFirstStepId() {
                        return "unsafe_env_unbind_email";
                    }

                    @Override // X.AbstractC857580Xka, X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                    public HashMap<String, HashMap<String, String>> getFlowGraph() {
                        return C2097608Jq.LJI(new Pair(getFirstStepId(), C2097608Jq.LJI(new Pair(UnbindConfirmFragment.UnbindConfirmActions.ClickContinueAction.class.getSimpleName(), getInitialVerificationStepId()))), new Pair("verify_email_for_unbind_email", C2097608Jq.LJI(new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction.class.getSimpleName(), "verify_phone_for_unbind_email"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction.class.getSimpleName(), "verify_password_for_unbind_email"))), new Pair("verify_phone_for_unbind_email", C2097608Jq.LJI(new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction.class.getSimpleName(), "verify_email_for_unbind_email"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction.class.getSimpleName(), "verify_password_for_unbind_email"))), new Pair("verify_password_for_unbind_email", C2097608Jq.LJI(new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction.class.getSimpleName(), "verify_phone_for_unbind_email"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction.class.getSimpleName(), "verify_email_for_unbind_email"))));
                    }

                    @Override // X.AbstractC857580Xka
                    public String getInitialVerificationStepId() {
                        if (getVerifyMethods().contains(VerificationMethodType.EMAIL)) {
                            return "verify_email_for_unbind_email";
                        }
                        VerificationMethodType verificationMethodType = (VerificationMethodType) C13LP.LJJJLL(getVerifyMethods());
                        if (verificationMethodType == null) {
                            return "";
                        }
                        int i = C1235350iFh.LIZ[verificationMethodType.ordinal()];
                        return i != 1 ? i != 2 ? i == 3 ? "verify_password_for_unbind_email" : "" : "verify_phone_for_unbind_email" : "verify_email_for_unbind_email";
                    }

                    @Override // X.AbstractC857580Xka
                    public List<VerificationMethodType> getVerifyMethods() {
                        return this.LL;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LL = listLIZLLL;
                    }
                };
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//account/phone_or_email/unbind");
            smartRouteBuildRoute.withParam("flow", serializable);
            smartRouteBuildRoute.withParam("enter_from", str);
            smartRouteBuildRoute.withParam("current_scene", EnumC852660Xce.UNBIND_EMAIL.getValue());
            smartRouteBuildRoute.withParam("is_email_verified", z);
            smartRouteBuildRoute.withParam("extra_eligible_login_methods", arrayList);
            smartRouteBuildRoute.withParam("is_safe_env", bool);
            smartRouteBuildRoute.withParam("page", "remove_email");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
            return;
        }
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//account/phone_or_email/unbind");
        smartRouteBuildRoute2.withParam("enter_from", str);
        smartRouteBuildRoute2.withParam("current_scene", EnumC852660Xce.UNBIND_EMAIL.getValue());
        smartRouteBuildRoute2.withParam("next_page", EnumC852910Xd3.UNBIND_EMAIL_CONFIRM.getValue());
        smartRouteBuildRoute2.withParam("is_email_verified", z);
        smartRouteBuildRoute2.withParam("extra_eligible_login_methods", arrayList);
        smartRouteBuildRoute2.withParam("is_safe_env", bool);
        smartRouteBuildRoute2.withParam("page", "remove_email");
        smartRouteBuildRoute2.withParam(bundle);
        smartRouteBuildRoute2.open();
    }
}
