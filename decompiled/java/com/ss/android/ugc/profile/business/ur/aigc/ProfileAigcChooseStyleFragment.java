package com.ss.android.ugc.profile.business.ur.aigc;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0C64;
import X.C0OM1;
import X.C1221880hty;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1265780j2m;
import X.C1390410mHn;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497820Jfg;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS46S0100000_19;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class ProfileAigcChooseStyleFragment extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTHELIOSdiKCY0K2scOyA1ISkpCCY0KwYkJiAgLRY4MCM2DjctLiI2JjE=";
    public C1390410mHn LLIZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public FrameLayout LLJ;
    public TuxNavBar LLJI;
    public C197039127h LLJIJIL;
    public final AssemVMLazy LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcChooseStyleFragment.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcStyleViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAigcChooseStyleFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcStyleViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2231);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(370);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2232), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 2233), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2234), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILJIL = assemVMLazy;
    }

    public final C197039127h SR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cbx) : null;
            this.LLJIJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C1390410mHn UR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nl2) : null;
            this.LLIZ = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final TuxNavBar VR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p15) : null;
            this.LLJI = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final ProfileAigcStyleViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (ProfileAigcStyleViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS257S0000000_19.get$arr$(369));
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int iLJ;
        final int i;
        super.onViewCreated(view, bundle);
        UR().LIZJ();
        View viewFindViewById = view.findViewById(R.id.w0u);
        Context context = viewFindViewById.getContext();
        if (context != null) {
            viewFindViewById.getLayoutParams().height = C497820Jfg.LIZJ(context);
        }
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3133));
        TuxNavBar tuxNavBarVR = VR();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getString(2131820649);
        c0om1.LIZJ = c1250250idj;
        tuxNavBarVR.setNavActions(c0om1);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("aigc_creative_slow_max_limit_period_daily", true)) {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("aigc_creative_slow_max_limit_count_daily", 1);
        } else {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("aigc_creative_slow_max_limit_count_weekly", 1);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "aigc_avatar_setting", true) == 1) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("aigc_creative_slow_max_limit_period_daily", true)) {
                i = 2131755011;
            } else {
                i = 2131755012;
            }
        } else {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("aigc_creative_slow_max_limit_period_daily", true)) {
                i = 2131755014;
            } else {
                i = 2131755015;
            }
        }
        C786410Ut5.U8(SR(), new View.OnClickListener() { // from class: X.0hsP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1221880hty c1221880hty = C1221880hty.LIZ;
                Integer numValueOf = Integer.valueOf(this.LL.WR().getState().LLILLJJLI.LIZ.size());
                c1221880hty.getClass();
                C1221880hty.LIZ(numValueOf, "continue");
                C1221880hty.LJII("show");
                if (C0DHG.LIZ() && C1388190mED.LIZ(view2.getContext()) != null) {
                    C632670Orh.LIZIZ(view2.getContext(), new C19719212De(2134958462, new C1220900hsO(view2, i, iLJ, this.LL), true));
                    return;
                }
                C1397580mTM c1397580mTM = new C1397580mTM(view2.getContext());
                Resources resources = view2.getContext().getResources();
                int i2 = i;
                int i3 = iLJ;
                c1397580mTM.LIZIZ(resources.getQuantityString(i2, i3, Integer.valueOf(i3)));
                C985403tE.LIZ(c1397580mTM, new AwS385S0200000_19(view2, this.LL, 116));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
        });
        ProfileAigcStyleViewModel.wQ2(WR(), new C2217381BqS() { // from class: X.0hsW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NPS) obj).LLILLJJLI;
            }
        }, new AwS581S0100000_2(this, 561));
        View viewFindViewById2 = null;
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 352), 3);
        ProfileAigcStyleViewModel.wQ2(WR(), new C2217381BqS() { // from class: X.0hsS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0NPS) obj).LL;
            }
        }, new AwS598S0100000_19(this, 353));
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.evr);
            }
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        ((RecyclerView) view2).addOnScrollListener(new AsS46S0100000_19(this, 12));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        C19EG activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new C1265780j2m(this, 3));
        }
        C1221880hty.LIZ.getClass();
        C19GS c19gs = null;
        C1221880hty.LIZ(null, "show");
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ebi, viewGroup, false);
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
