package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC1223210hw7;
import X.AbstractC1250290idn;
import X.C01GW;
import X.C098200Yq;
import X.C0HI8;
import X.C0OM1;
import X.C1073960e3O;
import X.C1076010e6h;
import X.C1220000hqw;
import X.C1247750iZh;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1264430j0b;
import X.C1264450j0d;
import X.C1266180j3Q;
import X.C128Y;
import X.C1308910kAL;
import X.C1385040m98;
import X.C13LE;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1843500y4a;
import X.C189200o6;
import X.C19286910ct;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19Y2;
import X.C19Y3;
import X.C19Y5;
import X.C20684815ws;
import X.C21594419fC;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C2344009Gk;
import X.C338520DOw;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C428150Gqb;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C588270N5l;
import X.C616540OGe;
import X.C666390QBx;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1262450ixP;
import X.EnumC428940Grs;
import X.EnumC666200QBe;
import X.InterfaceC1245470iW1;
import X.InterfaceC1264400j0Y;
import Y.AObserverS223S0100000_19;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsTabVM;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FindFriendsTabFragment extends JediBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISHELIOSoiZyk1OGs5IGEVISsoDz06LSsoOhsyKgM+KCg+LSs4";
    public C21594419fC LLILLJJLI;
    public C19Y3 LLILLL;
    public String LLILZ;
    public User LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public String LLJJ;
    public boolean LLJJI;
    public C1264430j0b LLJJIII;
    public C1264450j0d LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJJJ;
    public TuxNavBar LLJJJIL;
    public final C736950SvV LLJJJJ;
    public int LLIZLLLIL = -1;
    public final List<Fragment> LLJILJIL = new ArrayList();
    public final List<String> LLJILJILJ = new ArrayList();
    public final List<String> LLJILLL = new ArrayList();

    public final C19Y3 MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wya) : null;
            this.LLILLL = (C19Y3) viewFindViewById;
        }
        return (C19Y3) viewFindViewById;
    }

    public final C21594419fC NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.viewpager) : null;
            this.LLILLJJLI = (C21594419fC) viewFindViewById;
        }
        return (C21594419fC) viewFindViewById;
    }

    public final void OR() {
        C19286910ct.LIZIZ.LIZJ(requireContext(), -1, false);
        SR("click");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "find_friends_page");
        C20684815ws.LJIILLIIL("qr_code_scan_enter", c2344009Gk.LIZ);
    }

    public FindFriendsTabFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FindFriendsTabVM.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 96));
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(FindFriendsPageVM.class), AFwS207S0000000_19.get$arr$(298), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS257S0000000_19.get$arr$(264), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(FindFriendsTabFragment.class.getName());
        }
        super.onResume();
        User user = this.LLILZIL;
        if (user != null) {
            this.LLJ = user.getFollowingCount();
            this.LLJI = C588270N5l.LIZ(user) ? user.getFansCount() : user.getFollowerCount();
            this.LLJIJIL = user.getFriendCount();
        }
        if (this.LLJJI) {
            return;
        }
        C2252408s6.LJIIIIZZ(new AwS563S0100000_19(this, 3349));
    }

    public final void RR(String str) {
        String mufPreviousPage;
        FFPMainFragment fFPMainFragment;
        FFPMainFragment fFPMainFragment2;
        C1264430j0b c1264430j0b = this.LLJJIII;
        if (c1264430j0b == null || (mufPreviousPage = c1264430j0b.getMufPreviousPage()) == null) {
            mufPreviousPage = "";
        }
        int iIndexOf = ((ArrayList) this.LLJILLL).indexOf("suggest_user");
        if (iIndexOf == -1) {
            return;
        }
        Object obj = ListProtector.get(this.LLJILJIL, iIndexOf);
        if (obj instanceof FFPMainFragment) {
            fFPMainFragment = (FFPMainFragment) obj;
        } else {
            fFPMainFragment = null;
        }
        if (fFPMainFragment != null) {
            fFPMainFragment.LLJIJIL = true;
            fFPMainFragment.LLJILJIL = mufPreviousPage;
            fFPMainFragment.LLJILJILJ = str;
        }
        if (!Intrinsics.LJFF(this.LLILZLL, "suggest_user")) {
            Object obj2 = ListProtector.get(this.LLJILJIL, iIndexOf);
            if ((obj2 instanceof FFPMainFragment) && (fFPMainFragment2 = (FFPMainFragment) obj2) != null) {
                fFPMainFragment2.kS();
            }
        }
        this.LLJJIJIL = true;
    }

    public final void SR(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "find_friends_page");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("scan_icon", c2344009Gk.LIZ);
    }

    public final void PR(final String str, String str2) {
        String str3;
        final String str4;
        String mufEnterFrom;
        String mufPreviousPage;
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        if (!c1076010e6h.LJIIJ().LIZJ() && !c1076010e6h.LJII().LIZJ()) {
            str3 = "authorize";
        } else {
            str3 = "normal";
        }
        if (this.LLIZ && Intrinsics.LJFF(this.LLILZLL, "suggest_user")) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        C1264430j0b c1264430j0b = this.LLJJIII;
        final String str5 = "";
        if (c1264430j0b == null || (mufEnterFrom = c1264430j0b.getMufEnterFrom()) == null) {
            mufEnterFrom = "";
        }
        C1264430j0b c1264430j0b2 = this.LLJJIII;
        if (c1264430j0b2 != null && (mufPreviousPage = c1264430j0b2.getMufPreviousPage()) != null) {
            str5 = mufPreviousPage;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", "friends");
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("enter_from", mufEnterFrom);
        c2344009Gk.LJIIIIZZ("previous_page", str5);
        c2344009Gk.LIZJ(this.LLJIJIL, "muf_cnt");
        c2344009Gk.LJIIIIZZ("page_type", str3);
        C20684815ws.LJIILLIIL("enter_mutual_friends_list", c2344009Gk.LIZ);
        new AbstractC1223210hw7(str5, str, str4) { // from class: X.07sm
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;

            @Override // X.AbstractC1223210hw7
            public final String LIZ() {
                return "show_find_friends_page";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2001807sm)) {
                    return false;
                }
                C2001807sm c2001807sm = (C2001807sm) obj;
                return Intrinsics.LJFF(this.LIZIZ, c2001807sm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2001807sm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2001807sm.LIZLLL);
            }

            public final int hashCode() {
                return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ShowFFPFriendsFindFriendTrack(enterFrom=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", enterMethod=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", hasFriendsNotice=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1223210hw7
            public final Map<String, String> LIZIZ() {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", this.LIZIZ);
                c2344009Gk2.LJIIIIZZ("enter_method", this.LIZJ);
                c2344009Gk2.LJIIIIZZ("tab_name", "friends");
                c2344009Gk2.LJIIIIZZ("has_friends_notice", this.LIZLLL);
                return c2344009Gk2.LIZ;
            }

            {
                this.LIZIZ = str5;
                this.LIZJ = str;
                this.LIZLLL = str4;
            }
        }.LIZLLL(null);
        this.LLJJIJIIJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        int iIndexOf;
        String enterMethod;
        C19Y2 c19y2;
        boolean z;
        Resources resources;
        String string2;
        Resources resources2;
        String mufEnterFrom;
        String mufPreviousPage;
        C1251150ifB c1251150ifB;
        C1251150ifB c1251150ifB2;
        int followerCount;
        C1264450j0d c1264450j0d;
        String landingTab;
        boolean showRedDotInFriendTab;
        int newFriendShowThreshold;
        C1264430j0b c1264430j0b;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("disable_nav_layout", false);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.LLILZ = arguments2.getString("uid");
            Serializable serializable = arguments2.getSerializable("ffp_tab_page_arg");
            if (serializable instanceof C1264450j0d) {
                c1264450j0d = (C1264450j0d) serializable;
            } else {
                c1264450j0d = null;
            }
            this.LLJJIJI = c1264450j0d;
            if (c1264450j0d == null || (landingTab = c1264450j0d.getLandingTab()) == null) {
                landingTab = "suggest_user";
            }
            this.LLILZLL = landingTab;
            C1264450j0d c1264450j0d2 = this.LLJJIJI;
            if (c1264450j0d2 != null) {
                showRedDotInFriendTab = c1264450j0d2.getShowRedDotInFriendTab();
            } else {
                showRedDotInFriendTab = false;
            }
            this.LLIZ = showRedDotInFriendTab;
            C1264450j0d c1264450j0d3 = this.LLJJIJI;
            if (c1264450j0d3 != null) {
                newFriendShowThreshold = c1264450j0d3.getNewFriendShowThreshold();
            } else {
                newFriendShowThreshold = -1;
            }
            this.LLIZLLLIL = newFriendShowThreshold;
            this.LLJJ = arguments2.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
            Serializable serializable2 = arguments2.getSerializable("ffp_event_tracking_key");
            if (serializable2 instanceof C1264430j0b) {
                c1264430j0b = (C1264430j0b) serializable2;
            } else {
                c1264430j0b = null;
            }
            this.LLJJIII = c1264430j0b;
            if (Intrinsics.LJFF(this.LLJJ, "homepage_hot") || Intrinsics.LJFF(this.LLJJ, "homepage_friends")) {
                this.LLJJI = true;
            }
        }
        User user = C666390QBx.LIZJ;
        this.LLILZIL = user;
        if (user != null) {
            this.LLJ = user.getFollowingCount();
            if (C588270N5l.LIZ(user)) {
                followerCount = user.getFansCount();
            } else {
                followerCount = user.getFollowerCount();
            }
            this.LLJI = followerCount;
            this.LLJIJIL = user.getFriendCount();
        }
        View view2 = getView();
        if (view2 != null) {
            TuxNavBar tuxNavBar = (TuxNavBar) view2.findViewById(R.id.p15);
            C0OM1 c0om1 = new C0OM1();
            AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
            EnumC666200QBe pageStyle = ((FindFriendsPageVM) this.LLJJJJ.getValue()).zQ2().getPageStyle();
            EnumC666200QBe enumC666200QBe = EnumC666200QBe.TT_NOW;
            if (pageStyle == enumC666200QBe) {
                SR("show");
                c1251150ifB = new C1251150ifB();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_scan;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c1251150ifB.LIZLLL();
                c1251150ifB.LJ = c419910GdJ;
                c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3347));
            } else {
                c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
                c1251150ifB.LJIIIIZZ = getString(2131823332);
                c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3348));
            }
            abstractC1250290idnArr[0] = c1251150ifB;
            c0om1.LJ(abstractC1250290idnArr);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getText(2131825144);
            c0om1.LIZJ = c1250250idj;
            AbstractC1250290idn[] abstractC1250290idnArr2 = new AbstractC1250290idn[1];
            if (((FindFriendsPageVM) this.LLJJJJ.getValue()).zQ2().getPageStyle() == enumC666200QBe) {
                c1251150ifB2 = new C1251150ifB();
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_chevron_right_ltr;
                c419910GdJ2.LJI = getString(2131823332);
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LJ = c419910GdJ2;
                c1251150ifB2.LIZJ(new AwS563S0100000_19(this, 3344));
            } else {
                SR("show");
                c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_scan;
                c1251150ifB2.LJIIIIZZ = getString(R.string.sj6);
                c1251150ifB2.LIZJ(new AwS563S0100000_19(this, 3345));
            }
            abstractC1250290idnArr2[0] = c1251150ifB2;
            c0om1.LIZIZ(abstractC1250290idnArr2);
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(false);
            this.LLJJJIL = tuxNavBar;
            if (C1073960e3O.LIZ()) {
                TuxNavBar tuxNavBar2 = this.LLJJJIL;
                if (tuxNavBar2 == null) {
                    tuxNavBar2 = null;
                }
                ((TuxTextView) tuxNavBar2.findViewById(R.id.p1i)).setTuxFont(103);
            }
        }
        ((ArrayList) this.LLJILJIL).clear();
        FragmentManager childFragmentManager = getChildFragmentManager();
        int size = ((ArrayList) this.LLJILJIL).size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(R.id.viewpager);
        sbLIZ.append(':');
        sbLIZ.append(size);
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        String str = "";
        if (fragmentLJJJJZI == null) {
            C1247750iZh c1247750iZh = C1247750iZh.LIZ;
            EnumC1262450ixP enumC1262450ixP = EnumC1262450ixP.TT_RELATION_PAGE;
            C1264430j0b c1264430j0b2 = this.LLJJIII;
            if (c1264430j0b2 == null || (mufEnterFrom = c1264430j0b2.getMufEnterFrom()) == null) {
                mufEnterFrom = "";
            }
            C1264430j0b c1264430j0b3 = this.LLJJIII;
            if (c1264430j0b3 == null || (mufPreviousPage = c1264430j0b3.getMufPreviousPage()) == null) {
                mufPreviousPage = "";
            }
            MufPageTrackInfo mufPageTrackInfo = new MufPageTrackInfo(mufEnterFrom, mufPreviousPage);
            int i = this.LLIZLLLIL;
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 3350);
            c1247750iZh.getClass();
            fragmentLJJJJZI = C1247750iZh.LIZ(enumC1262450ixP, mufPageTrackInfo, i, awS563S0100000_19);
        }
        ((ArrayList) this.LLJILJIL).add(fragmentLJJJJZI);
        List<String> list = this.LLJILJILJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C19EG activity = getActivity();
        if (activity != null && (resources2 = activity.getResources()) != null) {
            string = resources2.getString(2131834932);
        } else {
            string = null;
        }
        sbLIZ2.append(string);
        sbLIZ2.append(' ');
        sbLIZ2.append(C1843500y4a.LIZIZ(this.LLJIJIL));
        ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ2));
        ((ArrayList) this.LLJILLL).add("muf_user");
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        int size2 = ((ArrayList) this.LLJILJIL).size();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("android:switcher:");
        sbLIZ3.append(R.id.viewpager);
        sbLIZ3.append(':');
        sbLIZ3.append(size2);
        Fragment fragmentLJJJJZI2 = childFragmentManager2.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ3));
        if (fragmentLJJJJZI2 == null) {
            fragmentLJJJJZI2 = new FFPMainFragment();
        }
        fragmentLJJJJZI2.setArguments(getArguments());
        ((ArrayList) this.LLJILJIL).add(fragmentLJJJJZI2);
        List<String> list2 = this.LLJILJILJ;
        C19EG activity2 = getActivity();
        if (activity2 != null && (resources = activity2.getResources()) != null && (string2 = resources.getString(2131849341)) != null) {
            str = string2;
        }
        ((ArrayList) list2).add(str);
        ((ArrayList) this.LLJILLL).add("suggest_user");
        C0HI8 c0hi8 = new C0HI8(getChildFragmentManager(), this.LLJILJIL, this.LLJILJILJ);
        NR().setAdapter(c0hi8);
        NR().addOnPageChangeListener(new C1266180j3Q(this, c0hi8, 1));
        NR().setOffscreenPageLimit(3);
        if (C13LP.LJJJJ(this.LLILZLL, this.LLJILLL)) {
            iIndexOf = ((ArrayList) this.LLJILLL).indexOf(this.LLILZLL);
        } else {
            iIndexOf = 0;
        }
        String str2 = "land";
        if (Intrinsics.LJFF(this.LLILZLL, "muf_user") && !this.LLJJIJIIJIL) {
            PR("land", "notice_land");
        } else if (Intrinsics.LJFF(this.LLILZLL, "suggest_user") && !this.LLJJIJIL) {
            C1264430j0b c1264430j0b4 = this.LLJJIII;
            if (c1264430j0b4 != null && (enterMethod = c1264430j0b4.getEnterMethod()) != null) {
                str2 = enterMethod;
            }
            RR(str2);
        }
        NR().setCurrentItem(iIndexOf);
        int i2 = 0;
        for (C128Y c128y : c0hi8.LLIZ) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C128Y c128y2 = (Fragment) c128y;
                if (c128y2 instanceof InterfaceC1264400j0Y) {
                    InterfaceC1264400j0Y interfaceC1264400j0Y = (InterfaceC1264400j0Y) c128y2;
                    if (i2 != iIndexOf) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interfaceC1264400j0Y.X5(z);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, C1385040m98.LIZIZ(MR().getContext()));
        if (numLIZJ != null) {
            MR().setBackgroundColor(numLIZJ.intValue());
        }
        MR().setCustomTabViewResId(R.layout.c_q);
        MR().setAutoFillWhenScrollable(true);
        MR().LJIILLIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        MR().setupWithViewPager(NR());
        MR().setOnTabClickListener(new InterfaceC1245470iW1() { // from class: X.0j0c
            @Override // X.InterfaceC1245470iW1
            public final void LIZ(C19Y5 c19y5) {
                if (c19y5 != null) {
                    c19y5.LIZ = "from_click";
                }
                c19y5.LIZ();
            }
        });
        if (this.LLIZ && Intrinsics.LJFF(this.LLILZLL, "suggest_user")) {
            C2252408s6.LJIIIIZZ(new AwS563S0100000_19(this, 3346));
        }
        int tabCount = MR().getTabCount();
        for (int i4 = 0; i4 < tabCount; i4++) {
            C19Y5 c19y5LJIIIZ = MR().LJIIIZ(i4);
            if (c19y5LJIIIZ != null) {
                c19y2 = c19y5LJIIIZ.LJIIIIZZ;
            } else {
                c19y2 = null;
            }
            C428150Gqb.LIZ(c19y2, EnumC428940Grs.ALPHA, 0.0f);
        }
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        c1076010e6h.LIZIZ().getRelationObservable().observe(this, new AObserverS223S0100000_19(this, 80));
        c1076010e6h.LIZIZ().LIZJ().observe(this, new AObserverS223S0100000_19(this, 81));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c_f, viewGroup, false);
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
