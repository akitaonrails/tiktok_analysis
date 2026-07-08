package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightDataResponse extends BaseResponse implements Serializable {

    @C09CT("create_time")
    public final long createTime;

    @C09CT("skylight_list")
    public List<SkylightData> dataList;

    @C09CT("fold_config")
    public final SkylightFoldConfig foldConfig;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    public SkylightDataResponse() {
        this(null, System.currentTimeMillis(), null, null);
    }

    public final SkylightDataResponse copy(List<SkylightData> list, long j, LogPbBean logPbBean, SkylightFoldConfig skylightFoldConfig) {
        return new SkylightDataResponse(list, j, logPbBean, skylightFoldConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightDataResponse)) {
            return false;
        }
        SkylightDataResponse skylightDataResponse = (SkylightDataResponse) obj;
        return Intrinsics.LJFF(this.dataList, skylightDataResponse.dataList) && this.createTime == skylightDataResponse.createTime && Intrinsics.LJFF(this.logPb, skylightDataResponse.logPb) && Intrinsics.LJFF(this.foldConfig, skylightDataResponse.foldConfig);
    }

    public int hashCode() {
        List<SkylightData> list = this.dataList;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.createTime)) * 31;
        LogPbBean logPbBean = this.logPb;
        int iHashCode2 = (iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        SkylightFoldConfig skylightFoldConfig = this.foldConfig;
        return iHashCode2 + (skylightFoldConfig != null ? skylightFoldConfig.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightDataResponse(dataList=");
        sbLIZ.append(this.dataList);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", foldConfig=");
        sbLIZ.append(this.foldConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final List<SkylightData> getDataList() {
        return this.dataList;
    }

    public final SkylightFoldConfig getFoldConfig() {
        return this.foldConfig;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final void setDataList(List<SkylightData> list) {
        this.dataList = list;
    }

    public SkylightDataResponse(List<SkylightData> list, long j, LogPbBean logPbBean, SkylightFoldConfig skylightFoldConfig) {
        this.dataList = list;
        this.createTime = j;
        this.logPb = logPbBean;
        this.foldConfig = skylightFoldConfig;
    }
}
