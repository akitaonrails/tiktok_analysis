package com.ss.android.ugc.aweme.setting.page.authmanager;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C11DN;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1324840ka2;
import X.C13LE;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1761680vwc;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C616540OGe;
import X.C786410Ut5;
import X.InterfaceC1749900vdc;
import X.InterfaceC960503pD;
import Y.ACListenerS90S0300000_26;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import com.ss.android.ugc.aweme.setting.model.SecondPartyPartnerAuth;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthAppInfoListFragment extends JediBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpPTs6JiJiOS40LWHELIOSstPDs7JSQiKCg2OmsNPDs7CTU8ACE1JwklOjsVOiQrJCo9PA==";
    public C1749280vcc LLILLJJLI;
    public TuxNavBar LLILLL;
    public ScrollView LLILZ;
    public TuxTextView LLILZIL;
    public LinearLayout LLILZLL;
    public InterfaceC1749900vdc LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    public final LinearLayout NR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.b6a) : null;
            this.LLILZLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final AuthListViewModel OR() {
        return (AuthListViewModel) this.LLIZLLLIL.getValue();
    }

    public final C1749280vcc PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLILLJJLI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public AuthAppInfoListFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuthListViewModel.class);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 98));
        this.LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1125));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(AuthAppInfoListFragment.class.getName());
        }
        super.onResume();
        int i = C2187451AjH.LIZ;
        OR().LLJILJIL.refresh();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        int i = C2187451AjH.LIZ;
        OR().LLJILJIL.refresh();
        View viewFindViewById = this.LLILLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).LJIIZILJ(false);
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.p15);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (TuxNavBar) viewFindViewById3;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LJIIIIZZ = getString(2131823332);
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1519));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131826825);
        c0om1.LIZJ = c1250250idj;
        ((TuxNavBar) viewFindViewById3).setNavActions(c0om1);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            View view4 = getView();
            if (view4 != null) {
                view4.setBackgroundColor(iIntValue);
            }
        }
        View view5 = this.LLILZ;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById2 = view6.findViewById(R.id.b6p);
            }
            this.LLILZ = (ScrollView) viewFindViewById2;
            view5 = viewFindViewById2;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(8));
        view5.setBackground(c384050F3z.LIZ(requireContext()));
        ListMiddleware<AuthInfoState, AuthorizedStruct, C1761680vwc> listMiddleware = OR().LLJILJIL;
        final AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 755);
        final AwS640S0100000_26 awS640S0100000_26 = new AwS640S0100000_26(this, 147);
        final AwS640S0100000_26 awS640S0100000_262 = new AwS640S0100000_26(this, 148);
        listMiddleware.subscribe(this, null, false, getUniqueOnlyGlobal(), new C11DN<AuthorizedStruct, InterfaceC960503pD>(awS605S0100000_26, awS640S0100000_26, awS640S0100000_262) { // from class: X.0vdh
            public final Function1<InterfaceC960503pD, Unit> LIZ;
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZIZ;
            public final Function2<InterfaceC960503pD, List<? extends AuthorizedStruct>, Unit> LIZJ;

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, Throwable, Unit> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C11DN
            public final Function2<InterfaceC960503pD, List<? extends AuthorizedStruct>, Unit> LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C11DN
            public final Function1<InterfaceC960503pD, Unit> LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = awS605S0100000_26;
                this.LIZIZ = awS640S0100000_26;
                this.LIZJ = awS640S0100000_262;
            }
        }, null, null, null, null, null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f6p, viewGroup, false);
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

    public final void MR(Context context, List<AuthorizedStruct> list, LinearLayout linearLayout, String str, SecondPartyPartnerAuth secondPartyPartnerAuth) {
        View viewSd = C786410Ut5.Sd(R.layout.f6s, C786410Ut5.ne(context), null);
        TextView textView = (TextView) viewSd.findViewById(R.id.b7l);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        linearLayout.addView(viewSd);
        for (AuthorizedStruct authorizedStruct : list) {
            View viewSd2 = C786410Ut5.Sd(R.layout.f7b, C786410Ut5.ne(context), null);
            TextView textView2 = (TextView) viewSd2.findViewById(R.id.z9w);
            RemoteImageView remoteImageView = (RemoteImageView) viewSd2.findViewById(R.id.bbi);
            textView2.setText(authorizedStruct.getName());
            C1324840ka2.LJIIJ(remoteImageView, authorizedStruct.getIcon(), -1, -1);
            C786410Ut5.I7(new ACListenerS90S0300000_26(this, authorizedStruct, secondPartyPartnerAuth, 3), viewSd2);
            linearLayout.addView(viewSd2);
        }
    }
}
