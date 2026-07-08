package com.ss.android.ugc.aweme.interactive.task.game;

import X.C09CT;
import X.InterfaceC2126708Uv;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class GameEffectChallenge implements Serializable {
    public static final int $stable = 8;

    @C09CT("creator_uid")
    @InterfaceC2126708Uv
    public final String creatorUid;

    @C09CT("entries")
    public final List<GameEffectChallengeEntry> entries;

    @C09CT("game_info")
    public final GameEffectChallengeGameInfo gameInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("task_id")
    @InterfaceC2126708Uv
    public final String taskId;

    public GameEffectChallenge() {
        this(null, null, null, null, null);
    }

    public GameEffectChallenge(String str, String str2, GameEffectChallengeGameInfo gameEffectChallengeGameInfo, List<GameEffectChallengeEntry> list, Integer num) {
        this.taskId = str;
        this.creatorUid = str2;
        this.gameInfo = gameEffectChallengeGameInfo;
        this.entries = list;
        this.status = num;
    }
}
