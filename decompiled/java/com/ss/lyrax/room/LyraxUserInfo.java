package com.ss.lyrax.room;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxUserInfo {
    public String userId = "";
    public String extraInfo = "";

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public String getUserId() {
        return this.userId;
    }

    public static LyraxUserInfo create(String str, String str2) {
        LyraxUserInfo lyraxUserInfo = new LyraxUserInfo();
        lyraxUserInfo.userId = str;
        lyraxUserInfo.extraInfo = str2;
        return lyraxUserInfo;
    }
}
