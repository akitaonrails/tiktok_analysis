package com.ss.android.ugc.aweme.creative.model.record;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordDowngradeModel implements Parcelable {
    public static final Parcelable.Creator<RecordDowngradeModel> CREATOR = new Parcelable.Creator<RecordDowngradeModel>() { // from class: X.0nXH
        @Override // android.os.Parcelable.Creator
        public final RecordDowngradeModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Float fValueOf;
            boolean z3;
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
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new RecordDowngradeModel(z, z2, string, fValueOf, z3, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordDowngradeModel[] newArray(int i) {
            return new RecordDowngradeModel[i];
        }
    };

    @C09CT("bitrate")
    public Float bitrate;

    @C040H
    public int downgradeInputFlags;

    @C040H
    public int downgradeLevels;

    @C09CT("enter_record_with_prop")
    public boolean enterRecordPageWithProp;

    @C09CT("force_recode")
    public boolean forceRecode;

    @C040H
    public boolean hasDowngradeBeforeCameraInit;

    @C09CT("resolution")
    public String resolution;

    public RecordDowngradeModel() {
        this(false, false, null, null, false, 0, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasDowngradeBeforeCameraInit ? 1 : 0);
        parcel.writeInt(this.enterRecordPageWithProp ? 1 : 0);
        parcel.writeString(this.resolution);
        Float f = this.bitrate;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeInt(this.forceRecode ? 1 : 0);
        parcel.writeInt(this.downgradeLevels);
        parcel.writeInt(this.downgradeInputFlags);
    }

    public RecordDowngradeModel(boolean z, boolean z2, String str, Float f, boolean z3, int i, int i2) {
        this.hasDowngradeBeforeCameraInit = z;
        this.enterRecordPageWithProp = z2;
        this.resolution = str;
        this.bitrate = f;
        this.forceRecode = z3;
        this.downgradeLevels = i;
        this.downgradeInputFlags = i2;
    }
}
