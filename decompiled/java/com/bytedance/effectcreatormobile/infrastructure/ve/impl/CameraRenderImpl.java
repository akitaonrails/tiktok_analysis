package com.bytedance.effectcreatormobile.infrastructure.ve.impl;

import X.C00CL;
import X.C054G;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09IR;
import X.C0PEM;
import X.C118300cf;
import X.C1706630uVp;
import X.C1A86;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2247661CyC;
import X.C2247671CyD;
import X.C2252331DDr;
import X.C2252611DEt;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C377101dJ;
import X.C790250UzH;
import X.EnumC0297008h;
import X.InterfaceC1364105Vn;
import X.InterfaceC2247691CyF;
import X.InterfaceC2247741CyK;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.effectcreatormobile.infrastructure.ve.CameraRenderLiveData;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.AwS278S0300000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class CameraRenderImpl implements InterfaceC2247691CyF {
    public final CameraRenderLiveData<C2247671CyD> LIZ;
    public final CopyOnWriteArrayList<InterfaceC2247741CyK> LIZIZ;
    public final ConcurrentHashMap<InterfaceC2247741CyK, InterfaceC2247741CyK> LIZJ;
    public C1A86 LIZLLL;
    public final C054G LJ;
    public final C2252331DDr LJFF;

    @Override // X.InterfaceC2247691CyF
    public final void LJIIZILJ() {
        C23250099c.LIZLLL(this.LJ, null, null, new C377101dJ(this, null), 3);
    }

    @Override // X.InterfaceC2247691CyF
    public final void LJJIII() {
        Iterator<InterfaceC2247741CyK> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            C790250UzH.LIZIZ(0L, new AwS578S0100000_34(it2.next(), 15));
        }
    }

    @Override // X.InterfaceC2247691CyF
    public final C1A86 getRecordContext() {
        C1A86 c1a86 = this.LIZLLL;
        if (c1a86 != null) {
            return c1a86;
        }
        C1A86 c1a862 = new C1A86() { // from class: X.1CyI
            @Override // X.C1A86
            public final boolean LIZ() {
                return false;
            }

            @Override // X.C1A86
            public final int[] LIZIZ() {
                return new int[]{720, 1280};
            }

            @Override // X.C1A86
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.C1A86
            public final int[] LIZLLL() {
                return new int[]{720, 1280};
            }

            @Override // X.C1A86
            public final boolean LJ() {
                return false;
            }

            @Override // X.C1A86
            public final boolean LJFF() {
                return false;
            }

            @Override // X.C1A86
            public final int getFps() {
                return 40;
            }
        };
        this.LIZLLL = c1a862;
        return c1a862;
    }

    public CameraRenderImpl() {
        new CameraRenderLiveData();
        this.LIZ = new CameraRenderLiveData<>();
        this.LIZIZ = new CopyOnWriteArrayList<>();
        this.LIZJ = new ConcurrentHashMap<>();
        C09IR.LIZIZ(0, 0, null, 7);
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJ = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII().plus(C2296908zH.LIZ()));
        this.LJFF = C09IR.LIZIZ(0, 0, null, 7);
    }

    @Override // X.InterfaceC2247691CyF
    public final CameraRenderLiveData LJJIFFI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2247691CyF
    public final void LJIJI(InterfaceC2247741CyK interfaceC2247741CyK) {
        this.LIZIZ.remove(interfaceC2247741CyK);
        InterfaceC2247741CyK interfaceC2247741CyK2 = this.LIZJ.get(interfaceC2247741CyK);
        if (interfaceC2247741CyK2 != null) {
            this.LIZIZ.remove(interfaceC2247741CyK2);
            this.LIZJ.remove(interfaceC2247741CyK);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeAlgorithmCallback-callback: ");
        sbLIZ.append(interfaceC2247741CyK);
        C1706630uVp.LIZ("CameraRenderImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2247691CyF
    public final void LJIJJ(EnumC0297008h enumC0297008h) {
        C00CL c00cl;
        C00CL c00cl2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRenderMode, mode ");
        sbLIZ.append(enumC0297008h);
        C1706630uVp.LJFF("CameraRenderImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ.getValue() != null) {
            C2247671CyD value = this.LIZ.getValue();
            if (value != null) {
                EnumC0297008h enumC0297008h2 = value.LIZ;
                if (enumC0297008h == enumC0297008h2 && value.LIZLLL) {
                    C1706630uVp.LIZJ("CameraRenderImpl", "render preview repeat scene modifications, neglect this action");
                    return;
                }
                C2247671CyD value2 = this.LIZ.getValue();
                if (value2 == null || (c00cl2 = value2.LIZJ) == null) {
                    c00cl2 = C00CL.ALL;
                }
                this.LIZ.setValue(new C2247671CyD(enumC0297008h, enumC0297008h2, c00cl2, true));
                return;
            }
            return;
        }
        C2247671CyD value3 = this.LIZ.getValue();
        if (value3 == null || (c00cl = value3.LIZJ) == null) {
            c00cl = C00CL.ALL;
        }
        this.LIZ.setValue(new C2247671CyD(enumC0297008h, null, c00cl, true));
    }

    @Override // X.InterfaceC2247691CyF
    public final void LJJI(C1A86 c1a86) {
        this.LIZLLL = c1a86;
    }

    @Override // X.InterfaceC2247691CyF
    public final void LJJIJIL(C00CL c00cl) {
        C2247671CyD value = this.LIZ.getValue();
        if (value != null) {
            this.LIZ.setValue(C2247671CyD.LIZ(value, c00cl, 3));
        }
    }

    @Override // X.InterfaceC2247691CyF
    public final void LJ(int i, final InterfaceC2247741CyK interfaceC2247741CyK) {
        final C118300cf c118300cf = new C118300cf();
        if (i < 1) {
            i = 10;
        }
        c118300cf.element = i;
        this.LIZIZ.add(interfaceC2247741CyK);
        InterfaceC2247741CyK interfaceC2247741CyK2 = new InterfaceC2247741CyK() { // from class: X.1CyH
            @Override // X.InterfaceC2247741CyK
            public final void LIZ() {
                C790250UzH.LIZIZ(0L, new AwS278S0300000_34(c118300cf, this, interfaceC2247741CyK, 1));
            }
        };
        this.LIZJ.put(interfaceC2247741CyK, interfaceC2247741CyK2);
        this.LIZIZ.add(interfaceC2247741CyK2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addAlgorithmCallback-callback: ");
        sbLIZ.append(interfaceC2247741CyK);
        C1706630uVp.LIZ("CameraRenderImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2247691CyF
    public final Object LJIIJJI(int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LIZJ(new InterfaceC2247741CyK() { // from class: X.1CyG
            @Override // X.InterfaceC2247741CyK
            public final void LIZ() {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC20236714Gf.resumeWith(unit);
            }
        }, i, null);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJIJ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1CyC, java.lang.Object] */
    @Override // X.InterfaceC2247691CyF
    public final void LIZJ(final InterfaceC2247741CyK interfaceC2247741CyK, final int i, Lifecycle lifecycle) {
        if (i <= 1) {
            i = 10;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final ?? r1 = new InterfaceC2247741CyK() { // from class: X.1CyC
            @Override // X.InterfaceC2247741CyK
            public final void LIZ() {
                if (atomicInteger.get() >= i) {
                    this.LIZIZ.remove(this);
                    return;
                }
                if (atomicInteger.get() == i - 1 && atomicInteger.get() > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("IFrameCallback = invoke = ");
                    sbLIZ.append(atomicInteger.get());
                    C1706630uVp.LIZ("AME-editor", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC2247741CyK interfaceC2247741CyK2 = interfaceC2247741CyK;
                    if (interfaceC2247741CyK2 != null) {
                        interfaceC2247741CyK2.LIZ();
                    }
                }
                atomicInteger.getAndAdd(1);
            }
        };
        this.LIZIZ.add((InterfaceC2247741CyK) r1);
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.effectcreatormobile.infrastructure.ve.impl.CameraRenderImpl$onAlgorithmReady$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        CameraRenderImpl cameraRenderImpl = this.LL;
                        C2247661CyC c2247661CyC = r1;
                        if (c2247661CyC != null) {
                            cameraRenderImpl.LIZIZ.remove(c2247661CyC);
                        } else {
                            cameraRenderImpl.getClass();
                        }
                    }
                }
            });
        }
    }
}
