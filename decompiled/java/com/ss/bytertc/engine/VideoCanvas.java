package com.ss.bytertc.engine;

import X.C2188811AlT;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.ss.bytertc.engine.data.VideoRotation;

/* JADX INFO: loaded from: classes21.dex */
public class VideoCanvas {
    public int backgroundColor;
    public int renderMode;
    public VideoRotation renderRotation;
    public View renderView;

    public VideoCanvas() {
        this.renderMode = 1;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCanvas{, textureView=");
        sbLIZ.append(this.renderView);
        sbLIZ.append(", renderMode=");
        sbLIZ.append(this.renderMode);
        sbLIZ.append(", background_color=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", renderRotation=");
        sbLIZ.append(this.renderRotation.value());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoCanvas(SurfaceView surfaceView, int i) {
        this.renderView = surfaceView;
        this.renderMode = i;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public VideoCanvas(TextureView textureView, int i) {
        this.renderView = textureView;
        this.renderMode = i;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public VideoCanvas(SurfaceView surfaceView, int i, int i2) {
        this.renderView = surfaceView;
        this.renderMode = i;
        this.backgroundColor = i2;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }

    public VideoCanvas(TextureView textureView, int i, int i2) {
        this.renderView = textureView;
        this.renderMode = i;
        this.backgroundColor = i2;
        this.renderRotation = VideoRotation.VIDEO_ROTATION_0;
    }
}
