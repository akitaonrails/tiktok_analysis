package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemExtra;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddItemExtra implements Parcelable {

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("entrance_info")
    public final String entranceInfo;

    @C09CT("platform_link_based_item")
    public final PlatformLinkInfo platformLinkInfo;

    @C09CT("source_info")
    public final String sourceInfo;
    public static final Parcelable.Creator<AddItemExtra> CREATOR = new Parcelable.Creator<AddItemExtra>() { // from class: X.02qg
        @Override // android.os.Parcelable.Creator
        public final AddItemExtra createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AddItemExtra(string, string2, string3, numValueOf, (PlatformLinkInfo) parcel.readParcelable(AddItemExtra.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AddItemExtra[] newArray(int i) {
            return new AddItemExtra[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddItemExtra)) {
            return false;
        }
        AddItemExtra addItemExtra = (AddItemExtra) obj;
        return Intrinsics.LJFF(this.entranceInfo, addItemExtra.entranceInfo) && Intrinsics.LJFF(this.chainKey, addItemExtra.chainKey) && Intrinsics.LJFF(this.sourceInfo, addItemExtra.sourceInfo) && Intrinsics.LJFF(this.bizType, addItemExtra.bizType) && Intrinsics.LJFF(this.platformLinkInfo, addItemExtra.platformLinkInfo);
    }

    public final int hashCode() {
        String str = this.entranceInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chainKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceInfo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.bizType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        PlatformLinkInfo platformLinkInfo = this.platformLinkInfo;
        return iHashCode4 + (platformLinkInfo != null ? platformLinkInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddItemExtra(entranceInfo=");
        sbLIZ.append(this.entranceInfo);
        sbLIZ.append(", chainKey=");
        sbLIZ.append(this.chainKey);
        sbLIZ.append(", sourceInfo=");
        sbLIZ.append(this.sourceInfo);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(", platformLinkInfo=");
        sbLIZ.append(this.platformLinkInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.entranceInfo);
        parcel.writeString(this.chainKey);
        parcel.writeString(this.sourceInfo);
        Integer num = this.bizType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.platformLinkInfo, i);
    }

    public AddItemExtra(String str, String str2, String str3, Integer num, PlatformLinkInfo platformLinkInfo) {
        this.entranceInfo = str;
        this.chainKey = str2;
        this.sourceInfo = str3;
        this.bizType = num;
        this.platformLinkInfo = platformLinkInfo;
    }
}
