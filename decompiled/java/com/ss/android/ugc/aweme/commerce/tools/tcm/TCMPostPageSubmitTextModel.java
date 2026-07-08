package com.ss.android.ugc.aweme.commerce.tools.tcm;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class TCMPostPageSubmitTextModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TCMPostPageSubmitTextModel> CREATOR = new Parcelable.Creator<TCMPostPageSubmitTextModel>() { // from class: X.15Mt
        @Override // android.os.Parcelable.Creator
        public final TCMPostPageSubmitTextModel createFromParcel(Parcel parcel) {
            return new TCMPostPageSubmitTextModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TCMPostPageSubmitTextModel[] newArray(int i) {
            return new TCMPostPageSubmitTextModel[i];
        }
    };

    @C09CT("submit_button")
    public String submitButtonText;

    @C09CT("submit_title")
    public String submitTitleText;

    public TCMPostPageSubmitTextModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.submitTitleText);
        parcel.writeString(this.submitButtonText);
    }

    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    public final String getSubmitTitleText() {
        return this.submitTitleText;
    }

    public TCMPostPageSubmitTextModel(String str) {
        this(str, null);
    }

    public final void setSubmitButtonText(String str) {
        this.submitButtonText = str;
    }

    public final void setSubmitTitleText(String str) {
        this.submitTitleText = str;
    }

    public TCMPostPageSubmitTextModel(String str, String str2) {
        this.submitTitleText = str;
        this.submitButtonText = str2;
    }
}
