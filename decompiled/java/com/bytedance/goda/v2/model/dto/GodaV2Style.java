package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.bytedance.goda.v2.model.dto.GodaV2StyleColor;
import com.bytedance.goda.v2.model.dto.GodaV2StyleCorner;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class GodaV2Style implements Parcelable {
    public static final Parcelable.Creator<GodaV2Style> CREATOR = new Parcelable.Creator<GodaV2Style>() { // from class: X.0kwP
        @Override // android.os.Parcelable.Creator
        public final GodaV2Style createFromParcel(Parcel parcel) {
            GodaV2StyleColor godaV2StyleColorCreateFromParcel;
            GodaV2StyleCorner godaV2StyleCornerCreateFromParcel;
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                godaV2StyleColorCreateFromParcel = null;
            } else {
                godaV2StyleColorCreateFromParcel = GodaV2StyleColor.CREATOR.createFromParcel(parcel);
            }
            GodaV2StyleColor godaV2StyleColor = godaV2StyleColorCreateFromParcel;
            if (parcel.readInt() == 0) {
                godaV2StyleCornerCreateFromParcel = null;
            } else {
                godaV2StyleCornerCreateFromParcel = GodaV2StyleCorner.CREATOR.createFromParcel(parcel);
            }
            GodaV2StyleCorner godaV2StyleCorner = godaV2StyleCornerCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Float.valueOf(parcel.readFloat()));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Float.valueOf(parcel.readFloat()));
                }
            }
            return new GodaV2Style(godaV2StyleColor, godaV2StyleCorner, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final GodaV2Style[] newArray(int i) {
            return new GodaV2Style[i];
        }
    };

    @C09CT("bg_color")
    public final GodaV2StyleColor bgColor;

    @C09CT("corner")
    public final GodaV2StyleCorner corner;

    @C09CT("margin")
    public final ArrayList<Float> margin;

    @C09CT("padding")
    public final ArrayList<Float> padding;

    public GodaV2Style() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GodaV2Style)) {
            return false;
        }
        GodaV2Style godaV2Style = (GodaV2Style) obj;
        return Intrinsics.LJFF(this.bgColor, godaV2Style.bgColor) && Intrinsics.LJFF(this.corner, godaV2Style.corner) && Intrinsics.LJFF(this.margin, godaV2Style.margin) && Intrinsics.LJFF(this.padding, godaV2Style.padding);
    }

    public final int hashCode() {
        GodaV2StyleColor godaV2StyleColor = this.bgColor;
        int iHashCode = (godaV2StyleColor == null ? 0 : godaV2StyleColor.hashCode()) * 31;
        GodaV2StyleCorner godaV2StyleCorner = this.corner;
        int iHashCode2 = (iHashCode + (godaV2StyleCorner == null ? 0 : godaV2StyleCorner.hashCode())) * 31;
        ArrayList<Float> arrayList = this.margin;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<Float> arrayList2 = this.padding;
        return iHashCode3 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GodaV2Style(bgColor=");
        sbLIZ.append(this.bgColor);
        sbLIZ.append(", corner=");
        sbLIZ.append(this.corner);
        sbLIZ.append(", margin=");
        sbLIZ.append(this.margin);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GodaV2StyleColor godaV2StyleColor = this.bgColor;
        if (godaV2StyleColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            godaV2StyleColor.writeToParcel(parcel, i);
        }
        GodaV2StyleCorner godaV2StyleCorner = this.corner;
        if (godaV2StyleCorner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            godaV2StyleCorner.writeToParcel(parcel, i);
        }
        ArrayList<Float> arrayList = this.margin;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Float> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeFloat(it2.next().floatValue());
            }
        }
        ArrayList<Float> arrayList2 = this.padding;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList2.size());
        Iterator<Float> it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            parcel.writeFloat(it3.next().floatValue());
        }
    }

    public GodaV2Style(GodaV2StyleColor godaV2StyleColor, GodaV2StyleCorner godaV2StyleCorner, ArrayList<Float> arrayList, ArrayList<Float> arrayList2) {
        this.bgColor = godaV2StyleColor;
        this.corner = godaV2StyleCorner;
        this.margin = arrayList;
        this.padding = arrayList2;
    }
}
