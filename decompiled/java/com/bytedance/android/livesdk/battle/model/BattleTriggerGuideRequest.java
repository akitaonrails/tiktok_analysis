package com.bytedance.android.livesdk.battle.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTriggerGuideRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("battle_id")
    public long battleId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
