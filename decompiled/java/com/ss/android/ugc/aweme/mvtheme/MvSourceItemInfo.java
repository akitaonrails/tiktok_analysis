package com.ss.android.ugc.aweme.mvtheme;

import X.C09CT;
import X.C538300L9g;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class MvSourceItemInfo implements Serializable {
    public static final C538300L9g Companion = new Object() { // from class: X.0L9g
    };

    @C09CT("duration")
    public long duration;

    @C09CT("height")
    public int height;

    @C09CT("mvItemCrop")
    public MvItemCrop mvItemCrop;

    @C09CT("photo_path")
    public final String photoPath;

    @C09CT("sourceStartTime")
    public long sourceStartTime;

    @C09CT("width")
    public int width;

    @C09CT("source")
    public String source = "";

    @C09CT("origin_file_path")
    public String originFilePath = "";

    @C09CT("type")
    public String type = "";

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    public final MvItemCrop getMvItemCrop() {
        return this.mvItemCrop;
    }

    public final String getOriginFilePath() {
        return this.originFilePath;
    }

    public final String getPhotoPath() {
        return this.photoPath;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getSourceStartTime() {
        return this.sourceStartTime;
    }

    public final String getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public MvSourceItemInfo(String str) {
        this.photoPath = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMvItemCrop(MvItemCrop mvItemCrop) {
        this.mvItemCrop = mvItemCrop;
    }

    public final void setOriginFilePath(String str) {
        this.originFilePath = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setSourceStartTime(long j) {
        this.sourceStartTime = j;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
