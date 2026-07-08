package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PhotoPublishConfigurationModel;
import com.ss.android.ugc.aweme.creative.model.TextInfoModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PhotoPublishConfigurationModel implements Parcelable {
    public static final Parcelable.Creator<PhotoPublishConfigurationModel> CREATOR = new Parcelable.Creator<PhotoPublishConfigurationModel>() { // from class: X.0Xjm
        @Override // android.os.Parcelable.Creator
        public final PhotoPublishConfigurationModel createFromParcel(Parcel parcel) {
            TextInfoModel textInfoModelCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                textInfoModelCreateFromParcel = null;
            } else {
                textInfoModelCreateFromParcel = TextInfoModel.CREATOR.createFromParcel(parcel);
            }
            TextInfoModel textInfoModel = textInfoModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
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
                int i3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            return new PhotoPublishConfigurationModel(textInfoModel, boolValueOf, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoPublishConfigurationModel[] newArray(int i) {
            return new PhotoPublishConfigurationModel[i];
        }
    };

    @C09CT("skip_image_size_check")
    public Boolean skipImageSizeCheck;

    @C09CT("tako_create_aweme_api_params")
    public Map<String, String> takoCreateAwemeApiParams;

    @C09CT("tako_extra_params")
    public Map<String, String> takoExtraParams;

    @C09CT("text_info_model")
    public TextInfoModel textInfo;

    public PhotoPublishConfigurationModel() {
        this(null, Boolean.FALSE, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoPublishConfigurationModel)) {
            return false;
        }
        PhotoPublishConfigurationModel photoPublishConfigurationModel = (PhotoPublishConfigurationModel) obj;
        return Intrinsics.LJFF(this.textInfo, photoPublishConfigurationModel.textInfo) && Intrinsics.LJFF(this.skipImageSizeCheck, photoPublishConfigurationModel.skipImageSizeCheck) && Intrinsics.LJFF(this.takoCreateAwemeApiParams, photoPublishConfigurationModel.takoCreateAwemeApiParams) && Intrinsics.LJFF(this.takoExtraParams, photoPublishConfigurationModel.takoExtraParams);
    }

    public final int hashCode() {
        TextInfoModel textInfoModel = this.textInfo;
        int iHashCode = (textInfoModel == null ? 0 : textInfoModel.hashCode()) * 31;
        Boolean bool = this.skipImageSizeCheck;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.takoCreateAwemeApiParams;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.takoExtraParams;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoPublishConfigurationModel(textInfo=");
        sbLIZ.append(this.textInfo);
        sbLIZ.append(", skipImageSizeCheck=");
        sbLIZ.append(this.skipImageSizeCheck);
        sbLIZ.append(", takoCreateAwemeApiParams=");
        sbLIZ.append(this.takoCreateAwemeApiParams);
        sbLIZ.append(", takoExtraParams=");
        sbLIZ.append(this.takoExtraParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextInfoModel textInfoModel = this.textInfo;
        if (textInfoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textInfoModel.writeToParcel(parcel, i);
        }
        Boolean bool = this.skipImageSizeCheck;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Map<String, String> map = this.takoCreateAwemeApiParams;
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
        Map<String, String> map2 = this.takoExtraParams;
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

    public PhotoPublishConfigurationModel(TextInfoModel textInfoModel, Boolean bool, Map<String, String> map, Map<String, String> map2) {
        this.textInfo = textInfoModel;
        this.skipImageSizeCheck = bool;
        this.takoCreateAwemeApiParams = map;
        this.takoExtraParams = map2;
    }
}
