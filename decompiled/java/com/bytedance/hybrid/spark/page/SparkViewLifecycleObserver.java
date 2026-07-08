package com.bytedance.hybrid.spark.page;

import X.C086F;
import X.C1535630q41;
import X.C356901a3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS117S0100000_17;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkViewLifecycleObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
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

    public SparkViewLifecycleObserver(WeakReference<SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> weakReference) {
        this.LL = weakReference;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        long j;
        SparkContext sparkContext;
        C356901a3.LIZIZ(this, lifecycleOwner);
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("destroy_kit_view_automatically"), Boolean.TRUE)) {
            C086F c086f = C086F.LIZ;
            ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 126);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL.get();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
                j = sparkContext.autoDestroyDelayTimeInMillSeconds;
            } else {
                j = 200;
            }
            c086f.getClass();
            C086F.LIZIZ(j, aRunnableS117S0100000_17);
        }
    }
}
