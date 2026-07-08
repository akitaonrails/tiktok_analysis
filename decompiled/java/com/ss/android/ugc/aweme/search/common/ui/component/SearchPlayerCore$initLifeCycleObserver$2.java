package com.ss.android.ugc.aweme.search.common.ui.component;

import X.C356901a3;
import X.C661850Pxf;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPlayerCore$initLifeCycleObserver$2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C661850Pxf LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
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

    public SearchPlayerCore$initLifeCycleObserver$2(C661850Pxf c661850Pxf) {
        this.LL = c661850Pxf;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LL.LLJILLL = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:3:0x0008, B:5:0x0016, B:7:0x001c, B:9:0x002d, B:10:0x0031, B:12:0x0037, B:13:0x0040, B:15:0x004c, B:17:0x0057, B:19:0x0065, B:22:0x006a, B:24:0x006e, B:27:0x0077, B:29:0x007d, B:31:0x0083, B:32:0x0087, B:34:0x008d, B:43:0x00a1, B:45:0x00a5, B:46:0x00a9, B:38:0x0094, B:40:0x0098), top: B:54:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[SYNTHETIC] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause(androidx.lifecycle.LifecycleOwner r8) {
        /*
            r7 = this;
            X.C356901a3.LIZJ(r7, r8)
            X.0Pxf r4 = r7.LL
            r4.getClass()
            java.lang.String r3 = X.C661520Px8.LIZIZ     // Catch: java.lang.Throwable -> Lb4
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r6 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ     // Catch: java.lang.Throwable -> Lb4
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> Lb4
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L4c
            X.198i r2 = r0.LIZLLL()     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L4c
        L1c:
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> Lb4
            android.app.Activity r0 = X.C2493909px.LIZ(r0)     // Catch: java.lang.Throwable -> Lb4
            r6.getClass()     // Catch: java.lang.Throwable -> Lb4
            java.lang.Integer r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJIJIIJI(r2, r0)     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L4a
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> Lb4
        L31:
            boolean r0 = kotlin.text.a0.LJJJIL(r3)     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map<java.lang.Integer, java.lang.String> r0 = X.C661520Px8.LIZ     // Catch: java.lang.Throwable -> Lb4
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lb4
        L40:
            java.lang.String r0 = ""
            X.C661520Px8.LIZIZ = r0     // Catch: java.lang.Throwable -> Lb4
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> Lb4
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> Lb4
            goto Lb3
        L4a:
            r1 = -1
            goto L31
        L4c:
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> Lb4
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)     // Catch: java.lang.Throwable -> Lb4
            r5 = 0
            if (r0 == 0) goto L77
            android.content.Context r0 = r4.getContext()     // Catch: java.lang.Throwable -> Lb4
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = X.C294780Bgy.LIZ()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L6a
            boolean r0 = r1 instanceof X.InterfaceC214897198d     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L77
            goto Lb0
        L6a:
            boolean r0 = r1 instanceof X.InterfaceC214897198d     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto Lb0
            X.198d r1 = (X.InterfaceC214897198d) r1     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r1.getEnableSAF()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L77
            goto Lb0
        L77:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb0
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L92
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)     // Catch: java.lang.Throwable -> Lb4
        L87:
            boolean r0 = X.C294780Bgy.LIZ()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L94
            boolean r0 = r1 instanceof X.InterfaceC214897198d     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto La1
            goto Lb0
        L92:
            r1 = r5
            goto L87
        L94:
            boolean r0 = r1 instanceof X.InterfaceC214897198d     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto Lb0
            X.198d r1 = (X.InterfaceC214897198d) r1     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r1.getEnableSAF()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto La1
            goto Lb0
        La1:
            boolean r0 = r2 instanceof X.InterfaceC214902198i     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto La9
            X.198i r2 = (X.InterfaceC214902198i) r2     // Catch: java.lang.Throwable -> Lb4
            goto L1c
        La9:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb0
            goto La1
        Lb0:
            r2 = r5
            goto L1c
        Lb3:
            return
        Lb4:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.ui.component.SearchPlayerCore$initLifeCycleObserver$2.onPause(androidx.lifecycle.LifecycleOwner):void");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        C661850Pxf c661850Pxf = this.LL;
        c661850Pxf.LLJILJILJ = c661850Pxf.LLJILLL;
    }
}
