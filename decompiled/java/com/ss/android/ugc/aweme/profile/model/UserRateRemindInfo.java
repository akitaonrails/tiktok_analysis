package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public class UserRateRemindInfo implements Serializable {

    @C09CT("detail_link")
    public String detailLink;

    @C09CT("rate_record_id")
    public long rateRecordId;

    @C09CT("remind_text")
    public String remindText;

    @C09CT("show_day_limit")
    public int showDayLimit;

    @C09CT("show_detail_count_limit")
    public int showDetailCountLimit;

    public String getDetailLink() {
        return this.detailLink;
    }

    public long getRateRecordId() {
        return this.rateRecordId;
    }

    public String getRemindText() {
        return this.remindText;
    }

    public int getShowDayLimit() {
        return this.showDayLimit;
    }

    public int getShowDetailCountLimit() {
        return this.showDetailCountLimit;
    }

    public void setDetailLink(String str) {
        this.detailLink = str;
    }

    public void setRateRecordId(long j) {
        this.rateRecordId = j;
    }

    public void setRemindText(String str) {
        this.remindText = str;
    }

    public void setShowDayLimit(int i) {
        this.showDayLimit = i;
    }

    public void setShowDetailCountLimit(int i) {
        this.showDetailCountLimit = i;
    }
}
