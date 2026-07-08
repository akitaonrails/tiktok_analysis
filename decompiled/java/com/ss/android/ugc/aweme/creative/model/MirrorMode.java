package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MirrorMode;

/* JADX INFO: loaded from: classes23.dex */
public final class MirrorMode implements Parcelable {
    public static final Parcelable.Creator<MirrorMode> CREATOR = new Parcelable.Creator<MirrorMode>() { // from class: X.0nWm
        @Override // android.os.Parcelable.Creator
        public final MirrorMode createFromParcel(Parcel parcel) {
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
            return new MirrorMode(z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final MirrorMode[] newArray(int i) {
            return new MirrorMode[i];
        }
    };

    @C09CT("is_use_mirror")
    public boolean isUseMirror;

    @C09CT("last_seg_is_use_mirror")
    public boolean lastSegIsUseMirror;

    public MirrorMode() {
        this(false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isUseMirror ? 1 : 0);
        parcel.writeInt(this.lastSegIsUseMirror ? 1 : 0);
    }

    public MirrorMode(boolean z, boolean z2) {
        this.isUseMirror = z;
        this.lastSegIsUseMirror = z2;
    }
}
