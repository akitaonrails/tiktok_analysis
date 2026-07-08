package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class EditMusicStruct {

    @C09CT("music_edit_scene")
    public int musicEditScene;

    @C09CT("music_id")
    public String musicID = "";

    @C09CT("music_volume")
    public String musicVolume = "";

    @C09CT("music_time_range")
    public MusicTimeStruct musicTime = new MusicTimeStruct();

    public final int getMusicEditScene() {
        return this.musicEditScene;
    }

    public final String getMusicID() {
        return this.musicID;
    }

    public final MusicTimeStruct getMusicTime() {
        return this.musicTime;
    }

    public final String getMusicVolume() {
        return this.musicVolume;
    }

    public final void setMusicEditScene(int i) {
        this.musicEditScene = i;
    }

    public final void setMusicID(String str) {
        this.musicID = str;
    }

    public final void setMusicTime(MusicTimeStruct musicTimeStruct) {
        this.musicTime = musicTimeStruct;
    }

    public final void setMusicVolume(String str) {
        this.musicVolume = str;
    }
}
