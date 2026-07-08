package ttpobfuscated;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.constants.TTPErrorCode;

/* JADX INFO: loaded from: classes24.dex */
public abstract class f4 {

    public static final class a extends f4 {
        public final String a;
        public final String b;

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AddSentEventError(id=");
            sb.append(this.a);
            sb.append(", type=");
            return n0.a(sb, this.b, ')');
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Intrinsics.LJFF(this.a, aVar.a) && Intrinsics.LJFF(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final a a(String str, String str2) {
            return new a(str, str2);
        }

        public static /* synthetic */ a a(a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.b;
            }
            return aVar.a(str, str2);
        }
    }

    public static final class b extends f4 {
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

        public b(i0 i0Var) {
            this.a = i0Var;
        }

        public final b a(i0 i0Var) {
            return new b(i0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.a == ((b) obj).a) {
                return true;
            }
            return false;
        }

        public static b a(b bVar, i0 i0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                i0Var = bVar.a;
            }
            bVar.getClass();
            return new b(i0Var);
        }
    }

    public static final class c extends f4 {
        public final String a;
        public final String b;

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DeleteEventError(id=");
            sb.append(this.a);
            sb.append(", type=");
            return n0.a(sb, this.b, ')');
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.LJFF(this.a, cVar.a) && Intrinsics.LJFF(this.b, cVar.b)) {
                return true;
            }
            return false;
        }

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final c a(String str, String str2) {
            return new c(str, str2);
        }

        public static /* synthetic */ c a(c cVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.b;
            }
            return cVar.a(str, str2);
        }
    }

    public static final class d extends f4 {
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

        public d(TTPErrorCode tTPErrorCode) {
            this.a = tTPErrorCode;
        }

        public final d a(TTPErrorCode tTPErrorCode) {
            return new d(tTPErrorCode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.a == ((d) obj).a) {
                return true;
            }
            return false;
        }

        public static d a(d dVar, TTPErrorCode tTPErrorCode, int i, Object obj) {
            if ((i & 1) != 0) {
                tTPErrorCode = dVar.a;
            }
            dVar.getClass();
            return new d(tTPErrorCode);
        }
    }

    public static final class e extends f4 {
        public static final e a = new e();
    }

    public static final class f extends f4 {
        public static final f a = new f();
    }

    public static final class g extends f4 {
        public static final g a = new g();
    }

    public static final class h extends f4 {
        public static final h a = new h();
    }

    public static final class i extends f4 {
        public final List<String> a;
        public final String b;
        public final TTPErrorCode c;

        public int hashCode() {
            return this.c.hashCode() + m2.a(this.b, this.a.hashCode() * 31, 31);
        }

        public String toString() {
            return "SendLogError(events=" + this.a + ", kind=" + this.b + ", ttpErrorCode=" + this.c + ')';
        }

        public final List<String> a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final TTPErrorCode c() {
            return this.c;
        }

        public final List<String> d() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        public final TTPErrorCode f() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Intrinsics.LJFF(this.a, iVar.a) && Intrinsics.LJFF(this.b, iVar.b) && this.c == iVar.c) {
                return true;
            }
            return false;
        }

        public i(List<String> list, String str, TTPErrorCode tTPErrorCode) {
            this.a = list;
            this.b = str;
            this.c = tTPErrorCode;
        }

        public final i a(List<String> list, String str, TTPErrorCode tTPErrorCode) {
            return new i(list, str, tTPErrorCode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ i a(i iVar, List list, String str, TTPErrorCode tTPErrorCode, int i, Object obj) {
            if ((i & 1) != 0) {
                list = iVar.a;
            }
            if ((i & 2) != 0) {
                str = iVar.b;
            }
            if ((i & 4) != 0) {
                tTPErrorCode = iVar.c;
            }
            return iVar.a(list, str, tTPErrorCode);
        }
    }

    public static final class j extends f4 {
        public final String a;
        public final TTPErrorCode b;

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            return "SendSampleError(id=" + this.a + ", ttpErrorCode=" + this.b + ')';
        }

        public final String a() {
            return this.a;
        }

        public final TTPErrorCode b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final TTPErrorCode d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (Intrinsics.LJFF(this.a, jVar.a) && this.b == jVar.b) {
                return true;
            }
            return false;
        }

        public j(String str, TTPErrorCode tTPErrorCode) {
            this.a = str;
            this.b = tTPErrorCode;
        }

        public final j a(String str, TTPErrorCode tTPErrorCode) {
            return new j(str, tTPErrorCode);
        }

        public static /* synthetic */ j a(j jVar, String str, TTPErrorCode tTPErrorCode, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jVar.a;
            }
            if ((i & 2) != 0) {
                tTPErrorCode = jVar.b;
            }
            return jVar.a(str, tTPErrorCode);
        }
    }

    public static final class k extends f4 {
        public static final k a = new k();
    }
}
