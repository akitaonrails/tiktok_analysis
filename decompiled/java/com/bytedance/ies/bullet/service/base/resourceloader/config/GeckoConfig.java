package com.bytedance.ies.bullet.service.base.resourceloader.config;

import X.InterfaceC20117113nV;

/* JADX INFO: loaded from: classes31.dex */
public final class GeckoConfig {
    public String accessKey;
    public boolean appLogMonitor;
    public String businessVersion;
    public boolean isRelativePath;
    public InterfaceC20117113nV loaderDepender;
    public boolean loopCheck;
    public Object networkImpl;
    public String offlineDir;
    public boolean updateWhenInit;
    public boolean useGeckoXV4 = true;
    public boolean serverMonitor = true;
    public String localInfo = "";

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final boolean getAppLogMonitor() {
        return this.appLogMonitor;
    }

    public final String getBusinessVersion() {
        return this.businessVersion;
    }

    public final InterfaceC20117113nV getLoaderDepender() {
        return this.loaderDepender;
    }

    public final String getLocalInfo() {
        return this.localInfo;
    }

    public final boolean getLoopCheck() {
        return this.loopCheck;
    }

    public final Object getNetworkImpl() {
        return this.networkImpl;
    }

    public final String getOfflineDir() {
        return this.offlineDir;
    }

    public final boolean getServerMonitor() {
        return this.serverMonitor;
    }

    public final boolean getUpdateWhenInit() {
        return this.updateWhenInit;
    }

    public final boolean getUseGeckoXV4() {
        return this.useGeckoXV4;
    }

    public final boolean isRelativePath() {
        return this.isRelativePath;
    }

    public final void setAccessKey(String str) {
        this.accessKey = str;
    }

    public final void setAppLogMonitor(boolean z) {
        this.appLogMonitor = z;
    }

    public final void setBusinessVersion(String str) {
        this.businessVersion = str;
    }

    public final void setLoaderDepender(InterfaceC20117113nV interfaceC20117113nV) {
        this.loaderDepender = interfaceC20117113nV;
    }

    public final void setLocalInfo(String str) {
        this.localInfo = str;
    }

    public final void setLoopCheck(boolean z) {
        this.loopCheck = z;
    }

    public final void setNetworkImpl(Object obj) {
        this.networkImpl = obj;
    }

    public final void setOfflineDir(String str) {
        this.offlineDir = str;
    }

    public final void setRelativePath(boolean z) {
        this.isRelativePath = z;
    }

    public final void setServerMonitor(boolean z) {
        this.serverMonitor = z;
    }

    public final void setUpdateWhenInit(boolean z) {
        this.updateWhenInit = z;
    }

    public final void setUseGeckoXV4(boolean z) {
        this.useGeckoXV4 = z;
    }

    public GeckoConfig(String str, String str2, InterfaceC20117113nV interfaceC20117113nV, boolean z, boolean z2) {
        this.accessKey = str;
        this.offlineDir = str2;
        this.loaderDepender = interfaceC20117113nV;
        this.isRelativePath = z;
        this.loopCheck = z2;
    }
}
