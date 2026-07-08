package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class DMInsertUnreadMUFConfig {

    @C09CT("query_delay_time_ms")
    public final long delayTimeMs;

    @C09CT("merge_unread_muf_in_inner_push")
    public final boolean mergeUnreadMUFInInnerPush;

    @C09CT("modify_in_app_push_compensation")
    public final boolean modifyInAppPushCompensation;

    @C09CT("query_timing")
    public final int queryTiming;

    @C09CT("raising_frequency_control_day")
    public final int raisingFrequencyControlDay;

    @C09CT("unread_chats_count_limit")
    public final int unreadChatsCountLimit;

    public DMInsertUnreadMUFConfig() {
        this(0, 0, 4, 500L, false, false);
    }

    public DMInsertUnreadMUFConfig(int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.raisingFrequencyControlDay = i;
        this.queryTiming = i2;
        this.unreadChatsCountLimit = i3;
        this.delayTimeMs = j;
        this.modifyInAppPushCompensation = z;
        this.mergeUnreadMUFInInnerPush = z2;
    }
}
