package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ForwardEditPublishData implements Parcelable {
    public static final Parcelable.Creator<ForwardEditPublishData> CREATOR = new Parcelable.Creator<ForwardEditPublishData>() { // from class: X.0Xko
        @Override // android.os.Parcelable.Creator
        public final ForwardEditPublishData createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ForwardEditPublishData(string, string2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ForwardEditPublishData[] newArray(int i) {
            return new ForwardEditPublishData[i];
        }
    };

    @C040H
    public final boolean disableProgressView;

    @C040H
    public final String draftId;

    @C040H
    public final String publishId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardEditPublishData)) {
            return false;
        }
        ForwardEditPublishData forwardEditPublishData = (ForwardEditPublishData) obj;
        return Intrinsics.LJFF(this.draftId, forwardEditPublishData.draftId) && Intrinsics.LJFF(this.publishId, forwardEditPublishData.publishId) && this.disableProgressView == forwardEditPublishData.disableProgressView;
    }

    public final int hashCode() {
        return (((this.draftId.hashCode() * 31) + this.publishId.hashCode()) * 31) + C786410Ut5.Z2(this.disableProgressView);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardEditPublishData(draftId=");
        sbLIZ.append(this.draftId);
        sbLIZ.append(", publishId=");
        sbLIZ.append(this.publishId);
        sbLIZ.append(", disableProgressView=");
        sbLIZ.append(this.disableProgressView);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.draftId);
        parcel.writeString(this.publishId);
        parcel.writeInt(this.disableProgressView ? 1 : 0);
    }

    public ForwardEditPublishData(String str, String str2, boolean z) {
        this.draftId = str;
        this.publishId = str2;
        this.disableProgressView = z;
    }
}
