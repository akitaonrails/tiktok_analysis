package com.bytedance.creativex.recorder.gesture;

import X.AbstractC21664519qV;
import X.AbstractC21664719qX;
import X.C21645419nQ;
import X.C786410Ut5;
import X.InterfaceC1650300t2y;
import X.InterfaceC21645719nT;
import X.InterfaceC21664819qY;
import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import zoo.b;

/* JADX INFO: loaded from: classes34.dex */
public class DefaultGesturePresenter implements InterfaceC21645719nT, InterfaceC1650300t2y, GenericLifecycleObserver {
    public VideoRecordGestureLayout LLILZLL;
    public final InterfaceC21664819qY LLIZ;
    public final int LLJ;
    public boolean LL = true;
    public final List<InterfaceC1650300t2y> LLILLJJLI = new ArrayList();
    public final TreeMap<Integer, HashSet<Integer>> LLILLL = new TreeMap<>();
    public final Map<Integer, AbstractC21664519qV> LLILZ = new ConcurrentHashMap();
    public final List<AbstractC21664519qV> LLILZIL = new CopyOnWriteArrayList();
    public float LLIZLLLIL = 0.0f;
    public boolean LLJI = true;
    public boolean LLJIJIL = false;
    public boolean LLJILJIL = true;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            disAttachView();
        }
    }

    @Override // X.InterfaceC21645719nT
    public final void LIZ() {
        if (!this.LL) {
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILZIL).iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    @Override // X.InterfaceC21645719nT
    public final boolean LIZLLL() {
        if (!this.LL) {
            return false;
        }
        for (Object obj : (CopyOnWriteArrayList) this.LLILZIL) {
            if (obj != null) {
                obj.getClass();
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean LJ() {
        if (!this.LL) {
            return false;
        }
        for (Object obj : (CopyOnWriteArrayList) this.LLILZIL) {
            if (obj != null) {
                obj.getClass();
            }
        }
        return false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void disAttachView() {
        this.LLILZLL.setOnGestureListener(null);
        this.LLILZLL.setOnInterceptListener(null);
    }

    @Override // X.InterfaceC21645719nT
    public final boolean E2(C21645419nQ c21645419nQ) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.E2(c21645419nQ)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean LIZIZ(MotionEvent motionEvent) {
        if ((!this.LL) || !this.LLJI) {
            return false;
        }
        this.LLJI = false;
        C786410Ut5.LJLIIL(300L, new BPEAHandler(), new ARunnableS133S0100000_33(this, 31));
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.LIZIZ(motionEvent)) {
                return true;
            }
        }
        InterfaceC21664819qY interfaceC21664819qY = this.LLIZ;
        if (interfaceC21664819qY != null && interfaceC21664819qY.ne()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final void LJFF(b bVar) {
        if (!this.LL) {
            return;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null) {
                abstractC21664719qX.LJFF(bVar);
            }
        }
    }

    @Override // X.InterfaceC21645719nT
    public final boolean LJIIIZ(float f) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.LJIIIZ(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean LJJLIIIJLJLI(float f) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.LJJLIIIJLJLI(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean LLLLJI(float f) {
        if (!this.LL) {
            return false;
        }
        InterfaceC21664819qY interfaceC21664819qY = this.LLIZ;
        if (interfaceC21664819qY != null) {
            interfaceC21664819qY.onScaleEnd();
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.LLLLJI(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean LLLZLZ(b bVar) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.LLLZLZ(bVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.onDown(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.onScale(scaleGestureDetector)) {
                return true;
            }
        }
        InterfaceC21664819qY interfaceC21664819qY = this.LLIZ;
        if (interfaceC21664819qY != null) {
            scaleGestureDetector.getScaleFactor();
            if (interfaceC21664819qY.LIZ()) {
                return true;
            }
        }
        InterfaceC21664819qY interfaceC21664819qY2 = this.LLIZ;
        if (interfaceC21664819qY2 == null) {
            return false;
        }
        return interfaceC21664819qY2.onScale(scaleGestureDetector);
    }

    @Override // X.InterfaceC21645719nT
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.onScaleBegin(scaleGestureDetector)) {
                return true;
            }
        }
        InterfaceC21664819qY interfaceC21664819qY = this.LLIZ;
        if (interfaceC21664819qY == null) {
            return false;
        }
        return interfaceC21664819qY.onScaleBegin();
    }

    @Override // X.InterfaceC21645719nT
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if ((!this.LL) || !this.LLJILJIL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.onSingleTapConfirmed(motionEvent)) {
                return true;
            }
        }
        InterfaceC21664819qY interfaceC21664819qY = this.LLIZ;
        if (interfaceC21664819qY != null && interfaceC21664819qY.le(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.onSingleTapUp(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final void onTouchEvent(MotionEvent motionEvent) {
        if (!this.LL) {
            return;
        }
        for (AbstractC21664519qV abstractC21664519qV : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664519qV != null) {
                abstractC21664519qV.LJIILJJIL(motionEvent, 0);
            }
        }
    }

    @Override // X.InterfaceC21645719nT
    public final boolean onUp(MotionEvent motionEvent) {
        if (!this.LL) {
            return false;
        }
        if (this.LLJIJIL && this.LLIZ != null) {
            HandlerHook.viewPostDelay(this.LLILZLL, new ARunnableS133S0100000_33(this, 30), 100L);
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.onUp(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21645719nT
    public final void LIZJ(MotionEvent motionEvent, int[] iArr) {
        if (!this.LL) {
            return;
        }
        for (AbstractC21664519qV abstractC21664519qV : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664519qV != null) {
                abstractC21664519qV.LIZJ(motionEvent, iArr);
            }
        }
    }

    @Override // X.InterfaceC21645719nT
    public final void LJI(MotionEvent motionEvent, int[] iArr) {
        if (!this.LL) {
            return;
        }
        for (AbstractC21664519qV abstractC21664519qV : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664519qV != null) {
                abstractC21664519qV.LJI(motionEvent, iArr);
            }
        }
    }

    @Override // X.InterfaceC21645719nT
    public final void LJII(MotionEvent motionEvent, int[] iArr) {
        if (!this.LL) {
            return;
        }
        for (AbstractC21664519qV abstractC21664519qV : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664519qV != null) {
                abstractC21664519qV.LJII(motionEvent, iArr);
            }
        }
    }

    @Override // X.InterfaceC21645719nT
    public final void LJIIIIZZ(MotionEvent motionEvent, int[] iArr) {
        if (!this.LL) {
            return;
        }
        for (AbstractC21664519qV abstractC21664519qV : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664519qV != null) {
                abstractC21664519qV.LJIIIIZZ(motionEvent, iArr);
            }
        }
    }

    @Override // X.InterfaceC21645719nT
    public final void LJIIJ(MotionEvent motionEvent, int[] iArr) {
        if (!this.LL) {
            return;
        }
        for (AbstractC21664519qV abstractC21664519qV : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664519qV != null) {
                abstractC21664519qV.LJIIJ(motionEvent, iArr);
            }
        }
    }

    @Override // X.InterfaceC1650300t2y
    public final boolean LJIIJJI(MotionEvent motionEvent, float f, float f2) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC1650300t2y) it2.next()).LJIIJJI(motionEvent, f, f2)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIL(AbstractC21664519qV abstractC21664519qV, int i, int i2) {
        ((ConcurrentHashMap) this.LLILZ).put(Integer.valueOf(i), abstractC21664519qV);
        HashSet<Integer> hashSet = this.LLILLL.get(Integer.valueOf(i2));
        if (hashSet != null) {
            hashSet.add(Integer.valueOf(i));
        } else {
            HashSet<Integer> hashSet2 = new HashSet<>(1);
            hashSet2.add(Integer.valueOf(i));
            this.LLILLL.put(Integer.valueOf(i2), hashSet2);
        }
        ((CopyOnWriteArrayList) this.LLILZIL).clear();
        ArrayList arrayList = new ArrayList();
        Iterator<HashSet<Integer>> it2 = this.LLILLL.values().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next());
        }
        for (Object obj : arrayList) {
            ((CopyOnWriteArrayList) this.LLILZIL).add(((ConcurrentHashMap) this.LLILZ).get(obj));
        }
    }

    @Override // X.InterfaceC21645719nT
    public final boolean LLLLLLLLL(b bVar, float f, float f2) {
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.LLLLLLLLL(bVar, f, f2)) {
                return true;
            }
        }
        return false;
    }

    public DefaultGesturePresenter(Context context, LifecycleOwner lifecycleOwner, InterfaceC21664819qY interfaceC21664819qY, View view) {
        this.LLIZ = interfaceC21664819qY;
        if (view instanceof VideoRecordGestureLayout) {
            VideoRecordGestureLayout videoRecordGestureLayout = (VideoRecordGestureLayout) view;
            this.LLILZLL = videoRecordGestureLayout;
            videoRecordGestureLayout.setOnGestureListener(this);
            this.LLILZLL.setOnInterceptListener(this);
        }
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLJ = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    @Override // X.InterfaceC21645719nT
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC21664719qX abstractC21664719qX;
        boolean z = false;
        this.LLJIJIL = false;
        if (!this.LL) {
            return false;
        }
        if (((ConcurrentHashMap) this.LLILZ).containsKey(13)) {
            abstractC21664719qX = (AbstractC21664719qX) ((ConcurrentHashMap) this.LLILZ).get(13);
            if (abstractC21664719qX != null && abstractC21664719qX.onFling(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        } else {
            abstractC21664719qX = null;
        }
        for (AbstractC21664719qX abstractC21664719qX2 : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX == null || abstractC21664719qX2 != abstractC21664719qX) {
                if (abstractC21664719qX2 != null && abstractC21664719qX2.onFling(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
            }
        }
        if (motionEvent != null && motionEvent2 != null && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            InterfaceC21664819qY interfaceC21664819qY = this.LLIZ;
            if (interfaceC21664819qY != null && interfaceC21664819qY.ke(f, this.LLIZLLLIL)) {
                z = true;
            }
            this.LLIZLLLIL = 0.0f;
        }
        return z;
    }

    @Override // X.InterfaceC21645719nT
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        InterfaceC21664819qY interfaceC21664819qY;
        if (!this.LL) {
            return false;
        }
        for (AbstractC21664719qX abstractC21664719qX : (CopyOnWriteArrayList) this.LLILZIL) {
            if (abstractC21664719qX != null && abstractC21664719qX.onScroll(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        int iAbs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int iAbs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        int i = this.LLJ;
        if (iAbs > i && iAbs > iAbs2) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = z;
        if (iAbs > i && iAbs > iAbs2) {
            float width = this.LLIZLLLIL + (f / this.LLILZLL.getWidth());
            this.LLIZLLLIL = width;
            float fMin = Math.min(width, 1.0f);
            this.LLIZLLLIL = fMin;
            float fMax = Math.max(fMin, -1.0f);
            this.LLIZLLLIL = fMax;
            InterfaceC21664819qY interfaceC21664819qY2 = this.LLIZ;
            if (interfaceC21664819qY2 != null && interfaceC21664819qY2.me(fMax)) {
                return true;
            }
            return false;
        }
        if (iAbs < iAbs2 && (interfaceC21664819qY = this.LLIZ) != null && interfaceC21664819qY.setExposureSeekBarProgress(f2)) {
            return true;
        }
        return false;
    }
}
