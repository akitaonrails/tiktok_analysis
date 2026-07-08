package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import ms.bd.o.b;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        k2 k2VarLIZ = k2.LIZ(a.LIZIZ.LIZ);
        synchronized (k2VarLIZ) {
            StringBuilder sb = new StringBuilder();
            int size = k2VarLIZ.LLILZIL.size();
            if (size <= 0) {
                return null;
            }
            try {
                List<JSONArray> list = k2VarLIZ.LLILZIL;
                int i2 = size - 50;
                if (i2 <= 0) {
                    i2 = 0;
                }
                List<JSONArray> listSubList = list.subList(i2, size);
                if (listSubList.size() > 0) {
                    for (JSONArray jSONArray : listSubList) {
                        if (jSONArray != null) {
                            sb.append(jSONArray.get(0).toString());
                            sb.append((String) k.a(16777217, 0, 0L, "135f2a", new byte[]{108}));
                            sb.append(jSONArray.get(1).toString());
                            sb.append((String) k.a(16777217, 0, 0L, "cc8c70", new byte[]{62}));
                            sb.append(jSONArray.get(2).toString());
                            sb.append((String) k.a(16777217, 0, 0L, "be4303", new byte[]{111}));
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
                return sb.toString();
            }
            return sb.toString();
        }
    }
}
