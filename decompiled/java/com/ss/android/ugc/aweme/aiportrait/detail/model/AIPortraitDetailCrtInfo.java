package com.ss.android.ugc.aweme.aiportrait.detail.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitDetailCrtInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("cast_face_ids")
    public String castFaceIds;

    @C09CT("cast_uids")
    public String castUids;

    @C09CT("creation_id")
    public String creationId;

    @C09CT("gen_task_id")
    public String genTaskId;

    @C09CT("gen_task_tp")
    public String genTaskTp;

    @C09CT("gen_task_wf")
    public String genTaskWf;

    @C09CT("ori_tpl_pos")
    public final String oriTplPos;

    @C09CT("ori_tpl_tp")
    public final String oriTplTp;

    @C09CT("prompt_id")
    public Long promptId;

    @C09CT("pt_id")
    public Long ptId;

    @C09CT("pt_orig_text")
    public String ptOrigText;

    @C09CT("pt_src")
    public String ptSrc;

    @C09CT("pt_text")
    public String ptText;

    @C09CT("ref_img_num")
    public Integer refImgNum;

    @C09CT("ref_img_tp")
    public Integer refImgTp;

    @C09CT("ref_img_uri")
    public String refImgUri;

    @C09CT("tpl_id")
    public Long tplId;

    @C09CT("tpl_tp")
    public String tplTp;

    public AIPortraitDetailCrtInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final String getCastFaceIds() {
        return this.castFaceIds;
    }

    public final String getCastUids() {
        return this.castUids;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getGenTaskId() {
        return this.genTaskId;
    }

    public final String getGenTaskTp() {
        return this.genTaskTp;
    }

    public final String getGenTaskWf() {
        return this.genTaskWf;
    }

    public final String getOriTplPos() {
        return this.oriTplPos;
    }

    public final String getOriTplTp() {
        return this.oriTplTp;
    }

    public final Long getPromptId() {
        return this.promptId;
    }

    public final Long getPtId() {
        return this.ptId;
    }

    public final String getPtOrigText() {
        return this.ptOrigText;
    }

    public final String getPtSrc() {
        return this.ptSrc;
    }

    public final String getPtText() {
        return this.ptText;
    }

    public final Integer getRefImgNum() {
        return this.refImgNum;
    }

    public final Integer getRefImgTp() {
        return this.refImgTp;
    }

    public final String getRefImgUri() {
        return this.refImgUri;
    }

    public final Long getTplId() {
        return this.tplId;
    }

    public final String getTplTp() {
        return this.tplTp;
    }

    public final void setCastFaceIds(String str) {
        this.castFaceIds = str;
    }

    public final void setCastUids(String str) {
        this.castUids = str;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setGenTaskId(String str) {
        this.genTaskId = str;
    }

    public final void setGenTaskTp(String str) {
        this.genTaskTp = str;
    }

    public final void setGenTaskWf(String str) {
        this.genTaskWf = str;
    }

    public final void setPromptId(Long l) {
        this.promptId = l;
    }

    public final void setPtId(Long l) {
        this.ptId = l;
    }

    public final void setPtOrigText(String str) {
        this.ptOrigText = str;
    }

    public final void setPtSrc(String str) {
        this.ptSrc = str;
    }

    public final void setPtText(String str) {
        this.ptText = str;
    }

    public final void setRefImgNum(Integer num) {
        this.refImgNum = num;
    }

    public final void setRefImgTp(Integer num) {
        this.refImgTp = num;
    }

    public final void setRefImgUri(String str) {
        this.refImgUri = str;
    }

    public final void setTplId(Long l) {
        this.tplId = l;
    }

    public final void setTplTp(String str) {
        this.tplTp = str;
    }

    public AIPortraitDetailCrtInfo(String str, String str2, String str3, Long l, Long l2, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, Integer num2, Long l3, String str10, String str11, String str12, String str13) {
        this.ptSrc = str;
        this.genTaskWf = str2;
        this.castFaceIds = str3;
        this.promptId = l;
        this.ptId = l2;
        this.ptText = str4;
        this.genTaskId = str5;
        this.refImgNum = num;
        this.creationId = str6;
        this.ptOrigText = str7;
        this.refImgUri = str8;
        this.castUids = str9;
        this.refImgTp = num2;
        this.tplId = l3;
        this.tplTp = str10;
        this.genTaskTp = str11;
        this.oriTplTp = str12;
        this.oriTplPos = str13;
    }
}
