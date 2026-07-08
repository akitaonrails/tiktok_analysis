package ttpobfuscated;

import ttp.orbu.sdk.requestvalidator.OrbuResult;

/* JADX INFO: loaded from: classes24.dex */
public interface ra {
    public static final a a = a.a;

    public static final class c {
        public final byte a;
        public final byte b;

        public int hashCode() {
            return this.b + (this.a * 31);
        }

        public String toString() {
            return "Version(major=" + ((int) this.a) + ", minor=" + ((int) this.b) + ')';
        }

        public final byte a() {
            return this.a;
        }

        public final byte b() {
            return this.b;
        }

        public final byte c() {
            return this.a;
        }

        public final byte d() {
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
            if (this.a == cVar.a && this.b == cVar.b) {
                return true;
            }
            return false;
        }

        public c(byte b, byte b2) {
            this.a = b;
            this.b = b2;
        }

        public final c a(byte b, byte b2) {
            return new c(b, b2);
        }

        public static c a(c cVar, byte b, byte b2, int i, Object obj) {
            if ((i & 1) != 0) {
                b = cVar.a;
            }
            if ((i & 2) != 0) {
                b2 = cVar.b;
            }
            cVar.getClass();
            return new c(b, b2);
        }
    }

    OrbuResult a(Throwable th, fc fcVar);

    OrbuResult a(cc ccVar, ib ibVar, fc fcVar);

    void a(boolean z);

    boolean a();

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final g b = g.Api2;

        public final g a() {
            return b;
        }
    }

    public static final class b {
        public static /* synthetic */ OrbuResult a(ra raVar, Throwable th, fc fcVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    fcVar = null;
                }
                return raVar.a(th, fcVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleException");
        }

        public static /* synthetic */ OrbuResult a(ra raVar, cc ccVar, ib ibVar, fc fcVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    fcVar = null;
                }
                return raVar.a(ccVar, ibVar, fcVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateRequest");
        }
    }
}
