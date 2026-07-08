package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoMusicModel extends MusicModel {
    public final Aweme aweme;
    public final MusicModel musicModel;

    public final VideoMusicModel copy(Aweme aweme, MusicModel musicModel) {
        return new VideoMusicModel(aweme, musicModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMusicModel)) {
            return false;
        }
        VideoMusicModel videoMusicModel = (VideoMusicModel) obj;
        return Intrinsics.LJFF(this.aweme, videoMusicModel.aweme) && Intrinsics.LJFF(this.musicModel, videoMusicModel.musicModel);
    }

    public int hashCode() {
        return (this.aweme.hashCode() * 31) + this.musicModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMusicModel(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", musicModel=");
        sbLIZ.append(this.musicModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public VideoMusicModel(Aweme aweme, MusicModel musicModel) {
        this.aweme = aweme;
        this.musicModel = musicModel;
    }
}
