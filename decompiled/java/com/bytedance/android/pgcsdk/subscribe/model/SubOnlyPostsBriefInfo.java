package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubOnlyPostsBriefInfo {

    @C09CT("creator_status")
    public int creatorStatus;

    @C09CT("is_sov_adjustments_enabled_for_consumer")
    public boolean isSovAdjustmentsEnabledForConsumer;

    @C09CT("new_sov_count")
    public int newSovCount;

    @C09CT("total_count")
    public int totalCount;

    @C09CT("total_photo_count")
    public int totalPhotoCount;

    @C09CT("total_video_count")
    public int totalVideoCount;

    @C09CT("total_count_str")
    public String totalCountStr = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT("total_photo_count_str")
    public String totalPhotoCountStr = "";

    @C09CT("sop_brief_info")
    public List<SOPBriefInfo> sopBriefInfo = new ArrayList();

    @C09CT("total_video_count_str")
    public String totalVideoCountStr = "";
}
