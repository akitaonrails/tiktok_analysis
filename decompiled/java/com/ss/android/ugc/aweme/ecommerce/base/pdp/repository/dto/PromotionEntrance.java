package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C04GG;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionEntrance implements Parcelable {
    public static final int DEFAULT = 0;

    @C09CT("banner_info")
    public final EntranceBannerInfo bannerInfo;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("call_promotion_info_get")
    public final Boolean callPromotionInfo;

    @C09CT("countdown")
    public final String countdown;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("end_time")
    public final String endTime;

    @C09CT("entrance_style")
    public final Integer entranceStyle;

    @C09CT("flash_sale_status")
    public final Integer flashSaleStatus;

    @C09CT("relate_products")
    public final List<RelateProduct> relateProducts;

    @C09CT("schema")
    public final String schema;

    @C09CT("start_time")
    public final String startTime;

    @C09CT("title")
    public final String title;
    public static final C04GG Companion = new Object() { // from class: X.04GG
    };
    public static final Parcelable.Creator<PromotionEntrance> CREATOR = new Parcelable.Creator<PromotionEntrance>() { // from class: X.04GE
        @Override // android.os.Parcelable.Creator
        public final PromotionEntrance createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            EntranceBannerInfo entranceBannerInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RelateProduct.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                entranceBannerInfoCreateFromParcel = EntranceBannerInfo.CREATOR.createFromParcel(parcel);
            }
            return new PromotionEntrance(string, string2, string3, numValueOf, numValueOf2, string4, string5, string6, boolValueOf, arrayList, entranceBannerInfoCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionEntrance[] newArray(int i) {
            return new PromotionEntrance[i];
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
        if (!(obj instanceof PromotionEntrance)) {
            return false;
        }
        PromotionEntrance promotionEntrance = (PromotionEntrance) obj;
        return Intrinsics.LJFF(this.title, promotionEntrance.title) && Intrinsics.LJFF(this.buttonText, promotionEntrance.buttonText) && Intrinsics.LJFF(this.schema, promotionEntrance.schema) && Intrinsics.LJFF(this.entranceStyle, promotionEntrance.entranceStyle) && Intrinsics.LJFF(this.flashSaleStatus, promotionEntrance.flashSaleStatus) && Intrinsics.LJFF(this.startTime, promotionEntrance.startTime) && Intrinsics.LJFF(this.countdown, promotionEntrance.countdown) && Intrinsics.LJFF(this.endTime, promotionEntrance.endTime) && Intrinsics.LJFF(this.callPromotionInfo, promotionEntrance.callPromotionInfo) && Intrinsics.LJFF(this.relateProducts, promotionEntrance.relateProducts) && Intrinsics.LJFF(this.bannerInfo, promotionEntrance.bannerInfo) && Intrinsics.LJFF(this.daInfo, promotionEntrance.daInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.schema;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.entranceStyle;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.flashSaleStatus;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.startTime;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countdown;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endTime;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.callPromotionInfo;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<RelateProduct> list = this.relateProducts;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        EntranceBannerInfo entranceBannerInfo = this.bannerInfo;
        int iHashCode11 = (iHashCode10 + (entranceBannerInfo == null ? 0 : entranceBannerInfo.hashCode())) * 31;
        String str7 = this.daInfo;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "PromotionEntrance(title=" + this.title + ", buttonText=" + this.buttonText + ", schema=" + this.schema + ", entranceStyle=" + this.entranceStyle + ", flashSaleStatus=" + this.flashSaleStatus + ", startTime=" + this.startTime + ", countdown=" + this.countdown + ", endTime=" + this.endTime + ", callPromotionInfo=" + this.callPromotionInfo + ", relateProducts=" + this.relateProducts + ", bannerInfo=" + this.bannerInfo + ", daInfo=" + this.daInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.schema);
        Integer num = this.entranceStyle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.flashSaleStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.startTime);
        parcel.writeString(this.countdown);
        parcel.writeString(this.endTime);
        Boolean bool = this.callPromotionInfo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<RelateProduct> list = this.relateProducts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RelateProduct> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        EntranceBannerInfo entranceBannerInfo = this.bannerInfo;
        if (entranceBannerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entranceBannerInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public PromotionEntrance(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, String str6, Boolean bool, List<RelateProduct> list, EntranceBannerInfo entranceBannerInfo, String str7) {
        this.title = str;
        this.buttonText = str2;
        this.schema = str3;
        this.entranceStyle = num;
        this.flashSaleStatus = num2;
        this.startTime = str4;
        this.countdown = str5;
        this.endTime = str6;
        this.callPromotionInfo = bool;
        this.relateProducts = list;
        this.bannerInfo = entranceBannerInfo;
        this.daInfo = str7;
    }
}
