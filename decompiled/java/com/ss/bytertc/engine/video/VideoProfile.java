package com.ss.bytertc.engine.video;

import android.util.SparseArray;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.data.RTCData;

/* JADX INFO: loaded from: classes19.dex */
public class VideoProfile {
    public static SparseArray<VideoPreset> sVideoProfileMap;

    static {
        SparseArray<VideoPreset> sparseArray = new SparseArray<>();
        sVideoProfileMap = sparseArray;
        sparseArray.put(0, new VideoPreset(160, 120, 15, 65));
        sVideoProfileMap.put(2, new VideoPreset(120, 120, 15, 50));
        sVideoProfileMap.put(10, new VideoPreset(320, 180, 15, 140));
        sVideoProfileMap.put(12, new VideoPreset(180, 180, 15, 100));
        sVideoProfileMap.put(13, new VideoPreset(240, 180, 15, 120));
        sVideoProfileMap.put(14, new VideoPreset(240, 180, 15, 240));
        sVideoProfileMap.put(20, new VideoPreset(320, 240, 15, 200));
        sVideoProfileMap.put(21, new VideoPreset(320, 240, 15, 360));
        sVideoProfileMap.put(22, new VideoPreset(240, 240, 15, 140));
        sVideoProfileMap.put(23, new VideoPreset(424, 240, 15, 220));
        sVideoProfileMap.put(30, new VideoPreset(640, 360, 15, 600));
        sVideoProfileMap.put(32, new VideoPreset(360, 360, 15, 260));
        sVideoProfileMap.put(33, new VideoPreset(640, 360, 30, 600));
        sVideoProfileMap.put(34, new VideoPreset(640, 360, 15, 800));
        sVideoProfileMap.put(35, new VideoPreset(360, 360, 30, 400));
        sVideoProfileMap.put(36, new VideoPreset(480, 360, 15, 320));
        sVideoProfileMap.put(37, new VideoPreset(480, 360, 30, 490));
        sVideoProfileMap.put(40, new VideoPreset(640, 480, 15, 500));
        sVideoProfileMap.put(42, new VideoPreset(480, 480, 15, 400));
        sVideoProfileMap.put(43, new VideoPreset(640, 480, 30, 750));
        sVideoProfileMap.put(45, new VideoPreset(480, 480, 30, 600));
        sVideoProfileMap.put(46, new VideoPreset(848, 480, 15, 1200));
        sVideoProfileMap.put(47, new VideoPreset(848, 480, 30, 800));
        sVideoProfileMap.put(48, new VideoPreset(848, 480, 30, 930));
        sVideoProfileMap.put(50, new VideoPreset(1280, 720, 15, 1130));
        sVideoProfileMap.put(52, new VideoPreset(1280, 720, 30, 1710));
        sVideoProfileMap.put(54, new VideoPreset(960, 720, 15, 910));
        sVideoProfileMap.put(55, new VideoPreset(960, 720, 30, 1380));
    }

    public static VideoPreset getVideoVideoPreset() {
        int iIntValue = 0;
        int iIntValue2 = 0;
        int i = 0;
        int i2 = 0;
        for (VideoStreamDescription videoStreamDescription : RTCData.instance().getVideoStreamDescriptions()) {
            if (((Integer) videoStreamDescription.videoSize.first).intValue() > iIntValue) {
                iIntValue = ((Integer) videoStreamDescription.videoSize.first).intValue();
            }
            if (((Integer) videoStreamDescription.videoSize.second).intValue() > iIntValue2) {
                iIntValue2 = ((Integer) videoStreamDescription.videoSize.second).intValue();
            }
            int i3 = videoStreamDescription.frameRate;
            if (i3 > i) {
                i = i3;
            }
            int i4 = videoStreamDescription.maxKbps;
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return new VideoPreset(iIntValue, iIntValue2, i, i2);
    }

    public static SparseArray<VideoPreset> getsVideoProfileMap() {
        return sVideoProfileMap;
    }

    public static VideoPreset getVideoVideoPresetById(int i) {
        VideoPreset videoPreset = sVideoProfileMap.get(i);
        if (videoPreset == null) {
            return sVideoProfileMap.get(33);
        }
        return videoPreset;
    }

    public static void addVideoVideoPreset(int i, VideoPreset videoPreset) {
        sVideoProfileMap.put(i, videoPreset);
    }
}
