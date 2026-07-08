package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.EditVideoEnhanceModel;

/* JADX INFO: loaded from: classes23.dex */
public final class EditVideoEnhanceModel implements Parcelable {
    public static final Parcelable.Creator<EditVideoEnhanceModel> CREATOR = new Parcelable.Creator<EditVideoEnhanceModel>() { // from class: X.0nWr
        @Override // android.os.Parcelable.Creator
        public final EditVideoEnhanceModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new EditVideoEnhanceModel(z, z2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EditVideoEnhanceModel[] newArray(int i) {
            return new EditVideoEnhanceModel[i];
        }
    };

    @C040H
    public boolean autoEnhanceOn;

    @C040H
    public int autoEnhanceType;

    @C040H
    public boolean supportEnhanceCached;

    @C040H
    public boolean supportEnhanceField;

    @C040H
    public boolean useHdrV2;

    public EditVideoEnhanceModel() {
        this(false, false, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.useHdrV2 ? 1 : 0);
        parcel.writeInt(this.autoEnhanceOn ? 1 : 0);
        parcel.writeInt(this.autoEnhanceType);
    }

    public /* synthetic */ EditVideoEnhanceModel(int i) {
        this(false, false, 0);
    }

    public EditVideoEnhanceModel(boolean z, boolean z2, int i) {
        this.useHdrV2 = z;
        this.autoEnhanceOn = z2;
        this.autoEnhanceType = i;
    }
}
