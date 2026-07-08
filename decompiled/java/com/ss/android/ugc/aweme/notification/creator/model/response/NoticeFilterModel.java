package com.ss.android.ugc.aweme.notification.creator.model.response;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeFilterModel implements Parcelable {

    @C09CT("option_id")
    public final int filterId;

    @C09CT("option_text")
    public final String filterName;

    @C09CT("tracking_text")
    public final String trackingName;
    public static final Parcelable.Creator<NoticeFilterModel> CREATOR = new Parcelable.Creator<NoticeFilterModel>() { // from class: X.0zaK
        @Override // android.os.Parcelable.Creator
        public final NoticeFilterModel createFromParcel(Parcel parcel) {
            return new NoticeFilterModel(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NoticeFilterModel[] newArray(int i) {
            return new NoticeFilterModel[i];
        }
    };
    public static final int $stable = 8;

    public final NoticeFilterModel copy(int i, String str, String str2) {
        return new NoticeFilterModel(i, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeFilterModel)) {
            return false;
        }
        NoticeFilterModel noticeFilterModel = (NoticeFilterModel) obj;
        return this.filterId == noticeFilterModel.filterId && Intrinsics.LJFF(this.filterName, noticeFilterModel.filterName) && Intrinsics.LJFF(this.trackingName, noticeFilterModel.trackingName);
    }

    public int hashCode() {
        int i = this.filterId * 31;
        String str = this.filterName;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeFilterModel(filterId=");
        sbLIZ.append(this.filterId);
        sbLIZ.append(", filterName=");
        sbLIZ.append(this.filterName);
        sbLIZ.append(", trackingName=");
        sbLIZ.append(this.trackingName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.filterId);
        parcel.writeString(this.filterName);
        parcel.writeString(this.trackingName);
    }

    public final int getFilterId() {
        return this.filterId;
    }

    public final String getFilterName() {
        return this.filterName;
    }

    public final String getTrackingName() {
        return this.trackingName;
    }

    public NoticeFilterModel(int i, String str, String str2) {
        this.filterId = i;
        this.filterName = str;
        this.trackingName = str2;
    }
}
