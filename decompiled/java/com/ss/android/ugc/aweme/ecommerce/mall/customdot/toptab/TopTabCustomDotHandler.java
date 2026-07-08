package com.ss.android.ugc.aweme.ecommerce.mall.customdot.toptab;

import X.AbstractC1769040w8U;
import X.C0DMM;
import X.C0S4U;
import X.C1583900rJs;
import X.C1617940sCm;
import X.C1767960w6k;
import X.C1769140w8e;
import X.C1769160w8g;
import X.C1769270w8r;
import X.C1776090wJr;
import X.C19EG;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1768630w7p;
import X.EnumC1769260w8q;
import X.EnumC1769360w90;
import X.InterfaceC1585190rLx;
import X.InterfaceC1769680w9W;
import X.InterfaceC1769710w9Z;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TopTabCustomDotHandler extends AbstractC1769040w8U {
    public C1617940sCm LJ;
    public final int LJFF = EnumC1768630w7p.TOP_TAB.getValue();

    @Override // X.AbstractC1769040w8U
    public final void LIZ(Map<String, String> map) {
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIILL() {
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIZILJ(Bitmap bitmap, EnumC1769360w90 enumC1769360w90, Function0<Unit> function0) {
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIJJLI() {
    }

    @Override // X.AbstractC1769040w8U
    public final InterfaceC1769710w9Z LIZLLL() {
        return new InterfaceC1769710w9Z() { // from class: X.0w8t
            @Override // X.InterfaceC1769710w9Z
            public final int getHeight() {
                this.LIZ.getClass();
                return ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
            }

            @Override // X.InterfaceC1769710w9Z
            public final int getWidth() {
                this.LIZ.getClass();
                return ((!C303940Bvk.LIZ() || C303950Bvl.LIZ()) && !C14LC.LJIIL) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            }
        };
    }

    @Override // X.AbstractC1769040w8U
    public final String LJ() {
        C19EG c19eg = this.LIZ;
        if (c19eg != null) {
            C1767960w6k.LIZ.getClass();
            String strLIZ = C1767960w6k.LIZ(c19eg, "homepage_mall");
            if (strLIZ != null) {
                return strLIZ;
            }
        }
        return "";
    }

    @Override // X.AbstractC1769040w8U
    public final void LJI() {
        C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            c1617940sCm.LIZ();
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJII() {
        View viewFindViewById;
        C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            c1617940sCm.LIZ();
            View viewLJ = c1617940sCm.LJ();
            if (viewLJ == null || (viewFindViewById = viewLJ.findViewById(R.id.text1)) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIIZ() {
        C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            c1617940sCm.LIZ();
        }
    }

    @Override // X.AbstractC1769040w8U
    public final boolean LJIIL() {
        MainActivityScope mainActivityScopeLIZLLL;
        HomeTabAbility homeTabAbilityLIZ;
        CustomDotAssem customDotAssem = this.LIZJ;
        if (customDotAssem == null || (mainActivityScopeLIZLLL = C0S4U.LIZLLL(customDotAssem)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZLLL)) == null) {
            return false;
        }
        return homeTabAbilityLIZ.ft0("Shop");
    }

    @Override // X.AbstractC1769040w8U
    public final boolean LJIILIIL() {
        C1769270w8r c1769270w8r;
        C1617940sCm c1617940sCm = this.LJ;
        return (c1617940sCm == null || (c1769270w8r = c1617940sCm.LIZJ) == null || !c1769270w8r.LIZJ()) ? false : true;
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIILLIIL() {
        C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            c1617940sCm.LIZLLL();
        }
    }

    @Override // X.AbstractC1769040w8U
    public final int LJFF() {
        return this.LJFF;
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIJ(boolean z) {
        C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            c1617940sCm.LIZIZ(z);
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIJJI(EnumC1769260w8q enumC1769260w8q) {
        C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            C1769270w8r c1769270w8r = c1617940sCm.LIZJ;
            if (c1769270w8r != null) {
                c1769270w8r.LIZIZ(enumC1769260w8q);
            }
            c1617940sCm.LIZJ = null;
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIILJJIL(final CustomDotAssem customDotAssem) {
        customDotAssem.getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: com.ss.android.ugc.aweme.ecommerce.mall.customdot.toptab.TopTabCustomDotHandler$onAttachToAssem$1
            public final C1776090wJr LL;
            public final C1769160w8g LLILLJJLI;
            public final /* synthetic */ TopTabCustomDotHandler LLILZ;

            /* JADX WARN: Type inference failed for: r0v1, types: [X.0w8g] */
            {
                this.LLILZ = this;
                this.LL = new C1776090wJr(this.LLILLL, 1);
                this.LLILLJJLI = new InterfaceC1585190rLx() { // from class: X.0w8g
                    @Override // X.InterfaceC1585190rLx
                    public final void p1(String str, String str2) {
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ShopTab Tooltip TooltipAvoid onTabChange from: ");
                        sbLIZ.append(str);
                        sbLIZ.append(" to: ");
                        sbLIZ.append(str2);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LIZ(strLIZIZ);
                        customDotAssem.m183do().LLIZLLLIL = str2;
                        if (!Intrinsics.LJFF(customDotAssem.m183do().LLIZLLLIL, "HOME")) {
                            customDotAssem.m183do().DQ2(EnumC1769260w8q.OTHER);
                        } else {
                            if (str == null) {
                                return;
                            }
                            customDotAssem.m183do().LQ2(this.LJIIL(), EnumC1768950w8L.SHOP_TAB_SHOW, null, null);
                        }
                    }
                };
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                HomeTabAbility homeTabAbilityLIZ;
                HomeTabAbility homeTabAbilityLIZ2;
                C1617940sCm c1617940sCm;
                HomeTabAbility homeTabAbilityLIZ3;
                HomeTabAbility homeTabAbilityLIZ4;
                if (event == Lifecycle.Event.ON_CREATE) {
                    MainActivityScope mainActivityScopeLIZLLL = C0S4U.LIZLLL(this.LLILLL);
                    if (mainActivityScopeLIZLLL != null && (homeTabAbilityLIZ4 = C0DMM.LIZ(mainActivityScopeLIZLLL)) != null) {
                        homeTabAbilityLIZ4.ao(this.LL);
                    }
                    MainActivityScope mainActivityScopeLIZLLL2 = C0S4U.LIZLLL(this.LLILLL);
                    if (mainActivityScopeLIZLLL2 != null && (homeTabAbilityLIZ3 = C0DMM.LIZ(mainActivityScopeLIZLLL2)) != null) {
                        homeTabAbilityLIZ3.UC1(this.LLILLJJLI);
                    }
                    TopTabCustomDotHandler topTabCustomDotHandler = this.LLILZ;
                    Context context = this.LLILLL.getContext();
                    if (context != null) {
                        c1617940sCm = new C1617940sCm(context);
                    } else {
                        c1617940sCm = null;
                    }
                    topTabCustomDotHandler.LJ = c1617940sCm;
                    return;
                }
                if (event != Lifecycle.Event.ON_DESTROY) {
                    return;
                }
                MainActivityScope mainActivityScopeLIZLLL3 = C0S4U.LIZLLL(this.LLILLL);
                if (mainActivityScopeLIZLLL3 != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZLLL3)) != null) {
                    homeTabAbilityLIZ2.tx0(this.LL);
                }
                MainActivityScope mainActivityScopeLIZLLL4 = C0S4U.LIZLLL(this.LLILLL);
                if (mainActivityScopeLIZLLL4 == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZLLL4)) == null) {
                    return;
                }
                homeTabAbilityLIZ.tx0(this.LLILLJJLI);
            }
        });
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIJ(int i) {
        String strValueOf;
        C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            View viewLJFF = c1617940sCm.LJFF();
            if (viewLJFF != null) {
                C786410Ut5.LJLLLLLL(8, viewLJFF);
            }
            TuxTextView tuxTextViewLJI = c1617940sCm.LJI();
            if (tuxTextViewLJI != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJI, 8);
            }
            if (i > 99) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(99);
                sbLIZ.append('+');
                strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                i = 99;
            } else {
                strValueOf = String.valueOf(i);
            }
            if (i <= 0) {
                TuxTextView tuxTextViewLIZJ = c1617940sCm.LIZJ();
                if (tuxTextViewLIZJ != null) {
                    C786410Ut5.LLLLZLL(tuxTextViewLIZJ, 8);
                }
                c1617940sCm.LIZIZ = 0;
                return;
            }
            TuxTextView tuxTextViewLIZJ2 = c1617940sCm.LIZJ();
            if (tuxTextViewLIZJ2 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLIZJ2, 0);
            }
            TuxTextView tuxTextViewLIZJ3 = c1617940sCm.LIZJ();
            if (tuxTextViewLIZJ3 != null) {
                tuxTextViewLIZJ3.setText(strValueOf);
            }
            c1617940sCm.LIZIZ = i;
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIIIIZZ(EnumC1769360w90 enumC1769360w90, Function0 function0) {
        ((AwS427S0200000_26) function0).invoke();
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIJI(Long l, String str) {
        C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            View viewLJFF = c1617940sCm.LJFF();
            if (viewLJFF != null) {
                C786410Ut5.LJLLLLLL(8, viewLJFF);
            }
            TuxTextView tuxTextViewLIZJ = c1617940sCm.LIZJ();
            if (tuxTextViewLIZJ != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLIZJ, 8);
            }
            TuxTextView tuxTextViewLJI = c1617940sCm.LJI();
            if (tuxTextViewLJI != null) {
                tuxTextViewLJI.clearAnimation();
            }
            TuxTextView tuxTextViewLJI2 = c1617940sCm.LJI();
            if (tuxTextViewLJI2 != null) {
                tuxTextViewLJI2.setText(str);
            }
            TuxTextView tuxTextViewLJI3 = c1617940sCm.LJI();
            if (tuxTextViewLJI3 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewLJI3, 0);
            }
            c1617940sCm.LIZLLL = true;
            if (l != null) {
                long jLongValue = l.longValue();
                C1583900rJs c1583900rJs = C1583900rJs.LIZ;
                Context context = c1617940sCm.LIZ;
                AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c1617940sCm, 1755);
                c1583900rJs.getClass();
                C1583900rJs.LIZJ(context, jLongValue, awS568S0100000_24);
            }
        }
    }

    @Override // X.AbstractC1769040w8U
    public final void LJIJJ(final C1769140w8e c1769140w8e, final AwS427S0200000_26 awS427S0200000_26, final AwS392S0200000_26 awS392S0200000_26, final AwS605S0100000_26 awS605S0100000_26) {
        View viewFindViewById;
        final C1617940sCm c1617940sCm = this.LJ;
        if (c1617940sCm != null) {
            View viewLJ = c1617940sCm.LJ();
            if (viewLJ != null && (viewFindViewById = viewLJ.findViewById(R.id.text1)) != null) {
                c1617940sCm.LIZJ = new C1769270w8r(EnumC1768630w7p.TOP_TAB.getValue(), c1617940sCm.LIZ, viewFindViewById);
            }
            C1769270w8r c1769270w8r = c1617940sCm.LIZJ;
            if (c1769270w8r != null) {
                c1769270w8r.LIZ(new InterfaceC1769680w9W() { // from class: X.0w8V
                    @Override // X.InterfaceC1769680w9W
                    public final void LIZ() {
                        Function0<Unit> function0 = awS427S0200000_26;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }

                    @Override // X.InterfaceC1769680w9W
                    public final void LIZJ() {
                        TopTabAbility topTabAbilityLIZ;
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("ShopTab Tooltip Click");
                        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                        Map<String, ? extends Object> mapLJ = null;
                        if (iMallLandingPerfTracker != null) {
                            iMallLandingPerfTracker.onClickMallEntry("bubble", null);
                        }
                        C1767860w6a c1767860w6a = C1767860w6a.LIZ;
                        String str = c1769140w8e.LJIIJ;
                        c1767860w6a.getClass();
                        BcmParams bcmParamsLIZJ = C1767860w6a.LIZJ(str);
                        IEcUgBtmService iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
                        if (iEcUgBtmService != null) {
                            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c1617940sCm.LIZ);
                            EnumC1768230w7B enumC1768230w7B = EnumC1768230w7B.BUBBLE;
                            c1767860w6a.getClass();
                            mapLJ = iEcUgBtmService.LJ(C1767860w6a.LIZIZ(c19egLIZIZ, false, enumC1768230w7B, bcmParamsLIZJ));
                        }
                        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(c1617940sCm.LIZ);
                        if (c19egLIZIZ2 != null) {
                            Intent intent = c19egLIZIZ2.getIntent();
                            if (intent != null) {
                                intent.putExtra("extra_shop_tab_mock_click", 1);
                            }
                            MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ2);
                            if (mainActivityScopeLIZJ != null && (topTabAbilityLIZ = C0S4T.LIZ(mainActivityScopeLIZJ)) != null) {
                                topTabAbilityLIZ.QQ0();
                            }
                        }
                        Function1<Map<String, ? extends Object>, Unit> function1 = awS605S0100000_26;
                        if (function1 != null) {
                            function1.invoke(mapLJ);
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
            C1769270w8r c1769270w8r2 = c1617940sCm.LIZJ;
            if (c1769270w8r2 != null) {
                c1769270w8r2.LIZLLL(c1769140w8e);
            }
        }
    }
}
