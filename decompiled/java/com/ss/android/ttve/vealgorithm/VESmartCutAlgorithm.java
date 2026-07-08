package com.ss.android.ttve.vealgorithm;

import com.ss.android.ttve.vealgorithm.params.VESmartCutResult;

/* JADX INFO: loaded from: classes28.dex */
public class VESmartCutAlgorithm extends VEAlgorithm {
    public VESmartCutResult getRandomResult() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return (VESmartCutResult) nativeAlgorithmGetRandomResult(j);
    }
}
