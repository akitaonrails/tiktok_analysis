package com.ss.android.ugc.aweme.services.effectplatform;

import X.C20000913Nn;
import X.C786410Ut5;
import android.content.Context;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectPlatformBuilder {
    public String accessKey;
    public String appID;
    public String appLanguage;
    public String appVersion;
    public Integer backupRetryCount;
    public File cacheDir;
    public String channel;
    public Context context;
    public long effectMaxCacheSize = -1;
    public IEffectNetWorker effectNetWorker;
    public ExecutorService executorService;
    public List<? extends Host> hosts;
    public boolean isEffectDir;
    public boolean isEnableKNEffectPlatform;
    public boolean isSingleton;
    public IJsonConverter jsonConverter;
    public Map<String, ? extends Object> monitorExtraParams;
    public C20000913Nn objIdConversionConfig;
    public String region;
    public Integer requestStrategy;
    public Integer retryCount;
    public String sdkVersion;
    public String systemLanguage;

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final String getAppID() {
        return this.appID;
    }

    public final String getAppLanguage() {
        return this.appLanguage;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final Integer getBackupRetryCount() {
        return this.backupRetryCount;
    }

    public final File getCacheDir() {
        return this.cacheDir;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final Context getContext() {
        return this.context;
    }

    public final IEffectNetWorker getEffectNetWorker() {
        return this.effectNetWorker;
    }

    public final ExecutorService getExecutorService() {
        return this.executorService;
    }

    public final List<Host> getHosts() {
        return this.hosts;
    }

    public final IJsonConverter getJsonConverter() {
        return this.jsonConverter;
    }

    public final Map<String, Object> getMonitorExtraParams() {
        return this.monitorExtraParams;
    }

    public final C20000913Nn getObjIdConversionConfig() {
        return this.objIdConversionConfig;
    }

    public final String getRegion() {
        return this.region;
    }

    public final Integer getRequestStrategy() {
        return this.requestStrategy;
    }

    public final Integer getRetryCount() {
        return this.retryCount;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSystemLanguage() {
        return this.systemLanguage;
    }

    public final boolean isEffectDir() {
        return this.isEffectDir;
    }

    public final boolean isEnableKNEffectPlatform() {
        return this.isEnableKNEffectPlatform;
    }

    public final boolean isSingleton() {
        return this.isSingleton;
    }

    public final EffectPlatformBuilder setAccessKey(String str) {
        this.accessKey = str;
        return this;
    }

    public final EffectPlatformBuilder setAppID(String str) {
        this.appID = str;
        return this;
    }

    public final EffectPlatformBuilder setAppLanguage(String str) {
        this.appLanguage = str;
        return this;
    }

    public final EffectPlatformBuilder setAppVersion(String str) {
        this.appVersion = str;
        return this;
    }

    public final EffectPlatformBuilder setBackupRetryCount(Integer num) {
        this.backupRetryCount = num;
        return this;
    }

    public final EffectPlatformBuilder setCacheDir(File file) {
        this.cacheDir = file;
        return this;
    }

    public final EffectPlatformBuilder setChannel(String str) {
        this.channel = str;
        return this;
    }

    public final EffectPlatformBuilder setContext(Context context) {
        Context contextN3;
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        this.context = contextN3;
        return this;
    }

    public final void setEffectDir(boolean z) {
        this.isEffectDir = z;
    }

    public final EffectPlatformBuilder setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
        this.effectNetWorker = iEffectNetWorker;
        return this;
    }

    public final void setEnableKNEffectPlatform(boolean z) {
        this.isEnableKNEffectPlatform = z;
    }

    public final EffectPlatformBuilder setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public final EffectPlatformBuilder setHosts(List<? extends Host> list) {
        this.hosts = list;
        return this;
    }

    public final EffectPlatformBuilder setJsonConverter(IJsonConverter iJsonConverter) {
        this.jsonConverter = iJsonConverter;
        return this;
    }

    public final void setMonitorExtraParams(Map<String, ? extends Object> map) {
        this.monitorExtraParams = map;
    }

    public final void setObjIdConversionConfig(C20000913Nn c20000913Nn) {
        this.objIdConversionConfig = c20000913Nn;
    }

    public final EffectPlatformBuilder setRegion(String str) {
        this.region = str;
        return this;
    }

    public final EffectPlatformBuilder setRequestStrategy(Integer num) {
        this.requestStrategy = num;
        return this;
    }

    public final EffectPlatformBuilder setRetryCount(Integer num) {
        this.retryCount = num;
        return this;
    }

    public final EffectPlatformBuilder setSdkVersion(String str) {
        this.sdkVersion = str;
        return this;
    }

    public final void setSingleton(boolean z) {
        this.isSingleton = z;
    }

    public final EffectPlatformBuilder setSystemLanguage(String str) {
        this.systemLanguage = str;
        return this;
    }
}
