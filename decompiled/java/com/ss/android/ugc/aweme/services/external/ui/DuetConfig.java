package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class DuetConfig {
    public Serializable author;
    public String duetChallenge;
    public String duetFrom;
    public Integer duetGameScore;
    public Effect duetLayout;
    public int duetVideoHeight;
    public int duetVideoWidth;
    public final int height;
    public final boolean isFromDuetButton;
    public StickerDownloadConfig mStickerDownloadConfig;
    public int minDuration;
    public String mp4Path;
    public String originVideo;
    public final int originVideoAIGCLabelType;
    public String outputDir;
    public float srcLoudness;
    public final String thumbnailUrl;
    public String wavPath;
    public final int width;

    public static final class Builder {
        public DuetConfig config;

        public Builder() {
            this.config = new DuetConfig("", "", "", new Serializable() { // from class: com.ss.android.ugc.aweme.services.external.ui.DuetConfig.Builder.1
            }, "", 0, false, 0, null, 0, 0);
        }

        public final DuetConfig build() {
            return this.config;
        }

        public Builder(DuetConfig duetConfig) {
            this.config = duetConfig;
        }

        public final Builder author(Serializable serializable) {
            this.config.setAuthor(serializable);
            return this;
        }

        public final Builder duetFrom(String str) {
            this.config.setDuetFrom(str);
            return this;
        }

        public final Builder minDuration(int i) {
            this.config.setMinDuration(i);
            return this;
        }

        public final Builder mp4Path(String str) {
            this.config.setMp4Path(str);
            return this;
        }

        public final Builder originalVideo(String str) {
            this.config.setOriginVideo(str);
            return this;
        }

        public final Builder outputDir(String str) {
            this.config.setOutputDir(str);
            return this;
        }

        public final Builder wavPath(String str) {
            this.config.setWavPath(str);
            return this;
        }
    }

    public final String getOutputDir() {
        String str = this.outputDir;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final Serializable getAuthor() {
        return this.author;
    }

    public final String getDuetChallenge() {
        return this.duetChallenge;
    }

    public final String getDuetFrom() {
        return this.duetFrom;
    }

    public final Integer getDuetGameScore() {
        return this.duetGameScore;
    }

    public final Effect getDuetLayout() {
        return this.duetLayout;
    }

    public final int getDuetVideoHeight() {
        return this.duetVideoHeight;
    }

    public final int getDuetVideoWidth() {
        return this.duetVideoWidth;
    }

    public final int getHeight() {
        return this.height;
    }

    public final StickerDownloadConfig getMStickerDownloadConfig() {
        return this.mStickerDownloadConfig;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final int getOriginVideoAIGCLabelType() {
        return this.originVideoAIGCLabelType;
    }

    public final float getSrcLoudness() {
        return this.srcLoudness;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isFromDuetButton() {
        return this.isFromDuetButton;
    }

    public final void setAuthor(Serializable serializable) {
        this.author = serializable;
    }

    public final void setDuetChallenge(String str) {
        this.duetChallenge = str;
    }

    public final void setDuetFrom(String str) {
        this.duetFrom = str;
    }

    public final void setDuetGameScore(Integer num) {
        this.duetGameScore = num;
    }

    public final void setDuetLayout(Effect effect) {
        this.duetLayout = effect;
    }

    public final void setDuetVideoHeight(int i) {
        this.duetVideoHeight = i;
    }

    public final void setDuetVideoWidth(int i) {
        this.duetVideoWidth = i;
    }

    public final void setMStickerDownloadConfig(StickerDownloadConfig stickerDownloadConfig) {
        this.mStickerDownloadConfig = stickerDownloadConfig;
    }

    public final void setMinDuration(int i) {
        this.minDuration = i;
    }

    public final void setMp4Path(String str) {
        this.mp4Path = str;
    }

    public final void setOriginVideo(String str) {
        this.originVideo = str;
    }

    public final void setOutputDir(String str) {
        this.outputDir = str;
    }

    public final void setSrcLoudness(float f) {
        this.srcLoudness = f;
    }

    public final void setWavPath(String str) {
        this.wavPath = str;
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i) {
        this(str, str2, str3, serializable, str4, i, false, 0, null, 0, 0);
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z) {
        this(str, str2, str3, serializable, str4, i, z, 0, null, 0, 0);
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z, int i2) {
        this(str, str2, str3, serializable, str4, i, z, i2, null, 0, 0);
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z, int i2, String str5) {
        this(str, str2, str3, serializable, str4, i, z, i2, str5, 0, 0);
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z, int i2, String str5, int i3) {
        this(str, str2, str3, serializable, str4, i, z, i2, str5, i3, 0);
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z, int i2, String str5, int i3, int i4) {
        this.originVideo = str;
        this.mp4Path = str2;
        this.wavPath = str3;
        this.author = serializable;
        this.duetFrom = str4;
        this.minDuration = i;
        this.isFromDuetButton = z;
        this.originVideoAIGCLabelType = i2;
        this.thumbnailUrl = str5;
        this.width = i3;
        this.height = i4;
        this.duetGameScore = 0;
        this.srcLoudness = Float.MIN_VALUE;
    }
}
