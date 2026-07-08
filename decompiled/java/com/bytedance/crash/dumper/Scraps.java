package com.bytedance.crash.dumper;

import X.C08P5;
import X.C0VJB;
import X.C0VSJ;
import X.C0VX9;
import X.C0WZX;
import X.C2204961BRm;
import X.C2411009ca;
import X.C786410Ut5;
import X.C801930Vd1;
import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Scraps implements Serializable {
    public static final long serialVersionUID = 1;
    public int mBatteryLevel;
    public boolean mIsMiniApp;
    public int mMiniAppId;
    public String mMiniAppVersion;
    public long mSdcardFreeSize;
    public long mSdcardTotalSize;
    public long mStorageFreeSize;
    public long mStorageTotalSize;

    private void dumpMiniApp() {
        if (!C801930Vd1.LIZ) {
            this.mIsMiniApp = false;
            return;
        }
        this.mIsMiniApp = true;
        this.mMiniAppId = C801930Vd1.LIZIZ;
        this.mMiniAppVersion = C801930Vd1.LIZJ;
    }

    private void dumpBattery() {
        this.mBatteryLevel = C2411009ca.LIZ().LIZ;
    }

    private void dumpStorage() {
        long jLLIIII;
        String strX3;
        long jLLFFF;
        StatFs statFs;
        long jLLIFFJFJJ;
        Context contextLJ = C0VX9.LJ();
        long j = 0;
        if (contextLJ != null) {
            try {
                jLLIIII = C2204961BRm.LLIIII(new StatFs(C08P5.LIZ(contextLJ).getPath()), new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbRgSvwe7c4g==", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                jLLIIII = 0;
            }
        } else {
            jLLIIII = 0;
        }
        this.mStorageTotalSize = jLLIIII;
        this.mStorageFreeSize = C08P5.LIZJ();
        try {
            strX3 = C786410Ut5.X3();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            strX3 = null;
        }
        if (TextUtils.equals(strX3, "mounted")) {
            try {
                statFs = new StatFs(C786410Ut5.W3().getAbsolutePath());
                jLLFFF = C2204961BRm.LLFFF(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbRgSvwe7c4g==", null));
            } catch (Throwable th3) {
                th = th3;
                jLLFFF = 0;
            }
            try {
                jLLIFFJFJJ = C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbRgSvwe7c4g==", null)) * C2204961BRm.LLFZ(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbRgSvwe7c4g==", null));
                j = jLLFFF;
            } catch (Throwable th4) {
                th = th4;
                TryCatchGuardChecker.doCheck(th);
            }
        } else {
            jLLIFFJFJJ = 0;
        }
        jLLFFF = j;
        j = jLLIFFJFJJ;
        Pair pair = new Pair(Long.valueOf(j), Long.valueOf(jLLFFF));
        this.mSdcardTotalSize = ((Long) pair.first).longValue();
        this.mSdcardFreeSize = ((Long) pair.second).longValue();
    }

    public static void dump(File file) {
        Scraps scraps = new Scraps();
        scraps.dumpMiniApp();
        scraps.dumpStorage();
        scraps.dumpBattery();
        C0VJB.LIZIZ(new C0VSJ(file, "scraps.inf"), scraps);
    }

    private void loadBattery(JSONObject jSONObject) {
        try {
            jSONObject.put("battery", this.mBatteryLevel);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private void loadStorage(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("sdcard_total", this.mSdcardTotalSize);
            jSONObject2.put("sdcard_free", this.mSdcardFreeSize);
            jSONObject2.put("inner_free", C08P5.LIZIZ(this.mStorageFreeSize));
            jSONObject2.put("inner_total", C08P5.LIZIZ(this.mStorageTotalSize));
            jSONObject2.put("inner_free_real", this.mStorageFreeSize);
            jSONObject2.put("inner_total_real", this.mStorageTotalSize);
            jSONObject2.put("unit", 1);
            jSONObject.put("storage", jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void pushTo(JSONObject jSONObject) {
        pushTo(jSONObject, null);
    }

    public void loadMiniApp(JSONObject jSONObject) {
        try {
            if (this.mIsMiniApp) {
                jSONObject.put("is_mp", 1);
                jSONObject.put("miniapp_id", this.mMiniAppId);
                jSONObject.put("miniapp_version", this.mMiniAppVersion);
                return;
            }
            jSONObject.put("miniapp_id", 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void pushTo(JSONObject jSONObject, File file) {
        Scraps scraps;
        if (file == null || (scraps = (Scraps) C0VJB.LIZ(new C0VSJ(file, "scraps.inf"))) == null) {
            scraps = new Scraps();
            scraps.dumpMiniApp();
            scraps.dumpStorage();
            scraps.dumpBattery();
        }
        scraps.loadMiniApp(jSONObject);
        scraps.loadStorage(jSONObject);
        scraps.loadBattery(jSONObject);
    }
}
