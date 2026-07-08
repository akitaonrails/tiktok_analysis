package com.ss.android.ugc.aweme.longpress;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SharePanelConfig {

    @C09CT("exclude_action")
    public final List<String> excludeAction;

    @C09CT("move_tips_display_count")
    public Integer moveTipsDisplayCount;

    @C09CT("action_order_list")
    public final List<SharePanelActionOrderRule> orderList;

    public SharePanelConfig() {
        this(null, null, null);
    }

    public SharePanelConfig(List<String> list, List<SharePanelActionOrderRule> list2, Integer num) {
        this.excludeAction = list;
        this.orderList = list2;
        this.moveTipsDisplayCount = num;
    }
}
