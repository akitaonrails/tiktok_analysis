package com.ss.android.ugc.aweme.im.activestatus.api.utils;

import X.C09AX;
import X.C09DV;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import X.InterfaceC897330ZId;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.api.utils.ActivityStatusClientExtKt$observeActivityStatusClient$1$1", f = "ActivityStatusClientExt.kt", l = {}, m = "invokeSuspend")
public final class ActivityStatusClientExtKt$observeActivityStatusClient$1$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ InterfaceC897330ZId LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityStatusClientExtKt$observeActivityStatusClient$1$1(LifecycleOwner lifecycleOwner, InterfaceC897330ZId interfaceC897330ZId, InterfaceC1364105Vn<? super ActivityStatusClientExtKt$observeActivityStatusClient$1$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC897330ZId;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        ActivityStatusClientExtKt$observeActivityStatusClient$1$1 activityStatusClientExtKt$observeActivityStatusClient$1$1 = new ActivityStatusClientExtKt$observeActivityStatusClient$1$1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        activityStatusClientExtKt$observeActivityStatusClient$1$1.LL = obj;
        return activityStatusClientExtKt$observeActivityStatusClient$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "ActivityStatusClientExtKt@28a6.observeActivityStatusClient$1$1"
            X.C1C7U.LIZ(r3)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r5)
            androidx.lifecycle.LifecycleOwner r0 = r4.LLILLJJLI
            X.0ZId r2 = r4.LLILLL
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L24
        L14:
            androidx.lifecycle.Lifecycle r1 = r0.getLifecycle()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L12
            com.ss.android.ugc.aweme.im.activestatus.api.utils.ActivityStatusClientExtKt$observeActivityStatusClient$1$1$1$1 r0 = new com.ss.android.ugc.aweme.im.activestatus.api.utils.ActivityStatusClientExtKt$observeActivityStatusClient$1$1$1$1     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            r1.addObserver(r0)     // Catch: java.lang.Throwable -> L28
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L28
        L24:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L28
            goto L34
        L28:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L34:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.activestatus.api.utils.ActivityStatusClientExtKt$observeActivityStatusClient$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
