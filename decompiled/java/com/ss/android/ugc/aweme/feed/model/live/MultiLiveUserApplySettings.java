package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class MultiLiveUserApplySettings implements Serializable {

    @C09CT("extra_info")
    public Map<String, String> extraInfo = new LinkedHashMap();

    @C09CT("feed_card")
    public FeedCard feedCard;

    @C09CT("multi_guest_layout_info")
    public MultiGuestLayoutInfo multiGuestLayoutInfo;
}
