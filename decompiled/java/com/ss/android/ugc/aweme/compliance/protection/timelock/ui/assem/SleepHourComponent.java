package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C01GW;
import X.C05OG;
import X.C098200Yq;
import X.C0DMM;
import X.C0JBW;
import X.C0QSJ;
import X.C0RD6;
import X.C0S4U;
import X.C128Y;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1564680qos;
import X.C1566550qrt;
import X.C1568310quj;
import X.C1571830r0P;
import X.C15YW;
import X.C1620910sHZ;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C339190DRl;
import X.C452070Ho5;
import X.C452501pT;
import X.C486550J6f;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C665390Q8b;
import X.C673150Qan;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC20538815Yk;
import X.InterfaceC1146704e9;
import X.InterfaceC1565950qqv;
import X.InterfaceC1566480qrm;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC737790Swr;
import Y.AObserverS213S0100000_9;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.ISleepHourComponentTrigger;
import com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.viewmodel.SleepHourComponentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class SleepHourComponent extends BasePanelUISlotComponent implements SleepHourComponentAbility, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final SleepHourComponent LLJJIJIIJIL = this;
    public final AssemVMLazy LLJJIJIL;
    public C13IQ<? extends UISlotAssem> LLJJJ;
    public boolean LLJJJIL;
    public AObserverS213S0100000_9 LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;
    public final C630740Ooa LLJJJJLIIL;
    public final C630740Ooa LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public SleepHourComponentAbility LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SleepHourComponent.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/compliance/protection/timelock/ui/viewmodel/SleepHourComponentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bcr;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            this.LLJL = (SleepHourComponentAbility) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RootPanelScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            return this.LLJL;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootPanelScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RootPanelScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final FrameLayout ip() {
        Object c098200Yq;
        try {
            c098200Yq = !so() ? null : (FrameLayout) LJJIJL().findViewById(R.id.pyk);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (FrameLayout) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        EventCenter eventCenter;
        MainActivityScope mainActivityScopeLIZIZ;
        HomeTabAbility homeTabAbilityLIZ;
        this.LLJJJIL = false;
        C13IQ<? extends UISlotAssem> c13iq = this.LLJJJ;
        if (c13iq != null) {
            C723850SaN.LJII(this, c13iq, null);
            FrameLayout frameLayoutIp = ip();
            if (frameLayoutIp != null) {
                C786410Ut5.LJJJJIZL(frameLayoutIp);
            }
            this.LLJJJ = null;
        }
        mp(false);
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJJJIL = null;
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (mainActivityScopeLIZIZ = C0S4U.LIZIZ(fragment)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZIZ)) != null) {
            homeTabAbilityLIZ.Ik0((C1620910sHZ) this.LLJJLIIIJLLLLLLLZ.getValue());
            homeTabAbilityLIZ.tx0((C1620910sHZ) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
        AObserverS213S0100000_9 aObserverS213S0100000_9 = this.LLJJJJ;
        if (aObserverS213S0100000_9 == null || (eventCenter = getEventCenter()) == null) {
            return;
        }
        eventCenter.AQ2(aObserverS213S0100000_9);
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == SleepHourComponentAbility.class) {
            this.LLJL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void hp() {
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJJJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1566550qrt(this, null), 3);
    }

    public final SleepHourComponentViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (SleepHourComponentViewModel) assemVMLazy.getValue();
    }

    public SleepHourComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SleepHourComponentViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 245);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(49);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 246), aFwS264S0000000_24, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIJIL = assemVMLazy;
        this.LLJJJJLIIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 244));
        this.LLJJL = C628500Oky.LIZ(new AwS568S0100000_24(this, 247));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 242));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility
    public final long Qs2() {
        SleepHourComponentViewModel sleepHourComponentViewModelKp = kp();
        if (sleepHourComponentViewModelKp.LLILLL > 0) {
            return (System.currentTimeMillis() - sleepHourComponentViewModelKp.LLILLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility
    public final boolean isShowing() {
        FrameLayout frameLayoutIp;
        return so() && LJJIJL().getVisibility() == 0 && (frameLayoutIp = ip()) != null && frameLayoutIp.getVisibility() == 0 && this.LLJJJ != null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C665390Q8b.LIZ(this);
        C622680Oba.LIZJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (C0JBW.LIZLLL(this) && !kp().vQ2()) {
            C05OG.LIZ.getClass();
            C05OG.LIZ();
            kp().wQ2();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (!kp().vQ2() && C0JBW.LIZLLL(this)) {
            if (kp().yQ2()) {
                mp(true);
            } else {
                S11("onResume_invalid");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.digitalwellbeing.SleepHourComponentAbility
    public final void S11(String str) {
        kp().xQ2(EnumC20538815Yk.DISMISS, str);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{RootPanelScope.class}).unbindAbility(this.LLJJIJIIJIL, SleepHourComponentAbility.class);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        AObserverS213S0100000_9 aObserverS213S0100000_9 = new AObserverS213S0100000_9(this, 0);
        c0rd6.LIZ("event_on_render_first_frame", aObserverS213S0100000_9);
        c0rd6.LIZ("event_on_play_completed", aObserverS213S0100000_9);
        this.LLJJJJ = aObserverS213S0100000_9;
    }

    public final void lp(boolean z) {
        int i;
        Aweme awemeLJIIIIZZ;
        InterfaceC1566480qrm interfaceC1566480qrm;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJJL.getValue();
        BaseListFragmentPanel baseListFragmentPanelOs = null;
        if (iViewPagerComponentAbility != null) {
            awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
        } else {
            awemeLJIIIIZZ = null;
        }
        C128Y c128yLJI = C724240Sb0.LJI(this);
        if ((c128yLJI instanceof InterfaceC1566480qrm) && (interfaceC1566480qrm = (InterfaceC1566480qrm) c128yLJI) != null) {
            baseListFragmentPanelOs = interfaceC1566480qrm.Os();
        }
        C1440005kM.LIZ(new C1568310quj(i, awemeLJIIIIZZ, baseListFragmentPanelOs, Boolean.FALSE));
    }

    public final void mp(boolean z) {
        FrameLayout frameLayoutIp;
        if (!so()) {
            kp().setState(new AwS603S0100000_24((Boolean) null, 485));
            return;
        }
        if (z && this.LLJJJ != null && (frameLayoutIp = ip()) != null && frameLayoutIp.getVisibility() == 0) {
            C339190DRl.LIZLLL(LJJIJL());
        } else {
            C339190DRl.LIZIZ(LJJIJL());
        }
        kp().setState(new AwS603S0100000_24(Boolean.valueOf(isShowing()), 485));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedRefresh(C1564680qos c1564680qos) {
        IPlayerComponentAbility iPlayerComponentAbility;
        if (c1564680qos != null && c1564680qos.LIZ == 1 && isShowing() && (iPlayerComponentAbility = (IPlayerComponentAbility) this.LLJJJJLIIL.getValue()) != null) {
            iPlayerComponentAbility.LLLLLLLLLL();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginEvent(C486550J6f c486550J6f) {
        int i = c486550J6f.LIZ;
        if (i == 1 || i == 2) {
            C15YW.LIZ.getClass();
            C15YW.LJII(0L);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        if (kp().vQ2()) {
            return;
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1565950qqv) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1565950qqv) it2.next()).onPagePause(i);
            }
        }
        C05OG.LIZ.getClass();
        C05OG.LIZ();
        kp().wQ2();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUISlotComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        if (kp().vQ2()) {
            return;
        }
        if (!kp().yQ2()) {
            S11("onResume_invalid");
            return;
        }
        mp(true);
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1565950qqv) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1565950qqv) it2.next()).onPageResume(i);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPromptStatusChangeEvent(C1571830r0P c1571830r0P) {
        EnumC20538815Yk enumC20538815Yk;
        if (c1571830r0P != null && (enumC20538815Yk = c1571830r0P.LIZ) != null) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("stm_framework_refactor", true)) {
                return;
            }
            kp().xQ2(enumC20538815Yk, c1571830r0P.LIZIZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object next;
        MainActivityScope mainActivityScopeLIZIZ;
        HomeTabAbility homeTabAbilityLIZ;
        super.onViewCreated(view);
        new AwS568S0100000_24(this, 243);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0r0M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571810r0N) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 20), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0r0O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571810r0N) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 21), 6);
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (mainActivityScopeLIZIZ = C0S4U.LIZIZ(fragment)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZIZ)) != null) {
            homeTabAbilityLIZ.UC1((C1620910sHZ) this.LLJJLIIIJLLLLLLLZ.getValue());
            homeTabAbilityLIZ.ao((C1620910sHZ) this.LLJJLIIIJLLLLLLLZ.getValue());
        }
        SleepHourComponentViewModel sleepHourComponentViewModelKp = kp();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("stm_framework_refactor", true)) {
            ((LinkedHashMap) sleepHourComponentViewModelKp.LL).clear();
            Set<ISleepHourComponentTrigger> services = ServiceManager.get().getServices(ISleepHourComponentTrigger.class);
            if (services != null) {
                for (ISleepHourComponentTrigger iSleepHourComponentTrigger : services) {
                    if (iSleepHourComponentTrigger.getKey() != EnumC20538815Yk.DISMISS) {
                        sleepHourComponentViewModelKp.LL.put(iSleepHourComponentTrigger.getKey(), iSleepHourComponentTrigger);
                        new AwS568S0100000_24(iSleepHourComponentTrigger, 1701);
                    }
                }
            }
            Set setEntrySet = ((LinkedHashMap) sleepHourComponentViewModelKp.LL).entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((ISleepHourComponentTrigger) ((Map.Entry) obj).getValue()).LIZIZ()) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    int i = ((ISleepHourComponentTrigger) ((Map.Entry) next).getValue()).getPriority().getI();
                    do {
                        Object next2 = it2.next();
                        int i2 = ((ISleepHourComponentTrigger) ((Map.Entry) next2).getValue()).getPriority().getI();
                        if (i > i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it2.hasNext());
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                sleepHourComponentViewModelKp.xQ2((EnumC20538815Yk) entry.getKey(), "init");
            }
        }
    }

    public final void op(EnumC20538815Yk enumC20538815Yk) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("stm_framework_refactor", true) || !so()) {
            return;
        }
        C13IQ<? extends UISlotAssem> c13iq = this.LLJJJ;
        if (c13iq != null) {
            C723850SaN.LJII(this, c13iq, null);
            FrameLayout frameLayoutIp = ip();
            if (frameLayoutIp != null) {
                C786410Ut5.LJJJJIZL(frameLayoutIp);
            }
            this.LLJJJ = null;
        }
        C723850SaN.LIZLLL(this, new AwS390S0200000_24(this, enumC20538815Yk, 65));
        if (this.LLJJJ != null && ip() != null) {
            mp(true);
        } else {
            S11("page_show_assem_error");
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{RootPanelScope.class}).bindAbility(this.LLJJIJIIJIL, SleepHourComponentAbility.class);
    }
}
