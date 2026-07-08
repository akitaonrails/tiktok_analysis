package com.bytedance.android.livesdk.live.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public class Camera2AB {

    @C09CT("camera_hw_level")
    public int cameraHWLevel;

    @C09CT("camera_type")
    public int cameraType;

    public Camera2AB() {
        this.cameraType = 1;
    }

    public int getCameraHWLevel() {
        return this.cameraHWLevel;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public void setCameraHWLevel(int i) {
        this.cameraHWLevel = i;
    }

    public void setCameraType(int i) {
        this.cameraType = i;
    }

    public Camera2AB(int i, int i2) {
        this.cameraType = i;
        this.cameraHWLevel = i2;
    }
}
