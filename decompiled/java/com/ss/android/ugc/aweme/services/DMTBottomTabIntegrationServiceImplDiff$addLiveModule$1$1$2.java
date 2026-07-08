package com.ss.android.ugc.aweme.services;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.C1648390szt;
import X.C1C7U;
import X.C1DRG;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.services.DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$2", f = "DMTBottomTabIntegrationServiceImplDiff.kt", l = {}, m = "invokeSuspend")
public final class DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1648390szt $context;
    public final /* synthetic */ C1DRG $diContainer;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$2(C1DRG c1drg, C1648390szt c1648390szt, InterfaceC1364105Vn<? super DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$diContainer = c1drg;
        this.$context = c1648390szt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new DMTBottomTabIntegrationServiceImplDiff$addLiveModule$1$1$2(this.$diContainer, this.$context, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMTBottomTabIntegrationServiceImplDiff@58c8.addLiveModule$1$1$2");
        C099R.LJFF();
        if (this.label == 0) {
            C155000ia.LIZIZ(obj);
            DMTBottomTabIntegrationServiceImplDiff.INSTANCE.requestLiveStreamingPermission(this.$diContainer, this.$context);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DMTBottomTabIntegrationServiceImplDiff@58c8.addLiveModule$1$1$2");
            return unit;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
