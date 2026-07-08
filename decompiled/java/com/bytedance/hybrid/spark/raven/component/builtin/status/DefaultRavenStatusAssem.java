package com.bytedance.hybrid.spark.raven.component.builtin.status;

import X.C1161220gK8;
import X.C1161800gL4;
import X.C786410Ut5;
import X.InterfaceC1051240dSk;
import X.InterfaceC1161620gKm;
import X.InterfaceC1163110gNB;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DefaultRavenStatusAssem extends BaseRavenComponentDynamicAssem<C1161220gK8> implements ContainerEventDispatcher$RefreshActionCallBackAbility {
    public View LLJJI;
    public View LLJJIII;
    public FrameLayout LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public InterfaceC1163110gNB LLJJJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ekc;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJJJIL() {
        /*
            r4 = this;
            android.widget.FrameLayout r3 = r4.LLJJIJI
            if (r3 != 0) goto L5
            return
        L5:
            X.0gKm r0 = X.C1161800gL4.LIZ(r4)
            r2 = 0
            if (r0 == 0) goto L10
            androidx.fragment.app.Fragment r2 = r0.S8()
        L10:
            boolean r0 = r2 instanceof com.bytedance.hybrid.spark.raven.page.RavenFragment
            if (r0 == 0) goto L35
            com.bytedance.hybrid.spark.raven.page.RavenFragment r2 = (com.bytedance.hybrid.spark.raven.page.RavenFragment) r2
            if (r2 == 0) goto L35
            r3.getContext()
            X.0gJ3 r0 = r2.LLLI
            int[] r1 = X.C1160570gJ5.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L3a
            r0 = 2
            if (r1 != r0) goto L61
            boolean r0 = r2.LLLII
            if (r0 == 0) goto L35
            android.view.View r2 = r2.VR()
        L33:
            if (r2 != 0) goto L3f
        L35:
            android.view.View r2 = r4.LLJJI
            if (r2 != 0) goto L3f
            return
        L3a:
            android.view.View r2 = r2.uS()
            goto L33
        L3f:
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L4e
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L4e
            X.C786410Ut5.LJJJLZIJ(r2, r1)
        L4e:
            X.C786410Ut5.LJJJJIZL(r3)
            r4.LLJJIII = r2
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r1.<init>(r0, r0)
            r3.addView(r2, r1)
            r0 = 0
            X.C786410Ut5.LJLLLLLL(r0, r2)
            return
        L61:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.raven.component.builtin.status.DefaultRavenStatusAssem.LLJJJJJIL():void");
    }

    @Override // com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void t0() {
        View view = this.LLJJIII;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1163110gNB interfaceC1163110gNB = this.LLJJJ;
        if (interfaceC1163110gNB != null) {
            interfaceC1163110gNB.release();
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void i1() {
        LLJJJJJIL();
    }

    @Override // com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void LLLLLZIL(Throwable th) {
        FrameLayout frameLayout;
        View viewLJJJLIIL;
        if (this.LLJJIJIIJIL == null) {
            InterfaceC1163110gNB interfaceC1163110gNB = this.LLJJJ;
            if (interfaceC1163110gNB != null) {
                viewLJJJLIIL = interfaceC1163110gNB.LJJJLIIL(new InterfaceC1051240dSk() { // from class: X.0gNC
                    @Override // X.InterfaceC1051240dSk
                    public final void refresh() {
                        this.LL.X0("retry");
                    }
                });
            } else {
                viewLJJJLIIL = null;
            }
            this.LLJJIJIIJIL = viewLJJJLIIL;
        }
        FrameLayout frameLayout2 = this.LLJJIJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
        View view = this.LLJJIJIIJIL;
        if (view != null && (frameLayout = this.LLJJIJI) != null) {
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void Mu1(Float f) {
        if (f != null) {
            float fFloatValue = f.floatValue();
            InterfaceC1163110gNB interfaceC1163110gNB = this.LLJJJ;
            if (interfaceC1163110gNB != null) {
                interfaceC1163110gNB.LJJJJIZL(fFloatValue);
            }
        }
    }

    public final void X0(String str) {
        InterfaceC1161620gKm interfaceC1161620gKmLIZ = C1161800gL4.LIZ(this);
        if (interfaceC1161620gKmLIZ != null) {
            interfaceC1161620gKmLIZ.refresh();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.bytedance.hybrid.spark.raven.component.builtin.status.DefaultRavenStatusAssem for r10v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r11) {
        /*
            r10 = this;
            r5 = r10
            super.onViewCreated(r11)
            boolean r0 = r11 instanceof android.widget.FrameLayout
            r8 = 0
            if (r0 == 0) goto L73
            r0 = r11
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
        Lc:
            r5.LLJJIJI = r0
            X.0qEO r0 = X.C1546010qKl.LIZ
            if (r0 == 0) goto L71
            X.0gNB r1 = r0.LJI()
        L16:
            r5.LLJJJ = r1
            if (r1 == 0) goto L21
            android.content.Context r0 = r11.getContext()
            r1.LJIIJ(r0)
        L21:
            X.0gNB r0 = r5.LLJJJ
            if (r0 == 0) goto L6f
            android.view.View r0 = r0.LJJL()
        L29:
            r5.LLJJI = r0
            r5.LLJJJJJIL()
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r5)
            if (r0 == 0) goto L68
            X.0Q7z r6 = X.C1558360qeg.LJFF(r0, r8)
            kotlin.jvm.internal.AwS83S1300000_18 r4 = new kotlin.jvm.internal.AwS83S1300000_18
            r9 = 0
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            Y.ARunnableS112S0100000_12 r2 = new Y.ARunnableS112S0100000_12
            r0 = 429(0x1ad, float:6.01E-43)
            r2.<init>(r4, r0)
            java.lang.Thread r1 = X.C786410Ut5.u3()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L69
            r2.run()
        L5b:
            java.lang.Class<com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            X.01wD r4 = X.C1558520qew.LIZ(r6, r0, r8)
            if (r4 != 0) goto L75
            java.lang.Class<com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            X.C1558520qew.LJII(r6, r5, r0, r8, r8)
        L68:
            return
        L69:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = X.C1163100gNA.LIZ
            X.C786410Ut5.LJJZZIII(r0, r2)
            goto L5b
        L6f:
            r0 = r8
            goto L29
        L71:
            r1 = r8
            goto L16
        L73:
            r0 = r8
            goto Lc
        L75:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r4)     // Catch: java.lang.IllegalArgumentException -> L8d
            boolean r0 = r1 instanceof X.C2255008sW     // Catch: java.lang.IllegalArgumentException -> L8d
            if (r0 == 0) goto L85
            X.08sW r1 = (X.C2255008sW) r1     // Catch: java.lang.IllegalArgumentException -> L8d
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L8d
            r0.add(r5)     // Catch: java.lang.IllegalArgumentException -> L8d
            return
        L85:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L8d
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L8d
            throw r1     // Catch: java.lang.IllegalArgumentException -> L8d
        L8d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            r2[r1] = r0
            X.08sW r1 = new X.08sW
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r5)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r4)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto Lbc
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility> r0 = com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility.class
            X.C1558520qew.LJII(r6, r1, r0, r8, r8)
            return
        Lbc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher.RefreshActionCallBackAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.raven.component.builtin.status.DefaultRavenStatusAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.bytedance.hybrid.spark.raven.component.builtin.status.ContainerEventDispatcher$RefreshActionCallBackAbility
    public final void TI2(Integer num, String str, String str2) {
        FrameLayout frameLayout;
        View viewLJJLIL;
        if (this.LLJJIJIL == null) {
            InterfaceC1163110gNB interfaceC1163110gNB = this.LLJJJ;
            if (interfaceC1163110gNB != null) {
                viewLJJLIL = interfaceC1163110gNB.LJJLIL(num, str, str2);
            } else {
                viewLJJLIL = null;
            }
            this.LLJJIJIL = viewLJJLIL;
        }
        FrameLayout frameLayout2 = this.LLJJIJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
        View view = this.LLJJIJIL;
        if (view != null && (frameLayout = this.LLJJIJI) != null) {
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
