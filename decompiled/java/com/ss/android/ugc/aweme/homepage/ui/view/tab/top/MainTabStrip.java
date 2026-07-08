package com.ss.android.ugc.aweme.homepage.ui.view.tab.top;

import X.C01GW;
import X.C0CN5;
import X.C0DMN;
import X.C0DMQ;
import X.C0J9A;
import X.C0PEM;
import X.C0QSJ;
import X.C0RRR;
import X.C0S4J;
import X.C0S78;
import X.C1372310lob;
import X.C1388190mED;
import X.C13LE;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564680qos;
import X.C1582020rGq;
import X.C1589130rSJ;
import X.C1589670rTB;
import X.C1589790rTN;
import X.C1591440rW2;
import X.C1591450rW3;
import X.C1591460rW4;
import X.C1591470rW5;
import X.C1591530rWB;
import X.C1591560rWE;
import X.C1591590rWH;
import X.C1591620rWK;
import X.C1591700rWS;
import X.C1591980rWu;
import X.C1592080rX4;
import X.C1592450rXf;
import X.C1592470rXh;
import X.C1592500rXk;
import X.C1592820rYG;
import X.C1697810uHb;
import X.C19EG;
import X.C1EE2;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C285090BFj;
import X.C286370BKh;
import X.C296130Bj9;
import X.C324480Cnm;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C452501pT;
import X.C687700QyG;
import X.C705890RmV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1589910rTZ;
import X.EnumC592410NLj;
import X.InterfaceC1146704e9;
import X.InterfaceC1577520r9a;
import X.InterfaceC1583870rJp;
import X.InterfaceC1589760rTK;
import X.InterfaceC1589770rTL;
import X.InterfaceC1589850rTT;
import X.InterfaceC1589880rTW;
import X.InterfaceC1589890rTX;
import X.InterfaceC2217461Bqa;
import X.InterfaceC592390NLh;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import X.ViewOnLayoutChangeListenerC1620710sHF;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS5S1300000_4;
import Y.AUListenerS272S0100000_24;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.IHomePageExService;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab.XTabPanelController;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MainTabStrip implements ITabStrip, InterfaceC713360RyY, InterfaceC592390NLh, InterfaceC1146704e9 {
    public static final C1591440rW2 LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static boolean LLJZ;
    public static final C0S4J LLJZIJLIL;
    public static final HashMap<String, String> LLL;
    public static final HashMap<String, String> LLLF;
    public final FrameLayout LL;
    public final C1592450rXf LLILLJJLI;
    public final C705890RmV LLILLL;
    public final C1592500rXk LLILZ;
    public InterfaceC1589880rTW LLILZIL;
    public InterfaceC1589760rTK LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C19EG LLJI;
    public C1591700rWS LLJIJIL;
    public final XTabPanelController LLJILJIL;
    public C1591450rW3 LLJILJILJ;
    public C1591980rWu LLJILLL;
    public C1591980rWu LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public C1591470rW5 LLJJJJJIL;
    public HomeTabAbility LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public volatile MainBusinessAbility LLJL;
    public volatile HomeViewPagerAbility LLJLIL;
    public InterfaceC665370Q7z LLJLILLLLZIIL;
    public C0QSJ LLJLL;
    public int LLJ = -1;
    public int LLJJIJI = -1;
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C0DMN(this));
    public final List<InterfaceC1589890rTX> LLJJIJIL = new ArrayList();
    public final HashMap<String, InterfaceC1583870rJp> LLJJJ = new HashMap<>();
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new C1591620rWK());
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new C1591560rWE());

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MainTabStrip.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(MainTabStrip.class, "homeViewPagerAbility", "getHomeViewPagerAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0)};
        LLJLLIL = new C1591440rW2();
        LLJZIJLIL = new C0S4J("XTab");
        HashMap<String, String> mapLJI = C2097608Jq.LJI(new Pair("Following", "homepage_follow"), new Pair("For You", "homepage_hot"), new Pair("Popular", "homepage_popular"), new Pair("FRIENDS_FEED", "homepage_friends"), new Pair("Nearby", "homepage_nearby"), new Pair("Shop", "homepage_shop_mall"), new Pair("Stem", "homepage_topic_stem"), new Pair("Drama", "homepage_series"), new Pair("homepage_explore", "homepage_explore"), new Pair("Live", "homepage_live"), new Pair("Playmode_New", "homepage_playmode_new"), new Pair("Playmode_Moodboost", "homepage_playmode_moodboost"), new Pair("Playmode_Top", "homepage_playmode_top"));
        C1591530rWB c1591530rWB = C1591530rWB.LIZIZ;
        c1591530rWB.K7(mapLJI);
        LLL = mapLJI;
        c1591530rWB.K7(C2097608Jq.LJI(new Pair("Following", "homepage_hot"), new Pair("For You", "homepage_follow"), new Pair("Popular", "homepage_popular"), new Pair("Nearby", "homepage_follow"), new Pair("Friends", "homepage_friends"), new Pair("Stem", "homepage_topic_stem")));
        HashMap<String, String> mapLJI2 = C2097608Jq.LJI(new Pair("Following", "enter_homepage_follow"), new Pair("For You", "enter_homepage_hot"), new Pair("Popular", "enter_homepage_popular"), new Pair("Nearby", "enter_homepage_nearby"), new Pair("FRIENDS_FEED", "enter_homepage_friends"), new Pair("Stem", "enter_topic_tab"), new Pair("Live", "enter_homepage_live"), new Pair("homepage_explore", "enter_homepage_explore"), new Pair("Drama", "enter_homepage_series"));
        c1591530rWB.L7(mapLJI2);
        LLLF = mapLJI2;
        C2097608Jq.LJI(new Pair("Following", "click_follow_tab"), new Pair("For You", "click_hot_tab"), new Pair("Popular", "click_popular_tab"), new Pair("Nearby", "click_nearby_tab"));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void dq0() {
        String strU31 = U31(false);
        C1592450rXf c1592450rXf = this.LLILLJJLI;
        int childCount = c1592450rXf.LLILLL.getChildCount() - 1;
        while (true) {
            if (-1 >= childCount) {
                break;
            }
            C1592080rX4 c1592080rX4 = (C1592080rX4) c1592450rXf.LLILLL.getChildAt(childCount);
            C1592470rXh c1592470rXh = c1592450rXf.LLILLL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1592470rXh, null);
            c1592470rXh.removeViewAt(childCount);
            c1592080rX4.setTab(null);
            c1592080rX4.setSelected(false);
            c1592450rXf.LLJJIJIL.LIZ(c1592080rX4);
            c1592450rXf.requestLayout();
            childCount--;
        }
        Iterator<C1591980rWu> it2 = c1592450rXf.LL.iterator();
        while (it2.hasNext()) {
            C1591980rWu next = it2.next();
            it2.remove();
            next.LIZJ = null;
            next.LIZLLL = null;
            next.LIZ = -1;
            next.LIZIZ = null;
            next.LJ = null;
            C1592450rXf.LLLJL.LIZ(next);
        }
        c1592450rXf.LLILLJJLI = null;
        C1592450rXf c1592450rXf2 = this.LLILLJJLI;
        HomeTabAbility homeTabAbility = c1592450rXf2.getHomeTabAbility();
        c1592450rXf2.LLJLILLLLZIIL = homeTabAbility != null ? homeTabAbility.b9() : null;
        c1592450rXf2.LLLF = new LinkedHashMap();
        HandlerHook.viewPostDelay(c1592450rXf2, new ARunnableS124S0100000_24(c1592450rXf2, 117), 600L);
        this.LLJJIJI = -1;
        LIZ(true);
        this.LLJJ = this.LLILLJJLI.LJIIJJI(strU31);
        LLJZIJLIL.LJ("reloadTab:, remove all tabs, add new tabs");
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final int Km2() {
        if (this.LLJJIJI < 0) {
            List<TopTabProtocol> topTabProtocolList = this.LLILLJJLI.getTopTabProtocolList();
            if (topTabProtocolList == null) {
                return this.LLJJIJI;
            }
            int i = 0;
            for (TopTabProtocol topTabProtocol : topTabProtocolList) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if (Intrinsics.LJFF(topTabProtocol.getTag(), "For You")) {
                    this.LLJJIJI = i;
                }
                i = i2;
            }
        }
        return this.LLJJIJI;
    }

    public final C0QSJ LIZIZ() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJLILLLLZIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJLILLLLZIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final HomeTabViewModel LIZLLL() {
        return HomeTabViewModel.LLILZIL.LIZ(this.LLJI);
    }

    public final String LJI() {
        String strLJ;
        String str;
        C1591980rWu c1591980rWu = this.LLJILLL;
        Object obj = c1591980rWu != null ? c1591980rWu.LJ : null;
        if ((obj instanceof String) && (str = (String) obj) != null) {
            return str;
        }
        IHomePageExService iHomePageExService = (IHomePageExService) PluggableExtentionKt.pluggableSpi$default(IHomePageExService.class, false, false, false, 14, null);
        return (iHomePageExService == null || (strLJ = iHomePageExService.LJ()) == null) ? "For You" : strLJ;
    }

    public final List<InterfaceC1583870rJp> LJII() {
        return (List) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final Pair<ArrayList<String>, ArrayList<String>> Tg1() {
        String strLIZIZ;
        int width = this.LLILLJJLI.getWidth();
        if (width <= 0) {
            return new Pair<>(new ArrayList(), new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (C296130Bj9.LIZ()) {
            int tabLayoutScrollRange = this.LLILLJJLI.getTabLayoutScrollRange();
            int scrollX = this.LLILLJJLI.getScrollX();
            int width2 = this.LLILLJJLI.getWidth();
            for (int tabCount = this.LLILLJJLI.getTabCount() - 1; -1 < tabCount; tabCount--) {
                C1591440rW2 c1591440rW2 = LLJLLIL;
                C1591980rWu c1591980rWuLJIILIIL = this.LLILLJJLI.LJIILIIL(tabCount);
                String strLIZIZ2 = c1591980rWuLJIILIIL != null ? c1591980rWuLJIILIIL.LIZIZ() : null;
                c1591440rW2.getClass();
                String strLIZLLL = C1591440rW2.LIZLLL(strLIZIZ2);
                if (strLIZLLL != null) {
                    if (tabLayoutScrollRange <= 0) {
                        arrayList.add(strLIZLLL);
                        arrayList2.add(strLIZLLL);
                    } else {
                        View viewLJIILJJIL = this.LLILLJJLI.LJIILJJIL(tabCount);
                        if (viewLJIILJJIL != null) {
                            int width3 = viewLJIILJJIL.getWidth();
                            int left = viewLJIILJJIL.getLeft() - scrollX;
                            int right = viewLJIILJJIL.getRight() - scrollX;
                            if (left <= width2 && right <= width2 && left >= 0) {
                                arrayList.add(strLIZLLL);
                            }
                            arrayList2.add(strLIZLLL);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("commonComputeTabShown1: page:");
                            sbLIZ.append(strLIZLLL);
                            sbLIZ.append(", range ");
                            sbLIZ.append(tabLayoutScrollRange);
                            sbLIZ.append(" indexViewRight:");
                            sbLIZ.append(right);
                            sbLIZ.append(" indexViewLeft:");
                            sbLIZ.append(left);
                            sbLIZ.append(" Width");
                            sbLIZ.append(width3);
                            sbLIZ.append("  scrollX:");
                            sbLIZ.append(scrollX);
                            sbLIZ.append("  hostWidth:");
                            sbLIZ.append(width2);
                            sbLIZ.append("  shown:");
                            sbLIZ.append(arrayList);
                            sbLIZ.append("  full:");
                            sbLIZ.append(arrayList2);
                            sbLIZ.append(' ');
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                }
            }
        } else {
            int tabCount2 = this.LLILLJJLI.getTabCount() - 1;
            int i = 0;
            while (true) {
                if (-1 >= tabCount2) {
                    break;
                }
                View viewLJIILJJIL2 = this.LLILLJJLI.LJIILJJIL(tabCount2);
                int width4 = viewLJIILJJIL2 != null ? viewLJIILJJIL2.getWidth() : 0;
                C1591980rWu c1591980rWuLJIILIIL2 = this.LLILLJJLI.LJIILIIL(tabCount2);
                if (c1591980rWuLJIILIIL2 != null && (strLIZIZ = c1591980rWuLJIILIIL2.LIZIZ()) != null) {
                    LLJLLIL.getClass();
                    String strLIZLLL2 = C1591440rW2.LIZLLL(strLIZIZ);
                    if (strLIZLLL2 != null) {
                        strLIZIZ = strLIZLLL2;
                    }
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    int i2 = i + width4;
                    if (i2 > width && i + iLIZIZ < width) {
                        arrayList2.addAll(arrayList);
                        arrayList2.add(strLIZIZ);
                    } else if ((i - iLIZIZ) + width4 <= width && tabCount2 > 0) {
                        arrayList.add(strLIZIZ);
                    } else {
                        if (i2 <= width && tabCount2 == 0) {
                            arrayList.add(strLIZIZ);
                            break;
                        }
                        arrayList2.add(strLIZIZ);
                    }
                    i = i2;
                }
                tabCount2--;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(arrayList);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void VP2() {
        XTabPanelController xTabPanelController = this.LLJILJIL;
        if (xTabPanelController != null) {
            C343710Ddh.LIZ(xTabPanelController.LL).HQ2(xTabPanelController);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WP0() {
        /*
            r4 = this;
            X.0rW4 r0 = X.C1591460rW4.LIZ
            int r3 = X.C1591460rW4.LIZJ(r0)
            int r1 = X.C1591460rW4.LIZLLL(r0)
            X.0RmV r0 = r4.LLILLL
            if (r0 == 0) goto L69
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L12:
            boolean r0 = r2 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L3c
            X.0CXE r0 = X.C0CXE.LIZ
            r0.getClass()
            boolean r0 = X.C0CXE.LIZ()
            if (r0 != 0) goto L5f
            X.0CXC r0 = X.C0CXC.LIZ
            r0.getClass()
            boolean r0 = X.C0CXC.LIZIZ()
            if (r0 != 0) goto L5f
            boolean r0 = X.C1581510rG1.LIZIZ()
            if (r0 != 0) goto L5f
            r1 = r2
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0 = 0
            r1.setMarginStart(r0)
            r1.setMarginEnd(r0)
        L3c:
            X.0RmV r0 = r4.LLILLL
            if (r0 == 0) goto L46
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r0)
            r0.setLayoutParams(r2)
        L46:
            X.0rW2 r1 = com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip.LLJLLIL
            r4.LIZLLL()
            X.19EG r0 = r4.LLJI
            r1.getClass()
            int r1 = X.C1591440rW2.LIZIZ(r0)
            X.0rXf r0 = r4.LLILLJJLI
            r0.setTextSize(r1)
            X.0rXf r0 = r4.LLILLJJLI
            r0.LJ()
            return
        L5f:
            r0 = r2
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMarginStart(r3)
            r0.setMarginEnd(r1)
            goto L3c
        L69:
            r2 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip.WP0():void");
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void XQ1() {
        final C1591700rWS c1591700rWS = this.LLJIJIL;
        if (c1591700rWS != null) {
            HandlerHook.viewPost(c1591700rWS.LIZ.LLILLJJLI, new Runnable() { // from class: X.0rWG
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainTabRelayoutHelper@8a81.onPageSelectDispatchEnd$1");
                    try {
                        C1591700rWS c1591700rWS2 = c1591700rWS;
                        c1591700rWS2.LJIIL = false;
                        if (c1591700rWS2.LJIILIIL) {
                            c1591700rWS2.LIZJ(false, false);
                            c1591700rWS.LJIILIIL = false;
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainTabRelayoutHelper@8a81.onPageSelectDispatchEnd$1");
                }
            });
        }
    }

    public final C19EG getActivity() {
        return C1388190mED.LIZIZ(this.LLJI);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLJI.getLifecycle();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void jz1() {
        C1591440rW2 c1591440rW2 = LLJLLIL;
        LIZLLL();
        C19EG c19eg = this.LLJI;
        c1591440rW2.getClass();
        this.LLILLJJLI.setTextSize(C1591440rW2.LIZIZ(c19eg));
        this.LLILLJJLI.LJ();
        this.LLILLJJLI.LIZJ();
        HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS124S0100000_24(this, 31));
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1558360qeg.LJI(this.LLJI, null);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void onDestroy() {
        C1591460rW4.LIZ.getClass();
        C1591700rWS c1591700rWS = this.LLJIJIL;
        if (c1591700rWS != null) {
            ((ArrayList) c1591700rWS.LJ).clear();
        }
        ((ArrayList) this.LLJJIJIL).clear();
        C1558520qew.LJIIJJI(C1558360qeg.LJI(this.LLJI, null), IXTabPanelAbility.class, null);
        ITabIconService iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
        if (iTabIconService != null) {
            iTabIconService.LIZLLL(this, EnumC592410NLj.TOP);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final InterfaceC1589770rTL tO() {
        final XTabPanelController xTabPanelController = this.LLJILJIL;
        if (xTabPanelController != null) {
            return new InterfaceC1589770rTL() { // from class: X.0rWL
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [X.0VvC, X.0rW8] */
                @Override // X.InterfaceC1589770rTL
                public final void LIZ(int i, Fragment fragment) {
                    final XTabPanelController xTabPanelController2 = xTabPanelController;
                    xTabPanelController2.LLILLJJLI = fragment;
                    if (fragment != null && xTabPanelController2.LLILZ == null) {
                        ?? r2 = new AbstractC813200VvC() { // from class: X.0rW8
                            @Override // X.AbstractC813200VvC
                            public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment2) {
                                super.onFragmentPaused(fragmentManager, fragment2);
                                xTabPanelController2.LIZ();
                            }

                            @Override // X.AbstractC813200VvC
                            public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment2) {
                                XTabPanelController xTabPanelController3;
                                Fragment fragment3;
                                IFeedFragmentAbility iFeedFragmentAbilityLIZ;
                                IViewPagerComponentAbility iViewPagerComponentAbilityMb;
                                if (Intrinsics.LJFF(xTabPanelController2.LLILLJJLI, fragment2) && (fragment3 = (xTabPanelController3 = xTabPanelController2).LLILLJJLI) != null && (iFeedFragmentAbilityLIZ = C443040HYw.LIZ(C1558360qeg.LJFF(fragment3, null))) != null && (iViewPagerComponentAbilityMb = iFeedFragmentAbilityLIZ.Mb()) != null) {
                                    iViewPagerComponentAbilityMb.Bv0(xTabPanelController3);
                                }
                            }
                        };
                        xTabPanelController2.LLILZ = r2;
                        fragment.requireFragmentManager().LJZL(r2, false);
                    }
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void zf0() {
        C1591460rW4.LIZ.getClass();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void zg2() {
        C1591700rWS c1591700rWS = this.LLJIJIL;
        if (c1591700rWS != null) {
            c1591700rWS.LJIIL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final C1592450rXf LV0() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final C1591450rW3 PO0() {
        return this.LLJILJILJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MainTabStrip(android.widget.FrameLayout r11) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip.<init>(android.widget.FrameLayout):void");
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void HD(C1592820rYG c1592820rYG) {
        ((ArrayList) this.LLJJIJIL).add(c1592820rYG);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final int Jk0(String str) {
        Object obj;
        int tabCount = this.LLILLJJLI.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            C1591980rWu c1591980rWuLJIILIIL = this.LLILLJJLI.LJIILIIL(i);
            Object obj2 = null;
            if (c1591980rWuLJIILIIL != null) {
                obj = c1591980rWuLJIILIIL.LJ;
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                obj2 = obj;
            }
            if (Intrinsics.LJFF(str, obj2)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x053c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r17) {
        /*
            Method dump skipped, instruction units count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip.LIZ(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0DMQ, java.lang.Object] */
    public final void LJIIJ(final C1592450rXf c1592450rXf) {
        int width = c1592450rXf.getWidth();
        if (!LLJZ && width > 0) {
            Pair<ArrayList<String>, ArrayList<String>> pairTg1 = Tg1();
            final ArrayList<String> first = pairTg1.getFirst();
            final ArrayList<String> second = pairTg1.getSecond();
            ArrayList arrayList = (ArrayList) C324480Cnm.LIZIZ;
            arrayList.clear();
            arrayList.addAll(first);
            ARunnableS5S1300000_4 aRunnableS5S1300000_4 = C324480Cnm.LIZLLL;
            if (aRunnableS5S1300000_4 != null) {
                aRunnableS5S1300000_4.run();
            }
            C324480Cnm.LIZLLL = null;
            LLJZ = true;
            ?? r4 = new Runnable() { // from class: X.0DMQ
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:31:0x015c A[Catch: all -> 0x0401, TryCatch #0 {all -> 0x0401, blocks: (B:3:0x0019, B:4:0x00c4, B:6:0x00ca, B:7:0x00de, B:9:0x00e8, B:11:0x00fc, B:12:0x0102, B:17:0x010a, B:20:0x011f, B:23:0x012c, B:24:0x013b, B:27:0x0145, B:29:0x0151, B:30:0x0159, B:31:0x015c, B:32:0x0162, B:35:0x016d, B:38:0x0178, B:41:0x0183, B:44:0x018e, B:47:0x0199, B:50:0x01a4, B:53:0x01ad, B:56:0x01b8, B:59:0x01c3, B:62:0x01ca, B:65:0x01d5, B:70:0x01e2, B:71:0x01e7, B:73:0x01f0, B:74:0x01f6, B:76:0x020f, B:86:0x0222, B:87:0x0228, B:90:0x0230, B:91:0x0236, B:93:0x023e, B:94:0x0244, B:96:0x024e, B:98:0x0254, B:102:0x0264, B:104:0x0270, B:105:0x0277, B:107:0x027d, B:109:0x0291, B:110:0x0297, B:115:0x029f, B:118:0x02b4, B:120:0x02c2, B:122:0x02cd, B:124:0x02d1, B:126:0x02d5, B:128:0x02eb, B:129:0x031b, B:131:0x0321, B:132:0x0335, B:133:0x0338, B:136:0x038a, B:138:0x03a5, B:139:0x03aa, B:119:0x02b9, B:116:0x02a2, B:22:0x0125, B:18:0x010d), top: B:147:0x0019 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 1130
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0DMQ.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainTabStrip@28b8.tabShownStatics$reportRunnable$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainTabStrip@28b8.tabShownStatics$reportRunnable$1");
                }
            };
            if (((Number) C286370BKh.LIZ.getValue()).intValue() >= 1) {
                C0S78.LIZLLL(true, new AwS548S0100000_4((C0DMQ) r4, 137));
            } else if (((Boolean) C285090BFj.LJIL.getValue()).booleanValue()) {
                C0CN5.LIZIZ(15000L, new ARunnableS104S0100000_4((Object) r4, 23));
            } else {
                r4.run();
            }
            C0S78.LIZJ(new C1591590rWH(this, c1592450rXf), true);
        }
    }

    @Override // X.InterfaceC592390NLh
    public final void Qm(String str) {
        this.LLILLJJLI.LJIJI(str);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final String U31(boolean z) {
        Object obj;
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentTabTag:  ");
        C1591980rWu c1591980rWu = this.LLJJ;
        if (c1591980rWu != null) {
            obj = c1591980rWu.LJ;
        } else {
            obj = null;
        }
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        C1591980rWu c1591980rWu2 = this.LLJJ;
        if (c1591980rWu2 == null || (strLIZIZ = c1591980rWu2.LIZIZ()) == null) {
            IHomePageExService iHomePageExService = (IHomePageExService) PluggableExtentionKt.pluggableSpi$default(IHomePageExService.class, false, false, false, 14, null);
            if (iHomePageExService != null) {
                return iHomePageExService.LJ();
            }
            return "For You";
        }
        return strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void db1(boolean z) {
        C1592450rXf c1592450rXf = this.LLILLJJLI;
        if (c1592450rXf.isAttachedToWindow()) {
            if (z) {
                c1592450rXf.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1620710sHF(c1592450rXf, 4));
            } else {
                HandlerHook.viewPost(c1592450rXf, new ARunnableS124S0100000_24(c1592450rXf, 116));
            }
        }
    }

    @C14EU
    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        int i;
        if (c1372310lob.LIZIZ == 1) {
            C1592450rXf c1592450rXf = this.LLILLJJLI;
            boolean z = c1372310lob.LIZ;
            C1592470rXh c1592470rXh = c1592450rXf.LLILLL;
            c1592470rXh.getClass();
            int i2 = 255;
            if (!z) {
                i = 255;
                i2 = 0;
            } else {
                i = 0;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS272S0100000_24(c1592470rXh, 4));
            valueAnimatorOfInt.start();
        }
    }

    @C14EU
    public final void onFeedRefreshEvent(C1564680qos c1564680qos) {
        XTabPanelController xTabPanelController = this.LLJILJIL;
        if (xTabPanelController != null) {
            xTabPanelController.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void onPageScrollStateChanged(int i) {
        Integer numLJIL;
        C1591470rW5 c1591470rW5 = this.LLJJJJJIL;
        if (c1591470rW5 != null) {
            c1591470rW5.LJII = i;
            int iIntValue = -1;
            if (i != 0) {
                if (i == 1) {
                    HomeViewPagerAbility homeViewPagerAbility = c1591470rW5.LIZLLL;
                    if (homeViewPagerAbility != null && (numLJIL = homeViewPagerAbility.LJIL()) != null) {
                        iIntValue = numLJIL.intValue();
                    }
                    c1591470rW5.LJ = iIntValue;
                    c1591470rW5.LJIIIIZZ = c1591470rW5.LIZJ.Ct0();
                    c1591470rW5.LJFF = 0;
                    c1591470rW5.LJIIIZ = false;
                    c1591470rW5.LJIIJ = false;
                }
            } else {
                c1591470rW5.LJ = -1;
                c1591470rW5.LJFF = 0;
                c1591470rW5.LJIIIIZZ = null;
                c1591470rW5.LJIIIZ = false;
                c1591470rW5.LJIIJ = false;
            }
        }
        this.LLILZ.onPageScrollStateChanged(i);
        XTabPanelController xTabPanelController = this.LLJILJIL;
        if (xTabPanelController != null) {
            xTabPanelController.LIZ();
        }
        if (i == 0) {
            ARunnableS5S1300000_4 aRunnableS5S1300000_4 = C324480Cnm.LJ;
            if (aRunnableS5S1300000_4 != null) {
                aRunnableS5S1300000_4.run();
            }
            C324480Cnm.LJ = null;
        }
        C324480Cnm.LJFF = i;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void onPageSelected(int i) {
        String strLIZIZ;
        String string;
        List<TopTabProtocol> topTabProtocolList;
        InterfaceC1583870rJp interfaceC1583870rJpQG0;
        String str;
        InterfaceC1583870rJp interfaceC1583870rJpQG02;
        Object obj;
        C1591980rWu c1591980rWuLJIILIIL = this.LLILLJJLI.LJIILIIL(i);
        Object obj2 = null;
        if (c1591980rWuLJIILIIL != null) {
            strLIZIZ = c1591980rWuLJIILIIL.LIZIZ();
        } else {
            strLIZIZ = null;
        }
        this.LLJJ = c1591980rWuLJIILIIL;
        if (c1591980rWuLJIILIIL != null && (obj = c1591980rWuLJIILIIL.LJ) != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        C324480Cnm.LIZ(string, this.LLILLJJLI, this.LLILLL, LJII(), false, false);
        int i2 = this.LLJ;
        if (i2 != -1 && i2 != i) {
            C1591980rWu c1591980rWuLJIILIIL2 = this.LLILLJJLI.LJIILIIL(i2);
            if (c1591980rWuLJIILIIL2 != null) {
                obj2 = c1591980rWuLJIILIIL2.LJ;
            }
            if ((obj2 instanceof String) && (str = (String) obj2) != null && (interfaceC1583870rJpQG02 = LIZLLL().QG0(str)) != null) {
                interfaceC1583870rJpQG02.LJ(strLIZIZ);
            }
        }
        this.LLILZ.onPageSelected(i);
        if (strLIZIZ != null && (interfaceC1583870rJpQG0 = LIZLLL().QG0(strLIZIZ)) != null) {
            interfaceC1583870rJpQG0.LJIIIIZZ(this.LLJJIII, this.LLJJI);
        }
        C1591450rW3 c1591450rW3 = this.LLJILJILJ;
        if (c1591450rW3 != null && (c1591450rW3.LIZ instanceof C19EG) && (topTabProtocolList = c1591450rW3.LIZIZ.getTopTabProtocolList()) != null && i < topTabProtocolList.size() && i >= 0) {
            ((TopTabProtocol) ListProtector.get(topTabProtocolList, i)).getTag();
        }
        if (!LLJZ) {
            if (C296130Bj9.LIZ()) {
                HandlerHook.viewPostDelay(this.LLILLJJLI, new Runnable() { // from class: X.0rWC
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MainTabStrip@28b8.onPageSelected$3");
                        try {
                            MainTabStrip mainTabStrip = this.LL;
                            mainTabStrip.LJIIJ(mainTabStrip.LLILLJJLI);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MainTabStrip@28b8.onPageSelected$3");
                    }
                }, 600L);
            } else {
                HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS124S0100000_24(this, 33));
            }
        }
        C0S4J c0s4j = LLJZIJLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected, lastPos:");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", curPos:");
        sbLIZ.append(i);
        sbLIZ.append(", curtag:");
        sbLIZ.append(strLIZIZ);
        c0s4j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJ = i;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void Lc(int i, int i2) {
        String strLIZIZ;
        String value;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        C1591980rWu c1591980rWuLJIILIIL = this.LLILLJJLI.LJIILIIL(i);
        if (c1591980rWuLJIILIIL != null) {
            strLIZIZ = c1591980rWuLJIILIIL.LIZIZ();
        } else {
            strLIZIZ = null;
        }
        String str = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String str2 = LLLF.get(strLIZIZ);
        C1591440rW2 c1591440rW2 = LLJLLIL;
        String strLJI = LJI();
        c1591440rW2.getClass();
        String strLIZLLL = C1591440rW2.LIZLLL(strLJI);
        switch (i2) {
            case 1:
                value = "click_top_icon";
                break;
            case 2:
                strLIZLLL = C1591440rW2.LIZLLL(LJI());
                value = "slide";
                break;
            case 3:
                value = "goback_icon";
                break;
            case 4:
                value = "click_return_icon";
                break;
            case 5:
                value = "click_similar_post_icon";
                break;
            case 6:
                value = EnumC1589910rTZ.CLICK_TOP_BACK_ICON.getValue();
                break;
            default:
                value = "click_follow_tab";
                break;
        }
        if (i2 == 5) {
            strLIZLLL = "explore_preview";
        }
        this.LLJJI = value;
        this.LLJJIII = strLIZLLL;
        if ((Intrinsics.LJFF(strLIZLLL, "homepage_hot") && Intrinsics.LJFF(str2, "enter_homepage_hot")) || Intrinsics.LJFF(str2, "enter_homepage_friends")) {
            return;
        }
        if (Intrinsics.LJFF(str2, "enter_homepage_explore")) {
            C1EE2.LIZIZ.LJIILJJIL();
        }
        if (Intrinsics.LJFF(str2, "enter_homepage_explore") && i2 != 1 && i2 != 2 && i2 != 5) {
            return;
        }
        if (Intrinsics.LJFF(str2, "enter_homepage_nearby") && i2 == 3) {
            return;
        }
        if (Intrinsics.LJFF(strLIZIZ, "Drama")) {
            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
                if (strLIZLLL != null) {
                    str = strLIZLLL;
                }
                interfaceC1577520r9aLIZIZ.LJ(str, value, null);
                return;
            }
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1589130rSJ(str2, value, strLIZLLL, this, ((C0J9A) this.LLJJJIL.getValue()).LJJIIZI(), i2, strLIZIZ, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void Xr0(C1589670rTB c1589670rTB, boolean z) {
        this.LLILZIL = c1589670rTB;
        this.LLILZLL = c1589670rTB;
        this.LLIZ = z;
        C1582020rGq.LIZJ("scene_top_tab_attach");
        LIZ(false);
        C1582020rGq.LIZ("scene_top_tab_attach");
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void bv(boolean z, boolean z2) {
        C1591700rWS c1591700rWS = this.LLJIJIL;
        if (c1591700rWS != null) {
            c1591700rWS.LIZJ(z, z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void jD1(int i, int i2) {
        C1591460rW4.LIZ.getClass();
        C1591460rW4.LJI = i;
        C1591460rW4.LJII = i2;
        C705890RmV c705890RmV = this.LLILLL;
        if (c705890RmV != null) {
            ViewGroup.LayoutParams layoutParams = c705890RmV.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i2);
                C786410Ut5.W5(c705890RmV, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C1591440rW2 c1591440rW2 = LLJLLIL;
        LIZLLL();
        C19EG c19eg = this.LLJI;
        c1591440rW2.getClass();
        this.LLILLJJLI.setTextSize(C1591440rW2.LIZIZ(c19eg));
        this.LLILLJJLI.LJ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final String uf(int i, boolean z) {
        String strLIZIZ;
        C1591980rWu c1591980rWuLJIILIIL = this.LLILLJJLI.LJIILIIL(i);
        if (c1591980rWuLJIILIIL == null || (strLIZIZ = c1591980rWuLJIILIIL.LIZIZ()) == null) {
            return "";
        }
        return strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void onPageScrolled(int i, float f, int i2) {
        int i3;
        int i4;
        float f2;
        InterfaceC1589850rTT interfaceC1589850rTTLIZ;
        boolean z;
        C1591470rW5 c1591470rW5 = this.LLJJJJJIL;
        if (c1591470rW5 != null && c1591470rW5.LJII != 0 && (i3 = c1591470rW5.LJ) != -1) {
            int i5 = c1591470rW5.LJFF;
            boolean z2 = false;
            if (i5 == 0 && i2 > 0) {
                if (i != i3) {
                    z = true;
                } else {
                    z = false;
                }
                c1591470rW5.LJI = z;
            } else if (i2 < i5) {
                c1591470rW5.LJI = true;
            } else if (i2 > i5) {
                c1591470rW5.LJI = false;
            }
            if (c1591470rW5.LJI) {
                i4 = i;
            } else {
                i4 = i + 1;
            }
            c1591470rW5.LJFF = i2;
            String strUf = c1591470rW5.LIZIZ.uf(i4, false);
            if (!Intrinsics.LJFF(strUf, c1591470rW5.LJIIIIZZ)) {
                if (!c1591470rW5.LJIIIZ) {
                    InterfaceC1589850rTT interfaceC1589850rTTLIZ2 = c1591470rW5.LIZ(strUf);
                    if (interfaceC1589850rTTLIZ2 != null) {
                        interfaceC1589850rTTLIZ2.LIZIZ(new C1589790rTN(strUf));
                        c1591470rW5.LJIIIZ = true;
                        f2 = c1591470rW5.LIZ.pageScrollThreshold;
                        if (f2 > 0.0f) {
                            z2 = true;
                        }
                        if (!c1591470rW5.LJIIJ) {
                            interfaceC1589850rTTLIZ.LJFF(new C1589790rTN(strUf));
                            c1591470rW5.LJIIJ = true;
                        }
                    }
                } else {
                    f2 = c1591470rW5.LIZ.pageScrollThreshold;
                    if (f2 > 0.0f && (i4 <= i ? f <= 1 - f2 : f >= f2)) {
                        z2 = true;
                    }
                    if (!c1591470rW5.LJIIJ && z2 && (interfaceC1589850rTTLIZ = c1591470rW5.LIZ(strUf)) != null) {
                        interfaceC1589850rTTLIZ.LJFF(new C1589790rTN(strUf));
                        c1591470rW5.LJIIJ = true;
                    }
                }
            }
        }
        this.LLILZ.onPageScrolled(i, f, i2);
        C1591700rWS c1591700rWS = this.LLJIJIL;
        if (c1591700rWS != null) {
            c1591700rWS.LJIILJJIL = i;
            c1591700rWS.LJIILL = f;
        }
    }
}
