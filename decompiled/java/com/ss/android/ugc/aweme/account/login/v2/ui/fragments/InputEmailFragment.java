package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C01GW;
import X.C0I7D;
import X.C0TS1;
import X.C1232150iAX;
import X.C1236870iI9;
import X.C1237010iIN;
import X.C1237030iIP;
import X.C1237880iJm;
import X.C197039127h;
import X.C2187451AjH;
import X.C2451909jB;
import X.C616540OGe;
import X.C688120Qyw;
import X.C786410Ut5;
import X.C816470W1d;
import X.C851940XbU;
import X.C852810Xct;
import X.C853750XeP;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.InterfaceC20660615sy;
import Y.ACListenerS148S0100000_13;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes14.dex */
public final class InputEmailFragment extends BaseI18nLoginFragment implements InterfaceC20660615sy {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiP319PSxiLz0yLygpJzsgZgwiOTonDSgtICMVOiQrJCo9PA==";
    public C1237880iJm LLLIILIL;
    public RecyclerView LLLIL;
    public RecyclerView LLLILZ;
    public C0I7D LLLILZJ;
    public RecyclerView LLLIZZ;
    public C197039127h LLLJ;
    public boolean LLLILZLLLI = true;
    public final String LLLJIL = "input_email";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int sS() {
        return R.layout.a0g;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void LLIIIZ() {
        RecyclerView recyclerView = this.LLLIZZ;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
    }

    public final C1237880iJm NS() {
        View viewFindViewById = this.LLLIILIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gyz) : null;
            this.LLLIILIL = (C1237880iJm) viewFindViewById;
        }
        return (C1237880iJm) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C1237010iIN iS() {
        boolean z = getArguments().containsKey("show_skip") && getArguments().getBoolean("show_skip");
        String string = getString(2131823038);
        String string2 = getString(2131823036);
        String string3 = getString(2131829323);
        boolean z2 = SR() != EnumC852660Xce.RECOVER_ACCOUNT;
        String string4 = z ? getString(2131847626) : null;
        C852810Xct.LIZ.getClass();
        return new C1237010iIN(string3, string4, false, string, string2, true, "reset_email_input", z2, true, new C1237030iIP(null, C1236870iI9.LIZ(C852810Xct.LJIILIIL(this)), C1236870iI9.LIZIZ(C852810Xct.LJIILIIL(this)), null, 9), false, null, null, null, null, 66536700);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC1232290iAl
    public final void ln() {
        RecyclerView recyclerView = this.LLLIZZ;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void HS() {
        nS().setLoading(true);
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
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

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), this, null);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(InputEmailFragment.class.getName());
        }
        super.onResume();
        C01GW<Boolean> c01gw = AccountKeyBoardHelper.LLJ;
        if (C853750XeP.LIZ()) {
            C0I7D c0i7d = this.LLLILZJ;
            C1232150iAX.LIZ(c0i7d != null ? c0i7d : null);
        } else {
            C0I7D c0i7d2 = this.LLLILZJ;
            (c0i7d2 != null ? c0i7d2 : null).requestFocus();
        }
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLLJIL;
    }

    public final void PS(String str, boolean z) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIIZILJ(this, str);
        arguments.putBoolean("code_sent", z);
        arguments.putInt("next_page", EnumC852910Xd3.EMAIL_SMS_FIND_PASSWORD.getValue());
        fo(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLILZJ = NS().getInputBox().LLJLILLLLZIIL;
        this.LLLJ = nS();
        C0I7D c0i7d = this.LLLILZJ;
        C0I7D c0i7d2 = null;
        if (c0i7d == null) {
            c0i7d = null;
        }
        c0i7d.setInputType(32);
        c0i7d.addTextChangedListener(new C851940XbU() { // from class: X.0XeO
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                InputEmailFragment inputEmailFragment = this.LL;
                C197039127h c197039127h = inputEmailFragment.LLLJ;
                if (c197039127h != null) {
                    C0I7D c0i7d3 = inputEmailFragment.LLLILZJ;
                    if (c0i7d3 == null) {
                        c0i7d3 = null;
                    }
                    c197039127h.setEnabled(!TextUtils.isEmpty(C2204961BRm.LLJILLL(c0i7d3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEpk5Z4F7WzzjzzRSEqABH4223OND+0RUCFjYVoLbGSwA==", null))));
                }
                this.LL.NS().LIZ();
                if (this.LL.LLLILZLLLI) {
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", this.LL.getEnterFrom());
                    c0xgr.LIZLLL("enter_method", this.LL.getEnterMethod());
                    c0xgr.LIZLLL("page", "login_force_reset_password");
                    C20684815ws.LJIILLIIL("start_email_typing", c0xgr.LIZ);
                    this.LL.LLLILZLLLI = false;
                }
            }
        });
        c0i7d.setNextFocusDownId(c0i7d.getId());
        c0i7d.setHint(getString(2131829316));
        C852810Xct.LIZ.getClass();
        String strLJ = C852810Xct.LJ(getArguments());
        if (!TextUtils.isEmpty(strLJ) && C2451909jB.LIZ(strLJ)) {
            c0i7d.setText(strLJ);
            c0i7d.setSelection(strLJ.length());
        }
        GS(new ACListenerS148S0100000_13(this, 17), this.LLLJ);
        View viewFindViewById = this.LLLIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.m32);
            } else {
                viewFindViewById = null;
            }
            this.LLLIL = (RecyclerView) viewFindViewById;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.LLLIZZ = recyclerView;
        if (recyclerView == null) {
            View viewFindViewById2 = this.LLLILZ;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.kpp);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLILZ = (RecyclerView) viewFindViewById2;
            }
            recyclerView = (RecyclerView) viewFindViewById2;
        }
        C0I7D c0i7d3 = this.LLLILZJ;
        if (c0i7d3 != null) {
            c0i7d2 = c0i7d3;
        }
        C816470W1d.LIZ(recyclerView, c0i7d2, getEnterFrom(), getEnterMethod());
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        NS().LIZIZ(str);
        if (i == 1356) {
            PopupManager.LJIJI(new C0TS1(this, getActivity()), true);
        }
    }
}
