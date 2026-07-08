package com.bytedance.geckox.policy.meta.file;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class FileMetaDataItem {

    @C09CT("c_time")
    public final long createTime;

    @C09CT("l_a_time")
    public long lastAccessTime;

    @C09CT("sort_order")
    public final int sortOrder;

    public FileMetaDataItem() {
        this(System.currentTimeMillis(), 0, 0L);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getLastAccessTime() {
        return this.lastAccessTime;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final void setLastAccessTime(long j) {
        this.lastAccessTime = j;
    }

    public FileMetaDataItem(long j, int i, long j2) {
        this.createTime = j;
        this.sortOrder = i;
        this.lastAccessTime = j2;
    }
}
