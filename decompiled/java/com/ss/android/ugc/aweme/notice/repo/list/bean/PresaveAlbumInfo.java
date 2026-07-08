package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class PresaveAlbumInfo implements Serializable {

    @C09CT("meta_album_id")
    public final String albumId;

    @C09CT("meta_album_title")
    public final String albumTitle;

    @C09CT("artist_name")
    public final String artistName;

    @C09CT("available_dsp_platforms")
    public final List<Integer> availableDspPlatform;

    @C09CT("background_image")
    public final String backgroundImage;

    @C09CT("end_time")
    public final Long endTime;

    @C09CT("schema")
    public final String schema;

    public PresaveAlbumInfo() {
        this(null, null, null, null, null, null, null);
    }

    public PresaveAlbumInfo(String str, String str2, String str3, String str4, Long l, String str5, List<Integer> list) {
        this.albumId = str;
        this.albumTitle = str2;
        this.schema = str3;
        this.backgroundImage = str4;
        this.endTime = l;
        this.artistName = str5;
        this.availableDspPlatform = list;
    }
}
