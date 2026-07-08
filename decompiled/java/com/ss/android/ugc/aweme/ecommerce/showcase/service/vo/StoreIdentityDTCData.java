package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityDTCData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeColor;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreIdentityDTCData implements Parcelable {
    public static final Parcelable.Creator<StoreIdentityDTCData> CREATOR = new Parcelable.Creator<StoreIdentityDTCData>() { // from class: X.02fA
        @Override // android.os.Parcelable.Creator
        public final StoreIdentityDTCData createFromParcel(Parcel parcel) {
            ThemeColor themeColorCreateFromParcel;
            ThemeColor themeColorCreateFromParcel2;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            ThemeImage themeImageCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                themeColorCreateFromParcel = null;
            } else {
                themeColorCreateFromParcel = ThemeColor.CREATOR.createFromParcel(parcel);
            }
            ThemeColor themeColor = themeColorCreateFromParcel;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                themeColorCreateFromParcel2 = null;
            } else {
                themeColorCreateFromParcel2 = ThemeColor.CREATOR.createFromParcel(parcel);
            }
            ThemeColor themeColor2 = themeColorCreateFromParcel2;
            if (parcel.readInt() != 0) {
                themeImageCreateFromParcel = ThemeImage.CREATOR.createFromParcel(parcel);
            }
            return new StoreIdentityDTCData(string, arrayListCreateStringArrayList, string2, themeColor, string3, themeColor2, themeImageCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreIdentityDTCData[] newArray(int i) {
            return new StoreIdentityDTCData[i];
        }
    };

    @C09CT("banner_text_color")
    public ThemeColor bannerTextColor;

    @C09CT("bg_image")
    public ThemeImage bgImage;

    @C09CT("direct_from_text")
    public String directFromText;

    @C09CT("equity_text")
    public String equityText;

    @C09CT("right_id_list")
    public List<String> rightIdList;

    @C09CT("schema")
    public String schema;

    @C09CT("text_color")
    public ThemeColor textColor;

    public StoreIdentityDTCData() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreIdentityDTCData)) {
            return false;
        }
        StoreIdentityDTCData storeIdentityDTCData = (StoreIdentityDTCData) obj;
        return Intrinsics.LJFF(this.schema, storeIdentityDTCData.schema) && Intrinsics.LJFF(this.rightIdList, storeIdentityDTCData.rightIdList) && Intrinsics.LJFF(this.directFromText, storeIdentityDTCData.directFromText) && Intrinsics.LJFF(this.bannerTextColor, storeIdentityDTCData.bannerTextColor) && Intrinsics.LJFF(this.equityText, storeIdentityDTCData.equityText) && Intrinsics.LJFF(this.textColor, storeIdentityDTCData.textColor) && Intrinsics.LJFF(this.bgImage, storeIdentityDTCData.bgImage);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.rightIdList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.directFromText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemeColor themeColor = this.bannerTextColor;
        int iHashCode4 = (iHashCode3 + (themeColor == null ? 0 : themeColor.hashCode())) * 31;
        String str3 = this.equityText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ThemeColor themeColor2 = this.textColor;
        int iHashCode6 = (iHashCode5 + (themeColor2 == null ? 0 : themeColor2.hashCode())) * 31;
        ThemeImage themeImage = this.bgImage;
        return iHashCode6 + (themeImage != null ? themeImage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreIdentityDTCData(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", rightIdList=");
        sbLIZ.append(this.rightIdList);
        sbLIZ.append(", directFromText=");
        sbLIZ.append(this.directFromText);
        sbLIZ.append(", bannerTextColor=");
        sbLIZ.append(this.bannerTextColor);
        sbLIZ.append(", equityText=");
        sbLIZ.append(this.equityText);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", bgImage=");
        sbLIZ.append(this.bgImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        parcel.writeStringList(this.rightIdList);
        parcel.writeString(this.directFromText);
        ThemeColor themeColor = this.bannerTextColor;
        if (themeColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeColor.writeToParcel(parcel, i);
        }
        parcel.writeString(this.equityText);
        ThemeColor themeColor2 = this.textColor;
        if (themeColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeColor2.writeToParcel(parcel, i);
        }
        ThemeImage themeImage = this.bgImage;
        if (themeImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeImage.writeToParcel(parcel, i);
        }
    }

    public StoreIdentityDTCData(String str, List<String> list, String str2, ThemeColor themeColor, String str3, ThemeColor themeColor2, ThemeImage themeImage) {
        this.schema = str;
        this.rightIdList = list;
        this.directFromText = str2;
        this.bannerTextColor = themeColor;
        this.equityText = str3;
        this.textColor = themeColor2;
        this.bgImage = themeImage;
    }
}
