package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.ServerExtra;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ServerExtra implements Parcelable {

    @C09CT("logid")
    public final String logId;
    public static final Parcelable.Creator<ServerExtra> CREATOR = new Parcelable.Creator<ServerExtra>() { // from class: X.0wSH
        @Override // android.os.Parcelable.Creator
        public final ServerExtra createFromParcel(Parcel parcel) {
            return new ServerExtra(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerExtra[] newArray(int i) {
            return new ServerExtra[i];
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
        return (obj instanceof ServerExtra) && Intrinsics.LJFF(this.logId, ((ServerExtra) obj).logId);
    }

    public final int hashCode() {
        return this.logId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServerExtra(logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.logId);
    }

    public ServerExtra() {
        this("");
    }

    public ServerExtra(String str) {
        this.logId = str;
    }
}
