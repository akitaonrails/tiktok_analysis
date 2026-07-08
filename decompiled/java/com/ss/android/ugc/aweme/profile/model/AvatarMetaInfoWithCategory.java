package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AvatarMetaInfoWithCategory implements Serializable {

    @C09CT("avatar_category")
    public Integer avatarCategory;

    @C09CT("avatar_meta_info")
    public AvatarMetaInfo avatarMetaInfo;

    public AvatarMetaInfoWithCategory() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarMetaInfoWithCategory)) {
            return false;
        }
        AvatarMetaInfoWithCategory avatarMetaInfoWithCategory = (AvatarMetaInfoWithCategory) obj;
        return Intrinsics.LJFF(this.avatarCategory, avatarMetaInfoWithCategory.avatarCategory) && Intrinsics.LJFF(this.avatarMetaInfo, avatarMetaInfoWithCategory.avatarMetaInfo);
    }

    public int hashCode() {
        Integer num = this.avatarCategory;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        AvatarMetaInfo avatarMetaInfo = this.avatarMetaInfo;
        return iHashCode + (avatarMetaInfo != null ? avatarMetaInfo.hashCode() : 0);
    }

    public AvatarMetaInfoWithCategory(Integer num, AvatarMetaInfo avatarMetaInfo) {
        this.avatarCategory = num;
        this.avatarMetaInfo = avatarMetaInfo;
    }
}
