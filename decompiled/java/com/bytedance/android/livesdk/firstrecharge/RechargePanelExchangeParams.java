package com.bytedance.android.livesdk.firstrecharge;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargePanelExchangeParams implements Parcelable {
    public static final Parcelable.Creator<RechargePanelExchangeParams> CREATOR = new Parcelable.Creator<RechargePanelExchangeParams>() { // from class: X.0fsU
        @Override // android.os.Parcelable.Creator
        public final RechargePanelExchangeParams createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long lValueOf;
            Long lValueOf2;
            Long lValueOf3;
            Long lValueOf4;
            Integer numValueOf2;
            Long lValueOf5;
            Integer numValueOf3;
            Long lValueOf6;
            Integer numValueOf4;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf5 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf3 = null;
            } else {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf4 = null;
            } else {
                lValueOf4 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf5 = null;
            } else {
                lValueOf5 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                lValueOf6 = null;
            } else {
                lValueOf6 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            return new RechargePanelExchangeParams(string, string2, string3, numValueOf, lValueOf, lValueOf2, lValueOf3, lValueOf4, numValueOf2, lValueOf5, numValueOf3, lValueOf6, numValueOf4, numValueOf5);
        }

        @Override // android.os.Parcelable.Creator
        public final RechargePanelExchangeParams[] newArray(int i) {
            return new RechargePanelExchangeParams[i];
        }
    };
    public final String balance;
    public final Long basePackageId;
    public final Long basePackagePrice;
    public final String currencyCode;
    public final Integer exchangeTypeForFirst;
    public final Integer isPeriodicPayout;
    public final Integer keepDot;
    public final Integer localKeepDot;
    public final Long localPrice;
    public final Long localPriceRealDot;
    public final Long maxCoins;
    public final Long realDot;
    public final String symbol;
    public final Integer way;

    public RechargePanelExchangeParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RechargePanelExchangeParams)) {
            return false;
        }
        RechargePanelExchangeParams rechargePanelExchangeParams = (RechargePanelExchangeParams) obj;
        return Intrinsics.LJFF(this.balance, rechargePanelExchangeParams.balance) && Intrinsics.LJFF(this.currencyCode, rechargePanelExchangeParams.currencyCode) && Intrinsics.LJFF(this.symbol, rechargePanelExchangeParams.symbol) && Intrinsics.LJFF(this.keepDot, rechargePanelExchangeParams.keepDot) && Intrinsics.LJFF(this.maxCoins, rechargePanelExchangeParams.maxCoins) && Intrinsics.LJFF(this.basePackageId, rechargePanelExchangeParams.basePackageId) && Intrinsics.LJFF(this.basePackagePrice, rechargePanelExchangeParams.basePackagePrice) && Intrinsics.LJFF(this.realDot, rechargePanelExchangeParams.realDot) && Intrinsics.LJFF(this.way, rechargePanelExchangeParams.way) && Intrinsics.LJFF(this.localPriceRealDot, rechargePanelExchangeParams.localPriceRealDot) && Intrinsics.LJFF(this.localKeepDot, rechargePanelExchangeParams.localKeepDot) && Intrinsics.LJFF(this.localPrice, rechargePanelExchangeParams.localPrice) && Intrinsics.LJFF(this.exchangeTypeForFirst, rechargePanelExchangeParams.exchangeTypeForFirst) && Intrinsics.LJFF(this.isPeriodicPayout, rechargePanelExchangeParams.isPeriodicPayout);
    }

    public final int hashCode() {
        String str = this.balance;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.keepDot;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.maxCoins;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.basePackageId;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.basePackagePrice;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.realDot;
        int iHashCode8 = (iHashCode7 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num2 = this.way;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l5 = this.localPriceRealDot;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num3 = this.localKeepDot;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l6 = this.localPrice;
        int iHashCode12 = (iHashCode11 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num4 = this.exchangeTypeForFirst;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.isPeriodicPayout;
        return iHashCode13 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "RechargePanelExchangeParams(balance=" + this.balance + ", currencyCode=" + this.currencyCode + ", symbol=" + this.symbol + ", keepDot=" + this.keepDot + ", maxCoins=" + this.maxCoins + ", basePackageId=" + this.basePackageId + ", basePackagePrice=" + this.basePackagePrice + ", realDot=" + this.realDot + ", way=" + this.way + ", localPriceRealDot=" + this.localPriceRealDot + ", localKeepDot=" + this.localKeepDot + ", localPrice=" + this.localPrice + ", exchangeTypeForFirst=" + this.exchangeTypeForFirst + ", isPeriodicPayout=" + this.isPeriodicPayout + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.balance);
        parcel.writeString(this.currencyCode);
        parcel.writeString(this.symbol);
        Integer num = this.keepDot;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.maxCoins;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.basePackageId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.basePackagePrice;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.realDot;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Integer num2 = this.way;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l5 = this.localPriceRealDot;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        Integer num3 = this.localKeepDot;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Long l6 = this.localPrice;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        Integer num4 = this.exchangeTypeForFirst;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.isPeriodicPayout;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public RechargePanelExchangeParams(String str, String str2, String str3, Integer num, Long l, Long l2, Long l3, Long l4, Integer num2, Long l5, Integer num3, Long l6, Integer num4, Integer num5) {
        this.balance = str;
        this.currencyCode = str2;
        this.symbol = str3;
        this.keepDot = num;
        this.maxCoins = l;
        this.basePackageId = l2;
        this.basePackagePrice = l3;
        this.realDot = l4;
        this.way = num2;
        this.localPriceRealDot = l5;
        this.localKeepDot = num3;
        this.localPrice = l6;
        this.exchangeTypeForFirst = num4;
        this.isPeriodicPayout = num5;
    }
}
