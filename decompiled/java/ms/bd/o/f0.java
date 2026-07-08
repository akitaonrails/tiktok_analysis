package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;
import ms.bd.o.i2;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        String string;
        i2 i2VarLIZIZ = i2.LIZIZ(a.LIZIZ.LIZ);
        synchronized (i2VarLIZIZ) {
            try {
                JSONArray jSONArray = new JSONArray();
                synchronized (i2VarLIZIZ.LLILZLL) {
                    try {
                        for (i2.d dVar : i2VarLIZIZ.LLILZLL) {
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(dVar.LIZ);
                            JSONArray jSONArray3 = new JSONArray();
                            jSONArray3.put(dVar.LIZIZ[0]);
                            jSONArray3.put(dVar.LIZIZ[1]);
                            jSONArray3.put(dVar.LIZIZ[2]);
                            jSONArray2.put(jSONArray3);
                            JSONArray jSONArray4 = new JSONArray();
                            jSONArray4.put(dVar.LIZJ[0]);
                            jSONArray4.put(dVar.LIZJ[1]);
                            jSONArray4.put(dVar.LIZJ[2]);
                            jSONArray2.put(jSONArray4);
                            JSONArray jSONArray5 = new JSONArray();
                            jSONArray5.put(dVar.LIZLLL[0]);
                            jSONArray5.put(dVar.LIZLLL[1]);
                            jSONArray5.put(dVar.LIZLLL[2]);
                            jSONArray2.put(jSONArray5);
                            JSONArray jSONArray6 = new JSONArray();
                            jSONArray6.put(dVar.LJ[0]);
                            jSONArray6.put(dVar.LJ[1]);
                            jSONArray6.put(dVar.LJ[2]);
                            jSONArray2.put(jSONArray6);
                            jSONArray.put(jSONArray2);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                string = jSONArray.toString();
            } catch (JSONException th) {
                return null;
            }
        }
        return string;
    }
}
