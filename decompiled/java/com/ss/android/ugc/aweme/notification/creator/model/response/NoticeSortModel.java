package com.ss.android.ugc.aweme.notification.creator.model.response;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeSortModel implements Parcelable {

    @C09CT("option_id")
    public final int sortId;

    @C09CT("option_text")
    public final String sortName;

    @C09CT("tracking_text")
    public final String trackingName;
    public static final Parcelable.Creator<NoticeSortModel> CREATOR = new Parcelable.Creator<NoticeSortModel>() { // from class: X.0zaL
        @Override // android.os.Parcelable.Creator
        public final NoticeSortModel createFromParcel(Parcel parcel) {
            return new NoticeSortModel(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NoticeSortModel[] newArray(int i) {
            return new NoticeSortModel[i];
        }
    };
    public static final int $stable = 8;

    public final NoticeSortModel copy(int i, String str, String str2) {
        return new NoticeSortModel(i, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeSortModel)) {
            return false;
        }
        NoticeSortModel noticeSortModel = (NoticeSortModel) obj;
        return this.sortId == noticeSortModel.sortId && Intrinsics.LJFF(this.sortName, noticeSortModel.sortName) && Intrinsics.LJFF(this.trackingName, noticeSortModel.trackingName);
    }

    public int hashCode() {
        int i = this.sortId * 31;
        String str = this.sortName;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeSortModel(sortId=");
        sbLIZ.append(this.sortId);
        sbLIZ.append(", sortName=");
        sbLIZ.append(this.sortName);
        sbLIZ.append(", trackingName=");
        sbLIZ.append(this.trackingName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.sortId);
        parcel.writeString(this.sortName);
        parcel.writeString(this.trackingName);
    }

    public final int getSortId() {
        return this.sortId;
    }

    public final String getSortName() {
        return this.sortName;
    }

    public final String getTrackingName() {
        return this.trackingName;
    }

    public NoticeSortModel(int i, String str, String str2) {
        this.sortId = i;
        this.sortName = str;
        this.trackingName = str2;
    }
}
