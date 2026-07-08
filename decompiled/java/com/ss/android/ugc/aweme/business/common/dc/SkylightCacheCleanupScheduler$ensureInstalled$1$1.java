package com.ss.android.ugc.aweme.business.common.dc;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.C1720106oR;
import X.C189200o6;
import X.C1C7U;
import X.C2187451AjH;
import X.C23250099c;
import X.C356901a3;
import X.C610990Nxp;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler$ensureInstalled$1$1", f = "SkylightCacheCleanupScheduler.kt", l = {}, m = "invokeSuspend")
public final class SkylightCacheCleanupScheduler$ensureInstalled$1$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SkylightCacheCleanupScheduler LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkylightCacheCleanupScheduler$ensureInstalled$1$1(SkylightCacheCleanupScheduler skylightCacheCleanupScheduler, InterfaceC1364105Vn<? super SkylightCacheCleanupScheduler$ensureInstalled$1$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = skylightCacheCleanupScheduler;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new SkylightCacheCleanupScheduler$ensureInstalled$1$1(this.LL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler$ensureInstalled$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ SkylightCacheCleanupScheduler LL;

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

        public AnonymousClass1(SkylightCacheCleanupScheduler skylightCacheCleanupScheduler) {
            this.LL = skylightCacheCleanupScheduler;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            AnonymousClass0956 anonymousClass0956 = SkylightCacheCleanupScheduler.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            SkylightCacheCleanupScheduler.LIZLLL = null;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            Object c098200Yq;
            SkylightCacheCleanupScheduler skylightCacheCleanupScheduler = this.LL;
            skylightCacheCleanupScheduler.getClass();
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) SkylightCacheCleanupScheduler.LIZJ.getValue();
            if (interfaceC497601wk != null) {
                try {
                    AnonymousClass0956 anonymousClass0956 = SkylightCacheCleanupScheduler.LIZLLL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    SkylightCacheCleanupScheduler.LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C610990Nxp(skylightCacheCleanupScheduler, null), 3);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("SkylightDbCleanup", "scheduleCleanup failed", thM5exceptionOrNullimpl);
                }
            }
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightCacheCleanupScheduler@ae1d.ensureInstalled$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new AnonymousClass1(this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightCacheCleanupScheduler@ae1d.ensureInstalled$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
