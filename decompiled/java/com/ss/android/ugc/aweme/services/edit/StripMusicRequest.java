package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class StripMusicRequest {
    public static final Companion Companion = new Companion();

    @C09CT("new_music_info")
    public EditMusicStruct editMusicStruct;

    @C09CT("biz_extra")
    public String extra;

    @C09CT("item_id")
    public String itemID = "";

    @C09CT("multi_music_edit_info")
    public MultiMusicEditStruct multiMusicEditInfo;

    @C09CT("music_edit_scene")
    public Integer musicEditScene;

    @C09CT("original_audio_track")
    public OriginalAudioTrack originalAudioTrack;

    @C09CT("original_vid")
    public String originalVid;
    public transient boolean stripAudioExist;

    @C09CT("version")
    public Integer version;

    public static final class Companion {
    }

    public final EditMusicStruct getEditMusicStruct() {
        return this.editMusicStruct;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getItemID() {
        return this.itemID;
    }

    public final MultiMusicEditStruct getMultiMusicEditInfo() {
        return this.multiMusicEditInfo;
    }

    public final Integer getMusicEditScene() {
        return this.musicEditScene;
    }

    public final OriginalAudioTrack getOriginalAudioTrack() {
        return this.originalAudioTrack;
    }

    public final String getOriginalVid() {
        return this.originalVid;
    }

    public final boolean getStripAudioExist() {
        return this.stripAudioExist;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final void setEditMusicStruct(EditMusicStruct editMusicStruct) {
        this.editMusicStruct = editMusicStruct;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setItemID(String str) {
        this.itemID = str;
    }

    public final void setMultiMusicEditInfo(MultiMusicEditStruct multiMusicEditStruct) {
        this.multiMusicEditInfo = multiMusicEditStruct;
    }

    public final void setMusicEditScene(Integer num) {
        this.musicEditScene = num;
    }

    public final void setOriginalAudioTrack(OriginalAudioTrack originalAudioTrack) {
        this.originalAudioTrack = originalAudioTrack;
    }

    public final void setOriginalVid(String str) {
        this.originalVid = str;
    }

    public final void setStripAudioExist(boolean z) {
        this.stripAudioExist = z;
    }

    public final void setVersion(Integer num) {
        this.version = num;
    }
}
