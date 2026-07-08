package com.ss.android.ugc.profile.business.ur.utils;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.profile.model.AvatarMetaInfo;
import com.ss.android.ugc.aweme.profile.model.AvatarSizeUrlStruct;
import com.ss.android.ugc.profile.business.ur.utils.SocialAvatarUserInfoCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarUserInfoCache implements Parcelable {
    public static final Parcelable.Creator<SocialAvatarUserInfoCache> CREATOR = new Parcelable.Creator<SocialAvatarUserInfoCache>() { // from class: X.0HYk
        @Override // android.os.Parcelable.Creator
        public final SocialAvatarUserInfoCache createFromParcel(Parcel parcel) {
            return new SocialAvatarUserInfoCache((AvatarSizeUrlStruct) parcel.readSerializable(), (AvatarSizeUrlStruct) parcel.readSerializable(), (AvatarSizeUrlStruct) parcel.readSerializable(), (AvatarMetaInfo) parcel.readSerializable(), (AvatarSizeUrlStruct) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialAvatarUserInfoCache[] newArray(int i) {
            return new SocialAvatarUserInfoCache[i];
        }
    };
    public final AvatarSizeUrlStruct avatarWithBackground;
    public final AvatarSizeUrlStruct avatarWithoutBackground;
    public final AvatarSizeUrlStruct dynamicAvatar;
    public final AvatarMetaInfo socialAvatarMetaInfo;
    public final AvatarSizeUrlStruct staticAvatar;

    public SocialAvatarUserInfoCache() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarUserInfoCache)) {
            return false;
        }
        SocialAvatarUserInfoCache socialAvatarUserInfoCache = (SocialAvatarUserInfoCache) obj;
        return Intrinsics.LJFF(this.avatarWithBackground, socialAvatarUserInfoCache.avatarWithBackground) && Intrinsics.LJFF(this.avatarWithoutBackground, socialAvatarUserInfoCache.avatarWithoutBackground) && Intrinsics.LJFF(this.dynamicAvatar, socialAvatarUserInfoCache.dynamicAvatar) && Intrinsics.LJFF(this.socialAvatarMetaInfo, socialAvatarUserInfoCache.socialAvatarMetaInfo) && Intrinsics.LJFF(this.staticAvatar, socialAvatarUserInfoCache.staticAvatar);
    }

    public final int hashCode() {
        AvatarSizeUrlStruct avatarSizeUrlStruct = this.avatarWithBackground;
        int iHashCode = (avatarSizeUrlStruct == null ? 0 : avatarSizeUrlStruct.hashCode()) * 31;
        AvatarSizeUrlStruct avatarSizeUrlStruct2 = this.avatarWithoutBackground;
        int iHashCode2 = (iHashCode + (avatarSizeUrlStruct2 == null ? 0 : avatarSizeUrlStruct2.hashCode())) * 31;
        AvatarSizeUrlStruct avatarSizeUrlStruct3 = this.dynamicAvatar;
        int iHashCode3 = (iHashCode2 + (avatarSizeUrlStruct3 == null ? 0 : avatarSizeUrlStruct3.hashCode())) * 31;
        AvatarMetaInfo avatarMetaInfo = this.socialAvatarMetaInfo;
        int iHashCode4 = (iHashCode3 + (avatarMetaInfo == null ? 0 : avatarMetaInfo.hashCode())) * 31;
        AvatarSizeUrlStruct avatarSizeUrlStruct4 = this.staticAvatar;
        return iHashCode4 + (avatarSizeUrlStruct4 != null ? avatarSizeUrlStruct4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarUserInfoCache(avatarWithBackground=");
        sbLIZ.append(this.avatarWithBackground);
        sbLIZ.append(", avatarWithoutBackground=");
        sbLIZ.append(this.avatarWithoutBackground);
        sbLIZ.append(", dynamicAvatar=");
        sbLIZ.append(this.dynamicAvatar);
        sbLIZ.append(", socialAvatarMetaInfo=");
        sbLIZ.append(this.socialAvatarMetaInfo);
        sbLIZ.append(", staticAvatar=");
        sbLIZ.append(this.staticAvatar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.avatarWithBackground);
        parcel.writeSerializable(this.avatarWithoutBackground);
        parcel.writeSerializable(this.dynamicAvatar);
        parcel.writeSerializable(this.socialAvatarMetaInfo);
        parcel.writeSerializable(this.staticAvatar);
    }

    public SocialAvatarUserInfoCache(AvatarSizeUrlStruct avatarSizeUrlStruct, AvatarSizeUrlStruct avatarSizeUrlStruct2, AvatarSizeUrlStruct avatarSizeUrlStruct3, AvatarMetaInfo avatarMetaInfo, AvatarSizeUrlStruct avatarSizeUrlStruct4) {
        this.avatarWithBackground = avatarSizeUrlStruct;
        this.avatarWithoutBackground = avatarSizeUrlStruct2;
        this.dynamicAvatar = avatarSizeUrlStruct3;
        this.socialAvatarMetaInfo = avatarMetaInfo;
        this.staticAvatar = avatarSizeUrlStruct4;
    }
}
