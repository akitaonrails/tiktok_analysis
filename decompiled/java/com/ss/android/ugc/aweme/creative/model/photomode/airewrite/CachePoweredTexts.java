package com.ss.android.ugc.aweme.creative.model.photomode.airewrite;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.CachePoweredTexts;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CachePoweredTexts implements Parcelable {
    public static final Parcelable.Creator<CachePoweredTexts> CREATOR = new Parcelable.Creator<CachePoweredTexts>() { // from class: X.0mgz
        @Override // android.os.Parcelable.Creator
        public final CachePoweredTexts createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(PoweredTextItem.CREATOR.createFromParcel(parcel));
            }
            return new CachePoweredTexts(i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CachePoweredTexts[] newArray(int i) {
            return new CachePoweredTexts[i];
        }
    };

    @C040H
    public int currentIndex;

    @C040H
    public final List<PoweredTextItem> poweredTextList;

    public CachePoweredTexts() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachePoweredTexts)) {
            return false;
        }
        CachePoweredTexts cachePoweredTexts = (CachePoweredTexts) obj;
        return this.currentIndex == cachePoweredTexts.currentIndex && Intrinsics.LJFF(this.poweredTextList, cachePoweredTexts.poweredTextList);
    }

    public final int hashCode() {
        return (this.currentIndex * 31) + this.poweredTextList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachePoweredTexts(currentIndex=");
        sbLIZ.append(this.currentIndex);
        sbLIZ.append(", poweredTextList=");
        sbLIZ.append(this.poweredTextList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.currentIndex);
        List<PoweredTextItem> list = this.poweredTextList;
        parcel.writeInt(list.size());
        Iterator<PoweredTextItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ CachePoweredTexts(int i) {
        this(0, new ArrayList());
    }

    public CachePoweredTexts(int i, List<PoweredTextItem> list) {
        this.currentIndex = i;
        this.poweredTextList = list;
    }
}
