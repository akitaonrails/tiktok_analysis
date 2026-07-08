package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.CaptionResModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class CaptionResModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CaptionResModel> CREATOR = new Parcelable.Creator<CaptionResModel>() { // from class: X.0Mgx
        @Override // android.os.Parcelable.Creator
        public final CaptionResModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CaptionResModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionResModel[] newArray(int i) {
            return new CaptionResModel[i];
        }
    };

    @C09CT("enable")
    public boolean enable;

    public CaptionResModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enable ? 1 : 0);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public CaptionResModel(boolean z) {
        this.enable = z;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }
}
