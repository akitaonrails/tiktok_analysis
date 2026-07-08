package ttpobfuscated;

import X.C13BV;
import X.InterfaceC1364105Vn;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public interface e5 {
    Object a(String str, List<String> list, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn);

    Object b(String str, List<String> list, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn);

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class b extends r4 {
        public final String a;
        public final Throwable b;

        public final String a() {
            return this.a;
        }

        public final Throwable b() {
            return this.b;
        }

        public static final class a extends b {
            public a(String str, Throwable th) {
                super(str, th);
            }
        }

        /* JADX INFO: renamed from: ttpobfuscated.e5$b$b, reason: collision with other inner class name */
        public static final class C0052b extends b {
            public C0052b(String str, Throwable th) {
                super(str, th);
            }
        }

        public b(String str, Throwable th) {
            super(null);
            this.a = str;
            this.b = th;
        }
    }

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static Object a(e5 e5Var, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    list = C13BV.INSTANCE;
                }
                return e5Var.a(str, list, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listAllFiles");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object b(e5 e5Var, String str, List list, InterfaceC1364105Vn interfaceC1364105Vn, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    list = C13BV.INSTANCE;
                }
                return e5Var.b(str, list, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listAllFolders");
        }
    }
}
