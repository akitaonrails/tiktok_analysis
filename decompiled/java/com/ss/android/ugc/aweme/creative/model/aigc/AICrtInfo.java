package com.ss.android.ugc.aweme.creative.model.aigc;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AICrtInfo {

    @C09CT("actor_view_auth")
    public final String actorViewAuth;

    @C09CT("cast_face_ids")
    public final String castFaceIds;

    @C09CT("cast_face_sel")
    public final String castFaceSel;

    @C09CT("cast_face_tps")
    public final String castFaceTps;

    @C09CT("cast_uids")
    public final String castUids;

    @C09CT("first_follow_gid")
    public final String firstFollowGid;

    @C09CT("follow_gid")
    public final String followGid;

    @C09CT("follow_uid")
    public final String followUid;

    @C09CT("func_nm")
    public final String funcNm;

    @C09CT("gen_img_num")
    public final String genImgNum;

    @C09CT("gen_mdl")
    public final String genMdl;

    @C09CT("gen_mdl_tp")
    public final String genMdlTp;

    @C09CT("gen_pl")
    public final String genPl;

    @C09CT("gen_task_id")
    public final String genTaskId;

    @C09CT("gen_task_tp")
    public final String genTaskTp;

    @C09CT("gen_task_wf")
    public final String genTaskWf;

    @C09CT("gen_vid_num")
    public final String genVidNum;

    @C09CT("itn_mdl")
    public final String itnMdl;

    @C09CT("itn_mdl_tp")
    public final String itnMdlTp;

    @C09CT("last_face_id_act_chnl")
    public final String lastFaceIdActChnl;

    @C09CT("last_face_id_act_func")
    public final String lastFaceIdActFunc;

    @C09CT("original")
    public final String originalSource;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("pt_id")
    public final String ptId;

    @C09CT("pt_input_tp")
    public final String ptInputTp;

    @C09CT("pt_src")
    public final String ptSrc;

    @C09CT("pt_tp")
    public final String ptTp;

    @C09CT("rec_pt_id")
    public final String recPtId;

    @C09CT("ref_img_num")
    public final String refImgNum;

    @C09CT("ref_img_uri")
    public final String refImgUri;

    @C09CT("ref_vid_num")
    public final String refVidNum;

    @C09CT("ref_vid_uri")
    public final String refVidUri;

    @C09CT("req_key")
    public final String reqKey;

    @C09CT("rwt_pt_tp")
    public final String rwtPtTp;

    @C09CT("shoot_way")
    public final String shootWay;

    public AICrtInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICrtInfo)) {
            return false;
        }
        AICrtInfo aICrtInfo = (AICrtInfo) obj;
        return Intrinsics.LJFF(this.refImgNum, aICrtInfo.refImgNum) && Intrinsics.LJFF(this.refImgUri, aICrtInfo.refImgUri) && Intrinsics.LJFF(this.refVidNum, aICrtInfo.refVidNum) && Intrinsics.LJFF(this.refVidUri, aICrtInfo.refVidUri) && Intrinsics.LJFF(this.funcNm, aICrtInfo.funcNm) && Intrinsics.LJFF(this.genTaskId, aICrtInfo.genTaskId) && Intrinsics.LJFF(this.ptSrc, aICrtInfo.ptSrc) && Intrinsics.LJFF(this.ptTp, aICrtInfo.ptTp) && Intrinsics.LJFF(this.ptInputTp, aICrtInfo.ptInputTp) && Intrinsics.LJFF(this.genPl, aICrtInfo.genPl) && Intrinsics.LJFF(this.genImgNum, aICrtInfo.genImgNum) && Intrinsics.LJFF(this.genVidNum, aICrtInfo.genVidNum) && Intrinsics.LJFF(this.reqKey, aICrtInfo.reqKey) && Intrinsics.LJFF(this.genTaskTp, aICrtInfo.genTaskTp) && Intrinsics.LJFF(this.genTaskWf, aICrtInfo.genTaskWf) && Intrinsics.LJFF(this.prompt, aICrtInfo.prompt) && Intrinsics.LJFF(this.rwtPtTp, aICrtInfo.rwtPtTp) && Intrinsics.LJFF(this.castFaceIds, aICrtInfo.castFaceIds) && Intrinsics.LJFF(this.castUids, aICrtInfo.castUids) && Intrinsics.LJFF(this.firstFollowGid, aICrtInfo.firstFollowGid) && Intrinsics.LJFF(this.followGid, aICrtInfo.followGid) && Intrinsics.LJFF(this.lastFaceIdActFunc, aICrtInfo.lastFaceIdActFunc) && Intrinsics.LJFF(this.lastFaceIdActChnl, aICrtInfo.lastFaceIdActChnl) && Intrinsics.LJFF(this.actorViewAuth, aICrtInfo.actorViewAuth) && Intrinsics.LJFF(this.followUid, aICrtInfo.followUid) && Intrinsics.LJFF(this.itnMdlTp, aICrtInfo.itnMdlTp) && Intrinsics.LJFF(this.itnMdl, aICrtInfo.itnMdl) && Intrinsics.LJFF(this.genMdlTp, aICrtInfo.genMdlTp) && Intrinsics.LJFF(this.genMdl, aICrtInfo.genMdl) && Intrinsics.LJFF(this.ptId, aICrtInfo.ptId) && Intrinsics.LJFF(this.recPtId, aICrtInfo.recPtId) && Intrinsics.LJFF(this.originalSource, aICrtInfo.originalSource) && Intrinsics.LJFF(this.shootWay, aICrtInfo.shootWay) && Intrinsics.LJFF(this.castFaceSel, aICrtInfo.castFaceSel) && Intrinsics.LJFF(this.castFaceTps, aICrtInfo.castFaceTps);
    }

    public final int hashCode() {
        String str = this.refImgNum;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refImgUri;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refVidNum;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.refVidUri;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.funcNm;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.genTaskId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ptSrc;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ptTp;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ptInputTp;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.genPl;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.genImgNum;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.genVidNum;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.reqKey;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.genTaskTp;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.genTaskWf;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.prompt;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rwtPtTp;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.castFaceIds;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.castUids;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.firstFollowGid;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.followGid;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.lastFaceIdActFunc;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.lastFaceIdActChnl;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.actorViewAuth;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.followUid;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.itnMdlTp;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.itnMdl;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.genMdlTp;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.genMdl;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.ptId;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.recPtId;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.originalSource;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.shootWay;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.castFaceSel;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.castFaceTps;
        return iHashCode34 + (str35 != null ? str35.hashCode() : 0);
    }

    public final String toString() {
        return "AICrtInfo(refImgNum=" + this.refImgNum + ", refImgUri=" + this.refImgUri + ", refVidNum=" + this.refVidNum + ", refVidUri=" + this.refVidUri + ", funcNm=" + this.funcNm + ", genTaskId=" + this.genTaskId + ", ptSrc=" + this.ptSrc + ", ptTp=" + this.ptTp + ", ptInputTp=" + this.ptInputTp + ", genPl=" + this.genPl + ", genImgNum=" + this.genImgNum + ", genVidNum=" + this.genVidNum + ", reqKey=" + this.reqKey + ", genTaskTp=" + this.genTaskTp + ", genTaskWf=" + this.genTaskWf + ", prompt=" + this.prompt + ", rwtPtTp=" + this.rwtPtTp + ", castFaceIds=" + this.castFaceIds + ", castUids=" + this.castUids + ", firstFollowGid=" + this.firstFollowGid + ", followGid=" + this.followGid + ", lastFaceIdActFunc=" + this.lastFaceIdActFunc + ", lastFaceIdActChnl=" + this.lastFaceIdActChnl + ", actorViewAuth=" + this.actorViewAuth + ", followUid=" + this.followUid + ", itnMdlTp=" + this.itnMdlTp + ", itnMdl=" + this.itnMdl + ", genMdlTp=" + this.genMdlTp + ", genMdl=" + this.genMdl + ", ptId=" + this.ptId + ", recPtId=" + this.recPtId + ", originalSource=" + this.originalSource + ", shootWay=" + this.shootWay + ", castFaceSel=" + this.castFaceSel + ", castFaceTps=" + this.castFaceTps + ')';
    }

    public AICrtInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.refImgNum = str;
        this.refImgUri = str2;
        this.refVidNum = str3;
        this.refVidUri = str4;
        this.funcNm = str5;
        this.genTaskId = str6;
        this.ptSrc = str7;
        this.ptTp = str8;
        this.ptInputTp = str9;
        this.genPl = str10;
        this.genImgNum = str11;
        this.genVidNum = str12;
        this.reqKey = str13;
        this.genTaskTp = str14;
        this.genTaskWf = str15;
        this.prompt = str16;
        this.rwtPtTp = str17;
        this.castFaceIds = str18;
        this.castUids = str19;
        this.firstFollowGid = str20;
        this.followGid = str21;
        this.lastFaceIdActFunc = str22;
        this.lastFaceIdActChnl = str23;
        this.actorViewAuth = str24;
        this.followUid = str25;
        this.itnMdlTp = str26;
        this.itnMdl = str27;
        this.genMdlTp = str28;
        this.genMdl = str29;
        this.ptId = str30;
        this.recPtId = str31;
        this.originalSource = str32;
        this.shootWay = str33;
        this.castFaceSel = str34;
        this.castFaceTps = str35;
    }
}
