package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C339190DRl;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiDetailStatusAssem extends PoiDetailBaseUiSlotComponent<Object> implements ContainerEventDispatcher$RefreshActionCallBackAbility {
    public C1749280vcc LLJJIJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e3l;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void X0(String str) {
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void i1() {
        C1749280vcc c1749280vcc = this.LLJJIJI;
        if (c1749280vcc != null) {
            C339190DRl.LIZLLL(c1749280vcc);
        }
        C1749280vcc c1749280vcc2 = this.LLJJIJI;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void t0() {
        C1749280vcc c1749280vcc = this.LLJJIJI;
        if (c1749280vcc != null) {
            C339190DRl.LIZIZ(c1749280vcc);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void LLLLLZIL(Throwable th) {
        C1749280vcc c1749280vcc = this.LLJJIJI;
        if (c1749280vcc != null) {
            C339190DRl.LIZLLL(c1749280vcc);
        }
        C1749280vcc c1749280vcc2 = this.LLJJIJI;
        if (c1749280vcc2 != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new AwS550S0100000_6(this, 521));
            c1749280vcc2.setStatus(c1722300uv6);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailStatusAssem for r13v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r14) {
        /*
            r13 = this;
            r8 = r13
            super.onViewCreated(r14)
            r0 = 2131392151(0x7f0a7697, float:1.8404922E38)
            android.view.View r0 = r14.findViewById(r0)
            X.0vcc r0 = (X.C1749280vcc) r0
            r8.LLJJIJI = r0
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r8)
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L45
            r11 = 0
            X.0Q7z r9 = X.C1558360qeg.LJFF(r0, r11)
            kotlin.jvm.internal.AwS75S1300000_6 r7 = new kotlin.jvm.internal.AwS75S1300000_6
            r12 = 2
            r10 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Thread r1 = X.C786410Ut5.u3()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L94
            r7.invoke()
        L38:
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            X.01wD r5 = X.C1558520qew.LIZ(r9, r0, r11)
            if (r5 != 0) goto L4f
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            X.C1558520qew.LJII(r9, r8, r0, r11, r11)
        L45:
            int r0 = X.C295220Bhg.LIZ()
            if (r0 < r4) goto L4e
            r8.i1()
        L4e:
            return
        L4f:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r5)     // Catch: java.lang.IllegalArgumentException -> L67
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L67
            if (r0 == 0) goto L5f
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L67
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L67
            r0.add(r8)     // Catch: java.lang.IllegalArgumentException -> L67
            goto L45
        L5f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L67
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L67
            throw r1     // Catch: java.lang.IllegalArgumentException -> L67
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Class[] r2 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            r2[r6] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r8)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r5)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto L9f
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            X.C1558520qew.LJII(r9, r1, r0, r11, r11)
            goto L45
        L94:
            Y.ARunnableS106S0100000_6 r1 = new Y.ARunnableS106S0100000_6
            r0 = 92
            r1.<init>(r7, r0)
            X.C1189060h32.LJIJ(r1)
            goto L38
        L9f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.RefreshActionCallBackAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailStatusAssem.onViewCreated(android.view.View):void");
    }
}
