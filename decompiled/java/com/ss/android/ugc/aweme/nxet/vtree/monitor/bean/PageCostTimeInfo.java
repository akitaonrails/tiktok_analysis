package com.ss.android.ugc.aweme.nxet.vtree.monitor.bean;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes28.dex */
public final class PageCostTimeInfo implements Comparable<PageCostTimeInfo> {
    public int totalCount;
    public String pageOid = "";
    public ConcurrentHashMap<String, Integer> full = new ConcurrentHashMap<>();

    public final ConcurrentHashMap<String, Integer> getFull() {
        return this.full;
    }

    public final String getPageOid() {
        return this.pageOid;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final void setFull(ConcurrentHashMap<String, Integer> concurrentHashMap) {
        this.full = concurrentHashMap;
    }

    public final void setPageOid(String str) {
        this.pageOid = str;
    }

    public final void setTotalCount(int i) {
        this.totalCount = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(PageCostTimeInfo pageCostTimeInfo) {
        return pageCostTimeInfo.totalCount - this.totalCount;
    }
}
