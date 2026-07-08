package com.ss.android.ugc.aweme.main;

import X.AbstractC1583720rJa;
import X.AbstractC1604130rqV;
import X.C0S4J;
import X.C1150504el;
import X.C1204000hR8;
import X.C1388190mED;
import X.C1586350rNp;
import X.C1586370rNr;
import X.C1593210rYt;
import X.C1593730rZj;
import X.C15O7;
import X.C1720106oR;
import X.C19EG;
import X.C19EH;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1589930rTb;
import X.InterfaceC1586360rNq;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Space;
import android.widget.TabHost;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.homepage.ui.experiment.EasyNavigationExperimentServiceImpl;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.services.BusinessModuleService;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes25.dex */
public final class TabChangeManager extends ViewModel {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public FragmentTabHost LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public Fragment LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public final List<InterfaceC1586360rNq> LLIZ = new CopyOnWriteArrayList();
    public final C0S4J LLIZLLLIL = new C0S4J("BottomTab");
    public String LLJ;
    public int LLJI;
    public FragmentManager LLJIJIL;
    public C1586370rNr LLJILJIL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL = null;
        ((CopyOnWriteArrayList) this.LLIZ).clear();
    }

    public final String CQ2() {
        return this.LLILLL ? this.LLILZIL : this.LLJ;
    }

    public final Bundle EQ2() {
        FragmentTabHost fragmentTabHost = this.LL;
        if (fragmentTabHost == null) {
            return null;
        }
        for (C1586350rNp c1586350rNp : fragmentTabHost.LLILLJJLI) {
            if (c1586350rNp != null && TextUtils.equals(c1586350rNp.LIZ, "FRIENDS_TAB")) {
                return c1586350rNp.LIZJ;
            }
        }
        return null;
    }

    public final boolean FQ2() {
        return this.LL != null;
    }

    public final String Wg() {
        FragmentTabHost fragmentTabHost = this.LL;
        if (fragmentTabHost != null) {
            return fragmentTabHost.getCurrentTabTag();
        }
        return null;
    }

    public final Fragment BQ2() {
        if (!FQ2()) {
            return null;
        }
        if (this.LLILLJJLI) {
            return this.LLILZ;
        }
        FragmentTabHost fragmentTabHost = this.LL;
        if (fragmentTabHost != null) {
            return fragmentTabHost.getCurrentFragment();
        }
        return null;
    }

    public final Fragment DQ2() {
        FragmentTabHost fragmentTabHost;
        if (!FQ2() || (fragmentTabHost = this.LL) == null) {
            return null;
        }
        return fragmentTabHost.getCurrentFragment();
    }

    public final void GQ2(Class<?> cls) {
        ArrayList<C1586350rNp> arrayList;
        FragmentTabHost fragmentTabHost = this.LL;
        if (fragmentTabHost != null && (arrayList = fragmentTabHost.LLILLJJLI) != null && !arrayList.isEmpty()) {
            for (C1586350rNp c1586350rNp : fragmentTabHost.LLILLJJLI) {
                if (c1586350rNp != null && c1586350rNp.LIZIZ == cls) {
                    if (c1586350rNp.LIZLLL != null) {
                        C19EH c19ehLJIIJ = fragmentTabHost.LLILZIL.LJIIJ();
                        c19ehLJIIJ.LJIIZILJ(c1586350rNp.LIZLLL);
                        c19ehLJIIJ.LJIIJ();
                        fragmentTabHost.LLILZIL.LJJJJL();
                        c1586350rNp.LIZLLL = null;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void HQ2(InterfaceC1586360rNq interfaceC1586360rNq) {
        if (interfaceC1586360rNq != null && ((CopyOnWriteArrayList) this.LLIZ).contains(interfaceC1586360rNq)) {
            ((CopyOnWriteArrayList) this.LLIZ).remove(interfaceC1586360rNq);
        }
    }

    public final Fragment Ki(String str) {
        FragmentManager fragmentManager;
        if (!FQ2() || (fragmentManager = this.LLJIJIL) == null) {
            return null;
        }
        return fragmentManager.LJJJJZI(str);
    }

    public final void wQ2(final InterfaceC1586360rNq interfaceC1586360rNq) {
        ((CopyOnWriteArrayList) this.LLIZ).add(interfaceC1586360rNq);
        if (interfaceC1586360rNq instanceof LifecycleOwner) {
            ((LifecycleOwner) interfaceC1586360rNq).getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.main.TabChangeManager$addListener$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ((CopyOnWriteArrayList) this.LL.LLIZ).remove(interfaceC1586360rNq);
                    }
                }
            });
        }
    }

    public final Fragment zQ2(String str) {
        FragmentManager fragmentManager = this.LLJIJIL;
        if (fragmentManager == null) {
            return null;
        }
        return fragmentManager.LJJJJZI(str);
    }

    public final void vQ2(final Bundle bundle, final String str, final Class cls) {
        if (!FQ2()) {
            C15O7.LIZIZ(new Callable() { // from class: X.0ip8
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("TabChangeManager@add1.add$1");
                    TabChangeManager tabChangeManager = this.LL;
                    Class<?> cls2 = cls;
                    tabChangeManager.vQ2(bundle, str, cls2);
                    C1C7U.LIZIZ("TabChangeManager@add1.add$1");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
            return;
        }
        TabHost.TabSpec tabSpecNewTabSpec = this.LL.newTabSpec(str);
        Space space = new Space(this.LL.getContext());
        space.setMinimumHeight(0);
        space.setMinimumWidth(0);
        tabSpecNewTabSpec.setIndicator(space);
        try {
            this.LL.LIZ(tabSpecNewTabSpec, cls, bundle);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
    }

    public static void xQ2(TabChangeManager tabChangeManager, String str, boolean z, Bundle bundle, int i) {
        Bundle bundle2 = bundle;
        if ((i & 8) != 0) {
            bundle2 = null;
        }
        tabChangeManager.getClass();
        if (str != null) {
            EasyNavigationExperimentServiceImpl.LIZIZ();
            int i2 = tabChangeManager.LLJI + 1;
            tabChangeManager.LLJI = i2;
            tabChangeManager.yQ2(str, false, i2, false, bundle2, null);
        }
    }

    public final void yQ2(final String str, final boolean z, final int i, final boolean z2, final Bundle bundle, final String str2) {
        ScrollSwitchStateManager scrollSwitchStateManager;
        Context context;
        C19EG c19egLIZIZ;
        AbstractC1583720rJa abstractC1583720rJaGQ2;
        Bundle bundleLJIIZILJ;
        boolean zLJI = MethodIDManager.LJI(71707);
        if (!TextUtils.equals("HOME", str) && !C1593730rZj.LIZIZ.LIZJ(str)) {
            C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.BOTTOM_TAB);
            C1150504el.LIZ().LJIIIIZZ = false;
            BusinessModuleService businessModuleService = (BusinessModuleService) ServiceManager.get().getService(BusinessModuleService.class);
            if (businessModuleService != null && businessModuleService.isColdBootTabDelayEnabled()) {
                businessModuleService.notifyTabDelayRunsIfNeeded();
            }
        }
        C0S4J c0s4j = this.LLIZLLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSafeTabHost:");
        sbLIZ.append(FQ2());
        sbLIZ.append(", mLastFragment:");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", enterMethod:");
        sbLIZ.append(str2);
        sbLIZ.append(", tag:");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z3 = AbstractC1604130rqV.LIZLLL;
        c0s4j.LIZ(strLIZIZ, null);
        if (!FQ2() && TextUtils.equals("HOME", str) && CQ2() == null) {
            this.LLILZLL = CQ2();
            this.LLJ = str;
        }
        if (!FQ2()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new Runnable() { // from class: X.0R6s
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TabChangeManager@add1.changeTab$1");
                    try {
                        this.LL.yQ2(str, z, i, z2, bundle, str2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TabChangeManager@add1.changeTab$1");
                }
            });
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (this.LLJI > i) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        String tagForCurrentTabInMainPageFragment = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getTagForCurrentTabInMainPageFragment(this, this.LL.getCurrentTabTag(), str);
        if (bundle != null) {
            FragmentTabHost fragmentTabHost = this.LL;
            if (fragmentTabHost != null && (context = fragmentTabHost.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19egLIZIZ);
                if (hoxLIZ.Ki(str) == null && (abstractC1583720rJaGQ2 = hoxLIZ.GQ2(str)) != null && (bundleLJIIZILJ = abstractC1583720rJaGQ2.LJIIZILJ()) != null) {
                    C786410Ut5.LJJIIJZLJL(bundle, bundleLJIIZILJ);
                }
            }
            Iterator<C1586350rNp> it2 = this.LL.LLILLJJLI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1586350rNp next = it2.next();
                if (next != null && TextUtils.equals(next.LIZ, tagForCurrentTabInMainPageFragment)) {
                    next.LIZJ = bundle;
                    break;
                }
            }
        }
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            tabSwitchMetricServiceLIZ.LJII();
            C1593210rYt.LIZ(this, str);
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("changeTab: last:");
        sbLIZ2.append(this.LLILZLL);
        sbLIZ2.append(", cur:");
        sbLIZ2.append(CQ2());
        sbLIZ2.append(", tag:");
        sbLIZ2.append(str);
        C1720106oR.LJI("feedTab ", C2188811AlT.LIZIZ(sbLIZ2));
        this.LL.setCurrentTabByTag(tagForCurrentTabInMainPageFragment);
        this.LLILZLL = CQ2();
        this.LLJ = str;
        C1586370rNr c1586370rNr = this.LLJILJIL;
        if (c1586370rNr != null && (scrollSwitchStateManager = c1586370rNr.LIZ.LIZJ) != null) {
            scrollSwitchStateManager.LLJJIJIL = str;
        }
        Iterator it3 = ((CopyOnWriteArrayList) this.LLIZ).iterator();
        while (it3.hasNext()) {
            ((InterfaceC1586360rNq) it3.next()).LLLZLZ(str, this.LLILZLL, z, z2, bundle, str2);
        }
        ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).afterTabChangedInMainPageFragment(str);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
