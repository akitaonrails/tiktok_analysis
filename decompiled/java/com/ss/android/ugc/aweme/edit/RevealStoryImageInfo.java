package com.ss.android.ugc.aweme.edit;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.edit.RevealStoryImageInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class RevealStoryImageInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<RevealStoryImageInfo> CREATOR = new Parcelable.Creator<RevealStoryImageInfo>() { // from class: X.0naT
        @Override // android.os.Parcelable.Creator
        public final RevealStoryImageInfo createFromParcel(Parcel parcel) {
            return new RevealStoryImageInfo(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RevealStoryImageInfo[] newArray(int i) {
            return new RevealStoryImageInfo[i];
        }
    };

    @C09CT("index")
    public final int index;

    @C09CT("media_info_type")
    public final int mediaType;

    public RevealStoryImageInfo() {
        this(0, -1);
    }

    public final RevealStoryImageInfo copy(int i, int i2) {
        return new RevealStoryImageInfo(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevealStoryImageInfo)) {
            return false;
        }
        RevealStoryImageInfo revealStoryImageInfo = (RevealStoryImageInfo) obj;
        return this.mediaType == revealStoryImageInfo.mediaType && this.index == revealStoryImageInfo.index;
    }

    public int hashCode() {
        return (this.mediaType * 31) + this.index;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealStoryImageInfo(mediaType=");
        sbLIZ.append(this.mediaType);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mediaType);
        parcel.writeInt(this.index);
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public RevealStoryImageInfo(int i, int i2) {
        this.mediaType = i;
        this.index = i2;
    }
}
