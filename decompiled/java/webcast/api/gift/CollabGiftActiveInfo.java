package webcast.api.gift;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class CollabGiftActiveInfo {

    @C09CT("contributors")
    public List<String> contributors = new ArrayList();

    @C09CT("current_score")
    public long currentScore;

    @C09CT("current_stage")
    public long currentStage;

    @C09CT("current_time")
    public long currentTime;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("max_score")
    public long maxScore;

    @C09CT("max_stage")
    public long maxStage;

    @C09CT("start_time")
    public long startTime;
}
