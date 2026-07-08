package com.ss.android.ttve.vealgorithm.params;

/* JADX INFO: loaded from: classes28.dex */
public class VELensOneKeyHdrResult extends VEAlgorithmResult {
    public static int SCENE_MODE_CASE_ABNORMAL = 20003;
    public static int SCENE_MODE_CASE_COMMON = 20001;
    public static int SCENE_MODE_CASE_NIGHT = 20004;
    public static int SCENE_MODE_CASE_WITH_NOISE = 20002;
    public int scene;

    public VELensOneKeyHdrResult() {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_ONE_KEY_HDR;
    }

    public VELensOneKeyHdrResult(int i) {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_ONE_KEY_HDR;
        this.scene = i;
    }
}
