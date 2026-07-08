package com.ss.android.ugc.aweme.shortvideo.inlinecaption;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class CaptionQueryInfo implements Parcelable {
    public static final Parcelable.Creator<CaptionQueryInfo> CREATOR = new Parcelable.Creator<CaptionQueryInfo>() { // from class: X.0EQq
        @Override // android.os.Parcelable.Creator
        public final CaptionQueryInfo createFromParcel(Parcel parcel) {
            return new CaptionQueryInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CaptionQueryInfo[] newArray(int i) {
            return new CaptionQueryInfo[i];
        }
    };
    public String audioTosKey;
    public String taskId;

    public CaptionQueryInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionQueryInfo)) {
            return false;
        }
        CaptionQueryInfo captionQueryInfo = (CaptionQueryInfo) obj;
        return Intrinsics.LJFF(this.audioTosKey, captionQueryInfo.audioTosKey) && Intrinsics.LJFF(this.taskId, captionQueryInfo.taskId);
    }

    public final int hashCode() {
        String str = this.audioTosKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taskId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionQueryInfo(audioTosKey=");
        sbLIZ.append(this.audioTosKey);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.audioTosKey);
        parcel.writeString(this.taskId);
    }

    public CaptionQueryInfo(String str, String str2) {
        this.audioTosKey = str;
        this.taskId = str2;
    }
}
