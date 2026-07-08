package com.ss.android.ugc.aweme.tako.autoplay;

import X.AnonymousClass0956;
import X.C09IR;
import X.C15442062u;
import X.C1783620wW0;
import X.C1783640wW2;
import X.C1783660wW4;
import X.C1783670wW5;
import X.C1783690wW7;
import X.C1783720wWA;
import X.C1783730wWB;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.EnumC2252401DDy;
import X.InterfaceC1783630wW1;
import X.InterfaceC1783680wW6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAutoPlayController {
    public final boolean LIZ;
    public final C1783660wW4 LIZIZ;
    public final C1783720wWA LIZJ;
    public final LifecycleEnableStatus LIZLLL;
    public LifecycleOwner LJ;
    public TakoAutoPlayController$start$obs$1 LJFF;
    public AnonymousClass0956 LJI;
    public AnonymousClass0956 LJII;
    public AnonymousClass0956 LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public boolean LJIIJ;
    public final C2252321DDq LJIIJJI;
    public final C2252321DDq LJIIL;
    public InterfaceC1783680wW6 LJIILIIL;
    public InterfaceC1783630wW1 LJIILJJIL;
    public final Map<String, Boolean> LJIILL;
    public final C2252331DDr LJIILLIIL;

    public TakoAutoPlayController() {
        this(false);
    }

    public TakoAutoPlayController(boolean z) {
        this.LIZ = z;
        this.LIZIZ = new C1783660wW4();
        this.LIZJ = new C1783720wWA();
        this.LIZLLL = new LifecycleEnableStatus();
        this.LJIIJJI = C1BNE.LIZ(Boolean.FALSE);
        this.LJIIL = C1BNE.LIZ(null);
        this.LJIILL = new LinkedHashMap();
        this.LJIILLIIL = C09IR.LIZ(0, 8, EnumC2252401DDy.DROP_OLDEST);
    }

    public final void LIZ(LifecycleOwner lifecycleOwner) {
        Object value;
        InterfaceC1783680wW6 interfaceC1783680wW6;
        this.LJ = lifecycleOwner;
        this.LJIIJ = true;
        this.LJIIJJI.setValue(Boolean.TRUE);
        C1783720wWA c1783720wWA = this.LIZJ;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
        AnonymousClass0956 anonymousClass0956 = c1783720wWA.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (lifecycleScope != null) {
            c1783720wWA.LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C1783730wWB(c1783720wWA, null), 3);
        }
        C1783720wWA c1783720wWA2 = this.LIZJ;
        LifecycleEnableStatus lifecycleEnableStatus = this.LIZLLL;
        C2252321DDq c2252321DDq = c1783720wWA2.LIZJ;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C15442062u.LJIIIIZZ(lifecycleEnableStatus, (Set) value)));
        LifecycleEnableStatus lifecycleEnableStatus2 = this.LIZLLL;
        lifecycleEnableStatus2.LIZJ = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(lifecycleEnableStatus2.LIZLLL);
        lifecycleEnableStatus2.LIZ.setValue(Boolean.valueOf(lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)));
        TakoAutoPlayController$start$obs$1 takoAutoPlayController$start$obs$1 = new TakoAutoPlayController$start$obs$1(this);
        this.LJFF = takoAutoPlayController$start$obs$1;
        lifecycleOwner.getLifecycle().addObserver(takoAutoPlayController$start$obs$1);
        LifecycleOwner lifecycleOwner2 = this.LJ;
        if (lifecycleOwner2 != null) {
            this.LJIIIZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2), null, null, new C1783640wW2(this, null), 3);
        }
        AnonymousClass0956 anonymousClass09562 = this.LJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LJI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C1783690wW7(this, null), 3);
        LifecycleOwner lifecycleOwner3 = this.LJ;
        if (lifecycleOwner3 != null && (interfaceC1783680wW6 = this.LJIILIIL) != null) {
            this.LJII = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner3), null, null, new C1783670wW5(interfaceC1783680wW6, this, null), 3);
        }
        LifecycleOwner lifecycleOwner4 = this.LJ;
        if (lifecycleOwner4 != null) {
            AnonymousClass0956 anonymousClass09563 = this.LJIIIIZZ;
            if (anonymousClass09563 != null) {
                anonymousClass09563.LIZIZ(null);
            }
            InterfaceC1783630wW1 interfaceC1783630wW1 = this.LJIILJJIL;
            if (interfaceC1783630wW1 != null) {
                interfaceC1783630wW1.LIZ();
                this.LJIIIIZZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner4), null, null, new C1783620wW0(interfaceC1783630wW1, this, null), 3);
            }
        }
    }
}
