package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.RefType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitInputInfo implements Parcelable {
    public static final Parcelable.Creator<AIPortraitInputInfo> CREATOR = new Parcelable.Creator<AIPortraitInputInfo>() { // from class: X.0LiN
        @Override // android.os.Parcelable.Creator
        public final AIPortraitInputInfo createFromParcel(Parcel parcel) {
            return new AIPortraitInputInfo(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), RefType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitInputInfo[] newArray(int i) {
            return new AIPortraitInputInfo[i];
        }
    };

    @C09CT("cameo_id_list")
    public List<String> cameoIdList;

    @C09CT("cameo_image_list")
    public List<String> cameoImageList;

    @C09CT("cover_path")
    public final String coverPath;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("ref_type")
    public final RefType refType;

    @C09CT("reference_image_tos")
    public String referenceImageTos;

    @C09CT("reference_image_upload_id")
    public String referenceImageUploadId;

    @C09CT("style_id")
    public final String styleId;

    public AIPortraitInputInfo() {
        this(null, null, null, null, null, null, "", RefType.UNDEFINED);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitInputInfo)) {
            return false;
        }
        AIPortraitInputInfo aIPortraitInputInfo = (AIPortraitInputInfo) obj;
        return Intrinsics.LJFF(this.cameoIdList, aIPortraitInputInfo.cameoIdList) && Intrinsics.LJFF(this.cameoImageList, aIPortraitInputInfo.cameoImageList) && Intrinsics.LJFF(this.coverPath, aIPortraitInputInfo.coverPath) && Intrinsics.LJFF(this.referenceImageTos, aIPortraitInputInfo.referenceImageTos) && Intrinsics.LJFF(this.referenceImageUploadId, aIPortraitInputInfo.referenceImageUploadId) && Intrinsics.LJFF(this.prompt, aIPortraitInputInfo.prompt) && Intrinsics.LJFF(this.styleId, aIPortraitInputInfo.styleId) && this.refType == aIPortraitInputInfo.refType;
    }

    public final int hashCode() {
        List<String> list = this.cameoIdList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.cameoImageList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.coverPath;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.referenceImageTos;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.referenceImageUploadId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.prompt;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.styleId;
        return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.refType.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.cameoIdList);
        parcel.writeStringList(this.cameoImageList);
        parcel.writeString(this.coverPath);
        parcel.writeString(this.referenceImageTos);
        parcel.writeString(this.referenceImageUploadId);
        parcel.writeString(this.prompt);
        parcel.writeString(this.styleId);
        this.refType.writeToParcel(parcel, i);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cameoId = ");
        sbLIZ.append(this.cameoIdList);
        sbLIZ.append("; cameoImage = ");
        sbLIZ.append(this.cameoImageList);
        sbLIZ.append("; coverPath = ");
        sbLIZ.append(this.coverPath);
        sbLIZ.append("; referenceImageTos = ");
        sbLIZ.append(this.referenceImageTos);
        sbLIZ.append(";prompt = ");
        sbLIZ.append(this.prompt);
        sbLIZ.append("; styleId = ");
        sbLIZ.append(this.styleId);
        sbLIZ.append("; refType = ");
        sbLIZ.append(this.refType.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIPortraitInputInfo(List<String> list, List<String> list2, String str, String str2, String str3, String str4, String str5, RefType refType) {
        this.cameoIdList = list;
        this.cameoImageList = list2;
        this.coverPath = str;
        this.referenceImageTos = str2;
        this.referenceImageUploadId = str3;
        this.prompt = str4;
        this.styleId = str5;
        this.refType = refType;
    }
}
