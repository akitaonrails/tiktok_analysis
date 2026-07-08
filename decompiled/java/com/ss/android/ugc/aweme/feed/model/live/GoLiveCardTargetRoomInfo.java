package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GoLiveCardTargetRoomInfo implements Serializable {

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    @C09CT("is_go_live_card_target_room")
    public final Boolean enableGoLiveCard;

    public GoLiveCardTargetRoomInfo() {
        this(null, null);
    }

    public GoLiveCardTargetRoomInfo(Boolean bool, Map<String, String> map) {
        this.enableGoLiveCard = bool;
        this.daInfo = map;
    }
}
