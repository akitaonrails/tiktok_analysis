package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C0I7D;
import X.C0XGR;
import X.C0XUD;
import X.C1232150iAX;
import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237890iJn;
import X.C19252910Tv;
import X.C197039127h;
import X.C20684815ws;
import X.C2187451AjH;
import X.C616540OGe;
import X.C786410Ut5;
import X.C851910XbR;
import X.C851940XbU;
import X.C852500XcO;
import X.C852510XcP;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC1246800iYA;
import X.ViewOnClickListenerC854450XfX;
import Y.ACListenerS148S0100000_13;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPasswordFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS247S0000000_13;
import p5a.a;

/* JADX INFO: loaded from: classes14.dex */
public final class InputPasswordFragment extends BaseI18nLoginFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiHELIOSP319PSxiLz0yLygpJzsgZgwiOTonGCQ/Ojg8OiEKOy40JSAiPQ==";
    public C1237890iJn LLLIILIL;
    public LinearLayout LLLIL;
    public View LLLILZ;
    public C0I7D LLLILZJ;
    public C852510XcP LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public C197039127h LLLJIL;
    public final String LLLJL = "password";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0h;
    }

    public final View NS() {
        View viewFindViewById = this.LLLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpu) : null;
            this.LLLILZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C1237890iJn PS() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q3k) : null;
            this.LLLIILIL = (C1237890iJn) viewFindViewById;
        }
        return (C1237890iJn) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        return new C1237010iIN(" ", null, false, getString(2131829313), " ", false, "phone_login_enter_password_page", (this.LLLJ || SR() == EnumC852660Xce.RECOVER_ACCOUNT) ? false : true, false, new C1237030iIP(null, C1236870iI9.LIZ(true), C1236870iI9.LIZIZ(true), null, 9), false, null, null, null, null, 66571518);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final List<View> qS() {
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kpt) : null;
            this.LLLIL = (LinearLayout) viewFindViewById;
        }
        return Collections.singletonList(viewFindViewById);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        nS().setLoading(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void aS() {
        nS().setLoading(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(InputPasswordFragment.class.getName());
        }
        super.onResume();
        C0I7D c0i7d = this.LLLILZJ;
        if (c0i7d == null) {
            c0i7d = null;
        }
        C1232150iAX.LIZ(c0i7d);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final String hS() {
        return this.LLLJL;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        if (this.LLJILLL.getValue() != EnumC852910Xd3.EMAIL_OTP_LOGIN) {
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", getEnterFrom());
            c0xgr.LIZLLL("enter_method", getEnterMethod());
            c0xgr.LIZLLL("enter_type", this.LLJIJIL);
            c0xgr.LIZLLL("page", RR());
            C20684815ws.LJIILLIIL("phone_login_enter_password", c0xgr.LIZ);
        }
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("recover_mobile_code", false);
        }
        this.LLLJ = z;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("recover_account_data");
        } else {
            serializable = null;
        }
        this.LLLILZLLLI = (C852510XcP) serializable;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        EnumC852910Xd3 enumC852910Xd3VR = VR();
        EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.FAILED_3P_PASSWORD_LOGIN;
        if (enumC852910Xd3VR == enumC852910Xd3 && (viewFindViewById = view.findViewById(R.id.phl)) != null) {
            C851910XbR c851910XbR = C851910XbR.LIZ;
            C0XUD.LIZ.getClass();
            boolean z = !C0XUD.LJIIJJI;
            String str = this.LLLJL;
            AFwS247S0000000_13 aFwS247S0000000_13 = AFwS247S0000000_13.get$arr$(14);
            c851910XbR.getClass();
            this.LLLF = C851910XbR.LIZ(viewFindViewById, true, z, "", str, aFwS247S0000000_13, true);
        }
        this.LLLILZJ = PS().getInputBox().LLJLILLLLZIIL;
        boolean z2 = false;
        nS().setEnabled(false);
        this.LLLJIL = nS();
        C0I7D c0i7d = this.LLLILZJ;
        View viewFindViewById2 = null;
        if (c0i7d == null) {
            c0i7d = null;
        }
        c0i7d.setHint(getString(2131837675));
        c0i7d.addTextChangedListener(new C851940XbU() { // from class: X.0XcN
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                InputPasswordFragment inputPasswordFragment = this.LL;
                C197039127h c197039127h = inputPasswordFragment.LLLJIL;
                if (c197039127h != null) {
                    C0I7D c0i7d2 = inputPasswordFragment.LLLILZJ;
                    if (c0i7d2 == null) {
                        c0i7d2 = null;
                    }
                    c197039127h.setEnabled(!C1232150iAX.LIZJ(c0i7d2));
                }
                this.LL.PS().LIZ();
                InputPasswordFragment inputPasswordFragment2 = this.LL;
                if (!inputPasswordFragment2.LLLIZZ) {
                    C853660XeG c853660XeG = C853660XeG.LIZ;
                    String enterMethod = inputPasswordFragment2.getEnterMethod();
                    String enterFrom = this.LL.getEnterFrom();
                    String strPR = this.LL.PR();
                    String strRR = this.LL.RR();
                    c853660XeG.getClass();
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", enterFrom);
                    c0xgr.LIZLLL("enter_method", enterMethod);
                    c0xgr.LIZLLL("login_panel_type", strPR);
                    c0xgr.LIZLLL("page", strRR);
                    C20684815ws.LJIILLIIL("start_password_typing", c0xgr.LIZ);
                    this.LL.LLLIZZ = true;
                }
            }
        });
        if (VR() == enumC852910Xd3) {
            View viewNS = NS();
            if (viewNS != null) {
                C786410Ut5.LJLLLLLL(8, viewNS);
            }
        } else {
            if (SR() == EnumC852660Xce.RECOVER_ACCOUNT) {
                z2 = true;
            }
            View viewNS2 = NS();
            if (viewNS2 != null) {
                ((TextView) viewNS2).setText(getString(2131824501));
            }
            C852500XcO c852500XcO = C852500XcO.LIZ;
            View viewNS3 = NS();
            String str2 = this.LLJZ.LJIIJJI;
            c852500XcO.getClass();
            viewNS3.setOnTouchListener(new a(0.5f, 150L));
            C786410Ut5.I7(new ViewOnClickListenerC854450XfX(this, str2, z2, true), viewNS3);
        }
        GS(new ACListenerS148S0100000_13(this, 18), this.LLLJIL);
        InterfaceC1246800iYA interfaceC1246800iYALIZIZ = C19252910Tv.LIZIZ.LIZLLL().LIZIZ();
        View view2 = this.LLLIL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.kpt);
            }
            this.LLLIL = (LinearLayout) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        interfaceC1246800iYALIZIZ.LIZLLL(view2);
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        PS().LIZIZ(str);
    }
}
