package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0DOO;
import X.C0HTI;
import X.C0I00;
import X.C0I02;
import X.C0IE5;
import X.C0ZP4;
import X.C1261170ivL;
import X.C1308910kAL;
import X.C1319510kRR;
import X.C13LE;
import X.C1622206Wu;
import X.C1623606Xi;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C338490DOt;
import X.C346110DhZ;
import X.C346120Dha;
import X.C346160Dhe;
import X.C426750GoL;
import X.C440190HNx;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C459430Hzx;
import X.C460090I2l;
import X.C460110I2n;
import X.C460140I2q;
import X.C460150I2r;
import X.C491001vg;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C987103tV;
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
import androidx.lifecycle.LifecycleOwnerKt;
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
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS118S0201000_4;
import kotlin.jvm.internal.AwS152S0110000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SchoolUsersListFragment extends SchoolFriendsBaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiOiw7JyogZyk6JiHELIOSE/Kic8JykqOyY2JiE/ZzwwICojJTogLTc/ZxwwICojJRogLTc/BSYgPAM+KCg+LSs4";
    public C460140I2q LLILLL;
    public TuxSkeletonLayout LLILZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZIL;
    public LinearLayout LLILZLL;
    public ImageView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public C197039127h LLJI;
    public final boolean LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public int LLJLIL;
    public C0ZP4 LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public boolean LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SchoolUsersListFragment.class, "schoolUsersListVM", "getSchoolUsersListVM()Lcom/ss/android/ugc/profile/business/ur/school/findschoolfriends/schoolusers/SchoolUsersListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void NR() {
        SchoolUsersListViewModel schoolUsersListViewModelAS = aS();
        this.LLJLILLLLZIIL = selectSubscribe(schoolUsersListViewModelAS, new C2217381BqS() { // from class: X.0Dhb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C346160Dhe c346160Dhe = (C346160Dhe) obj;
                c346160Dhe.getClass();
                return C627260Oiy.LIZLLL(c346160Dhe);
            }
        }, new C2217381BqS() { // from class: X.0Dhc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C346160Dhe c346160Dhe = (C346160Dhe) obj;
                c346160Dhe.getClass();
                return C627260Oiy.LIZ(c346160Dhe);
            }
        }, new C2217381BqS() { // from class: X.0Hzz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C346160Dhe) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0Hzy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C346160Dhe) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.0I01
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C346160Dhe) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZIZ(schoolUsersListViewModelAS.usedInReusedScene), null, new C346120Dha(this));
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void OR() {
        this.LLILLJJLI = true;
        this.LLJLLL = false;
        SchoolUsersListViewModel schoolUsersListViewModelAS = aS();
        schoolUsersListViewModelAS.setState(AFwS232S0000000_4.get$arr$(215));
        schoolUsersListViewModelAS.manualListRefresh();
    }

    public SchoolUsersListFragment() {
        AssemVMLazy assemVMLazy;
        C1261170ivL.LIZ.getClass();
        this.LLJIJIL = C1261170ivL.LIZ();
        this.LLJILJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 348));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2228));
        this.LLJILLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2229));
        this.LLJJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 347));
        this.LLJJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2223));
        this.LLJJIII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2225));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2224));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2222));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2226));
        this.LLJJJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2221));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2227));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2234));
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2233));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2232));
        this.LLJJL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2231));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2230));
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SchoolUsersListViewModel.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 349);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(379);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 893), aFwS236S0000000_6, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new AwS550S0100000_6((Fragment) this, 894), aFwS236S0000000_6, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 895), aFwS236S0000000_6, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJL = assemVMLazy;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 346));
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final void MR() {
        C0ZP4 c0zp4 = this.LLJLILLLLZIIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLJLILLLLZIIL = null;
    }

    public final ContainerAbility RR() {
        return (ContainerAbility) this.LLJLLIL.getValue();
    }

    public final int SR() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    public final int UR() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    public final int VR() {
        return ((Number) this.LLJILJILJ.getValue()).intValue();
    }

    public final int WR() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    public final int ZR() {
        return ((Number) this.LLJJL.getValue()).intValue();
    }

    public final SchoolUsersListViewModel aS() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (SchoolUsersListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SchoolUsersListFragment.class.getName());
        }
        super.onResume();
        if (!this.LLJLL) {
            this.LLJLL = true;
            aS().manualListRefresh();
        }
        C346160Dhe c346160Dhe = (C346160Dhe) aS().getState();
        c346160Dhe.getClass();
        bS(c346160Dhe.getListState().LL, c346160Dhe.getListState().LLILZ, c346160Dhe.LLILLL, c346160Dhe.LL);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment
    public final View LJJLIIIJILLIZJL() {
        return this.LLILZIL;
    }

    public static void cS(View view, float f) {
        if (view == null) {
            return;
        }
        int i = view.getContext().getResources().getDisplayMetrics().widthPixels;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        layoutParams.width = (int) (i * f);
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SchoolFriendsBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = ((Number) this.LLJJJJ.getValue()).intValue();
            C786410Ut5.W5(view, marginLayoutParams);
        }
        C723850SaN.LIZ(this, false, null, new AwS583S0100000_4(this, 171), 3);
        AssemViewModel.asyncSubscribe$default(aS(), new C2217381BqS() { // from class: X.0Dhd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C346160Dhe c346160Dhe = (C346160Dhe) obj;
                c346160Dhe.getClass();
                return C627260Oiy.LIZLLL(c346160Dhe);
            }
        }, this, null, new AwS583S0100000_4(this, 291), new AwS548S0100000_4(this, 492), new AwS583S0100000_4(this, 292), 4, null);
        SchoolUsersListViewModel schoolUsersListViewModelAS = aS();
        C0I00 c0i00 = new C2217381BqS() { // from class: X.0I00
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C346160Dhe) obj).LLILLL;
            }
        };
        C459430Hzx c459430Hzx = new C2217381BqS() { // from class: X.0Hzx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C346160Dhe) obj).LL);
            }
        };
        C0I02 c0i02 = new C2217381BqS() { // from class: X.0I02
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C346160Dhe) obj).LLILLJJLI);
            }
        };
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZ(false);
        selectSubscribe(schoolUsersListViewModelAS, c0i00, c459430Hzx, c0i02, c1770850wBP, null, new C0IE5(this, 7));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C346110DhZ(this, null), 3);
        super.onViewCreated(view, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C460150I2r PR(Pair pair, boolean z, boolean z2) {
        int i;
        C460110I2n c460110I2n;
        String string;
        String string2;
        List listLJIIJJI;
        Map mapLJIIIIZZ;
        String string3;
        boolean z3;
        String strLIZIZ;
        if (pair != null) {
            i = 0;
        } else if (z) {
            i = 1;
        } else if (this.LLJIJIL && z2) {
            i = 2;
        } else {
            i = -1;
        }
        String str = "";
        if (pair != null) {
            Context context = getContext();
            if (context != null && C426750GoL.LIZLLL(context)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((Number) pair.getFirst()).intValue());
                sbLIZ.append(" - ");
                sbLIZ.append(((Number) pair.getSecond()).intValue());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(((Number) pair.getSecond()).intValue());
                sbLIZ2.append(" - ");
                sbLIZ2.append(((Number) pair.getFirst()).intValue());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            c460110I2n = new C460110I2n(strLIZIZ, new C460090I2l(R.raw.icon_chevron_down_small_fill), 10);
        } else {
            Context context2 = getContext();
            if (context2 == null || (string = context2.getString(2131846934)) == null) {
                string = "";
            }
            c460110I2n = new C460110I2n(string, new C460090I2l(R.raw.icon_chevron_down), 10);
        }
        Pair pair2 = new Pair(c460110I2n, new AwS118S0201000_4(i, (int) this, (SchoolUsersListFragment) pair, (Pair<Integer, Integer>) 1));
        Context context3 = getContext();
        if (context3 == null || (string2 = context3.getString(2131846936)) == null) {
            string2 = "";
        }
        Pair pair3 = new Pair(new C460110I2n(string2, new C460090I2l(R.raw.icon_list_arrow_down), 10), new AwS152S0110000_4(z, this, 1));
        Context context4 = getContext();
        if (context4 != null && (string3 = context4.getString(2131828962)) != null) {
            str = string3;
        }
        Pair pair4 = new Pair(new C460110I2n(str, null, 14), new AwS152S0110000_4(z2, this, 0));
        if (this.LLJIJIL) {
            listLJIIJJI = C1697810uHb.LJIIJJI(pair2.getFirst(), pair3.getFirst(), pair4.getFirst());
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI(pair2.getFirst(), pair3.getFirst());
        }
        if (this.LLJIJIL) {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(0, pair2.getSecond()), new Pair(1, pair3.getSecond()), new Pair(2, pair4.getSecond()));
        } else {
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(0, pair2.getSecond()), new Pair(1, pair3.getSecond()));
        }
        return new C460150I2r(i, listLJIIJJI, mapLJIIIIZZ);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, contextRequireContext);
        if (numLIZJ != null) {
            frameLayout.setBackground(new C440190HNx(numLIZJ.intValue()));
        }
        C460140I2q c460140I2q = new C460140I2q(contextRequireContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = WR();
        layoutParams.setMarginStart(((Number) this.LLJJ.getValue()).intValue());
        layoutParams.bottomMargin = VR();
        frameLayout.addView(c460140I2q, layoutParams);
        this.LLILLL = c460140I2q;
        C19GS c19gs = null;
        TuxSkeletonLayout tuxSkeletonLayout = new TuxSkeletonLayout(contextRequireContext, null, 6);
        tuxSkeletonLayout.setRepeatOrientation(1);
        if (this.LLJIJIL) {
            i = R.layout.ecn;
        } else {
            i = R.layout.ecm;
        }
        tuxSkeletonLayout.setPreviewItemRes(i);
        if (this.LLJIJIL) {
            cS(tuxSkeletonLayout.findViewById(R.id.p9c), 0.24f);
            cS(tuxSkeletonLayout.findViewById(R.id.wlv), 0.37f);
            cS(tuxSkeletonLayout.findViewById(R.id.j4b), 0.14f);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = ((Number) this.LLJILLL.getValue()).intValue() + WR() + VR();
        frameLayout.addView(tuxSkeletonLayout, layoutParams2);
        this.LLILZ = tuxSkeletonLayout;
        C1319510kRR c1319510kRR = new C1319510kRR(contextRequireContext);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(contextRequireContext, null);
        viewOnAttachStateChangeListenerC20604515jv.setNestedScrollingEnabled(true);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(contextRequireContext));
        this.LLILZIL = viewOnAttachStateChangeListenerC20604515jv;
        c1319510kRR.addView(viewOnAttachStateChangeListenerC20604515jv, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = ((Number) this.LLJILLL.getValue()).intValue() + WR() + VR();
        frameLayout.addView(c1319510kRR, layoutParams3);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setOrientation(1);
        C786410Ut5.LJLLLLLL(8, linearLayout);
        linearLayout.setGravity(1);
        ImageView imageView = new ImageView(contextRequireContext);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n_;
        imageView.setImageDrawable(c0hti.LIZ(contextRequireContext));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, ((Number) this.LLJJI.getValue()).intValue());
        layoutParams4.gravity = 1;
        layoutParams4.topMargin = SR();
        layoutParams4.bottomMargin = ((Number) this.LLJJIJIIJIL.getValue()).intValue();
        linearLayout.addView(imageView, layoutParams4);
        this.LLIZ = imageView;
        TuxTextView tuxTextView = new TuxTextView(contextRequireContext, null, 6, 0);
        tuxTextView.setText(2131846933);
        tuxTextView.setTuxFont(32);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setGravity(1);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.bottomMargin = ((Number) this.LLJJIJIL.getValue()).intValue();
        layoutParams5.setMarginStart(UR());
        layoutParams5.setMarginEnd(UR());
        linearLayout.addView(tuxTextView, layoutParams5);
        this.LLIZLLLIL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(contextRequireContext, null, 6, 0);
        tuxTextView2.setText(2131846932);
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        tuxTextView2.setGravity(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.bottomMargin = ((Number) this.LLJJJ.getValue()).intValue();
        layoutParams6.setMarginStart(UR());
        layoutParams6.setMarginEnd(UR());
        linearLayout.addView(tuxTextView2, layoutParams6);
        this.LLJ = tuxTextView2;
        C197039127h c197039127h = new C197039127h(contextRequireContext, null, 6, 0);
        c197039127h.setButtonSize(2);
        c197039127h.setButtonVariant(1);
        c197039127h.LJJLI(true);
        linearLayout.addView(c197039127h, new LinearLayout.LayoutParams(-2, -2));
        this.LLJI = c197039127h;
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams7.topMargin = ((Number) this.LLJILLL.getValue()).intValue() + WR() + VR();
        frameLayout.addView(linearLayout, layoutParams7);
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

    public static void bS(Object obj, List list, Pair pair, boolean z) {
        EnumC1579290rCR enumC1579290rCR;
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
        EnumC338610DPf enumC338610DPf = EnumC338610DPf.USER;
        c0doo.getClass();
        C0DOO.LJI(enumC1579300rCS, enumC1579290rCR, pair, z, enumC338610DPf);
    }
}
