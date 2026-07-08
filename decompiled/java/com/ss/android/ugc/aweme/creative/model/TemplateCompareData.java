package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TemplateCompareData;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateCompareData implements Parcelable {
    public static final Parcelable.Creator<TemplateCompareData> CREATOR = new Parcelable.Creator<TemplateCompareData>() { // from class: X.0L0M
        @Override // android.os.Parcelable.Creator
        public final TemplateCompareData createFromParcel(Parcel parcel) {
            return new TemplateCompareData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateCompareData[] newArray(int i) {
            return new TemplateCompareData[i];
        }
    };

    @C040H
    public String failFlag;

    @C040H
    public String productPath;

    @C040H
    public String successFlag;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productPath);
        parcel.writeString(this.successFlag);
        parcel.writeString(this.failFlag);
    }

    public TemplateCompareData() {
        this("", "", "");
    }

    public TemplateCompareData(String str, String str2, String str3) {
        this.productPath = str;
        this.successFlag = str2;
        this.failFlag = str3;
    }
}
