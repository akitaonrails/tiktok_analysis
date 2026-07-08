package com.bytedance.assem.arch.core;

import X.AbstractC1155604fa;
import X.AbstractC738140SxQ;
import X.AbstractC738410Sxr;
import X.C01GW;
import X.C09R7;
import X.C0RTF;
import X.C0RTG;
import X.C0RTK;
import X.C0RTL;
import X.C0RTY;
import X.C1236804sg;
import X.C13IQ;
import X.C1733406qa;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C723440SZi;
import X.C723480SZm;
import X.C723800SaI;
import X.C723980Saa;
import X.C723990Sab;
import X.C724000Sac;
import X.C724010Sad;
import X.C724020Sae;
import X.C724030Saf;
import X.C724040Sag;
import X.C724050Sah;
import X.C724060Sai;
import X.C724240Sb0;
import X.C724710Sbl;
import X.C725080ScM;
import X.C725250Scd;
import X.C725430Scv;
import X.C725450Scx;
import X.C725480Sd0;
import X.C786410Ut5;
import X.InterfaceC723720SaA;
import X.InterfaceC724230Saz;
import X.InterfaceC725440Scw;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS242S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class AssemSupervisor implements LifecycleEventObserver, C0RTK, InterfaceC724230Saz {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final C0RTY LL;
    public final C724710Sbl LLILLJJLI;
    public C723800SaI LLILZ;
    public final LifecycleOwner LLJ;
    public final Context LLJIJIL;
    public volatile boolean LLJILJIL;
    public boolean LLJILJILJ;
    public View LLJJIII;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C724030Saf());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C724000Sac(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C724010Sad(this));
    public final String LLIZ = "AssemSupervisor";
    public final C0RTF LLIZLLLIL = new C0RTF();
    public final C01GW LLJI = C452501pT.LIZIZ(new C724050Sah(this));
    public final CopyOnWriteArrayList<AbstractC738140SxQ> LLJILLL = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<Object, C0RTL> LLJJ = new ConcurrentHashMap<>();
    public final C01GW LLJJI = C452501pT.LIZIZ(new C724020Sae());

    public final void LIZJ() {
        if (!C725080ScM.LJIIZILJ) {
            LJ().LIZ();
        }
        C724710Sbl c724710SblLJFF = LJFF();
        ((LinkedHashMap) c724710SblLJFF.LIZIZ).clear();
        ((LinkedHashMap) c724710SblLJFF.LIZJ).clear();
        this.LLJILLL.clear();
        this.LLJJ.clear();
        LJI().removeObserver(this);
        this.LLJJIII = null;
    }

    public final List<AbstractC738140SxQ> LIZLLL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = this.LLJILLL;
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            AbstractC738140SxQ abstractC738140SxQ2 = abstractC738140SxQ;
            if (abstractC738140SxQ2.hasLoaded && abstractC738140SxQ2.active) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        return arrayList;
    }

    public final C0RTY LJ() {
        return (C0RTY) this.LLILZIL.getValue();
    }

    public final C724710Sbl LJFF() {
        return (C724710Sbl) this.LLILZLL.getValue();
    }

    public final Lifecycle LJI() {
        return (C725080ScM.LJII ? (LifecycleOwner) this.LLJI.getValue() : this.LLJ).getLifecycle();
    }

    public final void LJIIIIZZ() {
        String str = this.LLIZ;
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this);
                    sbLIZ.append(" onDestroy: clear dataStore ");
                    sbLIZ.append(LJ());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log(str, strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Iterator<AbstractC738140SxQ> it2 = this.LLJILLL.iterator();
        while (it2.hasNext()) {
            C723990Sab.LIZ(Lifecycle.State.DESTROYED, it2.next());
        }
        LIZJ();
    }

    @Override // X.C0RTK
    public final Map<AbstractC1155604fa<?>, C0RTG<?>> ff() {
        return this.LLIZLLLIL.LL;
    }

    @Override // X.InterfaceC724230Saz
    public final void LIZ(AbstractC738140SxQ abstractC738140SxQ) {
        if (LJI().getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            LIZIZ(abstractC738140SxQ);
        } else {
            "assembler parent is already destroyed!".toString();
            throw new IllegalArgumentException("assembler parent is already destroyed!");
        }
    }

    public final void LIZIZ(AbstractC738140SxQ abstractC738140SxQ) {
        String str = this.LLIZ;
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attachToParentLifecycle for ");
                    sbLIZ.append(abstractC738140SxQ);
                    sbLIZ.append(", isMainThread > ");
                    sbLIZ.append(Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()));
                    sbLIZ.append(", isLifecycleAdded: ");
                    sbLIZ.append(this.LLJILJIL);
                    sbLIZ.append(", supervisor: ");
                    sbLIZ.append(this);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log(str, strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        final C723980Saa c723980Saa = new C723980Saa(abstractC738140SxQ, this);
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            c723980Saa.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LLJJI.getValue(), new Runnable() { // from class: X.0RTX
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AssemSupervisor@cf2d.attachToParentLifecycle$2");
                    try {
                        c723980Saa.invoke();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AssemSupervisor@cf2d.attachToParentLifecycle$2");
                }
            });
        }
    }

    @Override // X.C0RTK
    public final void Zf(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        this.LLIZLLLIL.Zf(map);
    }

    private final void onStateChanged$redex$base(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        String str = this.LLIZ;
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onStateChanged, event: ");
                    sbLIZ.append(event);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log(str, strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        switch (C1733406qa.LIZ[event.ordinal()]) {
            case 1:
                String str2 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA2 != null) {
                            int i2 = C2187451AjH.LIZ;
                            interfaceC723720SaA2.log(str2, "onCreate");
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = this.LLJILLL;
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                    if (abstractC738140SxQ.active) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C723990Sab.LIZ(Lifecycle.State.CREATED, (AbstractC738140SxQ) it2.next());
                }
                break;
            case 2:
                String str3 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA3 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA3 != null) {
                            int i3 = C2187451AjH.LIZ;
                            interfaceC723720SaA3.log(str3, "onStart");
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2 = this.LLJILLL;
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList2) {
                    AbstractC738140SxQ abstractC738140SxQ3 = abstractC738140SxQ2;
                    if (abstractC738140SxQ3.active && abstractC738140SxQ3.hasLoaded) {
                        arrayList2.add(abstractC738140SxQ2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C723990Sab.LIZ(Lifecycle.State.STARTED, (AbstractC738140SxQ) it3.next());
                }
                break;
            case 3:
                String str4 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA4 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA4 != null) {
                            int i4 = C2187451AjH.LIZ;
                            interfaceC723720SaA4.log(str4, "onResume");
                        }
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList3 = this.LLJILLL;
                ArrayList arrayList3 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ4 : copyOnWriteArrayList3) {
                    AbstractC738140SxQ abstractC738140SxQ5 = abstractC738140SxQ4;
                    if (abstractC738140SxQ5.active && abstractC738140SxQ5.hasLoaded) {
                        arrayList3.add(abstractC738140SxQ4);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C723990Sab.LIZ(Lifecycle.State.RESUMED, (AbstractC738140SxQ) it4.next());
                }
                break;
            case 4:
                String str5 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA5 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA5 != null) {
                            int i5 = C2187451AjH.LIZ;
                            interfaceC723720SaA5.log(str5, "onPause");
                        }
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList4 = this.LLJILLL;
                ArrayList arrayList4 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ6 : copyOnWriteArrayList4) {
                    AbstractC738140SxQ abstractC738140SxQ7 = abstractC738140SxQ6;
                    if (abstractC738140SxQ7.active && abstractC738140SxQ7.hasLoaded) {
                        arrayList4.add(abstractC738140SxQ6);
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    C723990Sab.LIZ(Lifecycle.State.STARTED, (AbstractC738140SxQ) it5.next());
                }
                break;
            case 5:
                String str6 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA6 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA6 != null) {
                            int i6 = C2187451AjH.LIZ;
                            interfaceC723720SaA6.log(str6, "onStop");
                        }
                    } catch (Throwable th6) {
                        TryCatchGuardChecker.doCheck(th6);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList5 = this.LLJILLL;
                ArrayList arrayList5 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ8 : copyOnWriteArrayList5) {
                    AbstractC738140SxQ abstractC738140SxQ9 = abstractC738140SxQ8;
                    if (abstractC738140SxQ9.active && abstractC738140SxQ9.hasLoaded) {
                        arrayList5.add(abstractC738140SxQ8);
                    }
                }
                Iterator it6 = arrayList5.iterator();
                while (it6.hasNext()) {
                    C723990Sab.LIZ(Lifecycle.State.CREATED, (AbstractC738140SxQ) it6.next());
                }
                break;
            case 6:
                LJIIIIZZ();
                break;
        }
    }

    private final void onStateChanged$redex$opt(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        String str = this.LLIZ;
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onStateChanged, event: ");
                    sbLIZ.append(event);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log(str, strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        switch (C1733406qa.LIZ[event.ordinal()]) {
            case 1:
                String str2 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA2 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA2 != null) {
                            int i2 = C2187451AjH.LIZ;
                            interfaceC723720SaA2.log(str2, "onCreate");
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = this.LLJILLL;
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                    if (abstractC738140SxQ.active) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                int i3 = 0;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    C723990Sab.LIZ(Lifecycle.State.CREATED, (AbstractC738140SxQ) obj);
                }
                break;
            case 2:
                String str3 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA3 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA3 != null) {
                            int i4 = C2187451AjH.LIZ;
                            interfaceC723720SaA3.log(str3, "onStart");
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2 = this.LLJILLL;
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList2) {
                    AbstractC738140SxQ abstractC738140SxQ3 = abstractC738140SxQ2;
                    if (abstractC738140SxQ3.active && abstractC738140SxQ3.hasLoaded) {
                        arrayList2.add(abstractC738140SxQ2);
                    }
                }
                int i5 = 0;
                int size2 = arrayList2.size();
                while (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    C723990Sab.LIZ(Lifecycle.State.STARTED, (AbstractC738140SxQ) obj2);
                }
                break;
            case 3:
                String str4 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA4 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA4 != null) {
                            int i6 = C2187451AjH.LIZ;
                            interfaceC723720SaA4.log(str4, "onResume");
                        }
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList3 = this.LLJILLL;
                ArrayList arrayList3 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ4 : copyOnWriteArrayList3) {
                    AbstractC738140SxQ abstractC738140SxQ5 = abstractC738140SxQ4;
                    if (abstractC738140SxQ5.active && abstractC738140SxQ5.hasLoaded) {
                        arrayList3.add(abstractC738140SxQ4);
                    }
                }
                int i7 = 0;
                int size3 = arrayList3.size();
                while (i7 < size3) {
                    Object obj3 = arrayList3.get(i7);
                    i7++;
                    C723990Sab.LIZ(Lifecycle.State.RESUMED, (AbstractC738140SxQ) obj3);
                }
                break;
            case 4:
                String str5 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA5 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA5 != null) {
                            int i8 = C2187451AjH.LIZ;
                            interfaceC723720SaA5.log(str5, "onPause");
                        }
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList4 = this.LLJILLL;
                ArrayList arrayList4 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ6 : copyOnWriteArrayList4) {
                    AbstractC738140SxQ abstractC738140SxQ7 = abstractC738140SxQ6;
                    if (abstractC738140SxQ7.active && abstractC738140SxQ7.hasLoaded) {
                        arrayList4.add(abstractC738140SxQ6);
                    }
                }
                int i9 = 0;
                int size4 = arrayList4.size();
                while (i9 < size4) {
                    Object obj4 = arrayList4.get(i9);
                    i9++;
                    C723990Sab.LIZ(Lifecycle.State.STARTED, (AbstractC738140SxQ) obj4);
                }
                break;
            case 5:
                String str6 = this.LLIZ;
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA6 = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA6 != null) {
                            int i10 = C2187451AjH.LIZ;
                            interfaceC723720SaA6.log(str6, "onStop");
                        }
                    } catch (Throwable th6) {
                        TryCatchGuardChecker.doCheck(th6);
                    }
                }
                CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList5 = this.LLJILLL;
                ArrayList arrayList5 = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ8 : copyOnWriteArrayList5) {
                    AbstractC738140SxQ abstractC738140SxQ9 = abstractC738140SxQ8;
                    if (abstractC738140SxQ9.active && abstractC738140SxQ9.hasLoaded) {
                        arrayList5.add(abstractC738140SxQ8);
                    }
                }
                int i11 = 0;
                int size5 = arrayList5.size();
                while (i11 < size5) {
                    Object obj5 = arrayList5.get(i11);
                    i11++;
                    C723990Sab.LIZ(Lifecycle.State.CREATED, (AbstractC738140SxQ) obj5);
                }
                break;
            case 6:
                LJIIIIZZ();
                break;
        }
    }

    public final boolean LJII(AbstractC738140SxQ abstractC738140SxQ, AbstractC738410Sxr abstractC738410Sxr) {
        if (LJI().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
            if (interfaceC723720SaA != null) {
                if (!C725080ScM.LJIILJJIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("loadAssem return: ");
                    sbLIZ.append(this);
                    sbLIZ.append(", ");
                    sbLIZ.append(LJI().getCurrentState());
                    sbLIZ.append(", ");
                    sbLIZ.append(abstractC738140SxQ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ);
                    return false;
                }
                if (!C725080ScM.LIZLLL) {
                    return false;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("loadAssem return: ");
                sbLIZ2.append(this);
                sbLIZ2.append(", ");
                sbLIZ2.append(LJI().getCurrentState());
                sbLIZ2.append(", ");
                sbLIZ2.append(abstractC738140SxQ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ2);
                return false;
            }
            return false;
        }
        if (!this.LLJILLL.contains(abstractC738140SxQ)) {
            String strValueOf = String.valueOf(abstractC738140SxQ.hashCode());
            C725250Scd c725250Scd = C725250Scd.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c725250Scd);
                    }
                }
                if (C725480Sd0.LIZ(c725250Scd)) {
                    C725430Scv.LIZ(new C723480SZm(c725250Scd, strValueOf, SystemClock.elapsedRealtimeNanos()));
                }
            }
            abstractC738140SxQ.setSupervisor(this);
            abstractC738140SxQ.setParent(this.LLJ);
            if (abstractC738410Sxr != null) {
                abstractC738140SxQ.setInteractor(abstractC738410Sxr);
                abstractC738410Sxr.LL = abstractC738140SxQ;
                Iterator it3 = ((List) abstractC738410Sxr.LLILLJJLI.getValue()).iterator();
                while (it3.hasNext()) {
                    ((Function0) it3.next()).invoke();
                }
                ((List) abstractC738410Sxr.LLILLJJLI.getValue()).clear();
            }
            this.LLJILLL.add(abstractC738140SxQ);
            if (abstractC738140SxQ.active) {
                abstractC738140SxQ.hasLoaded = true;
            }
            C724040Sag.LIZ((List) this.LLILLL.getValue(), new C724060Sai(abstractC738140SxQ));
            C725250Scd c725250Scd2 = C725250Scd.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                if (arrayList2.size() > 0) {
                    Iterator<InterfaceC725440Scw> it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        it4.next().onEventEnd(c725250Scd2);
                    }
                }
                if (C725480Sd0.LIZ(c725250Scd2)) {
                    C725430Scv.LIZ(new C723440SZi(c725250Scd2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())));
                }
            }
            return true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("This assem has already existed: ");
        sbLIZ3.append(abstractC738140SxQ);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        strLIZIZ3.toString();
        throw new IllegalStateException(strLIZIZ3);
    }

    public final boolean LJIIIZ(String str, C13IQ c13iq) {
        String str2 = this.LLIZ;
        if (C725080ScM.LIZLLL) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unloadAssem for ");
                    sbLIZ.append(c13iq);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log(str2, strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (LJI().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            return false;
        }
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = this.LLJILLL;
        ArrayList<AbstractC738140SxQ> arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ.getClass().isAssignableFrom(C09R7.LIZ(c13iq))) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        if (C725080ScM.LJII) {
            for (AbstractC738140SxQ abstractC738140SxQ2 : arrayList) {
                if (str == null || Intrinsics.LJFF(abstractC738140SxQ2.assemTagInternal, str)) {
                    if (!(abstractC738140SxQ2 instanceof ReusedAssem)) {
                        ArrayList arrayList2 = new ArrayList();
                        C1236804sg.LIZ(abstractC738140SxQ2, arrayList2);
                        if (LJI().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                            abstractC738140SxQ2.handleOnPause$assem_release();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((AbstractC738140SxQ) it2.next()).handleOnPause$assem_release();
                            }
                        }
                        if (LJI().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                            abstractC738140SxQ2.handleOnStop$assem_release();
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                ((AbstractC738140SxQ) it3.next()).handleOnStop$assem_release();
                            }
                        }
                        if (LJI().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                            abstractC738140SxQ2.handleOnDestroy$assem_release();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ((AbstractC738140SxQ) it4.next());
                                if (assemSupervisorLJ != null) {
                                    arrayList3.add(assemSupervisorLJ);
                                }
                            }
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                ((AbstractC738140SxQ) it5.next()).handleOnDestroy$assem_release();
                            }
                            Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                ((AssemSupervisor) it6.next()).LIZJ();
                            }
                        }
                        this.LLJILLL.remove(abstractC738140SxQ2);
                    } else {
                        "ReusedAssem is not support unload!".toString();
                        throw new IllegalStateException("ReusedAssem is not support unload!");
                    }
                }
            }
        } else {
            for (AbstractC738140SxQ abstractC738140SxQ3 : arrayList) {
                if (str == null || Intrinsics.LJFF(abstractC738140SxQ3.assemTagInternal, str)) {
                    if (!(abstractC738140SxQ3 instanceof ReusedAssem)) {
                        if (LJI().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                            abstractC738140SxQ3.handleOnPause$assem_release();
                        }
                        if (LJI().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                            abstractC738140SxQ3.handleOnStop$assem_release();
                        }
                        if (LJI().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                            abstractC738140SxQ3.handleOnDestroy$assem_release();
                        }
                        this.LLJILLL.remove(abstractC738140SxQ3);
                    } else {
                        "ReusedAssem is not support unload!".toString();
                        throw new IllegalStateException("ReusedAssem is not support unload!");
                    }
                }
            }
        }
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            C724040Sag.LIZ((List) this.LLILLL.getValue(), new AwS242S0000000_11((AbstractC738140SxQ) it7.next(), 0));
        }
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!ReDexExperimentOpt.getAbTest()) {
            onStateChanged$redex$base(lifecycleOwner, event);
        } else {
            onStateChanged$redex$opt(lifecycleOwner, event);
        }
    }

    public AssemSupervisor(LifecycleOwner lifecycleOwner, Context context, C0RTY c0rty, C724710Sbl c724710Sbl) {
        this.LL = c0rty;
        this.LLILLJJLI = c724710Sbl;
        this.LLJ = lifecycleOwner;
        this.LLJIJIL = context;
    }
}
