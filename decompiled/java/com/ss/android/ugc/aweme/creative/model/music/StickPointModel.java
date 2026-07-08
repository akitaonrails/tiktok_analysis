package com.ss.android.ugc.aweme.creative.model.music;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.StickPointModel;
import com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;

/* JADX INFO: loaded from: classes23.dex */
public final class StickPointModel implements Parcelable {
    public static final Parcelable.Creator<StickPointModel> CREATOR = new Parcelable.Creator<StickPointModel>() { // from class: X.0nWV
        @Override // android.os.Parcelable.Creator
        public final StickPointModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new StickPointModel(z, (StickPointData) parcel.readSerializable(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StickPointModel[] newArray(int i) {
            return new StickPointModel[i];
        }
    };

    @C040H
    public boolean isStickPointMode;

    @C040H
    public StickPointData stickPointData;

    @C040H
    public int stickPointType;

    public StickPointModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isStickPointMode ? 1 : 0);
        parcel.writeSerializable(this.stickPointData);
        parcel.writeInt(this.stickPointType);
    }

    public /* synthetic */ StickPointModel(int i) {
        this(false, null, 0);
    }

    public StickPointModel(boolean z, StickPointData stickPointData, int i) {
        this.isStickPointMode = z;
        this.stickPointData = stickPointData;
        this.stickPointType = i;
    }
}
