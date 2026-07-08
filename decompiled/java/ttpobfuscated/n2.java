package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttpobfuscated.q3;
import ttpobfuscated.u1;

/* JADX INFO: loaded from: classes24.dex */
public final class n2 implements u1 {
    public final n1 a;

    @Override // ttpobfuscated.u1
    public void a() throws u1.a.d {
        Object c098200Yq;
        try {
            this.a.a();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return;
        }
        q3.a aVar = q3.a;
        String str = o2.a;
        aVar.getClass();
        q3.a.c.b("Updating general config public version", str, thM5exceptionOrNullimpl);
        throw new u1.a.d(thM5exceptionOrNullimpl, ConfigType.General.INSTANCE);
    }

    @Override // ttpobfuscated.u1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GeneralConfig get() throws u1.a.C0077a {
        Object c098200Yq;
        try {
            c098200Yq = (GeneralConfig) this.a.get();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return (GeneralConfig) c098200Yq;
        }
        q3.a aVar = q3.a;
        String str = o2.a;
        aVar.getClass();
        q3.a.c.b("Getting current General config error", str, thM5exceptionOrNullimpl);
        throw new u1.a.C0077a(thM5exceptionOrNullimpl, ConfigType.General.INSTANCE);
    }

    @Override // ttpobfuscated.u1
    public String getVersion() throws u1.a.b {
        Object c098200Yq;
        try {
            c098200Yq = this.a.getVersion();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return (String) c098200Yq;
        }
        q3.a aVar = q3.a;
        String str = o2.a;
        aVar.getClass();
        q3.a.c.b("Error in getting current General config public version", str, thM5exceptionOrNullimpl);
        throw new u1.a.b(thM5exceptionOrNullimpl, ConfigType.General.INSTANCE);
    }

    public n2(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // ttpobfuscated.u1
    public void a(Config config) throws u1.a.c {
        Object c098200Yq;
        try {
            this.a.a((GeneralConfig) config);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return;
        }
        q3.a aVar = q3.a;
        String str = o2.a;
        aVar.getClass();
        q3.a.c.b("Setting current General config error", str, thM5exceptionOrNullimpl);
        throw new u1.a.c(thM5exceptionOrNullimpl, ConfigType.General.INSTANCE);
    }
}
