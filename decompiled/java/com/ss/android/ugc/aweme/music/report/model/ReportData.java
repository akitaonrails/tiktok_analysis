package com.ss.android.ugc.aweme.music.report.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes10.dex */
public final class ReportData {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("extra")
    public final ExtraData extraParams;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("matched_song_id")
    public final String matchedSongId;

    @C09CT("meta_album_id")
    public final String metaAlbumId;

    @C09CT("music_id")
    public final String musicId;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    public ReportData(int i, int i2, String str, String str2, String str3, ExtraData extraData, String str4) {
        this.actionType = i;
        this.scene = i2;
        this.itemId = str;
        this.musicId = str2;
        this.matchedSongId = str3;
        this.extraParams = extraData;
        this.metaAlbumId = str4;
    }
}
