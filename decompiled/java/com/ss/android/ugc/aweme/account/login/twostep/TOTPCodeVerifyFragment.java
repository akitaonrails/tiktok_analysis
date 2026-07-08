package com.ss.android.ugc.aweme.account.login.twostep;

import X.C01GW;
import X.C09UZ;
import X.C0HZQ;
import X.C10VO;
import X.C1233040iBy;
import X.C1233960iDS;
import X.C1236860iI8;
import X.C1236870iI9;
import X.C1236880iIA;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1266160j3O;
import X.C1388190mED;
import X.C1494450ozb;
import X.C15O7;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C784500Uq0;
import X.C786410Ut5;
import X.C844470XAv;
import X.C849760XVe;
import X.EnumC852660Xce;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TOTPCodeVerifyFragment extends InputCodeFragmentV2 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSHELIOSA0IStiPTg8OzEpOWEHBxEcCiA3LRMpOyY1MQM+KCg+LSs4";
    public C197039127h LLLLLJLJLL;
    public C0HZQ LLLLLL;
    public TuxTextView LLLLLLIL;
    public ConstraintLayout LLLLLLJ;
    public Integer LLLLLLL;
    public String LLLLLLLLL;
    public final C01GW LLLLLLLLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 133));
    public final C01GW LLLLLLLZIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 40));
    public final C01GW LLLLLLZ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 39));
    public final C01GW LLLLLLZZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 132));
    public C197039127h LLLLLZ;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.yh;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void uT() {
    }

    public final String AT() {
        return (String) this.LLLLLLZZ.getValue();
    }

    public final C197039127h CT() {
        View viewFindViewById = this.LLLLLJLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p8k) : null;
            this.LLLLLJLJLL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final String DT() {
        return (String) this.LLLLLLLLLL.getValue();
    }

    public final boolean FT() {
        Integer num = this.LLLLLLL;
        return (num != null && num.intValue() == EnumC852660Xce.BIND_TOTP.getValue()) || KT();
    }

    public final boolean IT() {
        Integer num = this.LLLLLLL;
        return num != null && num.intValue() == EnumC852660Xce.TWO_STEP_VERIFICATION.getValue();
    }

    public final boolean KT() {
        Integer num = this.LLLLLLL;
        return num != null && num.intValue() == EnumC852660Xce.UPDATE_TOTP.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC1237610iJL
    public final void LJJLL() {
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String enterFrom = getEnterFrom();
        String strAT = AT();
        c1233960iDS.getClass();
        C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
        c2344009GkLIZ.LJIIIIZZ("enter_from", enterFrom);
        c2344009GkLIZ.LJIIIIZZ("popup_type", "totp");
        c2344009GkLIZ.LJIIIIZZ("flow_type", strAT);
        C20684815ws.LJIILLIIL("twosv_totp_code_start_typing", c2344009GkLIZ.LIZ);
        C1233960iDS.LJIIZILJ(getEnterFrom(), getEnterMethod(), DT(), "totp");
        super.LJJLL();
    }

    public final boolean LT() {
        Integer num = this.LLLLLLL;
        return num != null && num.intValue() == EnumC852660Xce.VERIFY_TOTP.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C1236860iI8 eT() {
        C1236860iI8 c1236860iI8 = new C1236860iI8();
        c1236860iI8.LIZ = "";
        c1236860iI8.LIZJ = true;
        c1236860iI8.LJ = false;
        c1236860iI8.LIZLLL = Boolean.FALSE;
        if (IT()) {
            c1236860iI8.LJFF = false;
        }
        return c1236860iI8;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        C1237010iIN c1237010iIN = new C1237010iIN(null, null, false, null, null, false, null, false, false, null, false, null, null, null, null, 67108863);
        c1237010iIN.LJIIIIZZ = getString(2131823032);
        c1237010iIN.LJIIIZ = getString(2131823031);
        c1237010iIN.LIZ = GT() ? getString(2131857337) : " ";
        c1237010iIN.LJIIL = false;
        if (IT()) {
            c1237010iIN.LIZ = getString(2131857339);
            c1237010iIN.LJIIL = true;
            c1237010iIN.LJIIJJI = getEnterFrom();
            c1237010iIN.LJIJ = new C1237030iIP(null, C1236870iI9.LIZ(true), C1236870iI9.LIZIZ(true), null, 9);
        }
        return c1237010iIN;
    }

    public final C0HZQ zT() {
        View viewFindViewById = this.LLLLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dq1) : null;
            this.LLLLLL = (C0HZQ) viewFindViewById;
        }
        return (C0HZQ) viewFindViewById;
    }

    public final boolean GT() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getInt("progress", -1) >= 0;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLLLJLJLL = null;
        this.LLLLLL = null;
        this.LLLLLLIL = null;
        this.LLLLLLJ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!GT() || KT()) {
            super.onBackPressed();
            return false;
        }
        if (C784500Uq0.LIZJ(getActivity())) {
            return true;
        }
        super.onBackPressed();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer numValueOf;
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("current_scene"));
        } else {
            numValueOf = null;
        }
        this.LLLLLLL = numValueOf;
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void qT(CharSequence charSequence) {
        boolean z;
        C197039127h c197039127h = this.LLLLLZ;
        if (c197039127h != null) {
            if (charSequence != null && charSequence.length() == 6) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.setEnabled(z);
        }
    }

    public final void ET(int i, String str) {
        if (1016 == i) {
            pn(i, getString(2131850703));
            return;
        }
        if (FT() && 1365 == i) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("error_code", i);
                C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
                WR(arguments);
                return;
            }
            return;
        }
        pn(i, C849760XVe.LIZIZ(Integer.valueOf(i), str));
    }

    public final <T> boolean NT(C15O7<T> c15o7, boolean z) {
        if (!C09UZ.LIZLLL(c15o7)) {
            Integer num = -2;
            String string = getString(2131850706);
            if (c15o7.LJIIJJI() instanceof C1494450ozb) {
                num = null;
                string = null;
            }
            if (!z) {
                C1233040iBy c1233040iBy = new C1233040iBy(getContext());
                c1233040iBy.LIZJ(C849760XVe.LIZIZ(null, null));
                c1233040iBy.LIZLLL();
                return false;
            }
            pn(-2, C849760XVe.LIZIZ(num, string));
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C197039127h c197039127hCT;
        Activity activityLIZ;
        TextView textView;
        super.onViewCreated(view, bundle);
        if (IT()) {
            C786410Ut5.LLLLLLJ(CT(), 8);
            nS().setEnabled(false);
            c197039127hCT = nS();
        } else {
            c197039127hCT = CT();
        }
        this.LLLLLZ = c197039127hCT;
        String string = null;
        if (IT()) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = getEnterFrom();
            String enterMethod = getEnterMethod();
            String strDT = DT();
            c1233960iDS.getClass();
            C1233960iDS.LJIJI(enterFrom, enterMethod, strDT, "totp");
            C786410Ut5.LLLLLZ(zT(), 0);
            C1236880iIA.LIZ(zT(), getContext());
            zT().setChecked(TwoStepAuthApi.LJI());
            C786410Ut5.D7(zT(), new CompoundButton.OnCheckedChangeListener() { // from class: X.0iI5
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Keva.getRepo("two_step_verification").storeBoolean("ask_next_time", z);
                }
            });
            List list = (List) this.LLLLLLLZIL.getValue();
            if (list != null && !list.isEmpty()) {
                TuxTextView tuxTextViewZS = ZS();
                if (tuxTextViewZS != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewZS, 0);
                    C786410Ut5.h9(tuxTextViewZS, new ACListenerS154S0100000_19(this, 32));
                    tuxTextViewZS.setText(2131823012);
                }
            } else {
                C786410Ut5.LLLLZLL(ZS(), 8);
            }
            C197039127h c197039127h = this.LLLLLZ;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 0);
            }
            C197039127h c197039127h2 = this.LLLLLZ;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS154S0100000_19(this, 33));
            }
            View viewFindViewById = this.LLLLLLIL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.dq5);
                } else {
                    viewFindViewById = null;
                }
                this.LLLLLLIL = (TuxTextView) viewFindViewById;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById, 0);
            C786410Ut5.I7(new ACListenerS154S0100000_19(view, 34), view);
            iT().setInputLength(6);
            lT().getPinField().setDimOnComplete(false);
            C786410Ut5.I7(new ACListenerS154S0100000_19(view, 35), view);
            View viewFindViewById2 = this.LLLLLLJ;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.dpw);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLLLLJ = (ConstraintLayout) viewFindViewById2;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
            if (constraintLayout != null) {
                C786410Ut5.Y7(constraintLayout, new ACListenerS154S0100000_19(this, 36));
            }
        } else if (FT() || LT()) {
            C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
            String enterFrom2 = getEnterFrom();
            String strAT = AT();
            c1233960iDS2.getClass();
            C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
            c2344009GkLIZ.LJIIIIZZ("enter_from", enterFrom2);
            c2344009GkLIZ.LJIIIIZZ("popup_type", "totp");
            c2344009GkLIZ.LJIIIIZZ("flow_type", strAT);
            C20684815ws.LJIILLIIL("twosv_totp_code_enter_show", c2344009GkLIZ.LIZ);
        }
        TuxTextView tuxTextViewJT = jT();
        C10VO.LIZIZ(tuxTextViewJT);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("page");
        }
        if (Intrinsics.LJFF(string, "twosv_setup") && LT()) {
            C786410Ut5.LLLLZLL(tuxTextViewJT, 0);
            tuxTextViewJT.setText(getString(2131850704));
            GS(new ACListenerS154S0100000_19(this, 37), tuxTextViewJT);
            tuxTextViewJT.setEnabled(true);
        }
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (textView = (TextView) activityLIZ.findViewById(R.id.kpd)) != null) {
            textView.setTextColor(C784500Uq0.LIZ(getContext()));
        }
        CT().setText(R.string.epx);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void rT(String str, String str2) {
        if (FT()) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String enterFrom = getEnterFrom();
            String strAT = AT();
            c1233960iDS.getClass();
            C1233960iDS.LJII(enterFrom, strAT);
            LJ();
            C844470XAv.LIZ.getClass();
            TwoStepAuthApi.LIZIZ().bindTotpVerify(C844470XAv.LJIIJ, str, TwoStepAuthApi.LJ("/passport/totp/bind_verify/")).LJ(new C1266160j3O(this, 2), C15O7.LJIIIIZZ, null);
            return;
        }
        if (LT()) {
            C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
            String enterFrom2 = getEnterFrom();
            String strAT2 = AT();
            c1233960iDS2.getClass();
            C1233960iDS.LJII(enterFrom2, strAT2);
            LJ();
            C844470XAv.LIZ.getClass();
            TwoStepAuthApi.LIZIZ().verifyTotp(C844470XAv.LJIIJ, str, TwoStepAuthApi.LJ("/passport/totp/verify/")).LJ(new C1266160j3O(this, 3), C15O7.LJIIIIZZ, null);
            return;
        }
        if (!IT()) {
            return;
        }
        KeyboardUtils.LIZIZ(iT());
        this.LLLLLLLLL = str;
    }
}
