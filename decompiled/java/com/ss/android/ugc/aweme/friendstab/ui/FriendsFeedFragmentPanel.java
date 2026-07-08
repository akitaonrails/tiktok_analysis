package com.ss.android.ugc.aweme.friendstab.ui;

import X.AbstractC848400XPy;
import X.C086I;
import X.C0HTT;
import X.C0N07;
import X.C0R9L;
import X.C0SR4;
import X.C0SZ8;
import X.C0W93;
import X.C0XQ7;
import X.C1073840e3C;
import X.C1073880e3G;
import X.C128Y;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C1400330mXn;
import X.C14EU;
import X.C1558360qeg;
import X.C1564680qos;
import X.C1576740r8K;
import X.C1576760r8M;
import X.C1583300rIu;
import X.C1583510rJF;
import X.C1587150rP7;
import X.C1587320rPO;
import X.C1587440rPa;
import X.C1587710rQ1;
import X.C1587740rQ4;
import X.C1587810rQB;
import X.C1589640rT8;
import X.C15O7;
import X.C1618440sDa;
import X.C19EG;
import X.C2097608Jq;
import X.C2189821An6;
import X.C486860J7k;
import X.C581630MrZ;
import X.C680890QnH;
import X.C690440R6k;
import X.C713370RyZ;
import X.C714460S0u;
import X.C722660SWi;
import X.C786410Ut5;
import X.C818480W8w;
import X.C823050WQl;
import X.CallableC1582170rH5;
import X.InterfaceC1073860e3E;
import X.InterfaceC1587410rPX;
import X.InterfaceC1587520rPi;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS18S0201000_12;
import Y.ARunnableS93S0200000_24;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.AssemReusedContainer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.api.InsertResultCode;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedFragmentPanel extends FullFeedFragmentPanel {
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public C1073840e3C d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f379e0;
    public SocialFriendsFeedFragment f0;
    public InterfaceC1587520rPi g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f380h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f381i0;
    public boolean j0;

    public final void L() {
        this.c0 = false;
        C1073840e3C c1073840e3C = this.d0;
        if (c1073840e3C != null) {
            InterfaceC1073860e3E interfaceC1073860e3E = c1073840e3C.LLILLL;
            if (interfaceC1073860e3E != null) {
                interfaceC1073860e3E.m6();
            }
            FriendsEmptyPageRootVM friendsEmptyPageRootVM = c1073840e3C.LLIZ;
            if (friendsEmptyPageRootVM == null) {
                friendsEmptyPageRootVM = null;
            }
            friendsEmptyPageRootVM.LLILZ.LJ();
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = friendsEmptyPageRootVM.LLILLJJLI;
            if (friendsEmptyPageMainSectionVM != null) {
                friendsEmptyPageMainSectionVM.LLJI.postValue(new C1073880e3G(false, null));
            }
            ILoadMoreAbility iLoadMoreAbility = this.LLILZLL;
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.removeView(this.d0);
                this.LLILZLL.g82(false);
            }
            this.d0 = null;
        }
    }

    public FriendsFeedFragmentPanel() {
        super("homepage_friends", 31);
        this.f379e0 = true;
        this.f380h0 = -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final boolean LJLJI() {
        IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi$default(IHomeSidebarService.class, false, false, false, 14, null);
        if (iHomeSidebarService == null || !iHomeSidebarService.LJ(this.activity)) {
            return super.LJLJI();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLJJJJLIIL() {
        Aweme awemeLJIIIIZZ;
        super.LLJJJJLIIL();
        ((CommentService) ServiceManager.get().getService(CommentService.class)).LJJJJJL(getContext(), LJIIIIZZ(), this.LLLLIIIILLL, AFwS213S0000000_24.get$arr$(92));
        if (LJIIIIZZ() == null || LJIIIIZZ().getAwemeType() != 150 || (awemeLJIIIIZZ = LJIIIIZZ()) == null) {
            return;
        }
        try {
            C823050WQl.LIZLLL().execute(new ARunnableS93S0200000_24(this, awemeLJIIIIZZ, 63));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Ng1() {
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        User curUser;
        super.Ng1();
        R();
        this.c0 = true;
        InterfaceC1587520rPi interfaceC1587520rPi = this.g0;
        if (interfaceC1587520rPi != null) {
            interfaceC1587520rPi.N8();
        }
        if (getUserVisibleHint()) {
            M(true);
        }
        C0SR4 c0sr4 = this.LLJL;
        if (c0sr4 != null && c0sr4.getCount() > 0) {
            if (getUserVisibleHint()) {
                hs();
            }
            this.LLJL.setData(C13BV.INSTANCE);
            this.LLJL.LLJILLL = false;
            PlayButtonComponentTemp playButtonComponentTemp = this.LLJI;
            if (playButtonComponentTemp != null) {
                playButtonComponentTemp.z32(0.0f);
            }
            LLLIZZ(Float.valueOf(0.0f));
        }
        if (this.d0 == null) {
            C1073840e3C c1073840e3C = new C1073840e3C(getContext());
            this.d0 = c1073840e3C;
            c1073840e3C.LJ(getFragment(), C0N07.EMPTY_STATE);
            this.LLILZLL.addView(this.d0);
            this.LLILZLL.g82(true);
            hs();
            if (!this.a0) {
                this.a0 = true;
                C818480W8w.LIZJ("homepage_friends", C0W93.SUCCESS, null, C2097608Jq.LJ());
            }
        }
        C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
        if (c1589640rT8.l2()) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null && curUser.getFriendCount() > 0) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.activity);
                c1389890mGx.LJIIIZ(2131834956);
                c1389890mGx.LJIIJJI();
            }
        } else if (c1589640rT8.V1()) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.activity);
            c1389890mGx2.LJIIIZ(2131834940);
            c1389890mGx2.LJIIJJI();
        }
        Activity activity = this.activity;
        if (!(activity instanceof C19EG) || (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI((C19EG) activity, null))) == null) {
            return;
        }
        iBottomTabLayoutAbilityLJIIIZ.vJ1();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus.LIZLLL().LJJI(this);
    }

    public final List<Aweme> K(String str) {
        ArrayList arrayList = new ArrayList();
        C0SR4 c0sr4 = this.LLJL;
        if (c0sr4 != null && !C086I.LIZIZ(c0sr4.LJJJLZIJ())) {
            List<Aweme> listLJJJLZIJ = this.LLJL.LJJJLZIJ();
            int size = listLJJJLZIJ.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) ListProtector.get(listLJJJLZIJ, i);
                if (aweme != null && TextUtils.equals(str, AwemeExtKt.getAuthorUid(aweme))) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        SocialFriendsFeedFragment socialFriendsFeedFragment;
        C1587320rPO c1587320rPOGS;
        C1587710rQ1 c1587710rQ1;
        C1587810rQB c1587810rQB;
        List<Aweme> listLJIIJJI;
        super.LJJIJIIJI(str);
        Aweme aweme = null;
        if (!this.a0) {
            this.a0 = true;
            C818480W8w.LIZJ("homepage_friends", C0W93.SUCCESS, null, C2097608Jq.LJ());
            StateOwner.LL.getClass();
            StateOwner.LLJJIJI.postValue(Boolean.TRUE);
        }
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        Aweme awemeLLLLLJLJLL = LLLLLJLJLL();
        Fragment fragment = getFragment();
        if ((fragment instanceof SocialFriendsFeedFragment) && (socialFriendsFeedFragment = (SocialFriendsFeedFragment) fragment) != null && (c1587320rPOGS = socialFriendsFeedFragment.gS()) != null && (c1587710rQ1 = c1587320rPOGS.LIZLLL) != null && (c1587810rQB = (C1587810rQB) c1587710rQ1.LL) != null && (listLJIIJJI = c1587810rQB.LJIIJJI()) != null) {
            aweme = (Aweme) C13LP.LJJJLL(listLJIIJJI);
        }
        c1587740rQ4.getClass();
        C1587740rQ4.LJFF(awemeLLLLLJLJLL, aweme);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJLLI(String str) {
        SocialFriendsFeedFragment socialFriendsFeedFragment;
        C1587320rPO c1587320rPOGS;
        C1587710rQ1 c1587710rQ1;
        C1587810rQB c1587810rQB;
        List<Aweme> listLJIIJJI;
        Aweme aweme;
        Fragment fragment = getFragment();
        String aid = null;
        if ((fragment instanceof SocialFriendsFeedFragment) && (socialFriendsFeedFragment = (SocialFriendsFeedFragment) fragment) != null && (c1587320rPOGS = socialFriendsFeedFragment.gS()) != null && (c1587710rQ1 = c1587320rPOGS.LIZLLL) != null && (c1587810rQB = (C1587810rQB) c1587710rQ1.LL) != null && (listLJIIJJI = c1587810rQB.LJIIJJI()) != null && (aweme = (Aweme) C13LP.LJJJLL(listLJIIJJI)) != null) {
            aid = aweme.getAid();
        }
        if (Intrinsics.LJFF(str, aid)) {
            C1587740rQ4.LIZ.getClass();
            if (!C1587740rQ4.LJIJI) {
                C1587740rQ4.LJIJI = true;
                C15O7.LIZJ(new CallableC1582170rH5("FriendsPlayError"));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LLILLIZIL(int i) {
        if (!this.c0) {
            super.LLILLIZIL(i);
        }
        C1583300rIu.LIZ.getClass();
        if (C1583300rIu.LIZJ()) {
            C1587150rP7.LIZIZ.LJJIFFI(LJIIIIZZ(), i, getFragment());
        }
    }

    public final void M(boolean z) {
        C19EG c19eg;
        IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi$default(IHomeSidebarService.class, false, false, false, 14, null);
        if (iHomeSidebarService != null && iHomeSidebarService.LJ(this.activity)) {
            return;
        }
        Activity activity = this.activity;
        if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
            return;
        }
        C486860J7k.LIZIZ(c19eg).KQ2(!z);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        super.Uq2(exc);
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        c1587740rQ4.getClass();
        if (!C1587740rQ4.LJIJI) {
            c1587740rQ4.getClass();
            C1587740rQ4.LJIJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        super.Wi(exc);
        Activity activity = this.activity;
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131848736);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final boolean i(String str) {
        SocialFriendsFeedFragment socialFriendsFeedFragment;
        C1587320rPO c1587320rPOGS;
        C1587710rQ1 c1587710rQ1;
        C1587810rQB c1587810rQB;
        FriendsFeedResponse friendsFeedResponse;
        List<InsertResultCode> list;
        InsertResultCode insertResultCode;
        Fragment fragment = getFragment();
        if ((fragment instanceof SocialFriendsFeedFragment) && (socialFriendsFeedFragment = (SocialFriendsFeedFragment) fragment) != null && (c1587320rPOGS = socialFriendsFeedFragment.gS()) != null && (c1587710rQ1 = c1587320rPOGS.LIZLLL) != null && (c1587810rQB = (C1587810rQB) c1587710rQ1.LL) != null && (friendsFeedResponse = c1587810rQB.LLILZ) != null && (list = friendsFeedResponse.insertedResults) != null && (insertResultCode = (InsertResultCode) C13LP.LJJJLL(list)) != null && insertResultCode.code == 20000 && Intrinsics.LJFF(insertResultCode.awemeId, str)) {
            return true;
        }
        return false;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCleanModeChangedEvent(C1576760r8M c1576760r8M) {
        boolean z;
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            z = c1576740r8KLIZ.LIZJ;
        } else {
            z = false;
        }
        this.LLLLIIIILLL.setPlaylistCleanMode(z);
        int childCount = this.LLJJIJI.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0SZ8 c0sz8LJLJJI = LJLJJI(i);
            if (c0sz8LJLJJI != null) {
                c0sz8LJLJJI.LJIIZILJ(z);
            }
        }
    }

    @C14EU
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        this.f380h0 = c1564680qos.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void onPreparePlay(String str) {
        Aweme awemeLJIIIIZZ = LJIIIIZZ();
        if (awemeLJIIIIZZ != null && !TextUtils.isEmpty(awemeLJIIIIZZ.getAid()) && awemeLJIIIIZZ.getAwemeType() != 150) {
            try {
                C823050WQl.LIZLLL().execute(new ARunnableS93S0200000_24(this, awemeLJIIIIZZ, 63));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    @C14EU
    public void onVideoPlayerEvent(C581630MrZ c581630MrZ) {
        int i = c581630MrZ.LIZ;
        if ((i != 2 && i != 3) || !this.b0) {
            return;
        }
        LLLLLLLLLL();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void refreshFriendsFeed(C1587440rPa c1587440rPa) {
        AssemReusedContainer assemReusedContainer;
        if (c1587440rPa == null) {
            return;
        }
        Object objLJLIL = LJLIL();
        if ((objLJLIL instanceof VideoViewCell) && (assemReusedContainer = (AssemReusedContainer) objLJLIL) != null) {
            VideoViewModel videoViewModelLIZ = C680890QnH.LIZ(assemReusedContainer);
            String str = c1587440rPa.LIZ;
            videoViewModelLIZ.getClass();
            videoViewModelLIZ.setState(new AwS62S1000000_11(str, 12));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void LLJJJIL(List<? extends Aweme> list, boolean z) {
        SocialFriendsFeedFragment socialFriendsFeedFragment;
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        String str;
        String str2;
        C1587320rPO c1587320rPOGS;
        C1587710rQ1 c1587710rQ1;
        C1587810rQB c1587810rQB;
        InterfaceC1587410rPX interfaceC1587410rPX;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C128Y fragment = getFragment();
        if ((fragment instanceof InterfaceC1587410rPX) && (interfaceC1587410rPX = (InterfaceC1587410rPX) fragment) != null) {
            interfaceC1587410rPX.LLJJJIL(list, z);
        }
        Fragment fragment2 = getFragment();
        if (fragment2 instanceof SocialFriendsFeedFragment) {
            socialFriendsFeedFragment = (SocialFriendsFeedFragment) fragment2;
        } else {
            socialFriendsFeedFragment = null;
        }
        boolean z2 = true;
        if (socialFriendsFeedFragment != null && (c1587320rPOGS = socialFriendsFeedFragment.gS()) != null && (c1587710rQ1 = c1587320rPOGS.LIZLLL) != null && (c1587810rQB = (C1587810rQB) c1587710rQ1.LL) != null && c1587810rQB.LLILZLL) {
            this.j0 = true;
        }
        this.f381i0++;
        C0SR4 c0sr4 = this.LLJL;
        if (c0sr4 == null || c0sr4.getCount() <= 0 || (!this.j0 ? this.f381i0 <= 1 : this.f381i0 <= 2)) {
            z2 = false;
        }
        if (!C1589640rT8.LIZIZ.F2()) {
            StoryMainTrackService storyMainTrackServiceLJJIJIIJI = C1618440sDa.LIZIZ.LJJIJIIJI();
            if (storyMainTrackServiceLJJIJIIJI != null) {
                storyMainTrackServiceLJJIJIIJI.LIZIZ("", "FRIENDS_TAB", z2);
            }
        } else {
            StoryMainTrackService storyMainTrackServiceLJJIJIIJI2 = C1618440sDa.LIZIZ.LJJIJIIJI();
            if (storyMainTrackServiceLJJIJIIJI2 != null) {
                storyMainTrackServiceLJJIJIIJI2.LIZIZ("FRIENDS_FEED", "HOME", z2);
            }
        }
        C1587740rQ4.LIZ.getClass();
        if (!C1587740rQ4.LJIJI) {
            C722660SWi.LIZ = false;
        }
        super.LLJJJIL(list, z);
        if (!this.f379e0) {
            if (!C086I.LIZIZ(list)) {
                LLIILZL((Aweme) ListProtector.get(list, 0));
            }
            this.f379e0 = false;
        }
        if (getUserVisibleHint()) {
            M(C086I.LIZIZ(this.LLJL.Fg()));
        }
        SocialFriendsFeedFragment socialFriendsFeedFragment2 = this.f0;
        if (socialFriendsFeedFragment2 != null) {
            if (socialFriendsFeedFragment2.hS()) {
                int currentItem = this.LLJJIJI.getCurrentItem();
                HandlerHook.viewPost(this.LLJJIJI, new ARunnableS18S0201000_12(currentItem, this, this.LLJL.getItem(currentItem), 4));
            }
            boolean zHS = socialFriendsFeedFragment2.hS();
            int i = this.f380h0;
            if (i != 0) {
                if (i == 3) {
                    str = "click";
                }
            } else {
                str = "draw";
            }
            if (list.isEmpty()) {
                str2 = "no_video";
            } else if (zHS) {
                str2 = "with_update";
            } else {
                str2 = "no_update";
            }
            C1400330mXn.LIZ.getClass();
            C1400330mXn.LJFF("homepage_friends", str, str2);
        }
        InterfaceC1587520rPi interfaceC1587520rPi = this.g0;
        if (interfaceC1587520rPi != null) {
            interfaceC1587520rPi.N8();
        }
        this.f380h0 = -1;
        L();
        Activity activity = this.activity;
        if ((activity instanceof C19EG) && (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI((C19EG) activity, null))) != null) {
            iBottomTabLayoutAbilityLJIIIZ.vJ1();
        }
        C1587740rQ4.LJIIIZ = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus.LIZLLL().LJIJJ(this);
        C2189821An6 c2189821An6 = this.LLLLIIIILLL;
        HashMap<String, String> map = new HashMap<>();
        map.put("vod_tag", "social_friends_tab_v1");
        c2189821An6.setExtra(map);
        LJJLIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC1255930imt
    public final void w(int i, List list) {
        this.c0 = false;
        if (this.LLJL.getCount() == 0) {
            this.LLJL.setData(list);
        } else {
            this.LLJL.LJJLIIIJILLIZJL(i, 1, list);
        }
        if (i >= 0 && i < this.LLJL.getCount()) {
            this.LLJJIJI.setCurrentItem(i);
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS112S0100000_12((Object) this, 483));
        L();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0Ryb
            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "friends_tab_feed";
            }

            @Override // X.C713370RyZ
            public final C711360RvK LJJLL() {
                return new C711360RvK(new AwS590S0100000_11(this, 392));
            }

            @Override // X.C713370RyZ, X.C0SR4
            public final /* bridge */ /* synthetic */ C711420RvQ LJJLI() {
                return LJJLL();
            }

            @Override // X.C713370RyZ, X.C0SR4, androidx.viewpager.widget.PagerAdapter
            public final int LJIJJ(Object obj) {
                Aweme aweme;
                Aweme aweme2;
                String aid;
                Aweme aweme3;
                User author;
                Aweme aweme4;
                C0SZ8 c0sz8LJJLIIIIJ = C0SR4.LJJLIIIIJ((View) obj);
                String nickname = null;
                if (c0sz8LJJLIIIIJ != null && (aweme = c0sz8LJJLIIIIJ.getAweme()) != null && aweme.getUserStory() != null && c0sz8LJJLIIIIJ != null && (aweme2 = c0sz8LJJLIIIIJ.getAweme()) != null && aweme2.getIsTikTokStory()) {
                    int count = getCount();
                    int i = 0;
                    while (true) {
                        if (i >= count) {
                            break;
                        }
                        Aweme aweme5 = (Aweme) ListProtector.get(Fg(), i);
                        String aid2 = aweme5.getAid();
                        if (c0sz8LJJLIIIIJ != null && (aweme4 = c0sz8LJJLIIIIJ.getAweme()) != null) {
                            aid = aweme4.getAid();
                        } else {
                            aid = null;
                        }
                        if (Intrinsics.LJFF(aid2, aid)) {
                            UserStory userStory = aweme5.getUserStory();
                            if (userStory != null && userStory.getShouldStartFromUnViewedStoryIdx()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("getItemPosition: author: ");
                                if (c0sz8LJJLIIIIJ != null && (aweme3 = c0sz8LJJLIIIIJ.getAweme()) != null && (author = aweme3.getAuthor()) != null) {
                                    nickname = author.getNickname();
                                }
                                sbLIZ.append(nickname);
                                sbLIZ.append(" - use new idx");
                                C2188811AlT.LIZIZ(sbLIZ);
                                return -2;
                            }
                        } else {
                            i++;
                        }
                    }
                    return super.LJIJJ(obj);
                }
                return super.LJIJJ(obj);
            }

            @Override // X.C713370RyZ, X.C0SR4, X.InterfaceC692440REc
            public final void setData(List<? extends Aweme> list) {
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    arrayList.addAll(list);
                }
                if (!C713400Ryc.LIZ) {
                    Aweme aweme = new Aweme();
                    aweme.setAid(UUID.randomUUID().toString());
                    aweme.setAwemeType(325);
                    aweme.setFriendsTabFakeAweme(true);
                    arrayList.add(aweme);
                }
                super.setData(arrayList);
            }

            @Override // X.C0SR4
            @InterfaceC1294060jmO
            public final void LJJLIIIJILLIZJL(int i, int i2, List list) {
                if (((Number) C0AI3.LIZ.getValue()).intValue() == 1) {
                    if (list != null && !list.isEmpty() && i >= 0 && i < list.size() && i <= getCount()) {
                        List<Aweme> listLJJJLZIJ = LJJJLZIJ();
                        for (int i3 = 0; i3 < i2; i3++) {
                            int i4 = i + i3;
                            if (i4 >= list.size()) {
                                break;
                            }
                            Object obj = ListProtector.get(list, i4);
                            if (obj != null) {
                                ListProtector.add(listLJJJLZIJ, i, obj);
                            }
                        }
                        C0SR6 c0sr6 = this.LLJILJIL;
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        for (Aweme aweme : listLJJJLZIJ) {
                            if (hashSet.add(aweme.getAid())) {
                                arrayList.add(aweme);
                            }
                        }
                        c0sr6.LJI(arrayList);
                        notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                super.LJJLIIIJILLIZJL(i, i2, list);
            }
        };
    }
}
