package com.ss.android.ttve.vealgorithm;

import X.C2188811AlT;
import X.C2484209oO;
import X.InterfaceC1782340wTw;
import X.InterfaceC1782350wTx;
import X.InterfaceC1782360wTy;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmParam;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmResult;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmType;
import com.ss.android.vesdk.algorithm.VECommAlgoInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes28.dex */
public class VEAlgorithm {
    public InterfaceC1782360wTy commAlgInfoListener;
    public InterfaceC1782340wTw mErrorListener;
    public long mHandle;
    public InterfaceC1782350wTx mListener;

    public native int nativeAlgorithmCancel(long j);

    public native long nativeAlgorithmCreate(Object obj);

    public native int nativeAlgorithmDestroy(long j);

    public native Object nativeAlgorithmGetRandomResult(long j);

    public native Object nativeAlgorithmGetResult(long j);

    public native int nativeAlgorithmStart(long j);

    public void nativeCallback_onCommonInfo(int i, HashMap<String, VECommAlgoInfo> map) {
    }

    public void nativeCallback_onError(int i, String str) {
    }

    public void nativeCallback_onProcess(float f, boolean z) {
    }

    public native int nativeupdateAlgorithmParam(long j, Object obj);

    public void setCommAlgInfoListener(InterfaceC1782360wTy interfaceC1782360wTy) {
    }

    public void setErrorListener(InterfaceC1782340wTw interfaceC1782340wTw) {
    }

    public void setProcessListener(InterfaceC1782350wTx interfaceC1782350wTx) {
    }

    public int cancel() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeAlgorithmCancel(j);
    }

    public int destroy() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        int iNativeAlgorithmDestroy = nativeAlgorithmDestroy(j);
        this.mHandle = 0L;
        return iNativeAlgorithmDestroy;
    }

    public void finalize() {
        if (this.mHandle != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not destroy algorithm object:");
            sbLIZ.append(this.mHandle);
            C2484209oO.LIZJ("VEAlgorithm", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public VEAlgorithmResult getResult() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return (VEAlgorithmResult) nativeAlgorithmGetResult(j);
    }

    public int start() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeAlgorithmStart(j);
    }

    public int init(VEAlgorithmParam vEAlgorithmParam) {
        int i = vEAlgorithmParam.type;
        if (i == VEAlgorithmType.VE_ALGORITHM_TYPE_INVALID) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid algorithm type:");
            sbLIZ.append(i);
            C2484209oO.LIZJ("VEAlgorithm", C2188811AlT.LIZIZ(sbLIZ));
            return -100;
        }
        long jNativeAlgorithmCreate = nativeAlgorithmCreate(vEAlgorithmParam);
        this.mHandle = jNativeAlgorithmCreate;
        if (jNativeAlgorithmCreate == 0) {
            C2484209oO.LIZJ("VEAlgorithm", "nativeAlgorithmCreate failed!");
            return -1;
        }
        return 0;
    }

    public int updateParams(VEAlgorithmParam vEAlgorithmParam) {
        int i = vEAlgorithmParam.type;
        if (i == VEAlgorithmType.VE_ALGORITHM_TYPE_INVALID) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid algorithm type:");
            sbLIZ.append(i);
            C2484209oO.LIZJ("VEAlgorithm", C2188811AlT.LIZIZ(sbLIZ));
            return -100;
        }
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        int iNativeupdateAlgorithmParam = nativeupdateAlgorithmParam(j, vEAlgorithmParam);
        if (iNativeupdateAlgorithmParam != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("nativeupdateAlgorithmParam failed! ret: ");
            sbLIZ2.append(iNativeupdateAlgorithmParam);
            C2484209oO.LIZJ("VEAlgorithm", C2188811AlT.LIZIZ(sbLIZ2));
            return iNativeupdateAlgorithmParam;
        }
        return 0;
    }
}
