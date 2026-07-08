package com.ss.android.ugc.aweme.creative.model.recordeffect;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SharedARModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SharedARModel> CREATOR = new Parcelable.Creator<SharedARModel>() { // from class: X.0nmy
        @Override // android.os.Parcelable.Creator
        public final SharedARModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new SharedARModel(string, string2, string3, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SharedARModel[] newArray(int i) {
            return new SharedARModel[i];
        }
    };

    @C09CT("is_current_user_host")
    public boolean isCurrentUserHost;

    @C09CT("shared_ar_multi_player_user_id")
    public String sharedARMultiPlayerUserId;

    @C09CT("shared_ar_multi_player_user_name")
    public String sharedARMultiPlayerUserName;

    @C09CT("shared_ar_session_id")
    public String sharedARSessionId;

    @C09CT("shared_ar_telco")
    public String sharedARTelco;

    public SharedARModel() {
        this(null, null, null, false, null);
    }

    public final SharedARModel copy(String str, String str2, String str3, boolean z, String str4) {
        return new SharedARModel(str, str2, str3, z, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedARModel)) {
            return false;
        }
        SharedARModel sharedARModel = (SharedARModel) obj;
        return Intrinsics.LJFF(this.sharedARMultiPlayerUserId, sharedARModel.sharedARMultiPlayerUserId) && Intrinsics.LJFF(this.sharedARMultiPlayerUserName, sharedARModel.sharedARMultiPlayerUserName) && Intrinsics.LJFF(this.sharedARSessionId, sharedARModel.sharedARSessionId) && this.isCurrentUserHost == sharedARModel.isCurrentUserHost && Intrinsics.LJFF(this.sharedARTelco, sharedARModel.sharedARTelco);
    }

    public int hashCode() {
        String str = this.sharedARMultiPlayerUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sharedARMultiPlayerUserName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sharedARSessionId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.isCurrentUserHost)) * 31;
        String str4 = this.sharedARTelco;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedARModel(sharedARMultiPlayerUserId=");
        sbLIZ.append(this.sharedARMultiPlayerUserId);
        sbLIZ.append(", sharedARMultiPlayerUserName=");
        sbLIZ.append(this.sharedARMultiPlayerUserName);
        sbLIZ.append(", sharedARSessionId=");
        sbLIZ.append(this.sharedARSessionId);
        sbLIZ.append(", isCurrentUserHost=");
        sbLIZ.append(this.isCurrentUserHost);
        sbLIZ.append(", sharedARTelco=");
        sbLIZ.append(this.sharedARTelco);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sharedARMultiPlayerUserId);
        parcel.writeString(this.sharedARMultiPlayerUserName);
        parcel.writeString(this.sharedARSessionId);
        parcel.writeInt(this.isCurrentUserHost ? 1 : 0);
        parcel.writeString(this.sharedARTelco);
    }

    public final String getSharedARMultiPlayerUserId() {
        return this.sharedARMultiPlayerUserId;
    }

    public final String getSharedARMultiPlayerUserName() {
        return this.sharedARMultiPlayerUserName;
    }

    public final String getSharedARSessionId() {
        return this.sharedARSessionId;
    }

    public final String getSharedARTelco() {
        return this.sharedARTelco;
    }

    public final boolean isCurrentUserHost() {
        return this.isCurrentUserHost;
    }

    public final void setCurrentUserHost(boolean z) {
        this.isCurrentUserHost = z;
    }

    public final void setSharedARMultiPlayerUserId(String str) {
        this.sharedARMultiPlayerUserId = str;
    }

    public final void setSharedARMultiPlayerUserName(String str) {
        this.sharedARMultiPlayerUserName = str;
    }

    public final void setSharedARSessionId(String str) {
        this.sharedARSessionId = str;
    }

    public final void setSharedARTelco(String str) {
        this.sharedARTelco = str;
    }

    public SharedARModel(String str, String str2, String str3, boolean z, String str4) {
        this.sharedARMultiPlayerUserId = str;
        this.sharedARMultiPlayerUserName = str2;
        this.sharedARSessionId = str3;
        this.isCurrentUserHost = z;
        this.sharedARTelco = str4;
    }
}
