package ttpobfuscated;

import X.C098200Yq;
import X.C09AY;
import X.C1507240pKE;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public final class o8 extends x0 implements cb {
    public final p8 n;
    public List<String> o;
    public Map<String, ? extends Object> p;

    public final class a extends C09AY implements Function0<tc> {
        public final /* synthetic */ cc b;
        public final /* synthetic */ xc c;

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tc invoke() {
            Object c098200Yq;
            o8 o8Var = o8.this;
            cc ccVar = this.b;
            xc xcVar = this.c;
            try {
                Map<String, ? extends Object> mapB = ec.b(ccVar.b);
                List<String> listA = o8.a(o8Var, xcVar);
                if (listA != null) {
                    s7 s7VarA = o8Var.n.a(listA, mapB);
                    o8Var.o = listA;
                    o8Var.p = mapB;
                    if (s7VarA.b == null) {
                        c098200Yq = tc.Undefined;
                    } else {
                        c098200Yq = o8Var.m.a(s7VarA.b.getSecond(), xcVar.a(o8Var.o(), o8Var.i, o8Var.m.b()));
                    }
                } else {
                    c098200Yq = tc.Undefined;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = tc.Undefined;
            }
            return (tc) c098200Yq;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cc ccVar, xc xcVar) {
            super(0);
            this.b = ccVar;
            this.c = xcVar;
        }
    }

    @Override // ttpobfuscated.cb
    public List<String> a() {
        return this.o;
    }

    @Override // ttpobfuscated.cb
    public Map<String, Object> b() {
        return this.p;
    }

    @Override // ttpobfuscated.cb
    public void a(List<String> list) {
        this.o = list;
    }

    @Override // ttpobfuscated.cb
    public void a(Map<String, ? extends Object> map) {
        this.p = map;
    }

    public o8(List<C1507240pKE> list, p8 p8Var) {
        super(ha.KeyCheck, list);
        this.n = p8Var;
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        return (tc) mb.a("KeyCheckInstruction.run", false, null, new a(ccVar, xcVar), 6, null);
    }

    public static final List a(o8 o8Var, xc xcVar) {
        o8Var.getClass();
        return o8Var.a(xcVar, o8Var.n());
    }
}
