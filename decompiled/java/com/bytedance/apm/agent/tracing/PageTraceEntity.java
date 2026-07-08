package com.bytedance.apm.agent.tracing;

/* JADX INFO: loaded from: classes14.dex */
public class PageTraceEntity {
    public long onCreateEndTs;
    public long onCreateStartTs;
    public long onResumeEndTs;
    public long onResumeStartTs;
    public long onViewShowTs;
    public long onWindowFocusTs;
    public String pageName;

    public boolean isCreateAndResumeValid() {
        return this.onCreateStartTs > 0 && this.onCreateEndTs > 0 && this.onResumeStartTs > 0 && this.onResumeEndTs > 0;
    }

    public long getOnCreateEndTs() {
        return this.onCreateEndTs;
    }

    public long getOnCreateStartTs() {
        return this.onCreateStartTs;
    }

    public long getOnResumeEndTs() {
        return this.onResumeEndTs;
    }

    public long getOnResumeStartTs() {
        return this.onResumeStartTs;
    }

    public long getOnWindowFocusTs() {
        return this.onWindowFocusTs;
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setOnCreateEndTs(long j) {
        this.onCreateEndTs = j;
    }

    public void setOnCreateStartTs(long j) {
        this.onCreateStartTs = j;
    }

    public void setOnResumeEndTs(long j) {
        this.onResumeEndTs = j;
    }

    public void setOnResumeStartTs(long j) {
        this.onResumeStartTs = j;
    }

    public void setOnWindowFocusTs(long j) {
        this.onWindowFocusTs = j;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public PageTraceEntity(String str, long j) {
        this.pageName = str;
        this.onCreateStartTs = j;
    }
}
