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
public final class p6 extends o7 implements cb {
    public final p8 m;
    public List<String> n;
    public Map<String, ? extends Object> o;

    public final class a extends C09AY implements Function0<tc> {
        public final /* synthetic */ xc b;
        public final /* synthetic */ cc c;

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tc invoke() {
            Object c098200Yq;
            p6 p6Var = p6.this;
            xc xcVar = this.b;
            cc ccVar = this.c;
            try {
                List<String> listB = p6Var.b(xcVar);
                if (listB != null) {
                    Map<String, ? extends Object> mapB = ec.b(ccVar.b);
                    s7 s7VarA = p6Var.m.a(listB, mapB);
                    p6Var.n = listB;
                    p6Var.o = mapB;
                    c098200Yq = s7VarA.b == null ? tc.False : tc.True;
                } else {
                    c098200Yq = tc.False;
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
        public a(xc xcVar, cc ccVar) {
            super(0);
            this.b = xcVar;
            this.c = ccVar;
        }
    }

    @Override // ttpobfuscated.cb
    public List<String> a() {
        return this.n;
    }

    @Override // ttpobfuscated.cb
    public Map<String, Object> b() {
        return this.o;
    }

    public final String d(xc xcVar) {
        return " \"" + b(xcVar) + '\"';
    }

    @Override // ttpobfuscated.cb
    public void a(List<String> list) {
        this.n = list;
    }

    @Override // ttpobfuscated.cb
    public void a(Map<String, ? extends Object> map) {
        this.o = map;
    }

    public p6(List<C1507240pKE> list, p8 p8Var) {
        super(ha.HasKey, list);
        this.m = p8Var;
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        return (tc) mb.a("HasKeyInstruction.run", false, null, new a(xcVar, ccVar), 6, null);
    }
}
