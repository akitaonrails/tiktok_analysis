package com.ss.android.ugc.aweme.tab.lifecycle;

import X.AbstractC813200VvC;
import X.C01GW;
import X.C0CUL;
import X.C0DMM;
import X.C0S4U;
import X.C1558520qew;
import X.C1561720qk6;
import X.C1571620r04;
import X.C1571630r05;
import X.C1586120rNS;
import X.C1935307i3;
import X.C19EG;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.C799570VYd;
import X.InterfaceC1554640qYg;
import X.InterfaceC1571610r03;
import X.InterfaceC494301wD;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hox.Hox;
import com.bytedance.scene.Scene;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.TabLifecycleAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.Unit;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class TabLifecycleAssem extends BaseMainContainerAssem implements TabLifecycleAbility, InterfaceC1554640qYg {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1202));
    public final C01GW LLILLJJLI = C1935307i3.LIZ(new AwS568S0100000_24(this, 1201));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1902566840) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.TabLifecycleAbility
    public final void LO0(Fragment fragment) {
        String str;
        String str2;
        C1571620r04 c1571620r04;
        C1571630r05 c1571630r05 = C1571630r05.LIZ;
        this.LLILLJJLI.getValue();
        synchronized (c1571630r05) {
            C1571620r04 c1571620r042 = C1571630r05.LJ;
            if (c1571620r042 != null) {
                str = c1571620r042.LIZJ;
            } else {
                str = null;
            }
            C1586120rNS c1586120rNS = C1586120rNS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SavedStateHolder consumeTopTag: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c1586120rNS.getClass();
            if (str != null && (c1571620r04 = C1571630r05.LJ) != null) {
                c1571620r04.LIZJ = null;
            }
        }
        C1571620r04 c1571620r043 = C1571630r05.LJ;
        if (c1571620r043 != null) {
            C1571620r04 c1571620r044 = C1571630r05.LIZIZ.get(Integer.valueOf(c1571620r043.LIZ));
            if (c1571620r044 != null && (str2 = c1571620r044.LIZJ) != null) {
                bo(str2, c1571620r044, fragment.getChildFragmentManager());
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.TabLifecycleAbility
    public final void W31(Fragment fragment) {
        String str;
        C1571620r04 c1571620r04;
        C1571630r05 c1571630r05 = C1571630r05.LIZ;
        this.LLILLJJLI.getValue();
        synchronized (c1571630r05) {
            C1571620r04 c1571620r042 = C1571630r05.LJ;
            if (c1571620r042 != null) {
                str = c1571620r042.LIZIZ;
            } else {
                str = null;
            }
            C1586120rNS c1586120rNS = C1586120rNS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SavedStateHolder consumeBottomTag: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c1586120rNS.getClass();
            if (str != null && (c1571620r04 = C1571630r05.LJ) != null) {
                c1571620r04.LIZIZ = null;
            }
        }
        C1571620r04 c1571620r043 = C1571630r05.LJ;
        if (c1571620r043 != null) {
            C1571620r04 c1571620r044 = C1571630r05.LIZIZ.get(Integer.valueOf(c1571620r043.LIZ));
            if (c1571620r044 != null) {
                String str2 = c1571620r044.LIZJ;
                String str3 = c1571620r044.LIZIZ;
                if (str2 == null && str3 != null) {
                    bo(str3, c1571620r044, fragment.getChildFragmentManager());
                }
            }
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m326do(final C1571620r04 c1571620r04, String str) {
        final HomeTabAbility homeTabAbilityLIZ;
        Hox hoxHC0;
        Fragment fragmentKi;
        IMFShopAbility iMFShopAbilityLIZLLL;
        MainActivityScope mainActivityScopeLIZJ;
        C1571630r05 c1571630r05 = C1571630r05.LIZ;
        C19EG c19eg = (C19EG) this.LLILLJJLI.getValue();
        c1571630r05.getClass();
        if (c19eg != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null) {
            homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ);
        } else {
            homeTabAbilityLIZ = null;
        }
        final String str2 = c1571620r04.LIZJ;
        final String str3 = c1571620r04.LIZIZ;
        C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new Runnable() { // from class: X.0r07
            public final void LIZ() {
                HomeTabAbility homeTabAbility = homeTabAbilityLIZ;
                String strCt0 = homeTabAbility != null ? homeTabAbility.Ct0() : null;
                HomeTabAbility homeTabAbility2 = homeTabAbilityLIZ;
                String strZj2 = homeTabAbility2 != null ? homeTabAbility2.Zj2() : null;
                boolean zLJFF = C703302op.LIZ(str3) ? Intrinsics.LJFF(strZj2, str3) : Intrinsics.LJFF(strCt0, str2) && Intrinsics.LJFF(strZj2, str3);
                C1571670r09 c1571670r09 = C1571670r09.LIZ;
                C1571660r08 c1571660r08 = c1571620r04.LJFF;
                String str4 = str3;
                String str5 = str2;
                c1571670r09.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("success", zLJFF ? 1 : 0);
                    jSONObject.put("from_bottom", str4);
                    jSONObject.put("from_top", str5);
                    jSONObject.put("to_bottom", strZj2);
                    jSONObject.put("to_top", strCt0);
                    jSONObject.put(Scene.SCENE_SERVICE, c1571660r08.LIZ);
                    C20684815ws.LJIJ("tiktok_tab_recreate_restore_result", jSONObject);
                    C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tiktok_tab_recreate_restore_result: ");
                    sbLIZ.append(jSONObject);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1586120rNS.getClass();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("HomeTabSavedStateHolder@ec0.onRecreateFinish$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("HomeTabSavedStateHolder@ec0.onRecreateFinish$1");
            }
        });
        C1571630r05.LJ = null;
        C1571630r05.LIZIZ.clear();
        C1571630r05.LIZJ.clear();
        if (Intrinsics.LJFF(str, "Shop")) {
            HomeTabAbility homeTabAbility = (HomeTabAbility) this.LL.getValue();
            if (homeTabAbility != null && (hoxHC0 = homeTabAbility.HC0()) != null && (fragmentKi = hoxHC0.Ki("HOME")) != null && (iMFShopAbilityLIZLLL = C1561720qk6.LIZLLL(fragmentKi)) != null) {
                iMFShopAbilityLIZLLL.ly(str);
            }
        } else {
            IMFToolBarAbility iMFToolBarAbilityLIZIZ = C0CUL.LIZIZ(getVAssemScope());
            if (iMFToolBarAbilityLIZIZ != null) {
                iMFToolBarAbilityLIZIZ.j6();
            }
        }
        TopTabAbility topTabAbility = (TopTabAbility) C1558520qew.LIZ(getVAssemScope(), TopTabAbility.class, null);
        if (topTabAbility != null) {
            topTabAbility.uC2();
        }
    }

    public final void bo(final String str, final C1571620r04 c1571620r04, FragmentManager fragmentManager) {
        final Class<?> clsEQ2;
        InterfaceC1571610r03 interfaceC1571610r03;
        Hox hoxHC0;
        Hox hoxHC02;
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LL.getValue();
        Fragment fragmentKi = null;
        if (homeTabAbility != null && (hoxHC02 = homeTabAbility.HC0()) != null) {
            clsEQ2 = hoxHC02.EQ2(str);
        } else {
            clsEQ2 = null;
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LL.getValue();
        if (homeTabAbility2 != null && (hoxHC0 = homeTabAbility2.HC0()) != null) {
            fragmentKi = hoxHC0.Ki(str);
        }
        if (fragmentKi != null && fragmentKi.isAdded() && Intrinsics.LJFF(fragmentKi.getClass(), clsEQ2)) {
            if ((fragmentKi instanceof InterfaceC1571610r03) && (interfaceC1571610r03 = (InterfaceC1571610r03) fragmentKi) != null) {
                interfaceC1571610r03.Ai(c1571620r04.LIZLLL);
            }
            if (fragmentKi.getView() != null) {
                m326do(c1571620r04, str);
                return;
            } else {
                fragmentManager.LJZL(new AbstractC813200VvC() { // from class: X.0r02
                    @Override // X.AbstractC813200VvC
                    public final void onFragmentViewCreated(FragmentManager fragmentManager2, Fragment fragment, View view, Bundle bundle) {
                        super.onFragmentViewCreated(fragmentManager2, fragment, view, bundle);
                        if (Intrinsics.LJFF(fragment.getClass(), clsEQ2)) {
                            this.m326do(c1571620r04, str);
                            fragmentManager2.LLIILZL(this);
                        }
                    }
                }, false);
                return;
            }
        }
        fragmentManager.LJZL(new AbstractC813200VvC() { // from class: X.0r01
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC813200VvC
            public final void onFragmentCreated(FragmentManager fragmentManager2, Fragment fragment, Bundle bundle) {
                InterfaceC1571610r03 interfaceC1571610r032;
                super.onFragmentCreated(fragmentManager2, fragment, bundle);
                if (Intrinsics.LJFF(fragment.getClass(), clsEQ2) && (fragment instanceof InterfaceC1571610r03) && (interfaceC1571610r032 = (InterfaceC1571610r03) fragment) != null) {
                    interfaceC1571610r032.Ai(c1571620r04.LIZLLL);
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentViewCreated(FragmentManager fragmentManager2, Fragment fragment, View view, Bundle bundle) {
                super.onFragmentViewCreated(fragmentManager2, fragment, view, bundle);
                if (Intrinsics.LJFF(fragment.getClass(), clsEQ2)) {
                    this.m326do(c1571620r04, str);
                    fragmentManager2.LLIILZL(this);
                }
            }
        }, false);
    }
}
