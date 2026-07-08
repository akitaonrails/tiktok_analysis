package com.ss.android.ugc.aweme.commercialize.profile.impl.ad.profilepage;

import X.C098200Yq;
import X.C0A6O;
import X.C1009740cNo;
import X.C1017070cZd;
import X.C1017290cZz;
import X.C1029630ctt;
import X.C1035740d3k;
import X.C1035880d3y;
import X.C1035890d3z;
import X.C1037010d5n;
import X.C1037570d6h;
import X.C1037580d6i;
import X.C1037590d6j;
import X.C1037600d6k;
import X.C1037740d6y;
import X.C1210304oP;
import X.C1225804qu;
import X.C128Y;
import X.C1388190mED;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C356901a3;
import X.EnumC1027220cq0;
import X.EnumC1037560d6g;
import X.InterfaceC1030370cv5;
import X.InterfaceC1034470d1h;
import X.InterfaceC1034910d2P;
import X.InterfaceC1037610d6l;
import X.InterfaceC1037630d6n;
import X.InterfaceC1037660d6q;
import X.InterfaceC1055050dYt;
import X.InterfaceC2196941Aya;
import X.RunnableC20516081y;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.LandingPageSurveyModel;
import com.ss.android.ugc.aweme.commercialize.profile.impl.ad.profilepage.EmbeddedLandingPageProfilePageScrollObserver;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceAdProfileContainerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.embedded.IEmbeddedLandingPageService;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class EmbeddedLandingPageProfilePageScrollObserver implements InterfaceC1034910d2P, DefaultLifecycleObserver, GenericLifecycleObserver {
    public InterfaceC1037610d6l LL;
    public Aweme LLILLJJLI;
    public RunnableC20516081y LLILLL;

    @Override // X.InterfaceC1034910d2P
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1034910d2P
    public final void LJFF() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final void LJI() {
        InterfaceC1037610d6l interfaceC1037610d6l = this.LL;
        if (interfaceC1037610d6l != null) {
            interfaceC1037610d6l.remove();
        }
        this.LL = null;
        this.LLILLL = null;
    }

    public static String LJII() {
        if (!C1210304oP.LIZ()) {
            return "homepage_ad_half_to_full_screen_landing_page";
        }
        String strLIZ = C1017290cZz.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        return "draw_ad_".concat(strLIZ);
    }

    public static boolean LJIIJJI(Aweme aweme) {
        LandingPageSurveyModel landingPageSurvey;
        IAdLandPageSurveyService iAdLandPageSurveyService;
        AdStyleActionModel adStyleActionModel;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (landingPageSurvey = adStyleActionModel.landingPageSurvey) == null) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                landingPageSurvey = awemeRawAd2.getLandingPageSurvey();
            } else {
                landingPageSurvey = null;
            }
        }
        if (landingPageSurvey != null && landingPageSurvey.disableIabSlideExit == 1 && (iAdLandPageSurveyService = (IAdLandPageSurveyService) PluggableExtentionKt.pluggableSpi$default(IAdLandPageSurveyService.class, false, false, false, 14, null)) != null && iAdLandPageSurveyService.LJFF(aweme.getAwemeRawAd())) {
            return true;
        }
        return false;
    }

    public final void LJIIIIZZ(Aweme aweme) {
        InterfaceC1037610d6l interfaceC1037610d6l = this.LL;
        if (interfaceC1037610d6l == null) {
            return;
        }
        C1037580d6i c1037580d6i = EnumC1037560d6g.Companion;
        String url = interfaceC1037610d6l.getUrl();
        c1037580d6i.getClass();
        EnumC1037560d6g enumC1037560d6gLIZ = C1037580d6i.LIZ(url);
        if (enumC1037560d6gLIZ != EnumC1037560d6g.LYNX && enumC1037560d6gLIZ != EnumC1037560d6g.MINI_PROGRAM) {
            if (enumC1037560d6gLIZ != EnumC1037560d6g.WEB || !((Boolean) C0A6O.LIZ.getValue()).booleanValue()) {
                interfaceC1037610d6l.LIZIZ(null);
            } else {
                InterfaceC1030370cv5 interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class);
                if (interfaceC1030370cv5 != null && interfaceC1030370cv5.r42(aweme.getAwemeRawAd())) {
                    interfaceC1037610d6l.LIZIZ(null);
                } else {
                    interfaceC1037610d6l.remove();
                    this.LL = null;
                }
            }
        } else {
            interfaceC1037610d6l.remove();
            this.LL = null;
        }
        this.LLILLL = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        InterfaceC1037610d6l interfaceC1037610d6l = this.LL;
        if (interfaceC1037610d6l == null || !Intrinsics.LJFF(interfaceC1037610d6l.getFragment(), lifecycleOwner)) {
            return;
        }
        interfaceC1037610d6l.remove();
        this.LL = null;
        this.LLILLL = null;
    }

    public static boolean LJIIL(Context context, Aweme aweme) {
        ICommerceAdProfileContainerService iCommerceAdProfileContainerService;
        C128Y c128yLIZLLL;
        InterfaceC1055050dYt interfaceC1055050dYt;
        if (!C1017070cZd.LLJJI(aweme, "draw_ad", C1017290cZz.LIZ()) || (iCommerceAdProfileContainerService = (ICommerceAdProfileContainerService) PluggableExtentionKt.pluggableSpi$default(ICommerceAdProfileContainerService.class, false, false, false, 14, null)) == null || (c128yLIZLLL = iCommerceAdProfileContainerService.LIZLLL(context)) == null) {
            return false;
        }
        String strM1 = null;
        if ((c128yLIZLLL instanceof InterfaceC1055050dYt) && (interfaceC1055050dYt = (InterfaceC1055050dYt) c128yLIZLLL) != null) {
            strM1 = interfaceC1055050dYt.M1();
        }
        return Intrinsics.LJFF(strM1, "page_user_fragment");
    }

    @Override // X.InterfaceC1034910d2P
    public final void LIZ(Context context, Aweme aweme) {
        LJIIJ(context, aweme);
        if (LJIIL(context, aweme)) {
            LJIIIIZZ(aweme);
        }
    }

    @Override // X.InterfaceC1034910d2P
    public final void LIZIZ(Context context, Aweme aweme) {
        LJIIJ(context, aweme);
        if (LJIIL(context, aweme)) {
            LJIIIIZZ(aweme);
        }
    }

    @Override // X.InterfaceC1034910d2P
    public final void LIZLLL(Context context, Aweme aweme) {
        LJIIJ(context, aweme);
        if (LJIIL(context, aweme)) {
            LJIILIIL(context, aweme);
        }
    }

    @Override // X.InterfaceC1034910d2P
    public final void LJ(Context context, Aweme aweme) {
        InterfaceC1034470d1h interfaceC1034470d1h;
        C1035880d3y c1035880d3y;
        C1035890d3z adCommonData;
        Runnable runnable;
        LJIIJ(context, aweme);
        if (LJIIL(context, aweme)) {
            LJIILIIL(context, aweme);
            InterfaceC1037610d6l interfaceC1037610d6l = this.LL;
            if (interfaceC1037610d6l != null) {
                interfaceC1037610d6l.LIZ();
            }
            InterfaceC1037610d6l interfaceC1037610d6l2 = this.LL;
            if (interfaceC1037610d6l2 != null) {
                C128Y fragment = interfaceC1037610d6l2.getFragment();
                if ((fragment instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) fragment) != null && (c1035880d3y = (C1035880d3y) interfaceC1034470d1h.Sj(C1035880d3y.class)) != null && (adCommonData = c1035880d3y.getAdCommonData()) != null && (runnable = adCommonData.pendingClickRunnable) != null) {
                    runnable.run();
                    return;
                }
                RunnableC20516081y runnableC20516081y = this.LLILLL;
                if (runnableC20516081y == null) {
                    return;
                }
                runnableC20516081y.run();
            }
        }
    }

    public final void LJIIIZ(InterfaceC1037610d6l interfaceC1037610d6l, Aweme aweme) {
        InterfaceC1034470d1h interfaceC1034470d1h;
        C1035880d3y c1035880d3y;
        C1035890d3z adCommonData;
        IAdPhotoModeService iAdPhotoModeService;
        int size;
        List<PhotoModeImageUrlModel> imageList;
        LinkedHashMap linkedHashMap = null;
        if (C1017070cZd.LLIIL(aweme) && (iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null)) != null) {
            int iLJJIJIIJIL = iAdPhotoModeService.LJJIJIIJIL();
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_method", iAdPhotoModeService.getEnterMethod());
            linkedHashMap.put("image_show_count", iAdPhotoModeService.LJIJJ(iLJJIJIIJIL, aweme));
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            linkedHashMap.put("image_cnt", Integer.valueOf(size));
            linkedHashMap.put("image_location", Integer.valueOf(iLJJIJIIJIL + 1));
            Map<String, Object> mapLIZLLL = iAdPhotoModeService.LIZLLL(aweme);
            if (!mapLIZLLL.isEmpty()) {
                linkedHashMap.putAll(mapLIZLLL);
            }
        }
        C128Y fragment = interfaceC1037610d6l.getFragment();
        if ((fragment instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) fragment) != null && (c1035880d3y = (C1035880d3y) interfaceC1034470d1h.Sj(C1035880d3y.class)) != null && (adCommonData = c1035880d3y.getAdCommonData()) != null) {
            if (adCommonData.pendingClickRunnable == null) {
                adCommonData.setPendingClickRunnable(new RunnableC20516081y(aweme, linkedHashMap));
            }
        } else if (this.LLILLL == null) {
            this.LLILLL = new RunnableC20516081y(aweme, linkedHashMap);
        }
    }

    public final void LJIIJ(Context context, Aweme aweme) {
        ICommerceAdProfileContainerService iCommerceAdProfileContainerService;
        if (!Intrinsics.LJFF(this.LLILLJJLI, aweme) && this.LL != null) {
            LJI();
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null && (iCommerceAdProfileContainerService = (ICommerceAdProfileContainerService) PluggableExtentionKt.pluggableSpi$default(ICommerceAdProfileContainerService.class, false, false, false, 14, null)) != null) {
                iCommerceAdProfileContainerService.LIZIZ(activityLIZ);
            }
        }
        this.LLILLJJLI = aweme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILIIL(final Context context, final Aweme aweme) {
        Fragment fragmentLIZLLL;
        InterfaceC1037630d6n interfaceC1037630d6n;
        int i;
        FrameLayout frameLayoutLIZJ;
        InterfaceC1037610d6l interfaceC1037610d6lLIZIZ;
        String webTitle;
        UrlModel urlModelLJ;
        Fragment fragmentFv;
        IEmbeddedLandingPageService iEmbeddedLandingPageService;
        boolean z;
        C19EG c19eg;
        IAdLynxLandPageUtils iAdLynxLandPageUtils;
        IEmbeddedLandingPageService iEmbeddedLandingPageService2;
        IMinisApiService iMinisApiService;
        Fragment fragmentLJIILJJIL;
        IEmbeddedLandingPageService iEmbeddedLandingPageService3;
        InterfaceC1034470d1h interfaceC1034470d1h;
        C1029630ctt c1029630ctt;
        InterfaceC1034470d1h interfaceC1034470d1h2;
        C1035880d3y c1035880d3y;
        InterfaceC1037610d6l interfaceC1037610d6l = this.LL;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            LJI();
            return;
        }
        ICommerceAdProfileContainerService iCommerceAdProfileContainerService = (ICommerceAdProfileContainerService) PluggableExtentionKt.pluggableSpi$default(ICommerceAdProfileContainerService.class, false, false, false, 14, null);
        if (iCommerceAdProfileContainerService != null && (fragmentLIZLLL = iCommerceAdProfileContainerService.LIZLLL(context)) != 0 && (fragmentLIZLLL instanceof InterfaceC1037630d6n) && (interfaceC1037630d6n = (InterfaceC1037630d6n) fragmentLIZLLL) != null) {
            String strJL = interfaceC1037630d6n.jL(aweme);
            if (strJL == null) {
                LJI();
                return;
            }
            EnumC1037560d6g.Companion.getClass();
            EnumC1037560d6g enumC1037560d6gLIZ = C1037580d6i.LIZ(strJL);
            if (enumC1037560d6gLIZ == null) {
                i = -1;
            } else {
                i = C1037570d6h.LIZ[enumC1037560d6gLIZ.ordinal()];
            }
            if (i == 1) {
                frameLayoutLIZJ = new FrameLayout(activityLIZ);
            } else {
                ICommerceAdProfileContainerService iCommerceAdProfileContainerService2 = (ICommerceAdProfileContainerService) PluggableExtentionKt.pluggableSpi$default(ICommerceAdProfileContainerService.class, false, false, false, 14, null);
                if (iCommerceAdProfileContainerService2 == null || (frameLayoutLIZJ = iCommerceAdProfileContainerService2.LIZJ(activityLIZ)) == null) {
                    LJI();
                    return;
                }
            }
            if (interfaceC1037610d6l != null && Intrinsics.LJFF(interfaceC1037610d6l.getUrl(), strJL)) {
                LJIIIZ(interfaceC1037610d6l, aweme);
                EnumC1037560d6g enumC1037560d6gLIZ2 = C1037580d6i.LIZ(interfaceC1037610d6l.getUrl());
                if (enumC1037560d6gLIZ2 == EnumC1037560d6g.WEB) {
                    C128Y fragment = interfaceC1037610d6l.getFragment();
                    if ((fragment instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h2 = (InterfaceC1034470d1h) fragment) != null && (c1035880d3y = (C1035880d3y) interfaceC1034470d1h2.Sj(C1035880d3y.class)) != null) {
                        c1035880d3y.setRefer(LJII());
                    }
                } else if (enumC1037560d6gLIZ2 == EnumC1037560d6g.LYNX) {
                    C128Y fragment2 = interfaceC1037610d6l.getFragment();
                    if ((fragment2 instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) fragment2) != null && (c1029630ctt = (C1029630ctt) interfaceC1034470d1h.Sj(C1029630ctt.class)) != null) {
                        c1029630ctt.LIZJ = LJII();
                    }
                }
                interfaceC1037610d6l.LIZJ(frameLayoutLIZJ, fragmentLIZLLL.getChildFragmentManager());
                return;
            }
            LJI();
            EnumC1037560d6g enumC1037560d6gLIZ3 = C1037580d6i.LIZ(strJL);
            if (enumC1037560d6gLIZ3 != null) {
                int i2 = C1037570d6h.LIZ[enumC1037560d6gLIZ3.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4 && C1388190mED.LIZ(context) != null && (iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null)) != null && (fragmentLJIILJJIL = iMinisApiService.LJIILJJIL(strJL, 0, 0, new InterfaceC2196941Aya() { // from class: X.0d6f
                                @Override // X.InterfaceC2196941Aya
                                public final void LIZ() {
                                    FragmentManager fragmentManagerLJ;
                                    Object c098200Yq;
                                    Object objM1boximpl;
                                    Fragment fragmentLIZLLL2;
                                    EmbeddedLandingPageProfilePageScrollObserver embeddedLandingPageProfilePageScrollObserver = this.LIZ;
                                    Context context2 = context;
                                    Aweme aweme2 = aweme;
                                    embeddedLandingPageProfilePageScrollObserver.getClass();
                                    if (!((Boolean) C275640ArC.LIZ.getValue()).booleanValue()) {
                                        embeddedLandingPageProfilePageScrollObserver.LJIIIIZZ(aweme2);
                                        return;
                                    }
                                    Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                                    ICommerceAdProfileContainerService iCommerceAdProfileContainerService3 = (ICommerceAdProfileContainerService) PluggableExtentionKt.pluggableSpi$default(ICommerceAdProfileContainerService.class, false, false, false, 14, null);
                                    if (iCommerceAdProfileContainerService3 == null || (fragmentLIZLLL2 = iCommerceAdProfileContainerService3.LIZLLL(context2)) == null || (fragmentManagerLJ = fragmentLIZLLL2.getChildFragmentManager()) == null) {
                                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                                        fragmentManagerLJ = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LJ() : null;
                                    }
                                    InterfaceC1037610d6l interfaceC1037610d6l2 = embeddedLandingPageProfilePageScrollObserver.LL;
                                    Fragment fragment3 = interfaceC1037610d6l2 != null ? interfaceC1037610d6l2.getFragment() : null;
                                    if (objPluggableSpi$default != null && fragmentManagerLJ != null && fragment3 != null) {
                                        IMinisApiService iMinisApiService2 = (IMinisApiService) objPluggableSpi$default;
                                        iMinisApiService2.LJI(fragment3, false);
                                        iMinisApiService2.LJIJJLI(fragment3);
                                        if (fragmentManagerLJ.LJJLIIIJL().contains(fragment3)) {
                                            try {
                                                C19EH c19ehLJIIJ = fragmentManagerLJ.LJIIJ();
                                                c19ehLJIIJ.LJIJJ(0, R.anim.fy);
                                                c19ehLJIIJ.LJIIZILJ(fragment3);
                                                c098200Yq = Integer.valueOf(c19ehLJIIJ.LJIIJ());
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            objM1boximpl = C189200o6.m1boximpl(c098200Yq);
                                        } else {
                                            embeddedLandingPageProfilePageScrollObserver.LJIIIIZZ(aweme2);
                                            objM1boximpl = Unit.LIZ;
                                        }
                                        if (objM1boximpl != null) {
                                            return;
                                        }
                                    }
                                    embeddedLandingPageProfilePageScrollObserver.LJIIIIZZ(aweme2);
                                }
                            }, new InterfaceC1037660d6q() { // from class: X.0d6o
                            })) != null && (iEmbeddedLandingPageService3 = (IEmbeddedLandingPageService) PluggableExtentionKt.pluggableSpi$default(IEmbeddedLandingPageService.class, false, false, false, 14, null)) != null) {
                                C1037590d6j c1037590d6j = new C1037590d6j();
                                c1037590d6j.LIZ = C1009740cNo.LJFF(aweme);
                                c1037590d6j.LIZJ = false;
                                c1037590d6j.LIZIZ = false;
                                c1037590d6j.LJFF = true;
                                C1037740d6y c1037740d6yLIZ = c1037590d6j.LIZ();
                                C1037600d6k c1037600d6k = new C1037600d6k();
                                c1037600d6k.LIZ = EnumC1037560d6g.MINI_PROGRAM;
                                c1037600d6k.LIZIZ = strJL;
                                interfaceC1037610d6lLIZIZ = iEmbeddedLandingPageService3.LIZ(fragmentLJIILJJIL, c1037740d6yLIZ, c1037600d6k.LIZ());
                            } else {
                                return;
                            }
                        } else {
                            Activity activityLIZ2 = C1388190mED.LIZ(context);
                            if (activityLIZ2 != null && (activityLIZ2 instanceof C19EG) && (c19eg = (C19EG) activityLIZ2) != null && (iAdLynxLandPageUtils = (IAdLynxLandPageUtils) PluggableExtentionKt.pluggableSpi$default(IAdLynxLandPageUtils.class, false, false, false, 14, null)) != null) {
                                Bundle bundleDt = interfaceC1037630d6n.dt(aweme);
                                if (bundleDt == null) {
                                    bundleDt = new Bundle();
                                }
                                Fragment fragmentLJ = iAdLynxLandPageUtils.LJ(c19eg, bundleDt, aweme, strJL, LJII(), false);
                                if (fragmentLJ != null && (iEmbeddedLandingPageService2 = (IEmbeddedLandingPageService) PluggableExtentionKt.pluggableSpi$default(IEmbeddedLandingPageService.class, false, false, false, 14, null)) != null) {
                                    C1037590d6j c1037590d6j2 = new C1037590d6j();
                                    c1037590d6j2.LIZ = C1009740cNo.LJFF(aweme);
                                    c1037590d6j2.LIZJ = ((Boolean) C1225804qu.LIZIZ.getValue()).booleanValue();
                                    c1037590d6j2.LIZIZ = ((Boolean) C1225804qu.LIZJ.getValue()).booleanValue();
                                    C1037740d6y c1037740d6yLIZ2 = c1037590d6j2.LIZ();
                                    C1037600d6k c1037600d6k2 = new C1037600d6k();
                                    c1037600d6k2.LIZ = EnumC1037560d6g.LYNX;
                                    c1037600d6k2.LIZIZ = strJL;
                                    interfaceC1037610d6lLIZIZ = iEmbeddedLandingPageService2.LIZ(fragmentLJ, c1037740d6yLIZ2, c1037600d6k2.LIZ());
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        Activity activityLIZ3 = C1388190mED.LIZ(context);
                        if (activityLIZ3 != null) {
                            boolean zLJIIJJI = LJIIJJI(aweme);
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            String str = "";
                            if (awemeRawAd == null || (webTitle = awemeRawAd.getWebTitle()) == null) {
                                webTitle = "";
                            }
                            String aid = aweme.getAid();
                            String authorUid = AwemeExtKt.getAuthorUid(aweme);
                            String requestId = aweme.getRequestId();
                            IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
                            if (iAdWebUIUtils != null) {
                                urlModelLJ = iAdWebUIUtils.LJ(aweme.getAuthor());
                            } else {
                                urlModelLJ = null;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(System.currentTimeMillis());
                            sbLIZ.append('-');
                            sbLIZ.append(UUID.randomUUID());
                            C1035740d3k c1035740d3k = new C1035740d3k(strJL, 1, webTitle, "feedad", "", true, "click", false, 0, C2188811AlT.LIZIZ(sbLIZ), false, false, aid, authorUid, requestId, urlModelLJ, true, null, null, null);
                            c1035740d3k.setRefer(LJII());
                            boolean z2 = false;
                            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) PluggableExtentionKt.pluggableSpi$default(IAdLandPagePreloadService.class, false, false, false, 14, null);
                            if (iAdLandPagePreloadService != null && iAdLandPagePreloadService.N0() != null) {
                                String str2 = c1035740d3k.url;
                                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                String aid2 = aweme.getAid();
                                if (aid2 != null) {
                                    str = aid2;
                                }
                                String strLJIIJJI = C1037010d5n.LJIIJJI(awemeRawAd2, str2, str, true);
                                if (strLJIIJJI != null) {
                                    c1035740d3k.setContainerId(strLJIIJJI);
                                }
                            }
                            if (C1017070cZd.LLJJIJIL(aweme, "draw_ad", C1017290cZz.LIZ())) {
                                try {
                                    c1035740d3k.setForceShowNavBar(UriProtector.parse(c1035740d3k.url).getBooleanQueryParameter("is_instant_page", false));
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                            IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                            if (iAdWebUtils != null && (fragmentFv = iAdWebUtils.fv(activityLIZ3, aweme, c1035740d3k, EnumC1027220cq0.NORMAL, null)) != null && (iEmbeddedLandingPageService = (IEmbeddedLandingPageService) PluggableExtentionKt.pluggableSpi$default(IEmbeddedLandingPageService.class, false, false, false, 14, null)) != null) {
                                C1037590d6j c1037590d6j3 = new C1037590d6j();
                                c1037590d6j3.LIZ = C1009740cNo.LJFF(aweme);
                                if (!zLJIIJJI && ((Boolean) C1225804qu.LIZIZ.getValue()).booleanValue()) {
                                    z2 = true;
                                }
                                c1037590d6j3.LIZJ = z2;
                                c1037590d6j3.LJ = new AwS417S0200000_16(this, aweme, 60);
                                if (!zLJIIJJI && ((Boolean) C1225804qu.LIZJ.getValue()).booleanValue()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c1037590d6j3.LIZIZ = z;
                                c1037590d6j3.LIZLLL = new AwS417S0200000_16(this, aweme, 61);
                                C1037740d6y c1037740d6yLIZ3 = c1037590d6j3.LIZ();
                                C1037600d6k c1037600d6k3 = new C1037600d6k();
                                c1037600d6k3.LIZ = EnumC1037560d6g.WEB;
                                c1037600d6k3.LIZIZ = strJL;
                                interfaceC1037610d6lLIZIZ = iEmbeddedLandingPageService.LIZ(fragmentFv, c1037740d6yLIZ3, c1037600d6k3.LIZ());
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    IEmbeddedLandingPageService iEmbeddedLandingPageService4 = (IEmbeddedLandingPageService) PluggableExtentionKt.pluggableSpi$default(IEmbeddedLandingPageService.class, false, false, false, 14, null);
                    if (iEmbeddedLandingPageService4 != null) {
                        Fragment fragment3 = new Fragment();
                        C1037600d6k c1037600d6k4 = new C1037600d6k();
                        c1037600d6k4.LIZ = EnumC1037560d6g.SERIES;
                        c1037600d6k4.LIZIZ = strJL;
                        interfaceC1037610d6lLIZIZ = iEmbeddedLandingPageService4.LIZIZ(fragment3, c1037600d6k4.LIZ());
                    } else {
                        return;
                    }
                }
                if (interfaceC1037610d6lLIZIZ != null) {
                    LJIIIZ(interfaceC1037610d6lLIZIZ, aweme);
                    interfaceC1037610d6lLIZIZ.LIZJ(frameLayoutLIZJ, fragmentLIZLLL.getChildFragmentManager());
                    this.LL = interfaceC1037610d6lLIZIZ;
                    if (enumC1037560d6gLIZ != EnumC1037560d6g.SERIES) {
                        interfaceC1037610d6lLIZIZ.getFragment().getLifecycle().addObserver(this);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LJI();
    }
}
