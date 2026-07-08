package com.ss.android.ugc.aweme.creative.model.creation;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.creation.CreationTypeModel;

/* JADX INFO: loaded from: classes23.dex */
public final class CreationTypeModel implements Parcelable {
    public static final Parcelable.Creator<CreationTypeModel> CREATOR = new Parcelable.Creator<CreationTypeModel>() { // from class: X.0nWp
        @Override // android.os.Parcelable.Creator
        public final CreationTypeModel createFromParcel(Parcel parcel) {
            return new CreationTypeModel(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CreationTypeModel[] newArray(int i) {
            return new CreationTypeModel[i];
        }
    };

    @C040H
    public int creationMode;

    @C040H
    public int videoEditorType;

    public CreationTypeModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.videoEditorType);
        parcel.writeInt(this.creationMode);
    }

    public /* synthetic */ CreationTypeModel(int i) {
        this(0, 1);
    }

    public CreationTypeModel(int i, int i2) {
        this.videoEditorType = i;
        this.creationMode = i2;
    }
}
