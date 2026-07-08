package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadInfoOpt {
    public long duration;
    public long frameTimeStamp;
    public boolean hasAudio;
    public int height;
    public boolean isVideo;
    public boolean needFeature;
    public String path;
    public int rotation;
    public int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadInfoOpt(needFeature=");
        sbLIZ.append(this.needFeature);
        sbLIZ.append(", isVideo=");
        sbLIZ.append(this.isVideo);
        sbLIZ.append(", frameTimeStamp=");
        sbLIZ.append(this.frameTimeStamp);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", hasAudio=");
        sbLIZ.append(this.hasAudio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UploadInfoOpt() {
        this(false, false, 0L, 0L, "", 0, 0, 0, false);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFrameTimeStamp(long j) {
        this.frameTimeStamp = j;
    }

    public final void setHasAudio(boolean z) {
        this.hasAudio = z;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setNeedFeature(boolean z) {
        this.needFeature = z;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setRotation(int i) {
        this.rotation = i;
    }

    public final void setVideo(boolean z) {
        this.isVideo = z;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public UploadInfoOpt(boolean z, boolean z2, long j, long j2, String str, int i, int i2, int i3, boolean z3) {
        this.needFeature = z;
        this.isVideo = z2;
        this.frameTimeStamp = j;
        this.duration = j2;
        this.path = str;
        this.width = i;
        this.height = i2;
        this.rotation = i3;
        this.hasAudio = z3;
    }
}
