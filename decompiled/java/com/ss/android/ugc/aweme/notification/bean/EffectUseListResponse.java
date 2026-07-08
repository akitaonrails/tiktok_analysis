package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EffectUseListResponse extends BaseResponse {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("min_cursor")
    public long minCursor;

    @C09CT("notice_infos")
    public List<NoticeInfo> noticeInfoList;

    @C09CT("total")
    public int total;

    public EffectUseListResponse() {
        this(0, 0L, 0L, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectUseListResponse)) {
            return false;
        }
        EffectUseListResponse effectUseListResponse = (EffectUseListResponse) obj;
        return this.total == effectUseListResponse.total && this.maxCursor == effectUseListResponse.maxCursor && this.minCursor == effectUseListResponse.minCursor && this.hasMore == effectUseListResponse.hasMore && Intrinsics.LJFF(this.noticeInfoList, effectUseListResponse.noticeInfoList);
    }

    public final int hashCode() {
        int iY2 = ((((((this.total * 31) + C786410Ut5.Y2(this.maxCursor)) * 31) + C786410Ut5.Y2(this.minCursor)) * 31) + C786410Ut5.Z2(this.hasMore)) * 31;
        List<NoticeInfo> list = this.noticeInfoList;
        return iY2 + (list == null ? 0 : list.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectUseListResponse(total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", maxCursor=");
        sbLIZ.append(this.maxCursor);
        sbLIZ.append(", minCursor=");
        sbLIZ.append(this.minCursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", noticeInfoList=");
        sbLIZ.append(this.noticeInfoList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EffectUseListResponse(int i, long j, long j2, boolean z, List<NoticeInfo> list) {
        this.total = i;
        this.maxCursor = j;
        this.minCursor = j2;
        this.hasMore = z;
        this.noticeInfoList = list;
    }
}
