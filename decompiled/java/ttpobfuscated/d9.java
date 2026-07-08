package ttpobfuscated;

import X.AbstractC23140094w;
import X.AnonymousClass0957;
import X.C01GW;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1507240pKE;
import X.C155000ia;
import X.C1C7U;
import X.C23250099c;
import X.C259800zU;
import X.C817503Hh;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttpobfuscated.c9;
import ttpobfuscated.f9;

/* JADX INFO: loaded from: classes24.dex */
public final class d9 extends o7 {
    public final s m;
    public final C01GW<AnonymousClass0957<jg>> n;
    public final jg o;
    public final GeneralConfig p;
    public final OrbuCodeConfig q;
    public final j4 r;

    @C09DV(c = "ttp.orbu.sdk.orbucode.instructions.LogInstruction", f = "LogInstruction.kt", l = {133, 135}, m = "createLog")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("d9@12a4.a$1");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = d9.this.a(null, 0, null, null, null, this);
            C1C7U.LIZIZ("d9@12a4.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.orbucode.instructions.LogInstruction$run$1", f = "LogInstruction.kt", l = {64}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ C259800zU<jg> c;
        public final /* synthetic */ d9 d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C259800zU<jg> c259800zU;
            T t;
            AnonymousClass0957<jg> value;
            C1C7U.LIZ("d9@12a4.a$2");
            Object objLJFF = C099R.LJFF();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    c259800zU = (C259800zU) this.a;
                    C155000ia.LIZIZ(obj);
                    t = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c259800zU = this.c;
                C01GW<AnonymousClass0957<jg>> c01gw = this.d.n;
                if (c01gw != null && (value = c01gw.getValue()) != null) {
                    this.a = c259800zU;
                    this.b = 1;
                    Object objLJLIIIL = value.LJLIIIL(this);
                    t = objLJLIIIL;
                    if (objLJLIIIL == objLJFF) {
                        C1C7U.LIZIZ("d9@12a4.a$2");
                        return objLJFF;
                    }
                } else {
                    t = 0;
                }
            }
            c259800zU.element = t;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("d9@12a4.a$2");
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return new b(this.c, this.d, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new b(this.c, this.d, interfaceC1364105Vn);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C259800zU<jg> c259800zU, d9 d9Var, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.c = c259800zU;
            this.d = d9Var;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.orbucode.instructions.LogInstruction$run$2", f = "LogInstruction.kt", l = {90}, m = "invokeSuspend")
    public final class c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Map<String, String> e;
        public final /* synthetic */ Map<String, String> f;
        public final /* synthetic */ cc g;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("d9@12a4.a$3");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                d9 d9Var = d9.this;
                String str = this.c;
                int i2 = this.d;
                Map<String, String> map = this.e;
                Map<String, String> map2 = this.f;
                String strI = this.g.i();
                this.a = 1;
                if (d9Var.a(str, i2, map, map2, strI, this) == objLJFF) {
                    C1C7U.LIZIZ("d9@12a4.a$3");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("d9@12a4.a$3");
            return unit;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return d9.this.new c(this.c, this.d, this.e, this.f, this.g, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i, Map<String, String> map, Map<String, String> map2, cc ccVar, InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.c = str;
            this.d = i;
            this.e = map;
            this.f = map2;
            this.g = ccVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, ttpobfuscated.jg] */
    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) throws JSONException {
        String string = kotlin.text.a0.LJLIIIL(c(xcVar).toLowerCase(Locale.ROOT)).toString();
        if (!this.m.a(string)) {
            return tc.False;
        }
        int iC = c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 2)).LL);
        int iC2 = c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 3)).LL);
        int iC3 = c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 4)).LL);
        C259800zU c259800zU = new C259800zU();
        ?? r0 = this.o;
        if (r0 != 0) {
            c259800zU.element = r0;
        } else {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new b(c259800zU, this, null), 3);
        }
        c9.a aVar = c9.b;
        List<c9> listA = aVar.a(iC2);
        jg jgVar = (jg) c259800zU.element;
        GeneralConfig generalConfig = this.p;
        OrbuCodeConfig orbuCodeConfig = this.q;
        v3.s.getClass();
        Map<String, String> mapA = aVar.a(listA, jgVar, generalConfig, orbuCodeConfig, v3.u);
        f9.a aVar2 = f9.b;
        d2.a.a(new c(string, iC, mapA, aVar2.a(aVar2.a(iC3), ccVar.b), ccVar, null));
        return tc.True;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, int r20, java.util.Map<java.lang.String, java.lang.String> r21, java.util.Map<java.lang.String, java.lang.String> r22, java.lang.String r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d9.a(java.lang.String, int, java.util.Map, java.util.Map, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d9(List<C1507240pKE> list, s sVar, C01GW<? extends AnonymousClass0957<jg>> c01gw, jg jgVar, GeneralConfig generalConfig, OrbuCodeConfig orbuCodeConfig, j4 j4Var) {
        super(ha.Log, list);
        this.m = sVar;
        this.n = c01gw;
        this.o = jgVar;
        this.p = generalConfig;
        this.q = orbuCodeConfig;
        this.r = j4Var;
    }
}
