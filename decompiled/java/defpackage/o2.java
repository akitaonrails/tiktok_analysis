package defpackage;

import X.C2188811AlT;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o2<T> {

    public static final class a extends o2 {
        public final String LIZ = "!hasMore";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.LJFF(this.LIZ, ((a) obj).LIZ);
        }

        public final int hashCode() {
            return this.LIZ.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Completed(reason=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final class b extends o2 {
        public final Exception LIZ;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.LJFF(this.LIZ, ((b) obj).LIZ);
        }

        public final int hashCode() {
            return this.LIZ.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error(exception=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public b(Exception exc) {
            this.LIZ = exc;
        }
    }

    public static final class c<T> extends o2<T> {
        public final T LIZ;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.LJFF(this.LIZ, ((c) obj).LIZ);
        }

        public final int hashCode() {
            T t = this.LIZ;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Success(data=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Pair pair) {
            this.LIZ = pair;
        }
    }
}
