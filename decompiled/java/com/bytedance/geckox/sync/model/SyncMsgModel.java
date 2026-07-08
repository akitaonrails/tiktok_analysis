package com.bytedance.geckox.sync.model;

import X.C09CT;
import com.bytedance.geckox.model.CleanPolicyModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class SyncMsgModel {

    @C09CT("data")
    public SyncDataModel data;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("sync_task_id")
    public int syncTaskId;

    @C09CT("timestamp")
    public long timestamp;

    public static class SyncDataModel {

        @C09CT("check_update_info")
        public SyncCheckUpdateModel checkUpdateInfo;

        @C09CT("clean_info")
        public Map<String, CleanPolicyModel> cleanInfo;

        @C09CT("download_info")
        public Map<String, List<SyncDownloadChanelModel>> downloadInfo;

        public SyncCheckUpdateModel getCheckUpdateInfo() {
            return this.checkUpdateInfo;
        }

        public Map<String, CleanPolicyModel> getCleanInfo() {
            return this.cleanInfo;
        }

        public Map<String, List<SyncDownloadChanelModel>> getDownloadInfo() {
            return this.downloadInfo;
        }

        public void setCheckUpdateInfo(SyncCheckUpdateModel syncCheckUpdateModel) {
            this.checkUpdateInfo = syncCheckUpdateModel;
        }

        public void setCleanInfo(Map<String, CleanPolicyModel> map) {
            this.cleanInfo = map;
        }

        public void setDownloadInfo(Map<String, List<SyncDownloadChanelModel>> map) {
            this.downloadInfo = map;
        }
    }

    public SyncDataModel getData() {
        return this.data;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public int getSyncTaskId() {
        return this.syncTaskId;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setData(SyncDataModel syncDataModel) {
        this.data = syncDataModel;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setSyncTaskId(int i) {
        this.syncTaskId = i;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
