package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordFilterModel implements Parcelable {
    public static final Parcelable.Creator<RecordFilterModel> CREATOR = new Creator();
    public final String filterCategoryKey;
    public final String filterId;
    public final String filterLabel;
    public final String filterValue;

    public static final class Creator implements Parcelable.Creator<RecordFilterModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordFilterModel createFromParcel(Parcel parcel) {
            return new RecordFilterModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecordFilterModel[] newArray(int i) {
            return new RecordFilterModel[i];
        }
    }

    public final RecordFilterModel copy(String str, String str2, String str3, String str4) {
        return new RecordFilterModel(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordFilterModel)) {
            return false;
        }
        RecordFilterModel recordFilterModel = (RecordFilterModel) obj;
        return Intrinsics.LJFF(this.filterId, recordFilterModel.filterId) && Intrinsics.LJFF(this.filterLabel, recordFilterModel.filterLabel) && Intrinsics.LJFF(this.filterValue, recordFilterModel.filterValue) && Intrinsics.LJFF(this.filterCategoryKey, recordFilterModel.filterCategoryKey);
    }

    public int hashCode() {
        String str = this.filterId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.filterLabel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.filterValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.filterCategoryKey;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordFilterModel(filterId=");
        sbLIZ.append(this.filterId);
        sbLIZ.append(", filterLabel=");
        sbLIZ.append(this.filterLabel);
        sbLIZ.append(", filterValue=");
        sbLIZ.append(this.filterValue);
        sbLIZ.append(", filterCategoryKey=");
        sbLIZ.append(this.filterCategoryKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filterId);
        parcel.writeString(this.filterLabel);
        parcel.writeString(this.filterValue);
        parcel.writeString(this.filterCategoryKey);
    }

    public final String getFilterCategoryKey() {
        return this.filterCategoryKey;
    }

    public final String getFilterId() {
        return this.filterId;
    }

    public final String getFilterLabel() {
        return this.filterLabel;
    }

    public final String getFilterValue() {
        return this.filterValue;
    }

    public RecordFilterModel(String str, String str2, String str3, String str4) {
        this.filterId = str;
        this.filterLabel = str2;
        this.filterValue = str3;
        this.filterCategoryKey = str4;
    }
}
