package com.ss.android.ugc.aweme.request_combine.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeCountCombineModel extends BaseCombineMode {

    @C09CT("body")
    public NoticeList noticeList;

    public final NoticeCountCombineModel copy(NoticeList noticeList) {
        return new NoticeCountCombineModel(noticeList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NoticeCountCombineModel) && Intrinsics.LJFF(this.noticeList, ((NoticeCountCombineModel) obj).noticeList);
    }

    public int hashCode() {
        return this.noticeList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeCountCombineModel(noticeList=");
        sbLIZ.append(this.noticeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final NoticeList getNoticeList() {
        return this.noticeList;
    }

    public NoticeCountCombineModel(NoticeList noticeList) {
        this.noticeList = noticeList;
    }

    public final void setNoticeList(NoticeList noticeList) {
        this.noticeList = noticeList;
    }
}
