package com.ss.android.ugc.aweme.creative.model.album;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.ImportModel;

/* JADX INFO: loaded from: classes23.dex */
public final class ImportModel implements Parcelable {
    public static final Parcelable.Creator<ImportModel> CREATOR = new Parcelable.Creator<ImportModel>() { // from class: X.0nWT
        @Override // android.os.Parcelable.Creator
        public final ImportModel createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ImportModel(numValueOf, string, i, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ImportModel[] newArray(int i) {
            return new ImportModel[i];
        }
    };

    @C040H
    public int fastImportErrorCode;

    @C040H
    public boolean isFastImport;

    @C040H
    public Integer preTranscodeCodecType;

    @C040H
    public String preTranscodeResolution;

    public ImportModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.isFastImport ? 1 : 0);
        parcel.writeInt(this.fastImportErrorCode);
        parcel.writeString(this.preTranscodeResolution);
        Integer num = this.preTranscodeCodecType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public /* synthetic */ ImportModel(int i) {
        this(null, null, -1, false);
    }

    public ImportModel(Integer num, String str, int i, boolean z) {
        this.isFastImport = z;
        this.fastImportErrorCode = i;
        this.preTranscodeResolution = str;
        this.preTranscodeCodecType = num;
    }
}
