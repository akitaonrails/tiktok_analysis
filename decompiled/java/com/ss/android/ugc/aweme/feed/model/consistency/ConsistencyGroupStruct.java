package com.ss.android.ugc.aweme.feed.model.consistency;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ConsistencyGroupStruct implements Serializable {

    @C09CT("consistency_video_type")
    public Integer consistencyVideoType;

    @C09CT("delete_reason")
    public String deleteReason;

    @C09CT("delete_stage")
    public Integer deleteStage;

    @C09CT("provide_reason")
    public String provideReason;

    @C09CT("provide_stage")
    public Integer provideStage;

    @C09CT("rerank_reason")
    public String rerankReason;

    @C09CT("sec_video_type")
    public List<String> secVideoType = new ArrayList();

    @C09CT("group_extra_info")
    @C09CS(StringJsonAdapterFactory.class)
    public HashMap<String, String> groupExtraInfo = new HashMap<>();

    @C09CT("rerank_reason_list")
    public List<String> rerankReasonList = new ArrayList();

    public final Integer getConsistencyVideoType() {
        return this.consistencyVideoType;
    }

    public final String getDeleteReason() {
        return this.deleteReason;
    }

    public final Integer getDeleteStage() {
        return this.deleteStage;
    }

    public final HashMap<String, String> getGroupExtraInfo() {
        return this.groupExtraInfo;
    }

    public final String getProvideReason() {
        return this.provideReason;
    }

    public final Integer getProvideStage() {
        return this.provideStage;
    }

    public final String getRerankReason() {
        return this.rerankReason;
    }

    public final List<String> getRerankReasonList() {
        return this.rerankReasonList;
    }

    public final List<String> getSecVideoType() {
        return this.secVideoType;
    }

    public final void setConsistencyVideoType(Integer num) {
        this.consistencyVideoType = num;
    }

    public final void setDeleteReason(String str) {
        this.deleteReason = str;
    }

    public final void setDeleteStage(Integer num) {
        this.deleteStage = num;
    }

    public final void setGroupExtraInfo(HashMap<String, String> map) {
        this.groupExtraInfo = map;
    }

    public final void setProvideReason(String str) {
        this.provideReason = str;
    }

    public final void setProvideStage(Integer num) {
        this.provideStage = num;
    }

    public final void setRerankReason(String str) {
        this.rerankReason = str;
    }

    public final void setRerankReasonList(List<String> list) {
        this.rerankReasonList = list;
    }

    public final void setSecVideoType(List<String> list) {
        this.secVideoType = list;
    }
}
