package com.ss.lyrax.engine;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxNetworkOption {
    public ArrayList<String> accessHosts = new ArrayList<>();
    public String customMediaServerIp = "";
    public String accessGroupId = "";
    public String liveRole = "";
    public boolean clearNetCache = false;

    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public ArrayList<String> getAccessHosts() {
        return this.accessHosts;
    }

    public boolean getClearNetCache() {
        return this.clearNetCache;
    }

    public String getCustomMediaServerIp() {
        return this.customMediaServerIp;
    }

    public String getLiveRole() {
        return this.liveRole;
    }
}
