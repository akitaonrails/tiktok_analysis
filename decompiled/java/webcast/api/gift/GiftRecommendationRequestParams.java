package webcast.api.gift;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftRecommendationRequestParams {

    @C09CT("room_id")
    public long roomId;

    @C09CT("to_user_id")
    public long toUserId;

    @C09CT("user_id")
    public long userId;

    @C09CT("reasons_to_refresh")
    public String reasonsToRefresh = "";

    @C09CT("panel_gift_ids")
    public String panelGiftIds = "";

    @C09CT("strategy_token")
    public String strategyToken = "";
}
