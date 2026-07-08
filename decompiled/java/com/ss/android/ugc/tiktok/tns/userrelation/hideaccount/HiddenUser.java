package com.ss.android.ugc.tiktok.tns.userrelation.hideaccount;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class HiddenUser implements Serializable {

    @C09CT("avatar")
    public final String avatar;

    @C09CT("bio_content")
    public final String bioContent;

    @C09CT("follower_cnt")
    public final int followerCount;

    @C09CT("nick_name")
    public final String nickname;

    @C09CT("user_id")
    public final String userId;

    @C09CT("video_cnt")
    public final int videoCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiddenUser)) {
            return false;
        }
        HiddenUser hiddenUser = (HiddenUser) obj;
        return Intrinsics.LJFF(this.userId, hiddenUser.userId) && Intrinsics.LJFF(this.nickname, hiddenUser.nickname) && Intrinsics.LJFF(this.avatar, hiddenUser.avatar) && this.videoCount == hiddenUser.videoCount && this.followerCount == hiddenUser.followerCount && Intrinsics.LJFF(this.bioContent, hiddenUser.bioContent);
    }

    public int hashCode() {
        return (((((((((this.userId.hashCode() * 31) + this.nickname.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.videoCount) * 31) + this.followerCount) * 31) + this.bioContent.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HiddenUser(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", videoCount=");
        sbLIZ.append(this.videoCount);
        sbLIZ.append(", followerCount=");
        sbLIZ.append(this.followerCount);
        sbLIZ.append(", bioContent=");
        sbLIZ.append(this.bioContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HiddenUser() {
        this("", "", "", 0, 0, "");
    }

    public HiddenUser(String str, String str2, String str3, int i, int i2, String str4) {
        this.userId = str;
        this.nickname = str2;
        this.avatar = str3;
        this.videoCount = i;
        this.followerCount = i2;
        this.bioContent = str4;
    }
}
