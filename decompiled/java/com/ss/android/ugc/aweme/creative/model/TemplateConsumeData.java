package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateConsumeData implements Parcelable {
    public static final Parcelable.Creator<TemplateConsumeData> CREATOR = new Parcelable.Creator<TemplateConsumeData>() { // from class: X.0mc5
        @Override // android.os.Parcelable.Creator
        public final TemplateConsumeData createFromParcel(Parcel parcel) {
            return new TemplateConsumeData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateConsumeData[] newArray(int i) {
            return new TemplateConsumeData[i];
        }
    };

    @C09CT("template_dispatch_type")
    public String dispatchType;

    @C040H
    public String nleSummary;

    @C09CT("template_id")
    public String templateId;

    @C09CT("template_type")
    public String templateType;

    public TemplateConsumeData() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateType);
        parcel.writeString(this.dispatchType);
        parcel.writeString(this.nleSummary);
    }

    public final boolean LIZ() {
        String str;
        String str2 = this.templateId;
        return (str2 == null || str2.length() == 0 || (str = this.dispatchType) == null || str.length() == 0) ? false : true;
    }

    public TemplateConsumeData(String str, String str2, String str3, String str4) {
        this.templateId = str;
        this.templateType = str2;
        this.dispatchType = str3;
        this.nleSummary = str4;
    }
}
