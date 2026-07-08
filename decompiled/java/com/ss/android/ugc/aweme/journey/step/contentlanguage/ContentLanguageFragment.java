package com.ss.android.ugc.aweme.journey.step.contentlanguage;

import X.AbstractC214823195h;
import X.C098200Yq;
import X.C0OM1;
import X.C10H5;
import X.C10MV;
import X.C10NW;
import X.C10PL;
import X.C10R4;
import X.C10R7;
import X.C10RJ;
import X.C10SV;
import X.C1250250idj;
import X.C12ES;
import X.C1568170quV;
import X.C1685300txQ;
import X.C1848530yCh;
import X.C189200o6;
import X.C1911400zq6;
import X.C1912470zrp;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C19235810Ng;
import X.C19246810Rm;
import X.C19248710Sf;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2211631BhB;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C426750GoL;
import X.C616540OGe;
import X.C786410Ut5;
import X.C807840VmY;
import X.C814420VxA;
import X.InterfaceC1740760vOs;
import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.step.LanguageBaseFragment;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.tiktok.kmp.nuj.IKMPNewUserJourneyService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class ContentLanguageFragment extends LanguageBaseFragment implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGsvHELIOSJiEnLSs4JS49LzAtLip9CyoiPSo9PAktJygmKSIpDz0yLygpJzs=";
    public final C10RJ LLJJJIL;
    public String LLJJJJ;

    public ContentLanguageFragment() {
        this(null);
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b1466";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.LanguageBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.LanguageBaseFragment, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(ContentLanguageFragment.class.getName());
        }
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONTENTLANGUAGE_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJI : null);
        super.onResume();
        C2211631BhB.LJIIL(this, getActivity());
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ2 != null ? c1912940zsaLIZ2.LJI : null);
        C1912940zsa c1912940zsaLIZ3 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ3 != null ? c1912940zsaLIZ3.LJII : null);
        C1912930zsZ.LIZLLL(c10nw);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public ContentLanguageFragment(C10RJ c10rj) {
        C1912950zsb c1912950zsb;
        this.LLJJJIL = c10rj;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONTENTLANGUAGE_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJII;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONTENTLANGUAGE_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LIZLLL;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onCreate(bundle);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LIZLLL;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }

    public final void ZR(String str, boolean z) {
        this.LLJJIJIL += System.currentTimeMillis() - this.LLJJIII;
        if (!z) {
            C10H5 c10h5 = C10H5.CHOOSE_CONTENT_LANGUAGE_POPUP;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJ);
            c2344009Gk.LJIIIIZZ("language_type", str);
            c2344009Gk.LJIIIIZZ("presentation_type", "native");
            c2344009Gk.LIZLLL(this.LLJJIJIL, "stay_duration");
            Map<String, String> map = c2344009Gk.LIZ;
            C807840VmY.LIZ(map);
            C10SV.LIZIZ(c10h5, map);
        }
        C10H5 c10h52 = C10H5.POPUP_DURATION;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", this.LLJJJJ);
        c2344009Gk2.LJIIIIZZ("presentation_type", "native");
        c2344009Gk2.LIZLLL(this.LLJJIJIL, "duration");
        C10SV.LIZIZ(c10h52, c2344009Gk2.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.LanguageBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1912950zsb c1912950zsb;
        Integer numValueOf;
        List<C19246810Rm> list;
        String str;
        C10PL c10pl;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONTENTLANGUAGE_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJFF;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onViewCreated(view, bundle);
        this.LLJJIJI = new AwS607S0100000_28(this, 85);
        C10MV.LIZ.getClass();
        if (C10MV.LIZ()) {
            View viewFindViewById = this.LLJI;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.cc3);
                } else {
                    viewFindViewById = null;
                }
                this.LLJI = (ViewGroup) viewFindViewById;
            }
            View view3 = viewFindViewById;
            C1911400zq6.LIZJ(view3, 0, 0, null, null);
            C426750GoL.LJIIL(view3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 16);
        }
        C19235810Ng c19235810Ng = C10NW.Companion;
        C1912470zrp c1912470zrpOR = NUJComponentFragment.OR();
        if (c1912470zrpOR != null && (c10pl = (C10PL) c1912470zrpOR.LIZIZ(C10PL.class)) != null) {
            numValueOf = Integer.valueOf(c10pl.LE0());
        } else {
            numValueOf = null;
        }
        c19235810Ng.getClass();
        this.LLJJJJ = C19235810Ng.LIZ(numValueOf);
        C10RJ c10rj = this.LLJJJIL;
        if (c10rj != null && (list = c10rj.LIZJ) != null && !list.isEmpty()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) VR().getLayoutParams();
            int iLIZJ = marginLayoutParams.leftMargin - ((int) C12ES.LIZJ(4.0f, VR().getContext()));
            marginLayoutParams.leftMargin = iLIZJ;
            marginLayoutParams.rightMargin = iLIZJ;
            C10RJ c10rj2 = this.LLJJJIL;
            String str2 = c10rj2.LIZ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            final C10R4 c10r4 = new C10R4(list, str2, c10rj2.LIZIZ, new AwS607S0100000_28(this, 392));
            RecyclerView recyclerViewVR = VR();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.10Rs
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    c10r4.getClass();
                    if (i != 0) {
                        return 1;
                    }
                    return 2;
                }
            };
            recyclerViewVR.setLayoutManager(gridLayoutManager);
            VR().setAdapter(c10r4);
            TuxNavBar tuxNavBarWR = WR();
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            String str4 = c10r4.LL;
            if (str4 != null) {
                str3 = str4;
            }
            c1250250idj.LIZJ = str3;
            c0om1.LIZJ = c1250250idj;
            tuxNavBarWR.setNavActions(c0om1);
            TextView textView = this.LLJJ;
            if (textView == null) {
                textView = null;
            }
            C786410Ut5.T7(textView, new ACListenerS130S0200000_28(this, c10r4, 70));
            View viewFindViewById2 = this.LLJILJILJ;
            if (viewFindViewById2 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById2 = view4.findViewById(R.id.cv9);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJILJILJ = (C197039127h) viewFindViewById2;
            }
            C786410Ut5.U8((C197039127h) viewFindViewById2, new ACListenerS162S0100000_28(this, 203));
            C19248710Sf.LIZIZ.LIZJ();
            C10H5 c10h5 = C10H5.SHOW_CONTENT_LANGUAGE_POPUP;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLJJJJ);
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_login", str);
            c2344009Gk.LJIIIIZZ("presentation_type", "native");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LLJJIII, "page_show_cost");
            Map<String, String> map = c2344009Gk.LIZ;
            C807840VmY.LIZ(map);
            C10SV.LIZIZ(c10h5, map);
            IKMPNewUserJourneyService iKMPNewUserJourneyService = (IKMPNewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(IKMPNewUserJourneyService.class, false, false, false, 14, null);
            if (iKMPNewUserJourneyService != null) {
                iKMPNewUserJourneyService.LIZIZ();
                C10R7.LJ();
            }
        } else {
            NR(Boolean.TRUE);
        }
        C1568170quV.LIZ(2350);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJFF;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.LanguageBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912950zsb c1912950zsb2;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_CONTENTLANGUAGE_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C19GS c19gs = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJ;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJ;
        } else {
            c1912950zsb2 = null;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
        if (viewOnCreateView != null) {
            C1848530yCh.LIZLLL(viewOnCreateView, "page_btm_b1466", AFwS271S0000000_28.get$arr$(116));
        }
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
