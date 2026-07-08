package com.ss.android.ugc.aweme.landpage.popup;

import X.AbstractC813200VvC;
import X.C01GW;
import X.C098200Yq;
import X.C0BXA;
import X.C0C64;
import X.C0FNV;
import X.C0IKF;
import X.C0KWF;
import X.C1017200cZq;
import X.C1017230cZt;
import X.C1017290cZz;
import X.C1017903yT;
import X.C1022820ciu;
import X.C1025720cna;
import X.C1026310coX;
import X.C1026350cob;
import X.C1028090crP;
import X.C1028100crQ;
import X.C1029390ctV;
import X.C1030300cuy;
import X.C1030310cuz;
import X.C1030380cv6;
import X.C1030440cvC;
import X.C1036140d4O;
import X.C1036170d4R;
import X.C1036300d4e;
import X.C1036360d4k;
import X.C1036540d52;
import X.C1037700d6u;
import X.C1210304oP;
import X.C1247510iZJ;
import X.C1390850mIV;
import X.C13LP;
import X.C189200o6;
import X.C1954307l7;
import X.C1954807lC;
import X.C19738212Km;
import X.C19EG;
import X.C19EH;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C292440BdC;
import X.C299720Bow;
import X.C452501pT;
import X.C465320IMo;
import X.C497820Jfg;
import X.C680080Qly;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.DialogInterfaceOnDismissListenerC1077340e8q;
import X.EnumC1029460ctc;
import X.EnumC1036160d4Q;
import X.InterfaceC1008930cMV;
import X.InterfaceC1034470d1h;
import X.InterfaceC1036270d4b;
import X.InterfaceC1036310d4f;
import X.InterfaceC1036350d4j;
import X.InterfaceC1036380d4m;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS42S0300000_9;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageUnityLogger;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.service.player.IQuickActionPlayerService;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.log.AdLandingPageResizeLogger;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandingPagePopUpImpl implements IAdLandingPagePopUpService {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public FrameLayout LJ;
    public FrameLayout LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(195));

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LJIJ() {
        this.LIZ = false;
    }

    public final C1030300cuy LJJII() {
        return (C1030300cuy) this.LJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LJIILIIL() {
        C1030300cuy c1030300cuyLJJII = LJJII();
        FrameLayout frameLayout = this.LJFF;
        C1030310cuz c1030310cuz = (C1030310cuz) c1030300cuyLJJII.LIZIZ.getValue();
        c1030310cuz.getClass();
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        View view = c1030310cuz.LIZ;
        if (view != null && frameLayout != null) {
            C786410Ut5.LJJJZ(view, frameLayout);
        }
        c1030310cuz.LIZ = null;
        this.LIZ = false;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final boolean LJI() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final boolean LJII() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final boolean LJIILL() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final boolean LJIJI() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LIZ(boolean z) {
        this.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final boolean LIZLLL(C1026310coX c1026310coX) {
        boolean zLIZ = ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZ(((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Xu(c1026310coX));
        if (zLIZ) {
            return C0BXA.LIZ();
        }
        if (!zLIZ) {
            return C299720Bow.LIZ();
        }
        throw new C1954807lC();
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LJ(boolean z) {
        int i;
        View view = ((C1030310cuz) LJJII().LIZIZ.getValue()).LIZ;
        if (view != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LJFF(boolean z) {
        this.LIZLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LJIIIIZZ(C1026310coX c1026310coX) {
        C1017200cZq c1017200cZqLJIL;
        C1017230cZt c1017230cZtLIZ;
        Map<String, Object> map;
        Object obj;
        HashMap map2 = new HashMap();
        InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
        if (interfaceC1008930cMVLJ != null && (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) != null && (c1017230cZtLIZ = c1017200cZqLJIL.LIZ(c1026310coX.getAwemeRawAd())) != null && (map = c1017230cZtLIZ.LIZJ) != null) {
            map2.put("product_id", map.get("productId"));
            map2.put("product_url", c1017230cZtLIZ.LIZ);
            Map<String, Object> map3 = c1017230cZtLIZ.LIZJ;
            if (map3 != null) {
                obj = map3.get("productIndex");
            } else {
                obj = null;
            }
            map2.put("product_counts", obj);
        }
        String strLIZ = C1017290cZz.LIZ();
        if (strLIZ != null) {
            map2.put("enter_source", strLIZ);
        }
        if (C1210304oP.LIZ()) {
            IFullScreenLandingPageUnityLogger iFullScreenLandingPageUnityLogger = (IFullScreenLandingPageUnityLogger) PluggableExtentionKt.pluggableSpi$default(IFullScreenLandingPageUnityLogger.class, false, false, false, 14, null);
            if (iFullScreenLandingPageUnityLogger != null) {
                iFullScreenLandingPageUnityLogger.LIZ(EnumC1029460ctc.VERSION_1_0, c1026310coX.getAwemeRawAd(), C1017290cZz.LIZ(), map2);
                return;
            }
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "click", c1026310coX.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("halfscreen_page", "refer");
        c1022820ciuLIZLLL.LIZ(map2);
        c1022820ciuLIZLLL.LJII();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0d4e] */
    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final C1036300d4e LJIIZILJ(C1036140d4O c1036140d4O) {
        return new InterfaceC1036310d4f<InterfaceC1036380d4m>(c1036140d4O) { // from class: X.0d4e
            public final InterfaceC1036380d4m LIZ;

            {
                this.LIZ = c1036140d4O;
            }

            @Override // X.InterfaceC1036310d4f
            public final void LIZ(float f) {
                Context context;
                Integer numLIZJ;
                View view;
                if (f > 0.0f) {
                    if (f == 1.0f) {
                        LIZJ(true);
                        return;
                    }
                    View header = this.LIZ.getHeader();
                    if (header != null) {
                        C786410Ut5.T4(header, f);
                        C786410Ut5.LJLLLLLL(0, header);
                        header.setPadding(0, (int) (this.LIZ.LIZ() * f), 0, 0);
                        ViewGroup.LayoutParams layoutParams = header.getLayoutParams();
                        layoutParams.height = (int) ((this.LIZ.LLLZL() + this.LIZ.LIZ()) * f);
                        C786410Ut5.W5(header, layoutParams);
                    }
                    View header2 = this.LIZ.getHeader();
                    if (header2 != null && (context = header2.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                        int iIntValue = numLIZJ.intValue();
                        View header3 = this.LIZ.getHeader();
                        Object parent = null;
                        if (header3 != null) {
                            parent = header3.getParent();
                        }
                        if ((parent instanceof View) && (view = (View) parent) != null) {
                            view.setBackgroundColor(iIntValue);
                        }
                    }
                    View body = this.LIZ.getBody();
                    if (body == null) {
                        return;
                    }
                    C426750GoL.LJIIIZ(body, null, Integer.valueOf((int) ((this.LIZ.LLLZL() + this.LIZ.LIZ()) * f)), null, null, false, 29);
                    return;
                }
                LIZJ(false);
            }

            public final void LIZJ(boolean z) {
                Context context;
                Integer numLIZJ;
                View view;
                int i;
                float f;
                int iLLLZL;
                int iLIZ;
                View header = this.LIZ.getHeader();
                int iLLLZL2 = 0;
                if (header != null) {
                    if (z) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    C786410Ut5.LJLLLLLL(i, header);
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    C786410Ut5.T4(header, f);
                    ViewGroup.LayoutParams layoutParams = header.getLayoutParams();
                    if (z) {
                        iLLLZL = this.LIZ.LLLZL() + this.LIZ.LIZ();
                    } else {
                        iLLLZL = 0;
                    }
                    layoutParams.height = iLLLZL;
                    C786410Ut5.W5(header, layoutParams);
                    if (z) {
                        iLIZ = this.LIZ.LIZ();
                    } else {
                        iLIZ = 0;
                    }
                    header.setPadding(0, iLIZ, 0, 0);
                }
                View header2 = this.LIZ.getHeader();
                if (header2 != null && (context = header2.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                    int iIntValue = numLIZJ.intValue();
                    View header3 = this.LIZ.getHeader();
                    Object parent = null;
                    if (header3 != null) {
                        parent = header3.getParent();
                    }
                    if ((parent instanceof View) && (view = (View) parent) != null) {
                        view.setBackgroundColor(iIntValue);
                    }
                }
                View body = this.LIZ.getBody();
                if (body != null) {
                    if (z) {
                        iLLLZL2 = this.LIZ.LLLZL() + this.LIZ.LIZ();
                    }
                    C426750GoL.LJIIIZ(body, null, Integer.valueOf(iLLLZL2), null, null, false, 29);
                }
            }

            @Override // X.InterfaceC1036310d4f
            public final void LIZIZ(TuxSheet tuxSheet, int i) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 3) {
                            if (i != 4) {
                                return;
                            }
                        }
                    } else {
                        C1036320d4g.LIZ(tuxSheet, false);
                    }
                    LIZJ(false);
                    return;
                }
                C1036320d4g.LIZ(tuxSheet, true);
                LIZJ(true);
            }
        };
    }

    public static Fragment LJJIFFI(C19EG c19eg, String str) {
        FragmentManager childFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Fragment fragmentLJJJJZI = c19eg.getSupportFragmentManager().LJJJJZI(str);
        if (!(fragmentLJJJJZI instanceof TuxSheet) || fragmentLJJJJZI == null || (childFragmentManager = fragmentLJJJJZI.getChildFragmentManager()) == null || (listLJJLIIIJL = childFragmentManager.LJJLIIIJL()) == null) {
            return null;
        }
        return (Fragment) C13LP.LJJJLL(listLJJLIIIJL);
    }

    public static void LJJIIJ(TuxSheet tuxSheet, C1030380cv6 c1030380cv6) {
        Dialog dialog;
        C1954307l7.LIZ.getClass();
        Field fieldLIZ = C1954307l7.LIZ(DialogFragment.class, "mDialog");
        if (fieldLIZ == null || c1030380cv6.LIZ == null || (dialog = c1030380cv6.LIZJ) == null) {
            return;
        }
        try {
            fieldLIZ.set(tuxSheet, dialog);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJJIIJZLJL(TuxSheet tuxSheet, C1030380cv6 c1030380cv6) {
        C1954307l7.LIZ.getClass();
        Field fieldLIZ = C1954307l7.LIZ(DialogFragment.class, "mDialog");
        if (fieldLIZ == null) {
            return;
        }
        C1037700d6u.LIZ.getClass();
        View view = tuxSheet.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS42S0300000_9(fieldLIZ, tuxSheet, c1030380cv6, 9));
        }
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LIZIZ(Bundle bundle, AwemeRawAd awemeRawAd) {
        AdLandingPageResizeLogger adLandingPageResizeLogger = new AdLandingPageResizeLogger(new Object[]{bundle});
        C1029390ctV.LIZ.getClass();
        adLandingPageResizeLogger.logAd(C1029390ctV.LIZIZ, new AwS595S0100000_16(awemeRawAd, 100));
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LIZJ(C19EG c19eg, ARunnableS116S0100000_16 aRunnableS116S0100000_16) {
        DialogFragment dialogFragment;
        Fragment fragmentLJJJJZI = c19eg.getSupportFragmentManager().LJJJJZI("PopUp_BottomSheetAction");
        if (fragmentLJJJJZI != null && (fragmentLJJJJZI instanceof TuxActionSheet) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null) {
            dialogFragment.dismiss();
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(R.string.s65);
        c1247510iZJ.LIZ(new AwS595S0100000_16(aRunnableS116S0100000_16, 311));
        c1390850mIV.LIZIZ(c1247510iZJ);
        c1390850mIV.LIZJ().showNow(c19eg.getSupportFragmentManager(), "PopUp_BottomSheetAction");
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final C1026310coX LJIIIZ(Aweme aweme, AwemeRawAd awemeRawAd) {
        Boolean bool = Boolean.TRUE;
        return new C1026310coX("", awemeRawAd, C1028090crP.LIZ(aweme, null, 1, "feed_ai_pdp_background_open", null, null, null, null), false, new C1025720cna(1.0E-4f, bool, Boolean.FALSE, 3, Boolean.FALSE, 0, 0, Boolean.FALSE), new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, true, false, Boolean.TRUE, Boolean.TRUE, null, null, null, false, false, false, false, null, bool));
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final boolean LJIIJJI(C1026310coX c1026310coX, Boolean bool) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        boolean zLJIIIZ = false;
        if (bool == null || Intrinsics.LJFF(bool, Boolean.FALSE)) {
            return false;
        }
        boolean zLIZ = ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZ(((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Xu(c1026310coX));
        if (zLIZ) {
            if (!C292440BdC.LIZ() || c1026310coX == null || (awemeRawAd = c1026310coX.getAwemeRawAd()) == null || awemeRawAd.getLandingPageNativeType() != 1 || (awemeRawAd2 = c1026310coX.getAwemeRawAd()) == null || awemeRawAd2.getNativeHeader() == null) {
                return false;
            }
            return true;
        }
        if (!zLIZ) {
            try {
                zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "commerce_ad_landing_page_3p_use_tuxsheet_style", true, false);
                return zLJIIIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return zLJIIIZ;
            }
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJIII(Fragment fragment, final C19EG c19eg, final String str) {
        SparkFragment sparkFragment;
        InterfaceC1034470d1h interfaceC1034470d1h;
        if ((fragment instanceof SparkFragment) && (sparkFragment = (SparkFragment) fragment) != null && sparkFragment.LLILLL != null && (fragment instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) fragment) != null) {
            interfaceC1034470d1h.LJJ(str);
            if (Unit.LIZ != null) {
                return;
            }
        }
        c19eg.getSupportFragmentManager().LJZL(new AbstractC813200VvC() { // from class: X.0d3w
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC813200VvC
            public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment2, View view, Bundle bundle) {
                InterfaceC1034470d1h interfaceC1034470d1h2;
                final FragmentManager childFragmentManager;
                if ((fragment2 instanceof TuxSheet) && fragment2 != 0 && (childFragmentManager = fragment2.getChildFragmentManager()) != null) {
                    final String str2 = str;
                    childFragmentManager.LJZL(new AbstractC813200VvC() { // from class: X.0d3x
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractC813200VvC
                        public final void onFragmentViewCreated(FragmentManager fragmentManager2, Fragment fragment3, View view2, Bundle bundle2) {
                            InterfaceC1034470d1h interfaceC1034470d1h3;
                            if ((fragment3 instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h3 = (InterfaceC1034470d1h) fragment3) != null) {
                                interfaceC1034470d1h3.LJJ(str2);
                            }
                            childFragmentManager.LLIILZL(this);
                        }
                    }, false);
                } else {
                    String str3 = str;
                    if ((fragment2 instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h2 = (InterfaceC1034470d1h) fragment2) != null) {
                        interfaceC1034470d1h2.LJJ(str3);
                    }
                }
                c19eg.getSupportFragmentManager().LLIILZL(this);
            }
        }, false);
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LJIILLIIL(C19EG c19eg, C1026310coX c1026310coX, EnumC1036160d4Q enumC1036160d4Q) {
        String strXu;
        Fragment fragmentMv;
        int i;
        int i2;
        String ak;
        if (c1026310coX == null || enumC1036160d4Q == null || (strXu = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Xu(c1026310coX)) == null) {
            return;
        }
        boolean zLIZ = ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZ(strXu);
        if (zLIZ) {
            strXu = ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LJFF(c1026310coX, c19eg, strXu);
            IAdLynxLandPageUtils iAdLynxLandPageUtils = (IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class);
            C1028100crQ popUpCustomConfig = c1026310coX.getPopUpCustomConfig();
            if (popUpCustomConfig != null) {
                ak = popUpCustomConfig.getAk();
            } else {
                ak = null;
            }
            fragmentMv = iAdLynxLandPageUtils.LIZIZ(c19eg, strXu, c1026310coX, true, enumC1036160d4Q, -1, ak, true, null);
        } else if (!zLIZ) {
            fragmentMv = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).mv(c19eg, c1026310coX, true, enumC1036160d4Q, -1, null, true);
        } else {
            throw new C1954807lC();
        }
        if (this.LJ == null) {
            this.LJ = (FrameLayout) c19eg.findViewById(R.id.iiv);
        }
        FrameLayout frameLayout = this.LJ;
        if (frameLayout == null) {
            return;
        }
        C786410Ut5.LJZ(0, frameLayout);
        FrameLayout frameLayout2 = this.LJ;
        if (frameLayout2 != null) {
            C19EH c19ehLJIIJ = c19eg.getSupportFragmentManager().LJIIJ();
            EnumC1036160d4Q enumC1036160d4Q2 = EnumC1036160d4Q.FROM_FEED_AD_FLING;
            if (enumC1036160d4Q == enumC1036160d4Q2) {
                i = R.anim.fv;
            } else {
                i = R.anim.fq;
            }
            if (enumC1036160d4Q == enumC1036160d4Q2) {
                i2 = R.anim.g2;
            } else {
                i2 = R.anim.fy;
            }
            c19ehLJIIJ.LJIJJ(i, i2);
            c19ehLJIIJ.LIZJ(frameLayout2.getId(), fragmentMv, "newStyleFullScreenAdLandingPage");
            c19ehLJIIJ.LJIIL();
        }
        LJJIII(fragmentMv, c19eg, strXu);
        this.LIZIZ = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0d4R] */
    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final C1036170d4R LJIJJ(final C19EG c19eg, final Fragment fragment, C1036360d4k c1036360d4k) {
        if (c1036360d4k != null) {
            return new InterfaceC1036350d4j(c19eg, fragment) { // from class: X.0d4R
                public final C19EG LIZ;
                public final Fragment LIZIZ;
                public EnumC1036120d4M LIZJ;

                @Override // X.InterfaceC1036350d4j
                public final void LIZ() {
                }

                @Override // X.InterfaceC1036350d4j
                public final void LIZIZ(float f) {
                    Integer numLIZJ;
                    EnumC1036120d4M enumC1036120d4M = this.LIZJ;
                    if (enumC1036120d4M == null) {
                        enumC1036120d4M = null;
                    }
                    if (enumC1036120d4M == EnumC1036120d4M.SPLIT_SCREEN_NON_IMMERSION && f == 1.0f && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, this.LIZ)) != null) {
                        LIZLLL(numLIZJ.intValue(), Boolean.TRUE, null);
                    }
                }

                @Override // X.InterfaceC1036350d4j
                public final void LIZJ(EnumC1036120d4M enumC1036120d4M) {
                    this.LIZJ = enumC1036120d4M;
                }

                {
                    this.LIZ = c19eg;
                    this.LIZIZ = fragment;
                }

                @Override // X.InterfaceC1036350d4j
                public final void LIZLLL(int i, Boolean bool, Boolean bool2) {
                    DialogFragment dialogFragment;
                    EnumC1036120d4M enumC1036120d4M = this.LIZJ;
                    if (enumC1036120d4M == null) {
                        enumC1036120d4M = null;
                    }
                    if (enumC1036120d4M.isFullScreen()) {
                        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(this.LIZ);
                        tuxImmersionBarLJ.LJIIIZ(i);
                        if (bool != null) {
                            tuxImmersionBarLJ.LIZ(bool.booleanValue());
                        }
                        if (bool2 != null) {
                            tuxImmersionBarLJ.LJIIJ(bool2.booleanValue());
                        }
                        tuxImmersionBarLJ.LIZLLL();
                        return;
                    }
                    Fragment parentFragment = this.LIZIZ.getParentFragment();
                    if (!(parentFragment instanceof TuxSheet) || (dialogFragment = (DialogFragment) parentFragment) == null) {
                        return;
                    }
                    TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(dialogFragment, false);
                    tuxImmersionBarLIZJ.LJIIIZ(i);
                    if (bool != null) {
                        tuxImmersionBarLIZJ.LIZ(bool.booleanValue());
                    }
                    if (bool2 != null) {
                        tuxImmersionBarLIZJ.LJIIJ(bool2.booleanValue());
                    }
                    tuxImmersionBarLIZJ.LIZLLL();
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LJIL(C19EG c19eg, FrameLayout frameLayout, C1026310coX c1026310coX) {
        this.LJFF = frameLayout;
        LJJII().LIZIZ(c19eg, frameLayout, c1026310coX);
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final C1036540d52 LJIIL(C19EG c19eg, Fragment fragment, InterfaceC1036350d4j interfaceC1036350d4j, C1036360d4k c1036360d4k) {
        if (c1036360d4k != null) {
            return new C1036540d52(c19eg, fragment, interfaceC1036350d4j, c1036360d4k);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(X.C19EG r5, X.C1026310coX r6, X.EnumC1036160d4Q r7, X.EnumC1030360cv4 r8) {
        /*
            r4 = this;
            X.0cv8 r1 = new X.0cv8
            int r0 = r5.hashCode()
            r1.<init>(r0)
            X.C1440005kM.LIZ(r1)
            r0 = 0
            r4.LIZIZ = r0
            X.0d4Q r0 = X.EnumC1036160d4Q.FROM_CLICK_BOTTOM_BANNER
            if (r7 != r0) goto L56
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "is_success"
            r3 = 1
            r2.putBoolean(r0, r3)
            java.lang.String r1 = "before_size"
            java.lang.String r0 = "1"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            if (r8 == 0) goto L5c
            int[] r1 = X.C1030350cv3.LIZ
            int r0 = r8.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L59
            r0 = 2
            if (r1 != r0) goto L5c
            java.lang.String r1 = "system_back"
        L36:
            java.lang.String r0 = "action_resize"
            X.C786410Ut5.LJJJI(r0, r1, r2)
            java.lang.String r1 = "screen_size"
            java.lang.String r0 = "0.2"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            if (r6 == 0) goto L57
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
        L48:
            r4.LIZIZ(r2, r0)
            if (r6 == 0) goto L56
            X.0cuy r1 = r4.LJJII()
            android.widget.FrameLayout r0 = r4.LJFF
            r1.LIZIZ(r5, r0, r6)
        L56:
            return
        L57:
            r0 = 0
            goto L48
        L59:
            java.lang.String r1 = "click_close_button"
            goto L36
        L5c:
            java.lang.String r1 = "other"
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.popup.AdLandingPagePopUpImpl.LJIJJLI(X.19EG, X.0coX, X.0d4Q, X.0cv4):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0381  */
    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJ(final int r31, X.C19EG r32, final X.InterfaceC1036270d4b r33, final X.C1026310coX r34, java.lang.String r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.popup.AdLandingPagePopUpImpl.LJIIJ(int, X.19EG, X.0d4b, X.0coX, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(X.C19EG r14, com.ss.android.ugc.aweme.feed.model.AwemeRawAd r15, X.AbstractC343940De4 r16, boolean r17, X.C1025720cna r18) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.popup.AdLandingPagePopUpImpl.LJJ(X.19EG, com.ss.android.ugc.aweme.feed.model.AwemeRawAd, X.0De4, boolean, X.0cna):void");
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final boolean LJIILJJIL(C19EG c19eg, C1026310coX c1026310coX, QuickActionModel quickActionModel, Aweme aweme, int i, String str) {
        Fragment fragmentMv;
        String aid;
        System.currentTimeMillis();
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(c19eg);
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.LJJLL(false);
        String aid2 = null;
        dialogC1389620mGW.LJJLJLI(null);
        dialogC1389620mGW.setCanceledOnTouchOutside(true);
        C0FNV.LIZJ(dialogC1389620mGW);
        System.currentTimeMillis();
        InterfaceC1036270d4b interfaceC1036270d4b = new InterfaceC1036270d4b() { // from class: X.0cv0
            @Override // X.InterfaceC1036270d4b
            public final void Gn(MotionEvent motionEvent) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void LLLFFI(TuxSheet tuxSheet, float f) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void V() {
            }

            @Override // X.InterfaceC1036270d4b
            public final void Yc() {
            }

            @Override // X.InterfaceC1036270d4b
            public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str2, String str3) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str2) {
            }

            @Override // X.InterfaceC1036270d4b
            public final void LLLLIIIILLL(TuxSheet tuxSheet, int i2) {
                if (i2 == 3) {
                    IQuickActionPlayerService iQuickActionPlayerService = (IQuickActionPlayerService) PluggableExtentionKt.pluggableSpi$default(IQuickActionPlayerService.class, false, false, false, 14, null);
                    if (iQuickActionPlayerService != null) {
                        iQuickActionPlayerService.playingVideoPause();
                        return;
                    }
                    return;
                }
                IQuickActionPlayerService iQuickActionPlayerService2 = (IQuickActionPlayerService) PluggableExtentionKt.pluggableSpi$default(IQuickActionPlayerService.class, false, false, false, 14, null);
                if (iQuickActionPlayerService2 == null) {
                    return;
                }
                iQuickActionPlayerService2.playingVideoResume();
            }

            @Override // X.InterfaceC1036270d4b
            public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
                IQuickActionPlayerService iQuickActionPlayerService = (IQuickActionPlayerService) PluggableExtentionKt.pluggableSpi$default(IQuickActionPlayerService.class, false, false, false, 14, null);
                if (iQuickActionPlayerService != null) {
                    iQuickActionPlayerService.playingVideoResume();
                }
                if (tuxSheet != null) {
                    tuxSheet.dismiss();
                }
            }
        };
        String strLIZ = C1017903yT.LIZ();
        strLIZ.toString();
        AdlpExtraModel adlpExtraModel = c1026310coX.getAdlpExtraModel();
        if (adlpExtraModel != null) {
            adlpExtraModel.setMessageSessionId(strLIZ);
        }
        IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
        if (iAdWebUtils != null && (fragmentMv = iAdWebUtils.mv(c19eg, c1026310coX, false, EnumC1036160d4Q.DEFAULT, i, interfaceC1036270d4b, true)) != null) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            Aweme aweme2 = C680080Qly.LIZIZ(c19eg).LLJILJILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current equals: ");
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(Intrinsics.LJFF(aid, aweme.getAid()));
            sbLIZ.append(" current: ");
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            }
            sbLIZ.append(aid2);
            sbLIZ.append(", aweme.aid: ");
            sbLIZ.append(aweme.getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            if (aweme2 != null && !Intrinsics.LJFF(aweme2.getAid(), aweme.getAid())) {
                C0FNV.LIZ(dialogC1389620mGW);
                return false;
            }
            DialogInterfaceOnDismissListenerC1077340e8q dialogInterfaceOnDismissListenerC1077340e8q = new DialogInterfaceOnDismissListenerC1077340e8q(this, fragmentMv, c1026310coX, 1);
            c1026310coX.getTuxSheetConfig().setHideable(false);
            c1026310coX.getTuxSheetConfig().setDraggable(false);
            LJJII().getClass();
            C1030300cuy.LIZ(c19eg, fragmentMv, c1026310coX, dialogInterfaceOnDismissListenerC1077340e8q, "backgroundPopUpAdLandingPage");
            System.currentTimeMillis();
            C0FNV.LIZ(dialogC1389620mGW);
            IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi$default(IShopifySkuCheckoutService.class, false, false, false, 14, null);
            if (iShopifySkuCheckoutService != null) {
                iShopifySkuCheckoutService.LIZIZ(c19eg, aweme, quickActionModel, str, strLIZ, new AwS382S0200000_16(this, c19eg, 26), new AwS382S0200000_16(this, c19eg, 27));
            }
            System.currentTimeMillis();
            LJJIII(fragmentMv, c19eg, (String) C1030440cvC.LIZ.getValue());
            System.currentTimeMillis();
            return true;
        }
        C0FNV.LIZ(dialogC1389620mGW);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService
    public final void LJJI(C19EG c19eg, FrameLayout frameLayout, String str, Aweme aweme, int i, int i2, boolean z) throws Throwable {
        C1017200cZq c1017200cZqLJIL;
        C0KWF.LIZ(c19eg);
        C0IKF.LIZ.getClass();
        C465320IMo.LIZ();
        int iHeight = C19738212Km.LIZ(c19eg).LIZ().height();
        C1028100crQ c1028100crQ = new C1028100crQ(Boolean.FALSE, null, Boolean.FALSE, true, false, Boolean.TRUE, Boolean.FALSE, null, null, null, false, false, false, false, null, Boolean.FALSE);
        InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
        if (interfaceC1008930cMVLJ != null && (c1017200cZqLJIL = interfaceC1008930cMVLJ.LJIL()) != null && c1017200cZqLJIL.LIZ(aweme.getAwemeRawAd()) != null) {
            c1028100crQ.setUseSpecifiedUrl(Boolean.TRUE);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return;
                        }
                    } else {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        AdlpExtraModel adlpExtraModelLIZ = C1028090crP.LIZ(aweme, null, 1, C1026350cob.LIZLLL(Integer.valueOf(i2)), null, null, null, null);
                        Boolean bool = Boolean.TRUE;
                        C1026310coX c1026310coX = new C1026310coX(str, awemeRawAd, adlpExtraModelLIZ, false, new C1025720cna(0.9f, bool, bool, 2, Boolean.FALSE, iHeight - C497820Jfg.LIZJ(c19eg), (int) (((double) iHeight) * 0.7316341829085458d), Boolean.FALSE), c1028100crQ);
                        if (z) {
                            LJIIIIZZ(c1026310coX);
                            LJIL(c19eg, frameLayout, c1026310coX);
                        }
                        LJIIJ(-1, c19eg, null, c1026310coX, null);
                        return;
                    }
                } else {
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    AdlpExtraModel adlpExtraModelLIZ2 = C1028090crP.LIZ(aweme, null, 1, C1026350cob.LIZLLL(Integer.valueOf(i2)), null, null, null, null);
                    Boolean bool2 = Boolean.TRUE;
                    LJIL(c19eg, frameLayout, new C1026310coX(str, awemeRawAd2, adlpExtraModelLIZ2, false, new C1025720cna(0.9f, bool2, bool2, 1, Boolean.FALSE, -1, -1, Boolean.FALSE), c1028100crQ));
                    return;
                }
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            AdlpExtraModel adlpExtraModelLIZ3 = C1028090crP.LIZ(aweme, null, 1, C1026350cob.LIZLLL(Integer.valueOf(i2)), null, null, null, null);
            Boolean bool3 = Boolean.TRUE;
            C1026310coX c1026310coX2 = new C1026310coX(str, awemeRawAd3, adlpExtraModelLIZ3, false, new C1025720cna(0.9f, bool3, bool3, 1, Boolean.FALSE, -1, -1, Boolean.FALSE), c1028100crQ);
            if (z) {
                LJIIIIZZ(c1026310coX2);
                LJIL(c19eg, frameLayout, c1026310coX2);
            }
            LJIIJ(-1, c19eg, null, c1026310coX2, null);
            return;
        }
        c1028100crQ.setShouldBindBothNativeBottomLayout(true);
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        AdlpExtraModel adlpExtraModelLIZ4 = C1028090crP.LIZ(aweme, null, 1, C1026350cob.LIZLLL(Integer.valueOf(i2)), null, null, null, null);
        Boolean bool4 = Boolean.TRUE;
        C1026310coX c1026310coX3 = new C1026310coX(str, awemeRawAd4, adlpExtraModelLIZ4, false, new C1025720cna(0.9f, bool4, bool4, 2, Boolean.FALSE, iHeight - C497820Jfg.LIZJ(c19eg), (int) (((double) iHeight) * 0.7316341829085458d), Boolean.FALSE), c1028100crQ);
        if (z) {
            LJIIIIZZ(c1026310coX3);
        }
        LJIIJ(-1, c19eg, null, c1026310coX3, null);
    }
}
