package com.ss.android.ugc.aweme.servicimpl;

import X.AbstractC1653180t7c;
import X.AbstractC2255721DQs;
import X.C09R3;
import X.C0LF1;
import X.C13LE;
import X.C1646390swf;
import X.C1647410syJ;
import X.C1653330t7r;
import X.C1656050tCF;
import X.C1664740tQG;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C19EG;
import X.C1DRG;
import X.C2217381BqS;
import X.C579550MoD;
import X.C580090Mp5;
import X.InterfaceC1638550sk1;
import X.InterfaceC1644770su3;
import X.InterfaceC1647420syK;
import X.InterfaceC1648570t0B;
import X.InterfaceC1649820t2C;
import X.InterfaceC1652190t61;
import X.InterfaceC1653190t7d;
import X.InterfaceC1653360t7u;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import a6n.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.servicimpl.NowBottomTabModule;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.e;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.k;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.f0;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;

/* JADX INFO: loaded from: classes26.dex */
public final class NowBottomTabModule implements InterfaceC1653190t7d, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final String LL;
    public final String LLILLJJLI;
    public final C1DRG LLILZ;
    public final C1664740tQG LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final ShortVideoContext LLJ;
    public final C1664750tQH LLJI;
    public final C1664740tQG LLJIJIL;
    public final String LLILLL = "quick";
    public final boolean LLILZIL = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NowBottomTabModule.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NowBottomTabModule.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(NowBottomTabModule.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(NowBottomTabModule.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(NowBottomTabModule.class, "permissionApiComponent", "getPermissionApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.InterfaceC1653190t7d
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC1653190t7d
    public final AbstractC1653180t7c provideScene() {
        return null;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1653190t7d
    public final C1653330t7r createBottomTabItem(a aVar) {
        return new C1653330t7r(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZIL, new InterfaceC1653360t7u() { // from class: X.0szq
            @Override // X.InterfaceC1653360t7u
            public final void onCelebrationStyleApplied(String str) {
            }

            @Override // X.InterfaceC1653360t7u
            public final void onTabChanged(Object obj, Object obj2, C1653300t7o c1653300t7o) {
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabUnselected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                return false;
            }

            @Override // X.InterfaceC1653360t7u
            public final boolean onTabSelected(C1653330t7r c1653330t7r, C1646490swp c1646490swp) {
                ShortVideoContext shortVideoContext;
                ShortVideoContext shortVideoContext2;
                C385670FAf<Boolean> c385670FAfL00;
                NowBottomTabModule nowBottomTabModule = this.LIZ;
                C1664740tQG c1664740tQG = nowBottomTabModule.LLIZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = NowBottomTabModule.LLJILJIL;
                com.ss.android.ugc.aweme.shortvideo.component.a aVar2 = (com.ss.android.ugc.aweme.shortvideo.component.a) c1664740tQG.getValue(nowBottomTabModule, interfaceC2217461BqaArr[1]);
                if (aVar2 != null) {
                    aVar2.mC(e.PHOTO);
                }
                NowBottomTabModule nowBottomTabModule2 = this.LIZ;
                com.ss.android.ugc.aweme.shortvideo.component.a aVar3 = (com.ss.android.ugc.aweme.shortvideo.component.a) nowBottomTabModule2.LLIZ.getValue(nowBottomTabModule2, interfaceC2217461BqaArr[1]);
                if (aVar3 != null) {
                    aVar3.eP2(true);
                }
                NowBottomTabModule nowBottomTabModule3 = this.LIZ;
                InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) nowBottomTabModule3.LLIZLLLIL.getValue(nowBottomTabModule3, interfaceC2217461BqaArr[2]);
                if (interfaceC1649820t2C != null) {
                    interfaceC1649820t2C.hF2(true, false);
                }
                NowBottomTabModule nowBottomTabModule4 = this.LIZ;
                InterfaceC1649820t2C interfaceC1649820t2C2 = (InterfaceC1649820t2C) nowBottomTabModule4.LLIZLLLIL.getValue(nowBottomTabModule4, interfaceC2217461BqaArr[2]);
                if (interfaceC1649820t2C2 != null) {
                    interfaceC1649820t2C2.W9(true);
                }
                ShortVideoContext shortVideoContext3 = this.LIZ.LLJ;
                if ((shortVideoContext3 != null && shortVideoContext3.LJJIL()) || (((shortVideoContext = this.LIZ.LLJ) != null && shortVideoContext.LJJJ()) || ((shortVideoContext2 = this.LIZ.LLJ) != null && shortVideoContext2.LJJIIZI()))) {
                    NowBottomTabModule nowBottomTabModule5 = this.LIZ;
                    InterfaceC1652190t61 interfaceC1652190t61 = (InterfaceC1652190t61) nowBottomTabModule5.LLJIJIL.getValue(nowBottomTabModule5, interfaceC2217461BqaArr[4]);
                    if (interfaceC1652190t61 == null || (c385670FAfL00 = interfaceC1652190t61.L00()) == null || !Intrinsics.LJFF(c385670FAfL00.LIZJ(), Boolean.TRUE)) {
                        ((C0MGL) this.LIZ.LLILZ.LJII(C0MGL.class, null)).GN2(true);
                    }
                }
                return true;
            }
        }, null, false, null, null, 480);
    }

    @Override // X.InterfaceC1653190t7d
    public final void initialize(a aVar) {
        final Lifecycle lifecycle;
        AbstractC2255721DQs abstractC2255721DQs = (AbstractC2255721DQs) this.LLILZ.LJIIL(null, C1646390swf.class);
        if (abstractC2255721DQs != null && (lifecycle = abstractC2255721DQs.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.servicimpl.NowBottomTabModule$initialize$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        NowBottomTabModule nowBottomTabModule = this.LL;
                        InterfaceC1638550sk1 interfaceC1638550sk1 = (InterfaceC1638550sk1) nowBottomTabModule.LLILZLL.getValue(nowBottomTabModule, NowBottomTabModule.LLJILJIL[0]);
                        if (interfaceC1638550sk1 != null) {
                            interfaceC1638550sk1.gj(this.LL.LLILLJJLI, true);
                        }
                        lifecycle.removeObserver(this);
                    }
                }
            });
        }
        C1664740tQG c1664740tQG = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        InterfaceC1638550sk1 interfaceC1638550sk1 = (InterfaceC1638550sk1) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
        if (interfaceC1638550sk1 != null) {
            interfaceC1638550sk1.d30(false);
        }
        InterfaceC1638550sk1 interfaceC1638550sk12 = (InterfaceC1638550sk1) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[0]);
        if (interfaceC1638550sk12 != null) {
            interfaceC1638550sk12.JN0(false);
        }
        ((InterfaceC1648570t0B) this.LLJI.getValue(this, interfaceC2217461BqaArr[3])).KA0(C0LF1.class, new C579550MoD((k) this.LLILZ.LJIIL(null, k.class), (C19EG) this.LLILZ.LJII(C19EG.class, null), (e0) this.LLILZ.LJII(e0.class, null), (C1656050tCF) this.LLILZ.LJII(f0.class, null), aVar.LIZLLL(), (C580090Mp5) this.LLILZ.LJII(C580090Mp5.class, null), (q) this.LLILZ.LJIIL(null, q.class), (com.ss.android.ugc.aweme.shortvideo.component.a) this.LLILZ.LJII(com.ss.android.ugc.aweme.shortvideo.component.a.class, null), (InterfaceC1644770su3) this.LLILZ.LJIIL(null, InterfaceC1644770su3.class), (ln3.a) this.LLILZ.LJIIL(null, ln3.a.class), (InterfaceC1647420syK) this.LLILZ.LJIIL(null, C1647410syJ.class), this.LLILZ));
        ((InterfaceC1648570t0B) this.LLJI.getValue(this, interfaceC2217461BqaArr[3])).va0(C0LF1.class);
    }

    public NowBottomTabModule(String str, String str2, C1DRG c1drg) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILZ = c1drg;
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1638550sk1.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, com.ss.android.ugc.aweme.shortvideo.component.a.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1649820t2C.class, null);
        this.LLJ = (ShortVideoContext) c1drg.LJIIL(null, ShortVideoContext.class);
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1652190t61.class, null);
    }
}
