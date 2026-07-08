package com.bytedance.android.livesdk.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class WaitingReviewInfo {

    @C09CT("audit_content")
    public String content;

    @C09CT("audit_status")
    public int status;

    @C09CT("total_queue_cnt")
    public int totalWaitingCount;

    @C09CT("cur_wait_cnt")
    public int waitingCount;

    @C09CT("rule_info")
    public List<WaitingReviewRule> waitingReviewRules;

    @C09CT("to_wait_time")
    public int waitingTime;

    public String getContent() {
        return this.content;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotalWaitingCount() {
        return this.totalWaitingCount;
    }

    public int getWaitingCount() {
        return this.waitingCount;
    }

    public List<WaitingReviewRule> getWaitingReviewRules() {
        return this.waitingReviewRules;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalWaitingCount(int i) {
        this.totalWaitingCount = i;
    }

    public void setWaitingCount(int i) {
        this.waitingCount = i;
    }

    public void setWaitingReviewRules(List<WaitingReviewRule> list) {
        this.waitingReviewRules = list;
    }

    public void setWaitingTime(int i) {
        this.waitingTime = i;
    }
}
