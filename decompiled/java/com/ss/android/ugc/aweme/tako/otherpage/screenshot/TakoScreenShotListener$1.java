package com.ss.android.ugc.aweme.tako.otherpage.screenshot;

import X.AnonymousClass0956;
import X.C07Q4;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0OBA;
import X.C0OBB;
import X.C155000ia;
import X.C1C7U;
import X.C356901a3;
import X.C593400NPe;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.screenshot.TakoScreenShotListener$1", f = "TakoScreenShotManager.kt", l = {}, m = "invokeSuspend")
public final class TakoScreenShotListener$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0OBB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakoScreenShotListener$1(C0OBB c0obb, InterfaceC1364105Vn<? super TakoScreenShotListener$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0obb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new TakoScreenShotListener$1(this.LL, interfaceC1364105Vn);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.tako.otherpage.screenshot.TakoScreenShotListener$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final /* synthetic */ C0OBB LL;

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

        public AnonymousClass1(C0OBB c0obb) {
            this.LL = c0obb;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            lifecycleOwner.getLifecycle().removeObserver(this);
            if (C07Q4.LIZ()) {
                C0OBA c0oba = C0OBA.LIZ;
                String str = this.LL.LL;
                synchronized (c0oba) {
                    C593400NPe c593400NPe = C0OBA.LIZIZ;
                    C0OBB c0obb = c593400NPe.LIZ.get(C593400NPe.LIZ(str, lifecycleOwner));
                    if (c0obb != null) {
                        ((IScreenshotService) C0OBA.LIZJ.getValue()).LIZLLL(c0obb);
                    }
                    c593400NPe.LIZ.remove(C593400NPe.LIZ(str, lifecycleOwner));
                }
            } else {
                C0OBA.LIZ.getClass();
                C0OBA.LIZIZ.LIZ.remove(C593400NPe.LIZ(this.LL.LL, lifecycleOwner));
            }
            C0OBB c0obb2 = this.LL;
            c0obb2.LLJILJIL = null;
            AnonymousClass0956 anonymousClass0956 = c0obb2.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Lifecycle lifecycle;
        C1C7U.LIZ("TakoScreenShotListener@a371.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LifecycleOwner lifecycleOwnerLIZIZ = this.LL.LIZIZ();
        if (lifecycleOwnerLIZIZ != null && (lifecycle = lifecycleOwnerLIZIZ.getLifecycle()) != null) {
            lifecycle.addObserver(new AnonymousClass1(this.LL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoScreenShotListener@a371.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
