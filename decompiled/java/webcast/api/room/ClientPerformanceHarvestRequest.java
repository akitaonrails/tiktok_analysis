package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.Performance;

/* JADX INFO: loaded from: classes18.dex */
public final class ClientPerformanceHarvestRequest {

    @C09CT("current_performance")
    public Performance currentPerformance;

    @C09CT("harvest_action")
    public int harvestAction;

    @C09CT("history_performance")
    public List<Performance> historyPerformance = new ArrayList();

    @C09CT("mobile_score")
    public float mobileScore;

    @C09CT("room_id")
    public long roomId;
}
