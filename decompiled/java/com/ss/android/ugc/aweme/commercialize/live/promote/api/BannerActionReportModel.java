package com.ss.android.ugc.aweme.commercialize.live.promote.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class BannerActionReportModel implements Serializable {

    @C09CT("action_type")
    public int actionType;

    @C09CT("customized_info")
    public String customizedInfo;

    @C09CT("freq_days")
    public Integer freqDays;

    @C09CT("item_id")
    public String itemId;

    @C09CT("max_show_count")
    public Integer maxShowCount;

    @C09CT("show_count")
    public Integer showCount;

    @C09CT("update_time")
    public long updateTime;

    public BannerActionReportModel() {
        this(null, 1, 0L, null, null, null, null);
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final String getCustomizedInfo() {
        return this.customizedInfo;
    }

    public final Integer getFreqDays() {
        return this.freqDays;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Integer getMaxShowCount() {
        return this.maxShowCount;
    }

    public final Integer getShowCount() {
        return this.showCount;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setActionType(int i) {
        this.actionType = i;
    }

    public final void setCustomizedInfo(String str) {
        this.customizedInfo = str;
    }

    public final void setFreqDays(Integer num) {
        this.freqDays = num;
    }

    public final void setItemId(String str) {
        this.itemId = str;
    }

    public final void setMaxShowCount(Integer num) {
        this.maxShowCount = num;
    }

    public final void setShowCount(Integer num) {
        this.showCount = num;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public BannerActionReportModel(String str, int i, long j, Integer num, Integer num2, Integer num3, String str2) {
        this.itemId = str;
        this.actionType = i;
        this.updateTime = j;
        this.showCount = num;
        this.maxShowCount = num2;
        this.freqDays = num3;
        this.customizedInfo = str2;
    }
}
