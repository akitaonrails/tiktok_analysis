package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityBannerStyle;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeColor;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreIdentityBannerStyle implements Parcelable {
    public static final Parcelable.Creator<StoreIdentityBannerStyle> CREATOR = new Parcelable.Creator<StoreIdentityBannerStyle>() { // from class: X.02f9
        @Override // android.os.Parcelable.Creator
        public final StoreIdentityBannerStyle createFromParcel(Parcel parcel) {
            ThemeImage themeImageCreateFromParcel;
            ThemeImage themeImageCreateFromParcel2;
            ThemeColor themeColorCreateFromParcel;
            ThemeImage themeImageCreateFromParcel3;
            ThemeColor themeColorCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                themeImageCreateFromParcel = null;
            } else {
                themeImageCreateFromParcel = ThemeImage.CREATOR.createFromParcel(parcel);
            }
            ThemeImage themeImage = themeImageCreateFromParcel;
            if (parcel.readInt() == 0) {
                themeImageCreateFromParcel2 = null;
            } else {
                themeImageCreateFromParcel2 = ThemeImage.CREATOR.createFromParcel(parcel);
            }
            ThemeImage themeImage2 = themeImageCreateFromParcel2;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                themeColorCreateFromParcel = null;
            } else {
                themeColorCreateFromParcel = ThemeColor.CREATOR.createFromParcel(parcel);
            }
            ThemeColor themeColor = themeColorCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                themeImageCreateFromParcel3 = null;
            } else {
                themeImageCreateFromParcel3 = ThemeImage.CREATOR.createFromParcel(parcel);
            }
            ThemeImage themeImage3 = themeImageCreateFromParcel3;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                themeColorCreateFromParcel2 = ThemeColor.CREATOR.createFromParcel(parcel);
            }
            return new StoreIdentityBannerStyle(themeImage, themeImage2, string, themeColor, string2, themeImage3, arrayListCreateStringArrayList, themeColorCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreIdentityBannerStyle[] newArray(int i) {
            return new StoreIdentityBannerStyle[i];
        }
    };

    @C09CT("bg_image")
    public ThemeImage bgImage;

    @C09CT("bg_stroke_color")
    public ThemeColor bgStokeColor;

    @C09CT("equity_text")
    public String equityText;

    @C09CT("left_image")
    public ThemeImage leftImage;

    @C09CT("right_id_list")
    public List<String> rightIdList;

    @C09CT("right_image")
    public ThemeImage rightImage;

    @C09CT("schema")
    public String schema;

    @C09CT("text_color")
    public ThemeColor textColor;

    public StoreIdentityBannerStyle() {
        this(null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreIdentityBannerStyle)) {
            return false;
        }
        StoreIdentityBannerStyle storeIdentityBannerStyle = (StoreIdentityBannerStyle) obj;
        return Intrinsics.LJFF(this.bgImage, storeIdentityBannerStyle.bgImage) && Intrinsics.LJFF(this.leftImage, storeIdentityBannerStyle.leftImage) && Intrinsics.LJFF(this.equityText, storeIdentityBannerStyle.equityText) && Intrinsics.LJFF(this.textColor, storeIdentityBannerStyle.textColor) && Intrinsics.LJFF(this.schema, storeIdentityBannerStyle.schema) && Intrinsics.LJFF(this.rightImage, storeIdentityBannerStyle.rightImage) && Intrinsics.LJFF(this.rightIdList, storeIdentityBannerStyle.rightIdList) && Intrinsics.LJFF(this.bgStokeColor, storeIdentityBannerStyle.bgStokeColor);
    }

    public final int hashCode() {
        ThemeImage themeImage = this.bgImage;
        int iHashCode = (themeImage == null ? 0 : themeImage.hashCode()) * 31;
        ThemeImage themeImage2 = this.leftImage;
        int iHashCode2 = (iHashCode + (themeImage2 == null ? 0 : themeImage2.hashCode())) * 31;
        String str = this.equityText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ThemeColor themeColor = this.textColor;
        int iHashCode4 = (iHashCode3 + (themeColor == null ? 0 : themeColor.hashCode())) * 31;
        String str2 = this.schema;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemeImage themeImage3 = this.rightImage;
        int iHashCode6 = (iHashCode5 + (themeImage3 == null ? 0 : themeImage3.hashCode())) * 31;
        List<String> list = this.rightIdList;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        ThemeColor themeColor2 = this.bgStokeColor;
        return iHashCode7 + (themeColor2 != null ? themeColor2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreIdentityBannerStyle(bgImage=");
        sbLIZ.append(this.bgImage);
        sbLIZ.append(", leftImage=");
        sbLIZ.append(this.leftImage);
        sbLIZ.append(", equityText=");
        sbLIZ.append(this.equityText);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", rightImage=");
        sbLIZ.append(this.rightImage);
        sbLIZ.append(", rightIdList=");
        sbLIZ.append(this.rightIdList);
        sbLIZ.append(", bgStokeColor=");
        sbLIZ.append(this.bgStokeColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ThemeImage themeImage = this.bgImage;
        if (themeImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeImage.writeToParcel(parcel, i);
        }
        ThemeImage themeImage2 = this.leftImage;
        if (themeImage2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeImage2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.equityText);
        ThemeColor themeColor = this.textColor;
        if (themeColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeColor.writeToParcel(parcel, i);
        }
        parcel.writeString(this.schema);
        ThemeImage themeImage3 = this.rightImage;
        if (themeImage3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeImage3.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.rightIdList);
        ThemeColor themeColor2 = this.bgStokeColor;
        if (themeColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeColor2.writeToParcel(parcel, i);
        }
    }

    public StoreIdentityBannerStyle(ThemeImage themeImage, ThemeImage themeImage2, String str, ThemeColor themeColor, String str2, ThemeImage themeImage3, List<String> list, ThemeColor themeColor2) {
        this.bgImage = themeImage;
        this.leftImage = themeImage2;
        this.equityText = str;
        this.textColor = themeColor;
        this.schema = str2;
        this.rightImage = themeImage3;
        this.rightIdList = list;
        this.bgStokeColor = themeColor2;
    }
}
