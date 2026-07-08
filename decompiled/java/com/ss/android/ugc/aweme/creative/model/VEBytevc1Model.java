package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.VEBytevc1Model;

/* JADX INFO: loaded from: classes23.dex */
public final class VEBytevc1Model implements Parcelable {
    public static final Parcelable.Creator<VEBytevc1Model> CREATOR = new Parcelable.Creator<VEBytevc1Model>() { // from class: X.0nX0
        @Override // android.os.Parcelable.Creator
        public final VEBytevc1Model createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new VEBytevc1Model(z, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VEBytevc1Model[] newArray(int i) {
            return new VEBytevc1Model[i];
        }
    };

    @C040H
    public boolean needUseBytevc1Encode;

    @C040H
    public int notUseByteVC1Reason;

    public VEBytevc1Model() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.needUseBytevc1Encode ? 1 : 0);
        parcel.writeInt(this.notUseByteVC1Reason);
    }

    public /* synthetic */ VEBytevc1Model(int i) {
        this(false, -1);
    }

    public VEBytevc1Model(boolean z, int i) {
        this.needUseBytevc1Encode = z;
        this.notUseByteVC1Reason = i;
    }
}
