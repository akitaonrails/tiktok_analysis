package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class AckRemindMatchParams {

    @C09CT("mapping_id")
    public long mappingId;

    @C09CT("remind_channel")
    public int remindChannel;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("token")
    public String token = "";
}
