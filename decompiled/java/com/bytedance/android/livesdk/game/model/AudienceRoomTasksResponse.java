package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class AudienceRoomTasksResponse {

    @C09CT("downloaded_count")
    public long downloadedCount;

    @C09CT("drops_id")
    public String dropsId;

    @C09CT("game_cta_map")
    public Map<String, GameCTAInfo> gameCtaMap;

    @C09CT("game_tasks")
    public List<BriefGameTask> gameTasks;

    @C09CT("info")
    public UserInfo info;

    public AudienceRoomTasksResponse() {
        this(null);
    }

    public AudienceRoomTasksResponse(List<BriefGameTask> list) {
        this.gameTasks = list;
        this.dropsId = "";
        this.gameCtaMap = new LinkedHashMap();
    }
}
