package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.EditVideoInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class EditVideoInfo implements Parcelable {
    public static final Parcelable.Creator<EditVideoInfo> CREATOR = new Parcelable.Creator<EditVideoInfo>() { // from class: X.0nXc
        @Override // android.os.Parcelable.Creator
        public final EditVideoInfo createFromParcel(Parcel parcel) {
            return new EditVideoInfo(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final EditVideoInfo[] newArray(int i) {
            return new EditVideoInfo[i];
        }
    };

    @C09CT("initializeScale")
    public float initializeScale;

    @C09CT("initializeTransY")
    public float initializeTransY;

    @C09CT("initializeVideoHeight")
    public float initializeVideoHeight;

    @C09CT("initializeVideoWidth")
    public float initializeVideoWidth;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVideoInfo)) {
            return false;
        }
        EditVideoInfo editVideoInfo = (EditVideoInfo) obj;
        return Float.compare(this.initializeScale, editVideoInfo.initializeScale) == 0 && Float.compare(this.initializeTransY, editVideoInfo.initializeTransY) == 0 && Float.compare(this.initializeVideoWidth, editVideoInfo.initializeVideoWidth) == 0 && Float.compare(this.initializeVideoHeight, editVideoInfo.initializeVideoHeight) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditVideoInfo(initializeScale=");
        sbLIZ.append(this.initializeScale);
        sbLIZ.append(", initializeTransY=");
        sbLIZ.append(this.initializeTransY);
        sbLIZ.append(", initializeVideoWidth=");
        sbLIZ.append(this.initializeVideoWidth);
        sbLIZ.append(", initializeVideoHeight=");
        sbLIZ.append(this.initializeVideoHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.initializeScale);
        parcel.writeFloat(this.initializeTransY);
        parcel.writeFloat(this.initializeVideoWidth);
        parcel.writeFloat(this.initializeVideoHeight);
    }

    public EditVideoInfo() {
        this(1.0f, 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.initializeScale) * 31) + Float.floatToIntBits(this.initializeTransY)) * 31) + Float.floatToIntBits(this.initializeVideoWidth)) * 31) + Float.floatToIntBits(this.initializeVideoHeight);
    }

    public EditVideoInfo(float f, float f2, float f3, float f4) {
        this.initializeScale = f;
        this.initializeTransY = f2;
        this.initializeVideoWidth = f3;
        this.initializeVideoHeight = f4;
    }
}
