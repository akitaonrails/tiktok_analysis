package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes36.dex */
public final class AnchorToolModification {

    @C09CT("duration")
    public long duration;

    @C09CT("effect_id")
    public long effectId;

    @C09CT("end_time")
    public long endTime;

    @C09CT("from")
    public long from;

    @C09CT("mode")
    public long mode;

    @C09CT("modification_type")
    public int modificationType;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("role")
    public long role;

    @C09CT("room_id")
    public long roomId;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;

    @C09CT("sub_type")
    public long subType;

    @C09CT("user_id")
    public long userId;

    @C09CT("value")
    public double value;

    @C09CT("name")
    public String name = "";

    @C09CT("resource_id")
    public String resourceId = "";

    @C09CT("tab")
    public String tab = "";

    @C09CT("url")
    public String url = "";

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("content")
    public String content = "";
}
