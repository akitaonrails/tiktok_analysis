package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class NinePatchDiv implements Serializable, Parcelable {
    public static final Parcelable.Creator<NinePatchDiv> CREATOR = new Parcelable.Creator<NinePatchDiv>() { // from class: X.1269
        @Override // android.os.Parcelable.Creator
        public final NinePatchDiv createFromParcel(Parcel parcel) {
            return new NinePatchDiv(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NinePatchDiv[] newArray(int i) {
            return new NinePatchDiv[i];
        }
    };
    public final int end;
    public final int start;

    public final NinePatchDiv copy(int i, int i2) {
        return new NinePatchDiv(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NinePatchDiv)) {
            return false;
        }
        NinePatchDiv ninePatchDiv = (NinePatchDiv) obj;
        return this.start == ninePatchDiv.start && this.end == ninePatchDiv.end;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NinePatchDiv(start=");
        sbLIZ.append(this.start);
        sbLIZ.append(", end=");
        sbLIZ.append(this.end);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public NinePatchDiv(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}
