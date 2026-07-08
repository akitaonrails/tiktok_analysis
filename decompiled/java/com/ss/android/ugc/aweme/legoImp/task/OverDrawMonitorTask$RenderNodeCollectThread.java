package com.ss.android.ugc.aweme.legoImp.task;

import X.C0W9U;
import X.C786410Ut5;
import Y.ARunnableS104S0100000_4;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public final class OverDrawMonitorTask$RenderNodeCollectThread extends a implements GenericLifecycleObserver {
    public OverDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onAppBackground();
        } else if (event == Lifecycle.Event.ON_START) {
            onAppForeground();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onAppBackground() {
        OverDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 = this.LL;
        if (overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 != null) {
            overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2.removeCallbacksAndMessages(null);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onAppForeground() {
        OverDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 = this.LL;
        if (overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 != null) {
            C786410Ut5.LJLILLLLZI(overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.Handler, com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2] */
    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            C786410Ut5.LJJZZIII(new Handler(Looper.getMainLooper()), new ARunnableS104S0100000_4((Object) this, 27));
            final Looper looper = getLooper();
            ?? r1 = new BPEAHandler(looper) { // from class: com.ss.android.ugc.aweme.legoImp.task.OverDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2
                @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
                public final void dispatchMessage(Message message) {
                    this.LL.getClass();
                    System.currentTimeMillis();
                    throw null;
                }
            };
            r1.sendEmptyMessage(0);
            this.LL = r1;
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    @Override // android.os.HandlerThread
    public final boolean quit() {
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
        OverDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 = this.LL;
        if (overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 != null) {
            overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2.removeCallbacksAndMessages(null);
        }
        this.LL = null;
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public final boolean quitSafely() {
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
        OverDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 = this.LL;
        if (overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2 != null) {
            overDrawMonitorTask$RenderNodeCollectThread$onLooperPrepared$2.removeCallbacksAndMessages(null);
        }
        this.LL = null;
        return super.quitSafely();
    }
}
