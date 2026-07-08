package com.ss.android.ugc.aweme.lancet;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PlayerGroupIdRecorderData {

    @C09CT("author_id")
    public String authorId;

    @C09CT(alternate = {"LIZJ"}, value = "lastPageName")
    public String lastPageName;

    @C09CT(alternate = {"LIZIZ"}, value = "lastPagePlayGid")
    public String lastPagePlayGid;

    @C09CT("lastPagePlayMusicId")
    public String lastPagePlayMusicId;

    @C09CT(alternate = {"LIZ"}, value = "lastPlayGid")
    public String lastPlayGid;

    @C09CT("lastPlayMusicId")
    public String lastPlayMusicId;

    @C09CT(alternate = {"LJ"}, value = "prePageName")
    public String prePageName;

    @C09CT(alternate = {"LIZLLL"}, value = "prePagePlayGid")
    public String prePagePlayGid;

    @C09CT("prePagePlayMusicId")
    public String prePagePlayMusicId;

    @C09CT("request_id")
    public String requestId;

    public PlayerGroupIdRecorderData() {
        this("", "", "", "", "", "", "", "", "", "");
    }

    public PlayerGroupIdRecorderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.lastPlayGid = str;
        this.lastPlayMusicId = str2;
        this.lastPagePlayGid = str3;
        this.lastPageName = str4;
        this.lastPagePlayMusicId = str5;
        this.prePagePlayGid = str6;
        this.prePageName = str7;
        this.prePagePlayMusicId = str8;
        this.authorId = str9;
        this.requestId = str10;
    }
}
