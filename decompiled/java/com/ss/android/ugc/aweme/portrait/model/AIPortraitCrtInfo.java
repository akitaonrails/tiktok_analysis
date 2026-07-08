package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitCrtInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitCrtInfo implements Parcelable {
    public static final Parcelable.Creator<AIPortraitCrtInfo> CREATOR = new Parcelable.Creator<AIPortraitCrtInfo>() { // from class: X.0LiS
        @Override // android.os.Parcelable.Creator
        public final AIPortraitCrtInfo createFromParcel(Parcel parcel) {
            return new AIPortraitCrtInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitCrtInfo[] newArray(int i) {
            return new AIPortraitCrtInfo[i];
        }
    };

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("first_follow_gid")
    public final String firstFollowGid;

    @C09CT("follow_gid")
    public final String followGid;

    @C09CT("follow_uid")
    public final String followUid;

    @C09CT("last_face_id_act_chnl")
    public final String lastFaceIdActChnl;

    @C09CT("last_face_id_act_func")
    public final String lastFaceIdActFunc;

    @C09CT("last_tpl_pos")
    public final String lastTplPos;

    @C09CT("last_tpl_status")
    public final String lastTplStatus;

    @C09CT("last_tpl_tp")
    public final String lastTplTp;

    @C09CT("ori_tpl_pos")
    public final String oriTplPos;

    @C09CT("ori_tpl_tp")
    public final String oriTplTp;

    public AIPortraitCrtInfo() {
        this("", null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitCrtInfo)) {
            return false;
        }
        AIPortraitCrtInfo aIPortraitCrtInfo = (AIPortraitCrtInfo) obj;
        return Intrinsics.LJFF(this.creationId, aIPortraitCrtInfo.creationId) && Intrinsics.LJFF(this.lastTplTp, aIPortraitCrtInfo.lastTplTp) && Intrinsics.LJFF(this.lastTplPos, aIPortraitCrtInfo.lastTplPos) && Intrinsics.LJFF(this.lastTplStatus, aIPortraitCrtInfo.lastTplStatus) && Intrinsics.LJFF(this.oriTplTp, aIPortraitCrtInfo.oriTplTp) && Intrinsics.LJFF(this.oriTplPos, aIPortraitCrtInfo.oriTplPos) && Intrinsics.LJFF(this.firstFollowGid, aIPortraitCrtInfo.firstFollowGid) && Intrinsics.LJFF(this.followGid, aIPortraitCrtInfo.followGid) && Intrinsics.LJFF(this.followUid, aIPortraitCrtInfo.followUid) && Intrinsics.LJFF(this.lastFaceIdActChnl, aIPortraitCrtInfo.lastFaceIdActChnl) && Intrinsics.LJFF(this.lastFaceIdActFunc, aIPortraitCrtInfo.lastFaceIdActFunc);
    }

    public final int hashCode() {
        String str = this.creationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastTplTp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastTplPos;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastTplStatus;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.oriTplTp;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.oriTplPos;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.firstFollowGid;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.followGid;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.followUid;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastFaceIdActChnl;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lastFaceIdActFunc;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        return "AIPortraitCrtInfo(creationId=" + this.creationId + ", lastTplTp=" + this.lastTplTp + ", lastTplPos=" + this.lastTplPos + ", lastTplStatus=" + this.lastTplStatus + ", oriTplTp=" + this.oriTplTp + ", oriTplPos=" + this.oriTplPos + ", firstFollowGid=" + this.firstFollowGid + ", followGid=" + this.followGid + ", followUid=" + this.followUid + ", lastFaceIdActChnl=" + this.lastFaceIdActChnl + ", lastFaceIdActFunc=" + this.lastFaceIdActFunc + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.creationId);
        parcel.writeString(this.lastTplTp);
        parcel.writeString(this.lastTplPos);
        parcel.writeString(this.lastTplStatus);
        parcel.writeString(this.oriTplTp);
        parcel.writeString(this.oriTplPos);
        parcel.writeString(this.firstFollowGid);
        parcel.writeString(this.followGid);
        parcel.writeString(this.followUid);
        parcel.writeString(this.lastFaceIdActChnl);
        parcel.writeString(this.lastFaceIdActFunc);
    }

    public AIPortraitCrtInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.creationId = str;
        this.lastTplTp = str2;
        this.lastTplPos = str3;
        this.lastTplStatus = str4;
        this.oriTplTp = str5;
        this.oriTplPos = str6;
        this.firstFollowGid = str7;
        this.followGid = str8;
        this.followUid = str9;
        this.lastFaceIdActChnl = str10;
        this.lastFaceIdActFunc = str11;
    }
}
