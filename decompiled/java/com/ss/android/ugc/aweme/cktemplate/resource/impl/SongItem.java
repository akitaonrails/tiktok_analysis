package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SongItem {

    @C09CT("album")
    public final String album;

    @C09CT("author")
    public final String author;

    @C09CT("duration")
    public final int duration;

    @C09CT("FullSongUrls")
    public final List<String> fullSongUrls;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT(alternate = {"song_uri"}, value = "songUri")
    public final String songUri;

    @C09CT(alternate = {"source_uri"}, value = "sourceUri")
    public final String sourceUri;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("title")
    public final String title;

    public SongItem() {
        this(0L, null, null, null, null, null, 0, 0, null, 511, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SongItem)) {
            return false;
        }
        SongItem songItem = (SongItem) obj;
        return this.id == songItem.id && Intrinsics.LJFF(this.title, songItem.title) && Intrinsics.LJFF(this.author, songItem.author) && Intrinsics.LJFF(this.album, songItem.album) && Intrinsics.LJFF(this.songUri, songItem.songUri) && Intrinsics.LJFF(this.sourceUri, songItem.sourceUri) && this.status == songItem.status && this.duration == songItem.duration && Intrinsics.LJFF(this.fullSongUrls, songItem.fullSongUrls);
    }

    public int hashCode() {
        return (((((((((((((((C786410Ut5.Y2(this.id) * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31) + this.album.hashCode()) * 31) + this.songUri.hashCode()) * 31) + this.sourceUri.hashCode()) * 31) + this.status) * 31) + this.duration) * 31) + this.fullSongUrls.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SongItem(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", album=");
        sbLIZ.append(this.album);
        sbLIZ.append(", songUri=");
        sbLIZ.append(this.songUri);
        sbLIZ.append(", sourceUri=");
        sbLIZ.append(this.sourceUri);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", fullSongUrls=");
        sbLIZ.append(this.fullSongUrls);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SongItem(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, List<String> list) {
        this.id = j;
        this.title = str;
        this.author = str2;
        this.album = str3;
        this.songUri = str4;
        this.sourceUri = str5;
        this.status = i;
        this.duration = i2;
        this.fullSongUrls = list;
    }

    public SongItem(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) == 0 ? str5 : "", (i3 & 64) != 0 ? 0 : i, (i3 & 128) == 0 ? i2 : 0, (i3 & 256) != 0 ? C13BV.INSTANCE : list);
    }
}
