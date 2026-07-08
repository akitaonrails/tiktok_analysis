package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReminderItem implements Parcelable {

    @C09CT("encoded_param")
    public final String encodeParam;

    @C09CT("event_id")
    public final String eventId;

    @C09CT("product_id")
    public final String productId;

    @C09CT("tab_id")
    public final String tabId;
    public static final Parcelable.Creator<ReminderItem> CREATOR = new Parcelable.Creator<ReminderItem>() { // from class: X.0mhO
        @Override // android.os.Parcelable.Creator
        public final ReminderItem createFromParcel(Parcel parcel) {
            return new ReminderItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReminderItem[] newArray(int i) {
            return new ReminderItem[i];
        }
    };
    public static final int $stable = 8;

    public ReminderItem() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderItem)) {
            return false;
        }
        ReminderItem reminderItem = (ReminderItem) obj;
        return Intrinsics.LJFF(this.eventId, reminderItem.eventId) && Intrinsics.LJFF(this.tabId, reminderItem.tabId) && Intrinsics.LJFF(this.productId, reminderItem.productId) && Intrinsics.LJFF(this.encodeParam, reminderItem.encodeParam);
    }

    public final int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encodeParam;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReminderItem(eventId=");
        sbLIZ.append(this.eventId);
        sbLIZ.append(", tabId=");
        sbLIZ.append(this.tabId);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", encodeParam=");
        sbLIZ.append(this.encodeParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.eventId);
        parcel.writeString(this.tabId);
        parcel.writeString(this.productId);
        parcel.writeString(this.encodeParam);
    }

    public ReminderItem(String str, String str2, String str3, String str4) {
        this.eventId = str;
        this.tabId = str2;
        this.productId = str3;
        this.encodeParam = str4;
    }
}
