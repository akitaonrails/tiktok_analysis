package ttpobfuscated;

import java.util.List;
import ttp.orbu.sdk.repository.model.DBEventSent;

/* JADX INFO: loaded from: classes24.dex */
public interface u2 {
    int a();

    int a(String str);

    int a(DBEventSent dBEventSent);

    List<DBEventSent> a(int i);

    long b(DBEventSent dBEventSent);

    DBEventSent b(String str);

    DBEventSent c(String str);

    public static final class a {
        public static /* synthetic */ List a(u2 u2Var, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = Integer.MAX_VALUE;
                }
                return u2Var.a(i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }
    }
}
