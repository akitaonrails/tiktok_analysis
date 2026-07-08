package com.ss.android.ugc.aweme.theater.creation.auto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.creation.auto.AutoGenTaskModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoGenTaskModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<AutoGenTaskModel> CREATOR = new Parcelable.Creator<AutoGenTaskModel>() { // from class: X.0MU9
        @Override // android.os.Parcelable.Creator
        public final AutoGenTaskModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AutoGenTaskModel(string, string2, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoGenTaskModel[] newArray(int i) {
            return new AutoGenTaskModel[i];
        }
    };

    @C09CT("client_task_id")
    public final String clientTaskId;

    @C09CT("draftId")
    public final Integer draftId;

    @C09CT("task_id")
    public final String serverTaskId;

    public AutoGenTaskModel() {
        this(null, null, null);
    }

    public final AutoGenTaskModel copy(String str, String str2, Integer num) {
        return new AutoGenTaskModel(str, str2, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoGenTaskModel)) {
            return false;
        }
        AutoGenTaskModel autoGenTaskModel = (AutoGenTaskModel) obj;
        return Intrinsics.LJFF(this.clientTaskId, autoGenTaskModel.clientTaskId) && Intrinsics.LJFF(this.serverTaskId, autoGenTaskModel.serverTaskId) && Intrinsics.LJFF(this.draftId, autoGenTaskModel.draftId);
    }

    public int hashCode() {
        String str = this.clientTaskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serverTaskId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.draftId;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoGenTaskModel(clientTaskId=");
        sbLIZ.append(this.clientTaskId);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", draftId=");
        sbLIZ.append(this.draftId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.clientTaskId);
        parcel.writeString(this.serverTaskId);
        Integer num = this.draftId;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public final String getClientTaskId() {
        return this.clientTaskId;
    }

    public final Integer getDraftId() {
        return this.draftId;
    }

    public final String getServerTaskId() {
        return this.serverTaskId;
    }

    public AutoGenTaskModel(String str, String str2, Integer num) {
        this.clientTaskId = str;
        this.serverTaskId = str2;
        this.draftId = num;
    }
}
