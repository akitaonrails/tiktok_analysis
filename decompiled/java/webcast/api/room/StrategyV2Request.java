package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class StrategyV2Request {

    @C09CT("gps_enabled")
    public boolean gpsEnabled;

    @C09CT("scenes")
    public String scenes = "";

    @C09CT("feature_ids")
    public String featureIds = "";

    @C09CT("strategy_infos")
    public List<StrategyInfo> strategyInfos = new ArrayList();

    @C09CT("package_infos")
    public List<PackageInfo> packageInfos = new ArrayList();
}
