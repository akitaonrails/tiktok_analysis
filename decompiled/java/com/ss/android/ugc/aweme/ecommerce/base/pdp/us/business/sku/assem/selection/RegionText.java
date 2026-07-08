package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.RegionText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RegionText implements Parcelable {

    @C09CT("default_label")
    public final String defaultLabel;

    @C09CT("region_label_map")
    public final Map<String, String> regionLabelMap;
    public static final Parcelable.Creator<RegionText> CREATOR = new Parcelable.Creator<RegionText>() { // from class: X.0mdo
        @Override // android.os.Parcelable.Creator
        public final RegionText createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new RegionText(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final RegionText[] newArray(int i) {
            return new RegionText[i];
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
        if (!(obj instanceof RegionText)) {
            return false;
        }
        RegionText regionText = (RegionText) obj;
        return Intrinsics.LJFF(this.defaultLabel, regionText.defaultLabel) && Intrinsics.LJFF(this.regionLabelMap, regionText.regionLabelMap);
    }

    public final int hashCode() {
        String str = this.defaultLabel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.regionLabelMap;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegionText(defaultLabel=");
        sbLIZ.append(this.defaultLabel);
        sbLIZ.append(", regionLabelMap=");
        sbLIZ.append(this.regionLabelMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.defaultLabel);
        Map<String, String> map = this.regionLabelMap;
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

    public RegionText(String str, Map<String, String> map) {
        this.defaultLabel = str;
        this.regionLabelMap = map;
    }
}
