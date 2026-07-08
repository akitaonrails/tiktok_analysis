package com.ss.android.ugc.aweme.account.loginapproval;

import X.C09UZ;
import X.C0FNV;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C15O7;
import X.C19EG;
import X.C20684815ws;
import X.C21524519Ln;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C985403tE;
import X.EnumC21267818Ku;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.loginapproval.LoginApprovalApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.text.u;

/* JADX INFO: loaded from: classes33.dex */
@InterfaceC836760Ws6(attachActivity = ConfirmLoginPageHostActivity.class)
public final class ConfirmLoginPageFragment extends BaseConfirmLoginPageFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0HELIOSISstOT8hJzMtJWEQJysqID0+BCorICEDKSIpDz0yLygpJzs=";

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void cS() {
    }

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void WR() {
        EnumC21267818Ku enumC21267818Ku = EnumC21267818Ku.ALLOW;
        hS(enumC21267818Ku);
        C0FNV.LIZJ(UR());
        String str = this.LLJJJ;
        if (str == null) {
            str = "";
        }
        LoginApprovalApi.LIZ(str, enumC21267818Ku).LJ(new C21524519Ln(this, 1), C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void ZR() {
        EnumC21267818Ku enumC21267818Ku = EnumC21267818Ku.DISMISS;
        hS(enumC21267818Ku);
        C0FNV.LIZJ(UR());
        String str = this.LLJJJ;
        if (str == null) {
            str = "";
        }
        LoginApprovalApi.LIZ(str, enumC21267818Ku).LJ(new C21524519Ln(this, 2), C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void aS() {
        EnumC21267818Ku enumC21267818Ku = EnumC21267818Ku.PREVENT;
        hS(enumC21267818Ku);
        C0FNV.LIZJ(UR());
        String str = this.LLJJJ;
        if (str == null) {
            str = "";
        }
        LoginApprovalApi.LIZ(str, enumC21267818Ku).LJ(new C21524519Ln(this, 3), C15O7.LJIIIIZZ, null);
    }

    public final void kS() {
        C1397580mTM c1397580mTM = new C1397580mTM(requireContext());
        c1397580mTM.LJI(getString(2131822154));
        Context contextRequireContext = requireContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<b>");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        sbLIZ.append("</b>");
        c1397580mTM.LIZIZ(Html.fromHtml(contextRequireContext.getString(2131830620, C2188811AlT.LIZIZ(sbLIZ))));
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS611S0100000_32(this, 26));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment
    public final void SR() {
        C0FNV.LIZJ(UR());
        String str = this.LLJJJ;
        if (str == null) {
            str = "";
        }
        ((LoginApprovalApi.Api) LoginApprovalApi.LIZ.getValue()).getDataByTicket(str, 1, LoginApprovalApi.LIZIZ("/passport/user/get_data_by_ticket/")).LJ(new C21524519Ln(this, 0), C15O7.LJIIIIZZ, null);
    }

    public final boolean mS() {
        this.LLJJJ = requireArguments().getString("passport_ticket", "");
        this.LLJJJIL = requireArguments().getString("user_id", "");
        this.LLJJJJ = requireArguments().getString("from", "");
        this.LLJJLIIIJLLLLLLLZ = requireArguments().getString("username", "");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJ);
        C20684815ws.LJIILLIIL("login_approval_show", c2344009Gk.LIZ);
        if (this.LLJLILLLLZIIL.LJJI().contains(this.LLJJJIL)) {
            return true;
        }
        kS();
        return false;
    }

    public final void gS(boolean z) {
        String str;
        C19EG activity;
        if (z) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://account/2sv_upsell");
            smartRouteBuildRoute.withParam("enter_from", "login_device_approval");
            if (this.LLJJL || ((activity = getActivity()) != null && activity.isTaskRoot())) {
                str = "aweme://main";
            } else {
                str = "";
            }
            smartRouteBuildRoute.withParam("back_button_action_link", str);
            smartRouteBuildRoute.open();
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        VR();
    }

    public final void hS(EnumC21267818Ku enumC21267818Ku) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJ);
        c2344009Gk.LJIIIIZZ("action", enumC21267818Ku.getValue());
        C20684815ws.LJIILLIIL("login_approval_response", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.loginapproval.BaseConfirmLoginPageFragment, X.InterfaceC21503819Do
    public final void qO(Intent intent) {
        if (mS()) {
            SR();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (mS()) {
            dS(view);
        }
    }

    public static void iS(ConfirmLoginPageFragment confirmLoginPageFragment, C15O7 c15o7, Function1 function1) {
        AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(159);
        confirmLoginPageFragment.getClass();
        if (C09UZ.LIZLLL(c15o7) && u.LJIJI("success", ((ConfirmApprovalNotificationData) c15o7.LJIIL()).message, true)) {
            function1.invoke(((ConfirmApprovalNotificationData) c15o7.LJIIL()).data);
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(confirmLoginPageFragment.requireActivity());
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIIZ(2131834217);
        c1389890mGx.LJIIJJI();
        aFwS223S0000000_32.getClass();
        confirmLoginPageFragment.VR();
    }
}
