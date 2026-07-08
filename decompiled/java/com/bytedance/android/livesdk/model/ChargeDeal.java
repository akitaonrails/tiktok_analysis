package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class ChargeDeal implements Parcelable {
    public static final Parcelable.Creator<ChargeDeal> CREATOR = new C1864730ycp(7);
    public boolean mChosen;

    @C09CT("coupon_id")
    public String mCouponId;

    @C09CT("currency_price")
    public List<CurrencyPrice> mCurrencyPrice;

    @C09CT("describe")
    public String mDescribe;

    @C09CT("diamond_count")
    public int mDiamondCount;

    @C09CT("exchange_price")
    public int mExchangePrice;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long mId;

    @C09CT("price")
    public int mPrice;

    @C09CT("giving_count")
    public int mRewardDiamondCount;

    @C09CT("iap_id")
    public String mSku;
    public transient HsSkuDetail mSkuDetail;
    public int totalDiamond;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ChargeDeal() {
        this.mDescribe = "";
    }

    public static class CurrencyPrice implements Parcelable {
        public static final Parcelable.Creator<CurrencyPrice> CREATOR = new C1864730ycp(5);

        @C09CT("currency")
        public String currency;

        @C09CT("price")
        public String price;

        @C09CT("price_show_form")
        public String priceShowForm;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public CurrencyPrice(Parcel parcel) {
            this.currency = parcel.readString();
            this.price = parcel.readString();
            this.priceShowForm = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.currency);
            parcel.writeString(this.price);
            parcel.writeString(this.priceShowForm);
        }
    }

    public static class HsSkuDetail implements Parcelable {
        public static final Parcelable.Creator<HsSkuDetail> CREATOR = new C1864730ycp(6);
        public final String description;
        public final String price;
        public final String priceCurrencyCode;
        public final String sku;
        public final String title;
        public final String type;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public HsSkuDetail(Parcel parcel) {
            this.sku = parcel.readString();
            this.type = parcel.readString();
            this.price = parcel.readString();
            this.title = parcel.readString();
            this.description = parcel.readString();
            this.priceCurrencyCode = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.sku);
            parcel.writeString(this.type);
            parcel.writeString(this.price);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.priceCurrencyCode);
        }
    }

    public ChargeDeal(Parcel parcel) {
        boolean z;
        this.mDescribe = "";
        this.mId = parcel.readLong();
        this.mExchangePrice = parcel.readInt();
        this.mPrice = parcel.readInt();
        this.mDescribe = parcel.readString();
        this.mDiamondCount = parcel.readInt();
        this.mRewardDiamondCount = parcel.readInt();
        this.mSku = parcel.readString();
        this.mCurrencyPrice = parcel.createTypedArrayList(CurrencyPrice.CREATOR);
        this.totalDiamond = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mChosen = z;
        this.mCouponId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mId);
        parcel.writeInt(this.mExchangePrice);
        parcel.writeInt(this.mPrice);
        parcel.writeString(this.mDescribe);
        parcel.writeInt(this.mDiamondCount);
        parcel.writeInt(this.mRewardDiamondCount);
        parcel.writeString(this.mSku);
        parcel.writeTypedList(this.mCurrencyPrice);
        parcel.writeInt(this.totalDiamond);
        parcel.writeByte(this.mChosen ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mCouponId);
    }
}
