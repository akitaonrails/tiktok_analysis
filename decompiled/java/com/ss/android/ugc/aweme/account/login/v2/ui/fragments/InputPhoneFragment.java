package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0DYO;
import X.C0TS1;
import X.C1232150iAX;
import X.C1233960iDS;
import X.C1238240iKM;
import X.C19293810e0;
import X.C19ME;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C452501pT;
import X.C616540OGe;
import X.C688120Qyw;
import X.C784500Uq0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C851430Xaf;
import X.C851940XbU;
import X.C852810Xct;
import X.C852960Xd8;
import X.C853560Xe6;
import X.C853570Xe7;
import X.C853600XeA;
import X.C853660XeG;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC20660615sy;
import X.InterfaceC853610XeB;
import X.InterfaceC853790XeT;
import Y.ACListenerS148S0100000_13;
import Y.ARunnableS113S0100000_13;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ClosePhoneBindingShowEvent;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.interceptor.ForcePhoneVerificationManager;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class InputPhoneFragment extends BaseI18nLoginFragment implements InterfaceC20660615sy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiP319PSxiLz0yLygpJzsgZgwiOTonGC0jJyoVOiQrJCo9PA==";
    public C1238240iKM LLLIILIL;
    public TuxTextView LLLIL;
    public TuxTextView LLLILZ;
    public String LLLILZJ = "";
    public String LLLILZLLLI = "";
    public boolean LLLIZZ;
    public boolean LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final String LLLLII;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0i;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final TuxTextView NS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dnx) : null;
            this.LLLIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView PS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fvg) : null;
            this.LLLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1238240iKM QS() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.qb1) : null;
            this.LLLIILIL = (C1238240iKM) viewFindViewById;
        }
        return (C1238240iKM) viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1237010iIN iS() {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment.iS():X.0iIN");
    }

    public InputPhoneFragment() {
        System.currentTimeMillis();
        this.LLLJIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(85));
        this.LLLJL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(84));
        this.LLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(86));
        this.LLLLII = "input_phone";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void ES() {
        String string;
        if (!zS()) {
            super.ES();
            return;
        }
        ClosePhoneBindingShowEvent closePhoneBindingShowEvent = new ClosePhoneBindingShowEvent();
        closePhoneBindingShowEvent.LJI(getEnterFrom(), "enter_from");
        closePhoneBindingShowEvent.LJI(getEnterMethod(), "enter_method");
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("page")) == null) {
            string = "";
        }
        closePhoneBindingShowEvent.LJI(string, "page");
        closePhoneBindingShowEvent.LJI("click_skip", "exit_method");
        closePhoneBindingShowEvent.LJI("binding_page", "exit_page");
        closePhoneBindingShowEvent.LJIIIIZZ();
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        arguments2.putInt("next_page", EnumC852910Xd3.OPTIONAL_SIGNUP_PAGES.getValue());
        arguments2.putInt("previous_page", VR().getValue());
        fo(arguments2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        nS().setLoading(true);
        QS().setValidationStatus(1);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        TuxTextView tuxTextViewMS;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (zS() && (tuxTextViewMS = mS()) != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextViewMS.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            marginLayoutParams.topMargin = ((Number) this.LLLJIL.getValue()).intValue();
            C786410Ut5.R6(tuxTextViewMS, marginLayoutParams);
        }
    }

    public final boolean US() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getInt("progress", -1) >= 0;
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        nS().setLoading(false);
        QS().setValidationStatus(0);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), this, null);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void ln() {
        View view;
        if (zS() && (view = getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS113S0100000_13(this, 88));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        String string;
        if (zS()) {
            return true;
        }
        if (SR() == EnumC852660Xce.BIND_PHONE) {
            C851430Xaf.LIZJ(getEnterFrom(), (String) this.LLILZLL.getValue(), getEnterMethod(), "mobile");
        }
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("show_skip", false) : false;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("page")) == null) {
            string = "";
        }
        boolean zLJFF = Intrinsics.LJFF(string, "twosv_setup");
        if (z && zLJFF) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = getEnterFrom();
            String enterMethod = getEnterMethod();
            c1233960iDS.getClass();
            C1233960iDS.LJIILL(enterFrom, enterMethod, "sms");
        }
        if (!US() || z) {
            if (VR() == EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE) {
                ForcePhoneVerificationManager.INSTANCE.conditionalBindLoginSuccessOrCancel();
            }
            super.onBackPressed();
            return false;
        }
        if (C784500Uq0.LIZJ(getActivity())) {
            return true;
        }
        super.onBackPressed();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(InputPhoneFragment.class.getName());
        }
        super.onResume();
        C1232150iAX.LIZIZ(QS().getEditText());
        System.currentTimeMillis();
    }

    public static abstract class InputPhoneActions implements InterfaceC853790XeT<InterfaceC853610XeB> {
        public static final int $stable = 8;
        public final InterfaceC853610XeB params;

        public abstract BaseAccountFlowFragment getFragment();

        public static final class ClickChangePhoneAction extends InputPhoneActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853560Xe6 params;

            public final ClickChangePhoneAction copy(C853560Xe6 c853560Xe6, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickChangePhoneAction(c853560Xe6, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickChangePhoneAction)) {
                    return false;
                }
                ClickChangePhoneAction clickChangePhoneAction = (ClickChangePhoneAction) obj;
                return Intrinsics.LJFF(this.params, clickChangePhoneAction.params) && Intrinsics.LJFF(this.fragment, clickChangePhoneAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickChangePhoneAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment.InputPhoneActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment.InputPhoneActions
            /* JADX INFO: renamed from: getParams, reason: merged with bridge method [inline-methods] */
            public C853560Xe6 mo154getParams() {
                return this.params;
            }

            public ClickChangePhoneAction(C853560Xe6 c853560Xe6, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853560Xe6);
                this.params = c853560Xe6;
                this.fragment = baseAccountFlowFragment;
            }
        }

        public static final class ClickChangeToEmailAction extends InputPhoneActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853600XeA params;

            public final ClickChangeToEmailAction copy(C853600XeA c853600XeA, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickChangeToEmailAction(c853600XeA, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickChangeToEmailAction)) {
                    return false;
                }
                ClickChangeToEmailAction clickChangeToEmailAction = (ClickChangeToEmailAction) obj;
                return Intrinsics.LJFF(this.params, clickChangeToEmailAction.params) && Intrinsics.LJFF(this.fragment, clickChangeToEmailAction.fragment);
            }

            public int hashCode() {
                return (hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickChangeToEmailAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment.InputPhoneActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment.InputPhoneActions
            /* JADX INFO: renamed from: getParams */
            public C853600XeA mo154getParams() {
                return this.params;
            }

            public ClickChangeToEmailAction(C853600XeA c853600XeA, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853600XeA);
                this.params = c853600XeA;
                this.fragment = baseAccountFlowFragment;
            }
        }

        public static final class ClickSendCodeAction extends InputPhoneActions {
            public static final int $stable = 8;
            public final BaseAccountFlowFragment fragment;
            public final C853570Xe7 params;

            public final ClickSendCodeAction copy(C853570Xe7 c853570Xe7, BaseAccountFlowFragment baseAccountFlowFragment) {
                return new ClickSendCodeAction(c853570Xe7, baseAccountFlowFragment);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClickSendCodeAction)) {
                    return false;
                }
                ClickSendCodeAction clickSendCodeAction = (ClickSendCodeAction) obj;
                return Intrinsics.LJFF(this.params, clickSendCodeAction.params) && Intrinsics.LJFF(this.fragment, clickSendCodeAction.fragment);
            }

            public int hashCode() {
                return (this.params.hashCode() * 31) + this.fragment.hashCode();
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ClickSendCodeAction(params=");
                sbLIZ.append(this.params);
                sbLIZ.append(", fragment=");
                sbLIZ.append(this.fragment);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment.InputPhoneActions
            public BaseAccountFlowFragment getFragment() {
                return this.fragment;
            }

            @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment.InputPhoneActions
            /* JADX INFO: renamed from: getParams */
            public C853570Xe7 mo154getParams() {
                return this.params;
            }

            public ClickSendCodeAction(C853570Xe7 c853570Xe7, BaseAccountFlowFragment baseAccountFlowFragment) {
                super(c853570Xe7);
                this.params = c853570Xe7;
                this.fragment = baseAccountFlowFragment;
            }
        }

        @Override // 
        /* JADX INFO: renamed from: getParams */
        public InterfaceC853610XeB mo154getParams() {
            return this.params;
        }

        public InputPhoneActions(InterfaceC853610XeB interfaceC853610XeB) {
            this.params = interfaceC853610XeB;
        }
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLLLII;
    }

    public final void RS(boolean z) {
        PhoneNumberUtil.PhoneNumber phoneNumberObject = QS().getPhoneNumberObject();
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIJ(this, phoneNumberObject);
        C852810Xct.LJIJI(getArguments(), PhoneNumberUtil.LIZ(phoneNumberObject));
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        Bundle bundle = new Bundle(arguments);
        bundle.putBoolean("code_sent", z);
        int i = C852960Xd8.LIZ[VR().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        bundle.putInt("next_page", EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_CODE.getValue());
                    }
                } else {
                    bundle.putInt("next_page", EnumC852910Xd3.PHONE_SMS_MODIFY.getValue());
                }
            } else if (zS()) {
                bundle.putInt("next_page", EnumC852910Xd3.OPTIONAL_PHONE_SMS_BIND.getValue());
            } else {
                bundle.putInt("next_page", EnumC852910Xd3.PHONE_SMS_BIND.getValue());
            }
        } else {
            bundle.putInt("next_page", EnumC852910Xd3.PHONE_SMS_FIND_PASSWORD.getValue());
        }
        fo(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C0XYD
    public final void dk(int i) {
        if (zS() && !this.LLLJ) {
            return;
        }
        super.dk(i);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIILL(arguments, "phone_binding_show");
        }
        String str = "";
        if (SR() == EnumC852660Xce.MODIFY_PHONE) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string4 = arguments2.getString("ticket")) == null) {
                string4 = "";
            }
            this.LLLILZJ = string4;
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string5 = arguments3.getString("mUnusableMobileTicket")) == null) {
                string5 = "";
            }
            this.LLLILZLLLI = string5;
            C853660XeG c853660XeG = C853660XeG.LIZ;
            String enterMethod = getEnterMethod();
            String enterFrom = getEnterFrom();
            Bundle arguments4 = getArguments();
            if (arguments4 != null && (string6 = arguments4.getString("page")) != null) {
                str = string6;
            }
            C853660XeG.LIZ(c853660XeG, enterMethod, enterFrom, str, null, null, null, null, 120);
            return;
        }
        if (SR() == EnumC852660Xce.BIND_PHONE) {
            C851430Xaf.LJ(getEnterFrom(), "mobile", (String) this.LLILZLL.getValue(), getEnterMethod());
            C853660XeG c853660XeG2 = C853660XeG.LIZ;
            String enterMethod2 = getEnterMethod();
            String enterFrom2 = getEnterFrom();
            Bundle arguments5 = getArguments();
            if (arguments5 != null && (string3 = arguments5.getString("page")) != null) {
                str = string3;
            }
            C852810Xct.LIZ.getClass();
            String strLIZ = C852810Xct.LIZ(this);
            String strLIZJ = C852810Xct.LIZJ(this);
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                string2 = arguments6.getString("enter_position");
            } else {
                string2 = null;
            }
            C853660XeG.LIZ(c853660XeG2, enterMethod2, enterFrom2, str, strLIZ, strLIZJ, null, string2, 32);
            return;
        }
        if (SR() != EnumC852660Xce.BIND_PHONE_OR_EMAIL_3P_SIGN_UP || !zS()) {
            return;
        }
        C853660XeG c853660XeG3 = C853660XeG.LIZ;
        String enterMethod3 = getEnterMethod();
        String enterFrom3 = getEnterFrom();
        Bundle arguments7 = getArguments();
        if (arguments7 != null && (string = arguments7.getString("page")) != null) {
            str = string;
        }
        C852810Xct.LIZ.getClass();
        C853660XeG.LIZ(c853660XeG3, enterMethod3, enterFrom3, str, C852810Xct.LIZ(this), C852810Xct.LIZJ(this), null, null, 96);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        super.onViewCreated(view, bundle);
        QS().getEditText();
        nS().setEnabled(false);
        final C1238240iKM c1238240iKMQS = QS();
        c1238240iKMQS.setOnCountryCodeChanged(new AwS557S0100000_13(c1238240iKMQS, 77));
        getEnterFrom();
        String strPR = PR();
        String strRR = RR();
        c1238240iKMQS.LLILZIL = strPR;
        c1238240iKMQS.LLILZLL = strRR;
        final EditText editText = c1238240iKMQS.getEditText();
        editText.setInputType(3);
        editText.addTextChangedListener(new C851940XbU() { // from class: X.0Xe5
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string = null;
                editText.setEnabled(!TextUtils.isEmpty(C2204961BRm.LLJILLL(r1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OITq6QlTCPe3qq/SgmQ==", null))));
                this.nS().setEnabled(!TextUtils.isEmpty(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OITq6QlTCPe3qq/SgmQ==", null))));
                c1238240iKMQS.LIZ();
                c1238240iKMQS.setValidationStatus(0);
                InputPhoneFragment inputPhoneFragment = this;
                if (!inputPhoneFragment.LLLIZZ) {
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("enter_from", inputPhoneFragment.getEnterFrom());
                    pairArr[1] = new Pair("enter_method", this.getEnterMethod());
                    Bundle arguments = this.getArguments();
                    if (arguments != null) {
                        string = arguments.getString("page", "");
                    }
                    pairArr[2] = new Pair("page", string);
                    C852810Xct c852810Xct = C852810Xct.LIZ;
                    InputPhoneFragment inputPhoneFragment2 = this;
                    c852810Xct.getClass();
                    pairArr[3] = new Pair("3p_platform", C852810Xct.LIZ(inputPhoneFragment2));
                    pairArr[4] = new Pair("config_key", C852810Xct.LIZJ(this));
                    C20684815ws.LJIILLIIL("start_phone_typing", C2097608Jq.LJIIIIZZ(pairArr));
                    this.LLLIZZ = true;
                }
            }
        });
        editText.setHint(getString(R.string.kr4));
        C852810Xct.LIZ.getClass();
        PhoneNumberUtil.PhoneNumber phoneNumberLIZLLL = PhoneNumberUtil.LIZLLL(C852810Xct.LJIIIIZZ(this));
        if (phoneNumberLIZLLL == null && (phoneNumberLIZLLL = C852810Xct.LJII(getArguments())) == null) {
            c1238240iKMQS.LIZIZ();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(phoneNumberLIZLLL.getCountryCode());
            c1238240iKMQS.setCountryCode(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(phoneNumberLIZLLL.getCountryIso());
            c1238240iKMQS.setCountryName(C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
            sbLIZ3.append(phoneNumberLIZLLL.getNationalNumber());
            c1238240iKMQS.setPhoneNumber(C2188811AlT.LIZIZ(sbLIZ3));
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("use_email", false)) {
            C786410Ut5.LLLLZLL(NS(), 0);
            ACListenerS148S0100000_13 aCListenerS148S0100000_13 = new ACListenerS148S0100000_13(this, 21);
            TuxTextView tuxTextViewNS = NS();
            if (tuxTextViewNS != null) {
                C0DYO.LIZ(tuxTextViewNS);
                GS(aCListenerS148S0100000_13, tuxTextViewNS);
            }
        }
        GS(new ACListenerS148S0100000_13(this, 20), nS());
        CharSequence charSequence = iS().LJIIIZ;
        if (charSequence != null && charSequence.length() != 0) {
            C786410Ut5.LLLLZLL(PS(), 8);
        } else {
            C786410Ut5.LLLLZLL(PS(), 0);
            C19293810e0.LIZJ(getContext(), PS(), 3, new View.OnClickListener() { // from class: X.0XeE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
        }
        if (zS()) {
            TuxTextView tuxTextViewPS = PS();
            C786410Ut5.LLLLZLL(tuxTextViewPS, 0);
            C19293810e0.LIZJ(tuxTextViewPS.getContext(), tuxTextViewPS, 11, new View.OnClickListener() { // from class: X.0XeD
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            });
            ViewGroup.LayoutParams layoutParams3 = tuxTextViewPS.getLayoutParams();
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams3) != null) {
                layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            TuxTextView tuxTextViewNS2 = NS();
            if (tuxTextViewNS2 != null) {
                tuxTextViewNS2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                ViewGroup.LayoutParams layoutParams4 = tuxTextViewNS2.getLayoutParams();
                if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams4) != null) {
                    layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                }
            }
        }
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        QS().setValidationStatus(3);
        QS().LIZJ(str);
        if (i == 1356) {
            PopupManager.LJIJI(new C0TS1(this, getActivity()), true);
        }
    }
}
