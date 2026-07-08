package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AlertToneValueItem implements Parcelable {
    public static final Parcelable.Creator<AlertToneValueItem> CREATOR = new Parcelable.Creator<AlertToneValueItem>() { // from class: X.0Yy0
        @Override // android.os.Parcelable.Creator
        public final AlertToneValueItem createFromParcel(Parcel parcel) {
            return new AlertToneValueItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlertToneValueItem[] newArray(int i) {
            return new AlertToneValueItem[i];
        }
    };

    @C09CT("alert_value")
    public final String alertToneValue;

    @C09CT("alert_value_subtitle")
    public final String alertToneValueSubtitle;

    @C09CT("alert_value_title")
    public final String alertToneValueTitle;

    @C09CT("alert_value_url")
    public final String alertToneValueUrl;

    public AlertToneValueItem() {
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
        if (!(obj instanceof AlertToneValueItem)) {
            return false;
        }
        AlertToneValueItem alertToneValueItem = (AlertToneValueItem) obj;
        return Intrinsics.LJFF(this.alertToneValue, alertToneValueItem.alertToneValue) && Intrinsics.LJFF(this.alertToneValueTitle, alertToneValueItem.alertToneValueTitle) && Intrinsics.LJFF(this.alertToneValueSubtitle, alertToneValueItem.alertToneValueSubtitle) && Intrinsics.LJFF(this.alertToneValueUrl, alertToneValueItem.alertToneValueUrl);
    }

    public final int hashCode() {
        String str = this.alertToneValue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alertToneValueTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.alertToneValueSubtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.alertToneValueUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlertToneValueItem(alertToneValue=");
        sbLIZ.append(this.alertToneValue);
        sbLIZ.append(", alertToneValueTitle=");
        sbLIZ.append(this.alertToneValueTitle);
        sbLIZ.append(", alertToneValueSubtitle=");
        sbLIZ.append(this.alertToneValueSubtitle);
        sbLIZ.append(", alertToneValueUrl=");
        sbLIZ.append(this.alertToneValueUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.alertToneValue);
        parcel.writeString(this.alertToneValueTitle);
        parcel.writeString(this.alertToneValueSubtitle);
        parcel.writeString(this.alertToneValueUrl);
    }

    public AlertToneValueItem(String str, String str2, String str3, String str4) {
        this.alertToneValue = str;
        this.alertToneValueTitle = str2;
        this.alertToneValueSubtitle = str3;
        this.alertToneValueUrl = str4;
    }
}
