package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class OecLivePreviewRoomData implements Serializable {

    @C09CT("go_live_card_target_room_info")
    public final GoLiveCardTargetRoomInfo goLiveCardTargetRoomInfo;

    @C09CT("preview_card_info")
    public final PreviewCardInfo previewCardInfo;

    @C09CT("preview_promotion_info")
    public final PreviewPromotionInfo previewPromotionInfo;

    @C09CT("code_region_info")
    public final String regionInfo;

    public OecLivePreviewRoomData() {
        this(null, null, null, null);
    }

    public OecLivePreviewRoomData(PreviewPromotionInfo previewPromotionInfo, GoLiveCardTargetRoomInfo goLiveCardTargetRoomInfo, String str, PreviewCardInfo previewCardInfo) {
        this.previewPromotionInfo = previewPromotionInfo;
        this.goLiveCardTargetRoomInfo = goLiveCardTargetRoomInfo;
        this.regionInfo = str;
        this.previewCardInfo = previewCardInfo;
    }
}
