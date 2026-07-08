package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitAnchorInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitAnchorInfo implements Parcelable {
    public static final Parcelable.Creator<AIPortraitAnchorInfo> CREATOR = new Parcelable.Creator<AIPortraitAnchorInfo>() { // from class: X.0LiP
        @Override // android.os.Parcelable.Creator
        public final AIPortraitAnchorInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AIPortraitAnchorInfo(string, string2, string3, string4, string5, string6, string7, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitAnchorInfo[] newArray(int i) {
            return new AIPortraitAnchorInfo[i];
        }
    };

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("is_ref_image")
    public final Integer isRefImage;

    @C09CT("ori_tpl_pos")
    public final String oriTplPos;

    @C09CT("ori_tpl_tp")
    public final String oriTplTp;

    @C09CT("origin_aweme_id")
    public final String originAwemeId;

    @C09CT("origin_prompt_id")
    public final String originPromptId;

    @C09CT("root_aweme_id")
    public final String rootAwemeId;

    @C09CT("root_prompt_id")
    public final String rootPromptId;

    public AIPortraitAnchorInfo() {
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
        if (!(obj instanceof AIPortraitAnchorInfo)) {
            return false;
        }
        AIPortraitAnchorInfo aIPortraitAnchorInfo = (AIPortraitAnchorInfo) obj;
        return Intrinsics.LJFF(this.awemeId, aIPortraitAnchorInfo.awemeId) && Intrinsics.LJFF(this.rootAwemeId, aIPortraitAnchorInfo.rootAwemeId) && Intrinsics.LJFF(this.rootPromptId, aIPortraitAnchorInfo.rootPromptId) && Intrinsics.LJFF(this.originAwemeId, aIPortraitAnchorInfo.originAwemeId) && Intrinsics.LJFF(this.originPromptId, aIPortraitAnchorInfo.originPromptId) && Intrinsics.LJFF(this.oriTplTp, aIPortraitAnchorInfo.oriTplTp) && Intrinsics.LJFF(this.oriTplPos, aIPortraitAnchorInfo.oriTplPos) && Intrinsics.LJFF(this.isRefImage, aIPortraitAnchorInfo.isRefImage);
    }

    public final int hashCode() {
        String str = this.awemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rootAwemeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rootPromptId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originAwemeId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originPromptId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.oriTplTp;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.oriTplPos;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.isRefImage;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitAnchorInfo(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", rootAwemeId=");
        sbLIZ.append(this.rootAwemeId);
        sbLIZ.append(", rootPromptId=");
        sbLIZ.append(this.rootPromptId);
        sbLIZ.append(", originAwemeId=");
        sbLIZ.append(this.originAwemeId);
        sbLIZ.append(", originPromptId=");
        sbLIZ.append(this.originPromptId);
        sbLIZ.append(", oriTplTp=");
        sbLIZ.append(this.oriTplTp);
        sbLIZ.append(", oriTplPos=");
        sbLIZ.append(this.oriTplPos);
        sbLIZ.append(", isRefImage=");
        sbLIZ.append(this.isRefImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.awemeId);
        parcel.writeString(this.rootAwemeId);
        parcel.writeString(this.rootPromptId);
        parcel.writeString(this.originAwemeId);
        parcel.writeString(this.originPromptId);
        parcel.writeString(this.oriTplTp);
        parcel.writeString(this.oriTplPos);
        Integer num = this.isRefImage;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public AIPortraitAnchorInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num) {
        this.awemeId = str;
        this.rootAwemeId = str2;
        this.rootPromptId = str3;
        this.originAwemeId = str4;
        this.originPromptId = str5;
        this.oriTplTp = str6;
        this.oriTplPos = str7;
        this.isRefImage = num;
    }
}
