package com.ss.android.ugc.aweme.account.verify;

import X.C098200Yq;
import X.C0OM1;
import X.C0XGR;
import X.C1251150ifB;
import X.C14MJ;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C786410Ut5;
import X.InterfaceC1238480iKk;
import Y.ACListenerS154S0100000_19;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class EmailConsentPageFragment extends BaseAccountFlowFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSPyohISM1Zwo+KSwgCiA9OyAiPR8yLyAKOy40JSAiPQ==";
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxNavBar LLJJJJLIIL;
    public ImageView LLJJL;
    public C197039127h LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public InterfaceC1238480iKk LLJLIL;

    @Override // X.C0XYD
    public final void dk(int i) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = null;
        if (Intrinsics.LJFF(getEnterFrom(), "manage_account_page")) {
            View viewFindViewById2 = this.LLJJJJ;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.wlq);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJJJ = (TuxTextView) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setText(ComplianceServiceProvider.LJIJ().LIZ("manage_account_page"));
            ComplianceServiceProvider.LJIJ().LJ("manage_account_page");
        } else {
            View viewFindViewById3 = this.LLJJJJJIL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.title);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJJJJIL = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(getString(2131821584));
            View viewFindViewById4 = this.LLJJJJ;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.wlq);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJJJJ = (TuxTextView) viewFindViewById4;
            }
            ((TextView) viewFindViewById4).setText(ComplianceServiceProvider.LJIJ().LIZ("profile_page"));
            View viewFindViewById5 = this.LLJJJJLIIL;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.bni);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJJJJLIIL = (TuxNavBar) viewFindViewById5;
            }
            C786410Ut5.LLLLZLLLI((TuxNavBar) viewFindViewById5, 0);
            View viewFindViewById6 = this.LLJJJJLIIL;
            if (viewFindViewById6 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById6 = view6.findViewById(R.id.bni);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLJJJJLIIL = (TuxNavBar) viewFindViewById6;
            }
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 368));
            c0om1.LJ(c1251150ifB);
            ((TuxNavBar) viewFindViewById6).setNavActions(c0om1);
        }
        View viewFindViewById7 = this.LLJJL;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.jxe);
            } else {
                viewFindViewById7 = null;
            }
            this.LLJJL = (ImageView) viewFindViewById7;
        }
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIIZ();
        C14MJ.LJIIJ((ImageView) viewFindViewById7, "18d672861696c90ffb63e9a7c134f815", null);
        String enterFrom = getEnterFrom();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("page_name", enterFrom);
        c0xgr.LIZLLL("exp_name", "collect_email_consent_phase3");
        C20684815ws.LJIILLIIL("show_email_consent_popup_page", c0xgr.LIZ);
        View viewFindViewById8 = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById8 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById8 = view8.findViewById(R.id.eoo);
            } else {
                viewFindViewById8 = null;
            }
            this.LLJJLIIIJLLLLLLLZ = (C197039127h) viewFindViewById8;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById8, new ACListenerS154S0100000_19(this, 81));
        View view9 = this.LLJL;
        if (view9 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById = view10.findViewById(R.id.db0);
            }
            this.LLJL = (TuxTextView) viewFindViewById;
            view9 = viewFindViewById;
        }
        C786410Ut5.h9((TuxTextView) view9, new ACListenerS154S0100000_19(this, 82));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.y3, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
