package com.ss.android.ugc.aweme.creative.model.filter;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.filter.RecordFilterModel;

/* JADX INFO: loaded from: classes9.dex */
public final class RecordFilterModel implements Parcelable {
    public static final Parcelable.Creator<RecordFilterModel> CREATOR = new Parcelable.Creator<RecordFilterModel>() { // from class: X.0MpH
        @Override // android.os.Parcelable.Creator
        public final RecordFilterModel createFromParcel(Parcel parcel) {
            return new RecordFilterModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordFilterModel[] newArray(int i) {
            return new RecordFilterModel[i];
        }
    };

    @C040H
    public String curFilterIds;

    @C040H
    public String curFilterLabels;

    @C09CT("record_filter_category_keys")
    public String recordFilterCategoryKeys;

    @C09CT("record_filter_default_infos")
    public String recordFilterDefaultInfos;

    @C040H
    public String recordFilterIds;

    @C040H
    public String recordFilterLabels;

    @C040H
    public String recordFilterValues;

    public RecordFilterModel() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.recordFilterLabels);
        parcel.writeString(this.recordFilterIds);
        parcel.writeString(this.recordFilterValues);
        parcel.writeString(this.recordFilterCategoryKeys);
        parcel.writeString(this.recordFilterDefaultInfos);
        parcel.writeString(this.curFilterLabels);
        parcel.writeString(this.curFilterIds);
    }

    public RecordFilterModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.recordFilterLabels = str;
        this.recordFilterIds = str2;
        this.recordFilterValues = str3;
        this.recordFilterCategoryKeys = str4;
        this.recordFilterDefaultInfos = str5;
        this.curFilterLabels = str6;
        this.curFilterIds = str7;
    }
}
