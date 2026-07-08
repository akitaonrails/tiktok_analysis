package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubOnlyVideosBriefInfo {

    @C09CT("creator_status")
    public int creatorStatus;

    @C09CT("is_sov_adjustments_enabled_for_consumer")
    public boolean isSovAdjustmentsEnabledForConsumer;

    @C09CT("new_sov_count")
    public int newSovCount;

    @C09CT("total_count")
    public int totalCount;

    @C09CT("total_count_str")
    public String totalCountStr = "";

    @C09CT("sov_brief_info")
    public List<SOVBriefInfo> sovBriefInfo = new ArrayList();

    @C09CT("schema")
    public String schema = "";
}
