package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ReplaceMusicRequest {
    public transient boolean isApplyStripResult;

    @C09CT("original_audio_track")
    public OriginalAudioTrack originalAudioTrack;

    @C09CT("original_vid")
    public String originalVid;

    @C09CT("voice_volume")
    public Integer voiceVolume;

    @C09CT("item_id")
    public String itemID = "";

    @C09CT("new_music_info")
    public EditMusicStruct editMusicStruct = new EditMusicStruct();

    @C09CT("creation_id")
    public String creationId = "";

    @C09CT("music_id")
    public String musicId = "";

    public final String getCreationId() {
        return this.creationId;
    }

    public final EditMusicStruct getEditMusicStruct() {
        return this.editMusicStruct;
    }

    public final String getItemID() {
        return this.itemID;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final OriginalAudioTrack getOriginalAudioTrack() {
        return this.originalAudioTrack;
    }

    public final String getOriginalVid() {
        return this.originalVid;
    }

    public final Integer getVoiceVolume() {
        return this.voiceVolume;
    }

    public final boolean isApplyStripResult() {
        return this.isApplyStripResult;
    }

    public final void setApplyStripResult(boolean z) {
        this.isApplyStripResult = z;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setEditMusicStruct(EditMusicStruct editMusicStruct) {
        this.editMusicStruct = editMusicStruct;
    }

    public final void setItemID(String str) {
        this.itemID = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setOriginalAudioTrack(OriginalAudioTrack originalAudioTrack) {
        this.originalAudioTrack = originalAudioTrack;
    }

    public final void setOriginalVid(String str) {
        this.originalVid = str;
    }

    public final void setVoiceVolume(Integer num) {
        this.voiceVolume = num;
    }
}
