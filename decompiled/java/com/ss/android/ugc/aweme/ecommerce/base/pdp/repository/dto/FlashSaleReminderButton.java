package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C1406300mhQ;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSaleReminderButton;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class FlashSaleReminderButton implements Parcelable {

    @C09CT("activity_code")
    public final String activityCode;

    @C09CT("encoded_param")
    public final String encodedParam;

    @C09CT("event_id")
    public final String eventId;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("product_id")
    public final String productID;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("tab_id")
    public final String tabId;
    public static final C1406300mhQ Companion = new Object() { // from class: X.0mhQ
    };
    public static final Parcelable.Creator<FlashSaleReminderButton> CREATOR = new Parcelable.Creator<FlashSaleReminderButton>() { // from class: X.0mhP
        @Override // android.os.Parcelable.Creator
        public final FlashSaleReminderButton createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new FlashSaleReminderButton(numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FlashSaleReminderButton[] newArray(int i) {
            return new FlashSaleReminderButton[i];
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
        if (!(obj instanceof FlashSaleReminderButton)) {
            return false;
        }
        FlashSaleReminderButton flashSaleReminderButton = (FlashSaleReminderButton) obj;
        return Intrinsics.LJFF(this.status, flashSaleReminderButton.status) && Intrinsics.LJFF(this.activityCode, flashSaleReminderButton.activityCode) && Intrinsics.LJFF(this.eventId, flashSaleReminderButton.eventId) && Intrinsics.LJFF(this.tabId, flashSaleReminderButton.tabId) && Intrinsics.LJFF(this.productID, flashSaleReminderButton.productID) && Intrinsics.LJFF(this.encodedParam, flashSaleReminderButton.encodedParam) && Intrinsics.LJFF(this.eventName, flashSaleReminderButton.eventName);
    }

    public final int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.activityCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tabId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productID;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.encodedParam;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eventName;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlashSaleReminderButton(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", activityCode=");
        sbLIZ.append(this.activityCode);
        sbLIZ.append(", eventId=");
        sbLIZ.append(this.eventId);
        sbLIZ.append(", tabId=");
        sbLIZ.append(this.tabId);
        sbLIZ.append(", productID=");
        sbLIZ.append(this.productID);
        sbLIZ.append(", encodedParam=");
        sbLIZ.append(this.encodedParam);
        sbLIZ.append(", eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.status;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.activityCode);
        parcel.writeString(this.eventId);
        parcel.writeString(this.tabId);
        parcel.writeString(this.productID);
        parcel.writeString(this.encodedParam);
        parcel.writeString(this.eventName);
    }

    public FlashSaleReminderButton(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.status = num;
        this.activityCode = str;
        this.eventId = str2;
        this.tabId = str3;
        this.productID = str4;
        this.encodedParam = str5;
        this.eventName = str6;
    }
}
