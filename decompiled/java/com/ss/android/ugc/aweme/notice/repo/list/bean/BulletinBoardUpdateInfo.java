package com.ss.android.ugc.aweme.notice.repo.list.bean;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardUpdateInfo {
    public final String avatarUri;
    public final String avatarUrl;
    public final String description;
    public final Boolean enableReply;
    public final String name;
    public final Boolean showOnProfile;

    public BulletinBoardUpdateInfo(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this.name = str;
        this.avatarUrl = str2;
        this.avatarUri = str3;
        this.description = str4;
        this.showOnProfile = bool;
        this.enableReply = bool2;
    }
}
