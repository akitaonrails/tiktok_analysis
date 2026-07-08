package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ViewerListSimpleUser {

    @C09CT("avatar_medium")
    public final UrlModel avatarMedium;

    @C09CT("avatar_thumb")
    public final UrlModel avatarThumb;

    @C09CT("follow_status")
    public final int followStatus;

    @C09CT("follower_status")
    public final int followerStatus;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uid")
    public final String uid;

    @C09CT("unique_id")
    public final String uniqueId;

    public ViewerListSimpleUser() {
        this(null, null, null, null, null, null, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewerListSimpleUser)) {
            return false;
        }
        ViewerListSimpleUser viewerListSimpleUser = (ViewerListSimpleUser) obj;
        return Intrinsics.LJFF(this.uid, viewerListSimpleUser.uid) && Intrinsics.LJFF(this.secUid, viewerListSimpleUser.secUid) && Intrinsics.LJFF(this.nickname, viewerListSimpleUser.nickname) && Intrinsics.LJFF(this.uniqueId, viewerListSimpleUser.uniqueId) && Intrinsics.LJFF(this.avatarThumb, viewerListSimpleUser.avatarThumb) && Intrinsics.LJFF(this.avatarMedium, viewerListSimpleUser.avatarMedium) && this.followStatus == viewerListSimpleUser.followStatus && this.followerStatus == viewerListSimpleUser.followerStatus;
    }

    public final int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secUid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uniqueId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlModel urlModel = this.avatarThumb;
        int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.avatarMedium;
        return ((((iHashCode5 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31) + this.followStatus) * 31) + this.followerStatus;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerListSimpleUser(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(", avatarMedium=");
        sbLIZ.append(this.avatarMedium);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.followStatus);
        sbLIZ.append(", followerStatus=");
        sbLIZ.append(this.followerStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ViewerListSimpleUser(String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, int i, int i2) {
        this.uid = str;
        this.secUid = str2;
        this.nickname = str3;
        this.uniqueId = str4;
        this.avatarThumb = urlModel;
        this.avatarMedium = urlModel2;
        this.followStatus = i;
        this.followerStatus = i2;
    }
}
