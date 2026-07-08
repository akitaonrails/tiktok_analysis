package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;

/* JADX INFO: loaded from: classes15.dex */
public final class EditDescMobModel implements Parcelable {
    public static final Parcelable.Creator<EditDescMobModel> CREATOR = new Parcelable.Creator<EditDescMobModel>() { // from class: X.0Xjk
        @Override // android.os.Parcelable.Creator
        public final EditDescMobModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new EditDescMobModel(z, z2, z3, z4, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final EditDescMobModel[] newArray(int i) {
            return new EditDescMobModel[i];
        }
    };

    @C040H
    public boolean isMobAutoExpandTriggered;

    @C040H
    public boolean isMobClickTagButton;

    @C040H
    public boolean isMobExceedDescLimitToastPopUp;

    @C040H
    public boolean isMobExceedTitleLimitToastPopUp;

    @C040H
    public boolean isMobTypeMoreThanLimitTriggered;

    public EditDescMobModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isMobTypeMoreThanLimitTriggered ? 1 : 0);
        parcel.writeInt(this.isMobClickTagButton ? 1 : 0);
        parcel.writeInt(this.isMobAutoExpandTriggered ? 1 : 0);
        parcel.writeInt(this.isMobExceedTitleLimitToastPopUp ? 1 : 0);
        parcel.writeInt(this.isMobExceedDescLimitToastPopUp ? 1 : 0);
    }

    public /* synthetic */ EditDescMobModel(int i) {
        this(false, false, false, false, false);
    }

    public EditDescMobModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isMobTypeMoreThanLimitTriggered = z;
        this.isMobClickTagButton = z2;
        this.isMobAutoExpandTriggered = z3;
        this.isMobExceedTitleLimitToastPopUp = z4;
        this.isMobExceedDescLimitToastPopUp = z5;
    }
}
