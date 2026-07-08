package ttpobfuscated;

import X.C098200Yq;
import X.C15438062q;
import X.C189200o6;
import X.C1954807lC;
import X.C2286608xc;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.configuration.model.EventSetting;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.repository.model.DBEvent;
import ttp.orbu.sdk.repository.model.DBEventSent;
import ttpobfuscated.j4;
import ttpobfuscated.q3;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class s2 implements j4 {
    public final x2 a;
    public final u2 b;
    public final n1 c;
    public final m4 d;
    public final SecureRandom e;

    @Override // ttpobfuscated.j4
    public Object a(InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) throws j4.b.d {
        Object c098200Yq;
        try {
            c098200Yq = this.a.b();
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
        String str = t2.a;
        aVar.getClass();
        q3.a.c.b("Event getAllTypes error", str, thM5exceptionOrNullimpl);
        throw new j4.b.d(thM5exceptionOrNullimpl);
    }

    public final fg<? extends b2> a(DBEvent dBEvent) {
        fg<? extends b2> fgVarA = this.d.a(dBEvent);
        if (fgVarA != null) {
            return fgVarA;
        }
        throw new IllegalStateException("TtpEvent factory not found");
    }

    @Override // ttpobfuscated.j4
    public Object a(fg<? extends b2> fgVar, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) throws j4.b.f {
        Object c098200Yq;
        EventSetting next;
        zb zbVarC;
        boolean z;
        try {
            Iterator<EventSetting> it2 = ((GeneralConfig) this.c.get()).getEvents().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.eventType, fgVar.d())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EventSetting eventSetting = next;
            if (eventSetting == null || (zbVarC = eventSetting.reportingFrequency) == null) {
                zbVarC = fgVar.c();
            }
            if (Intrinsics.LJFF(zbVarC, zb.d.h)) {
                if (this.b.c(fgVar.d()) == null) {
                    z = true;
                }
                z = false;
            } else if (zbVarC instanceof zb.e) {
                if (this.e.nextInt(((zb.e) zbVarC).h) == 0) {
                    z = true;
                }
                z = false;
            } else if (zbVarC instanceof zb.f) {
                DBEventSent dBEventSentC = this.b.c(fgVar.d());
                if (dBEventSentC != null && dBEventSentC.b + ((zb.f) zbVarC).h >= fgVar.h().getTime()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                if (!(zbVarC instanceof zb.a)) {
                    if (!(zbVarC instanceof zb.c)) {
                        throw new C1954807lC();
                    }
                    z = false;
                }
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
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
        String str = t2.a;
        aVar.getClass();
        q3.a.c.b("Error while verifying if the event is valid", str, thM5exceptionOrNullimpl);
        throw new j4.b.f(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.j4
    public Object b(fg<? extends b2> fgVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws j4.b.a {
        Object c098200Yq;
        try {
            if (!ua.a.b().f().m().a("standalone")) {
                this.a.b(r2.a(fgVar));
            }
            c098200Yq = Unit.LIZ;
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
        String str = t2.a;
        aVar.getClass();
        q3.a.c.b("Event add error", str, thM5exceptionOrNullimpl);
        throw new j4.b.a(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.j4
    public List<fg<? extends b2>> a(int i, List<String> list) throws j4.b.e {
        Object obj;
        try {
            List<DBEvent> listA = this.a.a(list, i);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listA, 10));
            Iterator<DBEvent> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(it2.next()));
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
            return (List) obj;
        }
        q3.a aVar = q3.a;
        String str = t2.a;
        aVar.getClass();
        q3.a.c.b("Event getAll error", str, thM5exceptionOrNullimpl);
        throw new j4.b.e(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.j4
    public Object a(UUID uuid, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) throws j4.b.c {
        Object c098200Yq;
        boolean z;
        try {
            if (this.a.a(uuid) > 0) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
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
        String str = t2.a;
        aVar.getClass();
        q3.a.c.b("Event delete error", str, thM5exceptionOrNullimpl);
        throw new j4.b.c(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.j4
    public Object a(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) throws j4.b.C0060b {
        Object c098200Yq;
        try {
            c098200Yq = C2286608xc.LJ(this.a.a(str));
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
        String str2 = t2.a;
        aVar.getClass();
        q3.a.c.b("Event countByType error", str2, thM5exceptionOrNullimpl);
        throw new j4.b.C0060b(thM5exceptionOrNullimpl);
    }

    @Override // ttpobfuscated.j4
    public Object a(String str, int i, InterfaceC1364105Vn<? super List<? extends fg<? extends b2>>> interfaceC1364105Vn) throws j4.b.e {
        Object obj;
        try {
            List<DBEvent> listA = this.a.a(str, i);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listA, 10));
            Iterator<DBEvent> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(it2.next()));
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
        String str2 = t2.a;
        aVar.getClass();
        q3.a.c.b("Event getByType error", str2, thM5exceptionOrNullimpl);
        throw new j4.b.e(thM5exceptionOrNullimpl);
    }

    public s2(x2 x2Var, u2 u2Var, n1 n1Var, m4 m4Var, SecureRandom secureRandom) {
        this.a = x2Var;
        this.b = u2Var;
        this.c = n1Var;
        this.d = m4Var;
        this.e = secureRandom;
    }
}
