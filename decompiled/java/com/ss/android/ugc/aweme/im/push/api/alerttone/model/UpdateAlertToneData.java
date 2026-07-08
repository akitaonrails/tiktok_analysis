package com.ss.android.ugc.aweme.im.push.api.alerttone.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.UpdateAlertToneData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class UpdateAlertToneData implements Parcelable {
    public static final Parcelable.Creator<UpdateAlertToneData> CREATOR = new Parcelable.Creator<UpdateAlertToneData>() { // from class: X.0Yxr
        @Override // android.os.Parcelable.Creator
        public final UpdateAlertToneData createFromParcel(Parcel parcel) {
            return new UpdateAlertToneData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateAlertToneData[] newArray(int i) {
            return new UpdateAlertToneData[i];
        }
    };

    @C09CT("alert_tone_scene")
    public final String alertToneScene;

    @C09CT("alert_tone_value")
    public final String alertToneValue;

    public UpdateAlertToneData() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAlertToneData)) {
            return false;
        }
        UpdateAlertToneData updateAlertToneData = (UpdateAlertToneData) obj;
        return Intrinsics.LJFF(this.alertToneScene, updateAlertToneData.alertToneScene) && Intrinsics.LJFF(this.alertToneValue, updateAlertToneData.alertToneValue);
    }

    public final int hashCode() {
        String str = this.alertToneScene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alertToneValue;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateAlertToneData(alertToneScene=");
        sbLIZ.append(this.alertToneScene);
        sbLIZ.append(", alertToneValue=");
        sbLIZ.append(this.alertToneValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.alertToneScene);
        parcel.writeString(this.alertToneValue);
    }

    public UpdateAlertToneData(String str, String str2) {
        this.alertToneScene = str;
        this.alertToneValue = str2;
    }
}
