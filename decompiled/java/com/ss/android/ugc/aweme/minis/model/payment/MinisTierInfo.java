package com.ss.android.ugc.aweme.minis.model.payment;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.MinisTierInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisTierInfo implements Parcelable {

    @C09CT("currency")
    public final String currency;

    @C09CT("price")
    public final String price;

    @C09CT("sku_id")
    public final String sku_id;

    @C09CT("symbol")
    public final String symbol;

    @C09CT("tier_id")
    public final String tierId;

    @C09CT("tier_name")
    public final String tierName;

    @C09CT("token_amount")
    public final long tokenAmount;

    @C09CT("token_type")
    public final String tokenType;

    @C09CT("web_price")
    public final String webPrice;

    @C09CT("web_price_discount_amount")
    public final String webPriceDiscountAmount;

    @C09CT("web_price_discount_rate")
    public final String webPriceDiscountRate;
    public static final Parcelable.Creator<MinisTierInfo> CREATOR = new Parcelable.Creator<MinisTierInfo>() { // from class: X.1B00
        @Override // android.os.Parcelable.Creator
        public final MinisTierInfo createFromParcel(Parcel parcel) {
            return new MinisTierInfo(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisTierInfo[] newArray(int i) {
            return new MinisTierInfo[i];
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
        if (!(obj instanceof MinisTierInfo)) {
            return false;
        }
        MinisTierInfo minisTierInfo = (MinisTierInfo) obj;
        return Intrinsics.LJFF(this.tierId, minisTierInfo.tierId) && Intrinsics.LJFF(this.tierName, minisTierInfo.tierName) && this.tokenAmount == minisTierInfo.tokenAmount && Intrinsics.LJFF(this.tokenType, minisTierInfo.tokenType) && Intrinsics.LJFF(this.price, minisTierInfo.price) && Intrinsics.LJFF(this.sku_id, minisTierInfo.sku_id) && Intrinsics.LJFF(this.currency, minisTierInfo.currency) && Intrinsics.LJFF(this.symbol, minisTierInfo.symbol) && Intrinsics.LJFF(this.webPrice, minisTierInfo.webPrice) && Intrinsics.LJFF(this.webPriceDiscountAmount, minisTierInfo.webPriceDiscountAmount) && Intrinsics.LJFF(this.webPriceDiscountRate, minisTierInfo.webPriceDiscountRate);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.tierId.hashCode() * 31) + this.tierName.hashCode()) * 31) + C786410Ut5.Y2(this.tokenAmount)) * 31) + this.tokenType.hashCode()) * 31) + this.price.hashCode()) * 31) + this.sku_id.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.webPrice.hashCode()) * 31) + this.webPriceDiscountAmount.hashCode()) * 31) + this.webPriceDiscountRate.hashCode();
    }

    public final String toString() {
        return "MinisTierInfo(tierId=" + this.tierId + ", tierName=" + this.tierName + ", tokenAmount=" + this.tokenAmount + ", tokenType=" + this.tokenType + ", price=" + this.price + ", sku_id=" + this.sku_id + ", currency=" + this.currency + ", symbol=" + this.symbol + ", webPrice=" + this.webPrice + ", webPriceDiscountAmount=" + this.webPriceDiscountAmount + ", webPriceDiscountRate=" + this.webPriceDiscountRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tierId);
        parcel.writeString(this.tierName);
        parcel.writeLong(this.tokenAmount);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.price);
        parcel.writeString(this.sku_id);
        parcel.writeString(this.currency);
        parcel.writeString(this.symbol);
        parcel.writeString(this.webPrice);
        parcel.writeString(this.webPriceDiscountAmount);
        parcel.writeString(this.webPriceDiscountRate);
    }

    public MinisTierInfo() {
        this("", "", 0L, "", "", "", "", "", "", "", "");
    }

    public MinisTierInfo(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.tierId = str;
        this.tierName = str2;
        this.tokenAmount = j;
        this.tokenType = str3;
        this.price = str4;
        this.sku_id = str5;
        this.currency = str6;
        this.symbol = str7;
        this.webPrice = str8;
        this.webPriceDiscountAmount = str9;
        this.webPriceDiscountRate = str10;
    }
}
