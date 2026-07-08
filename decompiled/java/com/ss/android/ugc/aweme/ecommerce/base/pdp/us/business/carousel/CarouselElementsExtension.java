package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElementsExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CarouselElementsExtension implements Parcelable {

    @C09CT("sale_prop_value_id_to_sku_id")
    public final Map<String, String> salePropToSkuIdMap;

    @C09CT("sales_prop_extended_images")
    public final Map<String, List<CarouselElement>> salesPropExtendedImages;

    @C09CT("sku_original_images")
    public final Map<String, List<CarouselElement>> skuOriginalImages;
    public static final Parcelable.Creator<CarouselElementsExtension> CREATOR = new Parcelable.Creator<CarouselElementsExtension>() { // from class: X.0mdw
        @Override // android.os.Parcelable.Creator
        public final CarouselElementsExtension createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string = parcel.readString();
                    int i3 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList.add(CarouselElement.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap.put(string, arrayList);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    String string2 = parcel.readString();
                    int i7 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        arrayList2.add(CarouselElement.CREATOR.createFromParcel(parcel));
                    }
                    linkedHashMap2.put(string2, arrayList2);
                }
            }
            if (parcel.readInt() != 0) {
                int i9 = parcel.readInt();
                linkedHashMap3 = new LinkedHashMap(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                }
            }
            return new CarouselElementsExtension(linkedHashMap, linkedHashMap2, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselElementsExtension[] newArray(int i) {
            return new CarouselElementsExtension[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselElementsExtension)) {
            return false;
        }
        CarouselElementsExtension carouselElementsExtension = (CarouselElementsExtension) obj;
        return Intrinsics.LJFF(this.salesPropExtendedImages, carouselElementsExtension.salesPropExtendedImages) && Intrinsics.LJFF(this.skuOriginalImages, carouselElementsExtension.skuOriginalImages) && Intrinsics.LJFF(this.salePropToSkuIdMap, carouselElementsExtension.salePropToSkuIdMap);
    }

    public final int hashCode() {
        Map<String, List<CarouselElement>> map = this.salesPropExtendedImages;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<CarouselElement>> map2 = this.skuOriginalImages;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.salePropToSkuIdMap;
        return iHashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselElementsExtension(salesPropExtendedImages=");
        sbLIZ.append(this.salesPropExtendedImages);
        sbLIZ.append(", skuOriginalImages=");
        sbLIZ.append(this.skuOriginalImages);
        sbLIZ.append(", salePropToSkuIdMap=");
        sbLIZ.append(this.salePropToSkuIdMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, List<CarouselElement>> map = this.salesPropExtendedImages;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, List<CarouselElement>> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                List<CarouselElement> value = entry.getValue();
                parcel.writeInt(value.size());
                Iterator<CarouselElement> it2 = value.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
        }
        Map<String, List<CarouselElement>> map2 = this.skuOriginalImages;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, List<CarouselElement>> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                List<CarouselElement> value2 = entry2.getValue();
                parcel.writeInt(value2.size());
                Iterator<CarouselElement> it3 = value2.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
        }
        Map<String, String> map3 = this.salePropToSkuIdMap;
        if (map3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map3.size());
        for (Map.Entry<String, String> entry3 : map3.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeString(entry3.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselElementsExtension(Map<String, ? extends List<CarouselElement>> map, Map<String, ? extends List<CarouselElement>> map2, Map<String, String> map3) {
        this.salesPropExtendedImages = map;
        this.skuOriginalImages = map2;
        this.salePropToSkuIdMap = map3;
    }
}
