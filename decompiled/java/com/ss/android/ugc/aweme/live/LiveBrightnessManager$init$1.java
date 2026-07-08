package com.ss.android.ugc.aweme.live;

import X.C0WZX;
import X.C1300690jx5;
import X.C2204961BRm;
import X.C356901a3;
import X.C786410Ut5;
import X.C838130WuJ;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class LiveBrightnessManager$init$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ LiveBrightnessManager LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public LiveBrightnessManager$init$1(LiveBrightnessManager liveBrightnessManager) {
        this.LL = liveBrightnessManager;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LL.release();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) throws Throwable {
        Object objH2;
        C356901a3.LIZLLL(this, lifecycleOwner);
        LiveBrightnessManager liveBrightnessManager = this.LL;
        if (liveBrightnessManager.LLILZLL) {
            SensorManager sensorManager = liveBrightnessManager.LLILLL;
            if (sensorManager == null) {
                Context context = liveBrightnessManager.LL.getContext();
                if (context != null) {
                    objH2 = C786410Ut5.H2(context, "sensor");
                } else {
                    objH2 = null;
                }
                sensorManager = (SensorManager) objH2;
            }
            liveBrightnessManager.LLILLL = sensorManager;
            Sensor sensorLJJL = liveBrightnessManager.LLILZ;
            if (sensorLJJL == null) {
                sensorLJJL = C2204961BRm.LJJL(sensorManager, 5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA8DvnvqwrQuiVv8FYG3U7y6VPtve9", null));
            }
            liveBrightnessManager.LLILZ = sensorLJJL;
            try {
                liveBrightnessManager.LLIZ = true;
                SensorManager sensorManager2 = liveBrightnessManager.LLILLL;
                if (sensorManager2 != null) {
                    C1300690jx5.LIZJ(sensorManager2, liveBrightnessManager, sensorLJJL, 3, liveBrightnessManager.LLJILJILJ);
                }
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
