package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchResponse extends BaseResponse {

    @C09CT("cursor")
    public final String cursor;

    @C09CT("has_more")
    public final Integer has_more;

    @C09CT("log_pb")
    public final LogPbBean lobPb;

    @C09CT("notice_list")
    public List<? extends MusNotice> notices;

    @C09CT("total")
    public final Integer total;

    public InboxSearchResponse() {
        this(null, null, 0, null, null);
    }

    public final InboxSearchResponse copy(List<? extends MusNotice> list, String str, Integer num, Integer num2, LogPbBean logPbBean) {
        return new InboxSearchResponse(list, str, num, num2, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxSearchResponse)) {
            return false;
        }
        InboxSearchResponse inboxSearchResponse = (InboxSearchResponse) obj;
        return Intrinsics.LJFF(this.notices, inboxSearchResponse.notices) && Intrinsics.LJFF(this.cursor, inboxSearchResponse.cursor) && Intrinsics.LJFF(this.total, inboxSearchResponse.total) && Intrinsics.LJFF(this.has_more, inboxSearchResponse.has_more) && Intrinsics.LJFF(this.lobPb, inboxSearchResponse.lobPb);
    }

    public int hashCode() {
        List<? extends MusNotice> list = this.notices;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.cursor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.total;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.has_more;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        LogPbBean logPbBean = this.lobPb;
        return iHashCode4 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSearchResponse(notices=");
        sbLIZ.append(this.notices);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", has_more=");
        sbLIZ.append(this.has_more);
        sbLIZ.append(", lobPb=");
        sbLIZ.append(this.lobPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getHas_more() {
        return this.has_more;
    }

    public final LogPbBean getLobPb() {
        return this.lobPb;
    }

    public final List<MusNotice> getNotices() {
        return this.notices;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final void setNotices(List<? extends MusNotice> list) {
        this.notices = list;
    }

    public InboxSearchResponse(List<? extends MusNotice> list, String str, Integer num, Integer num2, LogPbBean logPbBean) {
        this.notices = list;
        this.cursor = str;
        this.total = num;
        this.has_more = num2;
        this.lobPb = logPbBean;
    }
}
