package com.bytedance.android.livesdk.comp.api.linkcore.model;

import java.util.Map;
import webcast.data.multilive_biz.BizLeaveResponse;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveChannelResult {
    public final BizLeaveResponse bizExtra;
    public final Map<String, byte[]> extraItems;
    public final long feedbackShowReason;
    public final String logId;

    public LeaveChannelResult(Map<String, byte[]> map, String str, long j, BizLeaveResponse bizLeaveResponse) {
        this.extraItems = map;
        this.logId = str;
        this.feedbackShowReason = j;
        this.bizExtra = bizLeaveResponse;
    }
}
