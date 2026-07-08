package com.ss.android.ugc.aweme.commercialize.feed.slide;

import X.C01GW;
import X.C0QSJ;
import X.C0S4U;
import X.C0T2Y;
import X.C1009490cNP;
import X.C1017070cZd;
import X.C1017530caN;
import X.C1022330ci7;
import X.C1022360ciA;
import X.C1022820ciu;
import X.C1045340dJE;
import X.C1256610inz;
import X.C13LE;
import X.C1558520qew;
import X.C1591390rVx;
import X.C21600219g8;
import X.C2184171Adz;
import X.C2217381BqS;
import X.C296200BjG;
import X.C452501pT;
import X.C687700QyG;
import X.InterfaceC1008930cMV;
import X.InterfaceC1022370ciB;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC739890T0p;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.ad.feed.photomode.IAdSlidePreloadImpl;
import com.ss.android.ugc.aweme.ad.feed.slide.SlideAdWebPreloadAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.LeftSlideConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class SlideAdWebPreloadAssem extends BaseMainContainerUIAssem implements InterfaceC469360Ias, SlideAdWebPreloadAbility, InterfaceC739890T0p, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public float LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public Aweme LLJJIII;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public C21600219g8 LLJJJJ;
    public final Map<InterfaceC1022370ciB, Integer> LLJJJJJIL = new LinkedHashMap();
    public final C1022330ci7 LLJJJJLIIL = new C0T2Y() { // from class: X.0ci7
        @Override // X.C0T2Y
        public final void Y3(Aweme aweme) {
            Activity activityLIZ;
            boolean z;
            AwemeRawAd awemeRawAd;
            LeftSlideConfig leftSlideConfig;
            Float distanceThreshold;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            C19EG c19eg;
            HomePageDataViewModel homePageDataViewModelLIZIZ;
            Activity activityLIZIZ;
            Aweme aweme5;
            ((LinkedHashMap) this.LL.LLJJJJJIL).clear();
            this.LL.LLJJIII = aweme;
            ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Zu();
            Aweme aweme6 = this.LL.LLJJIII;
            String eventType = null;
            if (aweme6 != null && !C1017070cZd.LJIIJ(aweme6) && !C1017070cZd.LJJLL(this.LL.LLJJIII) && (!C1017070cZd.LLJJIJI(this.LL.LLJJIII, null, null, true) || !C1017070cZd.LLJLLL(this.LL.LLJJIII))) {
                ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).bv(this.LL.LLJJIII, null, null, true);
            }
            final SlideAdWebPreloadAssem slideAdWebPreloadAssem = this.LL;
            if (C1017530caN.LIZ(slideAdWebPreloadAssem.getContext(), slideAdWebPreloadAssem.LLJJIII) && (aweme5 = slideAdWebPreloadAssem.LLJJIII) != null && AwemeExtKt.isAdTraffic(aweme5)) {
                slideAdWebPreloadAssem.LLJJIJI = System.currentTimeMillis();
                ((LinkedHashMap) C1017530caN.LIZIZ).clear();
                ((LinkedHashMap) C1017530caN.LIZJ).clear();
                final IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
                InterfaceC1022370ciB interfaceC1022370ciB = new InterfaceC1022370ciB() { // from class: X.0ci8
                    @Override // X.InterfaceC1022370ciB
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1022370ciB
                    public final void LIZIZ(float f, String str) {
                    }

                    @Override // X.InterfaceC1022370ciB
                    public final void LIZJ(String str, String str2) {
                    }

                    @Override // X.InterfaceC1022370ciB
                    public final void LJJJJJ(float f) {
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SlideAdWebPreloadAssem.LLJLILLLLZIIL;
                        if (iAdSceneService != null) {
                            C1017530caN.LIZ.getClass();
                            if (C1017530caN.LJFF) {
                                iAdSceneService.LIZIZ();
                                SlideAdWebPreloadAssem slideAdWebPreloadAssem2 = slideAdWebPreloadAssem;
                                if (C1022290ci3.LJIIL(slideAdWebPreloadAssem2.LLJJIII, C724240Sb0.LIZ(slideAdWebPreloadAssem2), f)) {
                                    C1017530caN.LJFF = false;
                                }
                            }
                        }
                    }
                };
                slideAdWebPreloadAssem.getClass();
                slideAdWebPreloadAssem.I72(interfaceC1022370ciB);
            }
            SlideAdWebPreloadAssem slideAdWebPreloadAssem2 = this.LL;
            slideAdWebPreloadAssem2.getClass();
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(c19eg)) != null) {
                eventType = homePageDataViewModelLIZIZ.getEventType();
            }
            C1026350cob.LJ(eventType);
            Aweme aweme7 = slideAdWebPreloadAssem2.LLJJIII;
            if (aweme7 != null && AwemeExtKt.isAdTraffic(aweme7)) {
                z = true;
            } else {
                z = false;
            }
            if (z && ((((aweme2 = slideAdWebPreloadAssem2.LLJJIII) != null && C1017070cZd.LL(aweme2) && (aweme4 = slideAdWebPreloadAssem2.LLJJIII) != null && !C1017070cZd.LJIIJ(aweme4)) || ((aweme3 = slideAdWebPreloadAssem2.LLJJIII) != null && C1017070cZd.LLJJIJIL(aweme3, "draw_ad", "slide"))) && C07D6.LIZ() > 0.0f)) {
                C21600219g8 c21600219g8 = slideAdWebPreloadAssem2.LLJJJJ;
                if (c21600219g8 != null) {
                    c21600219g8.setOptPageChangeOffset(1.0f - C07D6.LIZ());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setPageOffset ");
                sbLIZ.append(C07D6.LIZ());
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            Aweme aweme8 = slideAdWebPreloadAssem2.LLJJIII;
            if (aweme8 != null && (awemeRawAd = aweme8.getAwemeRawAd()) != null && (leftSlideConfig = awemeRawAd.getLeftSlideConfig()) != null && (distanceThreshold = leftSlideConfig.getDistanceThreshold()) != null) {
                C21600219g8 c21600219g82 = slideAdWebPreloadAssem2.LLJJJJ;
                if (c21600219g82 != null) {
                    c21600219g82.setOptPageChangeOffset(1 - distanceThreshold.floatValue());
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setPageOffset ");
                sbLIZ2.append(distanceThreshold);
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            C21600219g8 c21600219g83 = slideAdWebPreloadAssem2.LLJJJJ;
            if (c21600219g83 == null) {
                return;
            }
            c21600219g83.setOptPageChangeOffset(0.0f);
        }
    };
    public final C01GW LLJJL = C452501pT.LIZIZ(new C1022360ciA());
    public volatile HomePageViewPagerAbility LLJJLIIIJLLLLLLLZ;
    public InterfaceC665370Q7z LLJL;
    public C0QSJ LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SlideAdWebPreloadAssem.class, "homePageViewPagerAbility", "getHomePageViewPagerAbility()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            r5 = this;
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r4 = 0
            java.lang.String r0 = "SlideAdWebPreloadAssem"
            r2[r4] = r0
            java.lang.String r1 = "onCreate"
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "main_act_assem_lifecycle_%s_%s"
            java.lang.String r3 = X.C786410Ut5.j4(r0, r2)
            X.145x r0 = X.C1150504el.LIZ()
            r0.LIZLLL(r3, r4)
            super.onCreate()
            boolean r0 = X.C296200BjG.LIZ()
            r1 = 0
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = r5.Ho()
        L28:
            if (r0 == 0) goto L2d
            r0.Jk1(r5)
        L2d:
            X.19EG r2 = X.C724240Sb0.LIZ(r5)
            if (r2 == 0) goto L45
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r5)
            if (r0 == 0) goto L3f
            androidx.lifecycle.LifecycleOwner r1 = com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt.findSAFExpLifecycleOwner(r0, r1)
            if (r1 != 0) goto L40
        L3f:
            r1 = r2
        L40:
            X.0ci7 r0 = r5.LLJJJJLIIL
            X.C740740T3w.LIZIZ(r2, r1, r0)
        L45:
            X.145x r0 = X.C1150504el.LIZ()
            r0.LJI(r3, r4)
            return
        L4d:
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZLLL(r5)
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = X.C1256610inz.LIZJ(r0)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem.onCreate():void");
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -641279993) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.base.HomePageViewPagerAbility Ho() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = r4.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJLIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJL     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJL = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJLIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.base.HomePageViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.HomePageViewPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = (com.ss.android.ugc.aweme.base.HomePageViewPagerAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJJLIIIJLLLLLLLZ = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem.Ho():com.ss.android.ugc.aweme.base.HomePageViewPagerAbility");
    }

    public final void Jo() {
        Aweme aweme = this.LLJJIII;
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return;
        }
        C1017530caN c1017530caN = C1017530caN.LIZ;
        Aweme aweme2 = this.LLJJIII;
        AwemeRawAd awemeRawAd = aweme2 != null ? aweme2.getAwemeRawAd() : null;
        c1017530caN.getClass();
        if (C1017530caN.LIZJ(awemeRawAd)) {
            Aweme aweme3 = this.LLJJIII;
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("landing_ad", "slide", aweme3 != null ? aweme3.getAwemeRawAd() : null);
            c1022820ciuLIZLLL.LIZIZ(Float.valueOf(this.LLJILJILJ), "start_x");
            c1022820ciuLIZLLL.LIZIZ(Float.valueOf(this.LLJILLL), "start_y");
            c1022820ciuLIZLLL.LIZIZ(Float.valueOf(this.LLJJ), "end_x");
            c1022820ciuLIZLLL.LIZIZ(Float.valueOf(this.LLJJI), "end_y");
            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(System.currentTimeMillis() - this.LLJJIJI), "absolute_duration");
            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(C1045340dJE.LJIJI().LJI()), "duration");
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(C1045340dJE.LJIJI().LJIIJ + 1), "play_order");
            Aweme aweme4 = this.LLJJIII;
            c1022820ciuLIZLLL.LIZIZ(aweme4 != null ? Integer.valueOf(aweme4.getAwemeType()) : null, "video_type");
            Aweme aweme5 = this.LLJJIII;
            if (aweme5 != null && C1017070cZd.LLIIL(aweme5)) {
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(IAdSlidePreloadImpl.LIZJ().LIZ()), "image_location");
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(IAdSlidePreloadImpl.LIZJ().LIZIZ()), "image_cnt");
            }
            c1022820ciuLIZLLL.LJII();
        }
    }

    public final HomePageViewPagerAbility Go() {
        if (C296200BjG.LIZ()) {
            return Ho();
        }
        MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this);
        if (mainActivityScopeLIZLLL != null) {
            return C1256610inz.LIZJ(mainActivityScopeLIZLLL);
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        HomePageViewPagerAbility homePageViewPagerAbilityLIZJ;
        super.onDestroy();
        if (!C296200BjG.LIZ()) {
            MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this);
            if (mainActivityScopeLIZLLL != null) {
                homePageViewPagerAbilityLIZJ = C1256610inz.LIZJ(mainActivityScopeLIZLLL);
            }
            ((LinkedHashMap) this.LLJJJJJIL).clear();
        }
        homePageViewPagerAbilityLIZJ = Ho();
        if (homePageViewPagerAbilityLIZJ != null) {
            homePageViewPagerAbilityLIZJ.yT(this);
        }
        ((LinkedHashMap) this.LLJJJJJIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.slide.SlideAdWebPreloadAbility
    public final void I72(InterfaceC1022370ciB interfaceC1022370ciB) {
        if (interfaceC1022370ciB == null) {
            return;
        }
        this.LLJJJJJIL.put(interfaceC1022370ciB, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrollStateChanged(int r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L80
            X.01GW r0 = X.C283280B8k.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r1 = r4.Go()
            r3 = 0
            if (r1 == 0) goto L7e
            int r0 = r4.LLJJIJIL
            java.lang.String r2 = r1.sr2(r0)
        L1d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLJJIII
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L7c
            java.lang.String r0 = r0.getCreativeIdStr()
        L2b:
            boolean r0 = X.C131100ej.LIZ(r0)
            if (r0 == 0) goto L7a
            X.0caN r1 = X.C1017530caN.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLJJIII
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r0.getAwemeRawAd()
        L3b:
            r1.getClass()
            boolean r0 = X.C1017530caN.LIZJ(r3)
            if (r0 != 0) goto L7a
            r1 = 1
        L45:
            java.lang.String r0 = "page_feed"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L80
            if (r1 == 0) goto L80
            java.util.Map<X.0ciB, java.lang.Integer> r0 = r4.LLJJJJJIL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L5b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            X.0ciB r1 = (X.InterfaceC1022370ciB) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            r1.LIZ()
            goto L5b
        L7a:
            r1 = 0
            goto L45
        L7c:
            r0 = r3
            goto L2b
        L7e:
            r2 = r3
            goto L1d
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem.onPageScrollStateChanged(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r15) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem.onPageSelected(int):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (view instanceof C21600219g8) {
            this.LLJJJJ = (C21600219g8) view;
        }
        if (view instanceof C1591390rVx) {
            ((C1591390rVx) view).getOnActionDownListeners().add(this);
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ci9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Integer numValueOf;
                    if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 1) {
                        this.LL.LLJJ = motionEvent.getX();
                        this.LL.LLJJI = motionEvent.getY();
                        this.LL.LLJJIJIIJIL = true;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SlideAdWebPreloadAssem.LLJLILLLLZIIL;
                        return false;
                    }
                    return false;
                }
            });
        }
    }

    @Override // X.InterfaceC739890T0p
    public final void F4(float f, float f2) {
        this.LLJILJILJ = f;
        this.LLJILLL = f2;
        this.LLJJIJIIJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        C1009490cNP c1009490cNPLJIILJJIL;
        InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
        if (interfaceC1008930cMVLJ != null && (c1009490cNPLJIILJJIL = interfaceC1008930cMVLJ.LJIILJJIL()) != null) {
            c1009490cNPLJIILJJIL.LIZIZ(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1  */
    @Override // X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r12, float r13, int r14) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.slide.SlideAdWebPreloadAssem.onPageScrolled(int, float, int):void");
    }
}
