package com.ss.android.ugc.aweme.feed.model.consistency;

import X.C09CS;
import X.C09CT;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsistencyRspStruct implements Serializable {

    @C09CT("consistency_extra_info")
    public String consistencyExtraInfo;

    @C09CT("consistency_req_extra_info")
    public String consistencyReqExtraInfo;

    @C09CT("consistency_user_extra_info")
    public String consistencyUserExtraInfo;

    @C09CT("c_rsp_type")
    public int rspType;

    @C09CT("consistency_groups")
    @C09CS(StringJsonAdapterFactory.class)
    public HashMap<Long, ConsistencyGroupStruct> consistencyGroups = new HashMap<>();

    @C09CT("final_gid_list")
    public List<Long> finalGidList = new ArrayList();

    @C09CT("sort_gid_list")
    public List<Long> sortGidList = new ArrayList();

    @C09CT("sati_gid_list")
    public List<Long> satiGidList = new ArrayList();

    @C09CT("fyp_gid_list")
    public List<Long> fypGidList = new ArrayList();

    @C09CT("client_gid_list")
    public List<Long> clientGidList = new ArrayList();

    @C09CT("rerank_reason_list")
    public List<String> rerankReasonLis = new ArrayList();

    public final List<Long> getClientGidList() {
        return this.clientGidList;
    }

    public final String getConsistencyExtraInfo() {
        return this.consistencyExtraInfo;
    }

    public final HashMap<Long, ConsistencyGroupStruct> getConsistencyGroups() {
        return this.consistencyGroups;
    }

    public final String getConsistencyReqExtraInfo() {
        return this.consistencyReqExtraInfo;
    }

    public final String getConsistencyUserExtraInfo() {
        return this.consistencyUserExtraInfo;
    }

    public final List<Long> getFinalGidList() {
        return this.finalGidList;
    }

    public final List<Long> getFypGidList() {
        return this.fypGidList;
    }

    public final List<String> getRerankReasonLis() {
        return this.rerankReasonLis;
    }

    public final int getRspType() {
        return this.rspType;
    }

    public final List<Long> getSatiGidList() {
        return this.satiGidList;
    }

    public final List<Long> getSortGidList() {
        return this.sortGidList;
    }

    public final void setClientGidList(List<Long> list) {
        this.clientGidList = list;
    }

    public final void setConsistencyExtraInfo(String str) {
        this.consistencyExtraInfo = str;
    }

    public final void setConsistencyGroups(HashMap<Long, ConsistencyGroupStruct> map) {
        this.consistencyGroups = map;
    }

    public final void setConsistencyReqExtraInfo(String str) {
        this.consistencyReqExtraInfo = str;
    }

    public final void setConsistencyUserExtraInfo(String str) {
        this.consistencyUserExtraInfo = str;
    }

    public final void setFinalGidList(List<Long> list) {
        this.finalGidList = list;
    }

    public final void setFypGidList(List<Long> list) {
        this.fypGidList = list;
    }

    public final void setRerankReasonLis(List<String> list) {
        this.rerankReasonLis = list;
    }

    public final void setRspType(int i) {
        this.rspType = i;
    }

    public final void setSatiGidList(List<Long> list) {
        this.satiGidList = list;
    }

    public final void setSortGidList(List<Long> list) {
        this.sortGidList = list;
    }
}
