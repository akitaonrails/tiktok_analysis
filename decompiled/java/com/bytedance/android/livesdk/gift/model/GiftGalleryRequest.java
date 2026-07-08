package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class GiftGalleryRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_ids")
    public String giftIds = "";

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("to_user_id")
    public long toUserId;
}
