package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TryOnData implements Parcelable {

    @C09CT("entry_info")
    public final ECRichText entryInfo;

    @C09CT("generated_image_label")
    public final String generatedImageLabel;

    @C09CT("generated_image_tag")
    public final ECRichText generatedImageTag;

    @C09CT("photo_mode_entry")
    public final ECRichText photoModeEntry;

    @C09CT("product_generated_image")
    public final Image productGeneratedImage;

    @C09CT("schema")
    public final String schema;

    @C09CT("skc_generated_image_map")
    public final Map<String, Image> skcGeneratedImageMap;

    @C09CT("sku_entry_prop_id")
    public final String skuEntryPropId;

    @C09CT("sku_property_entry_text")
    public final String skuPropertyEntryText;
    public static final Parcelable.Creator<TryOnData> CREATOR = new Parcelable.Creator<TryOnData>() { // from class: X.041b
        @Override // android.os.Parcelable.Creator
        public final TryOnData createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(TryOnData.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(TryOnData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(TryOnData.class.getClassLoader()));
                }
            }
            return new TryOnData(string, eCRichText, image, linkedHashMap, (ECRichText) parcel.readParcelable(TryOnData.class.getClassLoader()), (ECRichText) parcel.readParcelable(TryOnData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TryOnData[] newArray(int i) {
            return new TryOnData[i];
        }
    };
    public static final int $stable = 8;

    public TryOnData() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TryOnData)) {
            return false;
        }
        TryOnData tryOnData = (TryOnData) obj;
        return Intrinsics.LJFF(this.schema, tryOnData.schema) && Intrinsics.LJFF(this.entryInfo, tryOnData.entryInfo) && Intrinsics.LJFF(this.productGeneratedImage, tryOnData.productGeneratedImage) && Intrinsics.LJFF(this.skcGeneratedImageMap, tryOnData.skcGeneratedImageMap) && Intrinsics.LJFF(this.generatedImageTag, tryOnData.generatedImageTag) && Intrinsics.LJFF(this.photoModeEntry, tryOnData.photoModeEntry) && Intrinsics.LJFF(this.generatedImageLabel, tryOnData.generatedImageLabel) && Intrinsics.LJFF(this.skuPropertyEntryText, tryOnData.skuPropertyEntryText) && Intrinsics.LJFF(this.skuEntryPropId, tryOnData.skuEntryPropId);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.entryInfo;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Image image = this.productGeneratedImage;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Map<String, Image> map = this.skcGeneratedImageMap;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        ECRichText eCRichText2 = this.generatedImageTag;
        int iHashCode5 = (iHashCode4 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        ECRichText eCRichText3 = this.photoModeEntry;
        int iHashCode6 = (iHashCode5 + (eCRichText3 == null ? 0 : eCRichText3.hashCode())) * 31;
        String str2 = this.generatedImageLabel;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.skuPropertyEntryText;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.skuEntryPropId;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TryOnData(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", entryInfo=");
        sbLIZ.append(this.entryInfo);
        sbLIZ.append(", productGeneratedImage=");
        sbLIZ.append(this.productGeneratedImage);
        sbLIZ.append(", skcGeneratedImageMap=");
        sbLIZ.append(this.skcGeneratedImageMap);
        sbLIZ.append(", generatedImageTag=");
        sbLIZ.append(this.generatedImageTag);
        sbLIZ.append(", photoModeEntry=");
        sbLIZ.append(this.photoModeEntry);
        sbLIZ.append(", generatedImageLabel=");
        sbLIZ.append(this.generatedImageLabel);
        sbLIZ.append(", skuPropertyEntryText=");
        sbLIZ.append(this.skuPropertyEntryText);
        sbLIZ.append(", skuEntryPropId=");
        sbLIZ.append(this.skuEntryPropId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        parcel.writeParcelable(this.entryInfo, i);
        parcel.writeParcelable(this.productGeneratedImage, i);
        Map<String, Image> map = this.skcGeneratedImageMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, Image> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeParcelable(entry.getValue(), i);
            }
        }
        parcel.writeParcelable(this.generatedImageTag, i);
        parcel.writeParcelable(this.photoModeEntry, i);
        parcel.writeString(this.generatedImageLabel);
        parcel.writeString(this.skuPropertyEntryText);
        parcel.writeString(this.skuEntryPropId);
    }

    public TryOnData(String str, ECRichText eCRichText, Image image, Map<String, Image> map, ECRichText eCRichText2, ECRichText eCRichText3, String str2, String str3, String str4) {
        this.schema = str;
        this.entryInfo = eCRichText;
        this.productGeneratedImage = image;
        this.skcGeneratedImageMap = map;
        this.generatedImageTag = eCRichText2;
        this.photoModeEntry = eCRichText3;
        this.generatedImageLabel = str2;
        this.skuPropertyEntryText = str3;
        this.skuEntryPropId = str4;
    }
}
