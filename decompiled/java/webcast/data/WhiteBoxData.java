package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WhiteBoxData {

    @C09CT("data_list")
    public List<WhiteBoxDataItem> dataList = new ArrayList();

    @C09CT("total_recommendation_viewers")
    public long totalRecommendationViewers;

    @C09CT("total_viewers")
    public long totalViewers;

    @C09CT("traffic_diagnose")
    public TrafficDiagnose trafficDiagnose;
}
