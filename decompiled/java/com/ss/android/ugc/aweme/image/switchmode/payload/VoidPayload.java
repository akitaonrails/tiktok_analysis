package com.ss.android.ugc.aweme.image.switchmode.payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.switchmode.payload.VoidPayload;

/* JADX INFO: loaded from: classes23.dex */
public final class VoidPayload extends SwitchModePayload {
    public static final VoidPayload INSTANCE = new VoidPayload();
    public static final Parcelable.Creator<VoidPayload> CREATOR = new Parcelable.Creator<VoidPayload>() { // from class: X.0mhb
        @Override // android.os.Parcelable.Creator
        public final VoidPayload createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VoidPayload.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final VoidPayload[] newArray(int i) {
            return new VoidPayload[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public VoidPayload() {
        super(SwitchModePayloadType.VOID_TYPE, false, 0);
    }
}
