package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.glip.ItemDetailTOC;
import webcast.data.glip.LeaderboardMetricProgress;

/* JADX INFO: loaded from: classes29.dex */
public final class ItemRewardDetail {

    @C09CT("billing_source")
    public int billingSource;

    @C09CT("glip_biz_scene")
    public int glipBizScene;

    @C09CT("ineligible_views")
    public IneligibleViews ineligibleViews;

    @C09CT("ineligible_vv")
    public long ineligibleVv;

    @C09CT("item_detail")
    public ItemDetailTOC itemDetail;

    @C09CT("ls_download_detail")
    public LsDownloadDetail lsDownloadDetail;

    @C09CT("metric_progress_list")
    public List<LeaderboardMetricProgress> metricProgressList = new ArrayList();

    @C09CT("task_mode")
    public int taskMode;

    @C09CT("total_score")
    public long totalScore;

    @C09CT("total_valid_vv")
    public long totalValidVv;

    @C09CT("total_vv")
    public long totalVv;
}
