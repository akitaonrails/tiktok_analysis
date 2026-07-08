package com.ss.bytertc.engine;

import X.C2188811AlT;
import com.ss.bytertc.engine.data.VideoRotation;

/* JADX INFO: loaded from: classes21.dex */
public class RemoteVideoRenderConfig {
    public int backgroundColor;
    public int renderMode = 1;
    public VideoRotation renderRotation = VideoRotation.VIDEO_ROTATION_0;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteVideoRenderConfig{, renderMode=");
        sbLIZ.append(this.renderMode);
        sbLIZ.append(", background_color=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", renderRotation=");
        sbLIZ.append(this.renderRotation.value());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
