package com.bytedance.geckox.sync.model;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class SyncCheckUpdateModel {

    @C09CT("config")
    public Map<String, SyncChannelModel> config;

    public static class SyncChannelModel {

        @C09CT("custom_keys")
        public List<String> customKeys;

        @C09CT("group")
        public String group;

        @C09CT("target_chs")
        public List<String> targetChannel;

        public List<String> getCustomKeys() {
            return this.customKeys;
        }

        public String getGroup() {
            return this.group;
        }

        public List<String> getTargetChannel() {
            return this.targetChannel;
        }

        public void setCustomKeys(List<String> list) {
            this.customKeys = list;
        }

        public void setGroup(String str) {
            this.group = str;
        }

        public void setTargetChannel(List<String> list) {
            this.targetChannel = list;
        }
    }

    public Map<String, SyncChannelModel> getConfig() {
        return this.config;
    }

    public void setConfig(Map<String, SyncChannelModel> map) {
        this.config = map;
    }
}
