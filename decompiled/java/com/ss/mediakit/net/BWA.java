package com.ss.mediakit.net;

import X.C1476650oWt;
import X.C1476660oWu;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.BwaResult;
import com.ss.videoarch.liveio.LiveIOManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class BWA implements BwaResult.BwaResultCallback {
    public static volatile BWA mInstance;
    public Map<String, BwaResult.BwaResultCallback> mBwaResultCallbackMap = new HashMap();
    public volatile boolean liveInitialized = false;
    public final Object liveInitLock = new Object();

    public static BWA getInstance() {
        if (mInstance == null) {
            synchronized (BWA.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new BWA();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public void init() {
        if (this.liveInitialized) {
            return;
        }
        synchronized (this.liveInitLock) {
            try {
                if (!this.liveInitialized) {
                    C1476650oWt c1476650oWt = C1476660oWu.LIZ;
                    BWA bwa = mInstance;
                    if (c1476650oWt.LIZJ) {
                        LiveIOManager.getInstance().addBwaResultCallback(bwa, "MIOCoreBWA");
                    }
                    this.liveInitialized = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public BwaResult getBwaResult(String str) {
        if (this.liveInitialized) {
            return LiveIOManager.getInstance().getBwaResult(str);
        }
        return new BwaResult();
    }

    @Override // com.ss.mediakit.net.BwaResult.BwaResultCallback
    public void onBwaResultChanged(BwaResult bwaResult) {
        if (bwaResult == null) {
            AVMDLLog.w("MIO-BWA", "onBwaResultChanged with null result");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBwaResultChanged, and new result is ");
        sbLIZ.append(bwaResult.toString());
        AVMDLLog.i("MIO-BWA", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mBwaResultCallbackMap) {
            try {
                for (BwaResult.BwaResultCallback bwaResultCallback : this.mBwaResultCallbackMap.values()) {
                    if (bwaResultCallback != null) {
                        bwaResultCallback.onBwaResultChanged(bwaResult);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void removeBwaResultCallback(String str) {
        if (str == null) {
            return;
        }
        synchronized (this.mBwaResultCallbackMap) {
            try {
                this.mBwaResultCallbackMap.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void addBwaResultCallback(BwaResult.BwaResultCallback bwaResultCallback, String str) {
        if (bwaResultCallback != null && str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addBwaResultCallback for ");
            sbLIZ.append(str);
            AVMDLLog.i("MIO-BWA", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (this.mBwaResultCallbackMap) {
                try {
                    this.mBwaResultCallbackMap.put(str, bwaResultCallback);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
