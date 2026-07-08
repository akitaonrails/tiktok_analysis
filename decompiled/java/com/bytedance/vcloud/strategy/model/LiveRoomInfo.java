package com.bytedance.vcloud.strategy.model;

import X.C08FF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class LiveRoomInfo {
    public String generatedSessionId;
    public LiveStreamData liveStreamData;
    public String mStartUpGearName;
    public JSONObject mStartUpStrategyLog;
    public LiveStatus mStatus;
    public boolean isMainLevel = true;
    public final Object mLock = new Object();

    public LiveStatus getLiveStatus() {
        LiveStatus liveStatus;
        synchronized (this.mLock) {
            try {
                liveStatus = this.mStatus;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return liveStatus;
    }

    public String getStartUpGearName() {
        String str;
        synchronized (this.mLock) {
            try {
                str = this.mStartUpGearName;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    public JSONObject getStartUpStrategyLog() {
        JSONObject jSONObject;
        synchronized (this.mLock) {
            try {
                jSONObject = this.mStartUpStrategyLog;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum LiveStatus {
        IDLE,
        PreIO;

        public static LiveStatus valueOf(String str) {
            return (LiveStatus) C08FF.LIZ(LiveStatus.class, str);
        }
    }

    public void setLiveStatus(LiveStatus liveStatus) {
        synchronized (this.mLock) {
            try {
                this.mStatus = liveStatus;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setStartUpGearName(String str) {
        synchronized (this.mLock) {
            try {
                this.mStartUpGearName = str;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setStartUpStrategyLog(JSONObject jSONObject) {
        synchronized (this.mLock) {
            try {
                this.mStartUpStrategyLog = jSONObject;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
