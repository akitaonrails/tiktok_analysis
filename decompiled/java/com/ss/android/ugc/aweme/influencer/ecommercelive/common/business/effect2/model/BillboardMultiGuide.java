package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardMultiGuide;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardMultiGuide implements Parcelable {

    @C09CT("confirm_text")
    public final String confirmText;

    @C09CT("content")
    public final String content;

    @C09CT("display_text")
    public final String displayText;

    @C09CT("display_title")
    public final String displayTitle;

    @C09CT("img_url")
    public final String imgUrl;

    @C09CT("title_text")
    public final String titleText;
    public static final Parcelable.Creator<BillboardMultiGuide> CREATOR = new Parcelable.Creator<BillboardMultiGuide>() { // from class: X.0v5y
        @Override // android.os.Parcelable.Creator
        public final BillboardMultiGuide createFromParcel(Parcel parcel) {
            return new BillboardMultiGuide(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardMultiGuide[] newArray(int i) {
            return new BillboardMultiGuide[i];
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
        if (!(obj instanceof BillboardMultiGuide)) {
            return false;
        }
        BillboardMultiGuide billboardMultiGuide = (BillboardMultiGuide) obj;
        return Intrinsics.LJFF(this.imgUrl, billboardMultiGuide.imgUrl) && Intrinsics.LJFF(this.titleText, billboardMultiGuide.titleText) && Intrinsics.LJFF(this.content, billboardMultiGuide.content) && Intrinsics.LJFF(this.confirmText, billboardMultiGuide.confirmText) && Intrinsics.LJFF(this.displayTitle, billboardMultiGuide.displayTitle) && Intrinsics.LJFF(this.displayText, billboardMultiGuide.displayText);
    }

    public final int hashCode() {
        String str = this.imgUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.confirmText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayTitle;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayText;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardMultiGuide(imgUrl=");
        sbLIZ.append(this.imgUrl);
        sbLIZ.append(", titleText=");
        sbLIZ.append(this.titleText);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", confirmText=");
        sbLIZ.append(this.confirmText);
        sbLIZ.append(", displayTitle=");
        sbLIZ.append(this.displayTitle);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imgUrl);
        parcel.writeString(this.titleText);
        parcel.writeString(this.content);
        parcel.writeString(this.confirmText);
        parcel.writeString(this.displayTitle);
        parcel.writeString(this.displayText);
    }

    public BillboardMultiGuide(String str, String str2, String str3, String str4, String str5, String str6) {
        this.imgUrl = str;
        this.titleText = str2;
        this.content = str3;
        this.confirmText = str4;
        this.displayTitle = str5;
        this.displayText = str6;
    }
}
