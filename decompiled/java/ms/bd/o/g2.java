package ms.bd.o;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import ms.bd.o.h2;
import ms.bd.o.t2.b;

/* JADX INFO: loaded from: classes4.dex */
public final class g2 implements h2.a {
    public final long LIZ;
    public final Context LIZIZ;
    public final c0 LIZJ;

    public g2(c0 c0Var, Context context, long j) {
        if (context == null) {
            throw new NullPointerException("context could not be null");
        }
        this.LIZJ = c0Var;
        this.LIZIZ = C786410Ut5.N3(context);
        this.LIZ = j;
    }

    @Override // ms.bd.o.h2.a
    public final void LIZ(int i) {
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554441, i, j, null, null);
        }
    }

    @Override // ms.bd.o.h2.a
    public final void LIZIZ(String str) {
        this.LIZJ.LJFF = str;
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554436, 0, j, str, this.LIZIZ);
        }
    }

    @Override // ms.bd.o.h2.a
    public final void LIZJ(String str) {
        ((HashMap) this.LIZJ.LJIILIIL).put("ms_settings_android", str);
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554443, 0, j, "ms_settings_android", str);
        }
    }

    @Override // ms.bd.o.h2.a
    public final void LIZLLL(int i) {
        int size;
        t2 t2VarLIZ = t2.LIZ(a.LIZIZ.LIZ);
        t2VarLIZ.getClass();
        try {
            if (((ReentrantLock) t2VarLIZ.LIZIZ).tryLock() && (size = t2VarLIZ.LIZ.size()) < t2.LJFF) {
                LinkedList<String> linkedList = t2VarLIZ.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append((String) k.a(16777217, 0, 0L, "034faa", new byte[]{109}));
                sbLIZ.append(i);
                linkedList.add(C2188811AlT.LIZIZ(sbLIZ));
                if (size % 3 == 0) {
                    t2VarLIZ.LIZLLL.execute(t2VarLIZ.new b());
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        t2VarLIZ.LIZJ();
    }

    @Override // ms.bd.o.h2.a
    public final void report(String str) {
        if (this.LIZ != -1 && !TextUtils.isEmpty(str)) {
            k.a(33554433, 0, this.LIZ, str, this.LIZIZ);
        }
    }

    @Override // ms.bd.o.h2.a
    public final void setDeviceID(String str) {
        this.LIZJ.LIZJ = str;
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554434, 0, j, str, this.LIZIZ);
        }
    }

    @Override // ms.bd.o.h2.a
    public final void setInstallID(String str) {
        this.LIZJ.LJ = str;
        long j = this.LIZ;
        if (j != -1) {
            k.a(33554435, 0, j, str, this.LIZIZ);
        }
    }

    @Override // ms.bd.o.h2.a
    public final Map<String, String> frameSign(String str, int i) {
        if (this.LIZ != -1) {
            HashMap map = new HashMap();
            if (str != null && str.length() != 0) {
                String[] strArr = (String[]) k.a(33554442, i, this.LIZ, str, null);
                if ((strArr instanceof String[]) && strArr.length % 2 == 0) {
                    for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                        String str2 = strArr[i2];
                        String str3 = strArr[i2 + 1];
                        if (str2 != null && str3 != null) {
                            map.put(str2, str3);
                        }
                    }
                }
                return map;
            }
            return Collections.emptyMap();
        }
        return Collections.emptyMap();
    }
}
