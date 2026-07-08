package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C09CT;
import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class ShopOrderShareStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShopOrderShareStruct> CREATOR = new C1864730ycp(11);

    @C09CT("origin_item_id")
    public String originItemId;

    @C09CT("origin_user_id")
    public String originUserId;

    @C09CT("promotion_id")
    public String promotionId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStruct() {
    }

    public String getOriginItemId() {
        return this.originItemId;
    }

    public String getOriginUserId() {
        return this.originUserId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public ShopOrderShareStruct(Parcel parcel) {
        this.originUserId = parcel.readString();
        this.originItemId = parcel.readString();
        this.promotionId = parcel.readString();
    }

    public void setOriginItemId(String str) {
        this.originItemId = str;
    }

    public void setOriginUserId(String str) {
        this.originUserId = str;
    }

    public void setPromotionId(String str) {
        this.promotionId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originUserId);
        parcel.writeString(this.originItemId);
        parcel.writeString(this.promotionId);
    }
}
