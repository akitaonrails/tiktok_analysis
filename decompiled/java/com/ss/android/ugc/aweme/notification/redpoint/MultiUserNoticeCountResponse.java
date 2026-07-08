package com.ss.android.ugc.aweme.notification.redpoint;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MultiUserNoticeCountResponse extends BaseResponse {

    @C09CT("data")
    public List<NoticeList> noticeLists;

    public MultiUserNoticeCountResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiUserNoticeCountResponse) && Intrinsics.LJFF(this.noticeLists, ((MultiUserNoticeCountResponse) obj).noticeLists);
    }

    public final int hashCode() {
        List<NoticeList> list = this.noticeLists;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiUserNoticeCountResponse(noticeLists=");
        sbLIZ.append(this.noticeLists);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MultiUserNoticeCountResponse(List<NoticeList> list) {
        this.noticeLists = list;
    }
}
