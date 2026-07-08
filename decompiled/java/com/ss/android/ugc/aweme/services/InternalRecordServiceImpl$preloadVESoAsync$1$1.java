package com.ss.android.ugc.aweme.services;

import X.AnonymousClass0958;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0LGM;
import X.C155000ia;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$preloadVESoAsync$1$1", f = "InternalRecordServiceImpl.kt", l = {432}, m = "invokeSuspend")
public final class InternalRecordServiceImpl$preloadVESoAsync$1$1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long $delayInMillis;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalRecordServiceImpl$preloadVESoAsync$1$1(long j, InterfaceC1364105Vn<? super InternalRecordServiceImpl$preloadVESoAsync$1$1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$delayInMillis = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new InternalRecordServiceImpl$preloadVESoAsync$1$1(this.$delayInMillis, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalRecordServiceImpl@a70c.preloadVESoAsync$1$1");
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
            long j = this.$delayInMillis;
            if (j > 0) {
                this.label = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("InternalRecordServiceImpl@a70c.preloadVESoAsync$1$1");
                    return objLJFF;
                }
            }
        }
        C0LGM.LIZ().preLoadVESo();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InternalRecordServiceImpl@a70c.preloadVESoAsync$1$1");
        return unit;
    }
}
