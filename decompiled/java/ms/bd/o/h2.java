package ms.bd.o;

import X.C0V90;
import X.C786410Ut5;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.xtrace.HookMode;
import com.bytedance.xtrace.XTrace;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ms.bd.o.b;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class h2 {
    public static volatile boolean LIZ;
    public static final Map<String, c0> LIZIZ = new ConcurrentHashMap();

    /* JADX INFO: loaded from: classes31.dex */
    public interface a {
        void LIZ(int i);

        void LIZIZ(String str);

        void LIZJ(String str);

        void LIZLLL(int i);

        Map<String, String> frameSign(String str, int i);

        void report(String str);

        void setDeviceID(String str);

        void setInstallID(String str);
    }

    public static synchronized g2 LIZ(String str) {
        if (str != null) {
            if (!LIZ) {
                return null;
            }
            Object objA = k.a(67108866, 0, 0L, str, null);
            if (objA == null) {
                return null;
            }
            c0 c0Var = (c0) ((ConcurrentHashMap) LIZIZ).get(str);
            if (c0Var == null) {
                return null;
            }
            return new g2(c0Var, ms.bd.o.a.LIZIZ.LIZ, ((Long) objA).longValue());
        }
        throw new NullPointerException("appID must be set");
    }

    public static synchronized void LIZIZ(Context context, String str) {
        b.a l2Var;
        Context context2 = context;
        synchronized (h2.class) {
            if (!LIZ) {
                Context contextN3 = C786410Ut5.N3(context2);
                if (contextN3 != null) {
                    context2 = contextN3;
                }
                ms.bd.o.a aVar = ms.bd.o.a.LIZIZ;
                aVar.getClass();
                if (context2 instanceof Application) {
                    aVar.LIZ = context2;
                    try {
                        XTrace.setHookMode(HookMode.MODE_REPLACE);
                        XTrace.init(context2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    u.LIZ(context2, str);
                    b.LIZ(16777218, new n0());
                    b.LIZ(16777217, new y0());
                    b.LIZ(16777219, new j1());
                    b.LIZ(16777221, new u1());
                    b.LIZ(16777222, new a2());
                    b.LIZ(16777258, new b2());
                    b.LIZ(16777260, new c2());
                    b.LIZ(16777273, new d2());
                    b.LIZ(16777261, new e2());
                    b.LIZ(16777262, new d0());
                    b.LIZ(16777263, new e0());
                    b.LIZ(16777274, new f0());
                    b.LIZ(16777264, new g0());
                    b.LIZ(16777265, new h0());
                    b.LIZ(16777271, new i0());
                    b.LIZ(16777272, new j0());
                    b.LIZ(16777275, new k0());
                    b.LIZ(16777270, new l0());
                    b.LIZ(16777276, new m0());
                    b.LIZ(16777223, new o0());
                    b.LIZ(16777224, new p0());
                    b.LIZ(16777225, new q0());
                    b.LIZ(16777226, new r0());
                    b.LIZ(16777228, new s0());
                    b.LIZ(16777232, new t0());
                    b.LIZ(16777233, new u0());
                    b.LIZ(16777235, new v0());
                    b.LIZ(16777238, new w0());
                    b.LIZ(16777239, new x0());
                    b.LIZ(16777241, new z0());
                    b.LIZ(16777242, new a1());
                    b.LIZ(16777243, new b1());
                    b.LIZ(16777244, new c1());
                    b.LIZ(16777245, new d1());
                    b.LIZ(16777246, new e1());
                    b.LIZ(16777247, new f1());
                    b.LIZ(16777248, new g1());
                    b.LIZ(16777249, new h1());
                    b.LIZ(16777250, new i1());
                    b.LIZ(16777251, new k1());
                    b.LIZ(16777240, new l1());
                    b.LIZ(16777252, new m1());
                    b.LIZ(16777253, new n1());
                    b.LIZ(16777254, new o1());
                    b.LIZ(16777255, new p1());
                    b.LIZ(16777266, new q1());
                    b.LIZ(16777267, new r1());
                    b.LIZ(16777268, new s1());
                    b.LIZ(16777269, new t1());
                    b.LIZ(16777277, new v1());
                    b.LIZ(16777278, new w1());
                    b.LIZ(16777279, new x1());
                    b.LIZ(16777280, new y1());
                    if (y.LIZJ()) {
                        l2Var = new n2();
                    } else {
                        l2Var = new l2();
                    }
                    b.LIZ(33554433, l2Var);
                    b.LIZ(50331649, new o2());
                    b.LIZ(67108865, new z1());
                    j.LIZ();
                    C0V90.LIZ();
                    k.a(16777219, 0, 0L, null, context2);
                    LIZ = true;
                } else {
                    throw new RuntimeException((String) k.a(16777217, 0, 0L, "58e184", new byte[]{9, 9, 53, 74, 9, 55, 51, 1, 32, 73, 43, 54, 18, 64, 21, 99, 53, 22, 58, 117, 33, 34, 2, 5, 14, 48, 118, 23, 59, 117, 100, 27, 6, 85, 11, 42, 53, 24, 32, 104, 43, 52}));
                }
            }
        }
    }

    public static synchronized boolean LIZJ(Context context, c0 c0Var) {
        String str;
        if (context != null) {
            if (c0Var != null) {
                String str2 = c0Var.LIZ;
                if (str2 != null && str2.length() > 0) {
                    str = c0Var.LIZ;
                } else {
                    str = c0Var.LJI;
                }
                if (str != null && str.length() > 0) {
                    LIZIZ(context, "metasec_ov");
                    if (((ConcurrentHashMap) LIZIZ).containsKey(str)) {
                        return false;
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c0.LIZ(c0Var.LIZ));
                    jSONArray.put(c0.LIZ(c0Var.LJII));
                    jSONArray.put(c0.LIZ(c0Var.LJI));
                    jSONArray.put(c0.LIZ(c0Var.LJIIIIZZ));
                    jSONArray.put(c0.LIZ(a3.LIZ));
                    jSONArray.put(c0.LIZ(c0Var.LIZIZ));
                    jSONArray.put(c0.LIZ(c0Var.LIZJ));
                    jSONArray.put(c0.LIZ(c0Var.LIZLLL));
                    jSONArray.put(c0.LIZ(c0Var.LJ));
                    jSONArray.put(c0.LIZ(c0Var.LJFF));
                    jSONArray.put(String.valueOf(c0Var.LJIIIZ));
                    jSONArray.put(String.valueOf(c0Var.LJIIJ));
                    jSONArray.put(String.valueOf(c0Var.LJIIJJI));
                    JSONArray jSONArray2 = new JSONArray();
                    for (Map.Entry entry : ((HashMap) c0Var.LJIIL).entrySet()) {
                        if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                            jSONArray2.put(c0.LIZ(entry.getKey()));
                            jSONArray2.put(c0.LIZ(entry.getValue()));
                        }
                    }
                    jSONArray.put(jSONArray2);
                    JSONArray jSONArray3 = new JSONArray();
                    for (Map.Entry entry2 : ((HashMap) c0Var.LJIILIIL).entrySet()) {
                        if (!TextUtils.isEmpty((CharSequence) entry2.getKey())) {
                            jSONArray3.put(c0.LIZ(entry2.getKey()));
                            jSONArray3.put(c0.LIZ(entry2.getValue()));
                        }
                    }
                    jSONArray.put(jSONArray3);
                    if (!((Boolean) k.a(67108865, 0, 0L, jSONArray.toString(), null)).booleanValue()) {
                        return false;
                    }
                    ((ConcurrentHashMap) LIZIZ).put(str, c0Var);
                    return true;
                }
                throw new NullPointerException("appID must be set");
            }
            throw new NullPointerException("config could not be null");
        }
        throw new NullPointerException("context could not be null");
    }
}
