package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishImageLivePhotoModel {
    public final float duration;
    public final int height;
    public final String path;
    public String vid;
    public final String waterMarkPath;
    public final int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishImageLivePhotoModel(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", vid=");
        sbLIZ.append(this.vid);
        sbLIZ.append(", waterMarkPath=");
        sbLIZ.append(this.waterMarkPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setVid(String str) {
        this.vid = str;
    }

    public PublishImageLivePhotoModel(String str, int i, int i2, float f, String str2, String str3) {
        this.path = str;
        this.width = i;
        this.height = i2;
        this.duration = f;
        this.vid = str2;
        this.waterMarkPath = str3;
    }
}
