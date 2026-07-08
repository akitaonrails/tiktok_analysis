package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ReusedMusicInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ReusedMusicInfo implements Parcelable {
    public static final Parcelable.Creator<ReusedMusicInfo> CREATOR = new Parcelable.Creator<ReusedMusicInfo>() { // from class: X.0mrl
        @Override // android.os.Parcelable.Creator
        public final ReusedMusicInfo createFromParcel(Parcel parcel) {
            return new ReusedMusicInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReusedMusicInfo[] newArray(int i) {
            return new ReusedMusicInfo[i];
        }
    };

    @C09CT("reused_music_id")
    public String reusedMusicId;

    @C09CT("reused_music_origin")
    public String reusedMusicOrigin;

    public ReusedMusicInfo() {
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
        if (!(obj instanceof ReusedMusicInfo)) {
            return false;
        }
        ReusedMusicInfo reusedMusicInfo = (ReusedMusicInfo) obj;
        return Intrinsics.LJFF(this.reusedMusicId, reusedMusicInfo.reusedMusicId) && Intrinsics.LJFF(this.reusedMusicOrigin, reusedMusicInfo.reusedMusicOrigin);
    }

    public final int hashCode() {
        String str = this.reusedMusicId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reusedMusicOrigin;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReusedMusicInfo(reusedMusicId=");
        sbLIZ.append(this.reusedMusicId);
        sbLIZ.append(", reusedMusicOrigin=");
        sbLIZ.append(this.reusedMusicOrigin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.reusedMusicId);
        parcel.writeString(this.reusedMusicOrigin);
    }

    public ReusedMusicInfo(String str, String str2) {
        this.reusedMusicId = str;
        this.reusedMusicOrigin = str2;
    }
}
