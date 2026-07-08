package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.FaceInfo;

/* JADX INFO: loaded from: classes21.dex */
public final class FaceInfo implements Parcelable {
    public static final Parcelable.Creator<FaceInfo> CREATOR = new Parcelable.Creator<FaceInfo>() { // from class: X.0k1l
        @Override // android.os.Parcelable.Creator
        public final FaceInfo createFromParcel(Parcel parcel) {
            return new FaceInfo(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final FaceInfo[] newArray(int i) {
            return new FaceInfo[i];
        }
    };

    @C09CT("boy_prob")
    public float boyProb;

    @C09CT("skin_tone")
    public int skinTone;

    public FaceInfo() {
        this(-1, -1.0f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceInfo)) {
            return false;
        }
        FaceInfo faceInfo = (FaceInfo) obj;
        return this.skinTone == faceInfo.skinTone && Float.compare(this.boyProb, faceInfo.boyProb) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaceInfo(skinTone=");
        sbLIZ.append(this.skinTone);
        sbLIZ.append(", boyProb=");
        sbLIZ.append(this.boyProb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.skinTone);
        parcel.writeFloat(this.boyProb);
    }

    public final int hashCode() {
        return (this.skinTone * 31) + Float.floatToIntBits(this.boyProb);
    }

    public FaceInfo(int i, float f) {
        this.skinTone = i;
        this.boyProb = f;
    }
}
