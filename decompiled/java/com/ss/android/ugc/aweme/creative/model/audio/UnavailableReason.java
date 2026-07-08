package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;

/* JADX INFO: loaded from: classes15.dex */
public final class UnavailableReason implements Parcelable {
    public static final Parcelable.Creator<UnavailableReason> CREATOR = new Parcelable.Creator<UnavailableReason>() { // from class: X.0XkB
        @Override // android.os.Parcelable.Creator
        public final UnavailableReason createFromParcel(Parcel parcel) {
            return new UnavailableReason(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UnavailableReason[] newArray(int i) {
            return new UnavailableReason[i];
        }
    };

    @C040H
    @C09CT("code")
    public final int code;

    @C040H
    @C09CT("desc")
    public final String desc;

    @C040H
    @C09CT("region")
    public final String region;

    public UnavailableReason() {
        this(-1, "", "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.code);
        parcel.writeString(this.desc);
        parcel.writeString(this.region);
    }

    public UnavailableReason(int i, String str, String str2) {
        this.code = i;
        this.desc = str;
        this.region = str2;
    }
}
