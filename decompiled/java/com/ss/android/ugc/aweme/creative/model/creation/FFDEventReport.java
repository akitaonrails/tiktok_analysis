package com.ss.android.ugc.aweme.creative.model.creation;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.creation.FFDEventReport;

/* JADX INFO: loaded from: classes23.dex */
public final class FFDEventReport implements Parcelable {
    public static final Parcelable.Creator<FFDEventReport> CREATOR = new Parcelable.Creator<FFDEventReport>() { // from class: X.0nnh
        @Override // android.os.Parcelable.Creator
        public final FFDEventReport createFromParcel(Parcel parcel) {
            return new FFDEventReport(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final FFDEventReport[] newArray(int i) {
            return new FFDEventReport[i];
        }
    };

    @C040H
    public int cameraErrorCode;

    @C040H
    public long editFFD;

    @C040H
    public long editUiFFD;

    @C040H
    public long shootUiFFD;

    public FFDEventReport() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cameraErrorCode);
        parcel.writeLong(this.shootUiFFD);
        parcel.writeLong(this.editUiFFD);
        parcel.writeLong(this.editFFD);
    }

    public /* synthetic */ FFDEventReport(int i) {
        this(0, -1L, -1L, -1L);
    }

    public FFDEventReport(int i, long j, long j2, long j3) {
        this.cameraErrorCode = i;
        this.shootUiFFD = j;
        this.editUiFFD = j2;
        this.editFFD = j3;
    }
}
