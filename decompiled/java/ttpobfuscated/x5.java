package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C189200o6;
import X.C2197108jB;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttpobfuscated.q3;
import ttpobfuscated.s4;

/* JADX INFO: loaded from: classes24.dex */
public final class x5 implements s4 {
    public final n1 a;
    public final String b = C13LE.LIZ(x5.class).LJI();

    public x5(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // ttpobfuscated.s4
    public boolean a(String str) throws s4.a.C0070a {
        try {
            return ((GeneralConfig) this.a.get()).isFeatureEnabled(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                throw new C2197108jB();
            }
            q3.a aVar = q3.a;
            String str2 = this.b;
            aVar.getClass();
            q3.a.c.b("Error while finding if a feature is enabled or not", str2, thM5exceptionOrNullimpl);
            throw new s4.a.C0070a();
        }
    }
}
