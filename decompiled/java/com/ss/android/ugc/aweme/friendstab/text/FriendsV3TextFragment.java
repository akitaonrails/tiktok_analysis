package com.ss.android.ugc.aweme.friendstab.text;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C09R3;
import X.C0QSJ;
import X.C1076010e6h;
import X.C1386160mAw;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16F4;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2189821An6;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C626310OhR;
import X.C628500Oky;
import X.C630740Ooa;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3EventDispatchViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.tab.IFriendsV3PageAbility;
import com.ss.android.ugc.aweme.friendstab.ui.tab.scope.FriendsFeedFragmentV3Scope;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3TextFragment extends SAFTikTokFragment implements IFriendsV3PageAbility, Observer<FollowStatus>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM+ICo9LDHELIOSY4KC19PCA0PWEVOiwpJysgHnYYLDcnDjctLiI2JjE=";
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C630740Ooa LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3TextFragment.class, "friendsV3PageViewModel", "getFriendsV3PageViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3TextFragment.class, "eventVM", "getEventVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3EventDispatchViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{FriendsFeedFragmentV3Scope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FriendsFeedFragmentV3Scope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FriendsFeedFragmentV3Scope.class);
        return arrayList;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IFriendsV3PageAbility.class, null);
        C626310OhR.LIZ.getClass();
        C626310OhR.LIZIZ = 0L;
        C626310OhR.LIZJ = 0L;
        C626310OhR.LIZLLL = 0L;
        super.onDestroy();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public FriendsV3TextFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        aS(AFwS264S0000000_24.get$arr$(135));
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3PageViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 433);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(136);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 434), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 435), aFwS264S0000000_24, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 436), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3EventDispatchViewModel.class);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(c19719912DlLIZ2, 437);
        AFwS264S0000000_24 aFwS264S0000000_242 = AFwS264S0000000_24.get$arr$(137);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 438), aFwS264S0000000_242, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new AwS568S0100000_24((Fragment) this, 439), aFwS264S0000000_242, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 432), aFwS264S0000000_242, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLJJ = assemVMLazy2;
        this.LLJJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 431));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.tab.IFriendsV3PageAbility
    public final long Nh0() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return ((FriendsV3PageViewModel) assemVMLazy.getValue()).LL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.tab.IFriendsV3PageAbility
    public final C16F4 WK2() {
        return (C16F4) this.LLJJI.getValue();
    }

    public final boolean hS() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("route_host_path")) == null) {
            return false;
        }
        return a0.LJJIIZI(string, "history", false);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        FriendsV3PageViewModel friendsV3PageViewModel = (FriendsV3PageViewModel) assemVMLazy.getValue();
        Bundle arguments = getArguments();
        friendsV3PageViewModel.LL = System.currentTimeMillis();
        friendsV3PageViewModel.setStateImmediate(new AwS588S0100000_9(arguments, 562));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        assemVMLazy.getValue().setStateImmediate(new AwS588S0100000_9(getArguments(), 561));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        super.onAttach(context);
        if (hS()) {
            str = "SCENE_FRIENDS_V3_TEXT_HISTORY";
        } else {
            str = "SCENE_FRIENDS_V3_TEXT";
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            C1578630rBN.LJIIIIZZ(arguments, str);
        }
        C1578630rBN.LJII(this);
        C2189821An6 c2189821An6 = new C2189821An6();
        if (!hS()) {
            Bundle arguments2 = getArguments();
            String str2 = "";
            if (arguments2 == null || (string3 = arguments2.getString(FollowStatusChangeMethod.PARAM_UID)) == null) {
                string3 = "";
            }
            c2189821An6.setAid(string3);
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string4 = arguments3.getString("cid")) == null) {
                string4 = "";
            }
            c2189821An6.setCid(string4);
            Bundle arguments4 = getArguments();
            if (arguments4 != null && (string5 = arguments4.getString("insertLikeIDs")) != null) {
                str2 = string5;
            }
            c2189821An6.setLikeListIds(str2);
            c2189821An6.setDetailFeedNavArgModel(new DetailNavArgModel("", null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, "", null, null, "", "", "", 0, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Float.valueOf(0.0f), 0, 0, Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, false, false, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, "friends_v3_text_post_detail", null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, Boolean.FALSE, null, 0, null, null, "", null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, null));
        }
        String str3 = "text_detail_page";
        if (hS()) {
            string = "homepage_friends";
        } else {
            Bundle arguments5 = getArguments();
            if (arguments5 == null || (string = arguments5.getString("enter_from")) == null) {
                string = "text_detail_page";
            }
        }
        c2189821An6.setFrom(string);
        if (hS()) {
            str3 = "homepage_friends";
        } else {
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (string2 = arguments6.getString("enter_from")) != null) {
                str3 = string2;
            }
        }
        c2189821An6.setEventType(str3);
        c2189821An6.setPageType(31);
        c2189821An6.setEnterMethodValue("click");
        C1578630rBN.LJIILIIL(this, c2189821An6);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(FollowStatus followStatus) {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        assemVMLazy.getValue().setState(new AwS614S0100000_35(followStatus, 184));
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C626310OhR c626310OhR = C626310OhR.LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c626310OhR.getClass();
        C626310OhR.LIZIZ = jElapsedRealtime;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            C1386160mAw.LJI(activity);
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IFriendsV3PageAbility.class, null, null);
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().subscribe(this, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cbw, viewGroup, false);
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
