package com.bytedance.ttnet.diagnosis;

import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public class TTGameDiagnosisService {
    public static final String TAG = "TTGameDiagnosisService";
    public static volatile TTGameDiagnosisService sInstance = null;
    public IDiagnosisCallback mDiagnosisCallback = new IDiagnosisCallback() { // from class: X.0ot6
        @Override // com.bytedance.ttnet.diagnosis.IDiagnosisCallback
        public final void onDiagnosisComplete(String str) {
            Logger.debug();
        }
    };
    public volatile boolean mIsMonitoring;
    public IDiagnosisRequest mRequest;

    public void monitorEnd() {
        monitorEnd(null);
    }

    public static TTGameDiagnosisService inst() {
        if (sInstance == null) {
            synchronized (TTGameDiagnosisService.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TTGameDiagnosisService();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public boolean isMonitoring() {
        return this.mIsMonitoring;
    }

    public void doDiagnosisDuringGaming(String str) {
        synchronized (this) {
            try {
                if (!this.mIsMonitoring) {
                    return;
                }
                this.mRequest.doExtraCommand("diagnosis", str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void monitorEnd(String str) {
        synchronized (this) {
            try {
                if (!this.mIsMonitoring) {
                    return;
                }
                if (str != null) {
                    this.mRequest.doExtraCommand("extra_info", str);
                }
                this.mRequest.doExtraCommand("finish", "");
                this.mIsMonitoring = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void monitorBegin(String str, String str2) {
        synchronized (this) {
            try {
                if (this.mIsMonitoring) {
                    return;
                }
                IDiagnosisRequest iDiagnosisRequestCreateRequest = TTNetDiagnosisService.createRequest(4, str, 0, Integer.MAX_VALUE);
                this.mRequest = iDiagnosisRequestCreateRequest;
                iDiagnosisRequestCreateRequest.start(this.mDiagnosisCallback);
                this.mRequest.doExtraCommand("extra_info", str2);
                this.mIsMonitoring = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
