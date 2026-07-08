package com.ss.android.ugc.aweme.outreach.dispersion.save;

import X.C20648315qz;
import X.C20648515r1;
import com.ss.android.ugc.aweme.outreach.dispersion.data.SyncOutreachModel;
import com.ss.android.ugc.aweme.outreach.dispersion.util.TestSingleOutreach;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachRecordData implements Comparable<OutreachRecordData> {
    public transient C20648515r1 dispersalRule;
    public String enterFrom;
    public transient String groupId;
    public final String key;
    public final String logId;
    public final String outreachType;
    public transient String resultInfo;
    public String scene;
    public final String sessionId;
    public final String showDate;
    public boolean showResult;
    public String showTime;
    public final String triggerId;
    public transient ArrayList<C20648515r1> updateQuotaRuleList;
    public final transient CopyOnWriteArrayList<OutreachRecordData> dispersalOutreachRecords = new CopyOnWriteArrayList<>();
    public String awemeId = "";
    public Long showTimeMiles = Long.valueOf(System.currentTimeMillis());

    public final TestSingleOutreach getSingleTestOutreach() {
        return new TestSingleOutreach(this.outreachType, this.key, this.triggerId, this.scene, this.sessionId, this.showTime);
    }

    public final TestSingleOutreach getTestOutreachRecordData() {
        return new TestSingleOutreach(this.outreachType, this.key, this.triggerId, this.scene, this.sessionId, this.showTime);
    }

    public final SyncOutreachModel transToSyncModel() {
        String str = this.key;
        String str2 = this.outreachType;
        String str3 = this.scene;
        String str4 = this.sessionId;
        Long l = this.showTimeMiles;
        return new SyncOutreachModel(str, str2, str3, str4, Long.valueOf(l != null ? l.longValue() : 0L), this.triggerId, this.logId);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final CopyOnWriteArrayList<OutreachRecordData> getDispersalOutreachRecords() {
        return this.dispersalOutreachRecords;
    }

    public final C20648515r1 getDispersalRule() {
        return this.dispersalRule;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getOutreachType() {
        return this.outreachType;
    }

    public final String getResultInfo() {
        return this.resultInfo;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getShowDate() {
        return this.showDate;
    }

    public final boolean getShowResult() {
        return this.showResult;
    }

    public final String getShowTime() {
        return this.showTime;
    }

    public final Long getShowTimeMiles() {
        return this.showTimeMiles;
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public final ArrayList<C20648515r1> getUpdateQuotaRuleList() {
        return this.updateQuotaRuleList;
    }

    @Override // java.lang.Comparable
    public int compareTo(OutreachRecordData outreachRecordData) {
        Long l = this.showTimeMiles;
        Long l2 = outreachRecordData.showTimeMiles;
        if (l == null) {
            if (l2 == null) {
                return 0;
            }
            return 1;
        }
        if (l2 == null) {
            return -1;
        }
        return (int) (l2.longValue() - l.longValue());
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setDispersalRule(C20648515r1 c20648515r1) {
        this.dispersalRule = c20648515r1;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setResultInfo(String str) {
        this.resultInfo = str;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setShowResult(boolean z) {
        this.showResult = z;
    }

    public final void setShowTime(String str) {
        this.showTime = str;
    }

    public final void setShowTimeMiles(Long l) {
        this.showTimeMiles = l;
    }

    public final void setUpdateQuotaRuleList(ArrayList<C20648515r1> arrayList) {
        this.updateQuotaRuleList = arrayList;
    }

    public OutreachRecordData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.outreachType = str;
        this.key = str2;
        this.triggerId = str3;
        this.scene = str4;
        this.showDate = str5;
        this.sessionId = str6;
        this.logId = str7;
        C20648315qz.LIZ.getClass();
        this.showTime = C20648315qz.LJFF();
    }
}
