package com.ss.android.vesdk;

import X.C1DOP;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensResults;
import com.ss.android.ttve.nativePort.TELensAlgorithm;

/* JADX INFO: loaded from: classes36.dex */
public class VELensAlgorithm {
    public TELensAlgorithm mLensHandle = new TELensAlgorithm();

    public int destroy() {
        return this.mLensHandle.LIZ();
    }

    public int init() {
        return this.mLensHandle.LIZJ();
    }

    public VEBaseLensResults getAlgorithmResults(VEBaseLensAlgorithmConfig vEBaseLensAlgorithmConfig, C1DOP c1dop) {
        VELensCallBacks vELensCallBacks = new VELensCallBacks();
        vELensCallBacks.setmLensStateListener(c1dop);
        return this.mLensHandle.LIZIZ(vEBaseLensAlgorithmConfig, vELensCallBacks);
    }
}
