package com.ss.lyrax.video;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoEncoderProfile {
    public LyraxVideoCodecMode codecMode;
    public LyraxVideoCodecType codecType;
    public VideoDegradeLevels degradeLevels;
    public LyraxVideoEnableBFrame enbleBframe;
    public LyraxVideoEncoderPreference encodePreference;
    public Boolean forceUserCodec;
    public int frameRate;
    public Integer gopSize;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public List<LyraxBitRateTable> minBitrateTables;
    public List<LyraxVideoResolutionConfig> resolutionBase;
    public int startBitrate;
    public int width;

    public static class VideoDegradeLevels {
        public List<LyraxVideoDegradeConfig> perf = new ArrayList();

        /* JADX INFO: renamed from: net, reason: collision with root package name */
        public List<LyraxVideoDegradeConfig> f441net = new ArrayList();
    }

    public LyraxVideoEnableBFrame getEnableBFrame() {
        LyraxVideoEnableBFrame lyraxVideoEnableBFrame = this.enbleBframe;
        return lyraxVideoEnableBFrame == null ? LyraxVideoEnableBFrame.AUTO : lyraxVideoEnableBFrame;
    }

    public int getForceUserCodec() {
        Boolean bool = this.forceUserCodec;
        if (bool == null) {
            return -1;
        }
        return bool.booleanValue() ? 1 : 0;
    }

    public int getGopSize() {
        Integer num = this.gopSize;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public List<LyraxVideoDegradeConfig> getNetDegradeLevel() {
        VideoDegradeLevels videoDegradeLevels = this.degradeLevels;
        if (videoDegradeLevels != null) {
            return videoDegradeLevels.f441net;
        }
        return null;
    }

    public List<LyraxVideoDegradeConfig> getPerfDegradeLevel() {
        VideoDegradeLevels videoDegradeLevels = this.degradeLevels;
        if (videoDegradeLevels != null) {
            return videoDegradeLevels.perf;
        }
        return null;
    }

    public LyraxVideoEncoderProfile() {
        this.maxBitrate = -1;
        this.encodePreference = LyraxVideoEncoderPreference.MAINTAIN_FRAMERATE;
        this.codecType = LyraxVideoCodecType.AUTO;
        this.codecMode = LyraxVideoCodecMode.AUTO;
    }

    public LyraxVideoCodecMode getCodecMode() {
        return this.codecMode;
    }

    public LyraxVideoCodecType getCodecType() {
        return this.codecType;
    }

    public LyraxVideoEncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxKBps() {
        return this.maxBitrate;
    }

    public List<LyraxBitRateTable> getMinBitRateTables() {
        return this.minBitrateTables;
    }

    public int getMinKBps() {
        return this.minBitrate;
    }

    public List<LyraxVideoResolutionConfig> getResolutionBase() {
        return this.resolutionBase;
    }

    public int getStartKBps() {
        return this.startBitrate;
    }

    public int getWidth() {
        return this.width;
    }

    public LyraxVideoEncoderProfile(int i, int i2, int i3, int i4, int i5, int i6, LyraxVideoEncoderPreference lyraxVideoEncoderPreference, LyraxVideoCodecType lyraxVideoCodecType, LyraxVideoCodecMode lyraxVideoCodecMode, LyraxVideoEnableBFrame lyraxVideoEnableBFrame, Integer num, Boolean bool, List<LyraxBitRateTable> list, VideoDegradeLevels videoDegradeLevels, List<LyraxVideoResolutionConfig> list2) {
        this.maxBitrate = -1;
        this.encodePreference = LyraxVideoEncoderPreference.MAINTAIN_FRAMERATE;
        this.codecType = LyraxVideoCodecType.AUTO;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.startBitrate = i4;
        this.maxBitrate = i5;
        this.minBitrate = i6;
        this.encodePreference = lyraxVideoEncoderPreference;
        this.codecType = lyraxVideoCodecType;
        this.codecMode = lyraxVideoCodecMode;
        this.enbleBframe = lyraxVideoEnableBFrame;
        this.gopSize = num;
        this.forceUserCodec = bool;
        if (list != null) {
            this.minBitrateTables = list;
        }
        if (videoDegradeLevels != null) {
            this.degradeLevels = videoDegradeLevels;
        }
        if (list2 != null) {
            this.resolutionBase = list2;
        }
    }
}
