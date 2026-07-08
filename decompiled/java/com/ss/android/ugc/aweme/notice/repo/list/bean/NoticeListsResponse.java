package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class NoticeListsResponse extends BaseResponse {
    public transient List<NoticeItems> collapseNotices;

    @C09CT("log_pb")
    public final LogPbBean lobPb;

    @C09CT("notice_lists")
    public List<NoticeItems> notices;

    @C09CT("unsubscribe_setting_metadata")
    public final UnsubscribeSettingMetadata unsubscribeSetting;

    public NoticeListsResponse() {
        this(null, null, null, null);
    }

    public final NoticeListsResponse copy(List<NoticeItems> list, List<NoticeItems> list2, LogPbBean logPbBean, UnsubscribeSettingMetadata unsubscribeSettingMetadata) {
        return new NoticeListsResponse(list, list2, logPbBean, unsubscribeSettingMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeListsResponse)) {
            return false;
        }
        NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
        return Intrinsics.LJFF(this.notices, noticeListsResponse.notices) && Intrinsics.LJFF(this.collapseNotices, noticeListsResponse.collapseNotices) && Intrinsics.LJFF(this.lobPb, noticeListsResponse.lobPb) && Intrinsics.LJFF(this.unsubscribeSetting, noticeListsResponse.unsubscribeSetting);
    }

    public int hashCode() {
        List<NoticeItems> list = this.notices;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NoticeItems> list2 = this.collapseNotices;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        LogPbBean logPbBean = this.lobPb;
        int iHashCode3 = (iHashCode2 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        UnsubscribeSettingMetadata unsubscribeSettingMetadata = this.unsubscribeSetting;
        return iHashCode3 + (unsubscribeSettingMetadata != null ? unsubscribeSettingMetadata.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeListsResponse(notices=");
        sbLIZ.append(this.notices);
        sbLIZ.append(", collapseNotices=");
        sbLIZ.append(this.collapseNotices);
        sbLIZ.append(", lobPb=");
        sbLIZ.append(this.lobPb);
        sbLIZ.append(", unsubscribeSetting=");
        sbLIZ.append(this.unsubscribeSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<NoticeItems> getCollapseNotices() {
        return this.collapseNotices;
    }

    public final LogPbBean getLobPb() {
        return this.lobPb;
    }

    public final List<NoticeItems> getNotices() {
        return this.notices;
    }

    public final UnsubscribeSettingMetadata getUnsubscribeSetting() {
        return this.unsubscribeSetting;
    }

    public final void setCollapseNotices(List<NoticeItems> list) {
        this.collapseNotices = list;
    }

    public final void setNotices(List<NoticeItems> list) {
        this.notices = list;
    }

    public NoticeListsResponse(List<NoticeItems> list, List<NoticeItems> list2, LogPbBean logPbBean, UnsubscribeSettingMetadata unsubscribeSettingMetadata) {
        this.notices = list;
        this.collapseNotices = list2;
        this.lobPb = logPbBean;
        this.unsubscribeSetting = unsubscribeSettingMetadata;
    }
}
