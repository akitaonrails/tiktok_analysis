package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes9.dex */
public final class ChangeBanMusicConfig {
    public final CreativeInfo creationInfo;
    public final boolean hasStrippedSound;
    public final String mp4Path;
    public final MusicBuzModel musicBuzModel;
    public final String musicMuteDetailUrl;
    public final String originVideo;
    public final String originalAudioVid;
    public String outputDir = "";
    public MusicModel previousMusic;
    public int videoHeight;
    public int videoWidth;
    public final String voicePath;
    public final String wavPath;

    public final CreativeInfo getCreationInfo() {
        return this.creationInfo;
    }

    public final boolean getHasStrippedSound() {
        return this.hasStrippedSound;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final MusicBuzModel getMusicBuzModel() {
        return this.musicBuzModel;
    }

    public final String getMusicMuteDetailUrl() {
        return this.musicMuteDetailUrl;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final String getOriginalAudioVid() {
        return this.originalAudioVid;
    }

    public final String getOutputDir() {
        return this.outputDir;
    }

    public final MusicModel getPreviousMusic() {
        return this.previousMusic;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final String getVoicePath() {
        return this.voicePath;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final void setOutputDir(String str) {
        this.outputDir = str;
    }

    public final void setPreviousMusic(MusicModel musicModel) {
        this.previousMusic = musicModel;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public ChangeBanMusicConfig(String str, String str2, String str3, String str4, String str5, CreativeInfo creativeInfo, MusicBuzModel musicBuzModel, String str6, boolean z) {
        this.originVideo = str;
        this.mp4Path = str2;
        this.wavPath = str3;
        this.voicePath = str4;
        this.originalAudioVid = str5;
        this.creationInfo = creativeInfo;
        this.musicBuzModel = musicBuzModel;
        this.musicMuteDetailUrl = str6;
        this.hasStrippedSound = z;
    }
}
