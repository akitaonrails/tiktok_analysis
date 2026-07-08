package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftPanelUpdateMessage extends AbstractC1136060ffY {

    @C09CT("gallery_data")
    public GalleryData galleryData;

    @C09CT("goal_data")
    public GoalData goalData;

    @C09CT("room_based_gift_data")
    public RoomBasedGiftData roomBasedGiftData;

    @C09CT("room_id")
    public long roomId;

    @C09CT("strategy_context")
    public String strategyContext;

    @C09CT("timestamp")
    public long timestamp;

    public GiftPanelUpdateMessage() {
        this.type = C001A.GIFT_PANEL_UPDATE_MESSAGE;
        this.strategyContext = "";
    }
}
