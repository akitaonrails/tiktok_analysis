package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.model.CameoAssetInfo;
import com.ss.android.ugc.aweme.theater.model.CameoInfoItem;
import com.ss.android.ugc.aweme.theater.model.UserBaseInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CameoInfoItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<CameoInfoItem> CREATOR = new Parcelable.Creator<CameoInfoItem>() { // from class: X.02tp
        @Override // android.os.Parcelable.Creator
        public final CameoInfoItem createFromParcel(Parcel parcel) {
            CameoAssetInfo cameoAssetInfoCreateFromParcel;
            Integer numValueOf;
            UserBaseInfo userBaseInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                cameoAssetInfoCreateFromParcel = null;
            } else {
                cameoAssetInfoCreateFromParcel = CameoAssetInfo.CREATOR.createFromParcel(parcel);
            }
            CameoAssetInfo cameoAssetInfo = cameoAssetInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                userBaseInfoCreateFromParcel = UserBaseInfo.CREATOR.createFromParcel(parcel);
            }
            return new CameoInfoItem(cameoAssetInfo, numValueOf, userBaseInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CameoInfoItem[] newArray(int i) {
            return new CameoInfoItem[i];
        }
    };

    @C09CT("cameo_asset_info")
    public final CameoAssetInfo cameoAssetInfo;

    @C09CT("followers")
    public final Integer followers;

    @C09CT("user_base_info")
    public final UserBaseInfo userBaseInfo;

    public CameoInfoItem() {
        this(null, 0, null);
    }

    public final CameoInfoItem copy(CameoAssetInfo cameoAssetInfo, Integer num, UserBaseInfo userBaseInfo) {
        return new CameoInfoItem(cameoAssetInfo, num, userBaseInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameoInfoItem)) {
            return false;
        }
        CameoInfoItem cameoInfoItem = (CameoInfoItem) obj;
        return Intrinsics.LJFF(this.cameoAssetInfo, cameoInfoItem.cameoAssetInfo) && Intrinsics.LJFF(this.followers, cameoInfoItem.followers) && Intrinsics.LJFF(this.userBaseInfo, cameoInfoItem.userBaseInfo);
    }

    public int hashCode() {
        CameoAssetInfo cameoAssetInfo = this.cameoAssetInfo;
        int iHashCode = (cameoAssetInfo == null ? 0 : cameoAssetInfo.hashCode()) * 31;
        Integer num = this.followers;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        UserBaseInfo userBaseInfo = this.userBaseInfo;
        return iHashCode2 + (userBaseInfo != null ? userBaseInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameoInfoItem(cameoAssetInfo=");
        sbLIZ.append(this.cameoAssetInfo);
        sbLIZ.append(", followers=");
        sbLIZ.append(this.followers);
        sbLIZ.append(", userBaseInfo=");
        sbLIZ.append(this.userBaseInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CameoAssetInfo cameoAssetInfo = this.cameoAssetInfo;
        if (cameoAssetInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cameoAssetInfo.writeToParcel(parcel, i);
        }
        Integer num = this.followers;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        UserBaseInfo userBaseInfo = this.userBaseInfo;
        if (userBaseInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userBaseInfo.writeToParcel(parcel, i);
        }
    }

    public final CameoAssetInfo getCameoAssetInfo() {
        return this.cameoAssetInfo;
    }

    public final Integer getFollowers() {
        return this.followers;
    }

    public final UserBaseInfo getUserBaseInfo() {
        return this.userBaseInfo;
    }

    public CameoInfoItem(CameoAssetInfo cameoAssetInfo, Integer num, UserBaseInfo userBaseInfo) {
        this.cameoAssetInfo = cameoAssetInfo;
        this.followers = num;
        this.userBaseInfo = userBaseInfo;
    }
}
