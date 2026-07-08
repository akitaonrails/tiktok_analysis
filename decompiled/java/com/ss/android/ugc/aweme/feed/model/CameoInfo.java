package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<CameoInfo> CREATOR = new Creator();

    @C09CT("cameo_asset_info")
    public CameoAssetInfo cameoAssetInfo;

    @C09CT("followers")
    public Long followers;

    @C09CT("user_base_info")
    public UserBaseInfo userBaseInfo;

    public static final class Creator implements Parcelable.Creator<CameoInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CameoInfo createFromParcel(Parcel parcel) {
            return new CameoInfo(parcel.readInt() == 0 ? null : UserBaseInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CameoAssetInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CameoInfo[] newArray(int i) {
            return new CameoInfo[i];
        }
    }

    public CameoInfo() {
        this(null, null, 0L);
    }

    public final CameoInfo copy(UserBaseInfo userBaseInfo, CameoAssetInfo cameoAssetInfo, Long l) {
        return new CameoInfo(userBaseInfo, cameoAssetInfo, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoInfo)) {
            return false;
        }
        CameoInfo cameoInfo = (CameoInfo) obj;
        return Intrinsics.LJFF(this.userBaseInfo, cameoInfo.userBaseInfo) && Intrinsics.LJFF(this.cameoAssetInfo, cameoInfo.cameoAssetInfo) && Intrinsics.LJFF(this.followers, cameoInfo.followers);
    }

    public int hashCode() {
        UserBaseInfo userBaseInfo = this.userBaseInfo;
        int iHashCode = (userBaseInfo == null ? 0 : userBaseInfo.hashCode()) * 31;
        CameoAssetInfo cameoAssetInfo = this.cameoAssetInfo;
        int iHashCode2 = (iHashCode + (cameoAssetInfo == null ? 0 : cameoAssetInfo.hashCode())) * 31;
        Long l = this.followers;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoInfo(userBaseInfo=");
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
        CameoAssetInfo cameoAssetInfo = this.cameoAssetInfo;
        if (cameoAssetInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cameoAssetInfo.writeToParcel(parcel, i);
        }
        Long l = this.followers;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final CameoAssetInfo getCameoAssetInfo() {
        return this.cameoAssetInfo;
    }

    public final Long getFollowers() {
        return this.followers;
    }

    public final UserBaseInfo getUserBaseInfo() {
        return this.userBaseInfo;
    }

    public CameoInfo(UserBaseInfo userBaseInfo, CameoAssetInfo cameoAssetInfo, Long l) {
        this.userBaseInfo = userBaseInfo;
        this.cameoAssetInfo = cameoAssetInfo;
        this.followers = l;
    }
}
