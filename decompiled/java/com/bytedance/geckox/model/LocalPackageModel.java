package com.bytedance.geckox.model;

/* JADX INFO: loaded from: classes24.dex */
public class LocalPackageModel {
    public String accessKey;
    public String channel;
    public String channelPath;
    public long latestVersion;

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getChannelPath() {
        return this.channelPath;
    }

    public long getLatestVersion() {
        return this.latestVersion;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelPath(String str) {
        this.channelPath = str;
    }

    public void setLatestVersion(long j) {
        this.latestVersion = j;
    }

    public LocalPackageModel(String str, String str2) {
        this.accessKey = str;
        this.channel = str2;
    }
}
