package defpackage;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C155000ia;
import X.C1DEU;
import X.InterfaceC1337805Lk;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "MinisDeduplicateTaskRunner$async$deferred$1", f = "MinisResourceTaskDispatcher.kt", l = {164, 127}, m = "invokeSuspend")
public final class a3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public C1DEU LL;
    public Function2 LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ c3<Object, Object> LLILZIL;
    public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a3(c3<Object, Object> c3Var, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<Object>, ? extends Object> function2, InterfaceC1364105Vn<? super a3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c3Var;
        this.LLILZLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        a3 a3Var = new a3(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        a3Var.LLILZ = obj;
        return a3Var;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Function2 function2;
        C1DEU c1deu;
        InterfaceC1337805Lk interfaceC1337805Lk;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        InterfaceC1337805Lk interfaceC1337805Lk2 = (InterfaceC1337805Lk) this.LLILZ;
                        try {
                            C155000ia.LIZIZ(obj);
                            interfaceC1337805Lk = interfaceC1337805Lk2;
                            interfaceC1337805Lk.release();
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                            interfaceC1337805Lk2.release();
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function2 = this.LLILLJJLI;
                C1DEU c1deu2 = this.LL;
                obj2 = this.LLILZ;
                C155000ia.LIZIZ(obj);
                c1deu = c1deu2;
            } else {
                C155000ia.LIZIZ(obj);
                obj2 = this.LLILZ;
                C1DEU c1deu3 = this.LLILZIL.LLILZIL;
                function2 = this.LLILZLL;
                this.LLILZ = obj2;
                this.LL = c1deu3;
                this.LLILLJJLI = function2;
                this.LLILLL = 1;
                Object objLIZ = c1deu3.LIZ(this);
                c1deu = c1deu3;
                if (objLIZ == objLJFF) {
                    return objLJFF;
                }
            }
            this.LLILZ = c1deu;
            this.LL = null;
            this.LLILLJJLI = null;
            this.LLILLL = 2;
            obj = function2.invoke(obj2, this);
            interfaceC1337805Lk = c1deu;
            if (obj == objLJFF) {
                return objLJFF;
            }
            interfaceC1337805Lk.release();
            return obj;
        } catch (Throwable th2) {
            while (true) {
                th = th2;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
