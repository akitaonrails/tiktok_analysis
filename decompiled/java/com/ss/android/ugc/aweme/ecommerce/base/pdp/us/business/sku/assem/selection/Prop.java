package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.Prop;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PropValue;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.RegionText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class Prop implements Parcelable {

    @C09CT("placeholder_prop_value")
    public final String placeholderPropValue;

    @C09CT("prop_id")
    public final String propId;

    @C09CT("prop_index")
    public final Integer propIndex;

    @C09CT("prop_name")
    public final RegionText propName;

    @C09CT("prop_values")
    public final List<PropValue> propValues;
    public static final Parcelable.Creator<Prop> CREATOR = new Parcelable.Creator<Prop>() { // from class: X.0mgY
        @Override // android.os.Parcelable.Creator
        public final Prop createFromParcel(Parcel parcel) {
            RegionText regionTextCreateFromParcel;
            Integer numValueOf;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                regionTextCreateFromParcel = null;
            } else {
                regionTextCreateFromParcel = RegionText.CREATOR.createFromParcel(parcel);
            }
            RegionText regionText = regionTextCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PropValue.CREATOR.createFromParcel(parcel));
                }
            }
            return new Prop(regionText, string, numValueOf, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Prop[] newArray(int i) {
            return new Prop[i];
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
        if (!(obj instanceof Prop)) {
            return false;
        }
        Prop prop = (Prop) obj;
        return Intrinsics.LJFF(this.propName, prop.propName) && Intrinsics.LJFF(this.propId, prop.propId) && Intrinsics.LJFF(this.propIndex, prop.propIndex) && Intrinsics.LJFF(this.placeholderPropValue, prop.placeholderPropValue) && Intrinsics.LJFF(this.propValues, prop.propValues);
    }

    public final int hashCode() {
        RegionText regionText = this.propName;
        int iHashCode = (regionText == null ? 0 : regionText.hashCode()) * 31;
        String str = this.propId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.propIndex;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.placeholderPropValue;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PropValue> list = this.propValues;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Prop(propName=");
        sbLIZ.append(this.propName);
        sbLIZ.append(", propId=");
        sbLIZ.append(this.propId);
        sbLIZ.append(", propIndex=");
        sbLIZ.append(this.propIndex);
        sbLIZ.append(", placeholderPropValue=");
        sbLIZ.append(this.placeholderPropValue);
        sbLIZ.append(", propValues=");
        sbLIZ.append(this.propValues);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RegionText regionText = this.propName;
        if (regionText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            regionText.writeToParcel(parcel, i);
        }
        parcel.writeString(this.propId);
        Integer num = this.propIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.placeholderPropValue);
        List<PropValue> list = this.propValues;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<PropValue> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public Prop(RegionText regionText, String str, Integer num, String str2, List<PropValue> list) {
        this.propName = regionText;
        this.propId = str;
        this.propIndex = num;
        this.placeholderPropValue = str2;
        this.propValues = list;
    }
}
