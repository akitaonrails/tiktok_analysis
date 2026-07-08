package com.ss.android.ugc.aweme.main.assems;

import X.C09R3;
import X.C0QSJ;
import X.C1058560deY;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559110qft;
import X.C1559540qga;
import X.C1561720qk6;
import X.C1584320rKY;
import X.C1590810rV1;
import X.C1591530rWB;
import X.C1591880rWk;
import X.C19EG;
import X.C2217381BqS;
import X.C296200BjG;
import X.C297720Bli;
import X.C343710Ddh;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1570580qyO;
import X.EnumC1589910rTZ;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1570710qyb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.IHomePageExService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class BackRefreshStrategyAssem extends BaseMainContainerAssem implements BackRefreshStrategyAbility, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public InterfaceC1570710qyb LL;
    public final BackRefreshStrategyAssem LLILLJJLI = this;
    public volatile MainBusinessAbility LLILLL;
    public volatile HomeViewPagerAbility LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public C0QSJ LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BackRefreshStrategyAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BackRefreshStrategyAssem.class, "homeViewPagerAbility", "getHomeViewPagerAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -700243652) {
            return null;
        }
        return this;
    }

    public final C0QSJ bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLILZLL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLILZIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLILZIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLILZLL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onAssemLoaded() {
        super.onAssemLoaded();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            InterfaceC1570710qyb interfaceC1570710qybLJJII = C1591880rWk.LIZIZ.LJJII(c19egLIZ);
            interfaceC1570710qybLJJII.onCreate();
            this.LL = interfaceC1570710qybLJJII;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onBackPress() {
        InterfaceC1570710qyb interfaceC1570710qyb;
        C19EG c19egLIZ;
        String strCQ2;
        MainBusinessAbility mainBusinessAbilityLIZ;
        TabChangeManager tabChangeManagerLIZ;
        Fragment fragmentBQ2;
        HomeViewPagerAbility homeViewPagerAbility;
        EnumC1570580qyO enumC1570580qyOLJIILLIIL;
        TabChangeManager tabChangeManagerLIZ2;
        Fragment fragmentBQ22;
        EnumC1570580qyO enumC1570580qyOLJIILLIIL2;
        TabChangeManager tabChangeManagerLIZ3;
        super.onBackPress();
        InterfaceC1570710qyb interfaceC1570710qyb2 = this.LL;
        if (interfaceC1570710qyb2 != null && !interfaceC1570710qyb2.onBackPressed() && (interfaceC1570710qyb = this.LL) != null && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
            if (c19egLIZ2 == null || (tabChangeManagerLIZ3 = C343710Ddh.LIZ(c19egLIZ2)) == null || (strCQ2 = tabChangeManagerLIZ3.CQ2()) == null) {
                strCQ2 = "";
            }
            interfaceC1570710qyb.LIZIZ(strCQ2);
            if (interfaceC1570710qyb.LIZ()) {
                interfaceC1570710qyb.LIZLLL();
            } else {
                MainBusinessAbility mainBusinessAbilityLIZ2 = C1559110qft.LIZ(c19egLIZ);
                if ((mainBusinessAbilityLIZ2 == null || !mainBusinessAbilityLIZ2.Q6()) && ((mainBusinessAbilityLIZ = C1559110qft.LIZ(c19egLIZ)) == null || !mainBusinessAbilityLIZ.Wm())) {
                    if (C1559540qga.LIZIZ(c19egLIZ)) {
                        C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                        if (c19egLIZ3 != null && (tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZ3)) != null && (fragmentBQ2 = tabChangeManagerLIZ.BQ2()) != null && (fragmentBQ2 instanceof MainFragment)) {
                            MainFragment mainFragment = (MainFragment) fragmentBQ2;
                            if (mainFragment.Ik()) {
                                C1590810rV1.LIZJ(c19egLIZ, "homepage_hot");
                            } else {
                                if (C297720Bli.LIZ()) {
                                    homeViewPagerAbility = this.LLILZ;
                                    if (homeViewPagerAbility == null) {
                                        synchronized (this) {
                                            homeViewPagerAbility = this.LLILZ;
                                            if (homeViewPagerAbility == null) {
                                                C0QSJ c0qsjBo = bo();
                                                homeViewPagerAbility = c0qsjBo != null ? (HomeViewPagerAbility) c0qsjBo.getAbility(HomeViewPagerAbility.class) : null;
                                                this.LLILZ = homeViewPagerAbility;
                                            }
                                        }
                                    }
                                } else {
                                    InterfaceC665370Q7z interfaceC665370Q7z = mainFragment.LLJILJIL;
                                    homeViewPagerAbility = interfaceC665370Q7z != null ? (HomeViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7z, HomeViewPagerAbility.class, null) : null;
                                }
                                if (mainFragment.Vp()) {
                                    C1590810rV1.LIZJ(c19egLIZ, "homepage_follow");
                                } else if (C1591530rWB.LIZIZ.N7(mainFragment.f3())) {
                                    C1590810rV1.LIZJ(c19egLIZ, mainFragment.f3());
                                } else if (mainFragment.tQ()) {
                                    C1590810rV1.LIZJ(c19egLIZ, "homepage_popular");
                                } else if (mainFragment.q8()) {
                                    C1590810rV1.LIZJ(c19egLIZ, "homepage_friends");
                                } else if (mainFragment.UH()) {
                                    C1590810rV1.LIZJ(c19egLIZ, "homepage_nearby");
                                } else if (mainFragment.lm()) {
                                    C1590810rV1.LIZJ(c19egLIZ, "homepage_explore");
                                } else if (mainFragment.Fp()) {
                                    C1590810rV1.LIZJ(c19egLIZ, "homepage_series");
                                } else {
                                    C1590810rV1.LIZJ(c19egLIZ, homeViewPagerAbility != null ? homeViewPagerAbility.RD0(true) : null);
                                }
                                if (homeViewPagerAbility != null) {
                                    homeViewPagerAbility.Ti(3);
                                }
                                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                                String value = EnumC1589910rTZ.GOBACK_ICON.getValue();
                                c1584320rKY.getClass();
                                C1584320rKY.LJ = value;
                                IHomePageExService iHomePageExService = (IHomePageExService) PluggableExtentionKt.pluggableSpi$default(IHomePageExService.class, false, false, false, 14, null);
                                if (iHomePageExService == null || (enumC1570580qyOLJIILLIIL = iHomePageExService.LJIILLIIL()) == null) {
                                    enumC1570580qyOLJIILLIIL = EnumC1570580qyO.FOR_YOU;
                                }
                                mainFragment.bP(enumC1570580qyOLJIILLIIL.getValue());
                            }
                            IMFFeedAbility iMFFeedAbilityLIZ = C1561720qk6.LIZ(fragmentBQ2);
                            if (iMFFeedAbilityLIZ != null) {
                                iMFFeedAbilityLIZ.Vj0();
                            }
                        }
                    } else {
                        C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
                        EnumC1589910rTZ enumC1589910rTZ = EnumC1589910rTZ.GOBACK_ICON;
                        String value2 = enumC1589910rTZ.getValue();
                        c1584320rKY2.getClass();
                        C1584320rKY.LJ = value2;
                        m256do("HOME", "performClickTab");
                        C19EG c19egLIZ4 = C724240Sb0.LIZ(this);
                        if (c19egLIZ4 != null && (tabChangeManagerLIZ2 = C343710Ddh.LIZ(c19egLIZ4)) != null && (fragmentBQ22 = tabChangeManagerLIZ2.BQ2()) != null && (fragmentBQ22 instanceof MainFragment)) {
                            if (C1591880rWk.LIZIZ.LJIILIIL(c19egLIZ)) {
                                Bundle bundle = new Bundle();
                                C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
                                Hox.LLJILJIL.LIZ(c19egLIZ).TQ2(bundle, "HOME", false);
                            }
                            MainFragment mainFragment2 = (MainFragment) fragmentBQ22;
                            if (!mainFragment2.Ik()) {
                                C1584320rKY.LJ = enumC1589910rTZ.getValue();
                                IHomePageExService iHomePageExService2 = (IHomePageExService) PluggableExtentionKt.pluggableSpi$default(IHomePageExService.class, false, false, false, 14, null);
                                if (iHomePageExService2 == null || (enumC1570580qyOLJIILLIIL2 = iHomePageExService2.LJIILLIIL()) == null) {
                                    enumC1570580qyOLJIILLIIL2 = EnumC1570580qyO.FOR_YOU;
                                }
                                mainFragment2.bP(enumC1570580qyOLJIILLIIL2.getValue());
                            }
                            IMFFeedAbility iMFFeedAbilityLIZ2 = C1561720qk6.LIZ(fragmentBQ22);
                            if (iMFFeedAbilityLIZ2 != null) {
                                iMFFeedAbilityLIZ2.Vj0();
                            }
                        }
                    }
                }
            }
        }
        m256do(Boolean.FALSE, "exitGuideView");
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility
    public final InterfaceC1570710qyb getMainHelper() {
        return this.LL;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LLILLJJLI, BackRefreshStrategyAbility.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LLILLJJLI, BackRefreshStrategyAbility.class);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m256do(Object obj, String str) {
        MainBusinessAbility mainBusinessAbilityLIZJ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        MainBusinessAbility mainBusinessAbility = null;
        if (C297720Bli.LIZ()) {
            mainBusinessAbilityLIZJ = this.LLILLL;
            if (mainBusinessAbilityLIZJ == null) {
                synchronized (this) {
                    mainBusinessAbilityLIZJ = this.LLILLL;
                    if (mainBusinessAbilityLIZJ == null) {
                        C0QSJ c0qsjBo = bo();
                        if (c0qsjBo != null) {
                            mainBusinessAbility = (MainBusinessAbility) c0qsjBo.getAbility(MainBusinessAbility.class);
                        }
                        this.LLILLL = mainBusinessAbility;
                        mainBusinessAbilityLIZJ = mainBusinessAbility;
                    }
                }
            }
            mainBusinessAbilityLIZJ.k62(c19egLIZ, str, obj);
        }
        mainBusinessAbilityLIZJ = C1058560deY.LIZJ(C1558360qeg.LJI(c19egLIZ, null));
        if (mainBusinessAbilityLIZJ == null) {
            return;
        }
        mainBusinessAbilityLIZJ.k62(c19egLIZ, str, obj);
    }
}
