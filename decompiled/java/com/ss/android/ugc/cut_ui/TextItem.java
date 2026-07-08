package com.ss.android.ugc.cut_ui;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.TextItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextItem implements Parcelable {
    public static final Parcelable.Creator<TextItem> CREATOR = new Parcelable.Creator<TextItem>() { // from class: X.0FQ2
        @Override // android.os.Parcelable.Creator
        public final TextItem createFromParcel(Parcel parcel) {
            boolean z;
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TextItem(j, z, parcel.readString(), parcel.readDouble(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextItem[] newArray(int i) {
            return new TextItem[i];
        }
    };
    public final long duration;
    public final String materialId;
    public final boolean mutable;
    public final double rotation;
    public final long targetStartTime;
    public final String text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextItem)) {
            return false;
        }
        TextItem textItem = (TextItem) obj;
        return this.duration == textItem.duration && this.mutable == textItem.mutable && Intrinsics.LJFF(this.materialId, textItem.materialId) && Double.compare(this.rotation, textItem.rotation) == 0 && this.targetStartTime == textItem.targetStartTime && Intrinsics.LJFF(this.text, textItem.text);
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Y2(this.duration) * 31) + C786410Ut5.Z2(this.mutable)) * 31) + this.materialId.hashCode()) * 31) + C786410Ut5.X2(this.rotation)) * 31) + C786410Ut5.Y2(this.targetStartTime)) * 31) + this.text.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextItem(duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", mutable=");
        sbLIZ.append(this.mutable);
        sbLIZ.append(", materialId=");
        sbLIZ.append(this.materialId);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", targetStartTime=");
        sbLIZ.append(this.targetStartTime);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.duration);
        parcel.writeInt(this.mutable ? 1 : 0);
        parcel.writeString(this.materialId);
        parcel.writeDouble(this.rotation);
        parcel.writeLong(this.targetStartTime);
        parcel.writeString(this.text);
    }

    public TextItem() {
        this(0L, false, "", 0.0d, 0L, "");
    }

    public TextItem(long j, boolean z, String str, double d, long j2, String str2) {
        this.duration = j;
        this.mutable = z;
        this.materialId = str;
        this.rotation = d;
        this.targetStartTime = j2;
        this.text = str2;
    }
}
