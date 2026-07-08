package com.google.maps.android.clustering.view;

import X.C0WZX;
import X.C1336490ksp;
import X.C1BS6;
import X.C1BS7;
import X.C1BSB;
import X.C1BSE;
import X.C1BSM;
import X.C1BSY;
import X.C1BT3;
import X.C1BT8;
import X.C1BU1;
import X.C1BU2;
import X.C1BU4;
import X.C1BU5;
import X.C1BU6;
import X.C1C7U;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2204971BRn;
import X.C2205211BSl;
import X.C2205271BSr;
import X.C2205451BTj;
import X.C2205571BTv;
import X.C371710Ehl;
import X.C786410Ut5;
import X.C829150Wfp;
import X.C837010WsV;
import X.InterfaceC1177120gjm;
import X.InterfaceC2205311BSv;
import X.InterfaceC2205321BSw;
import X.InterfaceC2205331BSx;
import X.InterfaceC2205551BTt;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.RemoteException;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes35.dex */
public class DefaultClusterRenderer<T extends C1BU1> implements InterfaceC2205551BTt<T> {
    public static final int[] LJIIZILJ = {10, 20, 50, 100, 200, 500, LSPassThroughRecordSizeConfig.DEFAULT};
    public static final TimeInterpolator LJIJ = new DecelerateInterpolator();
    public final C1BSM LIZ;
    public final C1336490ksp LIZIZ;
    public final C2205451BTj<T> LIZJ;
    public ShapeDrawable LJI;
    public Set<? extends InterfaceC1177120gjm<T>> LJIIJJI;
    public float LJIILIIL;
    public C1BU4<T> LJIILL;
    public C1BU6<T> LJIILLIIL;
    public final Executor LJFF = C786410Ut5.h4();
    public Set<C1BU2> LJII = Collections.newSetFromMap(new ConcurrentHashMap());
    public final SparseArray<C837010WsV> LJIIIIZZ = new SparseArray<>();
    public final C2205571BTv<T> LJIIIZ = new C2205571BTv<>();
    public final int LJIIJ = 4;
    public final C2205571BTv<InterfaceC1177120gjm<T>> LJIIL = new C2205571BTv<>();
    public final DefaultClusterRenderer<T>.ViewModifier LJIILJJIL = new ViewModifier();
    public final boolean LIZLLL = true;
    public final long LJ = 300;

    public class MarkerModifier extends BPEAHandler implements MessageQueue.IdleHandler {
        public final Lock LL;
        public final Condition LLILLJJLI;
        public final Queue<DefaultClusterRenderer<T>.d> LLILLL;
        public final Queue<DefaultClusterRenderer<T>.d> LLILZ;
        public final Queue<C2205271BSr> LLILZIL;
        public final Queue<C2205271BSr> LLILZLL;
        public final Queue<DefaultClusterRenderer<T>.c> LLIZ;
        public boolean LLIZLLLIL;

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean LJII() {
            /*
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.LL     // Catch: java.lang.Throwable -> L3b
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch: java.lang.Throwable -> L3b
                r0.lock()     // Catch: java.lang.Throwable -> L3b
                java.util.Queue<com.google.maps.android.clustering.view.DefaultClusterRenderer<T>$d> r0 = r2.LLILLL     // Catch: java.lang.Throwable -> L3b
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3b
                if (r0 == 0) goto L30
                java.util.Queue<com.google.maps.android.clustering.view.DefaultClusterRenderer<T>$d> r0 = r2.LLILZ     // Catch: java.lang.Throwable -> L3b
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3b
                if (r0 == 0) goto L30
                java.util.Queue<X.1BSr> r0 = r2.LLILZLL     // Catch: java.lang.Throwable -> L3b
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3b
                if (r0 == 0) goto L30
                java.util.Queue<X.1BSr> r0 = r2.LLILZIL     // Catch: java.lang.Throwable -> L3b
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3b
                if (r0 == 0) goto L30
                java.util.Queue<com.google.maps.android.clustering.view.DefaultClusterRenderer<T>$c> r0 = r2.LLIZ     // Catch: java.lang.Throwable -> L3b
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L3b
                if (r0 == 0) goto L30
                goto L32
            L30:
                r1 = 1
                goto L33
            L32:
                r1 = 0
            L33:
                java.util.concurrent.locks.Lock r0 = r2.LL
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
                r0.unlock()
                return r1
            L3b:
                r1 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                java.util.concurrent.locks.Lock r0 = r2.LL
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.view.DefaultClusterRenderer.MarkerModifier.LJII():boolean");
        }

        public final void LJIIIIZZ() throws Throwable {
            if (!this.LLILZLL.isEmpty()) {
                LJIIJ((C2205271BSr) ((LinkedList) this.LLILZLL).poll());
                return;
            }
            if (!this.LLIZ.isEmpty()) {
                c cVar = (c) ((LinkedList) this.LLIZ).poll();
                cVar.getClass();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(DefaultClusterRenderer.LJIJ);
                valueAnimatorOfFloat.setDuration(DefaultClusterRenderer.this.LJ);
                valueAnimatorOfFloat.addUpdateListener(cVar);
                valueAnimatorOfFloat.addListener(cVar);
                valueAnimatorOfFloat.start();
                return;
            }
            if (!this.LLILZ.isEmpty()) {
                ((d) ((LinkedList) this.LLILZ).poll()).LIZ(this);
            } else if (!this.LLILLL.isEmpty()) {
                ((d) ((LinkedList) this.LLILLL).poll()).LIZ(this);
            } else {
                if (this.LLILZIL.isEmpty()) {
                    return;
                }
                LJIIJ((C2205271BSr) ((LinkedList) this.LLILZIL).poll());
            }
        }

        public final void LJIIJJI() {
            while (LJII()) {
                sendEmptyMessage(0);
                ((ReentrantLock) this.LL).lock();
                try {
                    try {
                        if (LJII()) {
                            this.LLILLJJLI.await();
                        }
                        ((ReentrantLock) this.LL).unlock();
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((ReentrantLock) this.LL).unlock();
                    throw th;
                }
            }
        }

        public MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.LL = reentrantLock;
            this.LLILLJJLI = reentrantLock.newCondition();
            this.LLILLL = new LinkedList();
            this.LLILZ = new LinkedList();
            this.LLILZIL = new LinkedList();
            this.LLILZLL = new LinkedList();
            this.LLIZ = new LinkedList();
        }

        public final void LJIIJ(C2205271BSr c2205271BSr) {
            ((ArrayList) DefaultClusterRenderer.this.LIZJ.LIZLLL).remove(c2205271BSr);
            DefaultClusterRenderer.this.LJIIIZ.LIZ(c2205271BSr);
            DefaultClusterRenderer.this.LJIIL.LIZ(c2205271BSr);
            DefaultClusterRenderer.this.LIZJ.LIZ.LIZJ(c2205271BSr);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("DefaultClusterRenderer$MarkerModifier@b4fd.handleMessage");
            if (!this.LLIZLLLIL) {
                C786410Ut5.f3(this, Looper.myQueue());
                this.LLIZLLLIL = true;
            }
            removeMessages(0);
            ((ReentrantLock) this.LL).lock();
            int i = 0;
            do {
                try {
                    LJIIIIZZ();
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((ReentrantLock) this.LL).unlock();
                    throw th;
                }
            } while (i < 10);
            if (!LJII()) {
                this.LLIZLLLIL = false;
                Looper.myQueue().removeIdleHandler(this);
                this.LLILLJJLI.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10L);
            }
            ((ReentrantLock) this.LL).unlock();
            C1C7U.LIZIZ("DefaultClusterRenderer$MarkerModifier@b4fd.handleMessage");
        }

        public final void LJ(boolean z, DefaultClusterRenderer<T>.d dVar) {
            ((ReentrantLock) this.LL).lock();
            sendEmptyMessage(0);
            if (z) {
                ((LinkedList) this.LLILZ).add(dVar);
            } else {
                ((LinkedList) this.LLILLL).add(dVar);
            }
            ((ReentrantLock) this.LL).unlock();
        }

        public final void LJIIIZ(boolean z, C2205271BSr c2205271BSr) {
            ((ReentrantLock) this.LL).lock();
            sendEmptyMessage(0);
            if (z) {
                ((LinkedList) this.LLILZLL).add(c2205271BSr);
            } else {
                ((LinkedList) this.LLILZIL).add(c2205271BSr);
            }
            ((ReentrantLock) this.LL).unlock();
        }

        public final void LJFF(C1BU2 c1bu2, LatLng latLng, LatLng latLng2) {
            ((ReentrantLock) this.LL).lock();
            ((LinkedList) this.LLIZ).add(new c(c1bu2, latLng, latLng2));
            ((ReentrantLock) this.LL).unlock();
        }
    }

    public class g implements Runnable {
        public final Set<? extends InterfaceC1177120gjm<T>> LL;
        public C1BU5 LLILLJJLI;
        public C1BT3 LLILLL;
        public C1BS6 LLILZ;
        public float LLILZIL;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.maps.model.LatLng, java.lang.String[]] */
        public final void LIZ() throws Throwable {
            LatLngBounds latLngBoundsLIZ;
            ArrayList arrayList;
            ArrayList arrayList2;
            Set<? extends InterfaceC1177120gjm<T>> set = DefaultClusterRenderer.this.LJIIJJI;
            Set setUnmodifiableSet = set != null ? Collections.unmodifiableSet(set) : Collections.emptySet();
            DefaultClusterRenderer defaultClusterRenderer = DefaultClusterRenderer.this;
            Set<? extends InterfaceC1177120gjm<T>> set2 = this.LL;
            defaultClusterRenderer.getClass();
            if (!(!(set2 != null ? Collections.unmodifiableSet(set2) : Collections.emptySet()).equals(setUnmodifiableSet))) {
                this.LLILLJJLI.run();
                return;
            }
            Set<? extends InterfaceC1177120gjm<T>> set3 = DefaultClusterRenderer.this.LJIIJJI;
            Set setUnmodifiableSet2 = set3 != null ? Collections.unmodifiableSet(set3) : Collections.emptySet();
            DefaultClusterRenderer defaultClusterRenderer2 = DefaultClusterRenderer.this;
            Set<? extends InterfaceC1177120gjm<T>> set4 = this.LL;
            defaultClusterRenderer2.getClass();
            boolean z = setUnmodifiableSet2.size() != (set4 != null ? Collections.unmodifiableSet(set4) : Collections.emptySet()).size();
            MarkerModifier markerModifier = new MarkerModifier();
            float f = this.LLILZIL;
            DefaultClusterRenderer defaultClusterRenderer3 = DefaultClusterRenderer.this;
            float f2 = defaultClusterRenderer3.LJIILIIL;
            boolean z2 = f > f2;
            float f3 = f - f2;
            Set<C1BU2> set5 = defaultClusterRenderer3.LJII;
            ?? r2 = 0;
            try {
                C1BT3 c1bt3 = this.LLILLL;
                c1bt3.getClass();
                try {
                    latLngBoundsLIZ = c1bt3.LIZ.LJJIJIIJIL().latLngBounds;
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C829150Wfp(e);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                latLngBoundsLIZ = C2204961BRm.LLLLLLZZ(new C2204971BRn(), new LatLng(0.0d, 0.0d), new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null)).LIZ();
            }
            DefaultClusterRenderer defaultClusterRenderer4 = DefaultClusterRenderer.this;
            if (defaultClusterRenderer4.LJIIJJI == null || !defaultClusterRenderer4.LIZLLL) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (InterfaceC1177120gjm<T> interfaceC1177120gjm : DefaultClusterRenderer.this.LJIIJJI) {
                    if (DefaultClusterRenderer.this.LJIIZILJ(interfaceC1177120gjm) && C2204961BRm.LLLLLZ(latLngBoundsLIZ, C1BSE.LIZ(interfaceC1177120gjm.getPosition()), new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null))) {
                        arrayList.add(this.LLILZ.LIZIZ(C1BSE.LIZ(interfaceC1177120gjm.getPosition())));
                    }
                }
            }
            Set<C1BU2> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (InterfaceC1177120gjm<T> interfaceC1177120gjm2 : this.LL) {
                boolean zLLLLLZ = C2204961BRm.LLLLLZ(latLngBoundsLIZ, C1BSE.LIZ(interfaceC1177120gjm2.getPosition()), new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", r2));
                if (z2 && zLLLLLZ && DefaultClusterRenderer.this.LIZLLL) {
                    C1BS7 c1bs7LJIIIZ = DefaultClusterRenderer.this.LJIIIZ(arrayList, this.LLILZ.LIZIZ(C1BSE.LIZ(interfaceC1177120gjm2.getPosition())));
                    LatLng latLngLIZ = r2;
                    if (c1bs7LJIIIZ != null) {
                        if (z) {
                            latLngLIZ = this.LLILZ.LIZ(c1bs7LJIIIZ);
                        }
                        markerModifier.LJ(true, new d(interfaceC1177120gjm2, setNewSetFromMap, latLngLIZ));
                    } else {
                        markerModifier.LJ(true, new d(interfaceC1177120gjm2, setNewSetFromMap, null));
                    }
                } else {
                    markerModifier.LJ(zLLLLLZ, new d(interfaceC1177120gjm2, setNewSetFromMap, r2));
                }
                r2 = 0;
            }
            markerModifier.LJIIJJI();
            set5.removeAll(setNewSetFromMap);
            if (DefaultClusterRenderer.this.LIZLLL) {
                arrayList2 = new ArrayList();
                for (InterfaceC1177120gjm<T> interfaceC1177120gjm3 : this.LL) {
                    if (DefaultClusterRenderer.this.LJIIZILJ(interfaceC1177120gjm3) && C2204961BRm.LLLLLZ(latLngBoundsLIZ, C1BSE.LIZ(interfaceC1177120gjm3.getPosition()), new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null))) {
                        arrayList2.add(this.LLILZ.LIZIZ(C1BSE.LIZ(interfaceC1177120gjm3.getPosition())));
                    }
                }
            } else {
                arrayList2 = null;
            }
            for (C1BU2 c1bu2 : set5) {
                boolean zLLLLLZ2 = C2204961BRm.LLLLLZ(latLngBoundsLIZ, c1bu2.LIZIZ, new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null));
                if (z2 || f3 <= -3.0f || !zLLLLLZ2 || !DefaultClusterRenderer.this.LIZLLL) {
                    markerModifier.LJIIIZ(zLLLLLZ2, c1bu2.LIZ);
                } else {
                    C1BS7 c1bs7LJIIIZ2 = DefaultClusterRenderer.this.LJIIIZ(arrayList2, this.LLILZ.LIZIZ(c1bu2.LIZIZ));
                    if (c1bs7LJIIIZ2 == null || !z) {
                        markerModifier.LJIIIZ(true, c1bu2.LIZ);
                    } else {
                        LatLng latLngLIZ2 = this.LLILZ.LIZ(c1bs7LJIIIZ2);
                        LatLng latLng = c1bu2.LIZIZ;
                        ((ReentrantLock) markerModifier.LL).lock();
                        c cVar = new c(c1bu2, latLng, latLngLIZ2);
                        cVar.LLILZLL = DefaultClusterRenderer.this.LIZJ.LIZ;
                        cVar.LLILZIL = true;
                        ((LinkedList) markerModifier.LLIZ).add(cVar);
                        ((ReentrantLock) markerModifier.LL).unlock();
                    }
                }
            }
            markerModifier.LJIIJJI();
            DefaultClusterRenderer defaultClusterRenderer5 = DefaultClusterRenderer.this;
            defaultClusterRenderer5.LJII = setNewSetFromMap;
            defaultClusterRenderer5.LJIIJJI = this.LL;
            defaultClusterRenderer5.LJIILIIL = f;
            this.LLILLJJLI.run();
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("DefaultClusterRenderer$RenderTask@6883.run");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("DefaultClusterRenderer$RenderTask@6883.run");
        }

        public g(Set set) {
            this.LL = set;
        }
    }

    @Override // X.InterfaceC2205551BTt
    public final void LIZJ() {
    }

    @Override // X.InterfaceC2205551BTt
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC2205551BTt
    public final void LJ() {
    }

    @Override // X.InterfaceC2205551BTt
    public final void LJII() {
    }

    public void LJIILIIL(T t, C2205271BSr c2205271BSr) {
    }

    public void LJIILL(InterfaceC1177120gjm<T> interfaceC1177120gjm, C2205271BSr c2205271BSr) {
    }

    @Override // X.InterfaceC2205551BTt
    public final void LJFF() {
        C2205451BTj<T> c2205451BTj = this.LIZJ;
        C1BSY c1bsy = c2205451BTj.LIZIZ;
        c1bsy.LJ = null;
        c1bsy.LIZJ = null;
        c1bsy.LIZLLL = null;
        C1BSY c1bsy2 = c2205451BTj.LIZJ;
        c1bsy2.LJ = null;
        c1bsy2.LIZJ = null;
        c1bsy2.LIZLLL = null;
    }

    @Override // X.InterfaceC2205551BTt
    public final void LJI() {
        C2205451BTj<T> c2205451BTj = this.LIZJ;
        C1BSY c1bsy = c2205451BTj.LIZIZ;
        c1bsy.LJ = new InterfaceC2205331BSx() { // from class: X.1BTz
            @Override // X.InterfaceC2205331BSx
            public final boolean LIZLLL(C2205271BSr c2205271BSr) {
                DefaultClusterRenderer defaultClusterRenderer = this.LIZ;
                C1BU6<T> c1bu6 = defaultClusterRenderer.LJIILLIIL;
                if (c1bu6 != 0 && c1bu6.LIZ((C1BU1) ((HashMap) defaultClusterRenderer.LJIIIZ.LIZIZ).get(c2205271BSr))) {
                    return true;
                }
                return false;
            }
        };
        c1bsy.LIZJ = new InterfaceC2205311BSv() { // from class: X.1BU9
            @Override // X.InterfaceC2205311BSv
            public final void LIZIZ(C2205271BSr c2205271BSr) {
                this.LIZ.getClass();
            }
        };
        c1bsy.LIZLLL = new InterfaceC2205321BSw() { // from class: X.1BUA
            @Override // X.InterfaceC2205321BSw
            public final void LIZ(C2205271BSr c2205271BSr) {
                this.LIZ.getClass();
            }
        };
        C1BSY c1bsy2 = c2205451BTj.LIZJ;
        c1bsy2.LJ = new InterfaceC2205331BSx() { // from class: X.1BU0
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC2205331BSx
            public final boolean LIZLLL(C2205271BSr c2205271BSr) {
                DefaultClusterRenderer defaultClusterRenderer = this.LIZ;
                C1BU4<T> c1bu4 = defaultClusterRenderer.LJIILL;
                if (c1bu4 != 0 && c1bu4.LIZ((InterfaceC1177120gjm<T>) ((InterfaceC1177120gjm) ((HashMap) defaultClusterRenderer.LJIIL.LIZIZ).get(c2205271BSr)))) {
                    return true;
                }
                return false;
            }
        };
        c1bsy2.LIZJ = new InterfaceC2205311BSv() { // from class: X.1BUB
            @Override // X.InterfaceC2205311BSv
            public final void LIZIZ(C2205271BSr c2205271BSr) {
                this.LIZ.getClass();
            }
        };
        c1bsy2.LIZLLL = new InterfaceC2205321BSw() { // from class: X.1BUA
            @Override // X.InterfaceC2205321BSw
            public final void LIZ(C2205271BSr c2205271BSr) {
                this.LIZ.getClass();
            }
        };
    }

    public class ViewModifier extends BPEAHandler {
        public static final /* synthetic */ int LLILZ = 0;
        public boolean LL;
        public DefaultClusterRenderer<T>.g LLILLJJLI;

        public ViewModifier() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            DefaultClusterRenderer<T>.g gVar;
            C1C7U.LIZ("DefaultClusterRenderer$ViewModifier@112e.handleMessage");
            if (message.what == 1) {
                this.LL = false;
                if (this.LLILLJJLI != null) {
                    sendEmptyMessage(0);
                }
                C1C7U.LIZIZ("DefaultClusterRenderer$ViewModifier@112e.handleMessage");
                return;
            }
            removeMessages(0);
            if (this.LL) {
                C1C7U.LIZIZ("DefaultClusterRenderer$ViewModifier@112e.handleMessage");
                return;
            }
            if (this.LLILLJJLI == null) {
                C1C7U.LIZIZ("DefaultClusterRenderer$ViewModifier@112e.handleMessage");
                return;
            }
            C1BT3 c1bt3LIZIZ = DefaultClusterRenderer.this.LIZ.LIZIZ();
            synchronized (this) {
                try {
                    gVar = this.LLILLJJLI;
                    this.LLILLJJLI = null;
                    this.LL = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            gVar.LLILLJJLI = new C1BU5(this);
            gVar.LLILLL = c1bt3LIZIZ;
            gVar.LLILZIL = DefaultClusterRenderer.this.LIZ.LIZ().zoom;
            gVar.LLILZ = new C1BS6(Math.pow(2.0d, Math.min(r1, DefaultClusterRenderer.this.LJIILIIL)) * 256.0d);
            DefaultClusterRenderer.this.LJFF.execute(gVar);
            C1C7U.LIZIZ("DefaultClusterRenderer$ViewModifier@112e.handleMessage");
        }
    }

    public class c extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public final C1BU2 LL;
        public final C2205271BSr LLILLJJLI;
        public final LatLng LLILLL;
        public final LatLng LLILZ;
        public boolean LLILZIL;
        public C2205211BSl LLILZLL;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.LLILZIL) {
                DefaultClusterRenderer.this.LJIIIZ.LIZ(this.LLILLJJLI);
                ((ArrayList) DefaultClusterRenderer.this.LIZJ.LIZLLL).remove(this.LLILLJJLI);
                DefaultClusterRenderer.this.LJIIL.LIZ(this.LLILLJJLI);
                this.LLILZLL.LIZJ(this.LLILLJJLI);
            }
            this.LL.LIZIZ = this.LLILZ;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) throws Throwable {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.LLILZ;
            double d = latLng.latitude;
            LatLng latLng2 = this.LLILLL;
            double d2 = latLng2.latitude;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double dSignum = latLng.longitude - latLng2.longitude;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            C2204961BRm.LLLLLZL(this.LLILLJJLI, new LatLng(d4, (dSignum * d3) + this.LLILLL.longitude), new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null));
        }

        public c(C1BU2 c1bu2, LatLng latLng, LatLng latLng2) {
            this.LL = c1bu2;
            this.LLILLJJLI = c1bu2.LIZ;
            this.LLILLL = latLng;
            this.LLILZ = latLng2;
        }
    }

    public class d {
        public final InterfaceC1177120gjm<T> LIZ;
        public final Set<C1BU2> LIZIZ;
        public final LatLng LIZJ;

        public final void LIZ(DefaultClusterRenderer<T>.MarkerModifier markerModifier) throws Throwable {
            C1BU2 c1bu2;
            C1BU2 c1bu22;
            if (!DefaultClusterRenderer.this.LJIIZILJ(this.LIZ)) {
                for (T t : this.LIZ.getItems()) {
                    C2205271BSr c2205271BSrLIZIZ = (C2205271BSr) ((HashMap) DefaultClusterRenderer.this.LJIIIZ.LIZ).get(t);
                    if (c2205271BSrLIZIZ == null) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        LatLng latLng = this.LIZJ;
                        if (latLng != null) {
                            C2204961BRm.LLLLLZIL(markerOptions, latLng, new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null));
                        } else {
                            C2204961BRm.LLLLLZIL(markerOptions, C1BSE.LIZ(t.getPosition()), new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null));
                            if (t.LIZ() != null) {
                                markerOptions.zzn = t.LIZ().floatValue();
                            }
                        }
                        DefaultClusterRenderer.this.LJIIJJI(t, markerOptions);
                        c2205271BSrLIZIZ = DefaultClusterRenderer.this.LIZJ.LIZIZ.LIZIZ(markerOptions);
                        ((ArrayList) DefaultClusterRenderer.this.LIZJ.LIZLLL).add(c2205271BSrLIZIZ);
                        c1bu22 = new C1BU2(c2205271BSrLIZIZ);
                        C2205571BTv<T> c2205571BTv = DefaultClusterRenderer.this.LJIIIZ;
                        ((HashMap) c2205571BTv.LIZ).put(t, c2205271BSrLIZIZ);
                        ((HashMap) c2205571BTv.LIZIZ).put(c2205271BSrLIZIZ, t);
                        LatLng latLng2 = this.LIZJ;
                        if (latLng2 != null) {
                            markerModifier.LJFF(c1bu22, latLng2, C1BSE.LIZ(t.getPosition()));
                        }
                    } else {
                        c1bu22 = new C1BU2(c2205271BSrLIZIZ);
                        DefaultClusterRenderer.this.LJIILJJIL(t, c2205271BSrLIZIZ);
                    }
                    DefaultClusterRenderer.this.LJIILIIL(t, c2205271BSrLIZIZ);
                    this.LIZIZ.add(c1bu22);
                }
                return;
            }
            C2205571BTv<InterfaceC1177120gjm<T>> c2205571BTv2 = DefaultClusterRenderer.this.LJIIL;
            C2205271BSr c2205271BSrLIZIZ2 = (C2205271BSr) ((HashMap) c2205571BTv2.LIZ).get(this.LIZ);
            if (c2205271BSrLIZIZ2 == null) {
                MarkerOptions markerOptions2 = new MarkerOptions();
                LatLng latLngLIZ = this.LIZJ;
                if (latLngLIZ == null) {
                    latLngLIZ = C1BSE.LIZ(this.LIZ.getPosition());
                }
                MarkerOptions markerOptionsLLLLLZIL = C2204961BRm.LLLLLZIL(markerOptions2, latLngLIZ, new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null));
                DefaultClusterRenderer.this.LJIIL(this.LIZ, markerOptionsLLLLLZIL);
                c2205271BSrLIZIZ2 = DefaultClusterRenderer.this.LIZJ.LIZJ.LIZIZ(markerOptionsLLLLLZIL);
                ((ArrayList) DefaultClusterRenderer.this.LIZJ.LIZLLL).add(c2205271BSrLIZIZ2);
                C2205571BTv<InterfaceC1177120gjm<T>> c2205571BTv3 = DefaultClusterRenderer.this.LJIIL;
                InterfaceC1177120gjm<T> interfaceC1177120gjm = this.LIZ;
                ((HashMap) c2205571BTv3.LIZ).put(interfaceC1177120gjm, c2205271BSrLIZIZ2);
                ((HashMap) c2205571BTv3.LIZIZ).put(c2205271BSrLIZIZ2, interfaceC1177120gjm);
                c1bu2 = new C1BU2(c2205271BSrLIZIZ2);
                LatLng latLng3 = this.LIZJ;
                if (latLng3 != null) {
                    markerModifier.LJFF(c1bu2, latLng3, C1BSE.LIZ(this.LIZ.getPosition()));
                }
            } else {
                c1bu2 = new C1BU2(c2205271BSrLIZIZ2);
                DefaultClusterRenderer.this.LJIILLIIL(this.LIZ, c2205271BSrLIZIZ2);
            }
            DefaultClusterRenderer.this.LJIILL(this.LIZ, c2205271BSrLIZIZ2);
            this.LIZIZ.add(c1bu2);
        }

        public d(InterfaceC1177120gjm<T> interfaceC1177120gjm, Set<C1BU2> set, LatLng latLng) {
            this.LIZ = interfaceC1177120gjm;
            this.LIZIZ = set;
            this.LIZJ = latLng;
        }
    }

    @Override // X.InterfaceC2205551BTt
    public final void LIZ(C1BU4<T> c1bu4) {
        this.LJIILL = c1bu4;
    }

    @Override // X.InterfaceC2205551BTt
    public final void LIZIZ(Set<? extends InterfaceC1177120gjm<T>> set) {
        DefaultClusterRenderer<T>.ViewModifier viewModifier = this.LJIILJJIL;
        synchronized (viewModifier) {
            try {
                viewModifier.LLILLJJLI = new g(set);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        viewModifier.sendEmptyMessage(0);
    }

    @Override // X.InterfaceC2205551BTt
    public final void LJIIIIZZ(C1BU6<T> c1bu6) {
        this.LJIILLIIL = c1bu6;
    }

    public final C837010WsV LJIIJ(InterfaceC1177120gjm<T> interfaceC1177120gjm) {
        String strLIZIZ;
        int size = interfaceC1177120gjm.getSize();
        int[] iArr = LJIIZILJ;
        if (size > iArr[0]) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (size < iArr[i2]) {
                    size = iArr[i];
                    break;
                }
                i = i2;
                if (i >= 6) {
                    size = iArr[6];
                    break;
                }
            }
        }
        C837010WsV c837010WsV = this.LJIIIIZZ.get(size);
        if (c837010WsV == null) {
            Paint paint = this.LJI.getPaint();
            float fMin = 300.0f - Math.min(size, 300.0f);
            paint.setColor(Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f}));
            C1336490ksp c1336490ksp = this.LIZIZ;
            Context context = c1336490ksp.LIZ;
            TextView textView = c1336490ksp.LIZLLL;
            if (textView != null) {
                textView.setTextAppearance(context, R.style.a_5);
            }
            C1336490ksp c1336490ksp2 = this.LIZIZ;
            if (size < iArr[0]) {
                strLIZIZ = String.valueOf(size);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(size);
                sbLIZ.append("+");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            TextView textView2 = c1336490ksp2.LIZLLL;
            if (textView2 != null) {
                textView2.setText(strLIZIZ);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            c1336490ksp2.LIZIZ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredWidth = c1336490ksp2.LIZIZ.getMeasuredWidth();
            int measuredHeight = c1336490ksp2.LIZIZ.getMeasuredHeight();
            c1336490ksp2.LIZIZ.layout(0, 0, measuredWidth, measuredHeight);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            c1336490ksp2.LIZIZ.draw(new Canvas(bitmapCreateBitmap));
            C837010WsV c837010WsVLIZ = C1BT8.LIZ(bitmapCreateBitmap);
            this.LJIIIIZZ.put(size, c837010WsVLIZ);
            return c837010WsVLIZ;
        }
        return c837010WsV;
    }

    public boolean LJIIZILJ(InterfaceC1177120gjm<T> interfaceC1177120gjm) {
        if (interfaceC1177120gjm.getSize() >= this.LJIIJ) {
            return true;
        }
        return false;
    }

    public final C1BS7 LJIIIZ(List list, C1BSB c1bsb) {
        C1BS7 c1bs7 = null;
        if (list != null && !list.isEmpty()) {
            int iLJ = this.LIZJ.LJ.LJ();
            double d2 = iLJ * iLJ;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1BS7 c1bs72 = (C1BS7) it2.next();
                double d3 = c1bs72.LIZ - c1bsb.LIZ;
                double d4 = c1bs72.LIZIZ - c1bsb.LIZIZ;
                double d5 = (d3 * d3) + (d4 * d4);
                if (d5 < d2) {
                    c1bs7 = c1bs72;
                    d2 = d5;
                }
            }
        }
        return c1bs7;
    }

    public void LJIIJJI(T t, MarkerOptions markerOptions) {
        if (t.getTitle() != null) {
            t.getSnippet();
        }
        if (t.getTitle() != null) {
            markerOptions.zzb = t.getTitle();
        } else {
            t.getSnippet();
        }
    }

    public void LJIIL(InterfaceC1177120gjm<T> interfaceC1177120gjm, MarkerOptions markerOptions) {
        markerOptions.zzd = LJIIJ(interfaceC1177120gjm);
    }

    public void LJIILJJIL(T t, C2205271BSr c2205271BSr) throws Throwable {
        boolean z;
        if (t.getTitle() != null) {
            t.getSnippet();
        }
        t.getSnippet();
        if (t.getTitle() != null && !t.getTitle().equals(c2205271BSr.LIZIZ())) {
            try {
                c2205271BSr.LIZ.LLJI(t.getTitle());
                z = true;
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C829150Wfp(e);
            }
        } else {
            z = false;
        }
        if (!c2205271BSr.LIZ().equals(t.getPosition())) {
            C2204961BRm.LLLLLZL(c2205271BSr, C1BSE.LIZ(t.getPosition()), new C0WZX("dzBzEgU1UM3QUBksRAKXKFCwkAhtNPrPB7kDqzRQXgR25XjbY8SJn58k2MGr4kxgisenkExbymYGlnS1t4M=", null));
            if (t.LIZ() != null) {
                try {
                    c2205271BSr.LIZ.LLJLIL(t.LIZ().floatValue());
                } catch (RemoteException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw new C829150Wfp(e2);
                }
            }
        } else if (!z) {
            return;
        }
        try {
            if (c2205271BSr.LIZ.LLJJIJI()) {
                try {
                    c2205271BSr.LIZ.LLJIJIL();
                } catch (RemoteException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new C829150Wfp(e3);
                }
            }
        } catch (RemoteException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new C829150Wfp(e4);
        }
    }

    public void LJIILLIIL(InterfaceC1177120gjm<T> interfaceC1177120gjm, C2205271BSr c2205271BSr) {
        try {
            c2205271BSr.LIZ.U(LJIIJ(interfaceC1177120gjm).LIZ);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    public DefaultClusterRenderer(final Context context, C1BSM c1bsm, C2205451BTj<T> c2205451BTj) {
        this.LIZ = c1bsm;
        float f = context.getResources().getDisplayMetrics().density;
        C1336490ksp c1336490ksp = new C1336490ksp(context);
        this.LIZIZ = c1336490ksp;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context) { // from class: X.0Gid
            public int LLIZLLLIL;
            public int LLJ;

            @Override // android.view.View
            public final void draw(Canvas canvas) {
                canvas.translate(this.LLJ / 2, this.LLIZLLLIL / 2);
                super.draw(canvas);
            }

            @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int iMax = Math.max(measuredWidth, measuredHeight);
                if (measuredWidth > measuredHeight) {
                    this.LLIZLLLIL = measuredWidth - measuredHeight;
                    this.LLJ = 0;
                } else {
                    this.LLIZLLLIL = 0;
                    this.LLJ = measuredHeight - measuredWidth;
                }
                setMeasuredDimension(iMax, iMax);
            }
        };
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(appCompatTextView);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setId(R.id.az1);
        int i = (int) (12.0f * f);
        appCompatTextView.setPadding(i, i, i, i);
        C371710Ehl c371710Ehl = c1336490ksp.LIZJ;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c371710Ehl, null);
        c371710Ehl.removeAllViews();
        c1336490ksp.LIZJ.addView(appCompatTextView);
        View viewFindViewById = c1336490ksp.LIZJ.findViewById(R.id.az1);
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        c1336490ksp.LIZLLL = textView;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.a_5);
        }
        this.LJI = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.LJI});
        int i2 = (int) (f * 3.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        c1336490ksp.LIZ(layerDrawable);
        this.LIZJ = c2205451BTj;
    }
}
