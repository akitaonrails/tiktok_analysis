package ttpobfuscated;

import X.C13BV;
import X.InterfaceC1364105Vn;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public interface j4 {
    Object a(InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn);

    Object a(String str, int i, InterfaceC1364105Vn<? super List<? extends fg<? extends b2>>> interfaceC1364105Vn);

    Object a(String str, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    Object a(UUID uuid, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object a(fg<? extends b2> fgVar, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    List<fg<? extends b2>> a(int i, List<String> list);

    Object b(fg<? extends b2> fgVar, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public static abstract class b extends r4 {

        public static final class a extends b {
            public a(Throwable th) {
                super(th);
            }
        }

        /* JADX INFO: renamed from: ttpobfuscated.j4$b$b, reason: collision with other inner class name */
        public static final class C0060b extends b {
            public C0060b(Throwable th) {
                super(th);
            }
        }

        public static final class c extends b {
            public c(Throwable th) {
                super(th);
            }
        }

        public static final class d extends b {
            public d(Throwable th) {
                super(th);
            }
        }

        public static final class e extends b {
            public e(Throwable th) {
                super(th);
            }
        }

        public static final class f extends b {
            public f(Throwable th) {
                super(th);
            }
        }

        public b(Throwable th) {
            super(th.getMessage());
        }
    }

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static List a(j4 j4Var, int i, List list, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = Integer.MAX_VALUE;
                }
                if ((i2 & 2) != 0) {
                    list = C13BV.INSTANCE;
                }
                return j4Var.a(i, (List<String>) list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }

        public static /* synthetic */ Object a(j4 j4Var, String str, int i, InterfaceC1364105Vn interfaceC1364105Vn, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = Integer.MAX_VALUE;
                }
                return j4Var.a(str, i, interfaceC1364105Vn);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getByType");
        }
    }
}
