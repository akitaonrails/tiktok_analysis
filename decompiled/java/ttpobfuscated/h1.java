package ttpobfuscated;

import X.C786410Ut5;

/* JADX INFO: loaded from: classes24.dex */
public abstract class h1 {

    public static final class a extends h1 {
        public static final a a = new a();
    }

    public static final class b extends h1 {
        public final long a;

        public int hashCode() {
            return C786410Ut5.Y2(this.a);
        }

        public String toString() {
            return "RemainingOverlapTime(delayTime=" + this.a + ')';
        }

        public final long a() {
            return this.a;
        }

        public final long b() {
            return this.a;
        }

        public b(long j) {
            this.a = j;
        }

        public final b a(long j) {
            return new b(j);
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

        public static b a(b bVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bVar.a;
            }
            bVar.getClass();
            return new b(j);
        }
    }
}
