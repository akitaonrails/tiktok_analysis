package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoSectionModel extends MusicModel {
    public final int margin;

    public final VideoSectionModel copy(int i) {
        return new VideoSectionModel(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoSectionModel) && this.margin == ((VideoSectionModel) obj).margin;
    }

    public int hashCode() {
        return this.margin;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoSectionModel(margin=");
        sbLIZ.append(this.margin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getMargin() {
        return this.margin;
    }

    public VideoSectionModel(int i) {
        this.margin = i;
    }
}
