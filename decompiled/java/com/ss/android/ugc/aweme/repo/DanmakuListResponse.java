package com.ss.android.ugc.aweme.repo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuListResponse extends BaseResponse {

    @C09CT("danmaku_list")
    public final List<DanmakuStruct> data;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("start_time")
    public final long startTime;

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status_code:");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", start:");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", end:");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", cnt:");
        List<DanmakuStruct> list = this.data;
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<DanmakuStruct> getData() {
        return this.data;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }
}
