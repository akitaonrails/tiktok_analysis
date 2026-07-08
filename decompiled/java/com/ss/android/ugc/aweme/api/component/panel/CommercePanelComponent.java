package com.ss.android.ugc.aweme.api.component.panel;

import X.C01GW;
import X.C098200Yq;
import X.C0A70;
import X.C0PEM;
import X.C0S0L;
import X.C0SR4;
import X.C0SZ8;
import X.C0T1R;
import X.C1022620cia;
import X.C1038920d8s;
import X.C1038930d8t;
import X.C1038940d8u;
import X.C1038950d8v;
import X.C1051710dTV;
import X.C1210880hcE;
import X.C1389300mG0;
import X.C13LP;
import X.C1440005kM;
import X.C1487005rw;
import X.C14EU;
import X.C1566140qrE;
import X.C189200o6;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C257420A6y;
import X.C270600Aj4;
import X.C299750Boz;
import X.C330201Pw;
import X.C452501pT;
import X.C622680Oba;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C745730TNb;
import X.C786410Ut5;
import X.C817630W5p;
import X.EnumC452301pR;
import X.InterfaceC1037760d70;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import Y.ARunnableS78S0200000_9;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.IClickBackTimeService;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class CommercePanelComponent extends BasePanelUIComponent implements InterfaceC1616070s9l, GenericLifecycleObserver {
    public int LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1038930d8t(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1038940d8u());
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public boolean LLJJIII;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
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

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    public final void Go() {
        long jLongValue = ((Number) C270600Aj4.LIZ.getValue()).longValue();
        if (jLongValue <= 0) {
            No();
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C330201Pw(jLongValue, this, null), 3);
        }
    }

    public final IFeedService Jo() {
        return (IFeedService) this.LLJILJILJ.getValue();
    }

    public final IViewPagerComponentAbility Lo() {
        return (IViewPagerComponentAbility) this.LLJILJIL.getValue();
    }

    public CommercePanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS560S0100000_16((InterfaceC1565950qqv) this, 70), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1038920d8s(false, this));
        }
        this.LLJILLL = c01gwLIZIZ;
        this.LLJJ = C452501pT.LIZIZ(new C1038950d8v());
        this.LLJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(108));
        this.LLJJIII = true;
    }

    public final void Ho() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        Aweme awemeLJIIIIZZ;
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ()) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[doOnResume] aweme=");
        sbLIZ.append(awemeLJIIIIZZ.getAid());
        C1022620cia.LIZ("CommercePanelComponent", C2188811AlT.LIZIZ(sbLIZ));
        Oo(false);
        IClickBackTimeService iClickBackTimeService = (IClickBackTimeService) this.LLJJI.getValue();
        if (iClickBackTimeService != null) {
            iClickBackTimeService.LIZ(awemeLJIIIIZZ);
        }
    }

    public final void No() {
        IViewPagerComponentAbility iViewPagerComponentAbilityLo = Lo();
        if (iViewPagerComponentAbilityLo == null || iViewPagerComponentAbilityLo.LJJLIIIJL() == null || C724240Sb0.LIZ(this) == null) {
            return;
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityLo2 = Lo();
        if ((iViewPagerComponentAbilityLo2 != null ? iViewPagerComponentAbilityLo2.LJJLIIIJL() : null) instanceof C0SR4) {
            IViewPagerComponentAbility iViewPagerComponentAbilityLo3 = Lo();
            List<Aweme> listFg = ((C0SR4) (iViewPagerComponentAbilityLo3 != null ? iViewPagerComponentAbilityLo3.LJJLIIIJL() : null)).Fg();
            Jo().LJIIL(this.LLJIJIL, getContext(), C1389300mG0.LIZ(getPanelContext()), listFg);
            Jo().LIZIZ(this.LLJIJIL, C724240Sb0.LIZ(this), C1389300mG0.LIZ(getPanelContext()), listFg);
            ((InterfaceC1037760d70) this.LLJJ.getValue()).Yi0(this.LLJIJIL, listFg);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        Lifecycle lifecycle;
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        if (((Boolean) C1051710dTV.LJ.getValue()).booleanValue() && Intrinsics.LJFF(C1389300mG0.LIZ(getPanelContext()), "general_search")) {
            strLIZ = "inflow_search";
        }
        Jo().LIZ(getContext(), strLIZ);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (lifecycle = fragmentLJI.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1022620cia.LIZ("CommercePanelComponent", "[onCreate]");
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1022620cia.LIZ("CommercePanelComponent", "[onDestroy]");
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if ((c19egLIZ instanceof C19EG) && c19egLIZ != null) {
            C817630W5p.LL.LIZ(c19egLIZ);
        }
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1022620cia.LIZ("CommercePanelComponent", "[doOnPause]");
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJJIII) {
            Ho();
        }
    }

    public final void Oo(boolean z) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        Aweme awemeLJIIIIZZ;
        FragmentManager supportFragmentManager;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        String string = null;
        if ((c19egLIZ instanceof C19EG) && c19egLIZ != null) {
            Fragment fragment = getPanelContext().LJ;
            if (fragment != null && (iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment)) != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ()) != null) {
                AwemeRawAd awemeRawAd = awemeLJIIIIZZ.getAwemeRawAd();
                if (awemeRawAd != null) {
                    string = Integer.valueOf(awemeRawAd.getRit()).toString();
                }
                if (awemeLJIIIIZZ != null && AwemeExtKt.isAdTraffic(awemeLJIIIIZZ) && C1487005rw.LIZ(string)) {
                    C817630W5p c817630W5p = C817630W5p.LL;
                    AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 71);
                    AwS560S0100000_16 awS560S0100000_162 = new AwS560S0100000_16(this, 72);
                    c817630W5p.getClass();
                    if (!C817630W5p.LLIZLLLIL && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                        C817630W5p.LLILZIL = awS560S0100000_16;
                        C817630W5p.LLILZLL = awS560S0100000_162;
                        supportFragmentManager.LJZL(c817630W5p, true);
                        C817630W5p.LLIZLLLIL = true;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[register] activity=");
                        sbLIZ.append(c19egLIZ.getClass().getSimpleName());
                        C1022620cia.LIZ("ClickBackTime", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    return;
                }
            }
            if (!z) {
                return;
            }
            C817630W5p.LL.LIZ(c19egLIZ);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        this.LLJJIII = false;
        C1022620cia.LIZ("CommercePanelComponent", "[doOnPause]");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        this.LLJJIII = true;
        Ho();
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        Object c098200Yq;
        PagerAdapter pagerAdapterLJJLIIIJL;
        PagerAdapter pagerAdapterLJJLIIIJL2;
        Object c098200Yq2;
        Aweme aweme;
        C0SR4 c0sr4;
        if (i == 0) {
            Go();
            IViewPagerComponentAbility iViewPagerComponentAbilityLo = Lo();
            List<Aweme> listFg = null;
            if (iViewPagerComponentAbilityLo != null && iViewPagerComponentAbilityLo.LJJLIIIJL() != null && C724240Sb0.LIZ(this) != null) {
                try {
                    c098200Yq = Boolean.valueOf(((Boolean) C0A70.LIZ.getValue()).booleanValue());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Boolean bool = Boolean.TRUE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = bool;
                }
                if (((Boolean) c098200Yq).booleanValue()) {
                    IViewPagerComponentAbility iViewPagerComponentAbilityLo2 = Lo();
                    if (iViewPagerComponentAbilityLo2 != null) {
                        pagerAdapterLJJLIIIJL = iViewPagerComponentAbilityLo2.LJJLIIIJL();
                    } else {
                        pagerAdapterLJJLIIIJL = null;
                    }
                    if (pagerAdapterLJJLIIIJL instanceof C0SR4) {
                        IViewPagerComponentAbility iViewPagerComponentAbilityLo3 = Lo();
                        if (iViewPagerComponentAbilityLo3 != null) {
                            pagerAdapterLJJLIIIJL2 = iViewPagerComponentAbilityLo3.LJJLIIIJL();
                        } else {
                            pagerAdapterLJJLIIIJL2 = null;
                        }
                        if ((pagerAdapterLJJLIIIJL2 instanceof C0SR4) && (c0sr4 = (C0SR4) pagerAdapterLJJLIIIJL2) != null) {
                            listFg = c0sr4.Fg();
                        }
                        try {
                            c098200Yq2 = Integer.valueOf(((Number) C257420A6y.LIZ.getValue()).intValue());
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            c098200Yq2 = new C098200Yq(th2);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = 4;
                        }
                        int iIntValue = ((Number) c098200Yq2).intValue();
                        Jo().LJI(this.LLJIJIL, getContext(), C1389300mG0.LIZ(getPanelContext()), listFg);
                        if (listFg != null && (aweme = (Aweme) C13LP.LJJJLZIJ(this.LLJIJIL + iIntValue, listFg)) != null) {
                            C0S0L.LIZ.getClass();
                            if (C0S0L.LIZLLL(aweme)) {
                                C786410Ut5.LJLIIL(200L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS78S0200000_9(this, aweme, 44));
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0188  */
    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r19) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.component.panel.CommercePanelComponent.onPageSelected(int):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onTTPlusSubscribeSuccessEvent(C745730TNb c745730TNb) {
        Aweme awemeLJIIIIZZ;
        String aid;
        IViewPagerComponentAbility iViewPagerComponentAbilityLo = Lo();
        Boolean boolValueOf = null;
        if (iViewPagerComponentAbilityLo != null) {
            awemeLJIIIIZZ = iViewPagerComponentAbilityLo.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onTTPlusSubscribeSuccessEvent] begin, currentAweme=");
        if (awemeLJIIIIZZ != null) {
            aid = awemeLJIIIIZZ.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", isAd=");
        if (awemeLJIIIIZZ != null) {
            boolValueOf = Boolean.valueOf(AwemeExtKt.isAdTraffic(awemeLJIIIIZZ));
        }
        sbLIZ.append(boolValueOf);
        C1022620cia.LIZ("CommercePanelComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (awemeLJIIIIZZ != null && AwemeExtKt.isAdTraffic(awemeLJIIIIZZ)) {
            C1022620cia.LIZ("CommercePanelComponent", "[onTTPlusSubscribeSuccessEvent] delete current ad");
            C1440005kM.LIZ(new C1210880hcE("homepage_hot", "FUNCTION_FROM_DEFAULT", "ttplus_card_subscribe", awemeLJIIIIZZ));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Lifecycle lifecycle;
        super.onViewCreated(view);
        IViewPagerComponentAbility iViewPagerComponentAbilityLo = Lo();
        if (iViewPagerComponentAbilityLo != null) {
            iViewPagerComponentAbilityLo.Bv0(this);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (lifecycle = fragmentLJI.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
