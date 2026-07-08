package com.bytedance.geckox.settings.model;

import X.C08FF;
import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class GlobalConfigSettings {

    @C09CT("settings_config")
    public GlobalConfig globalConfig;

    @C09CT("ng_settings")
    public NGSettings ngSettings;

    @C09CT("req_meta")
    public ReqMeta reqMeta;

    @C09CT("resource_meta")
    public ResourceMeta resourceMeta;

    @C09CT("version")
    public int version;

    public static class AccessKeyMetaInfo {

        @C09CT("channels")
        public Map<String, ChannelMetaInfo> channels;

        @C09CT("config")
        public CurrentLevelConfig config;

        public Map<String, ChannelMetaInfo> getChannels() {
            return this.channels;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class CDNFallBackConfig {

        @C09CT("domains")
        public List<String> domains;

        @C09CT("max_attempts")
        public int maxAttempts;

        @C09CT("shuffle")
        public int shuffle;

        public List<String> getDomains() {
            return this.domains;
        }

        public int getMaxAttempts() {
            return this.maxAttempts;
        }

        public int getShuffle() {
            return this.shuffle;
        }
    }

    public static class CDNMultiVersion {

        @C09CT("domains")
        public List<String> domains;

        public List<String> getDomains() {
            return this.domains;
        }
    }

    public static class ChannelMetaInfo {

        @C09CT("config")
        public CurrentLevelConfig config;

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class CurrentLevelConfig {

        @C09CT("cdn_fallback")
        public CDNFallBackConfig cdnFallback;

        @C09CT("cdn_multi_version")
        public CDNMultiVersion cdnMultiVersion;

        @C09CT("pipeline")
        public List<PipelineStep> pipeline;

        @C09CT("prefix_2_ak")
        public Map<String, String> prefix2AccessKey;

        public CDNMultiVersion getCDNMultiVersion() {
            return this.cdnMultiVersion;
        }

        public CDNFallBackConfig getCdnFallback() {
            return this.cdnFallback;
        }

        public List<PipelineStep> getPipeline() {
            return this.pipeline;
        }

        public Map<String, String> getPrefix2AccessKey() {
            return this.prefix2AccessKey;
        }
    }

    public static class GeckoPollingConfig {

        @C09CT("combine")
        public List<SyncItem> combine;

        @C09CT("interval")
        public int interval;

        public List<SyncItem> getCombine() {
            return this.combine;
        }

        public int getInterval() {
            return this.interval;
        }
    }

    public static class GlobalConfig {

        @C09CT("check_update")
        public SettingsPollingConfig checkUpdate;

        @C09CT("host_app_id")
        public List<String> hostAppId;

        @C09CT("poll_enable")
        public int pollEnable;

        public SettingsPollingConfig getCheckUpdate() {
            return this.checkUpdate;
        }

        public List<String> getHostAppId() {
            return this.hostAppId;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }
    }

    public static class LazyItem {

        @C09CT("channels")
        public List<String> channels;

        @C09CT("groups")
        public List<String> groups;

        public List<String> getChannels() {
            return this.channels;
        }

        public List<String> getGroups() {
            return this.groups;
        }
    }

    public static class PipelineStep {

        @C09CT("no_cache")
        public int noCache;

        @C09CT("type")
        public int type;

        @C09CT("update")
        public int update;

        public int getNoCache() {
            return this.noCache;
        }

        public int getType() {
            return this.type;
        }

        public int getUpdate() {
            return this.update;
        }
    }

    public static class ReqMeta {

        @C09CT("aks")
        public List<String> aks;

        @C09CT("check_update")
        public Map<String, GeckoPollingConfig> checkUpdate;

        @C09CT("enable")
        public int enable;

        @C09CT("fre_control_enable")
        public int freControlEnable;

        @C09CT("lazy")
        public Map<String, LazyItem> lazy;

        @C09CT("poll_enable")
        public int pollEnable;

        @C09CT("queue")
        public List<RequestConfig> queue;

        public List<String> getAks() {
            return this.aks;
        }

        public Map<String, GeckoPollingConfig> getCheckUpdate() {
            return this.checkUpdate;
        }

        public int getEnable() {
            return this.enable;
        }

        public int getFreControlEnable() {
            return this.freControlEnable;
        }

        public Map<String, LazyItem> getLazy() {
            return this.lazy;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }

        public List<RequestConfig> getQueue() {
            return this.queue;
        }
    }

    public static class RequestConfig {

        @C09CT("delay")
        public long delay;

        @C09CT("sync")
        public List<SyncItem> sync;

        public long getDelay() {
            return this.delay;
        }

        public List<SyncItem> getSync() {
            return this.sync;
        }
    }

    public static class ResourceMeta {

        @C09CT("access_keys")
        public Map<String, AccessKeyMetaInfo> accessKeys;

        @C09CT("config")
        public CurrentLevelConfig config;

        public Map<String, AccessKeyMetaInfo> getAccessKeys() {
            return this.accessKeys;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    public static class SettingsPollingConfig {

        @C09CT("interval")
        public long interval;

        public long getInterval() {
            return this.interval;
        }
    }

    public static class SyncItem {

        @C09CT("ak")
        public String ak;

        @C09CT("group")
        public List<String> group;

        @C09CT("target")
        public List<String> target;

        public SyncItem() {
        }

        public String getAccessKey() {
            return this.ak;
        }

        public List<String> getGroup() {
            return this.group;
        }

        public List<String> getTarget() {
            return this.target;
        }

        public SyncItem(String str, List<String> list, List<String> list2) {
            this.ak = str;
            this.group = list;
            this.target = list2;
        }
    }

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public ReqMeta getReqMeta() {
        return this.reqMeta;
    }

    public ResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public int getVersion() {
        return this.version;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public enum PipelineType {
        GECKO(1),
        CDN(2),
        BUILTIN(3);

        public int val;

        public int getVal() {
            return this.val;
        }

        public static PipelineType valueOf(String str) {
            return (PipelineType) C08FF.LIZ(PipelineType.class, str);
        }

        PipelineType(int i) {
            this.val = i;
        }
    }
}
