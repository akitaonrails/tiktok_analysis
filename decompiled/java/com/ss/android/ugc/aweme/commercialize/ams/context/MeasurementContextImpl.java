package com.ss.android.ugc.aweme.commercialize.ams.context;

import X.AbstractC2192061Aqi;
import X.AbstractC2200351B9t;
import X.AbstractC2258621Dam;
import X.C01GW;
import X.C04TF;
import X.C098200Yq;
import X.C0N23;
import X.C0N26;
import X.C0N29;
import X.C0N2B;
import X.C0N8K;
import X.C0N8M;
import X.C1065990dqX;
import X.C1305120k4E;
import X.C13BS;
import X.C13BW;
import X.C189200o6;
import X.C19980713Ft;
import X.C1DTL;
import X.C2258631Dan;
import X.C2258691Dat;
import X.C2258701Dau;
import X.C2258721Daw;
import X.C2258731Dax;
import X.C2258751Daz;
import X.C2258761Db0;
import X.C452501pT;
import X.C589080N8o;
import X.InterfaceC1065950dqT;
import X.InterfaceC2258651Dap;
import X.InterfaceC2258681Das;
import X.InterfaceC581670Mrd;
import X.InterfaceC583240MuA;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementContextModules;
import com.ss.android.ugc.aweme.commercialize.ams.di.MeasurementDependencyModules;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AwS0S1011000_35;
import kotlin.jvm.internal.AwS18S1001000_35;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS65S0100100_9;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class MeasurementContextImpl implements MeasurementContext {
    public final ConcurrentHashMap<C0N23, C2258751Daz> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(new C2258631Dan());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C0N8M());
    public final C1305120k4E<String, InterfaceC2258651Dap> LJ = new C1305120k4E<>("Feed_Expose", new ConcurrentHashMap());
    public final C1305120k4E<String, InterfaceC2258681Das> LJFF = new C1305120k4E<>("Feed_Player", new ConcurrentHashMap());
    public final C1305120k4E<String, InterfaceC2258651Dap> LJI = new C1305120k4E<>("General_Expose", new ConcurrentHashMap());
    public final C1305120k4E<String, InterfaceC2258681Das> LJII = new C1305120k4E<>("General_Player", new ConcurrentHashMap());

    @Override // X.InterfaceC583230Mu9
    public final InterfaceC583240MuA LJII() {
        return new InterfaceC583240MuA() { // from class: X.1Dak
            @Override // X.InterfaceC583240MuA
            public final long LIZ(C0N23 c0n23) {
                InterfaceC2258811Db5 interfaceC2258811Db5;
                C2258751Daz c2258751Daz = this.LIZ.LIZIZ.get(c0n23);
                if (c2258751Daz != null && (interfaceC2258811Db5 = c2258751Daz.LJII) != null) {
                    return interfaceC2258811Db5.LLLJL();
                }
                return 0L;
            }

            @Override // X.InterfaceC583240MuA
            public final int LIZIZ(C0N23 c0n23) {
                AbstractC2192061Aqi abstractC2192061Aqi;
                C2258751Daz c2258751Daz = this.LIZ.LIZIZ.get(c0n23);
                if (c2258751Daz != null && (abstractC2192061Aqi = c2258751Daz.LJIIIIZZ) != null) {
                    return abstractC2192061Aqi.LIZJ().intValue();
                }
                return 1;
            }
        };
    }

    @Override // X.InterfaceC583230Mu9
    public final InterfaceC581670Mrd LJIIJ() {
        return (InterfaceC581670Mrd) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC588960N8c
    public final void LIZIZ(InterfaceC2258681Das interfaceC2258681Das) {
        boolean z;
        String strLIZJ = interfaceC2258681Das.LIZJ();
        WeakReference<InterfaceC2258681Das> weakReference = this.LJFF.LIZIZ.get(strLIZJ);
        if (weakReference != null && weakReference.get() != null) {
            z = true;
        } else {
            z = false;
        }
        C589080N8o.LJ(this, null, new C1DTL(strLIZJ, z, this.LJFF.LIZIZ()));
        this.LJFF.LIZIZ.put(strLIZJ, new WeakReference<>(interfaceC2258681Das));
        this.LJFF.LIZLLL("Add");
    }

    @Override // X.InterfaceC588960N8c
    public final void LIZJ(String str) {
        InterfaceC2258651Dap interfaceC2258651Dap;
        C589080N8o.LJ(this, null, new AwS18S1001000_35(str, this.LJ.LIZIZ(), 2));
        List<InterfaceC2258651Dap> listLIZJ = this.LJ.LIZJ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZJ) {
            if (Intrinsics.LJFF(((InterfaceC2258651Dap) obj).LJ(), str)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strLIZJ = ((InterfaceC2258651Dap) it2.next()).LIZJ();
            C589080N8o.LJ(this, null, new AwS87S1000000_2(strLIZJ, 40));
            WeakReference<InterfaceC2258651Dap> weakReferenceRemove = this.LJ.LIZIZ.remove(strLIZJ);
            if (weakReferenceRemove != null) {
                interfaceC2258651Dap = weakReferenceRemove.get();
            } else {
                interfaceC2258651Dap = null;
            }
            InterfaceC2258651Dap interfaceC2258651Dap2 = interfaceC2258651Dap;
            if (interfaceC2258651Dap2 != null) {
                interfaceC2258651Dap2.LJIILLIIL();
            }
        }
    }

    @Override // X.InterfaceC588960N8c
    public final void LIZLLL(InterfaceC2258651Dap interfaceC2258651Dap) {
        String strLIZJ = interfaceC2258651Dap.LIZJ();
        C589080N8o.LJ(this, null, new AwS18S1001000_35(strLIZJ, this.LJI.LIZIZ(), 1));
        this.LJI.LIZIZ.put(strLIZJ, new WeakReference<>(interfaceC2258651Dap));
        this.LJI.LIZLLL("Add");
    }

    @Override // X.InterfaceC588960N8c
    public final void LJFF(String str) {
        boolean z;
        WeakReference<InterfaceC2258681Das> weakReference = this.LJFF.LIZIZ.get(str);
        InterfaceC2258681Das interfaceC2258681Das = null;
        if (weakReference != null && weakReference.get() != null) {
            z = true;
        } else {
            z = false;
        }
        C589080N8o.LJ(this, null, new AwS0S1011000_35(str, z, this.LJFF.LIZIZ(), 1));
        WeakReference<InterfaceC2258681Das> weakReferenceRemove = this.LJFF.LIZIZ.remove(str);
        if (weakReferenceRemove != null) {
            interfaceC2258681Das = weakReferenceRemove.get();
        }
        InterfaceC2258681Das interfaceC2258681Das2 = interfaceC2258681Das;
        if (interfaceC2258681Das2 != null) {
            interfaceC2258681Das2.LJIILLIIL();
        }
        this.LJFF.LIZLLL("Remove");
    }

    @Override // X.InterfaceC588960N8c
    public final void LJI(String str) {
        boolean z;
        WeakReference<InterfaceC2258681Das> weakReference = this.LJII.LIZIZ.get(str);
        InterfaceC2258681Das interfaceC2258681Das = null;
        if (weakReference != null && weakReference.get() != null) {
            z = true;
        } else {
            z = false;
        }
        C589080N8o.LJ(this, null, new AwS0S1011000_35(str, z, this.LJII.LIZIZ(), 2));
        WeakReference<InterfaceC2258681Das> weakReferenceRemove = this.LJII.LIZIZ.remove(str);
        if (weakReferenceRemove != null) {
            interfaceC2258681Das = weakReferenceRemove.get();
        }
        InterfaceC2258681Das interfaceC2258681Das2 = interfaceC2258681Das;
        if (interfaceC2258681Das2 != null) {
            interfaceC2258681Das2.LJIILLIIL();
        }
    }

    @Override // X.InterfaceC588960N8c
    public final void LJIIIIZZ(String str) {
        InterfaceC2258651Dap interfaceC2258651Dap = null;
        C589080N8o.LJ(this, null, new AwS87S1000000_2(str, 2));
        WeakReference<InterfaceC2258651Dap> weakReferenceRemove = this.LJI.LIZIZ.remove(str);
        if (weakReferenceRemove != null) {
            interfaceC2258651Dap = weakReferenceRemove.get();
        }
        InterfaceC2258651Dap interfaceC2258651Dap2 = interfaceC2258651Dap;
        if (interfaceC2258651Dap2 != null) {
            interfaceC2258651Dap2.LJIILLIIL();
        }
    }

    @Override // X.InterfaceC588960N8c
    public final void LJIIIZ(InterfaceC2258651Dap interfaceC2258651Dap) {
        String strLIZJ = interfaceC2258651Dap.LIZJ();
        C589080N8o.LJ(this, null, new AwS18S1001000_35(strLIZJ, this.LJ.LIZIZ(), 0));
        this.LJ.LIZIZ.put(strLIZJ, new WeakReference<>(interfaceC2258651Dap));
        this.LJ.LIZLLL("Add");
    }

    @Override // X.InterfaceC588960N8c
    public final void LJIIJJI(InterfaceC2258681Das interfaceC2258681Das) {
        boolean z;
        String strLIZJ = interfaceC2258681Das.LIZJ();
        WeakReference<InterfaceC2258681Das> weakReference = this.LJII.LIZIZ.get(strLIZJ);
        if (weakReference != null && weakReference.get() != null) {
            z = true;
        } else {
            z = false;
        }
        C589080N8o.LJ(this, null, new AwS0S1011000_35(strLIZJ, z, this.LJII.LIZIZ(), 0));
        this.LJII.LIZIZ.put(strLIZJ, new WeakReference<>(interfaceC2258681Das));
        this.LJII.LIZLLL("Add");
    }

    @Override // X.C0N9Q
    public final void LJIIL(C0N2B<MeasurementContext> c0n2b) {
        Object c098200Yq;
        try {
            c0n2b.LIZ(this);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C589080N8o.LIZLLL(this, null, new AwS553S0100000_9(thM5exceptionOrNullimpl, 72));
        }
    }

    public final void LJIILIIL(C0N23 c0n23) {
        if (this.LIZIZ.get(c0n23) != null) {
            C2258751Daz c2258751DazRemove = this.LIZIZ.remove(c0n23);
            MeasurementDependencyModules.LIZ.getClass();
            C04TF.LIZ().isDebug();
            if (c2258751DazRemove != null) {
                c2258751DazRemove.LJI.LJIIJ(null);
                c2258751DazRemove.LJII.LJIIL(null);
                c2258751DazRemove.LJI.LJIILLIIL();
                c2258751DazRemove.LJII.LJIILLIIL();
                AbstractC2258621Dam abstractC2258621Dam = c2258751DazRemove.LJIIJJI;
                InterfaceC1065950dqT interfaceC1065950dqT = abstractC2258621Dam.LJFF;
                if (interfaceC1065950dqT != null) {
                    abstractC2258621Dam.LJ.LIZ(interfaceC1065950dqT);
                }
                abstractC2258621Dam.LJFF = null;
            }
        }
    }

    @Override // X.C0N27
    public final void LIZ(C0N26 c0n26, C0N23 c0n23) {
        LJIILIIL(c0n23);
        long j = c0n23.LIZIZ;
        C589080N8o.LJ(this, null, new AwS553S0100000_9(c0n26, 70));
        C589080N8o.LJ(this, null, new AwS65S0100100_9(c0n23, j, 0));
        if (j < 1) {
            j = 1;
        }
        C13BS c13bsLIZ = C13BW.LIZ(j);
        C2258691Dat c2258691Dat = new C2258691Dat(c0n23, this.LJ);
        c2258691Dat.LIZ();
        C2258731Dax c2258731Dax = new C2258731Dax(c0n23, this.LJFF);
        c2258731Dax.LJIJJLI();
        AbstractC2192061Aqi abstractC2192061Aqi = new AbstractC2192061Aqi() { // from class: X.1Aqp
            @Override // X.C0N86
            public final void LIZLLL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N87
            public final void LJI(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N87
            public final void LJII(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LJIILIIL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LJIILL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N87
            public final void LJFF(C0N23 c0n232, String str, Map map) {
                this.LJ.set(1);
            }

            @Override // X.C0N87
            public final void LJIIZILJ(C0N23 c0n232, String str, Map map) {
                this.LJ.set(1);
            }
        };
        AbstractC2200351B9t abstractC2200351B9t = new AbstractC2200351B9t() { // from class: X.1B9v
            @Override // X.C0N87
            public final void LJI(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N87
            public final void LJII(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LJIILL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LIZLLL(C0N23 c0n232, String str, Map map) {
                LIZJ();
            }

            @Override // X.C0N87
            public final void LJFF(C0N23 c0n232, String str, Map map) {
                LIZJ();
            }

            @Override // X.C0N86
            public final void LJIILIIL(C0N23 c0n232, String str, Map map) {
                LIZJ();
            }

            @Override // X.C0N87
            public final void LJIIZILJ(C0N23 c0n232, String str, Map map) {
                LIZJ();
            }
        };
        C19980713Ft c19980713Ft = new C19980713Ft(c0n23);
        C2258761Db0 c2258761Db0 = new C2258761Db0(c2258731Dax, abstractC2192061Aqi, c19980713Ft, c13bsLIZ);
        final C1065990dqX c1065990dqX = (C1065990dqX) this.LIZJ.getValue();
        AbstractC2258621Dam abstractC2258621Dam = new AbstractC2258621Dam(c1065990dqX) { // from class: X.1Dal
            @Override // X.C0N86
            public final void LIZLLL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LJIILL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N87
            public final void LJFF(C0N23 c0n232, String str, Map map) {
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZIZ(interfaceC1065950dqT);
                }
            }

            @Override // X.C0N87
            public final void LJI(C0N23 c0n232, String str, Map map) {
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZIZ(interfaceC1065950dqT);
                }
            }

            @Override // X.C0N87
            public final void LJII(C0N23 c0n232, String str, Map map) {
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZ(interfaceC1065950dqT);
                }
            }

            @Override // X.C0N86
            public final void LJIILIIL(C0N23 c0n232, String str, Map map) {
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZIZ(interfaceC1065950dqT);
                }
            }

            @Override // X.C0N87
            public final void LJIIZILJ(C0N23 c0n232, String str, Map map) {
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZ(interfaceC1065950dqT);
                }
            }
        };
        ConcurrentHashMap<C0N23, C2258751Daz> concurrentHashMap = this.LIZIZ;
        MeasurementContextModules.LIZ.getClass();
        concurrentHashMap.put(c0n23, new C2258751Daz(c0n23, c0n26, c2258691Dat, c2258731Dax, abstractC2192061Aqi, abstractC2200351B9t, c19980713Ft, c2258761Db0, abstractC2258621Dam, C0N8K.LIZIZ.getValue().LIZIZ(c0n26)));
    }

    @Override // X.C0N27
    public final void LJ(final C0N29 c0n29, C0N23 c0n23) {
        LJIILIIL(c0n23);
        long j = c0n23.LIZIZ;
        C589080N8o.LJ(this, null, new AwS553S0100000_9(c0n29, 71));
        C589080N8o.LJ(this, null, new AwS65S0100100_9(c0n23, j, 1));
        if (j < 1) {
            j = 1;
        }
        C13BS c13bsLIZ = C13BW.LIZ(j);
        C2258701Dau c2258701Dau = new C2258701Dau(c0n23, this.LJI, this.LJ);
        c2258701Dau.LIZ();
        C2258721Daw c2258721Daw = new C2258721Daw(c0n23, c0n29, this.LJII, this.LJFF);
        c2258721Daw.LJIJJLI();
        AbstractC2192061Aqi abstractC2192061Aqi = new AbstractC2192061Aqi(c0n29) { // from class: X.1Aqq
            public final C0N29 LJFF;

            @Override // X.C0N86
            public final void LIZLLL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N87
            public final void LJI(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N87
            public final void LJII(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LJIILIIL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LJIILL(C0N23 c0n232, String str, Map map) {
            }

            {
                this.LJFF = c0n29;
            }

            @Override // X.C0N87
            public final void LJFF(C0N23 c0n232, String str, Map map) {
                if (Intrinsics.LJFF(str, this.LJFF.LIZIZ)) {
                    return;
                }
                this.LJ.set(1);
            }

            @Override // X.C0N87
            public final void LJIIZILJ(C0N23 c0n232, String str, Map map) {
                this.LJ.set(1);
            }
        };
        AbstractC2200351B9t abstractC2200351B9t = new AbstractC2200351B9t(c0n29) { // from class: X.1B9u
            public final C0N29 LJFF;

            @Override // X.C0N87
            public final void LJI(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N87
            public final void LJII(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LJIILL(C0N23 c0n232, String str, Map map) {
            }

            {
                this.LJFF = c0n29;
            }

            @Override // X.C0N86
            public final void LIZLLL(C0N23 c0n232, String str, Map map) {
                LIZJ();
            }

            @Override // X.C0N87
            public final void LJFF(C0N23 c0n232, String str, Map map) {
                if (Intrinsics.LJFF(str, this.LJFF.LIZIZ)) {
                    return;
                }
                LIZJ();
            }

            @Override // X.C0N86
            public final void LJIILIIL(C0N23 c0n232, String str, Map map) {
                LIZJ();
            }

            @Override // X.C0N87
            public final void LJIIZILJ(C0N23 c0n232, String str, Map map) {
                LIZJ();
            }
        };
        C19980713Ft c19980713Ft = new C19980713Ft(c0n23);
        C2258761Db0 c2258761Db0 = new C2258761Db0(c2258721Daw, abstractC2192061Aqi, c19980713Ft, c13bsLIZ);
        final C1065990dqX c1065990dqX = (C1065990dqX) this.LIZJ.getValue();
        AbstractC2258621Dam abstractC2258621Dam = new AbstractC2258621Dam(c0n29, c1065990dqX) { // from class: X.1Daj
            public final C0N29 LJI;

            @Override // X.C0N86
            public final void LIZLLL(C0N23 c0n232, String str, Map map) {
            }

            @Override // X.C0N86
            public final void LJIILL(C0N23 c0n232, String str, Map map) {
            }

            {
                super(c1065990dqX);
                this.LJI = c0n29;
            }

            @Override // X.C0N87
            public final void LJFF(C0N23 c0n232, String str, Map map) {
                if (Intrinsics.LJFF(str, this.LJI.LIZ)) {
                    C589080N8o.LIZLLL(this, null, AFwS226S0000000_35.get$arr$(805));
                    return;
                }
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZIZ(interfaceC1065950dqT);
                }
            }

            @Override // X.C0N87
            public final void LJI(C0N23 c0n232, String str, Map map) {
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZIZ(interfaceC1065950dqT);
                }
            }

            @Override // X.C0N87
            public final void LJII(C0N23 c0n232, String str, Map map) {
                if (Intrinsics.LJFF(str, this.LJI.LIZIZ)) {
                    C589080N8o.LIZLLL(this, null, AFwS226S0000000_35.get$arr$(806));
                    return;
                }
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZ(interfaceC1065950dqT);
                }
            }

            @Override // X.C0N86
            public final void LJIILIIL(C0N23 c0n232, String str, Map map) {
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZIZ(interfaceC1065950dqT);
                }
            }

            @Override // X.C0N87
            public final void LJIIZILJ(C0N23 c0n232, String str, Map map) {
                InterfaceC1065950dqT interfaceC1065950dqT = this.LJFF;
                if (interfaceC1065950dqT != null) {
                    this.LJ.LIZ(interfaceC1065950dqT);
                }
            }
        };
        ConcurrentHashMap<C0N23, C2258751Daz> concurrentHashMap = this.LIZIZ;
        MeasurementContextModules.LIZ.getClass();
        concurrentHashMap.put(c0n23, new C2258751Daz(c0n23, c0n29, c2258701Dau, c2258721Daw, abstractC2192061Aqi, abstractC2200351B9t, c19980713Ft, c2258761Db0, abstractC2258621Dam, C0N8K.LIZIZ.getValue().LIZIZ(c0n29)));
    }
}
