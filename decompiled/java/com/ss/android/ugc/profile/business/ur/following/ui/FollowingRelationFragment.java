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
import X.C0W93;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XKC;
import X.C0ZP4;
import X.C11EA;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1264420j0a;
import X.C1264970j1T;
import X.C1265010j1X;
import X.C1265110j1h;
import X.C1308910kAL;
import X.C1385040m98;
import X.C13LE;
import X.C14EU;
import X.C1546210qL5;
import X.C1622206Wu;
import X.C1722300uv6;
import X.C1749260vca;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C1910890zpH;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20533215Wg;
import X.C20642515q3;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C287530BOt;
import X.C288690BTf;
import X.C295390Bhx;
import X.C300120Bpa;
import X.C338490DOt;
import X.C419910GdJ;
import X.C431260Gvc;
import X.C446980Hfs;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C818480W8w;
import X.C888460YtI;
import X.C948503nH;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1073860e3E;
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
import X.ViewOnClickListenerC1203580hQS;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.PrivacySetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationInfoViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.RelationTabViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowingRelationFragment extends BaseRelationFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiHELIOSLyA/JCo7ICE0ZjAlZwk8JCkjPiY9LxcpJS4nISoiDz0yLygpJzs=";
    public C1749280vcc LLJIJIL;
    public C1749280vcc LLJILJIL;
    public LinearLayout LLJILJILJ;
    public C1749260vca LLJILLL;
    public ConstraintLayout LLJJ;
    public ViewOnClickListenerC1203580hQS LLJJI;
    public C0I7D LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final C01GW LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public long LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowingRelationFragment.class, "followingRelationViewModel", "getFollowingRelationViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowingListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FollowingRelationFragment.class, "followRelationTabAssemViewModel", "getFollowRelationTabAssemViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/RelationTabViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FollowingRelationFragment.class, "followRelationInfoViewModel", "getFollowRelationInfoViewModel()Lcom/ss/android/ugc/profile/business/ur/following/ui/viewmodel/FollowRelationInfoViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int PR() {
        return 2131845495;
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
        return R.layout.ed7;
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

    public FollowingRelationFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        boolean z3;
        AssemVMLazy assemVMLazy3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowingListViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2308);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(425);
        InterfaceC724760Sbq interfaceC724760Sbq2 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq2)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2309), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 2310), aFwS257S0000000_19, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2311), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FollowRelationTabViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ2, c19719912DlLIZ2, 107));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RelationTabViewModel.class);
        AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c19719912DlLIZ3, 2312);
        AFwS257S0000000_19 aFwS257S0000000_192 = AFwS257S0000000_19.get$arr$(426);
        if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_192, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2313), aFwS257S0000000_192, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
            z3 = false;
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_192, new AwS563S0100000_19((Fragment) this, 2314), aFwS257S0000000_192, null, null, null);
            z2 = true;
            z3 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            z3 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS563S0100000_192, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2303), aFwS257S0000000_192, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJIL = assemVMLazy2;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2299));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(FollowRelationInfoViewModel.class);
        AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c19719912DlLIZ4, 2304);
        AFwS257S0000000_19 aFwS257S0000000_193 = AFwS257S0000000_19.get$arr$(424);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq2)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_193, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2305), aFwS257S0000000_193, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_193, new AwS563S0100000_19((Fragment) this, 2306), aFwS257S0000000_193, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS563S0100000_193, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2307), aFwS257S0000000_193, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
        }
        this.LLJJJJJIL = assemVMLazy3;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2302));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2297));
        this.LLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2300));
        this.LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2301));
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void LJFF() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        ((FollowingListViewModel) assemVMLazy.getValue()).refresh();
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void UR() {
        InterfaceC1073860e3E interfaceC1073860e3E = (InterfaceC1073860e3E) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (interfaceC1073860e3E != null) {
            interfaceC1073860e3E.m6();
        }
        InterfaceC1264300j0O interfaceC1264300j0O = (InterfaceC1264300j0O) this.LLJL.getValue();
        if (interfaceC1264300j0O != null) {
            interfaceC1264300j0O.m6();
        }
        C0JAM c0jamLIZJ = C0JAU.LIZJ();
        if (!c0jamLIZJ.LIZLLL) {
            c0jamLIZJ.LJIIJ(null, null, null, c0jamLIZJ.LJ(), false);
        }
    }

    public final void aS() {
        int i = C2187451AjH.LIZ;
        this.LLJJL = true;
        String string = getString(2131834802);
        String string2 = getString(2131834803);
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.igm) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        ((TextView) viewFindViewById).setText(AnonymousClass0395.LIZ(R.attr.a1r, requireContext(), string, string2, new AwS563S0100000_19(this, 2298)));
        View viewFindViewById2 = this.LLJJIJI;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.igm) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById2;
        }
        ((TextView) viewFindViewById2).setMovementMethod(C431260Gvc.LIZ);
        View viewFindViewById3 = this.LLJJIJIIJIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            viewFindViewById3 = view3 != null ? view3.findViewById(R.id.e26) : null;
            this.LLJJIJIIJIL = (TuxIconView) viewFindViewById3;
        }
        C948503nH.LJIILIIL(viewFindViewById3, null, new C1264970j1T(this, null), 3);
        C786410Ut5.LL(0, hS());
    }

    public final C0I7D bS() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hdh) : null;
            this.LLJJIII = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final InterfaceC1264910j1N cS() {
        return (InterfaceC1264910j1N) this.LLJJJJ.getValue();
    }

    public final C1749280vcc dS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.igx) : null;
            this.LLJILJIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1749280vcc gS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w2e) : null;
            this.LLJIJIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final ConstraintLayout hS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.weak_guidance_container) : null;
            this.LLJJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final void onPageSelected() {
        InterfaceC1264300j0O interfaceC1264300j0O = (InterfaceC1264300j0O) this.LLJL.getValue();
        if (interfaceC1264300j0O != null) {
            interfaceC1264300j0O.XR();
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int NR() {
        return RR() ? 2131834842 : 2131834844;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final int OR() {
        RR();
        return 2131834837;
    }

    public final void ZR() {
        if (RR()) {
            if (!getUserVisibleHint() || !isResumed()) {
                this.LLJLL = System.currentTimeMillis();
                return;
            }
            if (this.LLJLL <= 0 || System.currentTimeMillis() - this.LLJLL <= 60000) {
                return;
            }
            AssemVMLazy assemVMLazy = this.LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
            ((FollowingListViewModel) assemVMLazy.getValue()).refresh();
            this.LLJLL = 0L;
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.BaseRelationFragment
    public final String getEnterFrom() {
        return RR() ? "following" : "other_following";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC420801kM interfaceC420801kM;
        super.onDestroy();
        C818480W8w.LIZJ("follow_relation", C0W93.CANCEL, null, C2097608Jq.LJ());
        C0JAU.LIZJ().LIZIZ();
        C0JAU.LIZIZ().LIZIZ();
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
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ZR();
        bS().setCursorVisible(false);
        bS().clearFocus();
        C0DLI.LIZ(getActivity(), bS());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(FollowingRelationFragment.class.getName());
        }
        super.onResume();
        ZR();
    }

    public static void iS(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "following");
        c2344009Gk.LJIIIIZZ("click", str);
        c2344009Gk.LIZJ(0, "is_private_notice");
        C20684815ws.LJIILLIIL("click_following_fans_list_setting_notice", c2344009Gk.LIZ);
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
            AssemVMLazy assemVMLazy = this.LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
            FollowingListViewModel followingListViewModel = (FollowingListViewModel) assemVMLazy.getValue();
            C1910890zpH c1910890zpHWQ2 = followingListViewModel.wQ2();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[FDUP] remove uid=");
            sbLIZ.append(uid);
            sbLIZ.append(", existingUidsSize=");
            sbLIZ.append(followingListViewModel.LLJI.size());
            c1910890zpHWQ2.LJII("FOLLOWING_LIST_VM", C2188811AlT.LIZIZ(sbLIZ));
            followingListViewModel.LLJI.remove(uid);
            followingListViewModel.setState(new AwS70S1000000_19(uid, 20));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/profile/business/ur/following/ui/FollowingRelationFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDmOIvzegUTreHXGGb6s+0fuLHVXkvITz3V+ZlYSLUBAgvQ7O3xPw=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (!this.LLJLILLLLZIIL) {
                this.LLJLILLLLZIIL = true;
                C818480W8w.LIZ("follow_relation");
            }
        } else if (bS() != null) {
            C0DLI.LIZ(getActivity(), bS());
        }
        ZR();
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(FollowingRelationFragment.class);
        }
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
        c1722300uv6.LJIIIZ = new AwS598S0100000_19(this, 375);
        c1749280vcc.setStatus(c1722300uv6);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        User user;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ;
        User user2;
        Integer numLIZ;
        Integer numLIZJ;
        PrivacySetting privacySetting;
        boolean zLJI = MethodIDManager.LJI(202438);
        super.onViewCreated(view, bundle);
        User user3 = this.LLILZ;
        if (user3 != null && (privacySetting = user3.getPrivacySetting()) != null && privacySetting.getFollowingVisibility() == 2) {
            z = true;
        } else {
            z = false;
        }
        String uniqueId = null;
        if (z) {
            String string = getString(2131834841);
            Object[] objArr = new Object[1];
            User user4 = this.LLILZ;
            if (user4 != null) {
                uniqueId = user4.getUniqueId();
            }
            objArr[0] = uniqueId;
            String string2 = getString(2131834840, objArr);
            C1749280vcc c1749280vccDS = dS();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_lock;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJI = string;
            c1722300uv6.LJIIIIZZ = string2;
            c1749280vccDS.setStatus(c1722300uv6);
            C786410Ut5.LLLZLZ(dS(), 0);
            if (C295390Bhx.LIZJ()) {
                dS().setLayoutVariant(0);
            }
        } else {
            if (RR()) {
                View viewFindViewById = this.LLJJI;
                if (viewFindViewById == null) {
                    View view2 = getView();
                    if (view2 != null) {
                        viewFindViewById = view2.findViewById(R.id.j2t);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLJJI = (ViewOnClickListenerC1203580hQS) viewFindViewById;
                }
                ((ViewOnClickListenerC1203580hQS) viewFindViewById).setIconImage(R.drawable.cz5);
                SpannableString spannableString = new SpannableString(C20642515q3.LJI(2131834845));
                String strLJI = C20642515q3.LJI(2131834846);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJI);
                sbLIZ.append(' ');
                SpannableString spannableString2 = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.p2(spannableString2, new ForegroundColorSpan(C446980Hfs.LIZ(getContext(), R.color.da)), 0, spannableString2.length(), 34);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) spannableString2);
                if (getContext() != null) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(C446980Hfs.LIZ(getContext(), R.color.s5)), 0, spannableString.length(), 34);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                View viewFindViewById2 = this.LLJJI;
                if (viewFindViewById2 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById2 = view3.findViewById(R.id.j2t);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLJJI = (ViewOnClickListenerC1203580hQS) viewFindViewById2;
                }
                ((ViewOnClickListenerC1203580hQS) viewFindViewById2).setTitleText(spannableStringBuilder);
            }
            AssemVMLazy assemVMLazy = this.LLJJJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
            assemVMLazy.getValue().setState(new C1265010j1X("following_relation", cS().iT1(), this.LLILZLL, cS().zZ(), RR()));
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, C1385040m98.LIZIZ(context))) != null) {
                int iIntValue = numLIZJ.intValue();
                View viewFindViewById3 = this.LLJILJILJ;
                if (viewFindViewById3 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById3 = view4.findViewById(R.id.uad);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLJILJILJ = (LinearLayout) viewFindViewById3;
                }
                viewFindViewById3.setBackgroundColor(iIntValue);
                View viewFindViewById4 = this.LLJILLL;
                if (viewFindViewById4 == null) {
                    View view5 = getView();
                    if (view5 != null) {
                        viewFindViewById4 = view5.findViewById(R.id.u78);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLJILLL = (C1749260vca) viewFindViewById4;
                }
                viewFindViewById4.setBackgroundColor(iIntValue);
            }
            if (((Boolean) this.LLJJJJLIIL.getValue()).booleanValue()) {
                C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 936), 3);
            }
            C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 920), 3);
            C786410Ut5.LL(8, hS());
            if (SR()) {
                C288690BTf.LIZ.getClass();
                C01GW c01gw = C288690BTf.LIZLLL;
                if (((Number) c01gw.getValue()).intValue() > 0 && (user = this.LLILZ) != null && user.getFollowingCount() > 0 && ((privacyUserSettingsV2LJIIIIZZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ()) == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("following")) == null || numLIZ.intValue() != 2)) {
                    int iIntValue2 = ((Number) c01gw.getValue()).intValue();
                    if (iIntValue2 == C288690BTf.LIZIZ) {
                        C1264420j0a.LIZ.getClass();
                        if (C1264420j0a.LIZLLL()) {
                            aS();
                        }
                    } else if (iIntValue2 == C288690BTf.LIZJ && (user2 = this.LLILZ) != null && user2.getFollowerCount() < ((Number) C287530BOt.LIZ.getValue()).intValue()) {
                        C1264420j0a.LIZ.getClass();
                        if (C1264420j0a.LIZLLL()) {
                            aS();
                        }
                    }
                }
            }
            if (C300120Bpa.LIZ()) {
                AssemViewModel value = this.LLJJJIL.getValue();
                C736680Sv4.LJIIIIZZ(this, value, new C2217381BqS() { // from class: X.0j1Y
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((FollowRelationState) obj).isFollowingTab());
                    }
                }, null, new AwS633S0100000_19(this, 320), 6);
                C736680Sv4.LJIIIIZZ(this, value, new C2217381BqS() { // from class: X.0j1e
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((FollowRelationState) obj).isPrivacyGuideClosed();
                    }
                }, null, new AwS633S0100000_19(this, 321), 6);
            } else {
                JediViewModel jediViewModel = (JediViewModel) this.LLJJJ.getValue();
                C11EA.LJII(this, jediViewModel, new C2217381BqS() { // from class: X.0j1Z
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((FollowRelationState) obj).isFollowingTab());
                    }
                }, new AwS633S0100000_19(this, 323));
                C11EA.LJII(this, jediViewModel, new C2217381BqS() { // from class: X.0j1f
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((FollowRelationState) obj).isPrivacyGuideClosed();
                    }
                }, new AwS633S0100000_19(this, 325));
            }
            C0JAU.LIZJ().LJFF();
            C0JAU.LIZJ().LJII(0L);
            InterfaceC1264300j0O interfaceC1264300j0O = (InterfaceC1264300j0O) this.LLJL.getValue();
            RecyclerView recyclerView = (RecyclerView) this.LLJLIL.getValue();
            if (interfaceC1264300j0O != null && recyclerView != null) {
                interfaceC1264300j0O.dt1(recyclerView);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
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
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
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
