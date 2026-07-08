package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorReplayInfoRequest {

    @C09CT("count")
    public long count;

    @C09CT("need_live_fragment")
    public boolean needLiveFragment;

    @C09CT("need_no_delay")
    public boolean needNoDelay;

    @C09CT("need_promotion_rule")
    public boolean needPromotionRule;

    @C09CT("need_share")
    public boolean needShare;

    @C09CT("need_suffix")
    public boolean needSuffix;

    @C09CT("offset")
    public long offset;

    @C09CT("room_ids")
    public String roomIds = "";

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("user_type")
    public int userType;
}
