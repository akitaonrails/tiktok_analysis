package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUpExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class BasicPopUpExtraInfo implements Parcelable {

    @C09CT("cache_key")
    public final String cacheKey;

    @C09CT("purchase_rewards")
    public final String purchaseRewards;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<BasicPopUpExtraInfo> CREATOR = new Parcelable.Creator<BasicPopUpExtraInfo>() { // from class: X.0mgl
        @Override // android.os.Parcelable.Creator
        public final BasicPopUpExtraInfo createFromParcel(Parcel parcel) {
            return new BasicPopUpExtraInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BasicPopUpExtraInfo[] newArray(int i) {
            return new BasicPopUpExtraInfo[i];
        }
    };
    public static final int $stable = 8;

    public BasicPopUpExtraInfo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicPopUpExtraInfo)) {
            return false;
        }
        BasicPopUpExtraInfo basicPopUpExtraInfo = (BasicPopUpExtraInfo) obj;
        return Intrinsics.LJFF(this.schema, basicPopUpExtraInfo.schema) && Intrinsics.LJFF(this.cacheKey, basicPopUpExtraInfo.cacheKey) && Intrinsics.LJFF(this.purchaseRewards, basicPopUpExtraInfo.purchaseRewards);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cacheKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchaseRewards;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BasicPopUpExtraInfo(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", cacheKey=");
        sbLIZ.append(this.cacheKey);
        sbLIZ.append(", purchaseRewards=");
        sbLIZ.append(this.purchaseRewards);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        parcel.writeString(this.cacheKey);
        parcel.writeString(this.purchaseRewards);
    }

    public BasicPopUpExtraInfo(String str, String str2, String str3) {
        this.schema = str;
        this.cacheKey = str2;
        this.purchaseRewards = str3;
    }
}
