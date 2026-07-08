package com.bytedance.crash;

import X.C0VX9;
import X.C0VXF;
import X.C801930Vd1;
import X.C802090VdH;
import X.C802410Vdn;
import X.C802680VeE;
import X.C802790VeP;
import X.RunnableC801900Vcy;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MonitorCrash {
    public final Config mConfig = new Config(this);
    public final C802680VeE mCrashListener;

    public C802410Vdn getUserDataCenter() {
        return this.mCrashListener.LIZJ;
    }

    public Config config() {
        return this.mConfig;
    }

    public class Config {
        public final MonitorCrash mMonitorCrash;

        public Config setChannel(String str) {
            this.mMonitorCrash.setChannel(str);
            return this;
        }

        public Config setDeviceId(String str) {
            this.mMonitorCrash.setDeviceId(str);
            return this;
        }

        public Config setPackageName(String str) {
            this.mMonitorCrash.setPackageName(str);
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mMonitorCrash.setSoList(strArr);
            return this;
        }

        public Config setUID(long j) {
            this.mMonitorCrash.setUserId(j);
            return this;
        }

        public Config(MonitorCrash monitorCrash) {
            this.mMonitorCrash = monitorCrash;
        }
    }

    public MonitorCrash(C802680VeE c802680VeE) {
        this.mCrashListener = c802680VeE;
    }

    public void setChannel(String str) {
        this.mCrashListener.LJIIJJI(str);
    }

    public void setDeviceId(String str) {
        this.mCrashListener.LJIIL(str);
    }

    public void setPackageName(String str) {
        C802680VeE c802680VeE = this.mCrashListener;
        if (c802680VeE instanceof C802090VdH) {
            c802680VeE.getClass();
        }
    }

    public void setSoList(String[] strArr) {
        C802680VeE c802680VeE = this.mCrashListener;
        if (c802680VeE instanceof C802090VdH) {
            c802680VeE.getClass();
        }
    }

    public void setUserId(long j) {
        this.mCrashListener.LJIILLIIL(j);
    }

    public void reportCustomErr(String str, Throwable th) {
        this.mCrashListener.LJ().LJIIJ(str, th);
    }

    public void reportCustomErr(String str, String str2, Throwable th) {
        this.mCrashListener.LJ().LJIIJ(str, th);
    }

    public static MonitorCrash init(Context context, String str, long j, String str2) {
        return initApp(context, str, j, str2);
    }

    public static MonitorCrash initApp(Context context, String str, long j, String str2) {
        C802790VeP c802790VeP;
        C0VX9.LJIIIIZZ(context);
        synchronized (C802790VeP.class) {
            try {
                c802790VeP = k.LIZ;
                if (c802790VeP == null) {
                    C802790VeP c802790VeP2 = new C802790VeP(str, str2, j);
                    k.LIZ = c802790VeP2;
                    RunnableC801900Vcy runnableC801900Vcy = k.LIZIZ;
                    if (runnableC801900Vcy != null) {
                        runnableC801900Vcy.LLILZ = c802790VeP2;
                    }
                    C801930Vd1.LIZIZ(context, C0VX9.LJFF());
                    C0VXF.post(new ARunnableS113S0100000_13(c802790VeP2, 61));
                    c802790VeP = k.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return new MonitorCrash(c802790VeP);
    }

    public void reportEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.mCrashListener.LJIIJ(str, i, jSONObject, jSONObject2);
    }

    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3) {
        return initSDK(context, str, j, str2, str3, null);
    }

    public static MonitorCrash initSDK(Context context, final String str, final long j, final String str2, String str3, String[] strArr) {
        C0VX9.LJIIIIZZ(context);
        C802680VeE c802680VeE = new C802680VeE(str, str2, j) { // from class: X.0VdH
        };
        C801930Vd1.LIZIZ(context, C0VX9.LJFF());
        C0VXF.post(new ARunnableS113S0100000_13(c802680VeE, 62));
        return new MonitorCrash(c802680VeE);
    }
}
