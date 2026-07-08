package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PublishItemTrackModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishItemTrackModel implements Parcelable {
    public static final Parcelable.Creator<PublishItemTrackModel> CREATOR = new Parcelable.Creator<PublishItemTrackModel>() { // from class: X.0mbh
        @Override // android.os.Parcelable.Creator
        public final PublishItemTrackModel createFromParcel(Parcel parcel) {
            return new PublishItemTrackModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishItemTrackModel[] newArray(int i) {
            return new PublishItemTrackModel[i];
        }
    };

    @C040H
    public final String fromGroupId;

    @C040H
    public final String fromItemId;

    @C040H
    public final String lastFollowupItemId;

    @C040H
    public final String lastGroupId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishItemTrackModel)) {
            return false;
        }
        PublishItemTrackModel publishItemTrackModel = (PublishItemTrackModel) obj;
        return Intrinsics.LJFF(this.fromGroupId, publishItemTrackModel.fromGroupId) && Intrinsics.LJFF(this.lastGroupId, publishItemTrackModel.lastGroupId) && Intrinsics.LJFF(this.fromItemId, publishItemTrackModel.fromItemId) && Intrinsics.LJFF(this.lastFollowupItemId, publishItemTrackModel.lastFollowupItemId);
    }

    public final int hashCode() {
        return (((((this.fromGroupId.hashCode() * 31) + this.lastGroupId.hashCode()) * 31) + this.fromItemId.hashCode()) * 31) + this.lastFollowupItemId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishItemTrackModel(fromGroupId=");
        sbLIZ.append(this.fromGroupId);
        sbLIZ.append(", lastGroupId=");
        sbLIZ.append(this.lastGroupId);
        sbLIZ.append(", fromItemId=");
        sbLIZ.append(this.fromItemId);
        sbLIZ.append(", lastFollowupItemId=");
        sbLIZ.append(this.lastFollowupItemId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fromGroupId);
        parcel.writeString(this.lastGroupId);
        parcel.writeString(this.fromItemId);
        parcel.writeString(this.lastFollowupItemId);
    }

    public PublishItemTrackModel() {
        this("", "", "", "");
    }

    public PublishItemTrackModel(String str, String str2, String str3, String str4) {
        this.fromGroupId = str;
        this.lastGroupId = str2;
        this.fromItemId = str3;
        this.lastFollowupItemId = str4;
    }
}
