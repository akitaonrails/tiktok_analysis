package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareMusicListResponse extends BaseResponse implements Serializable {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("music")
    public final List<Music> musics;

    @C09CT("new_release_musics")
    public final List<Music> newReleaseMusics;

    @C09CT("presave_album_infos")
    public final List<PresaveAlbumInfo> presaveAlbumInfos;

    public BulletinShareMusicListResponse() {
        this(null, null, null, null, null);
    }

    public final BulletinShareMusicListResponse copy(Integer num, Boolean bool, List<? extends Music> list, List<? extends Music> list2, List<PresaveAlbumInfo> list3) {
        return new BulletinShareMusicListResponse(num, bool, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinShareMusicListResponse)) {
            return false;
        }
        BulletinShareMusicListResponse bulletinShareMusicListResponse = (BulletinShareMusicListResponse) obj;
        return Intrinsics.LJFF(this.cursor, bulletinShareMusicListResponse.cursor) && Intrinsics.LJFF(this.hasMore, bulletinShareMusicListResponse.hasMore) && Intrinsics.LJFF(this.newReleaseMusics, bulletinShareMusicListResponse.newReleaseMusics) && Intrinsics.LJFF(this.musics, bulletinShareMusicListResponse.musics) && Intrinsics.LJFF(this.presaveAlbumInfos, bulletinShareMusicListResponse.presaveAlbumInfos);
    }

    public int hashCode() {
        Integer num = this.cursor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Music> list = this.newReleaseMusics;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Music> list2 = this.musics;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PresaveAlbumInfo> list3 = this.presaveAlbumInfos;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinShareMusicListResponse(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", newReleaseMusics=");
        sbLIZ.append(this.newReleaseMusics);
        sbLIZ.append(", musics=");
        sbLIZ.append(this.musics);
        sbLIZ.append(", presaveAlbumInfos=");
        sbLIZ.append(this.presaveAlbumInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Music> getMusics() {
        return this.musics;
    }

    public final List<Music> getNewReleaseMusics() {
        return this.newReleaseMusics;
    }

    public final List<PresaveAlbumInfo> getPresaveAlbumInfos() {
        return this.presaveAlbumInfos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinShareMusicListResponse(Integer num, Boolean bool, List<? extends Music> list, List<? extends Music> list2, List<PresaveAlbumInfo> list3) {
        this.cursor = num;
        this.hasMore = bool;
        this.newReleaseMusics = list;
        this.musics = list2;
        this.presaveAlbumInfos = list3;
    }
}
