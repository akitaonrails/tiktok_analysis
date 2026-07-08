package com.ss.android.ugc.profile.business.ur.following.ui;

import X.AnonymousClass0395;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0DLI;
import X.C0HTI;
import X.C0I7D;
import X.C0JAM;
import X.C0JAU;
import X.C0XKC;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1264980j1U;
import X.C1265110j1h;
import X.C13LE;
import X.C14EU;
import X.C1546210qL5;
import X.C1622206Wu;
import X.C1722300uv6;
import X.C1749260vca;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C295390Bhx;
import X.C338490DOt;
import X.C431260Gvc;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C888460YtI;
import X.C948503nH;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1264300j0O;
import X.InterfaceC1264910j1N;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationInfoViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.RelationTabViewModel;
import com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowerRelationFragment extends BaseRelationFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiHELIOSLyA/JCo7ICE0ZjAlZwk8JCkjPiohGiAgKDs6JysKOy40JSAiPQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public C1749260vca LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowerRelationFragment.class, "followerRelationViewModel", "getFollowerRelationViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowerListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FollowerRelationFragment.class, "followRelationTabAssemViewModel", "getFollowRelationTabAssemViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/RelationTabViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FollowerRelationFragment.class, "searchVM", "getSearchVM()Lcom/ss/android/ugc/profile/business/ur/following/vm/RelationSearchVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(FollowerRelationFragment.class, "followRelationInfoViewModel", "getFollowRelationInfoViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowRelationInfoViewModel;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int PR() {
        return 2131845496;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int getLayoutId() {
        return R.layout.ed4;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public FollowerRelationFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        AssemVMLazy assemVMLazy3;
        boolean z3;
        boolean z4;
        AssemVMLazy assemVMLazy4;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowerListViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2291);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(422);
        InterfaceC724760Sbq interfaceC724760Sbq2 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq2)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2293), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 2294), aFwS257S0000000_19, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2295), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FollowRelationTabViewModel.class);
        this.LLJJIII = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ2, c19719912DlLIZ2, 106));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RelationTabViewModel.class);
        AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c19719912DlLIZ3, 2296);
        AFwS257S0000000_19 aFwS257S0000000_192 = AFwS257S0000000_19.get$arr$(423);
        if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_192, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2276), aFwS257S0000000_192, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_192, new AwS563S0100000_19((Fragment) this, 2277), aFwS257S0000000_192, null, null, null);
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_192, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2283), aFwS257S0000000_192, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJI = assemVMLazy2;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2280));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(RelationSearchVM.class);
        AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c19719912DlLIZ4, 2284);
        AFwS257S0000000_19 aFwS257S0000000_193 = AFwS257S0000000_19.get$arr$(420);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq2)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_193, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2285), aFwS257S0000000_193, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z4 = true;
            z3 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_193, new AwS563S0100000_19((Fragment) this, 2286), aFwS257S0000000_193, null, null, null);
            z3 = false;
            z4 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = false;
            z4 = true;
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_193, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2287), aFwS257S0000000_193, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIL = assemVMLazy3;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(FollowRelationInfoViewModel.class);
        AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ5, 2288);
        AFwS257S0000000_19 aFwS257S0000000_194 = AFwS257S0000000_19.get$arr$(421);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq2)) {
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS563S0100000_194, new C452070Ho5(), new C1622206Wu(this, z4), new C338490DOt(this, z4), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2289), aFwS257S0000000_194, new C451460Hn6(this, z4), new C451620HnM(this, z4), new C987103tV(this, z4));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS563S0100000_194, new AwS563S0100000_19((Fragment) this, 2290), aFwS257S0000000_194, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS563S0100000_194, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2292), aFwS257S0000000_194, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
        }
        this.LLJJJ = assemVMLazy4;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2282));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2281));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2279));
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void UR() {
        InterfaceC1264300j0O interfaceC1264300j0O = (InterfaceC1264300j0O) this.LLJJJJ.getValue();
        if (interfaceC1264300j0O != null) {
            interfaceC1264300j0O.m6();
        }
        C0JAM c0jamLIZIZ = C0JAU.LIZIZ();
        if (!c0jamLIZIZ.LIZLLL) {
            c0jamLIZIZ.LJIIJ(null, null, null, c0jamLIZIZ.LJ(), false);
        }
    }

    public final InterfaceC1264910j1N aS() {
        return (InterfaceC1264910j1N) this.LLJJIJIIJIL.getValue();
    }

    public final FollowerListViewModel bS() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (FollowerListViewModel) assemVMLazy.getValue();
    }

    public final TuxTextView cS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.igm) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ConstraintLayout dS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.weak_guidance_container) : null;
            this.LLJILJIL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void onPageSelected() {
        InterfaceC1264300j0O interfaceC1264300j0O = (InterfaceC1264300j0O) this.LLJJJJ.getValue();
        if (interfaceC1264300j0O != null) {
            interfaceC1264300j0O.XR();
        }
        C0JAU.LIZIZ().LJFF();
        C0JAU.LIZIZ().LJII(0L);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJFF() {
        bS().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int NR() {
        return RR() ? 2131834823 : 2131834824;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int OR() {
        RR();
        return 2131834822;
    }

    public final void ZR() {
        cS().setText(AnonymousClass0395.LIZ(R.attr.a1r, requireContext(), getString(2131834802), getString(2131834803), new AwS563S0100000_19(this, 2278)));
        cS().setMovementMethod(C431260Gvc.LIZ);
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.e26) : null;
            this.LLJILLL = (TuxIconView) viewFindViewById;
        }
        C948503nH.LJIILIIL(viewFindViewById, null, new C1264980j1U(this, null), 3);
        C786410Ut5.LL(0, dS());
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final String getEnterFrom() {
        return RR() ? "fans" : "other_fans";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC420801kM interfaceC420801kM;
        super.onDestroy();
        String str = this.LLILLL;
        if (C295390Bhx.LIZ() != 3 || (interfaceC420801kM = (InterfaceC420801kM) ((Map) C1265110j1h.LIZ.getValue()).get(str)) == null) {
            return;
        }
        interfaceC420801kM.dispose();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C0I7D editTextView;
        super.onPause();
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u78) : null;
            this.LLJJ = (C1749260vca) viewFindViewById;
        }
        C1749260vca c1749260vca = (C1749260vca) viewFindViewById;
        if (c1749260vca == null || (editTextView = c1749260vca.getEditTextView()) == null) {
            return;
        }
        editTextView.setCursorVisible(false);
        editTextView.clearFocus();
        C0DLI.LIZ(getActivity(), editTextView);
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str = c0xkc.LIZ;
        if (str != null) {
            if (a0.LJJIIZI(str, "/aweme/v1/user/follower/list/?", false) || a0.LJJIIZI(str, "/aweme/v1/user/following/list/?", false)) {
                EventBus.LIZLLL().LIZIZ(c0xkc);
                LJFF();
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        String uid;
        User user = c888460YtI.LIZ;
        if (user != null && (uid = user.getUid()) != null) {
            FollowerListViewModel followerListViewModelBS = bS();
            followerListViewModelBS.Cn(new AwS133S1100000_19(followerListViewModelBS, uid, 25));
        }
    }

    public static void gS(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "fans");
        c2344009Gk.LJIIIIZZ("click", str);
        c2344009Gk.LIZJ(i, "is_private_notice");
        C20684815ws.LJIILLIIL("click_following_fans_list_setting_notice", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void WR(C1749280vcc c1749280vcc, Exception exc) {
        if (!RR() && getContext() != null) {
            super.WR(c1749280vcc, exc);
            return;
        }
        c1749280vcc.setLayoutVariant(0);
        C1546210qL5.LIZ.getClass();
        c1749280vcc.setTopMargin(C1546210qL5.LIZ(150));
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.nl;
        Drawable drawableLIZ = c0hti.LIZ(requireContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJI = getString(R.string.m25);
        c1722300uv6.LJIIIIZZ = getString(R.string.f8c);
        c1722300uv6.LJIIIZ = new AwS598S0100000_19(this, 374);
        c1749280vcc.setStatus(c1722300uv6);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0299  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.following.ui.FollowerRelationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        boolean zLJI = MethodIDManager.LJI(72035);
        C0ZP4 c0zp4LJIILJJIL = C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c0zp4LJIILJJIL;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
