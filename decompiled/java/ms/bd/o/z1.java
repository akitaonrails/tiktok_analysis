package ms.bd.o;

import X.C08XE;
import X.C1494230ozF;
import X.C1494320ozO;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        return Boolean.valueOf(C1494230ozF.LIZIZ((String) k.a(16777217, 0, 0L, "0c58c7", new byte[]{45, 110, 65, 69, 88, 109, 54, 80, 118, 103, 51, 44, 80, 73, 78, 41, 53, 91}), new a(j)));
    }

    public class a implements C08XE {
        public final /* synthetic */ long LIZ;

        public a(long j) {
            this.LIZ = j;
        }

        @Override // X.C08XE
        public final C1494320ozO LIZIZ(Map<String, List<String>> map) {
            List<String> list = map.get(k.a(16777217, 0, 0L, "d04261", new byte[]{121, 61, 64, 79, 13, 107, 98, 3, 119, 109, 103, 127, 81, 67, 27, 47, 97, 8}));
            boolean z = false;
            if (list != null) {
                String str = (String) ListProtector.get(list, 0);
                if (!str.isEmpty()) {
                    if (str.charAt(0) == '1') {
                        z = true;
                    }
                    k.a(134217729, 0, this.LIZ, str, null);
                }
            }
            return new C1494320ozO(z, true, null);
        }
    }
}
