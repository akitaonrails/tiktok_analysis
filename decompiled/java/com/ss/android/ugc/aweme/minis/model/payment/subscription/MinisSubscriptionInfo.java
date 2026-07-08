package com.ss.android.ugc.aweme.minis.model.payment.subscription;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisSubscriptionInfo implements Parcelable {

    @C09CT("amount")
    public final String amount;

    @C09CT("begin_time")
    public final Long beginTime;

    @C09CT("benefit_status")
    public final Long benefitStatus;

    @C09CT("cancel_time")
    public final Long cancelTime;

    @C09CT("client_icon")
    public final String clientIcon;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("client_name")
    public final String clientName;

    @C09CT("currency")
    public final String currency;

    @C09CT("deduct_cycle")
    public final Integer deductCycle;

    @C09CT("deduct_type")
    public final String deductType;

    @C09CT("end_time")
    public final Long endTime;

    @C09CT("is_mock")
    public final Boolean isMock;

    @C09CT("minis_desc")
    public final String minisDesc;

    @C09CT("minis_url")
    public final String minisUrl;

    @C09CT("next_deduct_time")
    public final Long nextDeductTime;

    @C09CT("onhold_end_time")
    public final Long onholdEndTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public String status;

    @C09CT("subscription_id")
    public final String subscriptionId;

    @C09CT("symbol")
    public final String symbol;

    @C09CT("tier_id")
    public final String tierId;
    public static final Parcelable.Creator<MinisSubscriptionInfo> CREATOR = new Parcelable.Creator<MinisSubscriptionInfo>() { // from class: X.0iB7
        @Override // android.os.Parcelable.Creator
        public final MinisSubscriptionInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Long lValueOf;
            Long lValueOf2;
            Long lValueOf3;
            Long lValueOf4;
            Long lValueOf5;
            Long lValueOf6;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
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
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf5 = null;
            } else {
                lValueOf5 = Long.valueOf(parcel.readLong());
            }
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf6 = null;
            } else {
                lValueOf6 = Long.valueOf(parcel.readLong());
            }
            String string12 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new MinisSubscriptionInfo(string, string2, string3, string4, numValueOf, string5, string6, string7, string8, lValueOf, lValueOf2, lValueOf3, lValueOf4, string9, string10, lValueOf5, string11, lValueOf6, string12, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisSubscriptionInfo[] newArray(int i) {
            return new MinisSubscriptionInfo[i];
        }
    };
    public static final int $stable = 8;

    public MinisSubscriptionInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisSubscriptionInfo)) {
            return false;
        }
        MinisSubscriptionInfo minisSubscriptionInfo = (MinisSubscriptionInfo) obj;
        return Intrinsics.LJFF(this.clientKey, minisSubscriptionInfo.clientKey) && Intrinsics.LJFF(this.clientName, minisSubscriptionInfo.clientName) && Intrinsics.LJFF(this.clientIcon, minisSubscriptionInfo.clientIcon) && Intrinsics.LJFF(this.subscriptionId, minisSubscriptionInfo.subscriptionId) && Intrinsics.LJFF(this.deductCycle, minisSubscriptionInfo.deductCycle) && Intrinsics.LJFF(this.deductType, minisSubscriptionInfo.deductType) && Intrinsics.LJFF(this.amount, minisSubscriptionInfo.amount) && Intrinsics.LJFF(this.currency, minisSubscriptionInfo.currency) && Intrinsics.LJFF(this.status, minisSubscriptionInfo.status) && Intrinsics.LJFF(this.beginTime, minisSubscriptionInfo.beginTime) && Intrinsics.LJFF(this.endTime, minisSubscriptionInfo.endTime) && Intrinsics.LJFF(this.nextDeductTime, minisSubscriptionInfo.nextDeductTime) && Intrinsics.LJFF(this.cancelTime, minisSubscriptionInfo.cancelTime) && Intrinsics.LJFF(this.minisUrl, minisSubscriptionInfo.minisUrl) && Intrinsics.LJFF(this.minisDesc, minisSubscriptionInfo.minisDesc) && Intrinsics.LJFF(this.onholdEndTime, minisSubscriptionInfo.onholdEndTime) && Intrinsics.LJFF(this.symbol, minisSubscriptionInfo.symbol) && Intrinsics.LJFF(this.benefitStatus, minisSubscriptionInfo.benefitStatus) && Intrinsics.LJFF(this.tierId, minisSubscriptionInfo.tierId) && Intrinsics.LJFF(this.isMock, minisSubscriptionInfo.isMock);
    }

    public final int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subscriptionId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.deductCycle;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.deductType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.amount;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currency;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.beginTime;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.nextDeductTime;
        int iHashCode12 = (iHashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.cancelTime;
        int iHashCode13 = (iHashCode12 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str9 = this.minisUrl;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.minisDesc;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l5 = this.onholdEndTime;
        int iHashCode16 = (iHashCode15 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str11 = this.symbol;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l6 = this.benefitStatus;
        int iHashCode18 = (iHashCode17 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str12 = this.tierId;
        int iHashCode19 = (iHashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.isMock;
        return iHashCode19 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "MinisSubscriptionInfo(clientKey=" + this.clientKey + ", clientName=" + this.clientName + ", clientIcon=" + this.clientIcon + ", subscriptionId=" + this.subscriptionId + ", deductCycle=" + this.deductCycle + ", deductType=" + this.deductType + ", amount=" + this.amount + ", currency=" + this.currency + ", status=" + this.status + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", nextDeductTime=" + this.nextDeductTime + ", cancelTime=" + this.cancelTime + ", minisUrl=" + this.minisUrl + ", minisDesc=" + this.minisDesc + ", onholdEndTime=" + this.onholdEndTime + ", symbol=" + this.symbol + ", benefitStatus=" + this.benefitStatus + ", tierId=" + this.tierId + ", isMock=" + this.isMock + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientKey);
        parcel.writeString(this.clientName);
        parcel.writeString(this.clientIcon);
        parcel.writeString(this.subscriptionId);
        Integer num = this.deductCycle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.deductType);
        parcel.writeString(this.amount);
        parcel.writeString(this.currency);
        parcel.writeString(this.status);
        Long l = this.beginTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.endTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.nextDeductTime;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.cancelTime;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeString(this.minisUrl);
        parcel.writeString(this.minisDesc);
        Long l5 = this.onholdEndTime;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        parcel.writeString(this.symbol);
        Long l6 = this.benefitStatus;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        parcel.writeString(this.tierId);
        Boolean bool = this.isMock;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public MinisSubscriptionInfo(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3, Long l4, String str9, String str10, Long l5, String str11, Long l6, String str12, Boolean bool) {
        this.clientKey = str;
        this.clientName = str2;
        this.clientIcon = str3;
        this.subscriptionId = str4;
        this.deductCycle = num;
        this.deductType = str5;
        this.amount = str6;
        this.currency = str7;
        this.status = str8;
        this.beginTime = l;
        this.endTime = l2;
        this.nextDeductTime = l3;
        this.cancelTime = l4;
        this.minisUrl = str9;
        this.minisDesc = str10;
        this.onholdEndTime = l5;
        this.symbol = str11;
        this.benefitStatus = l6;
        this.tierId = str12;
        this.isMock = bool;
    }
}
