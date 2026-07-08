package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C579200Mne;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PhotoEditData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class PhotoEditData implements Parcelable, Serializable {

    @C09CT("allow_gesture_opti")
    public boolean allowGestureOpti;

    @C09CT("enable_round")
    public boolean enableRound;

    @C09CT("ratio")
    public int ratio;
    public static final C579200Mne Companion = new Object() { // from class: X.0Mne
    };
    public static final Parcelable.Creator<PhotoEditData> CREATOR = new Parcelable.Creator<PhotoEditData>() { // from class: X.0Mnc
        @Override // android.os.Parcelable.Creator
        public final PhotoEditData createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new PhotoEditData(i, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoEditData[] newArray(int i) {
            return new PhotoEditData[i];
        }
    };

    public PhotoEditData() {
        this(1, true, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ratio);
        parcel.writeInt(this.allowGestureOpti ? 1 : 0);
        parcel.writeInt(this.enableRound ? 1 : 0);
    }

    public final boolean getAllowGestureOpti() {
        return this.allowGestureOpti;
    }

    public final boolean getEnableRound() {
        return this.enableRound;
    }

    public final int getRatio() {
        return this.ratio;
    }

    public final void setAllowGestureOpti(boolean z) {
        this.allowGestureOpti = z;
    }

    public final void setEnableRound(boolean z) {
        this.enableRound = z;
    }

    public final void setRatio(int i) {
        this.ratio = i;
    }

    public PhotoEditData(int i, boolean z, boolean z2) {
        this.ratio = i;
        this.allowGestureOpti = z;
        this.enableRound = z2;
    }
}
