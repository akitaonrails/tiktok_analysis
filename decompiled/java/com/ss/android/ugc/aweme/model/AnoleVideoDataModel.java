package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleVideoDataModel implements Serializable {

    @C09CT("height")
    public final int height;

    @C09CT("video_length")
    public final Integer videoLength;

    @C09CT("video_url")
    public final String videoUrl;

    @C09CT("width")
    public final int width;

    public final int getHeight() {
        return this.height;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public AnoleVideoDataModel(String str, Integer num, int i, int i2) {
        this.videoUrl = str;
        this.videoLength = num;
        this.width = i;
        this.height = i2;
    }
}
