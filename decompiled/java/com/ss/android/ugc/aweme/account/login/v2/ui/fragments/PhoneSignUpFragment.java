package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0C64;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XWJ;
import X.C0XZ4;
import X.C10S5;
import X.C1232150iAX;
import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237220iIi;
import X.C1238150iKD;
import X.C1238240iKM;
import X.C1238820iLI;
import X.C1266330j3f;
import X.C12ES;
import X.C1308910kAL;
import X.C19252910Tv;
import X.C19293810e0;
import X.C197039127h;
import X.C19EG;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C832080WkY;
import X.C834200Wny;
import X.C851350XaX;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851590Xav;
import X.C851660Xb2;
import X.C851910XbR;
import X.C852810Xct;
import X.C853660XeG;
import X.C853720XeM;
import X.C853750XeP;
import X.DialogC1389620mGW;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1238810iLH;
import X.InterfaceC1246800iYA;
import X.InterfaceC851550Xar;
import Y.ACListenerS122S0200000_19;
import Y.AfS188S0100000_19;
import Y.AfS33S0210000_13;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAExperiment;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AlternativeNetworkService;
import com.ss.android.ugc.aweme.services.GSMAService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes20.dex */
public final class PhoneSignUpFragment extends BaseI18nLoginFragment implements C10S5, InterfaceC1238810iLH, InterfaceC851550Xar {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiP319PSxiLz0yLygpJzsgZhUkJiE2GywrJxojDjctLiI2JjE=";
    public C1238240iKM LLLIILIL;
    public View LLLIL;
    public ConstraintLayout LLLILZ;
    public DialogC1389620mGW LLLILZJ;
    public boolean LLLJL;
    public final long LLLILZLLLI = System.currentTimeMillis();
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 311));
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 312));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 309));
    public final String LLLL = "phone";

    static {
        new C851350XaX();
    }

    public final void QS() {
        C1237220iIi c1237220iIi;
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("from_sms_login_only", false);
            arguments.putBoolean("need_show_gsma_text", false);
            arguments.putBoolean("is_gsma", false);
        }
        C1238240iKM c1238240iKMNS = NS();
        if (c1238240iKMNS != null) {
            String fullPhoneNumber = c1238240iKMNS.getFullPhoneNumber();
            PhoneNumberUtil.PhoneNumber phoneNumberObject = c1238240iKMNS.getPhoneNumberObject();
            if (fullPhoneNumber != null) {
                C19EG activity = getActivity();
                EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
                C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(activity, fullPhoneNumber, enumC852660Xce);
                if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
                    PS("", false, null);
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (SMSPermissionCheckboxExp.INSTANCE.showCheckbox()) {
                    linkedHashMap.put("query_sms_permission", "1");
                }
                C0XZ4 c0xz4 = C0XZ4.LIZ;
                String strLIZ = PhoneNumberUtil.LIZ(phoneNumberObject);
                EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_SIGN_UP;
                c0xz4.getClass();
                C0XZ4.LJJIIZ(this, this, strLIZ, enumC852660Xce, enumC852910Xd3, "", "user_click", linkedHashMap).LJIIIIZZ(new AfS188S0100000_19(this, 18)).LJIILL();
            }
        }
    }

    @Override // X.C10S5
    public final String pO() {
        return "PhoneEmailSignUpStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0n;
    }

    public final C1238240iKM NS() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qb1) : null;
            this.LLLIILIL = (C1238240iKM) viewFindViewById;
        }
        return (C1238240iKM) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, true, new C1237030iIP(null, C1236870iI9.LIZ(true), C1236870iI9.LIZIZ(true), null, 9), false, null, null, null, null, 66551807);
        if (AccountGSMAPhase2Experiment.LIZIZ()) {
            c1237010iIN.LJIJI = new C1237030iIP(getString(2131824507), null, null, null, 14);
        }
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final List<View> qS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qav) : null;
            this.LLLILZ = (ConstraintLayout) viewFindViewById;
        }
        return Collections.singletonList(viewFindViewById);
    }

    @Override // X.InterfaceC1238810iLH
    public final void BM() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("gsma_available", false);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        C19EG activity;
        C197039127h c197039127h;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("from_sms_login_only") && !AccountGSMAPhase2Experiment.LIZJ()) {
            C1238820iLI.LIZIZ(this);
            return;
        }
        C197039127h c197039127hNS = nS();
        if (c197039127hNS != null) {
            c197039127hNS.setLoading(true);
            if (AccountGSMAPhase2Experiment.LIZJ()) {
                c197039127hNS.setEnabled(false);
            }
        }
        if (!AccountGSMAPhase2Experiment.LIZIZ() || (activity = getActivity()) == null || (c197039127h = (C197039127h) activity.findViewById(R.id.fal)) == null) {
            return;
        }
        c197039127h.setLoading(true);
        c197039127h.setEnabled(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        C19EG activity;
        C197039127h c197039127h;
        EditText editText;
        EditText editText2;
        C1238820iLI.LIZ(this);
        C197039127h c197039127hNS = nS();
        if (c197039127hNS != null) {
            c197039127hNS.setLoading(false);
            if (AccountGSMAPhase2Experiment.LIZJ()) {
                C1238240iKM c1238240iKMNS = NS();
                c197039127hNS.setEnabled((c1238240iKMNS == null || (editText2 = c1238240iKMNS.getEditText()) == null || C1232150iAX.LIZJ(editText2)) ? false : true);
            }
        }
        if (!AccountGSMAPhase2Experiment.LIZIZ() || (activity = getActivity()) == null || (c197039127h = (C197039127h) activity.findViewById(R.id.fal)) == null) {
            return;
        }
        c197039127h.setLoading(false);
        C1238240iKM c1238240iKMNS2 = NS();
        c197039127h.setEnabled((c1238240iKMNS2 == null || (editText = c1238240iKMNS2.getEditText()) == null || C1232150iAX.LIZJ(editText)) ? false : true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
    }

    @Override // X.InterfaceC1238810iLH
    public final void ha() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("gsma_available", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AccountGSMAExperiment.LIZ.getClass();
        if (AccountGSMAExperiment.LIZIZ() || AccountGSMAPhase2Experiment.LIZJ()) {
            GSMAService.INSTANCE.cancelJob();
        }
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        EditText editText;
        EditText editText2;
        super.onStart();
        C1238240iKM c1238240iKMNS = NS();
        if (c1238240iKMNS == null) {
            c1238240iKMNS = null;
        }
        C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
        if (C853750XeP.LIZ()) {
            if (c1238240iKMNS == null || (editText2 = c1238240iKMNS.getEditText()) == null) {
                return;
            }
            C1232150iAX.LIZ(editText2);
            return;
        }
        if (c1238240iKMNS == null || (editText = c1238240iKMNS.getEditText()) == null) {
            return;
        }
        editText.requestFocus();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!C1238150iKD.LIZ()) {
            ((C832080WkY) this.LLLIZZ.getValue()).LIZLLL();
        }
        this.LLLJL = false;
    }

    @Override // X.InterfaceC1238810iLH
    public final void CQ() {
        C1238820iLI.LIZIZ(this);
    }

    @Override // X.InterfaceC1238810iLH
    public final DialogC1389620mGW Jz() {
        return this.LLLILZJ;
    }

    @Override // X.InterfaceC1238810iLH
    public final void WP() {
        C1238820iLI.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLL;
    }

    @Override // X.InterfaceC1238810iLH
    public final void kD(String str) {
        C19EG activity;
        Bundle arguments = getArguments();
        if (arguments != null) {
            C786410Ut5.LJJJI("gsma_fail_reason", str, arguments);
        }
        aS();
        if (AccountGSMAPhase2Experiment.LIZJ() && !Intrinsics.LJFF(str, "quit") && (activity = getActivity()) != null) {
            GSMAService.INSTANCE.showGSMAFailureToast(activity);
        }
        QS();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C1238150iKD.LIZ()) {
            ((C832080WkY) this.LLLIZZ.getValue()).LIZJ();
        }
    }

    @Override // X.InterfaceC1238810iLH
    public final void rC(DialogC1389620mGW dialogC1389620mGW) {
        this.LLLILZJ = dialogC1389620mGW;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/PhoneSignUpFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqAAj+xHbfIjuyQkDtsZMCHCGuLuc=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z && this.LLLF != null) {
            C0XWJ c0xwj = C0XWJ.LIZ;
            String strPR = PR();
            String str = this.LLLL;
            c0xwj.getClass();
            C0XWJ.LJIILJJIL(strPR, str);
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(PhoneSignUpFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText;
        int iIntValue;
        Integer numLIZJ;
        EditText editText2;
        C1238240iKM c1238240iKMNS;
        super.onViewCreated(view, bundle);
        final C197039127h c197039127h = (C197039127h) view.findViewById(R.id.fak);
        final C197039127h c197039127h2 = (C197039127h) view.findViewById(R.id.fal);
        C853660XeG.LIZ(C853660XeG.LIZ, getEnterMethod(), getEnterFrom(), PR(), null, null, null, null, 120);
        C1238240iKM c1238240iKMNS2 = NS();
        if (c1238240iKMNS2 != null) {
            c1238240iKMNS2.setOnCountryCodeChanged(new AwS563S0100000_19(this, 310));
        }
        if (((Boolean) this.LLLJIL.getValue()).booleanValue() && (c1238240iKMNS = NS()) != null) {
            C426750GoL.LJIIIZ(c1238240iKMNS, null, Integer.valueOf((int) C12ES.LIZJ(12.0f, getContext())), null, null, false, 29);
        }
        C1238240iKM c1238240iKMNS3 = NS();
        if (c1238240iKMNS3 != null && (editText2 = c1238240iKMNS3.getEditText()) != null) {
            editText2.addTextChangedListener(new C853720XeM() { // from class: X.0iKC
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    C197039127h c197039127h3;
                    String string;
                    boolean z;
                    String string2;
                    C1238240iKM c1238240iKMNS4 = this.LL.NS();
                    if (c1238240iKMNS4 != null) {
                        c1238240iKMNS4.LIZ();
                    }
                    C197039127h c197039127h4 = c197039127h;
                    boolean z2 = false;
                    if (c197039127h4 != null) {
                        if (editable != null && (string2 = editable.toString()) != null && string2.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c197039127h4.setEnabled(z);
                    }
                    if (AccountGSMAPhase2Experiment.LIZIZ() && (c197039127h3 = c197039127h2) != null) {
                        if (editable != null && (string = editable.toString()) != null && string.length() > 0) {
                            z2 = true;
                        }
                        c197039127h3.setEnabled(z2);
                    }
                    PhoneSignUpFragment phoneSignUpFragment = this.LL;
                    if (!phoneSignUpFragment.LLLJL) {
                        C853660XeG c853660XeG = C853660XeG.LIZ;
                        String enterMethod = phoneSignUpFragment.getEnterMethod();
                        String enterFrom = this.LL.getEnterFrom();
                        String strPR = this.LL.PR();
                        String strRR = this.LL.RR();
                        c853660XeG.getClass();
                        C853660XeG.LIZIZ(enterMethod, enterFrom, strPR, strRR, true);
                        this.LL.LLLJL = true;
                        AccountGSMAExperiment.LIZ.getClass();
                        if (AccountGSMAExperiment.LIZJ() || AccountGSMAPhase2Experiment.LIZJ()) {
                            AlternativeNetworkService.INSTANCE.preconnect(C1238990iLZ.LIZ);
                        }
                    }
                }
            });
        }
        C1238240iKM c1238240iKMNS4 = NS();
        if (c1238240iKMNS4 != null) {
            c1238240iKMNS4.LIZIZ();
        }
        C1238240iKM c1238240iKMNS5 = NS();
        if (c1238240iKMNS5 != null) {
            getEnterFrom();
            String strRR = RR();
            c1238240iKMNS5.LLILZIL = "signup";
            c1238240iKMNS5.LLILZLL = strRR;
        }
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            if (AccountGSMAPhase2Experiment.LIZJ()) {
                c197039127h.setText(getString(2131824511));
            }
        }
        if (AccountGSMAPhase2Experiment.LIZIZ()) {
            c197039127h2.setEnabled(false);
            Context context = c197039127h2.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c197039127h2.setBackgroundColor(iIntValue);
        }
        C851910XbR c851910XbR = C851910XbR.LIZ;
        View viewFindViewById = this.LLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.phl);
            } else {
                viewFindViewById = null;
            }
            this.LLLIL = viewFindViewById;
        }
        boolean zLIZIZ = ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZIZ();
        boolean zWS = wS();
        String strPR = PR();
        String str = this.LLLL;
        c851910XbR.getClass();
        this.LLLF = C851910XbR.LIZ(viewFindViewById, zLIZIZ, zWS, strPR, str, null, true);
        q0.LJIJ(c197039127h, new C1266330j3f(0));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.qau);
        if (tuxTextView != null) {
            int i = 1;
            if (AccountGSMAPhase2Experiment.LIZJ() && AccountGSMAPhase2Experiment.LIZ().learnMoreURL.length() > 0) {
                C19EG activity = getActivity();
                if (activity != null) {
                    GSMAService.INSTANCE.bindSignupLearnMoreForGSMA(activity, tuxTextView, AccountGSMAPhase2Experiment.LIZ().learnMoreURL);
                }
            } else {
                Context context2 = tuxTextView.getContext();
                if (AccountGSMAPhase2Experiment.LIZJ()) {
                    i = 10;
                }
                C19293810e0.LIZJ(context2, tuxTextView, Integer.valueOf(i), null);
            }
            q0.LJ(tuxTextView);
            tuxTextView.setTuxFont(81);
            tuxTextView.setTextColorRes(R.attr.a1k);
        }
        C1238240iKM c1238240iKMNS6 = NS();
        if (c1238240iKMNS6 == null) {
            c1238240iKMNS6 = null;
        }
        GS(new ACListenerS122S0200000_19(this, c1238240iKMNS6, 7), c197039127h);
        if (AccountGSMAPhase2Experiment.LIZIZ()) {
            GS(new ACListenerS122S0200000_19(this, c1238240iKMNS6, 8), c197039127h2);
        }
        C852810Xct.LIZ.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLJII = C852810Xct.LJII(getArguments());
        if (phoneNumberLJII != null) {
            C1238240iKM c1238240iKMNS7 = NS();
            if (c1238240iKMNS7 != null) {
                c1238240iKMNS7.setPhoneNumber(phoneNumberLJII.getNationalNumber());
            }
            C1238240iKM c1238240iKMNS8 = NS();
            if (c1238240iKMNS8 != null && (editText = c1238240iKMNS8.getEditText()) != null) {
                editText.setSelection(phoneNumberLJII.getNationalNumber().length());
            }
        }
        InterfaceC1246800iYA interfaceC1246800iYALIZIZ = C19252910Tv.LIZIZ.LIZLLL().LIZIZ();
        View view3 = this.LLLILZ;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.qav);
            }
            this.LLLILZ = (ConstraintLayout) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        interfaceC1246800iYALIZIZ.LIZLLL(view3);
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("from_sms_login_only")) {
            kD("auth_check_code_fail");
            return;
        }
        C1238240iKM c1238240iKMNS = NS();
        if (c1238240iKMNS != null) {
            c1238240iKMNS.LIZJ(str);
        }
        aS();
    }

    public final void PS(String str, boolean z, Boolean bool) {
        PhoneNumberUtil.PhoneNumber phoneNumberObject;
        C1238240iKM c1238240iKMNS = NS();
        if (c1238240iKMNS != null && (phoneNumberObject = c1238240iKMNS.getPhoneNumberObject()) != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIJ(this, phoneNumberObject);
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC852910Xd3.PHONE_SMS_SIGN_UP.getValue());
            arguments.putInt("current_page", EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue());
            arguments.putInt("current_scene", EnumC852660Xce.SIGN_UP.getValue());
            arguments.putBoolean("code_sent", z);
            JS(arguments);
            if (bool != null) {
                arguments.putBoolean("is_register", !bool.booleanValue());
            }
            if (!TextUtils.isEmpty(str)) {
                C786410Ut5.LJJJI("has_sms_permission", str, arguments);
            }
            fo(arguments);
        }
    }

    @Override // X.InterfaceC851550Xar
    public final void QK(EnumC852910Xd3 enumC852910Xd3, Bundle bundle, C851660Xb2 c851660Xb2) {
        C851590Xav.LIZ(enumC852910Xd3, bundle, c851660Xb2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!C1238150iKD.LIZ()) {
            ((C832080WkY) this.LLLIZZ.getValue()).LIZIZ(i, i2, intent);
        } else {
            if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "upgrade_phone_hint_helper_android", true) != 1) {
                return;
            }
            ((C834200Wny) this.LLLJ.getValue()).LIZIZ(i, i2, intent);
        }
    }

    @Override // X.InterfaceC1238810iLH
    public final void yq(String str, boolean z, Boolean bool) {
        PhoneNumberUtil.PhoneNumber phoneNumberObject;
        C1238240iKM c1238240iKMNS = NS();
        if (c1238240iKMNS != null && (phoneNumberObject = c1238240iKMNS.getPhoneNumberObject()) != null) {
            String strLIZ = PhoneNumberUtil.LIZ(phoneNumberObject);
            Bundle arguments = getArguments();
            if (arguments != null) {
                JS(arguments);
                arguments.putBoolean("from_sms_login_only", true);
                C786410Ut5.LJJIZ(arguments, "args_phone_number", phoneNumberObject);
                arguments.putInt("previous_page", EnumC852910Xd3.INPUT_PHONE_SIGN_UP.getValue());
                arguments.putInt("current_page", EnumC852910Xd3.PHONE_SMS_SIGN_UP.getValue());
                arguments.putBoolean("need_show_gsma_text", !z);
                arguments.putBoolean("is_gsma", true);
                arguments.remove("gsma_fail_reason");
            }
            C0XZ4 c0xz4 = C0XZ4.LIZ;
            boolean zLJFF = Intrinsics.LJFF(bool, Boolean.FALSE);
            EnumC852660Xce enumC852660Xce = EnumC852660Xce.SIGN_UP;
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_SIGN_UP;
            Map<String, String> gSMAExtraMap = GSMAService.INSTANCE.getGSMAExtraMap();
            c0xz4.getClass();
            C0XZ4.LJIJJ(this, this, strLIZ, str, zLJFF, enumC852660Xce, enumC852910Xd3, gSMAExtraMap, null).LJIIIIZZ(new AfS33S0210000_13(this, z, phoneNumberObject, 1)).LJIILL();
        }
    }
}
