package com.ss.android.ugc.feed.platform.panel.accessibility;

import X.AccessibilityManagerTouchExplorationStateChangeListenerC1565770qqd;
import X.C01GW;
import X.C0QSJ;
import X.C0RJN;
import X.C0SZ8;
import X.C0T3R;
import X.C1389300mG0;
import X.C13LE;
import X.C14EU;
import X.C1561630qjx;
import X.C1561640qjy;
import X.C1561650qjz;
import X.C1561660qk0;
import X.C1561670qk1;
import X.C1561680qk2;
import X.C1563600qn8;
import X.C1564300qoG;
import X.C1565490qqB;
import X.C1565780qqe;
import X.C1565790qqf;
import X.C1565800qqg;
import X.C1566140qrE;
import X.C1601690rmZ;
import X.C1A5L;
import X.C20094213jo;
import X.C20642515q3;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2344009Gk;
import X.C296200BjG;
import X.C299750Boz;
import X.C452501pT;
import X.C487960JBq;
import X.C581630MrZ;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C690200R5m;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.accessibility.A11yFeedToolComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import u4.q0;

/* JADX INFO: loaded from: classes25.dex */
public final class A11yFeedToolComponent extends BasePanelUIComponent implements InterfaceC1616070s9l {
    public static final C690200R5m LLLFFI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public static final C01GW<Keva> LLLI;
    public static boolean LLLII;
    public static boolean LLLIIII;
    public static boolean LLLIIIIL;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C630740Ooa LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public AccessibilityManager LLJJIJIL;
    public AccessibilityManagerTouchExplorationStateChangeListenerC1565770qqd LLJJJ;
    public final HashMap<Integer, String> LLJJJIL;
    public final C01GW LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public TuxIconView LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public volatile HomeViewPagerAbility LLJZIJLIL;
    public volatile HomeTabAbility LLL;
    public InterfaceC665370Q7z LLLF;
    public C0QSJ LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(A11yFeedToolComponent.class, "homeViewPagerAbilityByDI", "getHomeViewPagerAbilityByDI()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(A11yFeedToolComponent.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0)};
        LLLFFI = new C690200R5m();
        LLLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(406));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    public final boolean Go() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        LLLFFI.getClass();
        return LLLI.getValue().getBoolean("settings_switch_on", true) && (accessibilityManager = this.LLJJIJIL) != null && accessibilityManager.isEnabled() && (accessibilityManager2 = this.LLJJIJIL) != null && accessibilityManager2.isTouchExplorationEnabled();
    }

    public final C0QSJ Ho() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLFF;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLF;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLF = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLLFF = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final HomeTabAbility Lo() {
        HomeTabAbility homeTabAbility = this.LLL;
        if (homeTabAbility == null) {
            synchronized (this) {
                homeTabAbility = this.LLL;
                if (homeTabAbility == null) {
                    C0QSJ c0qsjHo = Ho();
                    HomeTabAbility homeTabAbility2 = c0qsjHo != null ? (HomeTabAbility) c0qsjHo.getAbility(HomeTabAbility.class) : null;
                    this.LLL = homeTabAbility2;
                    return homeTabAbility2;
                }
            }
        }
        return homeTabAbility;
    }

    public A11yFeedToolComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        C01GW c01gwLIZIZ4;
        C01GW c01gwLIZIZ5;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1515), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1561630qjx(false, this));
        }
        this.LLJIJIL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1516), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C1561640qjy(false, this));
        }
        this.LLJILJIL = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1517), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new C1561670qk1(false, this));
        }
        this.LLJILJILJ = c01gwLIZIZ3;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa4 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1518), null);
            C1566140qrE.LIZJ(this, c630740Ooa4);
            c01gwLIZIZ4 = c630740Ooa4;
        } else {
            c01gwLIZIZ4 = C452501pT.LIZIZ(new C1561650qjz(false, this));
        }
        this.LLJILLL = c01gwLIZIZ4;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa5 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1519), null);
            C1566140qrE.LIZJ(this, c630740Ooa5);
            c01gwLIZIZ5 = c630740Ooa5;
        } else {
            c01gwLIZIZ5 = C452501pT.LIZIZ(new C1561680qk2(false, this));
        }
        this.LLJJ = c01gwLIZIZ5;
        this.LLJJI = C452501pT.LIZIZ(new C1563600qn8(this));
        this.LLJJIII = C452501pT.LIZIZ(new C1561660qk0(this));
        this.LLJJIJI = C628500Oky.LIZ(new C1565490qqB(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1564300qoG(this));
        this.LLJJJIL = new HashMap<>();
        this.LLJJJJ = C452501pT.LIZIZ(new C1565780qqe(this));
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = true;
        this.LLJLL = true;
        this.LLJLLIL = true;
        this.LLJZ = true;
    }

    public final boolean Oo() {
        HomeTabAbility homeTabAbilityLo = C296200BjG.LIZ() ? Lo() : (HomeTabAbility) this.LLJJ.getValue();
        String strCt0 = homeTabAbilityLo != null ? homeTabAbilityLo.Ct0() : null;
        HomeTabAbility homeTabAbilityLo2 = C296200BjG.LIZ() ? Lo() : (HomeTabAbility) this.LLJJ.getValue();
        boolean z = (Intrinsics.LJFF(homeTabAbilityLo2 != null ? homeTabAbilityLo2.Zj2() : null, "FRIENDS_TAB") || Intrinsics.LJFF(strCt0, "FRIENDS_FEED")) && Intrinsics.LJFF(getPanelContext().LIZ, "Friends");
        HomeTabAbility homeTabAbilityLo3 = C296200BjG.LIZ() ? Lo() : (HomeTabAbility) this.LLJJ.getValue();
        return (homeTabAbilityLo3 != null && homeTabAbilityLo3.ft0(getPanelContext().LIZ)) || z || a0.LJJIIZI(getPanelContext().LIZ, "DETAIL", false);
    }

    public final boolean Vo() {
        if (Go()) {
            String str = getPanelContext().LIZ;
            int iHashCode = str.hashCode();
            if (iHashCode == -1965615457) {
                str.equals("Nearby");
                return true;
            }
            if (iHashCode != -1525083535) {
                if (iHashCode != 984907784 || !str.equals("For You")) {
                    return true;
                }
                FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LLJJIJI.getValue();
                if ((feedRecommendSkylightDrawerAbility == null || !feedRecommendSkylightDrawerAbility.yw0()) && !LLLIIII) {
                    return true;
                }
            } else {
                if (!str.equals("Following")) {
                    return true;
                }
                if (!LLLII && !LLLIIII) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4 A[PHI: r1
      0x00d4: PHI (r1v1 boolean) = (r1v0 boolean), (r1v10 boolean), (r1v10 boolean) binds: [B:45:0x00d2, B:16:0x0038, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bp() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.accessibility.A11yFeedToolComponent.bp():void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility;
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility;
        AccessibilityManager accessibilityManager;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        AccessibilityManagerTouchExplorationStateChangeListenerC1565770qqd accessibilityManagerTouchExplorationStateChangeListenerC1565770qqd = this.LLJJJ;
        if (accessibilityManagerTouchExplorationStateChangeListenerC1565770qqd != null && (accessibilityManager = this.LLJJIJIL) != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC1565770qqd);
        }
        if (C1389300mG0.LJIL(getPanelContext()) && this.LLJJIJI.getValue() != null && (feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LLJJIJI.getValue()) != null) {
            feedRecommendSkylightDrawerAbility.Km((Function1) this.LLJJJJ.getValue());
        }
        if (!C1389300mG0.LJIL(getPanelContext()) || this.LLJJIJIIJIL.getValue() == null || (feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLJJIJIIJIL.getValue()) == null) {
            return;
        }
        feedSkylightDrawerLogicAbility.Km((Function1) this.LLJJJJ.getValue());
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (Go()) {
            No(false);
        } else {
            cp(true);
        }
    }

    public static boolean So(Aweme aweme) {
        CardInsertInfo cardInsertInfo;
        if (aweme.getAwemeType() == 101 || aweme.getAwemeType() == 4004 || aweme.getAwemeType() == 4003 || aweme.getAwemeType() == 325 || AwemeBizExtKt.isReferralFakeAweme(aweme) || ((cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 8)) {
            return false;
        }
        return true;
    }

    public final String Jo(int i) {
        HashMap<Integer, String> map = this.LLJJJIL;
        Integer numValueOf = Integer.valueOf(i);
        String strLJI = map.get(numValueOf);
        if (strLJI == null) {
            strLJI = C20642515q3.LJI(i);
            map.put(numValueOf, strLJI);
        }
        return strLJI;
    }

    public final void No(boolean z) {
        String str;
        View viewLJLLLL;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        if (!this.LLJLLL) {
            View view = this.LLJJJJLIIL;
            if (view != null) {
                ViewStub viewStub = (ViewStub) view.findViewById(R.id.a0d);
                TuxIconView tuxIconView3 = null;
                if (viewStub != null) {
                    viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                } else {
                    viewLJLLLL = null;
                }
                this.LLJJJJJIL = viewLJLLLL;
                if (viewLJLLLL != null) {
                    tuxIconView = (TuxIconView) viewLJLLLL.findViewById(R.id.zb8);
                } else {
                    tuxIconView = null;
                }
                this.LLJJL = tuxIconView;
                View view2 = this.LLJJJJJIL;
                if (view2 != null) {
                    tuxIconView2 = (TuxIconView) view2.findViewById(R.id.zb9);
                } else {
                    tuxIconView2 = null;
                }
                this.LLJJLIIIJLLLLLLLZ = tuxIconView2;
                View view3 = this.LLJJJJJIL;
                if (view3 != null) {
                    tuxIconView3 = (TuxIconView) view3.findViewById(R.id.zb_);
                }
                this.LLJL = tuxIconView3;
                if (tuxIconView3 != null) {
                    tuxIconView3.setContentDescription(Jo(R.string.m6n));
                }
                View view4 = this.LLJJJJJIL;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(8, view4);
                }
                this.LLJLLL = true;
                C2271391DvN.LIZ(this.LLJJL, (C1A5L) C2271381DvM.M.getValue());
                C2271391DvN.LIZ(this.LLJJLIIIJLLLLLLLZ, (C1A5L) C2271381DvM.N.getValue());
                C2271391DvN.LIZ(this.LLJL, (C1A5L) C2271381DvM.f248O.getValue());
            } else {
                return;
            }
        }
        if (C1389300mG0.LJIL(getPanelContext()) && this.LLJZ) {
            FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LLJJIJI.getValue();
            if (feedRecommendSkylightDrawerAbility != null) {
                feedRecommendSkylightDrawerAbility.lh((Function1) this.LLJJJJ.getValue());
            }
            FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLJJIJIIJIL.getValue();
            if (feedSkylightDrawerLogicAbility != null) {
                feedSkylightDrawerLogicAbility.lh((Function1) this.LLJJJJ.getValue());
            }
        }
        if (this.LLJZ) {
            TuxIconView tuxIconView4 = this.LLJJL;
            if (tuxIconView4 != null) {
                C786410Ut5.a9(tuxIconView4, new ACListenerS158S0100000_24(this, 65));
            }
            TuxIconView tuxIconView5 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView5 != null) {
                C786410Ut5.a9(tuxIconView5, new ACListenerS158S0100000_24(this, 66));
            }
            TuxIconView tuxIconView6 = this.LLJL;
            if (tuxIconView6 != null) {
                C786410Ut5.a9(tuxIconView6, new ACListenerS158S0100000_24(this, 67));
            }
        }
        this.LLJZ = false;
        boolean zVo = Vo();
        bp();
        cp(zVo);
        if (!LLLIIIIL && zVo) {
            if (z) {
                str = "screen_reader_status_changed";
            } else {
                str = "app_launch";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", getPanelContext().LIZ);
            c2344009Gk.LJIIIIZZ("enter_method", str);
            c2344009Gk.LJIIIIZZ("to_status", "display");
            C20684815ws.LJIILLIIL("change_feed_tool_display", c2344009Gk.LIZ);
            LLLIIIIL = true;
        }
    }

    public final void cp(boolean z) {
        int i;
        View view;
        if (z && Vo()) {
            i = 0;
        } else {
            i = 8;
        }
        View view2 = this.LLJJJJJIL;
        if ((view2 != null && view2.getVisibility() == i) || (view = this.LLJJJJJIL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @C14EU
    public final void onA11yHideFeedToolEvent(C487960JBq c487960JBq) {
        boolean z = c487960JBq.LIZ;
        LLLIIII = z;
        if (z && Intrinsics.LJFF(getPanelContext().LIZ, c487960JBq.LIZIZ)) {
            cp(false);
        }
    }

    @C14EU
    public final void onDetailQuitEvent(C1565800qqg c1565800qqg) {
        if (a0.LJJIIZI(getPanelContext().LIZ, "DETAIL", false)) {
            cp(false);
        }
    }

    @C14EU
    public final void onNearbySkyLightShownEvent(C1565790qqf c1565790qqf) {
        String str;
        C0RJN panelContext = getPanelContext();
        if (panelContext != null) {
            str = panelContext.LIZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "Nearby")) {
        } else {
            throw null;
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        bp();
    }

    @C14EU
    public final void onSkyLightShownEventEvent(C0T3R c0t3r) {
        if (C1389300mG0.LJIIIIZZ(getPanelContext())) {
            boolean z = c0t3r.LIZ;
            LLLII = z;
            if (!z) {
                bp();
            }
            cp(!c0t3r.LIZ);
        }
    }

    @C14EU
    public final void onVideoPlayerEvent(C581630MrZ c581630MrZ) {
        if (Vo() && Oo()) {
            int i = c581630MrZ.LIZ;
            if (i != 0 && i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        switch (i) {
                        }
                        return;
                    }
                }
                this.LLJLLIL = false;
                bp();
                Zo(this.LLJJLIIIJLLLLLLLZ, R.raw.icon_play_fill, Jo(2131823231));
                return;
            }
            this.LLJLLIL = true;
            bp();
            Zo(this.LLJJLIIIJLLLLLLLZ, R.raw.icon_pause_fill, Jo(R.string.mwv));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0qqd, android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object objH2;
        super.onViewCreated(view);
        this.LLJJJJLIIL = view;
        if (C1601690rmZ.LIZ == null) {
            C1601690rmZ.LIZLLL();
        }
        AccessibilityManager accessibilityManager = C1601690rmZ.LIZ;
        AccessibilityManager accessibilityManager2 = accessibilityManager;
        if (accessibilityManager == null) {
            Context context = getContext();
            if (context != null) {
                objH2 = C786410Ut5.H2(context, "accessibility");
            } else {
                objH2 = null;
            }
            if (objH2 instanceof AccessibilityManager) {
                accessibilityManager2 = (AccessibilityManager) objH2;
            } else {
                accessibilityManager2 = 0;
            }
        }
        this.LLJJIJIL = accessibilityManager2;
        ?? r0 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: X.0qqd
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                String str;
                if (this.LIZ.Oo()) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", this.LIZ.getPanelContext().LIZ);
                    c2344009Gk.LJIIIIZZ("enter_method", "screen_reader_status_changed");
                    if (z) {
                        str = "display";
                    } else {
                        str = "hide";
                    }
                    c2344009Gk.LJIIIIZZ("to_status", str);
                    C20684815ws.LJIILLIIL("change_feed_tool_display", c2344009Gk.LIZ);
                    A11yFeedToolComponent.LLLFFI.getClass();
                    A11yFeedToolComponent.LLLIIIIL = true;
                }
                if (z) {
                    A11yFeedToolComponent a11yFeedToolComponent = this.LIZ;
                    if (!a11yFeedToolComponent.LLJLLL) {
                        a11yFeedToolComponent.No(true);
                    }
                    this.LIZ.bp();
                }
                this.LIZ.cp(z);
            }
        };
        this.LLJJJ = r0;
        if (accessibilityManager2 != 0) {
            accessibilityManager2.addTouchExplorationStateChangeListener(r0);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJIII.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this);
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    public final void ap(final TuxIconView tuxIconView, final boolean z) {
        if (Vo() && Oo()) {
            if (Intrinsics.LJFF(tuxIconView, this.LLJJL)) {
                if (this.LLJLIL == z) {
                    return;
                } else {
                    this.LLJLIL = z;
                }
            } else if (Intrinsics.LJFF(tuxIconView, this.LLJJLIIIJLLLLLLLZ)) {
                if (this.LLJLILLLLZIIL == z) {
                    return;
                } else {
                    this.LLJLILLLLZIIL = z;
                }
            } else if (Intrinsics.LJFF(tuxIconView, this.LLJL)) {
                if (this.LLJLL == z) {
                    return;
                } else {
                    this.LLJLL = z;
                }
            }
            if (z) {
                if (tuxIconView != null) {
                    tuxIconView.setTintColorRes(R.attr.ef);
                } else {
                    return;
                }
            } else if (tuxIconView != null) {
                tuxIconView.setTintColorRes(R.attr.eh);
            } else {
                return;
            }
            q0.LJIJ(tuxIconView, new C20094213jo() { // from class: X.0rHq
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    if (z) {
                        accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
                        accessibilityNodeInfoCompat.setStateDescription(null);
                    } else {
                        accessibilityNodeInfoCompat.setStateDescription(this.Jo(2131823160));
                        accessibilityNodeInfoCompat.removeAction(C20092413jW.LJI);
                    }
                    accessibilityNodeInfoCompat.setClickable(z);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                    if (Intrinsics.LJFF(tuxIconView, this.LLJL)) {
                        accessibilityNodeInfoCompat.setContentDescription(this.Jo(R.string.m6n));
                    }
                }
            });
        }
    }

    public final void Zo(TuxIconView tuxIconView, int i, CharSequence charSequence) {
        CharSequence contentDescription;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        Aweme awemeLLLLLJLJLL;
        if (Vo() && Oo()) {
            if (tuxIconView != null) {
                contentDescription = tuxIconView.getContentDescription();
            } else {
                contentDescription = null;
            }
            if (!Intrinsics.LJFF(contentDescription, charSequence)) {
                if (Intrinsics.LJFF(tuxIconView, this.LLJJLIIIJLLLLLLLZ) && (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJIII.getValue()) != null && (awemeLLLLLJLJLL = iViewPagerComponentAbility.LLLLLJLJLL()) != null && !So(awemeLLLLLJLJLL)) {
                    TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setIconRes(R.raw.icon_pause_fill);
                    }
                    TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setContentDescription(Jo(R.string.mwv));
                        return;
                    }
                    return;
                }
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(i);
                    tuxIconView.setContentDescription(charSequence);
                }
            }
        }
    }
}
