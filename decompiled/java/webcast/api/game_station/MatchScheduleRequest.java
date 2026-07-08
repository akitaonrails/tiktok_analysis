package webcast.api.game_station;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes28.dex */
public final class MatchScheduleRequest {

    @C09CT("batch_size")
    public long batchSize;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("slide_way")
    public int slideWay;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("tournament_id")
    public String tournamentId = "";
}
