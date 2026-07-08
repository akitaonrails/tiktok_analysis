package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C7902036u;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ReminderButton implements Parcelable {

    @C09CT("button_image_activated")
    public final Icon buttonImageActivated;

    @C09CT("button_image_inactivated")
    public final Icon buttonImageInactivated;

    @C09CT("button_status")
    public final int buttonStatus;

    @C09CT("button_type")
    public final int buttonType;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("request_params")
    public final String requestParams;
    public static final C7902036u Companion = new C7902036u();
    public static final Parcelable.Creator<ReminderButton> CREATOR = new Parcelable.Creator<ReminderButton>() { // from class: X.036t
        @Override // android.os.Parcelable.Creator
        public final ReminderButton createFromParcel(Parcel parcel) {
            return new ReminderButton(parcel.readInt(), parcel.readInt(), (Icon) parcel.readParcelable(ReminderButton.class.getClassLoader()), (Icon) parcel.readParcelable(ReminderButton.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReminderButton[] newArray(int i) {
            return new ReminderButton[i];
        }
    };
    public static final int $stable = 8;

    public ReminderButton() {
        this(0, 0, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderButton)) {
            return false;
        }
        ReminderButton reminderButton = (ReminderButton) obj;
        return this.buttonType == reminderButton.buttonType && this.buttonStatus == reminderButton.buttonStatus && Intrinsics.LJFF(this.buttonImageInactivated, reminderButton.buttonImageInactivated) && Intrinsics.LJFF(this.buttonImageActivated, reminderButton.buttonImageActivated) && Intrinsics.LJFF(this.requestParams, reminderButton.requestParams) && Intrinsics.LJFF(this.eventName, reminderButton.eventName);
    }

    public final int hashCode() {
        int i = ((this.buttonType * 31) + this.buttonStatus) * 31;
        Icon icon = this.buttonImageInactivated;
        int iHashCode = (i + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.buttonImageActivated;
        int iHashCode2 = (iHashCode + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        String str = this.requestParams;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventName;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReminderButton(buttonType=");
        sbLIZ.append(this.buttonType);
        sbLIZ.append(", buttonStatus=");
        sbLIZ.append(this.buttonStatus);
        sbLIZ.append(", buttonImageInactivated=");
        sbLIZ.append(this.buttonImageInactivated);
        sbLIZ.append(", buttonImageActivated=");
        sbLIZ.append(this.buttonImageActivated);
        sbLIZ.append(", requestParams=");
        sbLIZ.append(this.requestParams);
        sbLIZ.append(", eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.buttonType);
        parcel.writeInt(this.buttonStatus);
        parcel.writeParcelable(this.buttonImageInactivated, i);
        parcel.writeParcelable(this.buttonImageActivated, i);
        parcel.writeString(this.requestParams);
        parcel.writeString(this.eventName);
    }

    public static ReminderButton LIZ(ReminderButton reminderButton) {
        int i = reminderButton.buttonType;
        int i2 = reminderButton.buttonStatus;
        Icon icon = reminderButton.buttonImageInactivated;
        Icon icon2 = reminderButton.buttonImageActivated;
        reminderButton.getClass();
        return new ReminderButton(i, i2, icon, icon2, null, null);
    }

    public ReminderButton(int i, int i2, Icon icon, Icon icon2, String str, String str2) {
        this.buttonType = i;
        this.buttonStatus = i2;
        this.buttonImageInactivated = icon;
        this.buttonImageActivated = icon2;
        this.requestParams = str;
        this.eventName = str2;
    }
}
