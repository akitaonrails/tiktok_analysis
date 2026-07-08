package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0DHZ;
import X.C0DOO;
import X.C0HTI;
import X.C0ZP4;
import X.C1236480iHW;
import X.C1308910kAL;
import X.C1319510kRR;
import X.C13LE;
import X.C1622206Wu;
import X.C1623606Xi;
import X.C1685300txQ;
import X.C189200o6;
import X.C1910890zpH;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C338490DOt;
import X.C440190HNx;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C491001vg;
import X.C616540OGe;
import X.C627260Oiy;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1007380cK0;
import X.EnumC1579290rCR;
import X.EnumC1579300rCS;
import X.EnumC338610DPf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS673S0100000_24;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SchoolGroupsListFragment extends SchoolFriendsBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiOiw7JyogZyk6JiE/HELIOSKic8JykqOyY2JiE/ZzwwICojJSghJzA8OmEAKy0jJiMUOio5OTwfITY4Dz0yLygpJzs=";
    public TuxSkeletonLayout LLILZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZIL;
    public LinearLayout LLILZLL;
    public ImageView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public C197039127h LLJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public C0ZP4 LLJJIJIL;
    public boolean LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(425));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(428));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(431));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(430));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(429));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(427));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(432));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(426));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(425));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SchoolGroupsListFragment.class, "schoolGroupsListVM", "getSchoolGroupsListVM()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/schoolgroups/SchoolGroupsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void NR() {
        RR().LIZ("SchoolGroupsListFragment", "on container resume");
        this.LLJJIJIL = C736680Sv4.LJIIIZ(this, SR(), new C2217381BqS() { // from class: X.0rCT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1236480iHW c1236480iHW = (C1236480iHW) obj;
                c1236480iHW.getClass();
                return C627260Oiy.LIZLLL(c1236480iHW);
            }
        }, new C2217381BqS() { // from class: X.0rCU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1236480iHW c1236480iHW = (C1236480iHW) obj;
                c1236480iHW.getClass();
                return C627260Oiy.LIZ(c1236480iHW);
            }
        }, null, new AwS673S0100000_24(this, 4), 12);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void OR() {
        this.LLILLJJLI = true;
        SR().setState(new AwS598S0100000_19(EnumC1007380cK0.ACTIVE, 533));
        SR().manualListRefresh();
    }

    public SchoolGroupsListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SchoolGroupsListViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1584);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(540);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1585), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 1586), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1587), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIIJIL = assemVMLazy;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1582));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1583));
    }

    public final int PR() {
        return ((Number) this.LLJJI.getValue()).intValue();
    }

    public final C1910890zpH RR() {
        return (C1910890zpH) this.LLILLL.getValue();
    }

    public final SchoolGroupsListViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (SchoolGroupsListViewModel) assemVMLazy.getValue();
    }

    public final SchoolUsersAbility UR() {
        return (SchoolUsersAbility) this.LLJJJJ.getValue();
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void MR() {
        RR().LIZ("SchoolGroupsListFragment", "on container pause");
        C0ZP4 c0zp4 = this.LLJJIJIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJJIJIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SchoolGroupsListFragment.class.getName());
        }
        RR().LIZ("SchoolGroupsListFragment", "on tab resume");
        super.onResume();
        if (!this.LLJJJ) {
            this.LLJJJ = true;
            RR().LIZ("SchoolGroupsListFragment", "manual list refresh (first show this container session)");
            SR().manualListRefresh();
        }
        C1236480iHW c1236480iHW = (C1236480iHW) SR().getState();
        c1236480iHW.getClass();
        VR(C627260Oiy.LIZLLL(c1236480iHW), C627260Oiy.LIZ(c1236480iHW));
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final View LJJLIIIJILLIZJL() {
        return this.LLILZIL;
    }

    public final void VR(Object obj, List<?> list) {
        EnumC1579290rCR enumC1579290rCR;
        Pair<Integer, Integer> pairYo2;
        boolean zVm0 = false;
        if (obj instanceof C491001vg) {
            enumC1579290rCR = EnumC1579290rCR.ERROR;
        } else {
            if (!(obj instanceof C1623606Xi)) {
                return;
            }
            if (list != null && !list.isEmpty()) {
                return;
            } else {
                enumC1579290rCR = EnumC1579290rCR.NO_CONTENT;
            }
        }
        C0DOO c0doo = C0DOO.LIZ;
        EnumC1579300rCS enumC1579300rCS = EnumC1579300rCS.SHOW;
        SchoolUsersAbility schoolUsersAbilityUR = UR();
        if (schoolUsersAbilityUR != null) {
            pairYo2 = schoolUsersAbilityUR.Yo2();
        } else {
            pairYo2 = null;
        }
        SchoolUsersAbility schoolUsersAbilityUR2 = UR();
        if (schoolUsersAbilityUR2 != null) {
            zVm0 = schoolUsersAbilityUR2.vm0();
        }
        EnumC338610DPf enumC338610DPf = EnumC338610DPf.GROUP;
        c0doo.getClass();
        C0DOO.LJI(enumC1579300rCS, enumC1579290rCR, pairYo2, zVm0, enumC338610DPf);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0DHZ c0dhzUa0;
        String str;
        RR().LIZ("SchoolGroupsListFragment", "on view created");
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 408), 3);
        AssemViewModel.asyncSubscribe$default(SR(), new C2217381BqS() { // from class: X.0IBw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1236480iHW c1236480iHW = (C1236480iHW) obj;
                c1236480iHW.getClass();
                return C627260Oiy.LIZLLL(c1236480iHW);
            }
        }, this, null, new AwS603S0100000_24(this, 447), new AwS568S0100000_24(this, 1641), new AwS603S0100000_24(this, 448), 4, null);
        ContainerAbility containerAbility = (ContainerAbility) this.LLJJJIL.getValue();
        if (containerAbility != null && containerAbility.Zv1()) {
            SR().setState(new AwS598S0100000_19(EnumC1007380cK0.TOP_NEW, 533));
        } else {
            SR().setState(new AwS598S0100000_19(EnumC1007380cK0.ACTIVE, 533));
        }
        ContainerAbility containerAbility2 = (ContainerAbility) this.LLJJJIL.getValue();
        if (containerAbility2 != null && (c0dhzUa0 = containerAbility2.Ua0()) != null && (str = c0dhzUa0.LIZIZ) != null) {
            SR().setState(new AwS70S1000000_19(str, 15));
        }
        super.onViewCreated(view, bundle);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RR().LIZ("SchoolGroupsListFragment", "on create view");
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, contextRequireContext);
        if (numLIZJ != null) {
            frameLayout.setBackground(new C440190HNx(numLIZJ.intValue()));
        }
        C19GS c19gs = null;
        TuxSkeletonLayout tuxSkeletonLayout = new TuxSkeletonLayout(contextRequireContext, null, 6);
        tuxSkeletonLayout.setRepeatOrientation(1);
        tuxSkeletonLayout.setPreviewItemRes(R.layout.eco);
        frameLayout.addView(tuxSkeletonLayout, new FrameLayout.LayoutParams(-1, -1));
        this.LLILZ = tuxSkeletonLayout;
        C1319510kRR c1319510kRR = new C1319510kRR(contextRequireContext);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(contextRequireContext, null);
        viewOnAttachStateChangeListenerC20604515jv.setNestedScrollingEnabled(true);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(contextRequireContext));
        this.LLILZIL = viewOnAttachStateChangeListenerC20604515jv;
        c1319510kRR.addView(viewOnAttachStateChangeListenerC20604515jv);
        frameLayout.addView(c1319510kRR, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        linearLayout.setGravity(1);
        ImageView imageView = new ImageView(contextRequireContext);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n_;
        imageView.setImageDrawable(c0hti.LIZ(contextRequireContext));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLJIJIL.getValue()).intValue());
        layoutParams.gravity = 1;
        layoutParams.topMargin = ((Number) this.LLJILJILJ.getValue()).intValue();
        layoutParams.bottomMargin = ((Number) this.LLJJ.getValue()).intValue();
        linearLayout.addView(imageView, layoutParams);
        this.LLIZ = imageView;
        TuxTextView tuxTextView = new TuxTextView(contextRequireContext, null, 6, 0);
        tuxTextView.setText(2131846933);
        tuxTextView.setTuxFont(32);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = ((Number) this.LLJILJIL.getValue()).intValue();
        layoutParams2.setMarginStart(PR());
        layoutParams2.setMarginEnd(PR());
        linearLayout.addView(tuxTextView, layoutParams2);
        this.LLIZLLLIL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(contextRequireContext, null, 6, 0);
        tuxTextView2.setText(2131846932);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        tuxTextView2.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = ((Number) this.LLJJIII.getValue()).intValue();
        layoutParams3.setMarginStart(PR());
        layoutParams3.setMarginEnd(PR());
        linearLayout.addView(tuxTextView2, layoutParams3);
        this.LLJ = tuxTextView2;
        C197039127h c197039127h = new C197039127h(contextRequireContext, null, 6, 0);
        c197039127h.setButtonSize(2);
        c197039127h.setButtonVariant(1);
        c197039127h.LJJLI(true);
        c197039127h.setPadding(((Number) this.LLJJIJI.getValue()).intValue(), c197039127h.getPaddingTop(), ((Number) this.LLJJIJI.getValue()).intValue(), c197039127h.getPaddingBottom());
        linearLayout.addView(c197039127h, new LinearLayout.LayoutParams(-2, -2));
        this.LLJI = c197039127h;
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.LLILZLL = linearLayout;
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
