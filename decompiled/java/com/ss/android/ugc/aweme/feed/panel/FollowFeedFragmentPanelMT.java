package com.ss.android.ugc.aweme.feed.panel;

import X.AbstractC1588450rRD;
import X.C00GD;
import X.C086I;
import X.C0HTT;
import X.C0R9L;
import X.C0RO7;
import X.C0SR4;
import X.C0SZ8;
import X.C0T17;
import X.C0W93;
import X.C1029590ctp;
import X.C1045340dJE;
import X.C1233040iBy;
import X.C1380900m2S;
import X.C13LP;
import X.C1440005kM;
import X.C14EU;
import X.C1576750r8L;
import X.C1588540rRM;
import X.C1588800rRm;
import X.C1588840rRq;
import X.C1591220rVg;
import X.C15O7;
import X.C1601110rld;
import X.C1603210rp1;
import X.C1618440sDa;
import X.C1749280vcc;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2279641EKs;
import X.C23250099c;
import X.C2350109It;
import X.C278420Avg;
import X.C486860J7k;
import X.C494201wC;
import X.C607520NsE;
import X.C690420R6i;
import X.C690440R6k;
import X.C691870RBx;
import X.C713370RyZ;
import X.C714460S0u;
import X.C722660SWi;
import X.C729510SjV;
import X.C729980SkG;
import X.C786410Ut5;
import X.C805300ViS;
import X.C818480W8w;
import X.EnumC607570NsJ;
import X.InterfaceC1581880rGc;
import X.InterfaceC497601wk;
import X.InterfaceC689860R4e;
import Y.ACallableS72S1100000_24;
import Y.ARunnableS18S0201000_12;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedCombineOptimizeExpObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import com.ss.android.ugc.aweme.story.homepage.StoryMainTrackService;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS243S0000000_11;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public class FollowFeedFragmentPanelMT extends FullFeedFragmentPanel {
    public boolean a0;
    public C1588540rRM b0;
    public FeedFollowFragment c0;
    public FeedFollowFragment d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public FeedFollowFragment f368e0;
    public boolean f0;
    public boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f369h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f370i0;

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Ng1() {
        C1749280vcc c1749280vccEf0;
        IHomeSidebarService iHomeSidebarService;
        this.f369h0 = true;
        N();
        super.Ng1();
        if (getUserVisibleHint() && this.activity != null && ((iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi(IHomeSidebarService.class)) == null || !iHomeSidebarService.LJ(this.activity))) {
            C486860J7k.LIZIZ((C19EG) this.activity).KQ2(false);
        }
        C0SR4 c0sr4 = this.LLJL;
        if (c0sr4 != null && c0sr4.getCount() > 0) {
            if (getUserVisibleHint()) {
                hs();
            }
            this.LLJL.setData(Collections.emptyList());
            this.LLJL.LLJILLL = false;
            PlayButtonComponentTemp playButtonComponentTemp = this.LLJI;
            if (playButtonComponentTemp != null) {
                playButtonComponentTemp.z32(0.0f);
            }
            LLLIZZ(Float.valueOf(0.0f));
            C1440005kM.LIZ(new C0RO7(true, xy2(), true));
        }
        t();
        IPageStateAbility iPageStateAbility = this.LLIZLLLIL;
        if (iPageStateAbility != null && (c1749280vccEf0 = iPageStateAbility.ef0()) != null) {
            C786410Ut5.LLLZLZ(c1749280vccEf0, 8);
        }
        C1588540rRM c1588540rRM = this.b0;
        if (c1588540rRM != null && c1588540rRM.LIZ() != null) {
            this.b0.LIZ().LJ((InterfaceC1581880rGc) this.f.findViewById(R.id.t25));
        }
        FeedFollowFragment feedFollowFragment = this.d0;
        if (feedFollowFragment != null) {
            feedFollowFragment.N8();
        }
        C818480W8w.LIZJ("homepage_follow", C0W93.SUCCESS, "empty", C2097608Jq.LJ());
        C15O7.LIZJ(new ACallableS72S1100000_24(C00GD.SUCCESS, "empty_page", 0));
    }

    public FollowFeedFragmentPanelMT() {
        super("homepage_follow", 1);
        this.a0 = true;
    }

    public final int K() {
        List<Aweme> listLLZZZIL;
        C607520NsE c607520NsE = C607520NsE.LIZ;
        EnumC607570NsJ enumC607570NsJ = EnumC607570NsJ.GLOBAL;
        c607520NsE.getClass();
        Set set = (Set) C607520NsE.LIZIZ().get(enumC607570NsJ);
        String str = set != null ? (String) C13LP.LJJJLIIL(set) : null;
        if (!TextUtils.isEmpty(str) && (listLLZZZIL = LLZZZIL()) != null && !listLLZZZIL.isEmpty()) {
            for (int i = 0; i < listLLZZZIL.size(); i++) {
                Aweme aweme = (Aweme) ListProtector.get(listLLZZZIL, i);
                if (aweme != null && TextUtils.equals(aweme.getAid(), str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void LJ() {
        if (this.f370i0) {
            return;
        }
        super.LJ();
        M();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void LJJJJJL() {
        this.g0 = this.LLJLILLLLZIIL == this.LLJL.getCount() - 1;
        N();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final boolean LJLJI() {
        IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi(IHomeSidebarService.class);
        if (iHomeSidebarService == null || !iHomeSidebarService.LJ(this.activity)) {
            return super.LJLJI();
        }
        return true;
    }

    public final void M() {
        View view;
        if (!FollowFeedCombineOptimizeExpObject.INSTANCE.isHit()) {
            View viewL = L();
            if (viewL != null) {
                C786410Ut5.LJLLLLLL(8, viewL);
                return;
            }
            return;
        }
        if (getFragment() != null) {
            Fragment fragment = getFragment();
            if (!(fragment instanceof FeedFollowFragment) || (view = ((FeedFollowFragment) fragment).LLJILLL) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public final void N() {
        if (this.g0 && this.f369h0) {
            HashMap map = new HashMap();
            map.put("enter_from", "homepage_follow");
            C20684815ws.LJIILLIIL("livesdk_follow_tab_end_show", map);
            this.g0 = false;
            this.f369h0 = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void t() {
        View viewL;
        C0SR4 c0sr4 = this.LLJL;
        if ((c0sr4 == null || c0sr4.getCount() <= 0) && (viewL = L()) != null) {
            C786410Ut5.LJLLLLLL(0, viewL);
        }
    }

    public final View L() {
        if (getFragment() != null) {
            Fragment fragment = getFragment();
            if (fragment instanceof FeedFollowFragment) {
                FeedFollowFragment feedFollowFragment = (FeedFollowFragment) fragment;
                if (feedFollowFragment.LLJILLL == null && feedFollowFragment.getContext() != null && feedFollowFragment.cS() != null && feedFollowFragment.cS().LIZ() != null) {
                    feedFollowFragment.LLJILLL = feedFollowFragment.cS() != null ? feedFollowFragment.cS().LIZ() : null;
                    ((LoadMorePanelComponentTempHelper) feedFollowFragment.Ew0()).addView(feedFollowFragment.LLJILLL, new FrameLayout.LayoutParams(-1, -1));
                }
                return feedFollowFragment.LLJILLL;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void R() {
        super.R();
        M();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final boolean cl0() {
        return super.cl0();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void g() {
        super.g();
        if (this.LLLILZ) {
            this.LLLILZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onDestroyView() {
        super.onDestroyView();
        if (C1591220rVg.LIZLLL()) {
            this.f368e0 = null;
            this.d0 = null;
            this.c0 = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onResume() {
        Aweme awemeLJIIIZ;
        C0SZ8 c0sz8Td0;
        boolean zLJI = MethodIDManager.LJI(71978);
        if (C1601110rld.LIZ() && TextUtils.equals(getEventType(), "homepage_follow")) {
            Aweme item = this.LLJL.getItem(0);
            if (C729980SkG.LJIIIIZZ(item) && C729510SjV.LJJIIZ(item) && (awemeLJIIIZ = C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJIIIZ(AwemeExtKt.getAuthorUid(item))) != null && awemeLJIIIZ != item) {
                ListProtector.set(this.LLJL.LJJJLZIJ(), 0, awemeLJIIIZ);
                String aid = awemeLJIIIZ.getAid();
                IViewPagerComponentAbility iViewPagerComponentAbility = this.LLJJIJIIJIL;
                if (iViewPagerComponentAbility != null && (c0sz8Td0 = iViewPagerComponentAbility.td0(aid)) != null) {
                    c0sz8Td0.LJI(awemeLJIIIZ);
                }
            }
        }
        super.onResume();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel
    public final void LJJIJIIJI(String str) {
        super.LJJIJIIJI(str);
        if (!this.f0) {
            this.f0 = true;
            C818480W8w.LIZIZ("homepage_follow");
            C15O7.LIZJ(new ACallableS72S1100000_24(C00GD.SUCCESS, "follow_page", 0));
        }
        C23250099c.LIZLLL((InterfaceC497601wk) C805300ViS.LIZIZ.getValue(), null, null, new C2350109It(str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC723190SYj
    public final void Uo(FollowStatus followStatus) {
        LJLIIIL(followStatus);
        if (followStatus.getFollowStatus() == 0) {
            String userId = followStatus.getUserId();
            C0SR4 c0sr4 = this.LLJL;
            if (c0sr4 != null && !C086I.LIZIZ(c0sr4.Fg()) && !TextUtils.isEmpty(userId) && this.LLJL.LJJLIIIJLLLLLLLZ(userId)) {
                LJJZZI(this.LLJJIJI.getCurrentItem(), this.LLJJIJIIJIL.Pn2(), true);
                LLFZ();
                C();
                LLILLIZIL(this.LLJJIJI.getCurrentItem());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        super.Uq2(exc);
        M();
        C818480W8w.LIZJ("homepage_follow", C0W93.FAIL, null, C2097608Jq.LJ());
        C15O7.LIZJ(new ACallableS72S1100000_24(C00GD.FAIL, "follow_page", 0));
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        super.Wi(exc);
        C1233040iBy c1233040iBy = new C1233040iBy(getContext());
        c1233040iBy.LIZIZ(2131848736);
        c1233040iBy.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel
    public final void h(boolean z) {
        super.h(z);
        if (!this.LLZLLIL) {
            this.LLLILZ = true;
        } else {
            this.LLLILZ = false;
        }
    }

    @C14EU
    public void onAdTabChangedEvent(C0T17 c0t17) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        boolean zEquals = TextUtils.equals(c0t17.LIZ, "Following");
        ((C1045340dJE) C1029590ctp.LIZ()).LJIL(getContext(), BaseListFragmentPanel.LJLLLLLL(LJLIL()), LJIIIIZZ(), zEquals);
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null) {
            if (!zEquals) {
                interfaceC689860R4eK9.LLFII(false);
            }
            interfaceC689860R4eK9.LLILLL(zEquals);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onFollowCleanModeChangedEvent(C1576750r8L c1576750r8L) {
        boolean z = C690440R6k.LIZ().LIZIZ;
        this.LLLLIIIILLL.setPlaylistCleanMode(z);
        if (!LLILLL() && this.LLJJIJI != null) {
            for (int i = 0; i < this.LLJJIJI.getChildCount(); i++) {
                C0SZ8 c0sz8LJLJJI = LJLJJI(i);
                if (c0sz8LJLJJI != null) {
                    c0sz8LJLJJI.LJIIZILJ(z);
                }
            }
        }
    }

    @C14EU
    public void onLandPagePopupWebShowEvent(C691870RBx c691870RBx) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        Activity activity;
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null && (activity = this.activity) != null && (activity instanceof C19EG) && Hox.AQ2((C19EG) activity).KQ2("Following")) {
            interfaceC689860R4eK9.LJLLLLLL(c691870RBx);
        }
    }

    @C14EU
    public void onLandPagePopupWebShowPauseEvent(C690420R6i c690420R6i) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        Activity activity;
        C0SZ8 c0sz8LJLIL = LJLIL();
        if (c0sz8LJLIL != null && (interfaceC689860R4eK9 = c0sz8LJLIL.K9()) != null && (activity = this.activity) != null && (activity instanceof C19EG) && Hox.AQ2((C19EG) activity).KQ2("Following")) {
            interfaceC689860R4eK9.LLJJL(c690420R6i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        boolean z2;
        Activity activity;
        boolean z3;
        if (list.size() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f369h0 = z2;
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        if (c1618440sDa.LJJIJIIJI() != null && this.LLJL != null) {
            StoryMainTrackService storyMainTrackServiceLJJIJIIJI = c1618440sDa.LJJIJIIJI();
            if (this.LLJL.getCount() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            storyMainTrackServiceLJJIJIIJI.LIZIZ("Following", "HOME", z3);
        }
        N();
        if (((Boolean) C2279641EKs.LJ.getValue()).booleanValue()) {
            C722660SWi.LIZ = false;
        }
        C1588540rRM c1588540rRM = this.b0;
        if (c1588540rRM != null && c1588540rRM.LIZ() != null) {
            this.b0.LIZ().LIZIZ();
        }
        Activity activity2 = this.activity;
        if (activity2 instanceof C19EG) {
            ViewModelProviders.of((C19EG) activity2).get(FollowPageFirstFrameViewModel.class).getClass();
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().F5().LIZIZ("homepage_follow");
        super.LLJJJIL(list, z);
        if (!this.a0) {
            if (!C086I.LIZIZ(list)) {
                LLIILZL((Aweme) ListProtector.get(list, 0));
            }
            this.a0 = false;
        }
        if (getUserVisibleHint() && (activity = this.activity) != null) {
            C486860J7k.LIZIZ((C19EG) activity).KQ2(!C086I.LIZIZ(this.LLJL.Fg()));
        }
        FeedFollowFragment feedFollowFragment = this.c0;
        if (feedFollowFragment != null && feedFollowFragment.hS()) {
            int currentItem = this.LLJJIJI.getCurrentItem();
            Aweme item = this.LLJL.getItem(currentItem);
            if (item != null && TextUtils.equals(item.getAid(), C1380900m2S.LIZ())) {
                AwemeExtKt.appendMobParam(item, "is_from_push", "1");
                AwemeExtKt.appendMobParam(item, "push_type", C1380900m2S.LIZJ());
                AwemeExtKt.appendMobParam(item, "push_id", C1380900m2S.LIZIZ());
            }
            HandlerHook.viewPost(this.LLJJIJI, new ARunnableS18S0201000_12(currentItem, item, this, 2));
            return;
        }
        Activity activity3 = this.activity;
        if (activity3 != null) {
            try {
                if (TextUtils.equals(Hox.AQ2((C19EG) activity3).DQ2("HOME", false), "Following")) {
                    C1233040iBy c1233040iBy = new C1233040iBy(this.activity);
                    c1233040iBy.LIZIZ(2131830409);
                    c1233040iBy.LIZLLL();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        FeedFollowFragment feedFollowFragment2 = this.d0;
        if (feedFollowFragment2 == null) {
            return;
        }
        feedFollowFragment2.N8();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        boolean z2;
        AbstractC1588450rRD abstractC1588450rRD;
        ILoadMoreAbility iLoadMoreAbility;
        if (list.size() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f369h0 = z2;
        N();
        super.Pj(list, z);
        if (!z && (iLoadMoreAbility = this.LLILZLL) != null) {
            iLoadMoreAbility.showLoadMoreEmpty();
        }
        if (!list.isEmpty()) {
            C1588540rRM c1588540rRM = this.b0;
            if (c1588540rRM != null && c1588540rRM.LIZ() != null) {
                this.b0.LIZ().LIZIZ();
            }
            M();
        }
        FeedFollowFragment feedFollowFragment = this.f368e0;
        if (feedFollowFragment != null && (abstractC1588450rRD = feedFollowFragment.LLJJJJ) != null) {
            T t = abstractC1588450rRD.LIZ.LL;
            if (t instanceof C1588840rRq) {
                if (C278420Avg.LIZ()) {
                    feedFollowFragment.LLJLL = Long.valueOf(System.currentTimeMillis());
                    int i = C2187451AjH.LIZ;
                }
                FeedFollowFragment.nS((C1588840rRq) t);
                FollowTabAbility followTabAbilityLIZ = C494201wC.LIZ(feedFollowFragment);
                if (followTabAbilityLIZ != null) {
                    followTabAbilityLIZ.fO1();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC739960T0w, X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.nns);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(null);
            if (viewFindViewById instanceof C1603210rp1) {
                ((C1603210rp1) viewFindViewById).setEnableOverdarwOpt(true);
            }
        }
        C1588800rRm.LIZ.set(true);
        LJJLIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC1255930imt
    public final void w(int i, List list) {
        C0SR4 c0sr4;
        if (!LLILLL() && (c0sr4 = this.LLJL) != null && this.LLJJIJI != null) {
            if (c0sr4.getCount() == 0) {
                this.LLJL.setData(list);
            } else {
                this.LLJL.LJJLIIIJILLIZJL(i, 1, list);
            }
            if (i >= 0 && i < this.LLJL.getCount()) {
                this.LLJJIJI.setCurrentItem(i);
                Aweme item = this.LLJL.getItem(i);
                if (C729510SjV.LJJIIZ(item)) {
                    LJLIL().LJJJJ(i, item);
                }
            }
            if (this.LLJL.getCount() > 0) {
                C1588540rRM c1588540rRM = this.b0;
                if (c1588540rRM != null && c1588540rRM.LIZ() != null) {
                    this.b0.LIZ().LIZIZ();
                }
                M();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final C0SR4 LJJLIIIJLJLI(final Context context, final LayoutInflater layoutInflater, final C0HTT c0htt, final Fragment fragment, final C714460S0u c714460S0u, final BaseFeedPageParams baseFeedPageParams, final C0R9L c0r9l) {
        return new C713370RyZ(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l) { // from class: X.0S0g
            @Override // X.C713370RyZ, X.C0SR4
            public final String LJJJLIIL() {
                return "follow_feed";
            }

            @Override // X.C713370RyZ
            public final C711360RvK LJJLL() {
                return new C711360RvK(AFwS243S0000000_11.get$arr$(724)) { // from class: X.0S0f
                    {
                        AFwS243S0000000_11 aFwS243S0000000_11 = C714330S0h.LIZ;
                    }
                };
            }

            @Override // X.C713370RyZ, X.C0SR4
            public final /* bridge */ /* synthetic */ C711420RvQ LJJLI() {
                return LJJLL();
            }
        };
    }
}
