package defpackage;

import X.C099R;
import X.C09AE;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.C1DEV;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "IntervalThrottler$submit$1", f = "IntervalThrottler.kt", l = {79}, m = "invokeSuspend")
public final class l2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public m2 LLILLJJLI;
    public Function1 LLILLL;
    public int LLILZ;
    public final /* synthetic */ m2 LLILZIL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = m2Var;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new l2(this.LLILZIL, interfaceC1364105Vn, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        m2 m2Var;
        C1DEV c1dev;
        Function1<InterfaceC1364105Vn<? super Unit>, Object> function1;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                function1 = this.LLILLL;
                m2Var = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            m2Var = this.LLILZIL;
            c1dev = m2Var.LIZJ;
            function1 = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = m2Var;
            this.LLILLL = function1;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                return objLJFF;
            }
        }
        try {
            C09AE c09ae = m2Var.LIZLLL;
            if (c09ae == null || !c09ae.isActive()) {
                z = false;
            }
            if (!z) {
                m2Var.LIZLLL = m2Var.LIZ(function1);
            } else {
                m2Var.LJ = function1;
            }
            c1dev.LIZIZ(null);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
