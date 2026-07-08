package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C189200o6;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import ttp.orbu.sdk.app.domain.entity.cleanup.CleanUpSystemErrorType;
import ttpobfuscated.q0;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class r0 implements q0 {
    public final k3 a;
    public final SharedPreferences b;
    public final SharedPreferences c;
    public final n1 d;
    public final n1 e;
    public final String f = C13LE.LIZ(r0.class).LJI();

    @Override // ttpobfuscated.q0
    public void a() throws Throwable {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        Object c098200Yq7;
        Object c098200Yq8;
        Object c098200Yq9;
        Object c098200Yq10;
        try {
            try {
                d2.a.b();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.CancelActiveCoroutines, thM5exceptionOrNullimpl);
            }
            try {
                this.a.a();
                c098200Yq3 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq3 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq3);
            if (thM5exceptionOrNullimpl2 != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.DeleteDatabase, thM5exceptionOrNullimpl2);
            }
            try {
                c098200Yq4 = Boolean.valueOf(this.b.edit().clear().commit());
                C189200o6.m2constructorimpl(c098200Yq4);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq4 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq4);
            }
            Throwable thM5exceptionOrNullimpl3 = C189200o6.m5exceptionOrNullimpl(c098200Yq4);
            if (thM5exceptionOrNullimpl3 != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.ClearConfigPreferences, thM5exceptionOrNullimpl3);
            }
            try {
                c098200Yq5 = Boolean.valueOf(this.c.edit().clear().commit());
                C189200o6.m2constructorimpl(c098200Yq5);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                c098200Yq5 = new C098200Yq(th4);
                C189200o6.m2constructorimpl(c098200Yq5);
            }
            Throwable thM5exceptionOrNullimpl4 = C189200o6.m5exceptionOrNullimpl(c098200Yq5);
            if (thM5exceptionOrNullimpl4 != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.ClearCrashLogPreferences, thM5exceptionOrNullimpl4);
            }
            try {
                this.d.b();
                c098200Yq6 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq6);
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                c098200Yq6 = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq6);
            }
            Throwable thM5exceptionOrNullimpl5 = C189200o6.m5exceptionOrNullimpl(c098200Yq6);
            if (thM5exceptionOrNullimpl5 != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.ResetGeneralConfig, thM5exceptionOrNullimpl5);
            }
            try {
                this.e.b();
                c098200Yq7 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq7);
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                c098200Yq7 = new C098200Yq(th6);
                C189200o6.m2constructorimpl(c098200Yq7);
            }
            Throwable thM5exceptionOrNullimpl6 = C189200o6.m5exceptionOrNullimpl(c098200Yq7);
            if (thM5exceptionOrNullimpl6 != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.ResetOrbucodeConfig, thM5exceptionOrNullimpl6);
            }
            try {
                v3.s.getClass();
                v3.u.g = null;
                c098200Yq8 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq8);
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
                c098200Yq8 = new C098200Yq(th7);
                C189200o6.m2constructorimpl(c098200Yq8);
            }
            Throwable thM5exceptionOrNullimpl7 = C189200o6.m5exceptionOrNullimpl(c098200Yq8);
            if (thM5exceptionOrNullimpl7 != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.ClearRuntime, thM5exceptionOrNullimpl7);
            }
            try {
                v3.s.getClass();
                v3.u.e();
                c098200Yq9 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq9);
            } catch (Throwable th8) {
                TryCatchGuardChecker.doCheck(th8);
                c098200Yq9 = new C098200Yq(th8);
                C189200o6.m2constructorimpl(c098200Yq9);
            }
            Throwable thM5exceptionOrNullimpl8 = C189200o6.m5exceptionOrNullimpl(c098200Yq9);
            if (thM5exceptionOrNullimpl8 != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.CleanOldComponentInstance, thM5exceptionOrNullimpl8);
            }
            try {
                ua.a.b().a();
                c098200Yq10 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq10);
            } catch (Throwable th9) {
                TryCatchGuardChecker.doCheck(th9);
                c098200Yq10 = new C098200Yq(th9);
                C189200o6.m2constructorimpl(c098200Yq10);
            }
            Throwable thM5exceptionOrNullimpl9 = C189200o6.m5exceptionOrNullimpl(c098200Yq10);
            if (thM5exceptionOrNullimpl9 != null) {
                throw new q0.a.C0067a(CleanUpSystemErrorType.CleanNewComponentInstance, thM5exceptionOrNullimpl9);
            }
            c098200Yq2 = C189200o6.m1boximpl(c098200Yq10);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th10) {
            TryCatchGuardChecker.doCheck(th10);
            c098200Yq2 = new C098200Yq(th10);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl10 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl10 != null) {
            if (thM5exceptionOrNullimpl10 instanceof q0.a.C0067a) {
                q3.a aVar = q3.a;
                String str = "Error while trying to clean up the system with code: " + ((q0.a) thM5exceptionOrNullimpl10).a;
                String str2 = this.f;
                aVar.getClass();
                q3.a.c.b(str, str2, thM5exceptionOrNullimpl10);
                throw thM5exceptionOrNullimpl10;
            }
            q3.a aVar2 = q3.a;
            StringBuilder sb = new StringBuilder("Error while trying to clean up the system with code: ");
            CleanUpSystemErrorType cleanUpSystemErrorType = CleanUpSystemErrorType.Unknown;
            sb.append(cleanUpSystemErrorType);
            String string = sb.toString();
            String str3 = this.f;
            aVar2.getClass();
            q3.a.c.b(string, str3, thM5exceptionOrNullimpl10);
            throw new q0.a.C0067a(cleanUpSystemErrorType, thM5exceptionOrNullimpl10);
        }
    }

    public r0(k3 k3Var, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, n1 n1Var, n1 n1Var2) {
        this.a = k3Var;
        this.b = sharedPreferences;
        this.c = sharedPreferences2;
        this.d = n1Var;
        this.e = n1Var2;
    }
}
