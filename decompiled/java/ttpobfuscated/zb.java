package ttpobfuscated;

import X.C786410Ut5;

/* JADX INFO: loaded from: classes24.dex */
public abstract class zb {
    public static final b b = new b();
    public final String a;

    public static final class a extends zb {
        public static final a h = new a();

        public a() {
            super("always");
        }
    }

    public static final class b {
    }

    public static final class c extends zb {
        public static final c h = new c();

        public c() {
            super("never");
        }
    }

    public static final class d extends zb {
        public static final d h = new d();

        public d() {
            super("once");
        }
    }

    public static final class e extends zb {
        public final int h;

        public String toString() {
            return "Sample(size=" + this.h + ')';
        }

        public final int b() {
            return this.h;
        }

        public final int c() {
            return this.h;
        }

        public int hashCode() {
            return this.h;
        }

        public e(int i) {
            super("sample");
            this.h = i;
        }

        public final e a(int i) {
            return new e(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && this.h == ((e) obj).h) {
                return true;
            }
            return false;
        }

        public static e a(e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.h;
            }
            eVar.getClass();
            return new e(i);
        }
    }

    public static final class f extends zb {
        public final long h;

        public int hashCode() {
            return C786410Ut5.Y2(this.h);
        }

        public String toString() {
            return "Timed(duration=" + this.h + ')';
        }

        public final long b() {
            return this.h;
        }

        public final long c() {
            return this.h;
        }

        public f(long j) {
            super("timed");
            this.h = j;
        }

        public final f a(long j) {
            return new f(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && this.h == ((f) obj).h) {
                return true;
            }
            return false;
        }

        public static f a(f fVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fVar.h;
            }
            fVar.getClass();
            return new f(j);
        }
    }

    public final String a() {
        return this.a;
    }

    public zb(String str) {
        this.a = str;
    }
}
