package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicInfo {

    @C09CT("author")
    public final String author;

    @C09CT("av_music")
    public final AVMusic avMusic;

    @C09CT("clip_id")
    public final String clipId;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("play_url")
    public final String playUrl;

    @C09CT("title")
    public final String title;

    public MusicInfo() {
        this("", "", "", "", "", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicInfo)) {
            return false;
        }
        MusicInfo musicInfo = (MusicInfo) obj;
        return Intrinsics.LJFF(this.clipId, musicInfo.clipId) && Intrinsics.LJFF(this.title, musicInfo.title) && Intrinsics.LJFF(this.author, musicInfo.author) && Intrinsics.LJFF(this.coverUrl, musicInfo.coverUrl) && Intrinsics.LJFF(this.playUrl, musicInfo.playUrl) && Intrinsics.LJFF(this.avMusic, musicInfo.avMusic);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.clipId.hashCode() * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31) + this.coverUrl.hashCode()) * 31) + this.playUrl.hashCode()) * 31;
        AVMusic aVMusic = this.avMusic;
        return iHashCode + (aVMusic == null ? 0 : aVMusic.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicInfo(clipId=");
        sbLIZ.append(this.clipId);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", playUrl=");
        sbLIZ.append(this.playUrl);
        sbLIZ.append(", avMusic=");
        sbLIZ.append(this.avMusic);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MusicInfo(String str, String str2, String str3, String str4, String str5, AVMusic aVMusic) {
        this.clipId = str;
        this.title = str2;
        this.author = str3;
        this.coverUrl = str4;
        this.playUrl = str5;
        this.avMusic = aVMusic;
    }
}
