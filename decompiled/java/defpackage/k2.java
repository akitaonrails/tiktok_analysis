package defpackage;

import X.C09AX;
import X.C09DV;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "IntervalThrottler$launchBlock$1", f = "IntervalThrottler.kt", l = {49, 79, 63, 89, 79, 63, 89}, m = "invokeSuspend")
public final class k2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public m2 LLILZ;
    public int LLILZIL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZLL;
    public final /* synthetic */ m2 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(m2 m2Var, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = function1;
        this.LLIZ = m2Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new k2(this.LLIZ, interfaceC1364105Vn, this.LLILZLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116 A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
