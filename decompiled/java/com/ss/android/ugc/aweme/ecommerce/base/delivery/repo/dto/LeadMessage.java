package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.LogisticIcon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LeadMessage implements Parcelable {

    @C09CT("delivery_text")
    public String deliveryText;

    @C09CT("delivery_text_prefix")
    public String deliveryTextPrefix;

    @C09CT("destination")
    public String destination;

    @C09CT("from_message")
    public String fromMessage;

    @C09CT("from_overseas")
    public String fromOverseas;

    @C09CT("from_overseas_v2")
    public String fromOverseasV2;

    @C09CT("icon")
    public LogisticIcon icon;

    @C09CT("icon_from")
    public LogisticIcon iconFrom;

    @C09CT("icon_to")
    public LogisticIcon iconTo;

    @C09CT("shipping_coupon_text")
    public String shippingCouponText;

    @C09CT("time_text")
    public String timeText;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<LeadMessage> CREATOR = new Parcelable.Creator<LeadMessage>() { // from class: X.02Hp
        @Override // android.os.Parcelable.Creator
        public final LeadMessage createFromParcel(Parcel parcel) {
            LogisticIcon logisticIconCreateFromParcel;
            LogisticIcon logisticIconCreateFromParcel2;
            LogisticIcon logisticIconCreateFromParcel3 = null;
            if (parcel.readInt() == 0) {
                logisticIconCreateFromParcel = null;
            } else {
                logisticIconCreateFromParcel = LogisticIcon.CREATOR.createFromParcel(parcel);
            }
            LogisticIcon logisticIcon = logisticIconCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                logisticIconCreateFromParcel2 = null;
            } else {
                logisticIconCreateFromParcel2 = LogisticIcon.CREATOR.createFromParcel(parcel);
            }
            LogisticIcon logisticIcon2 = logisticIconCreateFromParcel2;
            if (parcel.readInt() != 0) {
                logisticIconCreateFromParcel3 = LogisticIcon.CREATOR.createFromParcel(parcel);
            }
            return new LeadMessage(logisticIcon, string, string2, string3, logisticIcon2, logisticIconCreateFromParcel3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LeadMessage[] newArray(int i) {
            return new LeadMessage[i];
        }
    };
    public static final int $stable = 8;

    public LeadMessage() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadMessage)) {
            return false;
        }
        LeadMessage leadMessage = (LeadMessage) obj;
        return Intrinsics.LJFF(this.icon, leadMessage.icon) && Intrinsics.LJFF(this.title, leadMessage.title) && Intrinsics.LJFF(this.deliveryText, leadMessage.deliveryText) && Intrinsics.LJFF(this.timeText, leadMessage.timeText) && Intrinsics.LJFF(this.iconFrom, leadMessage.iconFrom) && Intrinsics.LJFF(this.iconTo, leadMessage.iconTo) && Intrinsics.LJFF(this.fromOverseas, leadMessage.fromOverseas) && Intrinsics.LJFF(this.destination, leadMessage.destination) && Intrinsics.LJFF(this.fromMessage, leadMessage.fromMessage) && Intrinsics.LJFF(this.fromOverseasV2, leadMessage.fromOverseasV2) && Intrinsics.LJFF(this.deliveryTextPrefix, leadMessage.deliveryTextPrefix) && Intrinsics.LJFF(this.shippingCouponText, leadMessage.shippingCouponText);
    }

    public final int hashCode() {
        LogisticIcon logisticIcon = this.icon;
        int iHashCode = (logisticIcon == null ? 0 : logisticIcon.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LogisticIcon logisticIcon2 = this.iconFrom;
        int iHashCode5 = (iHashCode4 + (logisticIcon2 == null ? 0 : logisticIcon2.hashCode())) * 31;
        LogisticIcon logisticIcon3 = this.iconTo;
        int iHashCode6 = (iHashCode5 + (logisticIcon3 == null ? 0 : logisticIcon3.hashCode())) * 31;
        String str4 = this.fromOverseas;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.destination;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fromMessage;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fromOverseasV2;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deliveryTextPrefix;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.shippingCouponText;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        return "LeadMessage(icon=" + this.icon + ", title=" + this.title + ", deliveryText=" + this.deliveryText + ", timeText=" + this.timeText + ", iconFrom=" + this.iconFrom + ", iconTo=" + this.iconTo + ", fromOverseas=" + this.fromOverseas + ", destination=" + this.destination + ", fromMessage=" + this.fromMessage + ", fromOverseasV2=" + this.fromOverseasV2 + ", deliveryTextPrefix=" + this.deliveryTextPrefix + ", shippingCouponText=" + this.shippingCouponText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LogisticIcon logisticIcon = this.icon;
        if (logisticIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticIcon.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.deliveryText);
        parcel.writeString(this.timeText);
        LogisticIcon logisticIcon2 = this.iconFrom;
        if (logisticIcon2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticIcon2.writeToParcel(parcel, i);
        }
        LogisticIcon logisticIcon3 = this.iconTo;
        if (logisticIcon3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticIcon3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fromOverseas);
        parcel.writeString(this.destination);
        parcel.writeString(this.fromMessage);
        parcel.writeString(this.fromOverseasV2);
        parcel.writeString(this.deliveryTextPrefix);
        parcel.writeString(this.shippingCouponText);
    }

    public LeadMessage(LogisticIcon logisticIcon, String str, String str2, String str3, LogisticIcon logisticIcon2, LogisticIcon logisticIcon3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.icon = logisticIcon;
        this.title = str;
        this.deliveryText = str2;
        this.timeText = str3;
        this.iconFrom = logisticIcon2;
        this.iconTo = logisticIcon3;
        this.fromOverseas = str4;
        this.destination = str5;
        this.fromMessage = str6;
        this.fromOverseasV2 = str7;
        this.deliveryTextPrefix = str8;
        this.shippingCouponText = str9;
    }
}
