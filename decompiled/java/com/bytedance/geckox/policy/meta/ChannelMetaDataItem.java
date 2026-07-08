package com.bytedance.geckox.policy.meta;

import X.C09CT;
import X.EnumC797980VSa;

/* JADX INFO: loaded from: classes24.dex */
public final class ChannelMetaDataItem {

    @C09CT("c_time")
    public long createTime;

    @C09CT("loaded")
    public boolean isLoaded;

    @C09CT("is_loaded_by_async")
    public boolean isLoadedByAsync;

    @C09CT("l_a_time")
    public long lastAccessTime;

    @C09CT("l_a_type")
    public EnumC797980VSa lastAccessType;

    @C09CT("l_l_time")
    public long lastLoadTime;

    @C09CT("l_v")
    public long latestVersion;

    public final boolean exists() {
        return this.latestVersion > 0;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getLastAccessTime() {
        return this.lastAccessTime;
    }

    public final EnumC797980VSa getLastAccessType() {
        return this.lastAccessType;
    }

    public final long getLastLoadTime() {
        return this.lastLoadTime;
    }

    public final long getLatestVersion() {
        return this.latestVersion;
    }

    public final boolean isLoaded() {
        return this.isLoaded;
    }

    public final boolean isLoadedByAsync() {
        return this.isLoadedByAsync;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setLastAccessTime(long j) {
        this.lastAccessTime = j;
    }

    public final void setLastAccessType(EnumC797980VSa enumC797980VSa) {
        this.lastAccessType = enumC797980VSa;
    }

    public final void setLastLoadTime(long j) {
        this.lastLoadTime = j;
    }

    public final void setLatestVersion(long j) {
        this.latestVersion = j;
    }

    public final void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    public final void setLoadedByAsync(boolean z) {
        this.isLoadedByAsync = z;
    }

    public ChannelMetaDataItem(long j, boolean z, long j2, long j3, EnumC797980VSa enumC797980VSa, long j4, boolean z2) {
        this.latestVersion = j;
        this.isLoaded = z;
        this.createTime = j2;
        this.lastLoadTime = j3;
        this.lastAccessType = enumC797980VSa;
        this.lastAccessTime = j4;
        this.isLoadedByAsync = z2;
    }
}
