package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SKUPanelBottomText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SKUPanelBottomText implements Parcelable {

    @C09CT("arguments")
    public final Map<String, String> arguments;

    @C09CT("material_type")
    public final Integer materialType;

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<SKUPanelBottomText> CREATOR = new Parcelable.Creator<SKUPanelBottomText>() { // from class: X.02yC
        @Override // android.os.Parcelable.Creator
        public final SKUPanelBottomText createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SKUPanelBottomText(string, linkedHashMap, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SKUPanelBottomText[] newArray(int i) {
            return new SKUPanelBottomText[i];
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
        if (!(obj instanceof SKUPanelBottomText)) {
            return false;
        }
        SKUPanelBottomText sKUPanelBottomText = (SKUPanelBottomText) obj;
        return Intrinsics.LJFF(this.text, sKUPanelBottomText.text) && Intrinsics.LJFF(this.arguments, sKUPanelBottomText.arguments) && Intrinsics.LJFF(this.materialType, sKUPanelBottomText.materialType);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.arguments;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.materialType;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SKUPanelBottomText(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(", materialType=");
        sbLIZ.append(this.materialType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Map<String, String> map = this.arguments;
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
        Integer num = this.materialType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public SKUPanelBottomText(String str, Map<String, String> map, Integer num) {
        this.text = str;
        this.arguments = map;
        this.materialType = num;
    }
}
