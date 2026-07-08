package com.ss.lyrax.augur;

import X.C786410Ut5;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.lyrax.engine.AugurStatusCallback;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.utils.LyraxNativeCleaner;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AugurImpl implements IAugur {
    public int ERROR;
    public int INITED;
    public int UN_INITED;
    public long augurCommandHandle;
    public long augurHandle;
    public boolean augurValidFlag;
    public final ReentrantReadWriteLock.ReadLock mJniReadLock;
    public final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    public final ReentrantReadWriteLock mReadWriteLock;
    public volatile int mStatus;

    public static native long nativeCreateAugur(AugurOption augurOption);

    public static native void nativeDestroyAugur(long j);

    public static native long nativeGetDestroyAugur();

    public static native long nativeRegisterCommand(long j, IAugurCommand iAugurCommand, LyraxScene lyraxScene);

    public static native void nativeRunStrategyGraphOnce(long j);

    public static native void nativeSetConfigRequester(long j, long j2);

    public static native void nativeStartAugur(long j);

    public static native void nativeStopAugur(long j);

    public static native long nativeUnregisterCommand(long j, long j2, String str);

    public static native void nativeUpdateBooleanFeature(long j, String str, boolean z);

    public static native void nativeUpdateConfig(long j, String str, AugurConfigExtraInfo augurConfigExtraInfo);

    public static native void nativeUpdateConfigAsync(long j, String str, AugurConfigExtraInfo augurConfigExtraInfo);

    public static native void nativeUpdateDoubleFeature(long j, String str, double d);

    public static native void nativeUpdateFloatFeature(long j, String str, float f);

    public static native void nativeUpdateIntFeature(long j, String str, int i);

    public static native void nativeUpdateJSONFeature(long j, String str, String str2);

    public static native void nativeUpdateLongFeature(long j, String str, long j2);

    public static native void nativeUpdateStringFeature(long j, String str, String str2);

    public boolean augurInvalid() {
        return this.augurHandle == 0 || !this.augurValidFlag;
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void destroy() {
        this.mJniWriteLock.lock();
        long j = this.augurHandle;
        this.augurValidFlag = false;
        this.augurCommandHandle = 0L;
        this.mJniWriteLock.unlock();
        nativeDestroyAugur(j);
    }

    public void finalize() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT < 33) {
                LyraxNativeCleaner.nativeApplyFreeFunction(nativeGetDestroyAugur(), this.augurHandle);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public boolean isAugurInited() {
        return this.mStatus == this.INITED;
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void runStrategyGraphOnce() {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature JSONArray failed.");
                this.mJniReadLock.unlock();
            } else {
                LogUtil.e("AugurImpl", "lzctest runStrategyGraphOnce.");
                nativeRunStrategyGraphOnce(this.augurHandle);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void start() {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, start failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeStartAugur(this.augurHandle);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void stop() {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, stop failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeStopAugur(this.augurHandle);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur, com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.augurHandle;
    }

    public AugurImpl(AugurOption augurOption) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mStatus = 0;
        this.UN_INITED = 0;
        this.INITED = 1;
        this.ERROR = 2;
        augurOption.statusCallback = new AugurStatusCallback() { // from class: com.ss.lyrax.augur.AugurImpl.1
            @Override // com.ss.lyrax.engine.AugurStatusCallback
            public void onStatusChanged(int i, String str) {
                AugurImpl.this.mStatus = i;
            }
        };
        long jNativeCreateAugur = nativeCreateAugur(augurOption);
        this.augurHandle = jNativeCreateAugur;
        if (jNativeCreateAugur != 0) {
            this.augurValidFlag = true;
            LyraxNativeCleaner.register(this, jNativeCreateAugur, nativeGetDestroyAugur());
            return;
        }
        throw new IllegalStateException("Failed to create Augur");
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void setConfigRequester(long j) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, setConfigRequester failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeSetConfigRequester(this.augurHandle, j);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public long unregisterCommand(String str) {
        this.mJniWriteLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, unregisterCommand failed.");
            } else {
                long j = this.augurCommandHandle;
                if (j == 0) {
                    LogUtil.e("AugurImpl", "native augur command handle is invalid, unregisterCommand failed.");
                } else {
                    this.augurCommandHandle = 0L;
                    long jNativeUnregisterCommand = nativeUnregisterCommand(this.augurHandle, j, str);
                    this.mJniWriteLock.unlock();
                    return jNativeUnregisterCommand;
                }
            }
            this.mJniWriteLock.unlock();
            return 0L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeatures(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Integer) {
                nativeUpdateIntFeature(this.augurHandle, entry.getKey(), ((Integer) entry.getValue()).intValue());
            } else if (entry.getValue() instanceof String) {
                nativeUpdateStringFeature(this.augurHandle, entry.getKey(), (String) entry.getValue());
            } else if (entry.getValue() instanceof Float) {
                nativeUpdateFloatFeature(this.augurHandle, entry.getKey(), ((Float) entry.getValue()).floatValue());
            } else if (entry.getValue() instanceof Double) {
                nativeUpdateDoubleFeature(this.augurHandle, entry.getKey(), ((Double) entry.getValue()).doubleValue());
            } else if (entry.getValue() instanceof Long) {
                nativeUpdateLongFeature(this.augurHandle, entry.getKey(), ((Long) entry.getValue()).longValue());
            } else if ((entry.getValue() instanceof JSONArray) || (entry.getValue() instanceof JSONObject)) {
                nativeUpdateJSONFeature(this.augurHandle, entry.getKey(), entry.getValue().toString());
            }
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public long registerCommand(IAugurCommand iAugurCommand, LyraxScene lyraxScene) {
        this.mJniWriteLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, registerCommand failed.");
                this.mJniWriteLock.unlock();
                return 0L;
            }
            long jNativeRegisterCommand = nativeRegisterCommand(this.augurHandle, iAugurCommand, lyraxScene);
            this.augurCommandHandle = jNativeRegisterCommand;
            this.mJniWriteLock.unlock();
            return jNativeRegisterCommand;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateConfig(String str, AugurConfigExtraInfo augurConfigExtraInfo) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateConfig failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateConfig(this.augurHandle, str, augurConfigExtraInfo);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateConfigAsync(String str, AugurConfigExtraInfo augurConfigExtraInfo) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateConfig failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateConfigAsync(this.augurHandle, str, augurConfigExtraInfo);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature JSONArray failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateJSONFeature(this.augurHandle, str, jSONArray.toString());
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature JSONObject failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateJSONFeature(this.augurHandle, str, C786410Ut5.J3(jSONObject));
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, double d) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature Double failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateDoubleFeature(this.augurHandle, str, d);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, float f) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature Float failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateFloatFeature(this.augurHandle, str, f);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, int i) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature Int failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateIntFeature(this.augurHandle, str, i);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, long j) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature Long failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateLongFeature(this.augurHandle, str, j);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, String str2) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature String failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateStringFeature(this.augurHandle, str, str2);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.ss.lyrax.augur.IAugur
    public void updateFeature(String str, boolean z) {
        this.mJniReadLock.lock();
        try {
            if (augurInvalid()) {
                LogUtil.e("AugurImpl", "native augur is invalid, updateFeature Boolean failed.");
                this.mJniReadLock.unlock();
            } else {
                nativeUpdateBooleanFeature(this.augurHandle, str, z);
                this.mJniReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mJniReadLock.unlock();
            throw th;
        }
    }
}
