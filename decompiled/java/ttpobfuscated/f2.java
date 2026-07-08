package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.constants.TTPErrorCode;

/* JADX INFO: loaded from: classes24.dex */
public abstract class f2 {

    public static final class a extends f2 {
        public final String a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return n0.a(new StringBuilder("CannotListAllFiles(path="), this.a, ')');
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.a;
        }

        public a(String str) {
            this.a = str;
        }

        public final a a(String str) {
            return new a(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && Intrinsics.LJFF(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public static a a(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            aVar.getClass();
            return new a(str);
        }
    }

    public static final class b extends f2 {
        public final String a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return n0.a(new StringBuilder("CannotListAllFolder(path="), this.a, ')');
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.a;
        }

        public b(String str) {
            this.a = str;
        }

        public final b a(String str) {
            return new b(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && Intrinsics.LJFF(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public static b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            bVar.getClass();
            return new b(str);
        }
    }

    public static final class c extends f2 {
        public final String a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return n0.a(new StringBuilder("CannotReadFeatureAvailability(feature="), this.a, ')');
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.a;
        }

        public c(String str) {
            this.a = str;
        }

        public final c a(String str) {
            return new c(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && Intrinsics.LJFF(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public static c a(c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            cVar.getClass();
            return new c(str);
        }
    }

    public static final class d extends f2 {
        public final String a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return iHashCode + r0;
        }

        public String toString() {
            return "CantDetectLocationChanges(path=" + this.a + ", isFolder=" + this.b + ')';
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final boolean d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (Intrinsics.LJFF(this.a, dVar.a) && this.b == dVar.b) {
                return true;
            }
            return false;
        }

        public d(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final d a(String str, boolean z) {
            return new d(str, z);
        }

        public static d a(d dVar, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.a;
            }
            if ((i & 2) != 0) {
                z = dVar.b;
            }
            dVar.getClass();
            return new d(str, z);
        }
    }

    public static final class e extends f2 {
        public final i0 a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ChallengeResolveError(error=" + this.a + ')';
        }

        public final i0 a() {
            return this.a;
        }

        public final i0 b() {
            return this.a;
        }

        public e(i0 i0Var) {
            this.a = i0Var;
        }

        public final e a(i0 i0Var) {
            return new e(i0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.a == ((e) obj).a) {
                return true;
            }
            return false;
        }

        public static e a(e eVar, i0 i0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                i0Var = eVar.a;
            }
            eVar.getClass();
            return new e(i0Var);
        }
    }

    public static final class f extends f2 {
        public final ConfigType a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ConfigNotAvailable(configType=" + this.a + ')';
        }

        public final ConfigType a() {
            return this.a;
        }

        public final ConfigType b() {
            return this.a;
        }

        public f(ConfigType configType) {
            this.a = configType;
        }

        public final f a(ConfigType configType) {
            return new f(configType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && Intrinsics.LJFF(this.a, ((f) obj).a)) {
                return true;
            }
            return false;
        }

        public static f a(f fVar, ConfigType configType, int i, Object obj) {
            if ((i & 1) != 0) {
                configType = fVar.a;
            }
            fVar.getClass();
            return new f(configType);
        }
    }

    public static final class g extends f2 {
        public static final g a = new g();
    }

    public static final class h extends f2 {
        public final TTPErrorCode a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "GetChallengeError(ttpErrorCode=" + this.a + ')';
        }

        public final TTPErrorCode a() {
            return this.a;
        }

        public final TTPErrorCode b() {
            return this.a;
        }

        public h(TTPErrorCode tTPErrorCode) {
            this.a = tTPErrorCode;
        }

        public final h a(TTPErrorCode tTPErrorCode) {
            return new h(tTPErrorCode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof h) && this.a == ((h) obj).a) {
                return true;
            }
            return false;
        }

        public static h a(h hVar, TTPErrorCode tTPErrorCode, int i, Object obj) {
            if ((i & 1) != 0) {
                tTPErrorCode = hVar.a;
            }
            hVar.getClass();
            return new h(tTPErrorCode);
        }
    }

    public static final class i extends f2 {
        public final TTPErrorCode a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "ImpossibleToSendCrashLogEvent(ttpErrorCode=" + this.a + ')';
        }

        public final TTPErrorCode a() {
            return this.a;
        }

        public final TTPErrorCode b() {
            return this.a;
        }

        public i(TTPErrorCode tTPErrorCode) {
            this.a = tTPErrorCode;
        }

        public final i a(TTPErrorCode tTPErrorCode) {
            return new i(tTPErrorCode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof i) && this.a == ((i) obj).a) {
                return true;
            }
            return false;
        }

        public static i a(i iVar, TTPErrorCode tTPErrorCode, int i, Object obj) {
            if ((i & 1) != 0) {
                tTPErrorCode = iVar.a;
            }
            iVar.getClass();
            return new i(tTPErrorCode);
        }
    }

    public static final class j extends f2 {
        public static final j a = new j();
    }

    public static final class k extends f2 {
        public static final k a = new k();
    }

    public static final class l extends f2 {
        public static final l a = new l();
    }

    public static final class m extends f2 {
        public final TTPErrorCode a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "InvalidCrashlogService(ttpErrorCode=" + this.a + ')';
        }

        public final TTPErrorCode a() {
            return this.a;
        }

        public final TTPErrorCode b() {
            return this.a;
        }

        public m(TTPErrorCode tTPErrorCode) {
            this.a = tTPErrorCode;
        }

        public final m a(TTPErrorCode tTPErrorCode) {
            return new m(tTPErrorCode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof m) && this.a == ((m) obj).a) {
                return true;
            }
            return false;
        }

        public static m a(m mVar, TTPErrorCode tTPErrorCode, int i, Object obj) {
            if ((i & 1) != 0) {
                tTPErrorCode = mVar.a;
            }
            mVar.getClass();
            return new m(tTPErrorCode);
        }
    }

    public static final class n extends f2 {
        public final String a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return iHashCode + r0;
        }

        public String toString() {
            return "InvalidLocationState(path=" + this.a + ", isFolder=" + this.b + ')';
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final boolean d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (Intrinsics.LJFF(this.a, nVar.a) && this.b == nVar.b) {
                return true;
            }
            return false;
        }

        public n(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final n a(String str, boolean z) {
            return new n(str, z);
        }

        public static n a(n nVar, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nVar.a;
            }
            if ((i & 2) != 0) {
                z = nVar.b;
            }
            nVar.getClass();
            return new n(str, z);
        }
    }

    public static final class o extends f2 {
        public static final o a = new o();
    }

    public static final class p extends f2 {
        public final String a;
        public final boolean b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return iHashCode + r0;
        }

        public String toString() {
            return "UpdateFileChangesError(path=" + this.a + ", isFolder=" + this.b + ')';
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final boolean d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (Intrinsics.LJFF(this.a, pVar.a) && this.b == pVar.b) {
                return true;
            }
            return false;
        }

        public p(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final p a(String str, boolean z) {
            return new p(str, z);
        }

        public static p a(p pVar, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pVar.a;
            }
            if ((i & 2) != 0) {
                z = pVar.b;
            }
            pVar.getClass();
            return new p(str, z);
        }
    }

    public static final class q extends f2 {
        public final TTPErrorCode a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "UpdateFileChangesErrorAfterInvalidCrashlogService(ttpErrorCode=" + this.a + ')';
        }

        public final TTPErrorCode a() {
            return this.a;
        }

        public final TTPErrorCode b() {
            return this.a;
        }

        public q(TTPErrorCode tTPErrorCode) {
            this.a = tTPErrorCode;
        }

        public final q a(TTPErrorCode tTPErrorCode) {
            return new q(tTPErrorCode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof q) && this.a == ((q) obj).a) {
                return true;
            }
            return false;
        }

        public static q a(q qVar, TTPErrorCode tTPErrorCode, int i, Object obj) {
            if ((i & 1) != 0) {
                tTPErrorCode = qVar.a;
            }
            qVar.getClass();
            return new q(tTPErrorCode);
        }
    }
}
