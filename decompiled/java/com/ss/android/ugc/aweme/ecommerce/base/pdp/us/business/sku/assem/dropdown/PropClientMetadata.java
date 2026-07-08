package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PropClientMetadata;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.Prop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PropClientMetadata implements Parcelable {

    @C09CT("event_tracking_trigger_keys")
    public final Map<String, String> eventTrackingTriggerKeys;

    @C09CT("product_link_map")
    public final Map<String, String> productLinkMap;

    @C09CT("props")
    public final List<Prop> props;
    public static final Parcelable.Creator<PropClientMetadata> CREATOR = new Parcelable.Creator<PropClientMetadata>() { // from class: X.0mga
        @Override // android.os.Parcelable.Creator
        public final PropClientMetadata createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Prop.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            return new PropClientMetadata(arrayList, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final PropClientMetadata[] newArray(int i) {
            return new PropClientMetadata[i];
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
        if (!(obj instanceof PropClientMetadata)) {
            return false;
        }
        PropClientMetadata propClientMetadata = (PropClientMetadata) obj;
        return Intrinsics.LJFF(this.props, propClientMetadata.props) && Intrinsics.LJFF(this.productLinkMap, propClientMetadata.productLinkMap) && Intrinsics.LJFF(this.eventTrackingTriggerKeys, propClientMetadata.eventTrackingTriggerKeys);
    }

    public final int hashCode() {
        List<Prop> list = this.props;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, String> map = this.productLinkMap;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.eventTrackingTriggerKeys;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropClientMetadata(props=");
        sbLIZ.append(this.props);
        sbLIZ.append(", productLinkMap=");
        sbLIZ.append(this.productLinkMap);
        sbLIZ.append(", eventTrackingTriggerKeys=");
        sbLIZ.append(this.eventTrackingTriggerKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Prop> list = this.props;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Prop> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Map<String, String> map = this.productLinkMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, String> map2 = this.eventTrackingTriggerKeys;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public PropClientMetadata(List<Prop> list, Map<String, String> map, Map<String, String> map2) {
        this.props = list;
        this.productLinkMap = map;
        this.eventTrackingTriggerKeys = map2;
    }
}
