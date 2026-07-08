package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        g1 g1VarLIZ = g1.LIZ(C2110608Oq.LIZIZ.LIZ);
        synchronized (g1VarLIZ) {
            StringBuilder sb = new StringBuilder();
            int size = ((ArrayList) g1VarLIZ.LLIZ).size();
            if (size == 0) {
                return null;
            }
            try {
                List<JSONArray> listSubList = ((ArrayList) g1VarLIZ.LLIZ).subList(Math.max(size - 10, 0), size);
                if (!listSubList.isEmpty()) {
                    for (JSONArray jSONArray : listSubList) {
                        if (jSONArray != null) {
                            sb.append(jSONArray.get(0).toString());
                            sb.append(",");
                            sb.append(jSONArray.get(1).toString());
                            sb.append(",");
                            sb.append(jSONArray.get(2).toString());
                            sb.append("|");
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
