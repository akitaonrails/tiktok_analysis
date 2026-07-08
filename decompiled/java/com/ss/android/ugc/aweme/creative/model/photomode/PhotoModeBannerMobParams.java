package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeBannerMobParams;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PhotoModeBannerMobParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<PhotoModeBannerMobParams> CREATOR = new Parcelable.Creator<PhotoModeBannerMobParams>() { // from class: X.0mcG
        @Override // android.os.Parcelable.Creator
        public final PhotoModeBannerMobParams createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PhotoModeBannerMobParams(string, string2, string3, string4, string5, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeBannerMobParams[] newArray(int i) {
            return new PhotoModeBannerMobParams[i];
        }
    };

    @C09CT("photo_banner_category")
    public String photoBannerCategory;

    @C09CT("photo_banner_debug_info")
    public final String photoBannerDebugInfo;

    @C09CT("photo_banner_enter_from")
    public final String photoBannerEnterFrom;

    @C09CT("photo_banner_search_topic_id")
    public final String photoBannerSearchTopicId;

    @C09CT("photo_banner_session_id")
    public final String photoBannerSessionId;

    @C09CT("photo_banner_shoot_enter_from")
    public final String photoBannerShootEnterFrom;

    @C09CT("photo_banner_topic_id")
    public final String photoBannerTopicId;

    @C09CT("photo_banner_topic_type")
    public final Integer photoBannerTopicType;

    public PhotoModeBannerMobParams() {
        this(null, null, null, null, null, null, null, null);
    }

    public final PhotoModeBannerMobParams copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7) {
        return new PhotoModeBannerMobParams(str, str2, str3, str4, str5, num, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeBannerMobParams)) {
            return false;
        }
        PhotoModeBannerMobParams photoModeBannerMobParams = (PhotoModeBannerMobParams) obj;
        return Intrinsics.LJFF(this.photoBannerCategory, photoModeBannerMobParams.photoBannerCategory) && Intrinsics.LJFF(this.photoBannerTopicId, photoModeBannerMobParams.photoBannerTopicId) && Intrinsics.LJFF(this.photoBannerSessionId, photoModeBannerMobParams.photoBannerSessionId) && Intrinsics.LJFF(this.photoBannerEnterFrom, photoModeBannerMobParams.photoBannerEnterFrom) && Intrinsics.LJFF(this.photoBannerShootEnterFrom, photoModeBannerMobParams.photoBannerShootEnterFrom) && Intrinsics.LJFF(this.photoBannerTopicType, photoModeBannerMobParams.photoBannerTopicType) && Intrinsics.LJFF(this.photoBannerDebugInfo, photoModeBannerMobParams.photoBannerDebugInfo) && Intrinsics.LJFF(this.photoBannerSearchTopicId, photoModeBannerMobParams.photoBannerSearchTopicId);
    }

    public int hashCode() {
        String str = this.photoBannerCategory;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photoBannerTopicId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photoBannerSessionId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBannerEnterFrom;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photoBannerShootEnterFrom;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.photoBannerTopicType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.photoBannerDebugInfo;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photoBannerSearchTopicId;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeBannerMobParams(photoBannerCategory=");
        sbLIZ.append(this.photoBannerCategory);
        sbLIZ.append(", photoBannerTopicId=");
        sbLIZ.append(this.photoBannerTopicId);
        sbLIZ.append(", photoBannerSessionId=");
        sbLIZ.append(this.photoBannerSessionId);
        sbLIZ.append(", photoBannerEnterFrom=");
        sbLIZ.append(this.photoBannerEnterFrom);
        sbLIZ.append(", photoBannerShootEnterFrom=");
        sbLIZ.append(this.photoBannerShootEnterFrom);
        sbLIZ.append(", photoBannerTopicType=");
        sbLIZ.append(this.photoBannerTopicType);
        sbLIZ.append(", photoBannerDebugInfo=");
        sbLIZ.append(this.photoBannerDebugInfo);
        sbLIZ.append(", photoBannerSearchTopicId=");
        sbLIZ.append(this.photoBannerSearchTopicId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.photoBannerCategory);
        parcel.writeString(this.photoBannerTopicId);
        parcel.writeString(this.photoBannerSessionId);
        parcel.writeString(this.photoBannerEnterFrom);
        parcel.writeString(this.photoBannerShootEnterFrom);
        Integer num = this.photoBannerTopicType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.photoBannerDebugInfo);
        parcel.writeString(this.photoBannerSearchTopicId);
    }

    public final String getPhotoBannerCategory() {
        return this.photoBannerCategory;
    }

    public final String getPhotoBannerDebugInfo() {
        return this.photoBannerDebugInfo;
    }

    public final String getPhotoBannerEnterFrom() {
        return this.photoBannerEnterFrom;
    }

    public final String getPhotoBannerSearchTopicId() {
        return this.photoBannerSearchTopicId;
    }

    public final String getPhotoBannerSessionId() {
        return this.photoBannerSessionId;
    }

    public final String getPhotoBannerShootEnterFrom() {
        return this.photoBannerShootEnterFrom;
    }

    public final String getPhotoBannerTopicId() {
        return this.photoBannerTopicId;
    }

    public final Integer getPhotoBannerTopicType() {
        return this.photoBannerTopicType;
    }

    public final void setPhotoBannerCategory(String str) {
        this.photoBannerCategory = str;
    }

    public PhotoModeBannerMobParams(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7) {
        this.photoBannerCategory = str;
        this.photoBannerTopicId = str2;
        this.photoBannerSessionId = str3;
        this.photoBannerEnterFrom = str4;
        this.photoBannerShootEnterFrom = str5;
        this.photoBannerTopicType = num;
        this.photoBannerDebugInfo = str6;
        this.photoBannerSearchTopicId = str7;
    }
}
