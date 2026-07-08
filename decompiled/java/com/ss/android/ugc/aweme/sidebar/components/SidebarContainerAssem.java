package com.ss.android.ugc.aweme.sidebar.components;

import X.C019F;
import X.C01GW;
import X.C0CP9;
import X.C0QSJ;
import X.C1154980gA4;
import X.C13LE;
import X.C14K4;
import X.C14K9;
import X.C1570610qyR;
import X.C1570640qyU;
import X.C1580280rE2;
import X.C1580320rE6;
import X.C1580330rE7;
import X.C1580390rED;
import X.C1620930sHb;
import X.C1620960sHe;
import X.C1637806bA;
import X.C1906580ziK;
import X.C1935307i3;
import X.C19719912Dl;
import X.C19EG;
import X.C20246014Ju;
import X.C2217381BqS;
import X.C23250099c;
import X.C343710Ddh;
import X.C486860J7k;
import X.C687700QyG;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C799900VZk;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1586360rNq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import Y.ARunnableS124S0100000_24;
import Y.AfS193S0100000_24;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility;
import com.ss.android.ugc.aweme.sidebar.ability.ISidebarUserGuideAbility;
import com.ss.android.ugc.aweme.sidebar.components.protocol.SideBarScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SidebarContainerAssem extends UISlotAssem implements ISidebarAbility, InterfaceC1586360rNq, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final SidebarContainerAssem LLJJI = this;
    public final AssemVMLazy LLJJIII;
    public ISideBarRootAbility LLJJIJI;
    public C1570610qyR LLJJIJIIJIL;
    public ScrollSwitchStateManager LLJJIJIL;
    public TabChangeManager LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public C1154980gA4 LLJJJJJIL;
    public C1154980gA4 LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public String LLJLILLLLZIIL;
    public final C1620930sHb LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SidebarContainerAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/sidebar/components/SideBarRootVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SidebarContainerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SideBarRootVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1133), AFwS264S0000000_24.get$arr$(383), null, true);
        this.LLJJJIL = C1935307i3.LIZ(new AwS568S0100000_24(this, 1132));
        this.LLJJJJ = C1935307i3.LIZ(new AwS568S0100000_24(this, 1131));
        this.LLJLL = new C1620930sHb(this, 9);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cdy;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SideBarScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SideBarScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1367498307) {
            return null;
        }
        return this;
    }

    public final void kp() {
        long j;
        if (this.LLJJL && !this.LLJJLIIIJLLLLLLLZ) {
            synchronized (C1580330rE7.LIZ) {
                try {
                    C1580330rE7.LIZLLL++;
                    C1580330rE7.LIZIZ = true;
                    C1580330rE7.LIZJ = Long.valueOf(C1580330rE7.LIZLLL);
                    j = C1580330rE7.LIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Iterator<Function0<Unit>> it2 = C1580330rE7.LJ.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
            Iterator<Function1<Long, Unit>> it3 = C1580330rE7.LJFF.iterator();
            while (it3.hasNext()) {
                it3.next().invoke(Long.valueOf(j));
            }
        }
        ISideBarRootAbility iSideBarRootAbilityLp = lp();
        if (iSideBarRootAbilityLp != null) {
            ip(iSideBarRootAbilityLp);
        }
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJL = 0;
        this.LLJLIL = false;
        C1570640qyU.LIZ.LIZ();
    }

    public final ISideBarRootAbility lp() {
        ISideBarRootAbility iSideBarRootAbility = this.LLJJIJI;
        if (iSideBarRootAbility != null) {
            return iSideBarRootAbility;
        }
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(getVAssemScope(), SideBarScope.class);
        Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(ISideBarRootAbility.class) : null;
        ISideBarRootAbility iSideBarRootAbility2 = (ISideBarRootAbility) (ability instanceof ISideBarRootAbility ? ability : null);
        this.LLJJIJI = iSideBarRootAbility2;
        return iSideBarRootAbility2;
    }

    public final SideBarRootVM mp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (SideBarRootVM) assemVMLazy.getValue();
    }

    public final void op() {
        C1154980gA4 c1154980gA4 = this.LLJJJJLIIL;
        if (c1154980gA4 == null && (c1154980gA4 = this.LLJJJJJIL) == null) {
            return;
        }
        if ((c1154980gA4.LIZIZ || c1154980gA4.LIZJ) && !this.LLJLIL && this.LLJL < 30) {
            this.LLJLIL = true;
            HandlerHook.viewPostDelay(getContentView(), new ARunnableS124S0100000_24(this, 70), 100L);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLJJJJ.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.yT(this.LLJLL);
        }
        TabChangeManager tabChangeManager = this.LLJJJ;
        if (tabChangeManager != null) {
            tabChangeManager.HQ2(this);
        }
        C1580320rE6.LIZ.clear();
        C1580320rE6.LIZIZ.clear();
    }

    public final void sp() {
        ISideBarRootAbility iSideBarRootAbilityLp = lp();
        if (iSideBarRootAbilityLp == null) {
            return;
        }
        iSideBarRootAbilityLp.WA2(Long.valueOf(C1580280rE2.LJIIIIZZ), "load_start_time");
        iSideBarRootAbilityLp.WA2(Integer.valueOf(C1580280rE2.LJII ? 1 : 0), "is_coldlaunch");
        C799900VZk.LIZ.getClass();
        iSideBarRootAbilityLp.WA2(Integer.valueOf(!C0CP9.LIZ() ? 1 : 0), "is_first_feed_show");
    }

    public final void tp() {
        ISideBarRootAbility iSideBarRootAbilityLp = lp();
        if (iSideBarRootAbilityLp == null) {
            if (this.LLJJJJLIIL == null && this.LLJJJJJIL == null) {
                this.LLJJJJJIL = C1570640qyU.LIZ.LIZIZ();
            }
            op();
            return;
        }
        iSideBarRootAbilityLp.WA2(C1580280rE2.LIZIZ, "enter_from");
        iSideBarRootAbilityLp.WA2(C1580280rE2.LIZJ, "enter_method");
        iSideBarRootAbilityLp.WA2(C1580280rE2.LIZ, "entrance_id");
        C1154980gA4 c1154980gA4 = this.LLJJJJLIIL;
        if (c1154980gA4 == null && (c1154980gA4 = this.LLJJJJJIL) == null) {
            synchronized (C1570640qyU.LIZ) {
                c1154980gA4 = C1570640qyU.LIZIZ;
                if (c1154980gA4 == null) {
                    ip(iSideBarRootAbilityLp);
                } else {
                    C1570640qyU.LIZIZ = null;
                    hp(iSideBarRootAbilityLp, c1154980gA4);
                }
            }
        } else {
            hp(iSideBarRootAbilityLp, c1154980gA4);
        }
        iSideBarRootAbilityLp.WA2(BtmSDK.INSTANCE.getPageId(PageFinder.via(C724240Sb0.LJI(this))), "btm_page_id");
        iSideBarRootAbilityLp.WA2(mp(), "root_vm");
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SideBarScope.class}).unbindAbility(this.LLJJI, ISidebarAbility.class);
    }

    public final void ip(ISideBarRootAbility iSideBarRootAbility) {
        Object ability;
        Object obj = null;
        iSideBarRootAbility.WA2(null, "minis_entrance_from");
        iSideBarRootAbility.WA2(Boolean.FALSE, "revisit_edu_show_guide");
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(getVAssemScope(), SideBarScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(ISidebarUserGuideAbility.class);
        } else {
            ability = null;
        }
        if (ability instanceof ISidebarUserGuideAbility) {
            obj = ability;
        }
        ISidebarUserGuideAbility iSidebarUserGuideAbility = (ISidebarUserGuideAbility) obj;
        if (iSidebarUserGuideAbility != null) {
            iSidebarUserGuideAbility.Eh0();
        }
        this.LLJJL = false;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility
    public final void onNodeHide(Bundle bundle) {
        Object ability;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(getVAssemScope(), SideBarScope.class);
        Object obj = null;
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(ISidebarUserGuideAbility.class);
        } else {
            ability = null;
        }
        if (ability instanceof ISidebarUserGuideAbility) {
            obj = ability;
        }
        ISidebarUserGuideAbility iSidebarUserGuideAbility = (ISidebarUserGuideAbility) obj;
        if (iSidebarUserGuideAbility != null) {
            iSidebarUserGuideAbility.dismiss();
        }
        C1580280rE2.LIZIZ();
        C1580280rE2.LJII = false;
        C1580280rE2.LJI = false;
        ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIIIIZZ();
        kp();
        C1580320rE6.LIZJ = false;
        C1580320rE6.LIZ.clear();
        C1580320rE6.LIZIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.sidebar.ability.ISidebarAbility
    public final void onNodeShow(Bundle bundle) {
        SideBarRootVM sideBarRootVMMp = mp();
        C23250099c.LIZLLL(sideBarRootVMMp.getAssemVMScope(), null, null, new C1580390rED(sideBarRootVMMp, null), 3);
        if (!C1580280rE2.LJII) {
            C1580280rE2.LJIIIIZZ = System.currentTimeMillis();
        }
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJLILLLLZIIL = "page_sidebar";
        tp();
        sp();
        C1580320rE6.LIZJ = true;
        Iterator<Function0<Unit>> it2 = C1580320rE6.LIZ.iterator();
        while (it2.hasNext()) {
            Function0<Unit> next = it2.next();
            Set<Integer> set = C1580320rE6.LIZIZ;
            if (!set.contains(Integer.valueOf(next.hashCode()))) {
                set.add(Integer.valueOf(next.hashCode()));
                next.invoke();
            }
            it2.remove();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1154980gA4 c1154980gA4;
        super.onViewCreated(view);
        synchronized (C1570640qyU.LIZ) {
            c1154980gA4 = C1570640qyU.LIZIZ;
            if (c1154980gA4 == null) {
                c1154980gA4 = null;
            } else {
                C1570640qyU.LIZIZ = null;
            }
        }
        this.LLJJJJJIL = c1154980gA4;
        C1580280rE2.LJIIIIZZ = System.currentTimeMillis();
        SideBarRootVM sideBarRootVMMp = mp();
        sideBarRootVMMp.setState(new AwS603S0100000_24(sideBarRootVMMp, 279));
        View viewFindViewById = view.findViewById(R.id.vas);
        if (viewFindViewById != null) {
            viewFindViewById.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0rE3
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                    String str = C1580280rE2.LIZIZ;
                    String str2 = C1580280rE2.LIZJ;
                    String str3 = C1580280rE2.LIZ;
                    if (!C1580280rE2.LJ) {
                        C1580280rE2.LJ = true;
                        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new RunnableC514401zS(str, str2, str3, 2));
                    }
                }
            });
        }
        C1906580ziK.LIZJ().LIZ().LJLLLL(getLifecycle(), new AfS193S0100000_24(this, 28));
        AFwS310S0000000_24 aFwS310S0000000_24 = AFwS310S0000000_24.get$arr$(57);
        C14K9.LJIJJ(view, new C1620960sHe(aFwS310S0000000_24, 2));
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
        if (c20246014JuLIZ != null) {
            aFwS310S0000000_24.invoke(view, c20246014JuLIZ);
        } else {
            view.requestApplyInsets();
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19egLIZ);
            this.LLJJIJIL = scrollSwitchStateManagerLIZIZ;
            TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19egLIZ);
            this.LLJJJ = tabChangeManagerLIZ;
            tabChangeManagerLIZ.wQ2(this);
            C1570610qyR c1570610qyR = new C1570610qyR(c19egLIZ, scrollSwitchStateManagerLIZIZ);
            this.LLJJIJIIJIL = c1570610qyR;
            c1570610qyR.LIZ();
            this.LLJLILLLLZIIL = scrollSwitchStateManagerLIZIZ.wQ2();
            HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLJJJJ.getValue();
            if (homePageViewPagerAbility != null) {
                homePageViewPagerAbility.Jk1(this.LLJLL);
            }
        }
        C723850SaN.LIZLLL(this, new AwS603S0100000_24(this, 278));
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0rE8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1580350rE9) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 95), 6);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SideBarScope.class}).bindAbility(this.LLJJI, ISidebarAbility.class);
    }

    public final void hp(ISideBarRootAbility iSideBarRootAbility, C1154980gA4 c1154980gA4) {
        Object ability;
        Object ability2;
        if (!Intrinsics.LJFF(this.LLJJJJLIIL, c1154980gA4)) {
            this.LLJL = 0;
        }
        this.LLJJJJLIIL = c1154980gA4;
        Object obj = null;
        this.LLJJJJJIL = null;
        iSideBarRootAbility.WA2(c1154980gA4.LIZ, "minis_entrance_from");
        iSideBarRootAbility.WA2(Boolean.valueOf(c1154980gA4.LIZIZ), "revisit_edu_show_guide");
        this.LLJJL = c1154980gA4.LIZJ;
        if (c1154980gA4.LIZIZ) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(getVAssemScope(), SideBarScope.class);
            if (c0qsjLIZJ != null) {
                ability2 = c0qsjLIZJ.getAbility(ISidebarUserGuideAbility.class);
            } else {
                ability2 = null;
            }
            if (ability2 instanceof ISidebarUserGuideAbility) {
                obj = ability2;
            }
            ISidebarUserGuideAbility iSidebarUserGuideAbility = (ISidebarUserGuideAbility) obj;
            if (iSidebarUserGuideAbility != null) {
                iSidebarUserGuideAbility.w51();
            }
            op();
            return;
        }
        C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(getVAssemScope(), SideBarScope.class);
        if (c0qsjLIZJ2 != null) {
            ability = c0qsjLIZJ2.getAbility(ISidebarUserGuideAbility.class);
        } else {
            ability = null;
        }
        if (ability instanceof ISidebarUserGuideAbility) {
            obj = ability;
        }
        ISidebarUserGuideAbility iSidebarUserGuideAbility2 = (ISidebarUserGuideAbility) obj;
        if (iSidebarUserGuideAbility2 == null) {
            return;
        }
        iSidebarUserGuideAbility2.Eh0();
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        HomePageViewPagerAbility homePageViewPagerAbility;
        if (Intrinsics.LJFF(str, "HOME")) {
            C1570610qyR c1570610qyR = this.LLJJIJIIJIL;
            if (c1570610qyR != null) {
                c1570610qyR.LIZ();
                return;
            }
            return;
        }
        C1570610qyR c1570610qyR2 = this.LLJJIJIIJIL;
        if (c1570610qyR2 == null || (homePageViewPagerAbility = (HomePageViewPagerAbility) c1570610qyR2.LJFF.getValue()) == null) {
            return;
        }
        homePageViewPagerAbility.yT(c1570610qyR2.LJI);
    }
}
