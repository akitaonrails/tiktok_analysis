package com.tiktok.ttm;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.action.TTMAppLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMCore {
    public static final TTMCore sInstance = new TTMCore();
    public volatile boolean isInited;
    public volatile Config mConfig;

    public static class Config {
        public boolean crashDumpEnable;
        public boolean debugModeEnable;
        public boolean enableTTMInstanceRelease;
        public boolean globalEnable;
        public boolean isLocalTest;
        public String machineWorkDir;
        public MetricReporter metricReporter;
        public boolean monitorRuleRunException;
        public int multiInstCacheDefaultSize;
        public boolean multiInstCacheEnable;
        public int multiInstCacheMaxSize;
        public boolean reportEnable;
        public SendAppLog sendAppLog;
        public int timeStaticConfig;
        public boolean openJniCallOptimize = true;
        public int ttmHostStaticCacheSize = -1;
        public int coreBuriedSamplingRate = 100;
        public int generalBuriedSamplingRate = LSPassThroughRecordSizeConfig.DEFAULT;
        public boolean setCheckStateMnStateReentrancy = true;
        public boolean openExtTransformTTMObj = true;
        public boolean openTTMMemoryPool = true;
        public long TTMMemorySmallPoolSize = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        public long TTMMemoryBigPoolSize = 2097152;
        public long TTMMemorySmallMaxCacheSize = 50;
        public long TTMMemoryBigMaxCacheSize = 10;
        public boolean setFixMemLeakFree = true;
    }

    public interface MetricReporter {
        void report(String str, String str2);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public interface SendAppLog {
        void sendAppLog(String str, JSONObject jSONObject);
    }

    public boolean isEnable() {
        return isInit() && this.mConfig != null && this.mConfig.globalEnable;
    }

    public void prepareAsNeeded() {
        if (isEnable()) {
            JNIHelper.prepareAsNeeded();
        }
    }

    public static TTMCore getInstance() {
        return sInstance;
    }

    public boolean isInit() {
        return this.isInited;
    }

    private long generateCommonCfg(Config config) {
        long j;
        long j2 = 0;
        if (config == null) {
            return 0L;
        }
        if (config.globalEnable) {
            j2 = 1;
        }
        int i = config.timeStaticConfig;
        if (i == 1) {
            j = 4;
        } else if (i == 2) {
            j = 8;
        } else {
            j = 2;
        }
        long j3 = j2 | j;
        if (config.reportEnable) {
            j3 |= 16;
        }
        if (config.multiInstCacheEnable) {
            j3 |= 32;
        }
        if (config.openJniCallOptimize) {
            j3 |= 64;
        }
        if (config.monitorRuleRunException) {
            j3 |= 128;
        }
        if (config.isLocalTest) {
            j3 |= 256;
        }
        if (config.setCheckStateMnStateReentrancy) {
            j3 |= 512;
        }
        if (config.openExtTransformTTMObj) {
            j3 |= 1024;
        }
        if (config.openTTMMemoryPool) {
            j3 |= 2048;
        }
        if (config.setFixMemLeakFree) {
            j3 |= 4096;
        }
        if (config.enableTTMInstanceRelease) {
            return j3 | 8192;
        }
        return j3;
    }

    private int generateMutilInstCfg(Config config) {
        if (config.multiInstCacheEnable) {
            return (config.multiInstCacheDefaultSize & 255) | ((config.multiInstCacheMaxSize & 255) << 8);
        }
        return 0;
    }

    private long generateSampleRate(Config config) {
        return (((long) config.coreBuriedSamplingRate) << 32) | ((long) config.generalBuriedSamplingRate);
    }

    private long[] makeTTMConfig(Config config) {
        return new long[]{generateCommonCfg(config), generateMutilInstCfg(config), generateSampleRate(config), config.ttmHostStaticCacheSize, config.TTMMemorySmallPoolSize, config.TTMMemorySmallMaxCacheSize, config.TTMMemoryBigPoolSize, config.TTMMemoryBigMaxCacheSize};
    }

    public String dump(long j) {
        if (!isEnable()) {
            return "null";
        }
        if (!this.mConfig.crashDumpEnable) {
            return "d-null";
        }
        return JNIHelper.dumpInfo(j);
    }

    public TTMOutput execute(TTMInput tTMInput) {
        TTMOutput tTMOutput = new TTMOutput();
        tTMOutput.type = TTMOutput.ReturnType.ERROR;
        tTMOutput.msg = "ttm not init ";
        if (!isEnable()) {
            return tTMOutput;
        }
        long j = tTMInput.machineCodeAddress;
        if (j != 0) {
            JNIHelper.execute(tTMInput.paramData, tTMInput.paramType.typeVal, tTMInput.nativeParamAddress, j, tTMInput.extendedFunc, tTMOutput, tTMInput.ttmContext);
            return tTMOutput;
        }
        byte[] bArr = tTMInput.machineCodeByte;
        if (bArr != null) {
            JNIHelper.execute(tTMInput.paramData, tTMInput.paramType.typeVal, tTMInput.nativeParamAddress, bArr, bArr.length, tTMInput.extendedFunc, tTMOutput, tTMInput.ttmContext);
            return tTMOutput;
        }
        String str = tTMInput.machineCode;
        if (str != null) {
            JNIHelper.execute(tTMInput.paramData, tTMInput.paramType.typeVal, tTMInput.nativeParamAddress, str, tTMInput.extendedFunc, tTMOutput, tTMInput.ttmContext);
            return tTMOutput;
        }
        tTMOutput.msg = "ttm machine rule is null";
        return tTMOutput;
    }

    public void initTTM(Config config) {
        if (this.isInited) {
            return;
        }
        synchronized (this) {
            try {
                if (this.isInited) {
                    return;
                }
                System.loadLibrary("TTMachineCore");
                if (config.machineWorkDir == null) {
                    return;
                }
                TTMAppLog.initAppLogCallBack(config.sendAppLog);
                this.mConfig = config;
                long[] jArrMakeTTMConfig = makeTTMConfig(config);
                JNIHelper.init(jArrMakeTTMConfig, jArrMakeTTMConfig.length, config.machineWorkDir);
                this.isInited = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean registerExternPlatformExtendFunAddress(long j) {
        if (isEnable() && j != 0) {
            return JNIHelper.registerExtendFuncAddress(j);
        }
        return false;
    }

    public void releaseTTMRuleByteCode(long j) {
        if (!isEnable()) {
            return;
        }
        JNIHelper.releaseTTMRuleByteCode(j);
    }

    public static class JNIHelper {
        public static native String dumpInfo(long j);

        public static native void execute(TTMParamData tTMParamData, int i, long j, long j2, long j3, TTMOutput tTMOutput, TTMContext tTMContext);

        public static native void execute(TTMParamData tTMParamData, int i, long j, String str, long j2, TTMOutput tTMOutput, TTMContext tTMContext);

        public static native void execute(TTMParamData tTMParamData, int i, long j, byte[] bArr, int i2, long j2, TTMOutput tTMOutput, TTMContext tTMContext);

        public static native void init(long[] jArr, int i, String str);

        public static native long parseTTMRuleByteCode(String str, long j);

        public static native long parseTTMRuleByteCode(byte[] bArr, long j, long j2);

        public static native void prepareAsNeeded();

        public static native byte[] processTTMRuleByteCode(String str, long j);

        public static native boolean registerExtendFuncAddress(long j);

        public static native void releaseTTMRuleByteCode(long j);

        public static void reportMetric(String str, String str2) {
            TTMCore.getInstance().reportMetric(str, str2);
        }
    }

    public long parseTTMRuleByteCode(byte[] bArr, long j) {
        if (!isEnable()) {
            return 0L;
        }
        return JNIHelper.parseTTMRuleByteCode(bArr, bArr.length, j);
    }

    public byte[] processTTMRuleByteCode(String str, long j) {
        if (!isEnable()) {
            return null;
        }
        return JNIHelper.processTTMRuleByteCode(str, j);
    }

    public void reportMetric(String str, String str2) {
        try {
            if (this.mConfig.metricReporter != null) {
                this.mConfig.metricReporter.report(str, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public long parseTTMRuleByteCode(String str, long j) {
        if (!isEnable()) {
            return 0L;
        }
        return JNIHelper.parseTTMRuleByteCode(str, j);
    }
}
