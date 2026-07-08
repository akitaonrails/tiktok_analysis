package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class UserInfo {
    public String extraInfo;
    public String uid;

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public String getUid() {
        return this.uid;
    }

    public UserInfo(String str, String str2) {
        this.uid = str;
        this.extraInfo = str2;
    }

    public static UserInfo create(String str, String str2) {
        return new UserInfo(str, str2);
    }
}
