package com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh;

import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1567020qse;
import X.C1620910sHZ;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1A5L;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C343710Ddh;
import X.C452501pT;
import X.C622680Oba;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1586360rNq;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ACListenerS126S0200000_24;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS30S0101000_19;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.INonPersonalizedAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.tiktok.pns.feedsafety.algorefresh.AlgoRefreshVM;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.abilities.IAlgoRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class AlgoRefreshAssem extends UISlotAssem implements IAlgoRefreshAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(443));
    public View LLJJIII;
    public TuxTextView LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public boolean LLJJJJ;
    public final ARunnableS119S0100000_19 LLJJJJJIL;
    public volatile HomeTabAbility LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AlgoRefreshAssem.class, "algoRefreshVM", "getAlgoRefreshVM()Lcom/ss/android/ugc/tiktok/pns/feedsafety/algorefresh/AlgoRefreshVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AlgoRefreshAssem.class, "nonPersonalizedVM", "getNonPersonalizedVM()Lcom/bytedance/tiktok/homepage/mainfragment/NonPersonalizedVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AlgoRefreshAssem.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public AlgoRefreshAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AlgoRefreshVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2679), AFwS264S0000000_24.get$arr$(545), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NonPersonalizedVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2680), AFwS264S0000000_24.get$arr$(546), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2678));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1621));
        this.LLJJJJJIL = new ARunnableS119S0100000_19(this, 122);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cdj;
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1579162851) {
            return null;
        }
        return this;
    }

    public final void hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.abilities.IAlgoRefreshAbility
    public final boolean ds() {
        return LJJIJL().getVisibility() == 0;
    }

    public final void ip() {
        if (LJJIJL().getVisibility() == 0) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), this.LLJJJJJIL);
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean kp() {
        Boolean bool = (Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue();
        boolean z = false;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        INonPersonalizedAbility iNonPersonalizedAbility = (INonPersonalizedAbility) this.LLJJJ.getValue();
        if (iNonPersonalizedAbility != null && iNonPersonalizedAbility.ds()) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void lp(int i) {
        try {
            hp();
            new ARunnableS124S0100000_24(this, 8).run();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (i < 5) {
                HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS30S0101000_19(i, this, 4), 500L);
            }
        }
    }

    @C14EU
    public final void onAlgoRefreshStop(C1567020qse c1567020qse) {
        if (c1567020qse.LIZ) {
            IAlgoRefreshService iAlgoRefreshService = (IAlgoRefreshService) PluggableExtentionKt.pluggableSpi$default(IAlgoRefreshService.class, false, false, false, 14, null);
            if (iAlgoRefreshService != null) {
                iAlgoRefreshService.LIZIZ();
            }
            ip();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean zBooleanValue;
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        this.LLJJIII = LJJIJL().findViewById(R.id.awi);
        this.LLJJIJI = (TuxTextView) LJJIJL().findViewById(R.id.awk);
        C2271391DvN.LIZ(LJJIJL(), (C1A5L) C2271381DvM.LLLZLL.getValue());
        View view2 = this.LLJJIII;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS126S0200000_24(this, view2, 3), view2);
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217371BqR() { // from class: X.0qsY
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1383310m6L) obj).LLILLJJLI);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1383310m6L) obj).LLILLJJLI = ((Number) obj2).intValue();
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 14), 4);
        C343710Ddh.LIZ(C724240Sb0.LIZ(this)).wQ2(new InterfaceC1586360rNq() { // from class: X.0qsd
            @Override // X.InterfaceC1586360rNq
            public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
                if (this.LL.LJJIJL().getVisibility() == 0 && !C13LP.LJJJJ(str, AlgoRefreshVM.LL)) {
                    this.LL.ip();
                }
            }
        });
        C1620910sHZ c1620910sHZ = new C1620910sHZ(this, 22);
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJJJIL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.UC1(c1620910sHZ);
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLJJJIL.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.ao(c1620910sHZ);
        }
        Boolean bool = (Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJJJJ = zBooleanValue;
        if (kp()) {
            this.LLJJJJ = false;
            HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS119S0100000_19(this, 123), 2000L);
        }
    }
}
