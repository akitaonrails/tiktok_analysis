package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoUserItem {

    @C09CT("avatar")
    public final BaseImage avatar;

    @C09CT("cert_info")
    public final TakoCertInfo certInfo;

    @C09CT("description")
    public final String description;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("private_info")
    public final TakoPrivateInfo privateInfo;

    @C09CT("relation_info")
    public final TakoRelationInfo relationInfo;

    @C09CT("user_id")
    public final long userId;

    @C09CT("username")
    public final String username;

    public TakoUserItem() {
        this(0L, "", "", new BaseImage(null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262143, null), "", new TakoCertInfo(false, ""), new TakoRelationInfo(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0)), new TakoPrivateInfo(false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoUserItem)) {
            return false;
        }
        TakoUserItem takoUserItem = (TakoUserItem) obj;
        return this.userId == takoUserItem.userId && Intrinsics.LJFF(this.nickname, takoUserItem.nickname) && Intrinsics.LJFF(this.description, takoUserItem.description) && Intrinsics.LJFF(this.avatar, takoUserItem.avatar) && Intrinsics.LJFF(this.username, takoUserItem.username) && Intrinsics.LJFF(this.certInfo, takoUserItem.certInfo) && Intrinsics.LJFF(this.relationInfo, takoUserItem.relationInfo) && Intrinsics.LJFF(this.privateInfo, takoUserItem.privateInfo);
    }

    public final int hashCode() {
        return (((((((((((((C786410Ut5.Y2(this.userId) * 31) + this.nickname.hashCode()) * 31) + this.description.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.username.hashCode()) * 31) + this.certInfo.hashCode()) * 31) + this.relationInfo.hashCode()) * 31) + this.privateInfo.hashCode();
    }

    public TakoUserItem(long j, String str, String str2, BaseImage baseImage, String str3, TakoCertInfo takoCertInfo, TakoRelationInfo takoRelationInfo, TakoPrivateInfo takoPrivateInfo) {
        this.userId = j;
        this.nickname = str;
        this.description = str2;
        this.avatar = baseImage;
        this.username = str3;
        this.certInfo = takoCertInfo;
        this.relationInfo = takoRelationInfo;
        this.privateInfo = takoPrivateInfo;
    }
}
