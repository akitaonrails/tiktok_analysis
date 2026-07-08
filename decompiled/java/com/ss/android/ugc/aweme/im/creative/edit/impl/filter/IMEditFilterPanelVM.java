package com.ss.android.ugc.aweme.im.creative.edit.impl.filter;

import X.AbstractC1445310niL;
import X.AbstractC1445340niO;
import X.C01GW;
import X.C09JN;
import X.C0CIT;
import X.C11NJ;
import X.C13BV;
import X.C13LQ;
import X.C1572040r0k;
import X.C1643830ssX;
import X.C1643880ssc;
import X.C1651100t4G;
import X.C19370710qP;
import X.C2097608Jq;
import X.C452501pT;
import X.EnumC1998007sA;
import X.InterfaceC0148002o;
import X.InterfaceC1453220nv6;
import X.InterfaceC1639870sm9;
import X.InterfaceC1640320sms;
import X.InterfaceC1642310sq5;
import X.InterfaceC1643840ssY;
import X.InterfaceC1660990tKD;
import X.InterfaceC358220E2q;
import Y.AObserverS227S0100000_25;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.im.creative.edit.impl.filter.IMEditFilterPanelVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: loaded from: classes26.dex */
public final class IMEditFilterPanelVM extends AssemViewModel<C1572040r0k> {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C1643830ssX LLILZLL;
    public final C11NJ LLIZ = new C11NJ();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 184));
    public boolean LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1572040r0k(false, C2097608Jq.LJ(), null, null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLIZ.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ssZ] */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        ((InterfaceC1643840ssY) this.LLILZ.getValue()).LIZIZ(new GestureLayout$OnGestureListener() { // from class: X.0ssZ
            public float LL;
            public boolean LLILLJJLI;
            public boolean LLILLL;

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean E2(C21645419nQ c21645419nQ) {
                return false;
            }

            public final synchronized void LIZ() {
                IMEditFilterPanelVM iMEditFilterPanelVM = this.LLILZ;
                if (iMEditFilterPanelVM.LLJ) {
                    if (this.LLILLL) {
                        return;
                    }
                    float f = this.LL;
                    if (f == 0.0f) {
                        return;
                    }
                    iMEditFilterPanelVM.vQ2(f > 0.0f ? 1 : -1);
                    this.LLILLL = true;
                }
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZIZ(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LIZLLL() {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJ() {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJFF(b bVar) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJIIIZ(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJIJJ(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJJIJIIJIL(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJJLIIIJLJLI(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLJI(float f) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void onTouchEvent(MotionEvent motionEvent) {
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                this.LLILLL = false;
                this.LLILLJJLI = false;
                this.LL = 0.0f;
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                if (this.LLILLJJLI && Math.abs(this.LL) >= 0.5f) {
                    LIZ();
                    return false;
                }
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY()) && this.LL != 0.0f) {
                    LIZ();
                }
                return false;
            }

            @Override // com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z;
                int iAbs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
                int iAbs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
                if (iAbs > ((InterfaceC1643840ssY) this.LLILZ.LLILZ.getValue()).LIZJ() && iAbs > iAbs2) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLILLJJLI = z;
                float fLIZ = this.LL + (f / ((InterfaceC1643840ssY) this.LLILZ.LLILZ.getValue()).LIZ());
                this.LL = fLIZ;
                float fMin = Math.min(fLIZ, 1.0f);
                this.LL = fMin;
                this.LL = Math.max(fMin, -1.0f);
                return false;
            }
        });
    }

    public final void of(boolean z) {
        if (z) {
            synchronized (this) {
                if (!this.LLJ) {
                    ((InterfaceC1640320sms) this.LLIZLLLIL.getValue()).LIZ().observe(this, new AObserverS227S0100000_25(this, 93));
                    this.LLIZ.LIZ(((InterfaceC1639870sm9) this.LLJILJIL.getValue()).LJJIFFI().LJJLL(new C09JN() { // from class: X.0T8j
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("IMEditFilterPanelVM@e591.init$2");
                            C1C7U.LIZIZ("IMEditFilterPanelVM@e591.init$2");
                        }
                    }, new C09JN() { // from class: X.00QM
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("IMEditFilterPanelVM@e591.init$3");
                            C1C7U.LIZIZ("IMEditFilterPanelVM@e591.init$3");
                        }
                    }));
                    this.LLIZ.LIZ(((InterfaceC1639870sm9) this.LLJILJIL.getValue()).LIZIZ(true).LJJLJLI(new C09JN() { // from class: X.00QN
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("IMEditFilterPanelVM@e591.init$4");
                            C1C7U.LIZIZ("IMEditFilterPanelVM@e591.init$4");
                        }
                    }));
                    this.LLJ = true;
                }
            }
            ((AbstractC1445340niO) this.LLILLL.getValue()).LJI("IMEditFilterPanelVM", new AwS568S0100000_24(this, 599));
            ((C19370710qP) this.LLILZIL.getValue()).LIZIZ(EnumC1998007sA.BOTTOM_PANEL_MODE);
        } else {
            ((AbstractC1445340niO) this.LLILLL.getValue()).LJIIIIZZ("IMEditFilterPanelVM");
            ((C19370710qP) this.LLILZIL.getValue()).LIZIZ(EnumC1998007sA.DEFAULT);
        }
        setState(new AwS36S0010000_24(z, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final void vQ2(int i) {
        ?? arrayList;
        C1651100t4G.LIZ.getClass();
        String[] strArrLIZ = C0CIT.LIZ();
        List list = (List) ((InterfaceC1640320sms) this.LLIZLLLIL.getValue()).LJI().getValue();
        int i2 = 0;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                FilterBean filterBean = (FilterBean) obj;
                if (C13LQ.LJJIJIIJI(filterBean.getCategoryKey(), strArrLIZ) < 0 && C1643880ssc.LJ(filterBean)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next(), getState().LLILLL)) {
                if (i2 >= 0) {
                    i += i2;
                }
            } else {
                i2++;
            }
        }
        wQ2((FilterBean) ListProtector.get(arrayList, (i + arrayList.size()) % arrayList.size()), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168 A[EDGE_INSN: B:59:0x0168->B:51:0x0168 BREAK  A[LOOP:2: B:46:0x0157->B:54:0x0186], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(com.ss.android.ugc.aweme.filter.FilterBean r11, java.lang.Integer r12) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.creative.edit.impl.filter.IMEditFilterPanelVM.wQ2(com.ss.android.ugc.aweme.filter.FilterBean, java.lang.Integer):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ssX] */
    public IMEditFilterPanelVM(final C01GW<? extends InterfaceC1660990tKD> c01gw, C01GW<? extends InterfaceC1642310sq5> c01gw2, C01GW<? extends InterfaceC358220E2q> c01gw3, C01GW<? extends AbstractC1445310niL> c01gw4, C01GW<? extends InterfaceC1643840ssY> c01gw5, C01GW<C19370710qP> c01gw6) {
        this.LL = c01gw;
        this.LLILLJJLI = c01gw3;
        this.LLILLL = c01gw4;
        this.LLILZ = c01gw5;
        this.LLILZIL = c01gw6;
        this.LLILZLL = new InterfaceC1453220nv6() { // from class: X.0ssX
            @Override // X.InterfaceC1453220nv6
            public final float LIZ(FilterBean filterBean) {
                float fLIZLLL = C1643880ssc.LIZLLL(filterBean);
                if (fLIZLLL == 0.0f) {
                    return c01gw.getValue().LJLILLLLZI(filterBean.getFilterFolder());
                }
                return fLIZLLL;
            }
        };
        this.LLJI = C452501pT.LIZIZ(new AwS426S0200000_25((C01GW) c01gw3, (C01GW<? extends InterfaceC358220E2q>) this, (IMEditFilterPanelVM) 34));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(c01gw2, 182));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS569S0100000_25(c01gw2, 183));
    }
}
