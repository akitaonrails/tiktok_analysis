package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailPopup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SellerDetailInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SellerDetailInfo> CREATOR = new Parcelable.Creator<SellerDetailInfo>() { // from class: X.02YC
        @Override // android.os.Parcelable.Creator
        public final SellerDetailInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            SellerDetailPopup sellerDetailPopupCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                sellerDetailPopupCreateFromParcel = SellerDetailPopup.CREATOR.createFromParcel(parcel);
            }
            return new SellerDetailInfo(string, string2, lValueOf, string3, string4, sellerDetailPopupCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SellerDetailInfo[] newArray(int i) {
            return new SellerDetailInfo[i];
        }
    };

    @C09CT("content")
    public String content;

    @C09CT("count")
    public Long count;

    @C09CT("count_show_content")
    public String countShowContent;

    @C09CT("head_tag")
    public String headTag;

    @C09CT("key")
    public String key;

    @C09CT("seller_detail_popup")
    public SellerDetailPopup sellerDetailPopup;

    public SellerDetailInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerDetailInfo)) {
            return false;
        }
        SellerDetailInfo sellerDetailInfo = (SellerDetailInfo) obj;
        return Intrinsics.LJFF(this.key, sellerDetailInfo.key) && Intrinsics.LJFF(this.countShowContent, sellerDetailInfo.countShowContent) && Intrinsics.LJFF(this.count, sellerDetailInfo.count) && Intrinsics.LJFF(this.content, sellerDetailInfo.content) && Intrinsics.LJFF(this.headTag, sellerDetailInfo.headTag) && Intrinsics.LJFF(this.sellerDetailPopup, sellerDetailInfo.sellerDetailPopup);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countShowContent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.count;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.headTag;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SellerDetailPopup sellerDetailPopup = this.sellerDetailPopup;
        return iHashCode5 + (sellerDetailPopup != null ? sellerDetailPopup.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SellerDetailInfo(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", countShowContent=");
        sbLIZ.append(this.countShowContent);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", headTag=");
        sbLIZ.append(this.headTag);
        sbLIZ.append(", sellerDetailPopup=");
        sbLIZ.append(this.sellerDetailPopup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.countShowContent);
        Long l = this.count;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.content);
        parcel.writeString(this.headTag);
        SellerDetailPopup sellerDetailPopup = this.sellerDetailPopup;
        if (sellerDetailPopup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sellerDetailPopup.content);
        }
    }

    public SellerDetailInfo(String str, String str2, Long l, String str3, String str4, SellerDetailPopup sellerDetailPopup) {
        this.key = str;
        this.countShowContent = str2;
        this.count = l;
        this.content = str3;
        this.headTag = str4;
        this.sellerDetailPopup = sellerDetailPopup;
    }
}
