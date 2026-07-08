package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropValue;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.RegionText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuImage;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PropValue implements Parcelable {

    @C09CT("event_tracking_trigger_keys")
    public final Map<String, String> eventTrackingTriggerKeys;

    @C09CT("hot_tag")
    public final SalePropTag hotTag;

    @C09CT("prop_image")
    public final Image propImage;

    @C09CT("prop_value_id")
    public final String propValueId;

    @C09CT("prop_value_name")
    public final RegionText propValueName;

    @C09CT("sku_images")
    public final List<SkuImage> skuImages;
    public static final Parcelable.Creator<PropValue> CREATOR = new Parcelable.Creator<PropValue>() { // from class: X.0mgX
        @Override // android.os.Parcelable.Creator
        public final PropValue createFromParcel(Parcel parcel) {
            RegionText regionTextCreateFromParcel;
            ArrayList arrayList;
            SalePropTag salePropTagCreateFromParcel;
            String string = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                regionTextCreateFromParcel = null;
            } else {
                regionTextCreateFromParcel = RegionText.CREATOR.createFromParcel(parcel);
            }
            RegionText regionText = regionTextCreateFromParcel;
            Image image = (Image) parcel.readParcelable(PropValue.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SkuImage.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                salePropTagCreateFromParcel = null;
            } else {
                salePropTagCreateFromParcel = SalePropTag.CREATOR.createFromParcel(parcel);
            }
            SalePropTag salePropTag = salePropTagCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new PropValue(string, regionText, image, arrayList, salePropTag, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PropValue[] newArray(int i) {
            return new PropValue[i];
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
        if (!(obj instanceof PropValue)) {
            return false;
        }
        PropValue propValue = (PropValue) obj;
        return Intrinsics.LJFF(this.propValueId, propValue.propValueId) && Intrinsics.LJFF(this.propValueName, propValue.propValueName) && Intrinsics.LJFF(this.propImage, propValue.propImage) && Intrinsics.LJFF(this.skuImages, propValue.skuImages) && Intrinsics.LJFF(this.hotTag, propValue.hotTag) && Intrinsics.LJFF(this.eventTrackingTriggerKeys, propValue.eventTrackingTriggerKeys);
    }

    public final int hashCode() {
        String str = this.propValueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RegionText regionText = this.propValueName;
        int iHashCode2 = (iHashCode + (regionText == null ? 0 : regionText.hashCode())) * 31;
        Image image = this.propImage;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        List<SkuImage> list = this.skuImages;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SalePropTag salePropTag = this.hotTag;
        int iHashCode5 = (iHashCode4 + (salePropTag == null ? 0 : salePropTag.hashCode())) * 31;
        Map<String, String> map = this.eventTrackingTriggerKeys;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropValue(propValueId=");
        sbLIZ.append(this.propValueId);
        sbLIZ.append(", propValueName=");
        sbLIZ.append(this.propValueName);
        sbLIZ.append(", propImage=");
        sbLIZ.append(this.propImage);
        sbLIZ.append(", skuImages=");
        sbLIZ.append(this.skuImages);
        sbLIZ.append(", hotTag=");
        sbLIZ.append(this.hotTag);
        sbLIZ.append(", eventTrackingTriggerKeys=");
        sbLIZ.append(this.eventTrackingTriggerKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.propValueId);
        RegionText regionText = this.propValueName;
        if (regionText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            regionText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.propImage, i);
        List<SkuImage> list = this.skuImages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SkuImage> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        SalePropTag salePropTag = this.hotTag;
        if (salePropTag == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            salePropTag.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.eventTrackingTriggerKeys;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public PropValue(String str, RegionText regionText, Image image, List<SkuImage> list, SalePropTag salePropTag, Map<String, String> map) {
        this.propValueId = str;
        this.propValueName = regionText;
        this.propImage = image;
        this.skuImages = list;
        this.hotTag = salePropTag;
        this.eventTrackingTriggerKeys = map;
    }
}
