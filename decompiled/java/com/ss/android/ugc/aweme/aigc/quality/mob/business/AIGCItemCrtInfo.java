package com.ss.android.ugc.aweme.aigc.quality.mob.business;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCItemCrtInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCItemCrtInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIGCItemCrtInfo> CREATOR = new Parcelable.Creator<AIGCItemCrtInfo>() { // from class: X.0LgI
        @Override // android.os.Parcelable.Creator
        public final AIGCItemCrtInfo createFromParcel(Parcel parcel) {
            return new AIGCItemCrtInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCItemCrtInfo[] newArray(int i) {
            return new AIGCItemCrtInfo[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("gen_mdl")
    public final String genMdl;

    @InterfaceC553020LmW
    @C09CT("gen_mdl_tp")
    public final String genMdlTp;

    @InterfaceC553020LmW
    @C09CT("gen_pl")
    public final String genPl;

    @InterfaceC553020LmW
    @C09CT("gen_task_tp")
    public final String genTaskTp;

    @InterfaceC553020LmW
    @C09CT("gen_task_wf")
    public final String genTaskWf;

    @InterfaceC553020LmW
    @C09CT("itn_mdl")
    public final String itnMdl;

    @InterfaceC553020LmW
    @C09CT("itn_mdl_tp")
    public final String itnMdlTp;

    @InterfaceC553020LmW
    @C09CT("last_face_id_act_chnl")
    public final String lastFaceIdActChnl;

    @InterfaceC553020LmW
    @C09CT("last_face_id_act_func")
    public final String lastFaceIdActFunc;

    @C040H
    public final String name;

    @InterfaceC553020LmW
    @C09CT("pt_id")
    public final String ptId;

    @InterfaceC553020LmW
    @C09CT("pt_src")
    public final String ptSrc;

    @InterfaceC553020LmW
    @C09CT("pt_tp")
    public final String ptTp;

    @InterfaceC553020LmW
    @C09CT("rec_pt_id")
    public final String recPtId;

    @InterfaceC553020LmW
    @C09CT("ref_img_num")
    public final String refImgNum;

    @InterfaceC553020LmW
    @C09CT("ref_img_uri")
    public final String refImgUri;

    public AIGCItemCrtInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCItemCrtInfo)) {
            return false;
        }
        AIGCItemCrtInfo aIGCItemCrtInfo = (AIGCItemCrtInfo) obj;
        return Intrinsics.LJFF(this.refImgNum, aIGCItemCrtInfo.refImgNum) && Intrinsics.LJFF(this.refImgUri, aIGCItemCrtInfo.refImgUri) && Intrinsics.LJFF(this.itnMdlTp, aIGCItemCrtInfo.itnMdlTp) && Intrinsics.LJFF(this.itnMdl, aIGCItemCrtInfo.itnMdl) && Intrinsics.LJFF(this.genMdlTp, aIGCItemCrtInfo.genMdlTp) && Intrinsics.LJFF(this.genMdl, aIGCItemCrtInfo.genMdl) && Intrinsics.LJFF(this.genTaskTp, aIGCItemCrtInfo.genTaskTp) && Intrinsics.LJFF(this.genTaskWf, aIGCItemCrtInfo.genTaskWf) && Intrinsics.LJFF(this.ptSrc, aIGCItemCrtInfo.ptSrc) && Intrinsics.LJFF(this.ptTp, aIGCItemCrtInfo.ptTp) && Intrinsics.LJFF(this.ptId, aIGCItemCrtInfo.ptId) && Intrinsics.LJFF(this.recPtId, aIGCItemCrtInfo.recPtId) && Intrinsics.LJFF(this.genPl, aIGCItemCrtInfo.genPl) && Intrinsics.LJFF(this.lastFaceIdActFunc, aIGCItemCrtInfo.lastFaceIdActFunc) && Intrinsics.LJFF(this.lastFaceIdActChnl, aIGCItemCrtInfo.lastFaceIdActChnl);
    }

    public final int hashCode() {
        String str = this.refImgNum;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refImgUri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itnMdlTp;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.itnMdl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.genMdlTp;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.genMdl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.genTaskTp;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.genTaskWf;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ptSrc;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ptTp;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.ptId;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.recPtId;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.genPl;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.lastFaceIdActFunc;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.lastFaceIdActChnl;
        return iHashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        return "AIGCItemCrtInfo(refImgNum=" + this.refImgNum + ", refImgUri=" + this.refImgUri + ", itnMdlTp=" + this.itnMdlTp + ", itnMdl=" + this.itnMdl + ", genMdlTp=" + this.genMdlTp + ", genMdl=" + this.genMdl + ", genTaskTp=" + this.genTaskTp + ", genTaskWf=" + this.genTaskWf + ", ptSrc=" + this.ptSrc + ", ptTp=" + this.ptTp + ", ptId=" + this.ptId + ", recPtId=" + this.recPtId + ", genPl=" + this.genPl + ", lastFaceIdActFunc=" + this.lastFaceIdActFunc + ", lastFaceIdActChnl=" + this.lastFaceIdActChnl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.refImgNum);
        parcel.writeString(this.refImgUri);
        parcel.writeString(this.itnMdlTp);
        parcel.writeString(this.itnMdl);
        parcel.writeString(this.genMdlTp);
        parcel.writeString(this.genMdl);
        parcel.writeString(this.genTaskTp);
        parcel.writeString(this.genTaskWf);
        parcel.writeString(this.ptSrc);
        parcel.writeString(this.ptTp);
        parcel.writeString(this.ptId);
        parcel.writeString(this.recPtId);
        parcel.writeString(this.genPl);
        parcel.writeString(this.lastFaceIdActFunc);
        parcel.writeString(this.lastFaceIdActChnl);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AIGCItemCrtInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.refImgNum = str;
        this.refImgUri = str2;
        this.itnMdlTp = str3;
        this.itnMdl = str4;
        this.genMdlTp = str5;
        this.genMdl = str6;
        this.genTaskTp = str7;
        this.genTaskWf = str8;
        this.ptSrc = str9;
        this.ptTp = str10;
        this.ptId = str11;
        this.recPtId = str12;
        this.genPl = str13;
        this.lastFaceIdActFunc = str14;
        this.lastFaceIdActChnl = str15;
        this.name = "AIGCItemCrtInfo";
    }

    public static AIGCItemCrtInfo LIZ(AIGCItemCrtInfo aIGCItemCrtInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i) {
        String str16 = str15;
        String str17 = str14;
        String str18 = str13;
        String str19 = str12;
        String str20 = str11;
        String str21 = str10;
        String str22 = str9;
        String str23 = str8;
        String str24 = str7;
        String str25 = str6;
        String str26 = str5;
        String str27 = str4;
        String str28 = str3;
        String str29 = str2;
        String str30 = str;
        if ((i & 1) != 0) {
            str30 = aIGCItemCrtInfo.refImgNum;
        }
        if ((i & 2) != 0) {
            str29 = aIGCItemCrtInfo.refImgUri;
        }
        if ((i & 4) != 0) {
            str28 = aIGCItemCrtInfo.itnMdlTp;
        }
        if ((i & 8) != 0) {
            str27 = aIGCItemCrtInfo.itnMdl;
        }
        if ((i & 16) != 0) {
            str26 = aIGCItemCrtInfo.genMdlTp;
        }
        if ((i & 32) != 0) {
            str25 = aIGCItemCrtInfo.genMdl;
        }
        if ((i & 64) != 0) {
            str24 = aIGCItemCrtInfo.genTaskTp;
        }
        if ((i & 128) != 0) {
            str23 = aIGCItemCrtInfo.genTaskWf;
        }
        if ((i & 256) != 0) {
            str22 = aIGCItemCrtInfo.ptSrc;
        }
        if ((i & 512) != 0) {
            str21 = aIGCItemCrtInfo.ptTp;
        }
        if ((i & 1024) != 0) {
            str20 = aIGCItemCrtInfo.ptId;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str19 = aIGCItemCrtInfo.recPtId;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str18 = aIGCItemCrtInfo.genPl;
        }
        if ((i & 8192) != 0) {
            str17 = aIGCItemCrtInfo.lastFaceIdActFunc;
        }
        if ((i & 16384) != 0) {
            str16 = aIGCItemCrtInfo.lastFaceIdActChnl;
        }
        aIGCItemCrtInfo.getClass();
        String str31 = str29;
        return new AIGCItemCrtInfo(str30, str31, str28, str27, str26, str25, str24, str23, str22, str21, str20, str19, str18, str17, str16);
    }
}
