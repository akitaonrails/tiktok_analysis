package ttpobfuscated;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class g4 {

    public static final class a extends g4 {
        public static final a a = new a();
    }

    public static final class b extends g4 {
        public final String a;
        public final List<String> b;

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            return "SentEvents(kind=" + this.a + ", events=" + this.b + ')';
        }

        public final String a() {
            return this.a;
        }

        public final List<String> b() {
            return this.b;
        }

        public final List<String> c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.LJFF(this.a, bVar.a) && Intrinsics.LJFF(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public b(String str, List<String> list) {
            this.a = str;
            this.b = list;
        }

        public final b a(String str, List<String> list) {
            return new b(str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            if ((i & 2) != 0) {
                list = bVar.b;
            }
            return bVar.a(str, list);
        }
    }
}
