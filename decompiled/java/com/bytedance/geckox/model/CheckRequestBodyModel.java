package com.bytedance.geckox.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class CheckRequestBodyModel {

    @C09CT("common")
    public Common common;

    @C09CT("custom")
    public Map<String, Map<String, Object>> custom;

    @C09CT("deployments")
    public Map<String, Object> deployments;

    @C09CT("local")
    public Map<String, Map<String, LocalChannel>> local;

    @C09CT("req_meta")
    public RequestMeta requestMeta;

    public static class LocalChannel {

        @C09CT("l_v")
        public Long localVersion;
    }

    public static class RequestMeta {

        @C09CT("combine_level")
        public String combineLevel;

        @C09CT("req_type")
        public int reqType;

        @C09CT("sync_task_id")
        public int syncTaskId;

        public String getCombineLevel() {
            return this.combineLevel;
        }

        public int getReqType() {
            return this.reqType;
        }

        public int getSyncTaskId() {
            return this.syncTaskId;
        }

        public RequestMeta(int i) {
            this.reqType = i;
        }

        public void setCombineLevel(String str) {
            this.combineLevel = str;
        }

        public void setReqType(int i) {
            this.reqType = i;
        }

        public void setSyncTaskId(int i) {
            this.syncTaskId = i;
        }
    }

    public static class TargetChannel {

        @C09CT("c")
        public String channelName;

        @C09CT("from")
        public List<String> from;

        @C09CT("t_v")
        public Long targetVersion;

        public TargetChannel() {
        }

        public TargetChannel(String str) {
            this.channelName = str;
        }

        public TargetChannel(String str, Long l) {
            this.channelName = str;
            this.targetVersion = l;
        }
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setDeployments(Map<String, Object> map) {
        this.deployments = map;
    }

    public void setLocal(Map<String, Map<String, LocalChannel>> map) {
        this.local = map;
    }

    public void setRequestMeta(RequestMeta requestMeta) {
        this.requestMeta = requestMeta;
    }
}
