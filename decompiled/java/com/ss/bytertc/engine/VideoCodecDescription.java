package com.ss.bytertc.engine;

import X.C2188811AlT;
import com.ss.bytertc.engine.data.VideoCodecMode;
import com.ss.bytertc.engine.data.VideoCodecType;

/* JADX INFO: loaded from: classes19.dex */
public class VideoCodecDescription {
    public VideoCodecMode codec_mode;
    public VideoCodecType codec_type;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"codec_type:\"");
        sbLIZ.append(this.codec_type.value());
        sbLIZ.append(", \"codec_mode\":");
        sbLIZ.append(this.codec_mode.value());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoCodecDescription(int i, int i2) {
        this.codec_type = VideoCodecType.VIDEO_CODEC_TYPE_UNKNOWN;
        this.codec_mode = VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
        this.codec_type = VideoCodecType.fromId(i);
        this.codec_mode = VideoCodecMode.fromId(i2);
    }

    public static VideoCodecDescription create(int i, int i2) {
        return new VideoCodecDescription(i, i2);
    }
}
