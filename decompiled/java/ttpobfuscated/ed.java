package ttpobfuscated;

import X.C13IQ;
import X.C13LE;
import X.C786410Ut5;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ed {
    public static final e b = new e();
    public final int a;

    public static final class a extends ed {
        public static final a c = new a();

        public a() {
            super(2);
        }

        @Override // ttpobfuscated.ed
        public boolean b() {
            return true;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class b extends ed {
        public final float c;

        @Override // ttpobfuscated.ed
        public boolean b() {
            return new SecureRandom().nextFloat() <= this.c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "Buffered(probability=" + this.c + ')';
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.c;
        }

        public b(float f) {
            super(7);
            this.c = f;
        }

        public final b a(float f) {
            return new b(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && Float.compare(this.c, ((b) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public static b a(b bVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = bVar.c;
            }
            bVar.getClass();
            return new b(f);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class c extends ed {
        public int c;

        @Override // ttpobfuscated.ed
        public boolean b() {
            return this.c > 0;
        }

        public final void d() {
            this.c--;
        }

        public String toString() {
            return "BurstCount(sampleCountSize=" + this.c + ')';
        }

        public final int c() {
            return this.c;
        }

        public final int e() {
            return this.c;
        }

        public int hashCode() {
            return this.c;
        }

        public c(int i) {
            super(5);
            this.c = i;
        }

        public final c a(int i) {
            return new c(i);
        }

        public final void b(int i) {
            this.c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.c == ((c) obj).c) {
                return true;
            }
            return false;
        }

        public static c a(c cVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = cVar.c;
            }
            cVar.getClass();
            return new c(i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class d extends ed {
        public long c;
        public final long d;

        @Override // ttpobfuscated.ed
        public boolean b() {
            bg.a.getClass();
            return System.currentTimeMillis() <= this.d;
        }

        public int hashCode() {
            return C786410Ut5.Y2(this.c);
        }

        public String toString() {
            return "BurstTime(durationMillis=" + this.c + ')';
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.c;
        }

        public d(long j) {
            super(6);
            this.c = j;
            this.d = bg.a.a() + this.c;
        }

        public final d a(long j) {
            return new d(j);
        }

        public final void b(long j) {
            this.c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && this.c == ((d) obj).c) {
                return true;
            }
            return false;
        }

        public static d a(d dVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dVar.c;
            }
            dVar.getClass();
            return new d(j);
        }
    }

    public static final class f extends ed {
        public static final f c = new f();

        public f() {
            super(1);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class g extends ed {
        public final float c;

        @Override // ttpobfuscated.ed
        public boolean b() {
            return new SecureRandom().nextFloat() <= this.c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "Random(probability=" + this.c + ')';
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.c;
        }

        public g(float f) {
            super(3);
            this.c = f;
        }

        public final g a(float f) {
            return new g(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof g) && Float.compare(this.c, ((g) obj).c) == 0) {
                return true;
            }
            return false;
        }

        public static g a(g gVar, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = gVar.c;
            }
            gVar.getClass();
            return new g(f);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class h extends ed {
        public final long c;
        public final long d;
        public final float e;
        public final int f;
        public long g;
        public int h;
        public long i;
        public float j;

        @Override // ttpobfuscated.ed
        public boolean b() {
            bg.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis < this.g) {
                return false;
            }
            long jA = a(jCurrentTimeMillis);
            if (jA > this.i) {
                this.h = this.f;
                this.i = jA;
                this.j = this.e;
            }
            this.j = l() ? 1.0f : -1.0f;
            return b(jA) && this.h > 0 && this.j == 1.0f;
        }

        public final void g() {
            this.h--;
        }

        public int hashCode() {
            return this.f + ((Float.floatToIntBits(this.e) + ((C786410Ut5.Y2(this.d) + (C786410Ut5.Y2(this.c) * 31)) * 31)) * 31);
        }

        public final boolean l() {
            return new SecureRandom().nextFloat() <= this.j;
        }

        public String toString() {
            return "RandomTimeBased(periodTimeOffsetMillis=" + this.c + ", periodDurationMillis=" + this.d + ", periodProbability=" + this.e + ", sampleCountSize=" + this.f + ')';
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        public final int f() {
            return this.f;
        }

        public final long h() {
            return this.d;
        }

        public final float i() {
            return this.e;
        }

        public final long j() {
            return this.c;
        }

        public final int k() {
            return this.f;
        }

        public final long a(long j) {
            long j2 = this.g;
            long j3 = this.d + this.c;
            return (j3 * ((j - j2) / j3)) + j2;
        }

        public final boolean b(long j) {
            long j2 = this.d + j;
            bg.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (this.c == hVar.c && this.d == hVar.d && Float.compare(this.e, hVar.e) == 0 && this.f == hVar.f) {
                return true;
            }
            return false;
        }

        public h(long j, long j2, float f, int i) {
            super(4);
            this.c = j;
            this.d = j2;
            this.e = f;
            this.f = i;
            long jA = bg.a.a() + j;
            this.g = jA;
            this.h = i;
            this.i = jA;
            this.j = f;
        }

        public final h a(long j, long j2, float f, int i) {
            return new h(j, j2, f, i);
        }

        public static h a(h hVar, long j, long j2, float f, int i, int i2, Object obj) {
            float f2 = f;
            long j3 = j2;
            int i3 = i;
            long j4 = j;
            if ((i2 & 1) != 0) {
                j4 = hVar.c;
            }
            if ((i2 & 2) != 0) {
                j3 = hVar.d;
            }
            if ((i2 & 4) != 0) {
                f2 = hVar.e;
            }
            if ((i2 & 8) != 0) {
                i3 = hVar.f;
            }
            hVar.getClass();
            return new h(j4, j3, f2, i3);
        }
    }

    public boolean b() {
        return false;
    }

    public final int a() {
        return this.a;
    }

    public static final class e {
        public final C13IQ<? extends ed> a(int i) {
            Class cls;
            switch (i) {
                case 1:
                    cls = f.class;
                    break;
                case 2:
                    cls = a.class;
                    break;
                case 3:
                    cls = g.class;
                    break;
                case 4:
                    cls = h.class;
                    break;
                case 5:
                    cls = c.class;
                    break;
                case 6:
                    cls = d.class;
                    break;
                case 7:
                    cls = b.class;
                    break;
                default:
                    return null;
            }
            return C13LE.LIZ(cls);
        }
    }

    public ed(int i) {
        this.a = i;
    }
}
