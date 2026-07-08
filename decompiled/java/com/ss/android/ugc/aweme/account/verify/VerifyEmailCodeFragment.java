package com.ss.android.ugc.aweme.account.verify;

import X.AbstractC19483511Kn;
import X.C01GW;
import X.C0HZQ;
import X.C0XGR;
import X.C0XUD;
import X.C0XZ4;
import X.C1236860iI8;
import X.C1236880iIA;
import X.C1237010iIN;
import X.C1237220iIi;
import X.C19EG;
import X.C20684815ws;
import X.C2187451AjH;
import X.C452501pT;
import X.C616540OGe;
import X.C851360XaY;
import X.C851370XaZ;
import X.C851910XbR;
import X.C852100Xbk;
import X.C852610XcZ;
import X.C852810Xct;
import X.C854460XfY;
import X.C854720Xfy;
import X.EnumC638250P1r;
import X.EnumC852630Xcb;
import X.EnumC852660Xce;
import X.InterfaceC2385309Wh;
import X.InterfaceC852600XcY;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS18S1100000_13;
import Y.AfS182S0100000_13;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.account.verify.VerifyEmailCodeFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyEmailCodeFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiPyohISM1Zxk2OiwqMAo+KSwgCiA3LQM+KCg+LSs4";
    public final String LLLLLJLJLL = "email/username";
    public final C01GW LLLLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 109));
    public final C01GW LLLLLLIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 110));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = getEmail();
        c1236860iI8.LIZIZ = false;
        C852810Xct.LIZ.getClass();
        c1236860iI8.LJ = C852810Xct.LIZIZ(this);
        return c1236860iI8;
    }

    public final String getEmail() {
        return (String) this.LLLLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131833845);
        c1237010iIN.LJIIIZ = C1236880iIA.LIZIZ(C1236880iIA.LIZLLL(getString(2131833843, getEmail()), new String[]{getEmail()}, 52), getContext(), R.attr.a1j, getEmail());
        c1237010iIN.LIZ = " ";
        c1237010iIN.LJIIL = rS();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("show_skip")) {
            c1237010iIN.LIZIZ = getString(2131848278);
            c1237010iIN.LIZJ = EnumC638250P1r.PRIMARY;
            c1237010iIN.LJIIL = true;
            c1237010iIN.LJIIJJI = getEnterFrom();
        }
        return c1237010iIN;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
        ((AbstractC19483511Kn) ConfirmEmailFragment.LLLLJ.invoke(this, this, getEmail(), "resend")).LJIIIIZZ(new AfS182S0100000_13(this, 61)).LJIILL();
    }

    public final void CT() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS113S0100000_13(this, 91));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C0HZQ c0hzq;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(VerifyEmailCodeFragment.class.getName());
        }
        super.onResume();
        if (!rS() || (c0hzq = this.LLLF) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c0hzq, new Runnable() { // from class: X.0Xdc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VerifyEmailCodeFragment@e86e.onResume$1");
                try {
                    C0XUD.LIZ.getClass();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VerifyEmailCodeFragment@e86e.onResume$1");
            }
        }, 100L);
    }

    public final void zT() {
        Bundle bundle;
        CommonFlowActivity commonFlowActivity;
        IBindService iBindServiceLJII = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJII();
        C19EG activity = getActivity();
        if (!(activity instanceof CommonFlowActivity) || (commonFlowActivity = (CommonFlowActivity) activity) == null || (bundle = commonFlowActivity.LLLZZIL()) == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.remove("show_skip");
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILL(bundle2, "email_verification");
        iBindServiceLJII.bindMobile(getActivity(), getEnterFrom(), "click_try_phone", bundle2, false, new C854720Xfy(this, 2));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLLLJLJLL;
    }

    public final void AT(String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", getEnterFrom());
        c0xgr.LIZLLL("enter_method", getEnterMethod());
        C852810Xct.LIZ.getClass();
        c0xgr.LIZLLL("3p_platform", C852810Xct.LIZ(this));
        c0xgr.LIZLLL("config_key", C852810Xct.LIZJ(this));
        C20684815ws.LJIILLIIL(str, c0xgr.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1237220iIi c1237220iIi;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIILL(arguments, "email_verification");
        }
        if (SR() != EnumC852660Xce.MODIFY_PHONE) {
            if (rS() && !((Boolean) this.LLLLLLIL.getValue()).booleanValue()) {
                C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(getActivity(), getEmail(), SR());
                if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
                    return;
                }
            } else {
                return;
            }
        }
        ((AbstractC19483511Kn) ConfirmEmailFragment.LLLLJ.invoke(this, this, getEmail(), "user_click")).LJIIIIZZ(new AfS182S0100000_13(this, 59)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (rS()) {
            View viewFindViewById = view.findViewById(R.id.gyc);
            if (viewFindViewById != null) {
                C851910XbR c851910XbR = C851910XbR.LIZ;
                C0XUD.LIZ.getClass();
                boolean z = !C0XUD.LJIIJJI;
                String str = this.LLLLLJLJLL;
                AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(19);
                c851910XbR.getClass();
                this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z, "", str, aFwS247S0000000_13, false);
            }
            if (((Boolean) this.LLLLLLIL.getValue()).booleanValue()) {
                return;
            }
            C854460XfY c854460XfY = C854460XfY.LIZ;
            Bundle arguments = getArguments();
            c854460XfY.getClass();
            if (arguments != null && arguments.getBoolean("do_safe_env_check")) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C852610XcZ c852610XcZ = InterfaceC852600XcY.LIZ;
                EnumC852630Xcb enumC852630Xcb = EnumC852630Xcb.CHANGE_EMAIL;
                c852610XcZ.getClass();
                C852610XcZ.LIZ(enumC852630Xcb).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0Xdb
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        int i;
                        C1C7U.LIZ("VerifyEmailCodeFragment@e86e.onViewCreated$2");
                        int i2 = 0;
                        if (!C09UZ.LIZLLL(c15o7)) {
                            this.LIZ.CT();
                            i = -1;
                        } else {
                            SafeEnvData safeEnvData = ((SafeEnvV2Response) c15o7.LJIIL()).data;
                            if (safeEnvData == null) {
                                this.LIZ.CT();
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("VerifyEmailCodeFragment@e86e.onViewCreated$2");
                                return unit;
                            }
                            i = safeEnvData.errorCode;
                            if (i == 0 && safeEnvData.safe) {
                                VerifyEmailCodeFragment verifyEmailCodeFragment = this.LIZ;
                                String str2 = safeEnvData.passportTicket;
                                C19EG activity = verifyEmailCodeFragment.getActivity();
                                if (activity != null) {
                                    activity.runOnUiThread(new ARunnableS18S1100000_13(verifyEmailCodeFragment, str2, 21));
                                }
                                i2 = 1;
                            } else {
                                this.LIZ.CT();
                            }
                        }
                        C0XGR c0xgr = new C0XGR();
                        c0xgr.LIZ(i, "error_code");
                        c0xgr.LIZ(i2, "is_safe");
                        c0xgr.LIZLLL("page", "popup_change_1p_email");
                        c0xgr.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "duration");
                        C20684815ws.LJIILLIIL("client_safe_env_check_result", c0xgr.LIZ);
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("VerifyEmailCodeFragment@e86e.onViewCreated$2");
                        return unit2;
                    }
                });
                return;
            }
            CT();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        C0XZ4.LIZ.LJJJ(this, this, str, C852100Xbk.LIZ(this), null, str2, mT()).LJIIIIZZ(new AfS182S0100000_13(this, 60)).LJIILL();
    }
}
