package com.bytedance.geckox;

import X.AbstractC1552040qUU;
import X.C1551290qTH;
import X.C1551800qU6;
import X.C1957007lY;
import X.EnumC1552440qV8;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class OptionCheckUpdateParams {
    public C1551290qTH cacheConfig;
    public C1551800qU6 checkUpdateData;
    public String from;
    public boolean lazyUpdate;
    public AbstractC1552040qUU listener;
    public EnumC1552440qV8 loopLevel;
    public boolean lowStorageUpdate;
    public boolean enableThrottle = true;
    public Map<String, Map<String, Object>> customParam = new HashMap();
    public boolean enableRetry = true;
    public boolean enableDownloadAutoRetry = true;
    public boolean skipGeckoThreadPool = false;
    public int updatePriority = 1;
    public boolean innerRequestByUser = false;
    public boolean lazyFilter = false;
    public boolean isExpireCleanGroup = false;
    public boolean ignoreLowStorageLimit = false;
    public boolean simplifyLocalInfoInRequest = false;
    public boolean controlDownloading = false;
    public boolean onlyCheckUpdate = false;
    public boolean waitUpdate = false;
    public long throttleInterval = 600000;

    public interface ChannelUpdatePriority {
    }

    public interface CustomValue {
        Object getValue();
    }

    public Boolean getSkipGeckoThreadPool() {
        return Boolean.valueOf(this.skipGeckoThreadPool);
    }

    public boolean isIgnoreLowStorageLimit() {
        return this.ignoreLowStorageLimit && C1957007lY.LIZ.LJIIIIZZ;
    }

    public C1551290qTH getCacheConfig() {
        return this.cacheConfig;
    }

    public int getChannelUpdatePriority() {
        return this.updatePriority;
    }

    public C1551800qU6 getCheckUpdateData() {
        return this.checkUpdateData;
    }

    public Map<String, Map<String, Object>> getCustomParam() {
        return this.customParam;
    }

    public String getFrom() {
        return this.from;
    }

    public boolean getInnerRequestByUser() {
        return this.innerRequestByUser;
    }

    public AbstractC1552040qUU getListener() {
        return this.listener;
    }

    public EnumC1552440qV8 getLoopLevel() {
        return this.loopLevel;
    }

    public long getThrottleInterval() {
        return this.throttleInterval;
    }

    public boolean isControlDownloading() {
        return this.controlDownloading;
    }

    public boolean isEnableDownloadAutoRetry() {
        return this.enableDownloadAutoRetry;
    }

    public boolean isEnableRetry() {
        return this.enableRetry;
    }

    public boolean isEnableThrottle() {
        return this.enableThrottle;
    }

    public boolean isExpireCleanGroup() {
        return this.isExpireCleanGroup;
    }

    public boolean isLazyFilter() {
        return this.lazyFilter;
    }

    public boolean isLazyUpdate() {
        return this.lazyUpdate;
    }

    public boolean isLowStorageUpdate() {
        return this.lowStorageUpdate;
    }

    public boolean isOnlyCheckUpdate() {
        return this.onlyCheckUpdate;
    }

    public boolean isSimplifyLocalInfoInRequest() {
        return this.simplifyLocalInfoInRequest;
    }

    public boolean isWaitUpdate() {
        return this.waitUpdate;
    }

    public OptionCheckUpdateParams setCacheConfig(C1551290qTH c1551290qTH) {
        this.cacheConfig = c1551290qTH;
        return this;
    }

    public OptionCheckUpdateParams setChannelUpdatePriority(int i) {
        this.updatePriority = i;
        return this;
    }

    public OptionCheckUpdateParams setCheckUpdateData(C1551800qU6 c1551800qU6) {
        this.checkUpdateData = c1551800qU6;
        return this;
    }

    public OptionCheckUpdateParams setControlDownloading(boolean z) {
        this.controlDownloading = z;
        return this;
    }

    public OptionCheckUpdateParams setCustomParam(Map<String, Map<String, Object>> map) {
        this.customParam = map;
        return this;
    }

    public OptionCheckUpdateParams setEnableDownloadAutoRetry(boolean z) {
        this.enableDownloadAutoRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableRetry(boolean z) {
        this.enableRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableThrottle(boolean z) {
        this.enableThrottle = z;
        return this;
    }

    public OptionCheckUpdateParams setExpireCleanGroup(boolean z) {
        this.isExpireCleanGroup = z;
        return this;
    }

    public OptionCheckUpdateParams setFrom(String str) {
        this.from = str;
        return this;
    }

    public OptionCheckUpdateParams setIgnoreLowStorageLimit(boolean z) {
        this.ignoreLowStorageLimit = z;
        return this;
    }

    public OptionCheckUpdateParams setInnerRequestByUser(boolean z) {
        this.innerRequestByUser = z;
        return this;
    }

    public void setLazyFilter(boolean z) {
        this.lazyFilter = z;
    }

    public OptionCheckUpdateParams setLazyUpdate(boolean z) {
        this.lazyUpdate = z;
        return this;
    }

    public OptionCheckUpdateParams setListener(AbstractC1552040qUU abstractC1552040qUU) {
        this.listener = abstractC1552040qUU;
        return this;
    }

    public OptionCheckUpdateParams setLoopLevel(EnumC1552440qV8 enumC1552440qV8) {
        this.loopLevel = enumC1552440qV8;
        return this;
    }

    public OptionCheckUpdateParams setLowStorageUpdate(boolean z) {
        this.lowStorageUpdate = z;
        return this;
    }

    public OptionCheckUpdateParams setOnlyCheckUpdate(boolean z) {
        this.onlyCheckUpdate = z;
        return this;
    }

    public OptionCheckUpdateParams setSimplifyLocalInfoInRequest(boolean z) {
        this.simplifyLocalInfoInRequest = z;
        return this;
    }

    public void setThrottleInterval(long j) {
        this.throttleInterval = j;
    }

    public OptionCheckUpdateParams setWaitUpdate(boolean z) {
        this.waitUpdate = z;
        return this;
    }

    public OptionCheckUpdateParams skipGeckoThreadPool(boolean z) {
        this.skipGeckoThreadPool = z;
        return this;
    }
}
