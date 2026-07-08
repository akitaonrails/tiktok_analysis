package com.ss.android.vesdk.runtime;

import X.C1305700k5A;
import X.C2188811AlT;
import X.C2484209oO;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

/* JADX INFO: loaded from: classes21.dex */
public class VEMem {
    public static VEMem sInstance;
    public boolean mEnableMemoryMode;
    public boolean mEnableUploadMemSize;
    public boolean mIsArm64v8a;
    public boolean mIsLocalTest;
    public int mTotalVirtualSize;
    public final int MEM_THRESHOLD = 500;
    public int mLowMemThreshold = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public boolean mFirstTimeEnterRecord = true;

    private native String nativeGetRuntimeMemoryInfo();

    public static VEMem getInstance() {
        if (sInstance == null) {
            synchronized (VEMem.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new VEMem();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public boolean inLowMemMode() {
        if (!this.mEnableMemoryMode) {
            C2484209oO.LJI("VEMem", "memory mode disabled");
            return false;
        }
        if (this.mIsArm64v8a) {
            C2484209oO.LJI("VEMem", "cpu_abi is arm64-v8a, virtual mem info is unnecessary");
            return false;
        }
        double virtualMemSize = ((double) this.mTotalVirtualSize) - getVirtualMemSize();
        if (virtualMemSize >= this.mLowMemThreshold) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("In low memory mode: free memory size = ");
        sbLIZ.append(virtualMemSize);
        sbLIZ.append(" threshold = ");
        sbLIZ.append(this.mLowMemThreshold);
        C2484209oO.LJIIIIZZ("VEMem", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    static {
        TENativeLibsLoader.loadBase();
        sInstance = null;
    }

    public VEMem() {
        this.mTotalVirtualSize = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        TENativeLibsLoader.loadBase();
        String str = Build.SUPPORTED_ABIS[0];
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cpu_abi = ");
        sbLIZ.append(str);
        C2484209oO.LJI("VEMem", C2188811AlT.LIZIZ(sbLIZ));
        if (str.equals("armeabi-v7a")) {
            this.mTotalVirtualSize = 3072;
            C2484209oO.LJI("VEMem", "set mTotalVirtualSize to 3072MB");
        }
        this.mIsArm64v8a = VERuntime.nativeIsArm64();
    }

    public String getRuntimeMemoryInfo() {
        return nativeGetRuntimeMemoryInfo();
    }

    public double getVirtualMemSize() {
        return VERuntime.nativeGetVirtualMemInfo();
    }

    public boolean isArm64() {
        return this.mIsArm64v8a;
    }

    public void setIsLocalTest(boolean z) {
        this.mIsLocalTest = z;
    }

    public void uploadVirtualMemSize(int i) {
        String str;
        if (!this.mEnableUploadMemSize) {
            C2484209oO.LJI("VEMem", "upload mem size is disabled");
            return;
        }
        if (this.mIsArm64v8a) {
            C2484209oO.LJI("VEMem", "cpu_abi is arm64-v8a, virtual mem info is unnecessary");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        double virtualMemSize = getVirtualMemSize();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get virtual mem size cost ");
        sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbLIZ.append("ms");
        C2484209oO.LJI("VEMem", C2188811AlT.LIZIZ(sbLIZ));
        if (virtualMemSize <= 0.0d) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = "";
                            } else {
                                str = "te_composition_leave_virtual_memory_size";
                                C1305700k5A.LIZ("te_composition_leave_virtual_memory_size", virtualMemSize);
                            }
                        } else {
                            str = "te_composition_enter_virtual_memory_size";
                            C1305700k5A.LIZ("te_composition_enter_virtual_memory_size", virtualMemSize);
                        }
                    } else {
                        str = "te_edit_leave_virtual_memory_size";
                        C1305700k5A.LIZ("te_edit_leave_virtual_memory_size", virtualMemSize);
                    }
                } else {
                    str = "te_edit_enter_virtual_memory_size";
                    C1305700k5A.LIZ("te_edit_enter_virtual_memory_size", virtualMemSize);
                }
            } else {
                str = "te_record_leave_virtual_memory_size";
                C1305700k5A.LIZ("te_record_leave_virtual_memory_size", virtualMemSize);
            }
        } else {
            str = "te_record_enter_virtual_memory_size";
            C1305700k5A.LIZ("te_record_enter_virtual_memory_size", virtualMemSize);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(" virtual mem size ");
        sbLIZ2.append(virtualMemSize);
        sbLIZ2.append("MB");
        C2484209oO.LJI("VEMem", C2188811AlT.LIZIZ(sbLIZ2));
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("upload virtual mem size cost ");
        sbLIZ3.append(jCurrentTimeMillis3 - jCurrentTimeMillis2);
        C2484209oO.LJI("VEMem", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
