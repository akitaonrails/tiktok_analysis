package com.ss.android.ugc.aweme.shortvideo.reaction;

import X.C09CT;
import X.C2188811AlT;
import X.C737902uP;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CopiedReactionWindowInfo implements Parcelable, Serializable {
    public static final C737902uP CREATOR = new Parcelable.Creator<CopiedReactionWindowInfo>() { // from class: X.02uP
        @Override // android.os.Parcelable.Creator
        public final CopiedReactionWindowInfo createFromParcel(Parcel parcel) {
            return new CopiedReactionWindowInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CopiedReactionWindowInfo[] newArray(int i) {
            return new CopiedReactionWindowInfo[i];
        }
    };

    @C09CT("react_angle")
    public final float angle;

    @C09CT("react_height")
    public final int height;

    @C09CT("react_type")
    public final int type;

    @C09CT("react_width")
    public final int width;

    public CopiedReactionWindowInfo() {
        this(0, 0, 0.0f, 0);
    }

    public final CopiedReactionWindowInfo copy(int i, int i2, float f, int i3) {
        return new CopiedReactionWindowInfo(i, i2, f, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopiedReactionWindowInfo)) {
            return false;
        }
        CopiedReactionWindowInfo copiedReactionWindowInfo = (CopiedReactionWindowInfo) obj;
        return this.width == copiedReactionWindowInfo.width && this.height == copiedReactionWindowInfo.height && Float.compare(this.angle, copiedReactionWindowInfo.angle) == 0 && this.type == copiedReactionWindowInfo.type;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CopiedReactionWindowInfo(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", angle=");
        sbLIZ.append(this.angle);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((((this.width * 31) + this.height) * 31) + Float.floatToIntBits(this.angle)) * 31) + this.type;
    }

    public final float getAngle() {
        return this.angle;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public CopiedReactionWindowInfo(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.angle);
        parcel.writeInt(this.type);
    }

    public CopiedReactionWindowInfo(int i, int i2, float f, int i3) {
        this.width = i;
        this.height = i2;
        this.angle = f;
        this.type = i3;
    }
}
