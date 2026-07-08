package com.bytedance.crash.monitor;

import X.C0VXF;
import X.C0VXT;
import X.C1173804iW;
import X.C786410Ut5;
import X.C799500VXw;
import X.C801970Vd5;
import X.C802410Vdn;
import X.C803540Vfc;
import X.RunnableC801900Vcy;
import X.RunnableC801960Vd4;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class f {
    public C801970Vd5 LIZ;
    public RunnableC801900Vcy LIZIZ;
    public final C802410Vdn LIZJ;
    public volatile String LIZLLL;
    public volatile long LJ;
    public volatile String LJFF;
    public volatile String LJI;
    public volatile String LJII;
    public volatile long LJIIIIZZ;
    public volatile long LJIIIZ;
    public volatile long LJIIJ;
    public C799500VXw LJIIJJI;

    public Map<String, Object> LIZJ() {
        return null;
    }

    public RunnableC801900Vcy LJ() {
        if (this.LIZIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZIZ == null) {
                        this.LIZIZ = new RunnableC801900Vcy(this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }

    public C803540Vfc LJII() {
        return new C803540Vfc(this.LJIIIIZZ, this.LJIIJ, 0L, this.LJII);
    }

    public String LIZ() {
        return this.LIZLLL;
    }

    public String LIZIZ() {
        return this.LJI;
    }

    public long LJFF() {
        return this.LJIIJ;
    }

    public long LJI() {
        return this.LJ;
    }

    public long LJIIIIZZ() {
        return this.LJIIIIZZ;
    }

    public String LJIIIZ() {
        return this.LJII;
    }

    public f(C802410Vdn c802410Vdn) {
        this.LIZJ = c802410Vdn;
    }

    public String LIZLLL(String str) {
        if (TextUtils.isEmpty(this.LJFF)) {
            return str;
        }
        return this.LJFF;
    }

    public void LJIIJJI(String str) {
        this.LJI = "release";
    }

    public void LJIIL(String str) {
        this.LJFF = str;
    }

    public f(String str, String str2, long j, long j2) {
        this(new C802410Vdn(), str, str2, j, j2);
    }

    public final void LJIIJ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = new C801970Vd5(this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C801970Vd5 c801970Vd5 = this.LIZ;
        c801970Vd5.getClass();
        if (!TextUtils.isEmpty(str)) {
            if (c801970Vd5.LIZ == null && C801970Vd5.LJII.get() > 100) {
                return;
            }
            C1173804iW c1173804iW = c801970Vd5.LIZ;
            if (c1173804iW != null && !c1173804iW.LIZ(str)) {
                return;
            }
            C0VXT c0vxt = new C0VXT(C786410Ut5.u3().getName(), System.currentTimeMillis(), str, i, jSONObject, jSONObject2);
            if (c801970Vd5.LIZ == null) {
                c801970Vd5.LIZJ.add(c0vxt);
                C801970Vd5.LJII.addAndGet(1);
            } else {
                c801970Vd5.LIZIZ.add(c0vxt);
                C801970Vd5.LJI.addAndGet(1);
            }
            if (C801970Vd5.LJIIIIZZ) {
                return;
            }
            RunnableC801960Vd4 runnableC801960Vd4 = RunnableC801960Vd4.LLILLJJLI;
            if (runnableC801960Vd4.LL) {
                return;
            }
            runnableC801960Vd4.LL = true;
            C801970Vd5.LJIIIIZZ = true;
            C0VXF.removeCallbacks(runnableC801960Vd4);
            C0VXF.postDelayed(runnableC801960Vd4, 30000L);
        }
    }

    public f(C802410Vdn c802410Vdn, String str, String str2, long j, long j2) {
        this.LIZLLL = str;
        this.LJII = str2;
        this.LJIIIIZZ = j;
        this.LJIIIZ = 0L;
        this.LJIIJ = j2;
        this.LIZJ = c802410Vdn;
    }
}
