package com.ss.android.ugc.aweme.shortvideo.recoverpanel;

import X.C1434650nR9;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PublishFailureReason implements Parcelable {
    public static final Parcelable.Creator<PublishFailureReason> CREATOR = new Parcelable.Creator<PublishFailureReason>() { // from class: X.0Sjd
        @Override // android.os.Parcelable.Creator
        public final PublishFailureReason createFromParcel(Parcel parcel) {
            boolean z;
            C1434650nR9 c1434650nR9 = (C1434650nR9) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PublishFailureReason(c1434650nR9, z, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishFailureReason[] newArray(int i) {
            return new PublishFailureReason[i];
        }
    };
    public final C1434650nR9 cause;
    public final String errorMsg;
    public final boolean isServerException;
    public final String scene;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishFailureReason)) {
            return false;
        }
        PublishFailureReason publishFailureReason = (PublishFailureReason) obj;
        return Intrinsics.LJFF(this.cause, publishFailureReason.cause) && this.isServerException == publishFailureReason.isServerException && Intrinsics.LJFF(this.scene, publishFailureReason.scene) && Intrinsics.LJFF(this.errorMsg, publishFailureReason.errorMsg);
    }

    public final int hashCode() {
        C1434650nR9 c1434650nR9 = this.cause;
        int iHashCode = (((((c1434650nR9 == null ? 0 : c1434650nR9.hashCode()) * 31) + C786410Ut5.Z2(this.isServerException)) * 31) + this.scene.hashCode()) * 31;
        String str = this.errorMsg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishFailureReason(cause=");
        sbLIZ.append(this.cause);
        sbLIZ.append(", isServerException=");
        sbLIZ.append(this.isServerException);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.cause);
        parcel.writeInt(this.isServerException ? 1 : 0);
        parcel.writeString(this.scene);
        parcel.writeString(this.errorMsg);
    }

    public PublishFailureReason(C1434650nR9 c1434650nR9, boolean z, String str, String str2) {
        this.cause = c1434650nR9;
        this.isServerException = z;
        this.scene = str;
        this.errorMsg = str2;
    }
}
