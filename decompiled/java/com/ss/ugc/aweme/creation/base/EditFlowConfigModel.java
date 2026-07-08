package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.EditFlowConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class EditFlowConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditFlowConfigModel> CREATOR = new Parcelable.Creator<EditFlowConfigModel>() { // from class: X.0wR3
        @Override // android.os.Parcelable.Creator
        public final EditFlowConfigModel createFromParcel(Parcel parcel) {
            return new EditFlowConfigModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditFlowConfigModel[] newArray(int i) {
            return new EditFlowConfigModel[i];
        }
    };

    @C09CT("placeholder")
    public String placeholder;

    public EditFlowConfigModel() {
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

    public EditFlowConfigModel(String str) {
        this.placeholder = str;
    }

    public final void setPlaceholder(String str) {
        this.placeholder = str;
    }
}
