package com.ss.android.ttve.nativePort;

import X.C2477309nH;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;
import com.ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults;
import com.ss.android.ttve.lensAlgorithm.videoStable.VEVideoStabConfig;
import com.ss.android.vesdk.VELensCallBacks;

/* JADX INFO: loaded from: classes36.dex */
public class TELensAlgorithm {
    public long LIZ;

    private native long nativeCreateLensEngine();

    private native int nativeDestroyLensEngine(long j);

    private native VELensVideoStabResults nativeGetVideoStabResult(long j, Object obj, VEVideoStabConfig vEVideoStabConfig);

    public final synchronized int LIZ() {
        long j = this.LIZ;
        if (j <= 0) {
            return -112;
        }
        int iNativeDestroyLensEngine = nativeDestroyLensEngine(j);
        this.LIZ = 0L;
        return iNativeDestroyLensEngine;
    }

    public final synchronized int LIZJ() {
        if (this.LIZ > 0) {
            C2477309nH.LIZ("TELensAlgorithm");
        }
        long jNativeCreateLensEngine = nativeCreateLensEngine();
        this.LIZ = jNativeCreateLensEngine;
        return jNativeCreateLensEngine <= 0 ? -112 : 0;
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public final VELensVideoStabResults LIZIZ(VEBaseLensAlgorithmConfig vEBaseLensAlgorithmConfig, VELensCallBacks vELensCallBacks) {
        long j = this.LIZ;
        if (j <= 0 || vEBaseLensAlgorithmConfig.algorithmFlag != 16) {
            return null;
        }
        return nativeGetVideoStabResult(j, vELensCallBacks, (VEVideoStabConfig) vEBaseLensAlgorithmConfig);
    }
}
