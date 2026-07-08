package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardRichText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardRichText implements Parcelable {

    @C09CT("arguments")
    public final Map<String, BillboardText> arguments;

    @C09CT("template_text")
    public final String templateText;
    public static final Parcelable.Creator<BillboardRichText> CREATOR = new Parcelable.Creator<BillboardRichText>() { // from class: X.0v94
        @Override // android.os.Parcelable.Creator
        public final BillboardRichText createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), BillboardText.CREATOR.createFromParcel(parcel));
                }
            }
            return new BillboardRichText(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardRichText[] newArray(int i) {
            return new BillboardRichText[i];
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
        if (!(obj instanceof BillboardRichText)) {
            return false;
        }
        BillboardRichText billboardRichText = (BillboardRichText) obj;
        return Intrinsics.LJFF(this.templateText, billboardRichText.templateText) && Intrinsics.LJFF(this.arguments, billboardRichText.arguments);
    }

    public final int hashCode() {
        String str = this.templateText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, BillboardText> map = this.arguments;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardRichText(templateText=");
        sbLIZ.append(this.templateText);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateText);
        Map<String, BillboardText> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, BillboardText> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    public BillboardRichText(String str, Map<String, BillboardText> map) {
        this.templateText = str;
        this.arguments = map;
    }
}
