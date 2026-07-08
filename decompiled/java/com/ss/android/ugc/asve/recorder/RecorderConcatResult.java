package com.ss.android.ugc.asve.recorder;

import X.C1655840tBu;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.asve.recorder.RecorderConcatResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class RecorderConcatResult implements Parcelable {
    public static final C1655840tBu CREATOR = new Parcelable.Creator<RecorderConcatResult>() { // from class: X.0tBu
        @Override // android.os.Parcelable.Creator
        public final RecorderConcatResult createFromParcel(Parcel parcel) {
            return new RecorderConcatResult(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecorderConcatResult[] newArray(int i) {
            return new RecorderConcatResult[i];
        }
    };
    public final String audioPath;
    public final int ret;
    public final String videoPath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecorderConcatResult)) {
            return false;
        }
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        return this.ret == recorderConcatResult.ret && Intrinsics.LJFF(this.videoPath, recorderConcatResult.videoPath) && Intrinsics.LJFF(this.audioPath, recorderConcatResult.audioPath);
    }

    public final int hashCode() {
        return (((this.ret * 31) + this.videoPath.hashCode()) * 31) + this.audioPath.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecorderConcatResult(ret=");
        sbLIZ.append(this.ret);
        sbLIZ.append(", videoPath=");
        sbLIZ.append(this.videoPath);
        sbLIZ.append(", audioPath=");
        sbLIZ.append(this.audioPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ret);
        parcel.writeString(this.videoPath);
        parcel.writeString(this.audioPath);
    }

    public RecorderConcatResult(int i, String str, String str2) {
        this.ret = i;
        this.videoPath = str;
        this.audioPath = str2;
    }
}
