package ttpobfuscated;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public abstract class j2 {

    public static final class a extends j2 {
        public static final a a = new a();
    }

    public static final class b extends j2 {
        public final g5 a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "NoChange(fileStatus=" + this.a + ')';
        }

        public final g5 a() {
            return this.a;
        }

        public final g5 b() {
            return this.a;
        }

        public b(g5 g5Var) {
            this.a = g5Var;
        }

        public final b a(g5 g5Var) {
            return new b(g5Var);
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

        public static b a(b bVar, g5 g5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                g5Var = bVar.a;
            }
            bVar.getClass();
            return new b(g5Var);
        }
    }

    public static final class c extends j2 {
        public static final c a = new c();
    }

    public static final class d extends j2 {
        public final g5 a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "NotReportedChange(fileStatus=" + this.a + ')';
        }

        public final g5 a() {
            return this.a;
        }

        public final g5 b() {
            return this.a;
        }

        public d(g5 g5Var) {
            this.a = g5Var;
        }

        public final d a(g5 g5Var) {
            return new d(g5Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && Intrinsics.LJFF(this.a, ((d) obj).a)) {
                return true;
            }
            return false;
        }

        public static d a(d dVar, g5 g5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                g5Var = dVar.a;
            }
            dVar.getClass();
            return new d(g5Var);
        }
    }

    public static final class e extends j2 {
        public final g5 a;

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StatusSent(fileStatus=" + this.a + ')';
        }

        public final g5 a() {
            return this.a;
        }

        public final g5 b() {
            return this.a;
        }

        public e(g5 g5Var) {
            this.a = g5Var;
        }

        public final e a(g5 g5Var) {
            return new e(g5Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && Intrinsics.LJFF(this.a, ((e) obj).a)) {
                return true;
            }
            return false;
        }

        public static e a(e eVar, g5 g5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                g5Var = eVar.a;
            }
            eVar.getClass();
            return new e(g5Var);
        }
    }
}
