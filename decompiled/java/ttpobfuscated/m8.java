package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public abstract class m8 {
    public final String a;

    public static final class a extends m8 {
        public final String b;
        public final String c;

        public int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Encoding(key=");
            sb.append(this.b);
            sb.append(", value=");
            return n0.a(sb, this.c, ')');
        }

        @Override // ttpobfuscated.m8
        public String a() {
            return this.b;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Intrinsics.LJFF(this.b, aVar.b) && Intrinsics.LJFF(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public a(String str, String str2) {
            super(str);
            this.b = str;
            this.c = str2;
        }

        public final a a(String str, String str2) {
            return new a(str, str2);
        }

        public static a a(a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.b;
            }
            if ((i & 2) != 0) {
                str2 = aVar.c;
            }
            return aVar.a(str, str2);
        }
    }

    public static final class b extends m8 {
        public static final b b = new b();

        public b() {
            super(null);
        }
    }

    public static final class c extends m8 {
        public final String b;
        public final n8 c;
        public final n8 d;

        public int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "InvalidJsonType(key=" + this.b + ", jsonType=" + this.c + ", expectedJsonType=" + this.d + ')';
        }

        @Override // ttpobfuscated.m8
        public String a() {
            return this.b;
        }

        public final String b() {
            return this.b;
        }

        public final n8 c() {
            return this.c;
        }

        public final n8 d() {
            return this.d;
        }

        public final n8 e() {
            return this.d;
        }

        public final n8 f() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Intrinsics.LJFF(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d) {
                return true;
            }
            return false;
        }

        public c(String str, n8 n8Var, n8 n8Var2) {
            super(str);
            this.b = str;
            this.c = n8Var;
            this.d = n8Var2;
        }

        public final c a(String str, n8 n8Var, n8 n8Var2) {
            return new c(str, n8Var, n8Var2);
        }

        public static c a(c cVar, String str, n8 n8Var, n8 n8Var2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.b;
            }
            if ((i & 2) != 0) {
                n8Var = cVar.c;
            }
            if ((i & 4) != 0) {
                n8Var2 = cVar.d;
            }
            return cVar.a(str, n8Var, n8Var2);
        }
    }

    public static final class d extends m8 {
        public final String b;

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return n0.a(new StringBuilder("NoKey(key="), this.b, ')');
        }

        @Override // ttpobfuscated.m8
        public String a() {
            return this.b;
        }

        public final String b() {
            return this.b;
        }

        public d(String str) {
            super(str);
            this.b = str;
        }

        public final d a(String str) {
            return new d(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && Intrinsics.LJFF(this.b, ((d) obj).b)) {
                return true;
            }
            return false;
        }

        public static d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.b;
            }
            dVar.getClass();
            return new d(str);
        }
    }

    public String a() {
        return this.a;
    }

    public m8(String str) {
        this.a = str;
    }
}
