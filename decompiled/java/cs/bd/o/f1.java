package cs.bd.o;

import X.C08PH;
import X.C08PI;
import X.C08PQ;
import X.C08XS;
import X.C2110608Oq;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.mobsec.matrix.CSProxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class f1 {
    public static volatile boolean LIZ;
    public static final Map<String, q> LIZIZ = new ConcurrentHashMap();

    /* JADX INFO: loaded from: classes31.dex */
    public interface a {
        void LIZ(int i);

        void LIZIZ(String str);

        void report(String str);

        void setDeviceID(String str);

        void setInstallID(String str);
    }

    public static synchronized void LIZIZ(Context context) {
        i.LIZ(C786410Ut5.N3(context), "oecsec_ov");
    }

    public static synchronized e1 LIZ(String str) {
        if (str != null) {
            if (!LIZ) {
                return null;
            }
            Object objA = CSProxy.a(67108866, 0, 0L, str, null);
            if (objA == null) {
                return null;
            }
            q qVar = (q) ((ConcurrentHashMap) LIZIZ).get(str);
            if (qVar == null) {
                return null;
            }
            return new e1(qVar, C2110608Oq.LIZIZ.LIZ, ((Long) objA).longValue());
        }
        throw new NullPointerException("appID must be set");
    }

    public static synchronized boolean LIZLLL(Context context, q qVar) {
        String str;
        if (context != null) {
            if (qVar != null) {
                String str2 = qVar.LIZ;
                if (str2 != null && str2.length() > 0) {
                    str = qVar.LIZ;
                } else {
                    str = qVar.LJI;
                }
                if (str != null && str.length() > 0) {
                    LIZJ(context, "oecsec_ov", "cs_sensor_ov");
                    if (((ConcurrentHashMap) LIZIZ).containsKey(str)) {
                        return false;
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(q.LIZ(qVar.LIZ));
                    jSONArray.put(q.LIZ(qVar.LJII));
                    jSONArray.put(q.LIZ(qVar.LJI));
                    jSONArray.put(q.LIZ(qVar.LJIIIIZZ));
                    jSONArray.put(q.LIZ("v10.02.10-ov-android"));
                    jSONArray.put(q.LIZ(qVar.LIZIZ));
                    jSONArray.put(q.LIZ(qVar.LIZJ));
                    jSONArray.put(q.LIZ(qVar.LIZLLL));
                    jSONArray.put(q.LIZ(qVar.LJ));
                    jSONArray.put(q.LIZ(qVar.LJFF));
                    jSONArray.put(String.valueOf(qVar.LJIIIZ));
                    jSONArray.put(String.valueOf(qVar.LJIIJ));
                    jSONArray.put(String.valueOf(qVar.LJIIJJI));
                    jSONArray.put(q.LIZ(qVar.LJIIL));
                    jSONArray.put(String.valueOf(qVar.LJIILIIL));
                    jSONArray.put(String.valueOf(qVar.LJIILJJIL));
                    JSONArray jSONArray2 = new JSONArray();
                    for (Map.Entry<String, String> entry : qVar.LJIILL.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getKey())) {
                            jSONArray2.put(q.LIZ(entry.getKey()));
                            jSONArray2.put(q.LIZ(entry.getValue()));
                        }
                    }
                    jSONArray.put(jSONArray2);
                    JSONArray jSONArray3 = new JSONArray();
                    for (Map.Entry entry2 : ((HashMap) qVar.LJIIZILJ).entrySet()) {
                        if (!TextUtils.isEmpty((CharSequence) entry2.getKey())) {
                            jSONArray3.put(q.LIZ(entry2.getKey()));
                            jSONArray3.put(q.LIZ(entry2.getValue()));
                        }
                    }
                    jSONArray.put(jSONArray3);
                    JSONArray jSONArray4 = new JSONArray();
                    for (Map.Entry<String, String> entry3 : qVar.LJIJ.entrySet()) {
                        if (!TextUtils.isEmpty(entry3.getKey())) {
                            jSONArray4.put(q.LIZ(entry3.getKey()));
                            jSONArray4.put(q.LIZ(entry3.getValue()));
                        }
                    }
                    jSONArray.put(jSONArray4);
                    JSONArray jSONArray5 = new JSONArray();
                    for (Map.Entry<String, String> entry4 : qVar.LJIILLIIL.entrySet()) {
                        if (!TextUtils.isEmpty(entry4.getKey())) {
                            jSONArray5.put(q.LIZ(entry4.getKey()));
                            jSONArray5.put(q.LIZ(entry4.getValue()));
                        }
                    }
                    jSONArray.put(jSONArray5);
                    if (!((Boolean) CSProxy.a(67108865, 0, 0L, jSONArray.toString(), null)).booleanValue()) {
                        return false;
                    }
                    ((ConcurrentHashMap) LIZIZ).put(str, qVar);
                    return true;
                }
                throw new NullPointerException("appID must be set");
            }
            throw new NullPointerException("config could not be null");
        }
        throw new NullPointerException("context could not be null");
    }

    public static synchronized void LIZJ(Context context, String str, String str2) {
        Context contextN3;
        C08PQ j1Var;
        C08PQ k1Var;
        boolean z;
        boolean z2;
        if (!LIZ) {
            Context contextN32 = C786410Ut5.N3(context);
            C2110608Oq c2110608Oq = C2110608Oq.LIZIZ;
            if (contextN32 != null) {
                contextN3 = C786410Ut5.N3(contextN32);
            } else {
                contextN3 = null;
            }
            c2110608Oq.LIZ = contextN3;
            try {
                Class.forName("com.tts.mobsec.sensor.ml.CSB");
                i.LIZ(contextN32, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C08PI.LIZ(16777218, new b0());
            C08PI.LIZ(16777217, new m0());
            C08PI.LIZ(16777219, new x0());
            C08PI.LIZ(16777221, new y0());
            C08PI.LIZ(16777222, new z0());
            C08PI.LIZ(16777258, new a1());
            C08PI.LIZ(16777260, new b1());
            C08PI.LIZ(16777273, new c1());
            C08PI.LIZ(16777261, new d1());
            C08PI.LIZ(16777262, new r());
            C08PI.LIZ(16777259, new s());
            C08PI.LIZ(16777223, new t());
            C08PI.LIZ(16777225, new u());
            C08PI.LIZ(16777226, new v());
            C08PI.LIZ(16777228, new w());
            C08PI.LIZ(16777232, new x());
            C08PI.LIZ(16777233, new y());
            C08PI.LIZ(16777235, new z());
            C08PI.LIZ(16777274, new a0());
            C08PI.LIZ(16777238, new c0());
            C08PI.LIZ(16777239, new d0());
            C08PI.LIZ(16777241, new e0());
            C08PI.LIZ(16777242, new f0());
            C08PI.LIZ(16777243, new g0());
            C08PI.LIZ(16777244, new h0());
            C08PI.LIZ(16777245, new i0());
            C08PI.LIZ(16777246, new j0());
            C08PI.LIZ(16777247, new k0());
            C08PI.LIZ(16777248, new l0());
            C08PI.LIZ(16777249, new n0());
            C08PI.LIZ(16777250, new o0());
            C08PI.LIZ(16777251, new p0());
            C08PI.LIZ(16777240, new q0());
            C08PI.LIZ(16777253, new r0());
            C08PI.LIZ(16777254, new s0());
            C08PI.LIZ(16777255, new t0());
            C08PI.LIZ(16777256, new u0());
            C08PI.LIZ(16777257, new v0());
            C08PI.LIZ(16777275, new w0());
            String[] strArr = {"com.bytedance.ttnet.TTNetInit"};
            int length = strArr.length;
            int i = 0;
            boolean z3 = true;
            while (true) {
                if (i < length) {
                    try {
                        Class.forName(strArr[i]);
                        z2 = true;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        z2 = false;
                    }
                    z3 &= z2;
                    if (z3) {
                        i++;
                    } else {
                        j1Var = new i1();
                        break;
                    }
                } else {
                    j1Var = new j1();
                    break;
                }
            }
            C08PI.LIZ(33554433, j1Var);
            String[] strArr2 = {"com.bytedance.ttnet.TTNetInit"};
            int length2 = strArr2.length;
            int i2 = 0;
            boolean z4 = true;
            while (true) {
                if (i2 < length2) {
                    try {
                        Class.forName(strArr2[i2]);
                        z = true;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        z = false;
                    }
                    z4 &= z;
                    if (z4) {
                        i2++;
                    } else {
                        k1Var = new i1();
                        break;
                    }
                } else {
                    k1Var = new k1();
                    break;
                }
            }
            C08PI.LIZ(33554434, k1Var);
            C08PI.LIZ(50331649, new l1());
            C08PH.LIZ();
            C08XS.LIZ();
            i.LIZ(contextN32, str);
            CSProxy.a(16777219, 0, 0L, null, contextN32);
            CSProxy.a(16777220, 0, 0L, null, null);
            LIZ = true;
        }
    }
}
