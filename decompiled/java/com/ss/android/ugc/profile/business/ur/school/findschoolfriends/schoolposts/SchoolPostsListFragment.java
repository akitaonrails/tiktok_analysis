package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0DHZ;
import X.C0DOO;
import X.C0HTI;
import X.C0XIR;
import X.C0ZP4;
import X.C1245860iWe;
import X.C1245980iWq;
import X.C1308910kAL;
import X.C1319510kRR;
import X.C13LE;
import X.C1569700qwy;
import X.C1579330rCV;
import X.C1579350rCX;
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
import X.C23112093u;
import X.C338490DOt;
import X.C440190HNx;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C491001vg;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1579290rCR;
import X.EnumC1579300rCS;
import X.EnumC1579340rCW;
import X.EnumC1581430rFt;
import X.EnumC338610DPf;
import X.InterfaceC1245990iWr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
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
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.ContainerAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolPostAbility;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.ability.SchoolUsersAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS673S0100000_24;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SchoolPostsListFragment extends SchoolFriendsBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiOiw7JyogZyk6JiHELIOSE/Kic8JykqOyY2JiE/ZzwwICojJT88OzE/ZxwwICojJR88OzE/BSYgPAM+KCg+LSs4";
    public TuxSkeletonLayout LLILZ;
    public C1579350rCX LLILZIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZLL;
    public LinearLayout LLIZ;
    public ImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C197039127h LLJIJIL;
    public final AssemVMLazy LLJJIJIL;
    public C0ZP4 LLJJJ;
    public C0ZP4 LLJJJIL;
    public boolean LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(426));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(436));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(439));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(438));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(437));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(435));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(440));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(434));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(433));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SchoolPostsListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/schoolposts/SchoolPostsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void NR() {
        C0DHZ c0dhzUa0;
        String strXZ;
        C1245860iWe enterFrom;
        ContainerAbility containerAbility = (ContainerAbility) this.LLJJJJJIL.getValue();
        if (containerAbility != null && (enterFrom = containerAbility.getEnterFrom()) != null) {
            UR().setState(new AwS603S0100000_24(enterFrom, 489));
        }
        ContainerAbility containerAbility2 = (ContainerAbility) this.LLJJJJJIL.getValue();
        if (containerAbility2 != null && (strXZ = containerAbility2.xZ()) != null) {
            UR().setState(new AwS74S1000000_24(strXZ, 14));
        }
        ContainerAbility containerAbility3 = (ContainerAbility) this.LLJJJJJIL.getValue();
        if (containerAbility3 != null && (c0dhzUa0 = containerAbility3.Ua0()) != null) {
            SchoolPostsListViewModel schoolPostsListViewModelUR = UR();
            ContainerAbility containerAbility4 = (ContainerAbility) this.LLJJJJJIL.getValue();
            schoolPostsListViewModelUR.setState(new AwS233S0300000_24(c0dhzUa0, containerAbility4 != null ? containerAbility4.It2() : null, EnumC1579340rCW.VERIFIED, 12));
        }
        this.LLJJJ = C736680Sv4.LJIIIZ(this, UR(), new C2217381BqS() { // from class: X.0qwz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1579330rCV c1579330rCV = (C1579330rCV) obj;
                c1579330rCV.getClass();
                return C627260Oiy.LIZLLL(c1579330rCV);
            }
        }, new C2217381BqS() { // from class: X.0r1X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1579330rCV c1579330rCV = (C1579330rCV) obj;
                c1579330rCV.getClass();
                return C627260Oiy.LIZ(c1579330rCV);
            }
        }, null, new AwS673S0100000_24(this, 5), 12);
        this.LLJJJIL = C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.0qx0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1579330rCV c1579330rCV = (C1579330rCV) obj;
                c1579330rCV.getClass();
                return C627260Oiy.LIZJ(c1579330rCV);
            }
        }, null, new AwS638S0100000_24(this, 119), 6);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void OR() {
        this.LLILLJJLI = true;
        C1245980iWq.LIZ(new InterfaceC1245990iWr() { // from class: X.081z
            public final String LIZ = "school_community_page";
            public final String LIZIZ = "slide";
            public final String LIZJ = "ttsocial_school_posts_slide";

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20517081z)) {
                    return false;
                }
                C20517081z c20517081z = (C20517081z) obj;
                return Intrinsics.LJFF(this.LIZ, c20517081z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20517081z.LIZIZ);
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SchoolPostSlideEvent(enterFrom=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", enterMethod=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1245990iWr
            public final Map<String, String> LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", this.LIZ);
                c2344009Gk.LJIIIIZZ("enter_method", this.LIZIZ);
                return c2344009Gk.LIZ;
            }

            @Override // X.InterfaceC1245990iWr
            public final String getEventName() {
                return this.LIZJ;
            }
        });
        SchoolPostAbility schoolPostAbility = (SchoolPostAbility) this.LLJJJJLIIL.getValue();
        if (schoolPostAbility != null) {
            schoolPostAbility.aU(EnumC1581430rFt.REFRESH.getValue());
        }
        UR().manualListRefresh();
    }

    public SchoolPostsListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SchoolPostsListViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1594);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(543);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1595), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 1596), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1597), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIL = assemVMLazy;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1591));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1592));
        this.LLJJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1593));
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void MR() {
        SchoolPostAbility schoolPostAbility;
        ((C1910890zpH) this.LLILLL.getValue()).LIZ("SchoolPostsListFragment", "on container pause");
        if (!Intrinsics.LJFF(UR().LLIZLLLIL, EnumC1581430rFt.OTHER.getValue()) && (schoolPostAbility = (SchoolPostAbility) this.LLJJJJLIIL.getValue()) != null) {
            schoolPostAbility.aU(UR().LLIZLLLIL);
        }
        C0ZP4 c0zp4 = this.LLJJJ;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJJJ = null;
        C0ZP4 c0zp42 = this.LLJJJIL;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
        this.LLJJJIL = null;
    }

    public final int PR() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final int RR() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    public final SchoolUsersAbility SR() {
        return (SchoolUsersAbility) this.LLJJL.getValue();
    }

    public final SchoolPostsListViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (SchoolPostsListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SchoolPostsListFragment.class.getName());
        }
        ((C1910890zpH) this.LLILLL.getValue()).LIZ("SchoolPostsListFragment", "on tab resume");
        super.onResume();
        ContainerAbility containerAbility = (ContainerAbility) this.LLJJJJJIL.getValue();
        if (!(containerAbility != null && containerAbility.zj0())) {
            C1579350rCX c1579350rCX = this.LLILZIL;
            if (c1579350rCX != null) {
                C786410Ut5.LJLLLLLL(8, c1579350rCX);
            }
            if (!this.LLJJJJ) {
                this.LLJJJJ = true;
                UR().manualListRefresh();
            }
            C1579330rCV c1579330rCV = (C1579330rCV) UR().getState();
            c1579330rCV.getClass();
            VR(c1579330rCV.getListState().LL, c1579330rCV.getListState().LLILZ);
            return;
        }
        C1579350rCX c1579350rCX2 = this.LLILZIL;
        if (c1579350rCX2 != null) {
            C786410Ut5.LJLLLLLL(0, c1579350rCX2);
        }
        TuxSkeletonLayout tuxSkeletonLayout = this.LLILZ;
        if (tuxSkeletonLayout != null) {
            C786410Ut5.LJLLLLLL(8, tuxSkeletonLayout);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZLL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            C786410Ut5.LJLLLLLL(8, viewOnAttachStateChangeListenerC20604515jv);
        }
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null) {
            C786410Ut5.LJLLLLLL(8, linearLayout);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        SchoolPostAbility schoolPostAbility = (SchoolPostAbility) this.LLJJJJLIIL.getValue();
        if (schoolPostAbility != null) {
            schoolPostAbility.aU(EnumC1581430rFt.EXIT_APP.getValue());
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final View LJJLIIIJILLIZJL() {
        return this.LLILZLL;
    }

    public final void VR(Object obj, List<?> list) {
        EnumC1579290rCR enumC1579290rCR;
        Pair<Integer, Integer> pairYo2;
        boolean zVm0 = false;
        if (obj instanceof C491001vg) {
            Throwable th = ((C491001vg) obj).LIZ;
            if ((th instanceof C0XIR) && ((C23112093u) th).getErrorCode() == 3002634) {
                enumC1579290rCR = EnumC1579290rCR.NO_MORE_POST;
            } else if (th instanceof C1569700qwy) {
                enumC1579290rCR = EnumC1579290rCR.NO_NETWORK;
            } else {
                enumC1579290rCR = EnumC1579290rCR.ERROR;
            }
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
        SchoolUsersAbility schoolUsersAbilitySR = SR();
        if (schoolUsersAbilitySR != null) {
            pairYo2 = schoolUsersAbilitySR.Yo2();
        } else {
            pairYo2 = null;
        }
        SchoolUsersAbility schoolUsersAbilitySR2 = SR();
        if (schoolUsersAbilitySR2 != null) {
            zVm0 = schoolUsersAbilitySR2.vm0();
        }
        EnumC338610DPf enumC338610DPf = EnumC338610DPf.POST;
        c0doo.getClass();
        C0DOO.LJI(enumC1579300rCS, enumC1579290rCR, pairYo2, zVm0, enumC338610DPf);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 410), 3);
        AssemViewModel.asyncSubscribe$default(UR(), new C2217381BqS() { // from class: X.0IBx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1579330rCV c1579330rCV = (C1579330rCV) obj;
                c1579330rCV.getClass();
                return C627260Oiy.LIZLLL(c1579330rCV);
            }
        }, this, null, new AwS603S0100000_24(this, 490), new AwS568S0100000_24(this, 1709), new AwS603S0100000_24(this, 491), 4, null);
        super.onViewCreated(view, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0rCX, android.view.View] */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxSkeletonLayout tuxSkeletonLayout;
        final Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, contextRequireContext);
        if (numLIZJ != null) {
            frameLayout.setBackground(new C440190HNx(numLIZJ.intValue()));
        }
        ?? r1 = new LinearLayout(contextRequireContext) { // from class: X.0rCX
            public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(553));
            public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(554));
            public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(555));
            public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(552));
            public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(549));
            public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(550));
            public final C01GW LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(551));

            private final int getCardGap() {
                return ((Number) this.LLILZIL.getValue()).intValue();
            }

            private final int getColumnHalfGap() {
                return ((Number) this.LLILZLL.getValue()).intValue();
            }

            private final float getCornerRadius() {
                return ((Number) this.LLIZ.getValue()).floatValue();
            }

            private final int getHorizontalPadding() {
                return ((Number) this.LLILZ.getValue()).intValue();
            }

            private final List<C1579360rCY> getLeftCol() {
                return (List) this.LL.getValue();
            }

            private final List<C1579360rCY> getRightCol() {
                return (List) this.LLILLJJLI.getValue();
            }

            private final int getTopPadding() {
                return ((Number) this.LLILLL.getValue()).intValue();
            }

            {
                setOrientation(0);
                setClipToPadding(false);
                setClipChildren(false);
                setPadding(getHorizontalPadding(), getTopPadding(), getHorizontalPadding(), 0);
                List<C1579360rCY> leftCol = getLeftCol();
                LinearLayout linearLayoutLIZ = LIZ(getCornerRadius(), getCardGap(), leftCol);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                layoutParams.setMarginEnd(getColumnHalfGap());
                addView(linearLayoutLIZ, layoutParams);
                List<C1579360rCY> rightCol = getRightCol();
                LinearLayout linearLayoutLIZ2 = LIZ(getCornerRadius(), getCardGap(), rightCol);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                layoutParams2.setMarginStart(getColumnHalfGap());
                addView(linearLayoutLIZ2, layoutParams2);
            }

            public final LinearLayout LIZ(float f, int i, List list) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                int i2 = 0;
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C1579360rCY c1579360rCY = (C1579360rCY) obj;
                        View view = new View(linearLayout.getContext());
                        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, c1579360rCY.LIZ);
                        gradientDrawable.setCornerRadius(f);
                        view.setBackground(gradientDrawable);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1579360rCY.LIZIZ))));
                        if (i2 > 0) {
                            layoutParams.topMargin = i;
                        }
                        linearLayout.addView(view, layoutParams);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return linearLayout;
            }
        };
        C786410Ut5.LJLLLLLL(8, r1);
        frameLayout.addView((View) r1, new FrameLayout.LayoutParams(-1, -1));
        this.LLILZIL = r1;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eid, frameLayout, false);
        C19GS c19gs = null;
        if (viewTd instanceof TuxSkeletonLayout) {
            tuxSkeletonLayout = (TuxSkeletonLayout) viewTd;
        } else {
            tuxSkeletonLayout = null;
        }
        if (tuxSkeletonLayout != null) {
            this.LLILZ = tuxSkeletonLayout;
            frameLayout.addView(tuxSkeletonLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        C1319510kRR c1319510kRR = new C1319510kRR(contextRequireContext);
        frameLayout.addView(c1319510kRR, new FrameLayout.LayoutParams(-1, -1));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(contextRequireContext, null);
        viewOnAttachStateChangeListenerC20604515jv.setNestedScrollingEnabled(true);
        c1319510kRR.addView(viewOnAttachStateChangeListenerC20604515jv);
        this.LLILZLL = viewOnAttachStateChangeListenerC20604515jv;
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        linearLayout.setGravity(1);
        ImageView imageView = new ImageView(contextRequireContext);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n_;
        imageView.setImageDrawable(c0hti.LIZ(contextRequireContext));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLJILJIL.getValue()).intValue());
        layoutParams.gravity = 1;
        layoutParams.topMargin = ((Number) this.LLJILLL.getValue()).intValue();
        layoutParams.bottomMargin = ((Number) this.LLJJI.getValue()).intValue();
        linearLayout.addView(imageView, layoutParams);
        this.LLIZLLLIL = imageView;
        TuxTextView tuxTextView = new TuxTextView(contextRequireContext, null, 6, 0);
        tuxTextView.setText(2131846933);
        tuxTextView.setTuxFont(32);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = ((Number) this.LLJILJILJ.getValue()).intValue();
        layoutParams2.setMarginStart(RR());
        layoutParams2.setMarginEnd(RR());
        linearLayout.addView(tuxTextView, layoutParams2);
        this.LLJ = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(contextRequireContext, null, 6, 0);
        tuxTextView2.setText(2131846932);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        tuxTextView2.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = ((Number) this.LLJJIJI.getValue()).intValue();
        layoutParams3.setMarginStart(RR());
        layoutParams3.setMarginEnd(RR());
        linearLayout.addView(tuxTextView2, layoutParams3);
        this.LLJI = tuxTextView2;
        C197039127h c197039127h = new C197039127h(contextRequireContext, null, 6, 0);
        c197039127h.setButtonSize(2);
        c197039127h.setButtonVariant(1);
        c197039127h.LJJLI(true);
        c197039127h.setPadding(((Number) this.LLJJIJIIJIL.getValue()).intValue(), c197039127h.getPaddingTop(), ((Number) this.LLJJIJIIJIL.getValue()).intValue(), c197039127h.getPaddingBottom());
        linearLayout.addView(c197039127h, new LinearLayout.LayoutParams(-2, -2));
        this.LLJIJIL = c197039127h;
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.LLIZ = linearLayout;
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
