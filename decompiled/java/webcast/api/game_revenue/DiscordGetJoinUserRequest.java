package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class DiscordGetJoinUserRequest {

    @C09CT("business_id")
    public int businessId;

    @C09CT("end_time")
    public long endTime;

    @C09CT("limit")
    public int limit;

    @C09CT("need_time_interval")
    public boolean needTimeInterval;

    @C09CT("offset")
    public int offset;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("start_time")
    public long startTime;
}
