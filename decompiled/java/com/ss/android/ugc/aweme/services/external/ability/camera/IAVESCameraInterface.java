package com.ss.android.ugc.aweme.services.external.ability.camera;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public interface IAVESCameraInterface {
    public static final int[] CameraHWLevelVE2Android = {2, 0, 1, 3};
    public static final int[] CameraHWLevelAndroid2VE = {1, 2, 0, 3};

    public static class CameraErrorCode {
    }

    public enum CameraRatio {
        RATIO_18x9,
        RATIO_16x9,
        RATIO_4x3;

        public static CameraRatio valueOf(String str) {
            return (CameraRatio) C08FF.LIZ(CameraRatio.class, str);
        }
    }
}
