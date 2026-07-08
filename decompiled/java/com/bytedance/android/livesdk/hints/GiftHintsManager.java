package com.bytedance.android.livesdk.hints;

import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes.dex */
public final class GiftHintsManager implements GenericLifecycleObserver {
    public static final GiftHintsManager LL = new GiftHintsManager();
    public static volatile boolean LLILLJJLI;
    public static volatile boolean LLILLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LLILLL = false;
        LLILLJJLI = false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.bytedance.android.livesdk.gift.model.GiftHintRequest r6, X.InterfaceC1364105Vn<? super java.util.List<com.bytedance.android.livesdk.gift.model.GiftHintInfo>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C308601Ho
            if (r0 == 0) goto L20
            r4 = r7
            X.01Ho r4 = (X.C308601Ho) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L4b
        L20:
            X.01Ho r4 = new X.01Ho
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L60
            java.lang.Class<com.bytedance.android.livesdk.hints.LiveGiftApi> r0 = com.bytedance.android.livesdk.hints.LiveGiftApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L60
            com.bytedance.android.livesdk.hints.LiveGiftApi r1 = (com.bytedance.android.livesdk.hints.LiveGiftApi) r1     // Catch: java.lang.Throwable -> L60
            java.util.List<java.lang.Integer> r0 = r6.hintIds     // Catch: java.lang.Throwable -> L60
            r4.LLILLL = r2     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r1.fetchGiftHints(r0, r4)     // Catch: java.lang.Throwable -> L60
            if (r1 != r3) goto L4e
            return r3
        L4b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L60
        L4e:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Throwable -> L60
            T r0 = r1.data     // Catch: java.lang.Throwable -> L60
            com.bytedance.android.livesdk.gift.model.GiftHintResponse$Data r0 = (com.bytedance.android.livesdk.gift.model.GiftHintResponse.Data) r0     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L5a
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftHintInfo> r1 = r0.hints     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L5c
        L5a:
            X.13BV r1 = X.C13BV.INSTANCE     // Catch: java.lang.Throwable -> L60
        L5c:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L60
            goto L6c
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L6c:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L73
            r1 = 0
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.hints.GiftHintsManager.LIZ(com.bytedance.android.livesdk.gift.model.GiftHintRequest, X.05Vn):java.lang.Object");
    }
}
