package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AwemeStatisticsResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("statistics_list")
    public List<AwemeStatisticsBackup> statisticsList;

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeStatisticsResponse(status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", status_msg=");
        sbLIZ.append(this.status_msg);
        sbLIZ.append(", statisticsList=");
        sbLIZ.append(this.statisticsList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<AwemeStatisticsBackup> getStatisticsList() {
        return this.statisticsList;
    }

    public final void setStatisticsList(List<AwemeStatisticsBackup> list) {
        this.statisticsList = list;
    }
}
