package com.ss.bytertc.engine.data;

import X.C2188811AlT;
import android.util.Pair;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class RTCData {
    public VideoEncoderConfiguration.OrientationMode mOrientationMode;
    public VideoStreamDescription[] videoStreamDescriptions = new VideoStreamDescription[1];

    public static class SingletonHelper {
        public static final RTCData INSTANCE = new RTCData();
    }

    public RTCData() {
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription();
        videoStreamDescription.videoSize = new Pair<>(640, 360);
        videoStreamDescription.frameRate = 20;
        videoStreamDescription.maxKbps = 600;
        this.videoStreamDescriptions[0] = videoStreamDescription;
        this.mOrientationMode = VideoEncoderConfiguration.OrientationMode.ORIENTATION_MODE_ADAPTIVE;
    }

    public static RTCData instance() {
        return SingletonHelper.INSTANCE;
    }

    public VideoEncoderConfiguration.OrientationMode getOrientationMode() {
        return this.mOrientationMode;
    }

    public VideoStreamDescription[] getVideoStreamDescriptions() {
        return this.videoStreamDescriptions;
    }

    public void setOrientationMode(VideoEncoderConfiguration.OrientationMode orientationMode) {
        this.mOrientationMode = orientationMode;
    }

    public void setVideoStreamDescriptions(VideoStreamDescription[] videoStreamDescriptionArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVideoStreamDescriptions: ");
        sbLIZ.append(Arrays.toString(videoStreamDescriptionArr));
        LogUtil.i("RTCData", C2188811AlT.LIZIZ(sbLIZ));
        this.videoStreamDescriptions = videoStreamDescriptionArr;
    }
}
