package com.bytedance.android.livesdk.gift.base.platform.core.manager;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftListRequestParams {

    @C09CT("cohost_user_ids")
    public List<Long> cohostUserIds;

    @C09CT("es_version")
    public String esVersion;

    @C09CT("fetch_giftlist_from")
    public int fetchFrom;

    @C09CT("gift_hashes")
    public String giftHashes;

    @C09CT("multi_guest_user_ids")
    public List<Long> multiGuestUserIds;

    @C09CT("need_gift_hash")
    public boolean needGiftHash = true;

    @C09CT("provide_name_group_map")
    public boolean provideNameGroupMap;

    @C09CT("recent_gifts")
    public String recentGifts;

    @C09CT("req_for_strategy")
    public String reqForStrategy;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("client_trigger_feature")
    public String triggerFeature;

    @C09CT("trigger_type")
    public String triggerType;

    @C09CT("user_system_time")
    public long userSystemTime;
}
