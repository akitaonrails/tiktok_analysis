package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class SoundSyncAnchorConfig {
    public int musicEnd;
    public MusicModel musicModel;
    public int musicStart;
    public CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
    public String enterFrom = "";
    public String enterMethod = "";
    public final String shootWay = "sound_sync";
    public ArrayList<Float> clipDurations = new ArrayList<>();

    public final ArrayList<Float> getClipDurations() {
        return this.clipDurations;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final int getMusicEnd() {
        return this.musicEnd;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final int getMusicStart() {
        return this.musicStart;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final void setClipDurations(ArrayList<Float> arrayList) {
        this.clipDurations = arrayList;
    }

    public final void setCreativeInfo(CreativeInfo creativeInfo) {
        this.creativeInfo = creativeInfo;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setMusicEnd(int i) {
        this.musicEnd = i;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public final void setMusicStart(int i) {
        this.musicStart = i;
    }
}
