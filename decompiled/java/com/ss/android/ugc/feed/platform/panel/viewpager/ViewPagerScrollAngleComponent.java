package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.AbstractC1616100s9o;
import X.C01GW;
import X.C09R3;
import X.C0B8L;
import X.C0QSJ;
import X.C0S7E;
import X.C0SAE;
import X.C1389300mG0;
import X.C13LE;
import X.C1561740qk8;
import X.C1561750qk9;
import X.C1561760qkA;
import X.C1565580qqK;
import X.C1565590qqL;
import X.C1566140qrE;
import X.C1570360qy2;
import X.C1570370qy3;
import X.C1570380qy4;
import X.C1570400qy6;
import X.C1570410qy7;
import X.C1570420qy8;
import X.C1570430qy9;
import X.C1570440qyA;
import X.C1570450qyB;
import X.C2217381BqS;
import X.C283770BAh;
import X.C295890Bil;
import X.C299750Boz;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1585190rLx;
import X.InterfaceC1616070s9l;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerScrollAngleComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ViewPagerScrollAngleComponent extends BasePanelUIComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C01GW LLJIJIL;
    public final C630740Ooa LLJILJIL;
    public C1561760qkA LLJILJILJ;
    public C1570370qy3 LLJILLL;
    public C1570360qy2 LLJJ;
    public C1565580qqK LLJJI;
    public C1565590qqL LLJJIII;
    public VerticalViewPager LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public volatile HomeTabAbility LLJJJIL;
    public volatile MainBusinessAbility LLJJJJ;
    public volatile HomeViewPagerAbility LLJJJJJIL;
    public volatile HomePageViewPagerAbility LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ViewPagerScrollAngleComponent.class, "homeTabAbility", "getHomeTabAbility()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ViewPagerScrollAngleComponent.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(ViewPagerScrollAngleComponent.class, "homeViewPagerAbility", "getHomeViewPagerAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(ViewPagerScrollAngleComponent.class, "homepageViewPagerAbility", "getHomepageViewPagerAbility()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final C0QSJ Go() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJLIIIJLLLLLLLZ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJJLIIIJLLLLLLLZ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final HomeTabAbility Jo() {
        HomeTabAbility homeTabAbility = this.LLJJJIL;
        if (homeTabAbility == null) {
            synchronized (this) {
                homeTabAbility = this.LLJJJIL;
                if (homeTabAbility == null) {
                    C0QSJ c0qsjGo = Go();
                    HomeTabAbility homeTabAbility2 = c0qsjGo != null ? (HomeTabAbility) c0qsjGo.getAbility(HomeTabAbility.class) : null;
                    this.LLJJJIL = homeTabAbility2;
                    return homeTabAbility2;
                }
            }
        }
        return homeTabAbility;
    }

    public final HomeViewPagerAbility Lo() {
        HomeViewPagerAbility homeViewPagerAbility = this.LLJJJJJIL;
        if (homeViewPagerAbility == null) {
            synchronized (this) {
                homeViewPagerAbility = this.LLJJJJJIL;
                if (homeViewPagerAbility == null) {
                    C0QSJ c0qsjGo = Go();
                    HomeViewPagerAbility homeViewPagerAbility2 = c0qsjGo != null ? (HomeViewPagerAbility) c0qsjGo.getAbility(HomeViewPagerAbility.class) : null;
                    this.LLJJJJJIL = homeViewPagerAbility2;
                    return homeViewPagerAbility2;
                }
            }
        }
        return homeViewPagerAbility;
    }

    public final IViewPagerComponentAbility Mb() {
        return (IViewPagerComponentAbility) this.LLJILJIL.getValue();
    }

    public final HomePageViewPagerAbility No() {
        HomePageViewPagerAbility homePageViewPagerAbility = this.LLJJJJLIIL;
        if (homePageViewPagerAbility == null) {
            synchronized (this) {
                homePageViewPagerAbility = this.LLJJJJLIIL;
                if (homePageViewPagerAbility == null) {
                    C0QSJ c0qsjGo = Go();
                    HomePageViewPagerAbility homePageViewPagerAbility2 = c0qsjGo != null ? (HomePageViewPagerAbility) c0qsjGo.getAbility(HomePageViewPagerAbility.class) : null;
                    this.LLJJJJLIIL = homePageViewPagerAbility2;
                    return homePageViewPagerAbility2;
                }
            }
        }
        return homePageViewPagerAbility;
    }

    public final MainBusinessAbility Oo() {
        MainBusinessAbility mainBusinessAbility = this.LLJJJJ;
        if (mainBusinessAbility == null) {
            synchronized (this) {
                mainBusinessAbility = this.LLJJJJ;
                if (mainBusinessAbility == null) {
                    C0QSJ c0qsjGo = Go();
                    MainBusinessAbility mainBusinessAbility2 = c0qsjGo != null ? (MainBusinessAbility) c0qsjGo.getAbility(MainBusinessAbility.class) : null;
                    this.LLJJJJ = mainBusinessAbility2;
                    return mainBusinessAbility2;
                }
            }
        }
        return mainBusinessAbility;
    }

    public final void Vo() {
        VerticalViewPager verticalViewPager = this.LLJJIJI;
        if (verticalViewPager != null) {
            verticalViewPager.setSlideAngle(30);
        }
        if (C1570380qy4.LIZ().enable) {
            HomePageViewPagerAbility homePageViewPagerAbilityNo = No();
            if (homePageViewPagerAbilityNo != null) {
                homePageViewPagerAbilityNo.ju(-1);
            }
            HomeViewPagerAbility homeViewPagerAbilityLo = Lo();
            if (homeViewPagerAbilityLo != null) {
                homeViewPagerAbilityLo.ju(-1);
            }
        }
    }

    public ViewPagerScrollAngleComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1576), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1561740qk8(false, this));
        }
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJILJIL = C628500Oky.LIZ(new C1561750qk9(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C1570420qy8(this));
        this.LLJJIJIL = C452501pT.LIZIZ(new C1570400qy6(this));
        this.LLJJJ = C452501pT.LIZIZ(new C1570410qy7(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        HomeTabAbility homeTabAbilityJo;
        HomeViewPagerAbility homeViewPagerAbilityLo;
        HomePageViewPagerAbility homePageViewPagerAbilityNo;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2;
        super.onDestroy();
        C1561760qkA c1561760qkA = this.LLJILJILJ;
        if (c1561760qkA != null && (iViewPagerComponentAbilityMb2 = Mb()) != null) {
            iViewPagerComponentAbilityMb2.Xl0(c1561760qkA);
        }
        C1570370qy3 c1570370qy3 = this.LLJILLL;
        if (c1570370qy3 != null && (iViewPagerComponentAbilityMb = Mb()) != null) {
            iViewPagerComponentAbilityMb.dz2(c1570370qy3);
        }
        C1570360qy2 c1570360qy2 = this.LLJJ;
        if (c1570360qy2 != null && (homePageViewPagerAbilityNo = No()) != null) {
            homePageViewPagerAbilityNo.yT(c1570360qy2);
        }
        C1565580qqK c1565580qqK = this.LLJJI;
        if (c1565580qqK != null && (homeViewPagerAbilityLo = Lo()) != null) {
            homeViewPagerAbilityLo.b3(c1565580qqK);
        }
        C1565590qqL c1565590qqL = this.LLJJIII;
        if (c1565590qqL != null && (homeTabAbilityJo = Jo()) != null) {
            homeTabAbilityJo.Ik0(c1565590qqL);
        }
        VerticalViewPager verticalViewPager = this.LLJJIJI;
        if (verticalViewPager != null) {
            verticalViewPager.LLJIJIL.LIZLLL((C1570430qy9) this.LLJJIJIIJIL.getValue());
        }
        HomePageViewPagerAbility homePageViewPagerAbilityNo2 = No();
        if (homePageViewPagerAbilityNo2 != null) {
            homePageViewPagerAbilityNo2.A6((C1570440qyA) this.LLJJIJIL.getValue());
        }
        HomeViewPagerAbility homeViewPagerAbilityLo2 = Lo();
        if (homeViewPagerAbilityLo2 != null) {
            homeViewPagerAbilityLo2.A6((C1570450qyB) this.LLJJJ.getValue());
        }
    }

    public final void Ho(boolean z) {
        Aweme awemeLJIIIIZZ;
        Aweme awemeLJIIIIZZ2;
        boolean z2;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C0SAE c0saeLJLIIIL;
        HomeViewPagerAbility homeViewPagerAbilityLo;
        HomeViewPagerAbility homeViewPagerAbilityLo2;
        HomePageViewPagerAbility homePageViewPagerAbilityNo;
        MainBusinessAbility mainBusinessAbilityOo;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        Integer numValueOf = null;
        String aid = null;
        numValueOf = null;
        if (iViewPagerComponentAbilityMb != null) {
            awemeLJIIIIZZ = iViewPagerComponentAbilityMb.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        if (C295890Bil.LIZIZ() && (mainBusinessAbilityOo = Oo()) != null) {
            awemeLJIIIIZZ2 = mainBusinessAbilityOo.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ2 = null;
        }
        int iLIZ = 0;
        if (awemeLJIIIIZZ != null && awemeLJIIIIZZ.getAwemeType() == 101) {
            z2 = true;
        } else {
            z2 = false;
        }
        VerticalViewPager verticalViewPager = this.LLJJIJI;
        if (verticalViewPager != null) {
            verticalViewPager.setSlideDownAngle(-1);
        }
        if (z2) {
            Vo();
            VerticalViewPager verticalViewPager2 = this.LLJJIJI;
            if (verticalViewPager2 != null) {
                verticalViewPager2.setSlideAngle(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).n6(awemeLJIIIIZZ));
            }
            VerticalViewPager verticalViewPager3 = this.LLJJIJI;
            if (verticalViewPager3 != null) {
                verticalViewPager3.setSlideDownAngle(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).L5(awemeLJIIIIZZ));
            }
            if (z) {
                int iB3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B3(awemeLJIIIIZZ);
                int iH3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).H3(awemeLJIIIIZZ);
                if (iB3 > 0 && (homePageViewPagerAbilityNo = No()) != null) {
                    homePageViewPagerAbilityNo.ju(iB3);
                }
                if (iH3 > 0 && (homeViewPagerAbilityLo2 = Lo()) != null) {
                    homeViewPagerAbilityLo2.ju(iH3);
                    return;
                }
                return;
            }
            return;
        }
        if (awemeLJIIIIZZ2 != null && AwemeExtKt.isPhotoMode(awemeLJIIIIZZ2) && C295890Bil.LIZIZ() && (photoModeImageInfo = awemeLJIIIIZZ2.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() > 1 && !AwemeExtKt.isAdTraffic(awemeLJIIIIZZ2)) {
            Vo();
            if (C1570380qy4.LIZ().enable && z && C1389300mG0.LJIL(getPanelContext()) && (homeViewPagerAbilityLo = Lo()) != null) {
                homeViewPagerAbilityLo.ju(C1570380qy4.LIZ().rightAngle);
            }
            IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
            if (iPostModeService != null && (c0saeLJLIIIL = iPostModeService.LJLIIIL()) != null) {
                if (awemeLJIIIIZZ2 != null) {
                    aid = awemeLJIIIIZZ2.getAid();
                }
                numValueOf = Integer.valueOf(c0saeLJLIIIL.LIZJ(aid));
            }
            if (awemeLJIIIIZZ2 != null) {
                iLIZ = C0S7E.LIZ(awemeLJIIIIZZ2);
            }
            int i = iLIZ - 1;
            if (numValueOf != null && numValueOf.intValue() == i) {
                HomePageViewPagerAbility homePageViewPagerAbilityNo2 = No();
                if (homePageViewPagerAbilityNo2 != null) {
                    homePageViewPagerAbilityNo2.ju(C295890Bil.LIZ());
                }
            } else {
                HomePageViewPagerAbility homePageViewPagerAbilityNo3 = No();
                if (homePageViewPagerAbilityNo3 != null) {
                    homePageViewPagerAbilityNo3.ju(C1570380qy4.LIZ().leftAngle);
                }
            }
            VerticalViewPager verticalViewPager4 = this.LLJJIJI;
            if (verticalViewPager4 == null) {
                return;
            }
            verticalViewPager4.setSlideAngle(C295890Bil.LIZ());
            return;
        }
        if (C1570380qy4.LIZ().enable && z) {
            if (!C1570380qy4.LIZ().enable || !C1389300mG0.LJIL(getPanelContext())) {
                return;
            }
            HomePageViewPagerAbility homePageViewPagerAbilityNo4 = No();
            if (homePageViewPagerAbilityNo4 != null) {
                homePageViewPagerAbilityNo4.ju(C1570380qy4.LIZ().leftAngle);
            }
            HomeViewPagerAbility homeViewPagerAbilityLo3 = Lo();
            if (homeViewPagerAbilityLo3 != null) {
                homeViewPagerAbilityLo3.ju(C1570380qy4.LIZ().rightAngle);
            }
            VerticalViewPager verticalViewPager5 = this.LLJJIJI;
            if (verticalViewPager5 == null) {
                return;
            }
            verticalViewPager5.setSlideAngle(C1570380qy4.LIZ().verticalAngle);
            return;
        }
        Vo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0qqL] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0qqK] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0qkA] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0qy3, X.0s9o] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.0Ias, X.0qy2] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        HomeTabAbility homeTabAbilityJo;
        HomeViewPagerAbility homeViewPagerAbilityLo;
        super.onViewCreated(view);
        VerticalViewPager verticalViewPager = (VerticalViewPager) view.findViewById(R.id.viewpager);
        this.LLJJIJI = verticalViewPager;
        if (verticalViewPager != null) {
            verticalViewPager.setSlideAngle(30);
        }
        if (C1389300mG0.LJIL(getPanelContext())) {
            VerticalViewPager verticalViewPager2 = this.LLJJIJI;
            if (verticalViewPager2 != null) {
                verticalViewPager2.LLJIJIL.LIZIZ = true;
            }
            HomePageViewPagerAbility homePageViewPagerAbilityNo = No();
            if (homePageViewPagerAbilityNo != null) {
                homePageViewPagerAbilityNo.sm();
            }
            HomeViewPagerAbility homeViewPagerAbilityLo2 = Lo();
            if (homeViewPagerAbilityLo2 != null) {
                homeViewPagerAbilityLo2.sm();
            }
            VerticalViewPager verticalViewPager3 = this.LLJJIJI;
            if (verticalViewPager3 != null) {
                verticalViewPager3.LLJIJIL.LIZIZ((C1570430qy9) this.LLJJIJIIJIL.getValue());
            }
            HomePageViewPagerAbility homePageViewPagerAbilityNo2 = No();
            if (homePageViewPagerAbilityNo2 != null) {
                homePageViewPagerAbilityNo2.l8((C1570440qyA) this.LLJJIJIL.getValue());
            }
            HomeViewPagerAbility homeViewPagerAbilityLo3 = Lo();
            if (homeViewPagerAbilityLo3 != null) {
                homeViewPagerAbilityLo3.l8((C1570450qyB) this.LLJJJ.getValue());
            }
        }
        VerticalViewPager verticalViewPager4 = this.LLJJIJI;
        if (verticalViewPager4 != null) {
            verticalViewPager4.setEnableTouchSlopMultiple(((Boolean) C0B8L.LIZIZ.getValue()).booleanValue());
        }
        HomePageViewPagerAbility homePageViewPagerAbilityNo3 = No();
        if (homePageViewPagerAbilityNo3 != null) {
            homePageViewPagerAbilityNo3.F9(((Boolean) C0B8L.LIZIZ.getValue()).booleanValue());
        }
        HomeViewPagerAbility homeViewPagerAbilityLo4 = Lo();
        if (homeViewPagerAbilityLo4 != null) {
            homeViewPagerAbilityLo4.F9(((Boolean) C0B8L.LIZIZ.getValue()).booleanValue());
        }
        this.LLJILJILJ = new InterfaceC1616070s9l() { // from class: X.0qkA
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

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                ViewPagerScrollAngleComponent viewPagerScrollAngleComponent = this.LL;
                viewPagerScrollAngleComponent.Ho(C1389300mG0.LJIL(viewPagerScrollAngleComponent.getPanelContext()));
            }
        };
        if (C1570380qy4.LIZ().enable && C1389300mG0.LJIL(getPanelContext())) {
            this.LLJJIII = new InterfaceC1585190rLx() { // from class: X.0qqL
                @Override // X.InterfaceC1585190rLx
                public final void p1(String str, String str2) {
                    HomeViewPagerAbility homeViewPagerAbilityLo5;
                    if (str == null) {
                        return;
                    }
                    ViewPagerScrollAngleComponent viewPagerScrollAngleComponent = this.LL;
                    boolean z = false;
                    if (Intrinsics.LJFF(str2, "HOME") && (homeViewPagerAbilityLo5 = this.LL.Lo()) != null && homeViewPagerAbilityLo5.gk1() == 0) {
                        z = true;
                    }
                    viewPagerScrollAngleComponent.Ho(z);
                }
            };
            ?? r1 = new InterfaceC469360Ias() { // from class: X.0qy2
                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    String strSr2;
                    HomeViewPagerAbility homeViewPagerAbilityLo5;
                    ViewPagerScrollAngleComponent viewPagerScrollAngleComponent = this.LL;
                    HomePageViewPagerAbility homePageViewPagerAbilityNo4 = viewPagerScrollAngleComponent.No();
                    if (homePageViewPagerAbilityNo4 != null) {
                        strSr2 = homePageViewPagerAbilityNo4.sr2(i);
                    } else {
                        strSr2 = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(strSr2, "page_feed");
                    boolean z = false;
                    if (zLJFF && (homeViewPagerAbilityLo5 = this.LL.Lo()) != null && homeViewPagerAbilityLo5.gk1() == 0) {
                        z = true;
                    }
                    viewPagerScrollAngleComponent.Ho(z);
                }
            };
            this.LLJJ = r1;
            this.LLJJI = new InterfaceC469360Ias() { // from class: X.0qqK
                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    ViewPagerScrollAngleComponent viewPagerScrollAngleComponent = this.LL;
                    HomeViewPagerAbility homeViewPagerAbilityLo5 = viewPagerScrollAngleComponent.Lo();
                    boolean z = false;
                    if (homeViewPagerAbilityLo5 != null && homeViewPagerAbilityLo5.Vd(i, false) == 0) {
                        z = true;
                    }
                    viewPagerScrollAngleComponent.Ho(z);
                }
            };
            HomePageViewPagerAbility homePageViewPagerAbilityNo4 = No();
            if (homePageViewPagerAbilityNo4 != 0) {
                homePageViewPagerAbilityNo4.Jk1(r1);
            }
            C1565580qqK c1565580qqK = this.LLJJI;
            if (c1565580qqK != null && (homeViewPagerAbilityLo = Lo()) != null) {
                homeViewPagerAbilityLo.LLJJI(c1565580qqK);
            }
            C1565590qqL c1565590qqL = this.LLJJIII;
            if (c1565590qqL != null && (homeTabAbilityJo = Jo()) != null) {
                homeTabAbilityJo.UC1(c1565590qqL);
            }
        }
        if (((Number) C283770BAh.LIZ.getValue()).intValue() > 0) {
            ?? r12 = new AbstractC1616100s9o() { // from class: X.0qy3
                @Override // X.AbstractC1616100s9o
                public final void LIZJ(C1604000rqI c1604000rqI) {
                    ViewPagerScrollAngleComponent viewPagerScrollAngleComponent = this.LL;
                    viewPagerScrollAngleComponent.Ho(C1389300mG0.LJIL(viewPagerScrollAngleComponent.getPanelContext()));
                }
            };
            IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
            if (iViewPagerComponentAbilityMb != 0) {
                iViewPagerComponentAbilityMb.CS0(r12);
            }
            this.LLJILLL = r12;
        } else {
            IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = Mb();
            if (iViewPagerComponentAbilityMb2 != null) {
                iViewPagerComponentAbilityMb2.Bv0(this.LLJILJILJ);
            }
        }
        Ho(C1389300mG0.LJIL(getPanelContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void So(org.json.JSONObject r7, float r8, float r9, float r10) throws org.json.JSONException {
        /*
            r6 = this;
            android.content.Context r5 = r6.getContext()
            if (r5 == 0) goto L57
            int r0 = X.C497820Jfg.LIZIZ(r5)
            int r0 = r0 / 3
            float r0 = (float) r0
            float r0 = r8 / r0
            int r0 = (int) r0
            r2 = 1
            int r4 = r0 + 1
            int r0 = X.C497820Jfg.LIZ(r5)
            int r0 = r0 / 4
            float r0 = (float) r0
            float r9 = r9 / r0
            int r0 = (int) r9
            int r3 = r0 + 1
            int r1 = X.C497820Jfg.LIZIZ(r5)
            r0 = 2
            int r1 = r1 / r0
            float r1 = (float) r1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2d
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L35
        L2d:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L58
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L36
        L35:
            r2 = 0
        L36:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r4)
            r0.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r0)
            java.lang.String r0 = "operation_scope"
            r7.put(r0, r1)
            java.lang.String r1 = "rtl"
            boolean r0 = X.C426750GoL.LIZLLL(r5)
            r7.put(r1, r0)
            java.lang.String r0 = "operation_side"
            r7.put(r0, r2)
        L57:
            return
        L58:
            r2 = 2
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerScrollAngleComponent.So(org.json.JSONObject, float, float, float):void");
    }
}
