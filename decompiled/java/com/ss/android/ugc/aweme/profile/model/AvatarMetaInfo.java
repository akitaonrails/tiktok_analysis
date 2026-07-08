package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AvatarMetaInfo implements Serializable {

    @C09CT("avatar_choice")
    public Integer avatarChoice;

    @C09CT("avatar_source")
    public Integer avatarSource;

    @C09CT("social_avatar_background_tag")
    public Integer socialAvatarBackgroundTag;

    @C09CT("social_avatar_expression_tag")
    public Integer socialAvatarExpressionTag;

    @C09CT("social_avatar_id")
    public Long socialAvatarID;

    public AvatarMetaInfo() {
        this(null, null, null, null, null);
    }

    public final AvatarMetaInfo copy(Integer num, Integer num2, Integer num3, Integer num4, Long l) {
        return new AvatarMetaInfo(num, num2, num3, num4, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarMetaInfo)) {
            return false;
        }
        AvatarMetaInfo avatarMetaInfo = (AvatarMetaInfo) obj;
        return Intrinsics.LJFF(this.avatarSource, avatarMetaInfo.avatarSource) && Intrinsics.LJFF(this.avatarChoice, avatarMetaInfo.avatarChoice) && Intrinsics.LJFF(this.socialAvatarBackgroundTag, avatarMetaInfo.socialAvatarBackgroundTag) && Intrinsics.LJFF(this.socialAvatarExpressionTag, avatarMetaInfo.socialAvatarExpressionTag) && Intrinsics.LJFF(this.socialAvatarID, avatarMetaInfo.socialAvatarID);
    }

    public int hashCode() {
        Integer num = this.avatarSource;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.avatarChoice;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.socialAvatarBackgroundTag;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.socialAvatarExpressionTag;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.socialAvatarID;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarMetaInfo(avatarSource=");
        sbLIZ.append(this.avatarSource);
        sbLIZ.append(", avatarChoice=");
        sbLIZ.append(this.avatarChoice);
        sbLIZ.append(", socialAvatarBackgroundTag=");
        sbLIZ.append(this.socialAvatarBackgroundTag);
        sbLIZ.append(", socialAvatarExpressionTag=");
        sbLIZ.append(this.socialAvatarExpressionTag);
        sbLIZ.append(", socialAvatarID=");
        sbLIZ.append(this.socialAvatarID);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setAvatarChoice(Integer num) {
        this.avatarChoice = num;
    }

    public AvatarMetaInfo(Integer num, Integer num2, Integer num3, Integer num4, Long l) {
        this.avatarSource = num;
        this.avatarChoice = num2;
        this.socialAvatarBackgroundTag = num3;
        this.socialAvatarExpressionTag = num4;
        this.socialAvatarID = l;
    }
}
