package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab;

import X.AbstractC1769040w8U;
import X.AbstractC2273051Dy3;
import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C1018703yb;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C14LC;
import X.C1583900rJs;
import X.C1767960w6k;
import X.C1769140w8e;
import X.C1769270w8r;
import X.C1769350w8z;
import X.C1776090wJr;
import X.C189200o6;
import X.C1954807lC;
import X.C19EG;
import X.C2273081Dy6;
import X.C2273091Dy7;
import X.C2344809Gs;
import X.C303940Bvk;
import X.C303950Bvl;
import X.C343710Ddh;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.EnumC1768630w7p;
import X.EnumC1768950w8L;
import X.EnumC1769260w8q;
import X.EnumC1769360w90;
import X.InterfaceC1331910klR;
import X.InterfaceC1769680w9W;
import X.InterfaceC1769710w9Z;
import X.InterfaceC2273061Dy4;
import Y.ALAdapterS28S0100000_35;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.libra.EcShopTabIconConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS175S1100000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BottomTabCustomDotHandler extends AbstractC1769040w8U {
    public C1769270w8r LJI;
    public AnonymousClass0956 LJII;
    public final List<AbstractC2273051Dy3> LJ = new ArrayList();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 622));
    public final int LJIIIIZZ = EnumC1768630w7p.BOTTOM_TAB.getValue();

    @Override // X.AbstractC1769040w8U
    public final void LJIIJ(boolean z) {
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIJI(Long l, String str) {
    }

    @Override // X.AbstractC1769040w8U
    public final InterfaceC1769710w9Z LIZLLL() {
        return new InterfaceC1769710w9Z() { // from class: X.0w9M
            @Override // X.InterfaceC1769710w9Z
            public final int getHeight() {
                return this.LIZ.LJIL();
            }

            @Override // X.InterfaceC1769710w9Z
            public final int getWidth() {
                return this.LIZ.LJJ();
            }
        };
    }

    @Override // X.AbstractC1769040w8U
    public final String LJ() {
        C19EG c19eg = this.LIZ;
        if (c19eg != null) {
            C1767960w6k.LIZ.getClass();
            String strLIZ = C1767960w6k.LIZ(c19eg, "homepage_shop_mall");
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        return "";
    }

    @Override // X.AbstractC1769040w8U
    public final boolean LJIIL() {
        C19EG c19eg = this.LIZ;
        if (c19eg != null) {
            return Intrinsics.LJFF("SHOP_MALL", C343710Ddh.LIZ(c19eg).CQ2());
        }
        return false;
    }

    @Override // X.AbstractC1769040w8U
    public final boolean LJIILIIL() {
        C1769270w8r c1769270w8r = this.LJI;
        return c1769270w8r != null && c1769270w8r.LIZJ();
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIJJLI() {
        EcShopTabIconConfigSettings.IconUrlModel iconUrlModel;
        String str;
        Object c098200Yq;
        C1583900rJs c1583900rJs = C1583900rJs.LIZ;
        AwS623S0100000_9 awS623S0100000_9 = new AwS623S0100000_9(this, 18);
        AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(this, 81);
        c1583900rJs.getClass();
        EcShopTabIconConfigSettings.TimeRangeModel timeRangeModelLIZ = C1583900rJs.LIZ(false);
        if (timeRangeModelLIZ == null || (iconUrlModel = timeRangeModelLIZ.iconUrl) == null || (str = iconUrlModel.darkModeIconUrl) == null) {
            return;
        }
        try {
            final AwS123S1100000_9 awS123S1100000_9 = new AwS123S1100000_9(awS623S0100000_9, str, 5);
            final AwS175S1100000_26 awS175S1100000_26 = new AwS175S1100000_26(str, awS588S0100000_9, 8);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LIZLLL.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LIZLLL.LJJII(new InterfaceC1331910klR() { // from class: X.0w93
                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                    awS175S1100000_26.invoke();
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap != null) {
                        awS123S1100000_9.invoke(bitmap);
                    }
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    awS175S1100000_26.invoke();
                }
            });
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    public final int LJIL() {
        return ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
    }

    public final int LJJ() {
        return ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    }

    @Override // X.AbstractC1769040w8U
    public final void LJI() {
        BottomTabAbility bottomTabAbilityLIZIZ = LIZIZ();
        if (bottomTabAbilityLIZIZ != null) {
            bottomTabAbilityLIZIZ.z2("SHOP_MALL");
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJII() {
        BottomTabAbility bottomTabAbilityLIZIZ = LIZIZ();
        if (bottomTabAbilityLIZIZ != null) {
            bottomTabAbilityLIZIZ.xj1();
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIIZ() {
        BottomTabAbility bottomTabAbilityLIZIZ = LIZIZ();
        if (bottomTabAbilityLIZIZ != null) {
            bottomTabAbilityLIZIZ.m("SHOP_MALL");
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIILL() {
        BottomTabAbility bottomTabAbilityLIZIZ = LIZIZ();
        if (bottomTabAbilityLIZIZ != null) {
            bottomTabAbilityLIZIZ.vM1();
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIILLIIL() {
        BottomTabAbility bottomTabAbilityLIZIZ = LIZIZ();
        if (bottomTabAbilityLIZIZ != null) {
            bottomTabAbilityLIZIZ.A1("SHOP_MALL");
        }
    }

    @Override // X.AbstractC1769040w8U
    public final int LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1769040w8U
    public final void LIZ(Map<String, String> map) {
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJII = null;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem != null) {
            CustomDotVMV2 customDotVMV2M183do = customDotAssem.m183do();
            if (customDotVMV2M183do.LLJJIJIIJIL) {
                boolean zLJIIL = false;
                customDotVMV2M183do.LLJJIJIIJIL = false;
                try {
                    C1018703yb.LIZIZ("rd_tiktokec_shop_tab_icon", map);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                AbstractC1769040w8U abstractC1769040w8U = customDotVMV2M183do.LLJJI;
                if (abstractC1769040w8U != null) {
                    zLJIIL = abstractC1769040w8U.LJIIL();
                }
                customDotVMV2M183do.HQ2(zLJIIL, EnumC1768950w8L.COLD_START, null, null);
            }
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIJJI(EnumC1769260w8q enumC1769260w8q) {
        C1769270w8r c1769270w8r = this.LJI;
        if (c1769270w8r != null) {
            c1769270w8r.LIZIZ(enumC1769260w8q);
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIILJJIL(final CustomDotAssem customDotAssem) {
        C2344809Gs.LJFF("saf-init", "BottomTabCustomDotHandler onAttachToAssem");
        System.err.println("saf-init: BottomTabCustomDotHandler onAttachToAssem");
        customDotAssem.getLifecycle().addObserver(new LifecycleEventObserver(customDotAssem, this) { // from class: com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler$onAttachToAssem$1
            public final C1776090wJr LL;
            public final /* synthetic */ BottomTabCustomDotHandler LLILLJJLI;

            {
                this.LLILLJJLI = this;
                this.LL = new C1776090wJr(customDotAssem, 0);
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_CREATE) {
                    HomeTabAbility homeTabAbilityLIZJ = this.LLILLJJLI.LIZJ();
                    if (homeTabAbilityLIZJ != null) {
                        homeTabAbilityLIZJ.UC1(this.LL);
                        return;
                    }
                    return;
                }
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                HomeTabAbility homeTabAbilityLIZJ2 = this.LLILLJJLI.LIZJ();
                if (homeTabAbilityLIZJ2 != null) {
                    homeTabAbilityLIZJ2.Ik0(this.LL);
                }
                Iterator<AbstractC2273051Dy3> it2 = this.LLILLJJLI.LJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                ((ArrayList) this.LLILLJJLI.LJ).clear();
            }
        });
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIJ(int i) {
        BottomTabAbility bottomTabAbilityLIZIZ = LIZIZ();
        if (bottomTabAbilityLIZIZ != null) {
            bottomTabAbilityLIZIZ.ta(i, "SHOP_MALL");
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIIIZZ(EnumC1769360w90 enumC1769360w90, final Function0 function0) {
        final AbstractC2273051Dy3 c2273081Dy6;
        int i = C1769350w8z.LIZ[enumC1769360w90.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c2273081Dy6 = new AbstractC2273051Dy3() { // from class: X.1Dy0
                    public View LIZIZ;
                    public View LIZJ;

                    @Override // X.AbstractC2273051Dy3
                    public final void LIZ() {
                        View view = this.LIZIZ;
                        if (view != null) {
                            view.clearAnimation();
                        }
                        View view2 = this.LIZJ;
                        if (view2 != null) {
                            view2.clearAnimation();
                        }
                    }

                    @Override // X.AbstractC2273051Dy3
                    public final void LIZLLL(View view, View view2) {
                        this.LIZIZ = view;
                        this.LIZJ = view2;
                        AnimatorSet animatorSetLIZ = C0TKQ.LIZ(view2, false, null, new AwS436S0200000_35(view2, view, 70));
                        AnimatorSet animatorSetLIZ2 = C0TKQ.LIZ(view, true, null, null);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(animatorSetLIZ, animatorSetLIZ2);
                        animatorSet.addListener(new ALAdapterS28S0100000_35(this, 3));
                        animatorSet.start();
                    }
                };
            } else {
                throw new C1954807lC();
            }
        } else {
            c2273081Dy6 = new C2273081Dy6();
        }
        InterfaceC2273061Dy4 interfaceC2273061Dy4 = new InterfaceC2273061Dy4() { // from class: X.0w98
            @Override // X.InterfaceC2273061Dy4
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2273061Dy4
            public final void LIZ() {
                function0.invoke();
                ((ArrayList) this.LJ).remove(c2273081Dy6);
            }
        };
        if (c2273081Dy6.LIZ == null) {
            c2273081Dy6.LIZ = new ArrayList();
        }
        List<InterfaceC2273061Dy4> list = c2273081Dy6.LIZ;
        if (list != null) {
            ((ArrayList) list).add(interfaceC2273061Dy4);
        }
        ((ArrayList) this.LJ).add(c2273081Dy6);
        BottomTabAbility bottomTabAbilityLIZIZ = LIZIZ();
        if (bottomTabAbilityLIZIZ != null) {
            bottomTabAbilityLIZIZ.Ji1(c2273081Dy6);
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIZILJ(Bitmap bitmap, EnumC1769360w90 enumC1769360w90, final Function0<Unit> function0) {
        final AbstractC2273051Dy3 c2273091Dy7;
        Resources resources;
        C19EG c19egLIZ;
        int i = C1769350w8z.LIZ[enumC1769360w90.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c2273091Dy7 = new AbstractC2273051Dy3() { // from class: X.1Dy1
                    public static final /* synthetic */ int LIZLLL = 0;
                    public View LIZIZ;
                    public View LIZJ;

                    static {
                        new C0TKQ();
                    }

                    @Override // X.AbstractC2273051Dy3
                    public final void LIZ() {
                        View view = this.LIZIZ;
                        if (view != null) {
                            view.clearAnimation();
                        }
                        View view2 = this.LIZJ;
                        if (view2 != null) {
                            view2.clearAnimation();
                        }
                    }

                    @Override // X.AbstractC2273051Dy3
                    public final void LIZLLL(View view, View view2) {
                        this.LIZIZ = view;
                        this.LIZJ = view2;
                        AnimatorSet animatorSetLIZ = C0TKQ.LIZ(view, false, new AwS436S0200000_35(view, view2, 71), new AwS436S0200000_35(view, view2, 72));
                        AnimatorSet animatorSetLIZ2 = C0TKQ.LIZ(view2, true, null, null);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(animatorSetLIZ, animatorSetLIZ2);
                        animatorSet.addListener(new ALAdapterS28S0100000_35(this, 4));
                        animatorSet.start();
                    }
                };
            } else {
                throw new C1954807lC();
            }
        } else {
            c2273091Dy7 = new C2273091Dy7();
        }
        InterfaceC2273061Dy4 interfaceC2273061Dy4 = new InterfaceC2273061Dy4() { // from class: X.0w91
            @Override // X.InterfaceC2273061Dy4
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC2273061Dy4
            public final void LIZ() {
                function0.invoke();
                ((ArrayList) this.LJ).remove(c2273091Dy7);
            }
        };
        if (c2273091Dy7.LIZ == null) {
            c2273091Dy7.LIZ = new ArrayList();
        }
        List<InterfaceC2273061Dy4> list = c2273091Dy7.LIZ;
        if (list != null) {
            ((ArrayList) list).add(interfaceC2273061Dy4);
        }
        ((ArrayList) this.LJ).add(c2273091Dy7);
        BottomTabAbility bottomTabAbilityLIZIZ = LIZIZ();
        if (bottomTabAbilityLIZIZ != null) {
            CustomDotAssem customDotAssem = this.LIZJ;
            if (customDotAssem != null && (c19egLIZ = C724240Sb0.LIZ(customDotAssem)) != null) {
                resources = c19egLIZ.getResources();
            } else {
                resources = null;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LJJ(), LJIL());
            layoutParams.gravity = 49;
            bottomTabAbilityLIZIZ.hw2(bitmapDrawable, c2273091Dy7, layoutParams, null);
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIJJ(final C1769140w8e c1769140w8e, final AwS427S0200000_26 awS427S0200000_26, final AwS392S0200000_26 awS392S0200000_26, final AwS605S0100000_26 awS605S0100000_26) {
        View view;
        Context context = this.LIZIZ;
        if (context != null && (view = (View) this.LJFF.getValue()) != null) {
            this.LJI = new C1769270w8r(this.LJIIIIZZ, context, view);
        }
        C1769270w8r c1769270w8r = this.LJI;
        if (c1769270w8r != null) {
            c1769270w8r.LIZ(new InterfaceC1769680w9W() { // from class: X.0w8W
                @Override // X.InterfaceC1769680w9W
                public final void LIZ() {
                    Function0<Unit> function0 = awS427S0200000_26;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // X.InterfaceC1769680w9W
                public final void LIZJ() {
                    AbstractC1591090rVT abstractC1591090rVTHQ1;
                    C1767860w6a c1767860w6a = C1767860w6a.LIZ;
                    String str = c1769140w8e.LJIIJ;
                    c1767860w6a.getClass();
                    BcmParams bcmParamsLIZJ = C1767860w6a.LIZJ(str);
                    BottomTabCustomDotHandler bottomTabCustomDotHandler = this;
                    C19EG c19eg = bottomTabCustomDotHandler.LIZ;
                    if (c19eg != null) {
                        Function1<Map<String, ? extends Object>, Unit> function1 = awS605S0100000_26;
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("ShopTab Tooltip Click");
                        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                        Map<String, Object> mapLJ = null;
                        if (iMallLandingPerfTracker != null) {
                            iMallLandingPerfTracker.onClickMallEntry("bubble", null);
                        }
                        IEcUgBtmService iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
                        if (iEcUgBtmService != null) {
                            EnumC1768230w7B enumC1768230w7B = EnumC1768230w7B.BUBBLE;
                            c1767860w6a.getClass();
                            mapLJ = iEcUgBtmService.LJ(C1767860w6a.LIZIZ(c19eg, true, enumC1768230w7B, bcmParamsLIZJ));
                        }
                        HomeTabAbility homeTabAbilityLIZJ = bottomTabCustomDotHandler.LIZJ();
                        if (homeTabAbilityLIZJ != null && (abstractC1591090rVTHQ1 = homeTabAbilityLIZJ.hQ1(c19eg)) != null) {
                            abstractC1591090rVTHQ1.LJJIIZI("SHOP_MALL");
                        }
                        if (function1 != null) {
                            function1.invoke(mapLJ);
                        }
                    }
                }

                @Override // X.InterfaceC1769680w9W
                public final void LIZIZ(EnumC1769260w8q enumC1769260w8q) {
                    Function1<EnumC1769260w8q, Unit> function1 = awS392S0200000_26;
                    if (function1 != null) {
                        function1.invoke(enumC1769260w8q);
                    }
                }
            });
        }
        C1769270w8r c1769270w8r2 = this.LJI;
        if (c1769270w8r2 != null) {
            c1769270w8r2.LIZLLL(c1769140w8e);
        }
    }
}
