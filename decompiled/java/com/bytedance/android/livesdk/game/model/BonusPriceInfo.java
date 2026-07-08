package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class BonusPriceInfo {

    @C09CT("bonus_item_count")
    public long bonusItemCount;

    @C09CT("item_view_count")
    public long itemViewCount;

    @C09CT("milestones")
    public List<BonusMilestoneInfo> milestones = new ArrayList();

    @C09CT("post_expire_sec")
    public long postExpireSec;

    @C09CT("start_ts")
    public long startTs;
}
