package com.ss.android.ugc.aweme.asynctask;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0C64;
import X.C0LB2;
import X.C0LC0;
import X.C155000ia;
import X.C1C7U;
import X.C23250099c;
import X.C356901a3;
import X.C538790LBd;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.asynctask.AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1", f = "AsyncTaskManagerServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C538790LBd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1(C538790LBd c538790LBd, InterfaceC1364105Vn<? super AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c538790LBd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1(this.LL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.asynctask.AsyncTaskManagerServiceImpl$restoreFinishedTaskAtAppForeground$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ C538790LBd LL;

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass1(C538790LBd c538790LBd) {
            this.LL = c538790LBd;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            C0LC0.LIZ("AIGCOfflinePushManager", "App foreground detected");
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "arch_preload_download_enabled", true, false)) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C0LB2(this.LL, null), 3);
            }
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AsyncTaskManagerServiceImpl@7ddd.restoreFinishedTaskAtAppForeground$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new AnonymousClass1(this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AsyncTaskManagerServiceImpl@7ddd.restoreFinishedTaskAtAppForeground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
