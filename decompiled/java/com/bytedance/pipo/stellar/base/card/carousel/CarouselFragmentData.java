package com.bytedance.pipo.stellar.base.card.carousel;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.pipo.stellar.base.card.carousel.CarouselFragmentData;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselFragmentData extends PowerViewPagerFragmentItem<CarouselFragment> {
    public static final Parcelable.Creator<CarouselFragmentData> CREATOR = new Parcelable.Creator<CarouselFragmentData>() { // from class: X.0utI
        @Override // android.os.Parcelable.Creator
        public final CarouselFragmentData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new CarouselFragmentData(arrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselFragmentData[] newArray(int i) {
            return new CarouselFragmentData[i];
        }
    };
    public final List<CardDO> cardData;
    public final boolean suppressCarouselV2ScrollListener;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselFragmentData)) {
            return false;
        }
        CarouselFragmentData carouselFragmentData = (CarouselFragmentData) obj;
        return Intrinsics.LJFF(this.cardData, carouselFragmentData.cardData) && this.suppressCarouselV2ScrollListener == carouselFragmentData.suppressCarouselV2ScrollListener;
    }

    public final int hashCode() {
        List<CardDO> list = this.cardData;
        return ((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.suppressCarouselV2ScrollListener);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselFragmentData(cardData=");
        sbLIZ.append(this.cardData);
        sbLIZ.append(", suppressCarouselV2ScrollListener=");
        sbLIZ.append(this.suppressCarouselV2ScrollListener);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<CardDO> list = this.cardData;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CardDO> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeInt(this.suppressCarouselV2ScrollListener ? 1 : 0);
    }

    public CarouselFragmentData(List<CardDO> list, boolean z) {
        this.cardData = list;
        this.suppressCarouselV2ScrollListener = z;
    }
}
