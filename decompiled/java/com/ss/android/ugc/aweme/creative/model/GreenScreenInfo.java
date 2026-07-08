package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.GreenScreenInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class GreenScreenInfo implements Parcelable {
    public static final Parcelable.Creator<GreenScreenInfo> CREATOR = new Parcelable.Creator<GreenScreenInfo>() { // from class: X.0sif
        @Override // android.os.Parcelable.Creator
        public final GreenScreenInfo createFromParcel(Parcel parcel) {
            return new GreenScreenInfo(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GreenScreenInfo[] newArray(int i) {
            return new GreenScreenInfo[i];
        }
    };

    @C09CT("selectedMedia")
    public final String selectedMedia;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GreenScreenInfo) && Intrinsics.LJFF(this.selectedMedia, ((GreenScreenInfo) obj).selectedMedia);
    }

    public final int hashCode() {
        return this.selectedMedia.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GreenScreenInfo(selectedMedia=");
        sbLIZ.append(this.selectedMedia);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.selectedMedia);
    }

    public GreenScreenInfo() {
        this("");
    }

    public GreenScreenInfo(String str) {
        this.selectedMedia = str;
    }
}
