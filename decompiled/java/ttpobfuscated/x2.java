package ttpobfuscated;

import X.C13BV;
import java.util.List;
import java.util.UUID;
import ttp.orbu.sdk.repository.model.DBEvent;

/* JADX INFO: loaded from: classes24.dex */
public interface x2 {
    int a(String str);

    int a(List<String> list);

    int a(UUID uuid);

    int a(DBEvent dBEvent);

    List<DBEvent> a(String str, int i);

    List<DBEvent> a(List<String> list, int i);

    long b(DBEvent dBEvent);

    List<String> b();

    DBEvent b(UUID uuid);

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static int a(x2 x2Var, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    list = C13BV.INSTANCE;
                }
                return x2Var.a((List<String>) list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: countAll");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List a(x2 x2Var, List list, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    list = C13BV.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i = Integer.MAX_VALUE;
                }
                return x2Var.a((List<String>) list, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }

        public static /* synthetic */ List a(x2 x2Var, String str, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = Integer.MAX_VALUE;
                }
                return x2Var.a(str, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getByKind");
        }
    }
}
