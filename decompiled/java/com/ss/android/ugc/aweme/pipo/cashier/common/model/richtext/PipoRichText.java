package com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichTextAttribute;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoRichText implements Parcelable {
    public static final Parcelable.Creator<PipoRichText> CREATOR = new Parcelable.Creator<PipoRichText>() { // from class: X.0ulY
        @Override // android.os.Parcelable.Creator
        public final PipoRichText createFromParcel(Parcel parcel) {
            PipoRichTextAttribute pipoRichTextAttributeCreateFromParcel;
            String string = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        pipoRichTextAttributeCreateFromParcel = null;
                    } else {
                        pipoRichTextAttributeCreateFromParcel = PipoRichTextAttribute.CREATOR.createFromParcel(parcel);
                    }
                    linkedHashMap2.put(string2, pipoRichTextAttributeCreateFromParcel);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PipoRichText(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PipoRichText[] newArray(int i) {
            return new PipoRichText[i];
        }
    };

    @C09CT("arguments")
    public final Map<String, PipoRichTextAttribute> arguments;

    @C09CT("template")
    public final String template;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoRichText)) {
            return false;
        }
        PipoRichText pipoRichText = (PipoRichText) obj;
        return Intrinsics.LJFF(this.template, pipoRichText.template) && Intrinsics.LJFF(this.arguments, pipoRichText.arguments);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, PipoRichTextAttribute> map = this.arguments;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoRichText(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.template);
        Map<String, PipoRichTextAttribute> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, PipoRichTextAttribute> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            PipoRichTextAttribute value = entry.getValue();
            if (value == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                value.writeToParcel(parcel, i);
            }
        }
    }

    public PipoRichText(String str, Map<String, PipoRichTextAttribute> map) {
        this.template = str;
        this.arguments = map;
    }
}
