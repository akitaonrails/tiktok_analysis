package com.ss.android.ugc.aweme.ecommerce.showcase.service.vo;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreBrandInfo;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreIdentityAuthorizedData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeColor;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.ThemeImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreIdentityAuthorizedData implements Parcelable {
    public static final Parcelable.Creator<StoreIdentityAuthorizedData> CREATOR = new Parcelable.Creator<StoreIdentityAuthorizedData>() { // from class: X.02f8
        @Override // android.os.Parcelable.Creator
        public final StoreIdentityAuthorizedData createFromParcel(Parcel parcel) {
            ThemeImage themeImageCreateFromParcel;
            ArrayList arrayList;
            Integer numValueOf;
            ThemeColor themeColorCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                themeImageCreateFromParcel = null;
            } else {
                themeImageCreateFromParcel = ThemeImage.CREATOR.createFromParcel(parcel);
            }
            ThemeImage themeImage = themeImageCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(StoreBrandInfo.CREATOR.createFromParcel(parcel));
                }
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                themeColorCreateFromParcel = ThemeColor.CREATOR.createFromParcel(parcel);
            }
            return new StoreIdentityAuthorizedData(themeImage, string, string2, arrayList, string3, string4, numValueOf, arrayListCreateStringArrayList, themeColorCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreIdentityAuthorizedData[] newArray(int i) {
            return new StoreIdentityAuthorizedData[i];
        }
    };

    @C09CT("bg_image")
    public ThemeImage bgImage;

    @C09CT("brand_authorized_text")
    public String brandAuthorizedText;

    @C09CT("default_authorized_text")
    public String defaultAuthorizedText;

    @C09CT("equity_text")
    public String equityText;

    @C09CT("right_id_list")
    public List<String> rightIdList;

    @C09CT("schema")
    public String schema;

    @C09CT("store_brand_info")
    public List<StoreBrandInfo> storeBrandInfo;

    @C09CT("store_brand_size")
    public Integer storeBrandSize;

    @C09CT("text_color")
    public ThemeColor textColor;

    public StoreIdentityAuthorizedData() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreIdentityAuthorizedData)) {
            return false;
        }
        StoreIdentityAuthorizedData storeIdentityAuthorizedData = (StoreIdentityAuthorizedData) obj;
        return Intrinsics.LJFF(this.bgImage, storeIdentityAuthorizedData.bgImage) && Intrinsics.LJFF(this.schema, storeIdentityAuthorizedData.schema) && Intrinsics.LJFF(this.equityText, storeIdentityAuthorizedData.equityText) && Intrinsics.LJFF(this.storeBrandInfo, storeIdentityAuthorizedData.storeBrandInfo) && Intrinsics.LJFF(this.brandAuthorizedText, storeIdentityAuthorizedData.brandAuthorizedText) && Intrinsics.LJFF(this.defaultAuthorizedText, storeIdentityAuthorizedData.defaultAuthorizedText) && Intrinsics.LJFF(this.storeBrandSize, storeIdentityAuthorizedData.storeBrandSize) && Intrinsics.LJFF(this.rightIdList, storeIdentityAuthorizedData.rightIdList) && Intrinsics.LJFF(this.textColor, storeIdentityAuthorizedData.textColor);
    }

    public final int hashCode() {
        ThemeImage themeImage = this.bgImage;
        int iHashCode = (themeImage == null ? 0 : themeImage.hashCode()) * 31;
        String str = this.schema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.equityText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<StoreBrandInfo> list = this.storeBrandInfo;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.brandAuthorizedText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.defaultAuthorizedText;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.storeBrandSize;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list2 = this.rightIdList;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ThemeColor themeColor = this.textColor;
        return iHashCode8 + (themeColor != null ? themeColor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreIdentityAuthorizedData(bgImage=");
        sbLIZ.append(this.bgImage);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", equityText=");
        sbLIZ.append(this.equityText);
        sbLIZ.append(", storeBrandInfo=");
        sbLIZ.append(this.storeBrandInfo);
        sbLIZ.append(", brandAuthorizedText=");
        sbLIZ.append(this.brandAuthorizedText);
        sbLIZ.append(", defaultAuthorizedText=");
        sbLIZ.append(this.defaultAuthorizedText);
        sbLIZ.append(", storeBrandSize=");
        sbLIZ.append(this.storeBrandSize);
        sbLIZ.append(", rightIdList=");
        sbLIZ.append(this.rightIdList);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
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
        parcel.writeString(this.schema);
        parcel.writeString(this.equityText);
        List<StoreBrandInfo> list = this.storeBrandInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<StoreBrandInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.brandAuthorizedText);
        parcel.writeString(this.defaultAuthorizedText);
        Integer num = this.storeBrandSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.rightIdList);
        ThemeColor themeColor = this.textColor;
        if (themeColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            themeColor.writeToParcel(parcel, i);
        }
    }

    public StoreIdentityAuthorizedData(ThemeImage themeImage, String str, String str2, List<StoreBrandInfo> list, String str3, String str4, Integer num, List<String> list2, ThemeColor themeColor) {
        this.bgImage = themeImage;
        this.schema = str;
        this.equityText = str2;
        this.storeBrandInfo = list;
        this.brandAuthorizedText = str3;
        this.defaultAuthorizedText = str4;
        this.storeBrandSize = num;
        this.rightIdList = list2;
        this.textColor = themeColor;
    }
}
