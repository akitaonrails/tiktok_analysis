package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserRightDesc implements Parcelable {

    @C09CT("block_list")
    public List<UserRightDescBlock> block_list;

    @C09CT("desc_font_color")
    public String descFontColor;

    @C09CT("desc_font_dark_color")
    public String descFontDarkColor;

    @C09CT("description")
    public String description;

    @C09CT("icon")
    public Icon icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("item_type")
    public Integer itemType;

    @C09CT("name")
    public String name;

    @C09CT("name_en")
    public String nameEn;

    @C09CT("name_font")
    public Integer nameFont;
    public static final Parcelable.Creator<UserRightDesc> CREATOR = new Parcelable.Creator<UserRightDesc>() { // from class: X.02XX
        @Override // android.os.Parcelable.Creator
        public final UserRightDesc createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UserRightDescBlock.CREATOR.createFromParcel(parcel));
                }
            }
            Icon icon = (Icon) parcel.readParcelable(UserRightDesc.class.getClassLoader());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new UserRightDesc(string, string2, string3, numValueOf, string4, arrayList, icon, string5, string6, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final UserRightDesc[] newArray(int i) {
            return new UserRightDesc[i];
        }
    };
    public static final int $stable = 8;

    public UserRightDesc() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRightDesc)) {
            return false;
        }
        UserRightDesc userRightDesc = (UserRightDesc) obj;
        return Intrinsics.LJFF(this.id, userRightDesc.id) && Intrinsics.LJFF(this.name, userRightDesc.name) && Intrinsics.LJFF(this.description, userRightDesc.description) && Intrinsics.LJFF(this.itemType, userRightDesc.itemType) && Intrinsics.LJFF(this.nameEn, userRightDesc.nameEn) && Intrinsics.LJFF(this.block_list, userRightDesc.block_list) && Intrinsics.LJFF(this.icon, userRightDesc.icon) && Intrinsics.LJFF(this.descFontColor, userRightDesc.descFontColor) && Intrinsics.LJFF(this.descFontDarkColor, userRightDesc.descFontDarkColor) && Intrinsics.LJFF(this.nameFont, userRightDesc.nameFont);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.itemType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.nameEn;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<UserRightDescBlock> list = this.block_list;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode7 = (iHashCode6 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str5 = this.descFontColor;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.descFontDarkColor;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.nameFont;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserRightDesc(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", itemType=");
        sbLIZ.append(this.itemType);
        sbLIZ.append(", nameEn=");
        sbLIZ.append(this.nameEn);
        sbLIZ.append(", block_list=");
        sbLIZ.append(this.block_list);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", descFontColor=");
        sbLIZ.append(this.descFontColor);
        sbLIZ.append(", descFontDarkColor=");
        sbLIZ.append(this.descFontDarkColor);
        sbLIZ.append(", nameFont=");
        sbLIZ.append(this.nameFont);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        Integer num = this.itemType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.nameEn);
        List<UserRightDescBlock> list = this.block_list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UserRightDescBlock> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.descFontColor);
        parcel.writeString(this.descFontDarkColor);
        Integer num2 = this.nameFont;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public UserRightDesc(String str, String str2, String str3, Integer num, String str4, List<UserRightDescBlock> list, Icon icon, String str5, String str6, Integer num2) {
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.itemType = num;
        this.nameEn = str4;
        this.block_list = list;
        this.icon = icon;
        this.descFontColor = str5;
        this.descFontDarkColor = str6;
        this.nameFont = num2;
    }
}
