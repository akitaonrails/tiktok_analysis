package com.ss.ttlivestreamer.livestreamv2.strategy;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class SimulcastConfig {

    @C09CT("effect_fps")
    public int effectFps = 15;

    @C09CT("res_cap_height")
    public int captureHeight = 1280;

    @C09CT("res_cap_width")
    public int captureWidth = 720;

    @C09CT("mode")
    public String mode = "single";

    @C09CT("default_index")
    public int defaultIndex = -1;

    @C09CT("config")
    public List<StreamConfig> streamConfigs = new ArrayList();

    public static final class StreamConfig {

        @C09CT("res_effect_height")
        public int effectHeight = 1280;

        @C09CT("res_effect_width")
        public int effectWidth = 720;

        @C09CT("name")
        public String name = "default";

        @C09CT("fps")
        public int fps = 15;

        @C09CT("height")
        public int encodeHeight = 1280;

        @C09CT("width")
        public int encodeWidth = 720;

        @C09CT("bitrate_kbps")
        public int bitrate = 800;

        @C09CT("bitrate_kbps_1_2")
        public int bitrate_1_2 = -1;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreamConfig{effectHeight=");
            sbLIZ.append(this.effectHeight);
            sbLIZ.append(", effectWidth=");
            sbLIZ.append(this.effectWidth);
            sbLIZ.append(", name='");
            sbLIZ.append(this.name);
            sbLIZ.append('\'');
            sbLIZ.append(", fps=");
            sbLIZ.append(this.fps);
            sbLIZ.append(", encodeHeight=");
            sbLIZ.append(this.encodeHeight);
            sbLIZ.append(", encodeWidth=");
            sbLIZ.append(this.encodeWidth);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final String toString() {
        String strLIZIZ = "";
        for (StreamConfig streamConfig : this.streamConfigs) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(streamConfig);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ2);
            sbLIZ2.append(",");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("SimulcastConfig{effectFps=");
        sbLIZ3.append(this.effectFps);
        sbLIZ3.append(", captureHeight=");
        sbLIZ3.append(this.captureHeight);
        sbLIZ3.append(", captureWidth=");
        sbLIZ3.append(this.captureWidth);
        sbLIZ3.append(", mode='");
        sbLIZ3.append(this.mode);
        sbLIZ3.append('\'');
        sbLIZ3.append(", streamConfigs=");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append('}');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }
}
