package com.ss.android.ugc.aweme.friendstab.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C09R3;
import X.C0N14;
import X.C0QSJ;
import X.C0SDP;
import X.C0SP9;
import X.C0VWW;
import X.C0W17;
import X.C0ZP4;
import X.C1076010e6h;
import X.C1150504el;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1386160mAw;
import X.C13LE;
import X.C14LC;
import X.C1558040qeA;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1587740rQ4;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C16F4;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20675115vJ;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C309690CBz;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C486860J7k;
import X.C497820Jfg;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewTreeObserverOnPreDrawListenerC1620770sHL;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3NavHideOnScrollConfig;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsV3RouterAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3RouterAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3EventDispatchViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3SkylightBridgeViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.tab.IFriendsV3PageAbility;
import com.ss.android.ugc.aweme.friendstab.ui.tab.scope.FriendsFeedFragmentV3Scope;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.AwS97S0110000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SocialFriendsFeedFragmentV3 extends BaseFragment implements InterfaceC1055110dYz, InterfaceC724530SbT, IFeedSkylightHostAbility, IFriendsV3PageAbility, Observer<FollowStatus>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM+ICo9LDY4HELIOSKC19PSxiGiAwISQgDz06LSsoOgk2LSEKOy40JSAiPRlg";
    public final AssemVMLazy LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public C16F4 LLJIJIL;
    public View LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialFriendsFeedFragmentV3.class, "friendsV3PageViewModel", "getFriendsV3PageViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SocialFriendsFeedFragmentV3.class, "skylightBridgeViewModel", "getSkylightBridgeViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3SkylightBridgeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SocialFriendsFeedFragmentV3.class, "eventVM", "getEventVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3EventDispatchViewModel;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final Aweme G3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final boolean KU() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void Mv1() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final boolean Qx1() {
        return false;
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

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FriendsFeedFragmentV3Scope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FriendsFeedFragmentV3Scope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
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

    public SocialFriendsFeedFragmentV3() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        boolean z3;
        AssemVMLazy assemVMLazy3;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3PageViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 450);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(140);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 451), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 452), aFwS264S0000000_24, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 453), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3SkylightBridgeViewModel.class);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(c19719912DlLIZ2, 454);
        AFwS264S0000000_24 aFwS264S0000000_242 = AFwS264S0000000_24.get$arr$(141);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 455), aFwS264S0000000_242, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
            z3 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new AwS568S0100000_24((Fragment) this, 456), aFwS264S0000000_242, null, null, null);
            z2 = true;
            z3 = false;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            z3 = false;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS568S0100000_242, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 445), aFwS264S0000000_242, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FriendsV3EventDispatchViewModel.class);
        AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24(c19719912DlLIZ3, 446);
        AFwS264S0000000_24 aFwS264S0000000_243 = AFwS264S0000000_24.get$arr$(139);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS568S0100000_243, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 447), aFwS264S0000000_243, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS568S0100000_243, new AwS568S0100000_24((Fragment) this, 448), aFwS264S0000000_243, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS568S0100000_243, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 449), aFwS264S0000000_243, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
        }
        this.LLJ = assemVMLazy3;
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 444));
    }

    public final FriendsV3PageViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (FriendsV3PageViewModel) assemVMLazy.getValue();
    }

    public final FriendsV3SkylightBridgeViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (FriendsV3SkylightBridgeViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void Hf0() {
        SR().setStateImmediate(new AwS97S0110000_9(true, (C0N14) new C0N14() { // from class: X.0N15
        }, 10));
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.tab.IFriendsV3PageAbility
    public final long Nh0() {
        return SR().LL;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IFeedSkylightHostAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IFriendsV3RouterAbility.class, null);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IFriendsV3PageAbility.class, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        SR().setStateImmediate(AFwS240S0000000_9.get$arr$(870));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SR().setStateImmediate(AFwS240S0000000_9.get$arr$(871));
        C19EG activity = getActivity();
        if (activity != null) {
            C1386160mAw.LJI(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.tab.IFriendsV3PageAbility
    public final C16F4 WK2() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void B41(boolean z) {
        FriendsV3SkylightBridgeViewModel.vQ2(UR(), null, 3);
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        c1587740rQ4.getClass();
        if (!C1587740rQ4.LJIJI) {
            C1587740rQ4.LJIIJ = SystemClock.elapsedRealtime() - C1587740rQ4.LIZJ;
            C1587740rQ4.LJI(c1587740rQ4, C0SDP.SKY_LIGHT, false, null, 6);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void Zs(boolean z) {
        FriendsV3SkylightAbility friendsV3SkylightAbility = (FriendsV3SkylightAbility) this.LLJI.getValue();
        if (friendsV3SkylightAbility != null) {
            friendsV3SkylightAbility.Zs(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void bg0(int i) {
        View view;
        if (Build.VERSION.SDK_INT >= 35 && (view = this.LLJILJIL) != null) {
            view.setBackgroundColor(i);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C1578630rBN.LJII(this);
        C2189821An6 c2189821An6 = new C2189821An6();
        c2189821An6.setFrom("homepage_friends");
        c2189821An6.setEventType("homepage_friends");
        c2189821An6.setPageType(31);
        c2189821An6.setEnterMethodValue("slide");
        C19EG activity = getActivity();
        if (activity != null) {
            C0SP9.LIZLLL(c2189821An6, activity);
        }
        C1578630rBN.LJIILIIL(this, c2189821An6);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(FollowStatus followStatus) {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        assemVMLazy.getValue().setState(new AwS614S0100000_35(followStatus, 184));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNodeHide，args=");
        sbLIZ.append(bundle);
        C2188811AlT.LIZIZ(sbLIZ);
        FriendsV3PageViewModel friendsV3PageViewModelSR = SR();
        friendsV3PageViewModelSR.LL = System.currentTimeMillis();
        friendsV3PageViewModelSR.setStateImmediate(new AwS588S0100000_9(bundle, 562));
        UR().setStateImmediate(new AwS36S0010000_24(false, 23));
        C19EG activity = getActivity();
        if (activity != null) {
            C486860J7k.LIZIZ(activity).KQ2(true);
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNodeShow，args=");
        sbLIZ.append(bundle);
        C2188811AlT.LIZIZ(sbLIZ);
        C19EG activity = getActivity();
        if (activity != null) {
            C1386160mAw.LJI(activity);
        }
        SR().setStateImmediate(new AwS588S0100000_9(bundle, 561));
        UR().setStateImmediate(new AwS36S0010000_24(true, 23));
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            C486860J7k.LIZIZ(activity2).KQ2(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void iu0(String str, boolean z) {
        FriendsV3SkylightBridgeViewModel.vQ2(UR(), str, 1);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFeedSkylightHostAbility
    public final void oi0(String str, boolean z) {
        FriendsV3SkylightBridgeViewModel friendsV3SkylightBridgeViewModelUR = UR();
        C0W17.LIZJ("skylightVM", "hideSkylightList");
        friendsV3SkylightBridgeViewModelUR.setState(new AwS74S1000000_24(str, 17));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.ydi);
        if (viewFindViewById != null) {
            this.LLJILJIL = viewFindViewById;
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C497820Jfg.LIZJ(view.getContext());
            }
        }
        View viewFindViewById2 = view.findViewById(R.id.caw);
        if (viewFindViewById2 != null) {
            boolean z = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            int iLIZIZ = C14LC.LIZIZ();
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (layoutParams2 == null || iLIZIZ != layoutParams2.height) {
                viewFindViewById2.getLayoutParams().height = iLIZIZ;
            }
            this.LLJIJIL = (C16F4) view.findViewById(R.id.fu8);
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IFeedSkylightHostAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), new FriendsV3RouterAbility(getContext()), IFriendsV3RouterAbility.class, null, null);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IFriendsV3PageAbility.class, null, null);
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().subscribe(this, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Context context;
        ViewTreeObserver viewTreeObserver;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1587740rQ4.LIZ.getClass();
        if (!C1587740rQ4.LJIJI) {
            C0VWW.LJI("latency_friends");
            C1587740rQ4.LJJIFFI = "3";
            C1587740rQ4.LIZJ = jElapsedRealtime;
            HashMap<String, String> map = C1587740rQ4.LIZIZ;
            map.put("tab_position", "Bottom2Tab");
            map.put("start_time_from_open_app", String.valueOf(jElapsedRealtime - C1150504el.LIZ().LJJIII));
        }
        if (((FriendsV3NavHideOnScrollConfig) C1558040qeA.LIZIZ.getValue()).enable) {
            i = R.layout.cbs;
        } else {
            i = R.layout.cbr;
        }
        C19GS c19gs = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View viewLIZ = C20675115vJ.LIZ(i, context);
        if (viewLIZ == null) {
            viewLIZ = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        if (!C1587740rQ4.LJIJI) {
            C1587740rQ4.LJII = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (viewLIZ != null && (viewTreeObserver = viewLIZ.getViewTreeObserver()) != null) {
                ViewTreeObserverOnPreDrawListenerC1620770sHL viewTreeObserverOnPreDrawListenerC1620770sHL = new ViewTreeObserverOnPreDrawListenerC1620770sHL(viewLIZ, 1);
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1620770sHL);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1620770sHL, ViewTreeObserver.OnPreDrawListener.class);
            }
        }
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
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
