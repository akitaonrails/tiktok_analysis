package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.RecordUIConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public class RecordUIConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecordUIConfigModel> CREATOR = new Parcelable.Creator<RecordUIConfigModel>() { // from class: X.0wQn
        @Override // android.os.Parcelable.Creator
        public final RecordUIConfigModel createFromParcel(Parcel parcel) {
            return new RecordUIConfigModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordUIConfigModel[] newArray(int i) {
            return new RecordUIConfigModel[i];
        }
    };

    @C09CT("placeholder")
    public String placeholder;

    public RecordUIConfigModel() {
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

    public RecordUIConfigModel(String str) {
        this.placeholder = str;
    }

    public final void setPlaceholder(String str) {
        this.placeholder = str;
    }
}
