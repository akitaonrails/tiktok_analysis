package com.ss.android.ugc.aweme.services.publish;

/* JADX INFO: loaded from: classes19.dex */
public final class EditPostMobParam {
    public final String afterPostDays;
    public final String authorId;
    public final String awemeId;
    public final Integer awemeType;
    public final String groupId;

    public EditPostMobParam(Integer num, String str, String str2, String str3, String str4) {
        this.awemeType = num;
        this.awemeId = str;
        this.authorId = str2;
        this.groupId = str3;
        this.afterPostDays = str4;
    }
}
