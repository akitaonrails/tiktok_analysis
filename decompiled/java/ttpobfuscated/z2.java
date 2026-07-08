package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C15438062q;
import X.C189200o6;
import X.C2286608xc;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ttp.orbu.sdk.repository.model.DBEventSent;
import ttpobfuscated.q3;
import ttpobfuscated.sd;

/* JADX INFO: loaded from: classes24.dex */
public final class z2 implements sd {
    public final u2 a;
    public final String b = C13LE.LIZ(z2.class).LJI();

    public z2(u2 u2Var) {
        this.a = u2Var;
    }

    @Override // ttpobfuscated.sd
    public Object a(int i, InterfaceC1364105Vn<? super List<qd>> interfaceC1364105Vn) throws sd.b.C0071b {
        Object obj;
        try {
            List<DBEventSent> listA = this.a.a(i);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listA, 10));
            Iterator<DBEventSent> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList.add(w2.a(it2.next()));
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl == null) {
            return obj;
        }
        q3.a aVar = q3.a;
        String str = this.b;
        aVar.getClass();
        q3.a.c.b("SentEvent getAll error", str, thM5exceptionOrNullimpl);
        throw new sd.b.C0071b();
    }

    @Override // ttpobfuscated.sd
    public Object b(qd qdVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws sd.b.a {
        Object c098200Yq;
        try {
            c098200Yq = C2286608xc.LJFF(this.a.b(w2.a(qdVar)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return Unit.LIZ;
        }
        q3.a aVar = q3.a;
        String str = this.b;
        aVar.getClass();
        q3.a.c.b("SentEvent add error", str, thM5exceptionOrNullimpl);
        throw new sd.b.a();
    }

    @Override // ttpobfuscated.sd
    public Object a(qd qdVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws sd.b.C0071b {
        Object c098200Yq;
        try {
            c098200Yq = C2286608xc.LJ(this.a.a(w2.a(qdVar).a));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return Unit.LIZ;
        }
        q3.a aVar = q3.a;
        String str = this.b;
        aVar.getClass();
        q3.a.c.b("SentEvent delete error", str, thM5exceptionOrNullimpl);
        throw new sd.b.C0071b();
    }
}
