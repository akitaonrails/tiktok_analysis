package com.ss.android.ugc.aweme.music.model;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes10.dex */
public final class PreSaveLogData {
    public final String albumId;
    public final Aweme aweme;
    public final String awemeType;
    public final String buttonType;
    public final Integer dspNumber;
    public final DspPlatform dspPlatform;
    public final String enterFrom;
    public final String firstEnterFrom;
    public final String groupId;
    public final Boolean isAuthorized;
    public final String isFollowArtist;
    public final Boolean isLinked;
    public final Music music;
    public final String pageName;

    public final Boolean isAuthorized() {
        return this.isAuthorized;
    }

    public final String isFollowArtist() {
        return this.isFollowArtist;
    }

    public final Boolean isLinked() {
        return this.isLinked;
    }

    public PreSaveLogData(DspPlatform dspPlatform, String str, String str2, Aweme aweme, Music music, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Integer num, String str7, String str8) {
        this.dspPlatform = dspPlatform;
        this.enterFrom = str;
        this.firstEnterFrom = str2;
        this.aweme = aweme;
        this.music = music;
        this.groupId = str3;
        this.awemeType = str4;
        this.isFollowArtist = str5;
        this.albumId = str6;
        this.isAuthorized = bool;
        this.isLinked = bool2;
        this.dspNumber = num;
        this.pageName = str7;
        this.buttonType = str8;
    }
}
