package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AIPortraitCameoInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AIPortraitCameoInfo> CREATOR = new Creator();

    @C09CT("cameo_asset_info")
    public AIPortraitCameoAssetInfo cameoAssetInfo;

    @C09CT("followers")
    public Long followers;

    @C09CT("user_base_info")
    public UserBaseInfo userBaseInfo;

    public static final class Creator implements Parcelable.Creator<AIPortraitCameoInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIPortraitCameoInfo createFromParcel(Parcel parcel) {
            return new AIPortraitCameoInfo(parcel.readInt() == 0 ? null : UserBaseInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AIPortraitCameoAssetInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AIPortraitCameoInfo[] newArray(int i) {
            return new AIPortraitCameoInfo[i];
        }
    }

    public AIPortraitCameoInfo() {
        this(null, null, null);
    }

    public final AIPortraitCameoInfo copy(UserBaseInfo userBaseInfo, AIPortraitCameoAssetInfo aIPortraitCameoAssetInfo, Long l) {
        return new AIPortraitCameoInfo(userBaseInfo, aIPortraitCameoAssetInfo, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitCameoInfo)) {
            return false;
        }
        AIPortraitCameoInfo aIPortraitCameoInfo = (AIPortraitCameoInfo) obj;
        return Intrinsics.LJFF(this.userBaseInfo, aIPortraitCameoInfo.userBaseInfo) && Intrinsics.LJFF(this.cameoAssetInfo, aIPortraitCameoInfo.cameoAssetInfo) && Intrinsics.LJFF(this.followers, aIPortraitCameoInfo.followers);
    }

    public int hashCode() {
        UserBaseInfo userBaseInfo = this.userBaseInfo;
        int iHashCode = (userBaseInfo == null ? 0 : userBaseInfo.hashCode()) * 31;
        AIPortraitCameoAssetInfo aIPortraitCameoAssetInfo = this.cameoAssetInfo;
        int iHashCode2 = (iHashCode + (aIPortraitCameoAssetInfo == null ? 0 : aIPortraitCameoAssetInfo.hashCode())) * 31;
        Long l = this.followers;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitCameoInfo(userBaseInfo=");
        sbLIZ.append(this.userBaseInfo);
        sbLIZ.append(", cameoAssetInfo=");
        sbLIZ.append(this.cameoAssetInfo);
        sbLIZ.append(", followers=");
        sbLIZ.append(this.followers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UserBaseInfo userBaseInfo = this.userBaseInfo;
        if (userBaseInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userBaseInfo.writeToParcel(parcel, i);
        }
        AIPortraitCameoAssetInfo aIPortraitCameoAssetInfo = this.cameoAssetInfo;
        if (aIPortraitCameoAssetInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIPortraitCameoAssetInfo.writeToParcel(parcel, i);
        }
        Long l = this.followers;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final AIPortraitCameoAssetInfo getCameoAssetInfo() {
        return this.cameoAssetInfo;
    }

    public final Long getFollowers() {
        return this.followers;
    }

    public final UserBaseInfo getUserBaseInfo() {
        return this.userBaseInfo;
    }

    public AIPortraitCameoInfo(UserBaseInfo userBaseInfo, AIPortraitCameoAssetInfo aIPortraitCameoAssetInfo, Long l) {
        this.userBaseInfo = userBaseInfo;
        this.cameoAssetInfo = aIPortraitCameoAssetInfo;
        this.followers = l;
    }
}
