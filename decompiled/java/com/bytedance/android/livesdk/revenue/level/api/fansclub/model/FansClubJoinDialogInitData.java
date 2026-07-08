package com.bytedance.android.livesdk.revenue.level.api.fansclub.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubJoinDialogInitData {

    @C09CT("anchor_avatar_url")
    public final String anchorAvatar;

    @C09CT("anchor_name")
    public final String anchorName;

    @C09CT("fan_club_name")
    public final String fansClubName;

    @C09CT("is_button_gray")
    public final int isButtonGray;

    @C09CT("user_avatar_url")
    public final String userAvatar;

    @C09CT("user_name")
    public final String userName;

    public FansClubJoinDialogInitData(String str, String str2, String str3, String str4, String str5, int i) {
        this.anchorAvatar = str;
        this.userAvatar = str2;
        this.anchorName = str3;
        this.userName = str4;
        this.fansClubName = str5;
        this.isButtonGray = i;
    }
}
