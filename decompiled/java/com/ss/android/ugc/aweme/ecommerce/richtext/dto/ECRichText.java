package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ECRichText implements Parcelable {
    public static final Parcelable.Creator<ECRichText> CREATOR = new Parcelable.Creator<ECRichText>() { // from class: X.02mj
        @Override // android.os.Parcelable.Creator
        public final ECRichText createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ECRichTextAttribute eCRichTextAttributeCreateFromParcel;
            TextAttribute textAttributeCreateFromParcel;
            Integer numValueOf;
            String string = parcel.readString();
            ECRichTextExtraInfo eCRichTextExtraInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        eCRichTextAttributeCreateFromParcel = null;
                    } else {
                        eCRichTextAttributeCreateFromParcel = ECRichTextAttribute.CREATOR.createFromParcel(parcel);
                    }
                    linkedHashMap.put(string2, eCRichTextAttributeCreateFromParcel);
                }
            }
            if (parcel.readInt() == 0) {
                textAttributeCreateFromParcel = null;
            } else {
                textAttributeCreateFromParcel = TextAttribute.CREATOR.createFromParcel(parcel);
            }
            TextAttribute textAttribute = textAttributeCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                eCRichTextExtraInfoCreateFromParcel = ECRichTextExtraInfo.CREATOR.createFromParcel(parcel);
            }
            return new ECRichText(string, linkedHashMap, textAttribute, numValueOf, eCRichTextExtraInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ECRichText[] newArray(int i) {
            return new ECRichText[i];
        }
    };

    @C09CT("arguments")
    public Map<String, ECRichTextAttribute> arguments;

    @C09CT("extra_info")
    public ECRichTextExtraInfo extraInfo;
    public Function0<Unit> iconShowListener;

    @C09CT("template")
    public String template;

    @C09CT("text_alignment")
    public Integer textAlignment;

    @C09CT("text_attribute")
    public TextAttribute textAttribute;

    public ECRichText() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECRichText)) {
            return false;
        }
        ECRichText eCRichText = (ECRichText) obj;
        return Intrinsics.LJFF(this.template, eCRichText.template) && Intrinsics.LJFF(this.arguments, eCRichText.arguments) && Intrinsics.LJFF(this.textAttribute, eCRichText.textAttribute) && Intrinsics.LJFF(this.textAlignment, eCRichText.textAlignment) && Intrinsics.LJFF(this.extraInfo, eCRichText.extraInfo);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, ECRichTextAttribute> map = this.arguments;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        TextAttribute textAttribute = this.textAttribute;
        int iHashCode3 = (iHashCode2 + (textAttribute == null ? 0 : textAttribute.hashCode())) * 31;
        Integer num = this.textAlignment;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        ECRichTextExtraInfo eCRichTextExtraInfo = this.extraInfo;
        return iHashCode4 + (eCRichTextExtraInfo != null ? eCRichTextExtraInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECRichText(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(", textAttribute=");
        sbLIZ.append(this.textAttribute);
        sbLIZ.append(", textAlignment=");
        sbLIZ.append(this.textAlignment);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.template);
        Map<String, ECRichTextAttribute> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ECRichTextAttribute> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                ECRichTextAttribute value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, i);
                }
            }
        }
        TextAttribute textAttribute = this.textAttribute;
        if (textAttribute == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textAttribute.writeToParcel(parcel, i);
        }
        Integer num = this.textAlignment;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ECRichTextExtraInfo eCRichTextExtraInfo = this.extraInfo;
        if (eCRichTextExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCRichTextExtraInfo.writeToParcel(parcel, i);
        }
    }

    public static ECRichText LIZ(ECRichText eCRichText, Map map, TextAttribute textAttribute, int i) {
        String str;
        Integer num;
        TextAttribute textAttribute2 = textAttribute;
        Map map2 = map;
        ECRichTextExtraInfo eCRichTextExtraInfo = null;
        if ((i & 1) != 0) {
            str = eCRichText.template;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            map2 = eCRichText.arguments;
        }
        if ((i & 4) != 0) {
            textAttribute2 = eCRichText.textAttribute;
        }
        if ((i & 8) != 0) {
            num = eCRichText.textAlignment;
        } else {
            num = null;
        }
        if ((i & 16) != 0) {
            eCRichTextExtraInfo = eCRichText.extraInfo;
        }
        eCRichText.getClass();
        return new ECRichText(str, map2, textAttribute2, num, eCRichTextExtraInfo);
    }

    public ECRichText(String str, Map<String, ECRichTextAttribute> map, TextAttribute textAttribute, Integer num, ECRichTextExtraInfo eCRichTextExtraInfo) {
        this.template = str;
        this.arguments = map;
        this.textAttribute = textAttribute;
        this.textAlignment = num;
        this.extraInfo = eCRichTextExtraInfo;
    }
}
