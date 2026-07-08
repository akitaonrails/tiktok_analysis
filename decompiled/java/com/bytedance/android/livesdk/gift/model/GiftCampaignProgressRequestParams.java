package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftCampaignProgressRequestParams {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("force_refresh")
    public boolean forceRefresh;

    @C09CT("gift_ids")
    public List<Long> giftIds = new ArrayList();

    @C09CT("room_id")
    public long roomId;
}
