package com.bytedance.ext_power_list;

import X.C01GW;
import X.C0RC9;
import X.C0RDF;
import X.C0RDI;
import X.C0RF2;
import X.C0RF3;
import X.C0SDO;
import X.C0SMN;
import X.C0SMO;
import X.C0SZS;
import X.C0SZU;
import X.C0SZY;
import X.C0SZZ;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C481320IuA;
import X.C723360SZa;
import X.C723380SZc;
import X.C723390SZd;
import X.C723400SZe;
import X.C723430SZh;
import X.C723450SZj;
import X.C723850SaN;
import X.C724240Sb0;
import X.C725080ScM;
import X.C725240Scc;
import X.C725310Scj;
import X.C725350Scn;
import X.C725430Scv;
import X.C725450Scx;
import X.C725480Sd0;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import X.InterfaceC719640SKs;
import X.InterfaceC723410SZf;
import X.InterfaceC723720SaA;
import X.InterfaceC725440Scw;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS1S1110100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AssemReusedContainer<R extends C0SMO<R, ITEM>, ITEM extends InterfaceC1587906Jp> implements C0SMN<R, ITEM> {
    public final C0RF2<? extends C0SMO<?, ?>, ? extends InterfaceC1587906Jp> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C723390SZd());
    public final boolean LLILLL = true;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C723380SZc(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C723360SZa(this));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C0RDI());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C723400SZe());
    public C0SZS<R, ITEM> LLIZLLLIL;
    public InterfaceC719640SKs LLJ;
    public final C01GW LLJI;
    public final ViewModelStore LLJIJIL;
    public boolean LLJILJIL;

    public abstract ReusedUIAssem<?> LLILLJJLI();

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        return null;
    }

    public InterfaceC665370Q7z k0() {
        return null;
    }

    private final void LLJJL() {
        Lifecycle lifecycle;
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            if (!C725080ScM.LJIILJJIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryObserveLifecycle: ");
                sbLIZ.append(this);
                sbLIZ.append(", ");
                LifecycleOwner lifecycleOwnerLLILZ = LLILZ();
                sbLIZ.append(lifecycleOwnerLLILZ != null ? lifecycleOwnerLLILZ.getLifecycle() : null);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ);
            } else if (C725080ScM.LIZLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tryObserveLifecycle: ");
                sbLIZ2.append(this);
                sbLIZ2.append(", ");
                LifecycleOwner lifecycleOwnerLLILZ2 = LLILZ();
                sbLIZ2.append(lifecycleOwnerLLILZ2 != null ? lifecycleOwnerLLILZ2.getLifecycle() : null);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ2);
            }
        }
        if (this.LLJILJIL) {
            return;
        }
        LifecycleOwner lifecycleOwnerLLILZ3 = LLILZ();
        if (lifecycleOwnerLLILZ3 != null && (lifecycle = lifecycleOwnerLLILZ3.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.LLJILJIL = true;
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLILZIL.getValue();
    }

    @Override // X.C0SMN
    public final C0RDF C41() {
        return (C0RDF) this.LLILZLL.getValue();
    }

    @Override // X.C0SMN
    public final AssemReusedDispatcher<R, ITEM> LJJJLL() {
        return (AssemReusedDispatcher) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILZ.getValue();
    }

    @Override // X.C0SMN
    public ReusedUIAssem<?> NG1() {
        return (ReusedUIAssem) this.LLJI.getValue();
    }

    @Override // X.C0SMN
    public final void wY0() {
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            if (!C725080ScM.LJIILJJIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unReusedBind: ");
                sbLIZ.append(this);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ);
            } else if (C725080ScM.LIZLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("unReusedBind: ");
                sbLIZ2.append(this);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ2);
            }
        }
        LJJJLL().LIZIZ();
    }

    public LifecycleOwner LLILZ() {
        return E82();
    }

    @Override // X.C0SMO
    public final C0SZU<R, ITEM> getChild() {
        LJJJLL().getClass();
        return new C723450SZj();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    public final void LLJILJILJ() {
        LLJJL();
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return this.LLILLL;
    }

    @Override // X.C0SMO
    public final C0SZS<R, ITEM> getProxy() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0SMN
    public final ViewModelStore md1() {
        return this.LLJIJIL;
    }

    public AssemReusedContainer(C0RF2<? extends C0SMO<?, ?>, ? extends InterfaceC1587906Jp> c0rf2) {
        this.LL = c0rf2;
        AssemReusedDispatcher<R, ITEM> assemReusedDispatcherLJJJLL = LJJJLL();
        Lifecycle lifecycle = getLifecycle();
        assemReusedDispatcherLJJJLL.getClass();
        C724240Sb0.LJII(new C0SZZ(lifecycle, assemReusedDispatcherLJJJLL));
        this.LLJI = C452501pT.LIZIZ(new C0SZY(this));
        this.LLJIJIL = new ViewModelStore();
    }

    @Override // X.C0SMO
    public final void setProxy(C0SZS<R, ITEM> c0szs) {
        this.LLIZLLLIL = c0szs;
    }

    @Override // X.C0SMN
    /* JADX INFO: renamed from: LLJJIJI, reason: merged with bridge method [inline-methods] */
    public void SN1(int i, ITEM item) {
        LLJJJJLIIL(i, item, null);
    }

    @Override // X.C0SMN
    public final void Sl0(View view, InterfaceC719640SKs interfaceC719640SKs) {
        this.LLJ = interfaceC719640SKs;
        AssemReusedDispatcher<R, ITEM> assemReusedDispatcherLJJJLL = LJJJLL();
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        assemReusedDispatcherLJJJLL.LIZ = reusedUIAssemNG1;
        C723850SaN.LJ(this, new C0SDO(reusedUIAssemNG1, view, interfaceC719640SKs, this));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C0SZU<R, ITEM> c0szu;
        Lifecycle lifecycle;
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            if (!C725080ScM.LJIILJJIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStateChanged: ");
                sbLIZ.append(event);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ);
            } else if (C725080ScM.LIZLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onStateChanged: ");
                sbLIZ2.append(event);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i2 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ2);
            }
        }
        int i3 = C481320IuA.LIZ[event.ordinal()];
        if (i3 != 1) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 == 6) {
                            int i4 = C481320IuA.LIZIZ[getLifecycle().getCurrentState().ordinal()];
                            if (i4 != 1) {
                                if (i4 == 2 || i4 == 3) {
                                    getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                                }
                            } else {
                                getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                                getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                            }
                            this.LLJIJIL.clear();
                            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                            LifecycleOwner lifecycleOwnerLLILZ = LLILZ();
                            if (lifecycleOwnerLLILZ != null && (lifecycle = lifecycleOwnerLLILZ.getLifecycle()) != null) {
                                lifecycle.removeObserver(this);
                            }
                            C0SZS<R, ITEM> c0szs = this.LLIZLLLIL;
                            if (c0szs != null && (c0szu = c0szs.LIZIZ) != 0) {
                                c0szu.LIZIZ(false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                    return;
                }
                getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                return;
            }
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            return;
        }
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    public final void LLJJJJLIIL(int i, final ITEM item, List<? extends Object> list) {
        InterfaceC723410SZf interfaceC723410SZf;
        if (item == null) {
            return;
        }
        C725240Scc c725240Scc = C725240Scc.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725240Scc);
                }
            }
            if (C725480Sd0.LIZ(c725240Scc)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c725240Scc, "default", SystemClock.elapsedRealtimeNanos(), 13));
            }
        }
        if (C725080ScM.LJIIIIZZ && (interfaceC723410SZf = C725080ScM.LJIIIZ) != null) {
            interfaceC723410SZf.LIZ();
        }
        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
        if (interfaceC723720SaA != null) {
            if (!C725080ScM.LJIILJJIL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReusedBind: ");
                sbLIZ.append(this);
                sbLIZ.append(", ");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                sbLIZ.append(item);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int i2 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ);
            } else if (C725080ScM.LIZLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onReusedBind: ");
                sbLIZ2.append(this);
                sbLIZ2.append(", ");
                sbLIZ2.append(i);
                sbLIZ2.append(", ");
                sbLIZ2.append(item);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i3 = C2187451AjH.LIZ;
                interfaceC723720SaA.log("AssemList", strLIZIZ2);
            }
        }
        C725430Scv.LIZLLL(C725310Scj.LIZ, new C723430SZh(item) { // from class: X.0SZX
            public final InterfaceC1587906Jp LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0SZX) && Intrinsics.LJFF(this.LIZJ, ((C0SZX) obj).LIZJ);
            }

            public final int hashCode() {
                return this.LIZJ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BindProxyParams(item=");
                sbLIZ3.append(this.LIZJ);
                sbLIZ3.append(')');
                return C2188811AlT.LIZIZ(sbLIZ3);
            }

            {
                this.LIZJ = item;
            }
        }, new C0RF3(this, item, i, list));
        LLJJL();
        C725430Scv.LIZLLL(C725350Scn.LIZ, new C723430SZh(item) { // from class: X.0SZW
            public final InterfaceC1587906Jp LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0SZW) && Intrinsics.LJFF(this.LIZJ, ((C0SZW) obj).LIZJ);
            }

            public final int hashCode() {
                return this.LIZJ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("OnHostBindParams(item=");
                sbLIZ3.append(this.LIZJ);
                sbLIZ3.append(')');
                return C2188811AlT.LIZIZ(sbLIZ3);
            }

            {
                this.LIZJ = item;
            }
        }, new C0RC9(this, item));
        C725240Scc c725240Scc2 = C725240Scc.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c725240Scc2);
                }
            }
            if (C725480Sd0.LIZ(c725240Scc2)) {
                C725430Scv.LIZ(new AwS1S1110100_11(c725240Scc2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), 0));
            }
        }
    }
}
