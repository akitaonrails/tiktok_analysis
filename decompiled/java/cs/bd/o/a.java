package cs.bd.o;

import X.C08PQ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends C08PQ {
    public static a LIZ;

    @Override // X.C08PQ
    public final Object LIZIZ(int i, int i2, long j, String str, Object obj) {
        if (i == 131073) {
            if (str == null || !LIZLLL(str)) {
                return null;
            }
            return "OK";
        }
        if (i == 131074) {
            String[] strArr = (String[]) obj;
            if (str != null && strArr != null && strArr.length != 0) {
                LIZJ(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
            }
        }
        return null;
    }

    public abstract void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public abstract boolean LIZLLL(String str);

    public abstract void LJ(long j, long j2, String str, String str2, int i);

    public abstract void LJFF(long j, long j2, String str, String str2, int i);

    /* JADX INFO: renamed from: cs.bd.o.a$a, reason: collision with other inner class name */
    public static class C0034a {
        public long LIZ;
        public String LIZIZ;

        public final void LIZ(int i, String str) {
            a aVar;
            synchronized (a.class) {
                aVar = a.LIZ;
            }
            if (aVar == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.LIZ;
            aVar.LJ(jCurrentTimeMillis - j, j, this.LIZIZ, str, i);
        }

        public final void LIZIZ(int i, String str) {
            a aVar;
            synchronized (a.class) {
                aVar = a.LIZ;
            }
            if (aVar == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.LIZ;
            aVar.LJFF(jCurrentTimeMillis - j, j, this.LIZIZ, str, i);
        }
    }
}
