package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class RedDotConfig {

    @C09CT("end_time")
    public long endTime;

    @C09CT("lifetime")
    public long lifetime;

    @C09CT("new_user_block")
    public boolean newUserBlock;

    @C09CT("priority")
    public long priority;

    @C09CT("room_location_level")
    public int roomLocationLevel;

    @C09CT("room_position")
    public long roomPosition;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("skip_downline_mechanism")
    public boolean skipDownlineMechanism;

    @C09CT("outer_layer_red_dot_list")
    public List<String> outerLayerRedDotList = new ArrayList();

    @C09CT("filter_reason")
    public String filterReason = "";

    @C09CT("room_location")
    public String roomLocation = "";
}
