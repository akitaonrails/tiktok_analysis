package com.ss.android.ugc.aweme.services;

import X.C05XL;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.services.GSMAService$getGSMACode$1$altNetworkEnabled$1", f = "GSMAService.kt", l = {306}, m = "invokeSuspend")
public final class GSMAService$getGSMACode$1$altNetworkEnabled$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C05XL<Boolean> $enableDeferred;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSMAService$getGSMACode$1$altNetworkEnabled$1(C05XL<Boolean> c05xl, InterfaceC1364105Vn<? super GSMAService$getGSMACode$1$altNetworkEnabled$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$enableDeferred = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new GSMAService$getGSMACode$1$altNetworkEnabled$1(this.$enableDeferred, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GSMAService@d4af.getGSMACode$1$altNetworkEnabled$1");
        Object objLJFF = C099R.LJFF();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C05XL<Boolean> c05xl = this.$enableDeferred;
            this.label = 1;
            obj = c05xl.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GSMAService@d4af.getGSMACode$1$altNetworkEnabled$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GSMAService@d4af.getGSMACode$1$altNetworkEnabled$1");
        return obj;
    }
}
