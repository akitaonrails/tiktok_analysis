package ttpobfuscated;

import X.C13BV;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes24.dex */
public interface o4 extends y8<fg<? extends b2>, UUID> {
    int a(String str);

    int a(List<String> list);

    List<fg<? extends b2>> a(int i, String str);

    List<fg<? extends b2>> a(int i, List<String> list);

    List<String> b();

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static int a(o4 o4Var, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    list = C13BV.INSTANCE;
                }
                return o4Var.a((List<String>) list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: countAll");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List a(o4 o4Var, int i, List list, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = Integer.MAX_VALUE;
                }
                if ((i2 & 2) != 0) {
                    list = C13BV.INSTANCE;
                }
                return o4Var.a(i, (List<String>) list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }

        public static /* synthetic */ List a(o4 o4Var, int i, String str, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = Integer.MAX_VALUE;
                }
                return o4Var.a(i, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getByKind");
        }
    }
}
