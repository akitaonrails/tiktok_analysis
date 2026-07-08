package ttpobfuscated;

import X.C098200Yq;
import X.C15438062q;
import X.C189200o6;
import X.C2286608xc;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ttp.orbu.sdk.repository.model.DBUser;
import ttpobfuscated.q3;
import ttpobfuscated.tg;

/* JADX INFO: loaded from: classes24.dex */
public final class a3 implements tg {
    public final c3 a;

    public final c3 a() {
        return this.a;
    }

    public a3(c3 c3Var) {
        this.a = c3Var;
    }

    @Override // ttpobfuscated.tg
    public Object a(InterfaceC1364105Vn<? super jg> interfaceC1364105Vn) throws tg.a.d {
        Object c098200Yq;
        try {
            DBUser dBUserC = this.a.c();
            if (dBUserC != null) {
                c098200Yq = dBUserC.q();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return c098200Yq;
        }
        q3.a aVar = q3.a;
        String str = b3.a;
        aVar.getClass();
        q3.a.c.b("User getCurrent error", str, thM5exceptionOrNullimpl);
        throw new tg.a.d(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.tg
    public Object b(InterfaceC1364105Vn<? super List<jg>> interfaceC1364105Vn) throws tg.a.c {
        Object obj;
        try {
            List<DBUser> listA = this.a.a();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listA, 10));
            Iterator<DBUser> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().q());
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
        String str = b3.a;
        aVar.getClass();
        q3.a.c.b("User getAll error", str, thM5exceptionOrNullimpl);
        throw new tg.a.c(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.tg
    public Object a(jg jgVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws tg.a.e {
        Object c098200Yq;
        try {
            c098200Yq = C2286608xc.LJ(this.a.b(DBUser.i.a(jgVar)));
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
        String str = b3.a;
        aVar.getClass();
        q3.a.c.b("User update error", str, thM5exceptionOrNullimpl);
        throw new tg.a.e(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.tg
    public Object b(jg jgVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws tg.a.C0076a {
        Object c098200Yq;
        try {
            c098200Yq = C2286608xc.LJFF(this.a.a(DBUser.i.a(jgVar)));
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
        String str = b3.a;
        aVar.getClass();
        q3.a.c.b("User add error", str, thM5exceptionOrNullimpl);
        throw new tg.a.C0076a(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.tg
    public Object a(String str, InterfaceC1364105Vn<? super jg> interfaceC1364105Vn) throws tg.a.b {
        Object c098200Yq;
        try {
            DBUser dBUserB = this.a.b(str);
            if (dBUserB != null) {
                c098200Yq = dBUserB.q();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return c098200Yq;
        }
        q3.a aVar = q3.a;
        String str2 = b3.a;
        aVar.getClass();
        q3.a.c.b("User get Error", str2, thM5exceptionOrNullimpl);
        throw new tg.a.b(thM5exceptionOrNullimpl);
    }
}
