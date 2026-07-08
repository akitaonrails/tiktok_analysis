package com.bytedance.touchpoint.core.pendant;

import X.AbstractC1895130zPr;
import X.AbstractC1896090zRP;
import X.C01GW;
import X.C1619720sFe;
import X.C1893670zNV;
import X.C1895390zQH;
import X.C1896830zSb;
import X.C1898340zV2;
import X.C1898400zV8;
import X.C1898410zV9;
import X.C1898450zVD;
import X.C1898460zVE;
import X.C1900090zXr;
import X.C2217381BqS;
import X.C452501pT;
import X.C736820SvI;
import X.InterfaceC1900110zXt;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.api.service.ITouchPointOptService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.core.pendant.BaseTouchPointManager;
import com.bytedance.touchpoint.core.pendant.ad.AdFeedTimerPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseTouchPointManager<T extends C1893670zNV> extends AbstractC1895130zPr implements GenericLifecycleObserver {
    public ViewGroup LL;
    public LifecycleOwner LLILLJJLI;
    public T LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C1898400zV8());
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1896830zSb());
    public final Stack<C1898460zVE> LLILZLL = new Stack<>();

    public abstract void LJIIJJI(Context context, ViewGroup viewGroup);

    public C1898450zVD LJIIL() {
        return null;
    }

    public abstract void LJIILJJIL();

    public abstract String LJIILL();

    public abstract TimerPendant LJIIZILJ();

    public abstract View LJIJ();

    public void LJIJI() {
    }

    public void LJIJJ() {
    }

    public void LJIJJLI() {
    }

    public boolean LJJIFFI() {
        return false;
    }

    public void LJJII(T t) {
    }

    public abstract void LJJIII();

    public abstract void LJJIIZ();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    public final void LJIILIIL() {
        if (this.LLILLL == null) {
            return;
        }
        LJJIIJZLJL();
        this.LLILLL = null;
    }

    public final Map<String, Integer> LJIILLIIL() {
        return (Map) this.LLILZ.getValue();
    }

    public final boolean LJJ() {
        View viewLJIJ;
        return (this.LL == null || (viewLJIJ = LJIJ()) == null || viewLJIJ.getParent() == null) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r0.intValue() == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ() {
        /*
            r4 = this;
            T extends X.0zNV r1 = r4.LLILLL
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L51
            androidx.lifecycle.LifecycleOwner r0 = r4.LLILLJJLI
            if (r0 == 0) goto L50
            android.view.ViewGroup r0 = r4.LL
            if (r0 == 0) goto L50
            if (r1 == 0) goto L48
            boolean r0 = r4.LJJIFFI()
            if (r0 == 0) goto L34
            X.0zVD r0 = r4.LJIIL()
            java.util.Map r1 = r4.LJIILLIIL()
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.LIZ
            if (r0 != 0) goto L26
        L24:
            java.lang.String r0 = ""
        L26:
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L48
            int r0 = r0.intValue()
            if (r0 != r3) goto L48
        L34:
            android.view.ViewGroup r1 = r4.LL
            if (r1 == 0) goto L47
            boolean r0 = r4.LJJ()
            if (r0 != 0) goto L47
            r4.LL = r1
            android.content.Context r0 = r1.getContext()
            r4.LJIIJJI(r0, r1)
        L47:
            return
        L48:
            X.0zVD r0 = r4.LJIIL()
            r4.LJJI(r0, r2)
            return
        L50:
            return
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.BaseTouchPointManager.LJJIIJ():void");
    }

    public BaseTouchPointManager() {
        ITouchPointOptService.LIZ.getClass();
        ITouchPointOptService iTouchPointOptServiceLIZ = C1895390zQH.LIZ();
        if (iTouchPointOptServiceLIZ != null) {
            iTouchPointOptServiceLIZ.LIZ();
        }
        BaseTouchPointDataVM baseTouchPointDataVMLJIIIZ = LJIIIZ();
        if (baseTouchPointDataVMLJIIIZ != null) {
            baseTouchPointDataVMLJIIIZ.vQ2(new C2217381BqS() { // from class: X.0zSF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Long.valueOf(((C1895080zPm) obj).LL);
                }
            }, null, new C1898340zV2(this));
            baseTouchPointDataVMLJIIIZ.vQ2(new C2217381BqS() { // from class: X.0zSE
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1895080zPm) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), new C1898410zV9(this));
        }
    }

    private final void LJJIIJZLJL() {
        if (LJJ()) {
            LJJIIZ();
            if (!(this instanceof AdFeedTimerPendantManager)) {
                LJIILLIIL().clear();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        Lifecycle lifecycle;
        LJIJJLI();
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LLILLJJLI = null;
        LJJIIJZLJL();
        LJIILJJIL();
        this.LL = null;
        LJIJI();
    }

    public final void LJIL(T t) {
        if (this.LLILLL != null) {
            LJIILIIL();
        }
        this.LLILLL = t;
        LJJIIJ();
    }

    public final void LJIIJ(ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        LifecycleOwner lifecycleOwner2 = this.LLILLJJLI;
        if (lifecycleOwner2 != null && this.LL != null) {
            if (Intrinsics.LJFF(lifecycleOwner2, lifecycleOwner)) {
                return;
            }
            LifecycleOwner lifecycleOwner3 = this.LLILLJJLI;
            if (lifecycleOwner3 != null && (lifecycle2 = lifecycleOwner3.getLifecycle()) != null) {
                lifecycle2.removeObserver(this);
            }
            this.LLILLJJLI = null;
            LJJIIJZLJL();
            this.LL = null;
        }
        this.LLILLJJLI = lifecycleOwner;
        this.LL = viewGroup;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        LJIJJ();
        LJJIIJ();
    }

    public final void LJJI(C1898450zVD c1898450zVD, boolean z) {
        Context contextLJIIJJI;
        final int i;
        final int iIntValue;
        if (this.LLILLL == null && !z) {
            return;
        }
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            contextLJIIJJI = abstractC1896090zRP.LJIIJJI();
        } else {
            contextLJIIJJI = null;
        }
        if ((!z && this.LL == null) || contextLJIIJJI == null || c1898450zVD == null) {
            return;
        }
        final String str = c1898450zVD.LIZ;
        String str2 = c1898450zVD.LIZIZ;
        String str3 = c1898450zVD.LIZJ;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            Integer num = LJIILLIIL().get(str);
            if (num == null || num.intValue() != 3) {
                Integer num2 = LJIILLIIL().get(str);
                if (num2 != null && num2.intValue() == 1) {
                    return;
                }
                LJIILLIIL().put(str, 3);
                new ArrayList().add(str2);
                try {
                    T t = this.LLILLL;
                    if (t != null) {
                        i = t.LIZ;
                        Integer num3 = t.LIZJ;
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        }
                        ((C1900090zXr) this.LLILZIL.getValue()).LIZ(str, str2, str3, new InterfaceC1900110zXt(this) { // from class: X.0zUy
                            public final /* synthetic */ BaseTouchPointManager<T> LIZ;

                            @Override // X.InterfaceC1900110zXt
                            public final void LIZ(Throwable th) {
                                this.LIZ.LJIILLIIL().put(str, 2);
                                this.LIZ.getClass();
                                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                                int i2 = i;
                                int i3 = iIntValue;
                                String string = th.toString();
                                c1893680zNW.getClass();
                                C1893680zNW.LIZ(0, i2, i3, 1, string);
                            }

                            @Override // X.InterfaceC1900110zXt
                            public final void LIZIZ(int i2) {
                                boolean zLJI = MethodIDManager.LJI(137814);
                                this.LIZ.LJIILLIIL().put(str, 1);
                                BaseTouchPointManager<T> baseTouchPointManager = this.LIZ;
                                if (!baseTouchPointManager.LJJ()) {
                                    baseTouchPointManager.LJJIIJ();
                                }
                                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                                int i3 = i;
                                int i4 = iIntValue;
                                c1893680zNW.getClass();
                                C1893680zNW.LIZ(1, i3, i4, i2, "");
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                            }

                            {
                                this.LIZ = this;
                            }
                        });
                    }
                    i = c1898450zVD.LIZLLL;
                    iIntValue = c1898450zVD.LJ;
                    ((C1900090zXr) this.LLILZIL.getValue()).LIZ(str, str2, str3, new InterfaceC1900110zXt(this) { // from class: X.0zUy
                        public final /* synthetic */ BaseTouchPointManager<T> LIZ;

                        @Override // X.InterfaceC1900110zXt
                        public final void LIZ(Throwable th) {
                            this.LIZ.LJIILLIIL().put(str, 2);
                            this.LIZ.getClass();
                            C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                            int i2 = i;
                            int i3 = iIntValue;
                            String string = th.toString();
                            c1893680zNW.getClass();
                            C1893680zNW.LIZ(0, i2, i3, 1, string);
                        }

                        @Override // X.InterfaceC1900110zXt
                        public final void LIZIZ(int i2) {
                            boolean zLJI = MethodIDManager.LJI(137814);
                            this.LIZ.LJIILLIIL().put(str, 1);
                            BaseTouchPointManager<T> baseTouchPointManager = this.LIZ;
                            if (!baseTouchPointManager.LJJ()) {
                                baseTouchPointManager.LJJIIJ();
                            }
                            C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                            int i3 = i;
                            int i4 = iIntValue;
                            c1893680zNW.getClass();
                            C1893680zNW.LIZ(1, i3, i4, i2, "");
                            if (zLJI) {
                                MethodIDManager.LJ();
                            }
                        }

                        {
                            this.LIZ = this;
                        }
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJIILLIIL().put(str, 2);
                }
            }
        }
    }
}
