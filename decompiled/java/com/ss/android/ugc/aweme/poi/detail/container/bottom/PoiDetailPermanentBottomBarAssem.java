package com.ss.android.ugc.aweme.poi.detail.container.bottom;

import X.C01GW;
import X.C1185610gxT;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$PoiDetailDataUpdateAbility;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.ui.RealPoiDetailBottomBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class PoiDetailPermanentBottomBarAssem extends PoiDetailBaseAssem<Object> implements ContainerEventDispatcher$PoiDetailDataUpdateAbility, ContainerEventDispatcher$IPoiDetailVisibilityAbility {
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(115));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2k;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean op(PoiListApi.PoiDetailResponse poiDetailResponse) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiDetailPermanentBottomBarAssem for r10v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r11) {
        /*
            r10 = this;
            r5 = r10
            super.onViewCreated(r11)
            android.view.View r1 = r5.LJJIJL()
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.T4(r1, r0)
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r5)
            if (r0 == 0) goto L41
            r8 = 0
            X.0Q7z r6 = X.C1558360qeg.LJFF(r0, r8)
            kotlin.jvm.internal.AwS75S1300000_6 r4 = new kotlin.jvm.internal.AwS75S1300000_6
            r9 = 0
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Thread r1 = X.C786410Ut5.u3()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9c
            r4.invoke()
        L34:
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            X.01wD r4 = X.C1558520qew.LIZ(r6, r0, r8)
            if (r4 != 0) goto L55
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            X.C1558520qew.LJII(r6, r5, r0, r8, r8)
        L41:
            X.01GW r0 = r5.LLJJL
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            kotlin.jvm.internal.AwS581S0100000_2 r1 = new kotlin.jvm.internal.AwS581S0100000_2
            r0 = 56
            r1.<init>(r5, r0)
            X.C723850SaN.LIZLLL(r5, r1)
            return
        L55:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r4)     // Catch: java.lang.IllegalArgumentException -> L6d
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L6d
            if (r0 == 0) goto L65
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L6d
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L6d
            r0.add(r5)     // Catch: java.lang.IllegalArgumentException -> L6d
            goto L41
        L65:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L6d
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L6d
            throw r1     // Catch: java.lang.IllegalArgumentException -> L6d
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            r2[r1] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r5)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r4)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto La7
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$IPoiDetailVisibilityAbility.class
            X.C1558520qew.LJII(r6, r1, r0, r8, r8)
            goto L41
        L9c:
            Y.ARunnableS106S0100000_6 r1 = new Y.ARunnableS106S0100000_6
            r0 = 89
            r1.<init>(r4, r0)
            X.C1189060h32.LJIJ(r1)
            goto L34
        La7:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher.IPoiDetailVisibilityAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiDetailPermanentBottomBarAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final void tp(PoiListApi.PoiDetailResponse poiDetailResponse) {
        View viewFindViewById;
        if (so() && (viewFindViewById = LJJIJL().findViewById(R.id.fz3)) != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        ((RealPoiDetailBottomBarAssem) this.LLJJL.getValue()).LIZIZ(this, (C1185610gxT) mp(), poiDetailResponse);
    }
}
