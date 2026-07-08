package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordFlowConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class RecordFlowConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordFlowConfigModel> CREATOR = new Parcelable.Creator<RecordFlowConfigModel>() { // from class: X.0wQm
        @Override // android.os.Parcelable.Creator
        public final RecordFlowConfigModel createFromParcel(Parcel parcel) {
            return new RecordFlowConfigModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordFlowConfigModel[] newArray(int i) {
            return new RecordFlowConfigModel[i];
        }
    };

    @C09CT("placeholder")
    public String placeholder;

    public RecordFlowConfigModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.placeholder);
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public RecordFlowConfigModel(String str) {
        this.placeholder = str;
    }

    public final void setPlaceholder(String str) {
        this.placeholder = str;
    }
}
