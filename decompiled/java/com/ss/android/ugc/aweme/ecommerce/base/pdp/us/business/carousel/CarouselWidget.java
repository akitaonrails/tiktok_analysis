package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselWidgetUIConfig;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselWidget implements Parcelable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("lynx_data")
    public final Map<String, Object> lynxData;

    @C09CT("moves_with_element")
    public final Boolean movesWithElement;

    @C09CT("rich_texts")
    public final List<ECRichText> richTexts;

    @C09CT("schema")
    public final String schema;

    @C09CT("title")
    public final ECRichText title;

    @C09CT("ui_config")
    public final CarouselWidgetUIConfig uiConfig;

    @C09CT("widget_type")
    public final Integer widgetType;
    public static final Parcelable.Creator<CarouselWidget> CREATOR = new Parcelable.Creator<CarouselWidget>() { // from class: X.0vxJ
        @Override // android.os.Parcelable.Creator
        public final CarouselWidget createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList;
            CarouselWidgetUIConfig carouselWidgetUIConfigCreateFromParcel;
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(CarouselWidget.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(CarouselWidget.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                carouselWidgetUIConfigCreateFromParcel = null;
            } else {
                carouselWidgetUIConfigCreateFromParcel = CarouselWidgetUIConfig.CREATOR.createFromParcel(parcel);
            }
            CarouselWidgetUIConfig carouselWidgetUIConfig = carouselWidgetUIConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(CarouselWidget.class.getClassLoader()));
                }
            }
            return new CarouselWidget(numValueOf, boolValueOf, eCRichText, string, string2, arrayList, carouselWidgetUIConfig, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselWidget[] newArray(int i) {
            return new CarouselWidget[i];
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
        if (!(obj instanceof CarouselWidget)) {
            return false;
        }
        CarouselWidget carouselWidget = (CarouselWidget) obj;
        return Intrinsics.LJFF(this.widgetType, carouselWidget.widgetType) && Intrinsics.LJFF(this.movesWithElement, carouselWidget.movesWithElement) && Intrinsics.LJFF(this.title, carouselWidget.title) && Intrinsics.LJFF(this.schema, carouselWidget.schema) && Intrinsics.LJFF(this.daInfo, carouselWidget.daInfo) && Intrinsics.LJFF(this.richTexts, carouselWidget.richTexts) && Intrinsics.LJFF(this.uiConfig, carouselWidget.uiConfig) && Intrinsics.LJFF(this.lynxData, carouselWidget.lynxData);
    }

    public final int hashCode() {
        Integer num = this.widgetType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.movesWithElement;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ECRichText eCRichText = this.title;
        int iHashCode3 = (iHashCode2 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str = this.schema;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.daInfo;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ECRichText> list = this.richTexts;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        CarouselWidgetUIConfig carouselWidgetUIConfig = this.uiConfig;
        int iHashCode7 = (iHashCode6 + (carouselWidgetUIConfig == null ? 0 : carouselWidgetUIConfig.hashCode())) * 31;
        Map<String, Object> map = this.lynxData;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselWidget(widgetType=");
        sbLIZ.append(this.widgetType);
        sbLIZ.append(", movesWithElement=");
        sbLIZ.append(this.movesWithElement);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", richTexts=");
        sbLIZ.append(this.richTexts);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.uiConfig);
        sbLIZ.append(", lynxData=");
        sbLIZ.append(this.lynxData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.widgetType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.movesWithElement;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.title, i);
        parcel.writeString(this.schema);
        parcel.writeString(this.daInfo);
        List<ECRichText> list = this.richTexts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ECRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        CarouselWidgetUIConfig carouselWidgetUIConfig = this.uiConfig;
        if (carouselWidgetUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            carouselWidgetUIConfig.writeToParcel(parcel, i);
        }
        Map<String, Object> map = this.lynxData;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    public CarouselWidget(Integer num, Boolean bool, ECRichText eCRichText, String str, String str2, List<ECRichText> list, CarouselWidgetUIConfig carouselWidgetUIConfig, Map<String, ? extends Object> map) {
        this.widgetType = num;
        this.movesWithElement = bool;
        this.title = eCRichText;
        this.schema = str;
        this.daInfo = str2;
        this.richTexts = list;
        this.uiConfig = carouselWidgetUIConfig;
        this.lynxData = map;
    }
}
