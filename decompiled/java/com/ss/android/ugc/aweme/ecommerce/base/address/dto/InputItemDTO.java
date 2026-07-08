package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C19719612Di;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InputItemDTO implements Parcelable {

    @C09CT("arguments")
    public Map<String, LinkText> arguments;

    @C09CT("default_value")
    public String defaultValue;

    @C09CT("extra_params")
    public Map<String, String> extraParams;

    @C09CT("hint")
    public String hint;

    @C09CT("input_hint_message")
    public String inputHintMessage;

    @C09CT("key")
    public String key;

    @C09CT("max_length")
    public Integer maxLength;

    @C09CT("max_line")
    public Integer maxLines;

    @C09CT("rules")
    public List<Rule> rules;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public Integer type;
    public static final Parcelable.Creator<InputItemDTO> CREATOR = new Parcelable.Creator<InputItemDTO>() { // from class: X.02no
        @Override // android.os.Parcelable.Creator
        public final InputItemDTO createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            LinkText linkTextCreateFromParcel;
            LinkedHashMap linkedHashMap2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    String string6 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        linkTextCreateFromParcel = null;
                    } else {
                        linkTextCreateFromParcel = LinkText.CREATOR.createFromParcel(parcel);
                    }
                    linkedHashMap.put(string6, linkTextCreateFromParcel);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            return new InputItemDTO(string, string2, string3, numValueOf, numValueOf2, string4, numValueOf3, arrayList, string5, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final InputItemDTO[] newArray(int i) {
            return new InputItemDTO[i];
        }
    };
    public static final int $stable = 8;

    public InputItemDTO() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItemDTO)) {
            return false;
        }
        InputItemDTO inputItemDTO = (InputItemDTO) obj;
        return Intrinsics.LJFF(this.defaultValue, inputItemDTO.defaultValue) && Intrinsics.LJFF(this.hint, inputItemDTO.hint) && Intrinsics.LJFF(this.key, inputItemDTO.key) && Intrinsics.LJFF(this.maxLength, inputItemDTO.maxLength) && Intrinsics.LJFF(this.maxLines, inputItemDTO.maxLines) && Intrinsics.LJFF(this.title, inputItemDTO.title) && Intrinsics.LJFF(this.type, inputItemDTO.type) && Intrinsics.LJFF(this.rules, inputItemDTO.rules) && Intrinsics.LJFF(this.inputHintMessage, inputItemDTO.inputHintMessage) && Intrinsics.LJFF(this.arguments, inputItemDTO.arguments) && Intrinsics.LJFF(this.extraParams, inputItemDTO.extraParams);
    }

    public final int hashCode() {
        String str = this.defaultValue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.maxLength;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxLines;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.type;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Rule> list = this.rules;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.inputHintMessage;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, LinkText> map = this.arguments;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.extraParams;
        return iHashCode10 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "InputItemDTO(defaultValue=" + this.defaultValue + ", hint=" + this.hint + ", key=" + this.key + ", maxLength=" + this.maxLength + ", maxLines=" + this.maxLines + ", title=" + this.title + ", type=" + this.type + ", rules=" + this.rules + ", inputHintMessage=" + this.inputHintMessage + ", arguments=" + this.arguments + ", extraParams=" + this.extraParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.defaultValue);
        parcel.writeString(this.hint);
        parcel.writeString(this.key);
        Integer num = this.maxLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.maxLines;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.title);
        Integer num3 = this.type;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        List<Rule> list = this.rules;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Rule> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.inputHintMessage);
        Map<String, LinkText> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, LinkText> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                LinkText value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, i);
                }
            }
        }
        Map<String, String> map2 = this.extraParams;
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

    public final void LIZIZ() {
        List<Rule> list = this.rules;
        if (list != null) {
            C19719612Di.LJJIIJ(list, AFwS228S0000000_1.get$arr$(801), true);
        }
    }

    public static InputItemDTO LIZ(InputItemDTO inputItemDTO, Integer num) {
        String str = inputItemDTO.defaultValue;
        String str2 = inputItemDTO.hint;
        String str3 = inputItemDTO.key;
        Integer num2 = inputItemDTO.maxLength;
        Integer num3 = inputItemDTO.maxLines;
        String str4 = inputItemDTO.title;
        List<Rule> list = inputItemDTO.rules;
        String str5 = inputItemDTO.inputHintMessage;
        Map<String, LinkText> map = inputItemDTO.arguments;
        Map<String, String> map2 = inputItemDTO.extraParams;
        inputItemDTO.getClass();
        return new InputItemDTO(str, str2, str3, num2, num3, str4, num, list, str5, map, map2);
    }

    public InputItemDTO(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, List<Rule> list, String str5, Map<String, LinkText> map, Map<String, String> map2) {
        this.defaultValue = str;
        this.hint = str2;
        this.key = str3;
        this.maxLength = num;
        this.maxLines = num2;
        this.title = str4;
        this.type = num3;
        this.rules = list;
        this.inputHintMessage = str5;
        this.arguments = map;
        this.extraParams = map2;
    }
}
