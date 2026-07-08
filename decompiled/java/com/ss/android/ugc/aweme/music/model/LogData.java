package com.ss.android.ugc.aweme.music.model;

import X.C0P0X;
import X.EnumC631120OpC;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes10.dex */
public final class LogData {
    public final Aweme aweme;
    public final String awemeType;
    public final MusicETBusinessModule businessModule;
    public final C0P0X buttonType;
    public final Integer clickAtDuration;
    public final String displayButtonName;
    public final EnumC631120OpC dspEntrance;
    public final DspPlatform dspPlatform;
    public final String enterFrom;
    public final String enterMethod;
    public final String firstEnterFrom;
    public final String groupId;
    public final boolean isAddMultiSongs;
    public final String logId;
    public final Music music;
    public final String musicVolume;
    public final String page;
    public final String pageName;
    public final String promoId;
    public final SearchInflowParam searchInflowParam;
    public final int showAddToDspButtonStatus;
    public final TTToDspLogExtra ttToDspLogExtra;

    public final LogData copy(DspPlatform dspPlatform, EnumC631120OpC enumC631120OpC, C0P0X c0p0x, String str, String str2, MusicETBusinessModule musicETBusinessModule, Aweme aweme, Music music, SearchInflowParam searchInflowParam, Integer num, String str3, String str4, String str5, String str6, String str7, TTToDspLogExtra tTToDspLogExtra, String str8, String str9, String str10, boolean z, int i, String str11) {
        return new LogData(dspPlatform, enumC631120OpC, c0p0x, str, str2, musicETBusinessModule, aweme, music, searchInflowParam, num, str3, str4, str5, str6, str7, tTToDspLogExtra, str8, str9, str10, z, i, str11);
    }

    public final boolean isAddMultiSongs() {
        return this.isAddMultiSongs;
    }

    public LogData(DspPlatform dspPlatform, EnumC631120OpC enumC631120OpC, C0P0X c0p0x, String str, String str2, MusicETBusinessModule musicETBusinessModule, Aweme aweme, Music music, SearchInflowParam searchInflowParam, Integer num, String str3, String str4, String str5, String str6, String str7, TTToDspLogExtra tTToDspLogExtra, String str8, String str9, String str10, boolean z, int i, String str11) {
        this.dspPlatform = dspPlatform;
        this.dspEntrance = enumC631120OpC;
        this.buttonType = c0p0x;
        this.enterFrom = str;
        this.firstEnterFrom = str2;
        this.businessModule = musicETBusinessModule;
        this.aweme = aweme;
        this.music = music;
        this.searchInflowParam = searchInflowParam;
        this.clickAtDuration = num;
        this.groupId = str3;
        this.musicVolume = str4;
        this.awemeType = str5;
        this.enterMethod = str6;
        this.page = str7;
        this.ttToDspLogExtra = tTToDspLogExtra;
        this.logId = str8;
        this.promoId = str9;
        this.displayButtonName = str10;
        this.isAddMultiSongs = z;
        this.showAddToDspButtonStatus = i;
        this.pageName = str11;
    }
}
