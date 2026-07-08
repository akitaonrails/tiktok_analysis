package com.ss.android.ugc.aweme.feed.lynxcard;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedLynxCardOptConfig {

    @C09CT("enable_sync_create_template_data")
    public final boolean enableSyncCreateTemplateData;

    @C09CT("sync_create_template_data_list")
    public final List<Integer> synCreateTemplateDataList;

    public FeedLynxCardOptConfig() {
        this(null, false);
    }

    public FeedLynxCardOptConfig(List<Integer> list, boolean z) {
        this.synCreateTemplateDataList = list;
        this.enableSyncCreateTemplateData = z;
    }
}
