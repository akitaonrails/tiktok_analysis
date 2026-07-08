package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.LiveModel;

/* JADX INFO: loaded from: classes23.dex */
public final class LiveModel implements Parcelable {
    public static final Parcelable.Creator<LiveModel> CREATOR = new Parcelable.Creator<LiveModel>() { // from class: X.0mcE
        @Override // android.os.Parcelable.Creator
        public final LiveModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2 = true;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new LiveModel(boolValueOf, boolValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LiveModel[] newArray(int i) {
            return new LiveModel[i];
        }
    };

    @C040H
    public String liveShootPage;

    @C040H
    public Boolean startFromLive;

    @C040H
    public Boolean startSaaWithSingleTop;

    public LiveModel() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.startSaaWithSingleTop;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.startFromLive;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.liveShootPage);
    }

    public LiveModel(Boolean bool, Boolean bool2, String str) {
        this.startSaaWithSingleTop = bool;
        this.startFromLive = bool2;
        this.liveShootPage = str;
    }
}
