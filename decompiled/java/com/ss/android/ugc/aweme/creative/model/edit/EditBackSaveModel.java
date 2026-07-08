package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditBackSaveModel;

/* JADX INFO: loaded from: classes23.dex */
public final class EditBackSaveModel implements Parcelable {
    public static final Parcelable.Creator<EditBackSaveModel> CREATOR = new Parcelable.Creator<EditBackSaveModel>() { // from class: X.0mbg
        @Override // android.os.Parcelable.Creator
        public final EditBackSaveModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new EditBackSaveModel(z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditBackSaveModel[] newArray(int i) {
            return new EditBackSaveModel[i];
        }
    };

    @C09CT("new_clips")
    public boolean newClips;

    @C09CT("new_clips_type")
    public String newClipsType;

    public EditBackSaveModel() {
        this(false, "shoot");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.newClips ? 1 : 0);
        parcel.writeString(this.newClipsType);
    }

    public EditBackSaveModel(boolean z, String str) {
        this.newClips = z;
        this.newClipsType = str;
    }
}
