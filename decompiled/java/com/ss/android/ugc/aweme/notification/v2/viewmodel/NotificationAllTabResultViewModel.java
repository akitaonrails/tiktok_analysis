package com.ss.android.ugc.aweme.notification.v2.viewmodel;

import X.C1866790yg9;
import X.C1889530zGp;
import X.C1900960zZG;
import X.C1901130zZX;
import X.C1904270zeb;
import X.C2188811AlT;
import X.EnumC1599580rjA;
import X.EnumC1900750zYv;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationAllTabResultViewModel extends NotificationResultViewModel {
    public final int LLJIJIL;

    public NotificationAllTabResultViewModel() {
        int i = C1904270zeb.LIZ;
        this.LLJIJIL = C1904270zeb.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel
    public final int getGroupType() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationResultViewModel, com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel
    public final void BQ2(EnumC1599580rjA enumC1599580rjA) throws JSONException {
        EnumC1900750zYv enumC1900750zYv;
        NoticeListsResponse noticeListsResponseLIZJ;
        List<NoticeItems> notices;
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String str = (String) this.LLILLL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("all tab onRefresh(), from = ");
        sbLIZ.append(enumC1599580rjA.getDetail());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ(str, strLIZIZ);
        if (Intrinsics.LJFF(enumC1599580rjA.getDetail(), "first_refresh")) {
            enumC1900750zYv = EnumC1900750zYv.FIRST_REFRESH;
        } else {
            enumC1900750zYv = EnumC1900750zYv.REFRESH;
        }
        if (enumC1900750zYv == EnumC1900750zYv.FIRST_REFRESH && ((Number) C1866790yg9.LIZ.getValue()).intValue() >= 1) {
            C1901130zZX c1901130zZX = C1901130zZX.LIZJ;
            synchronized (c1901130zZX) {
                C1900960zZG c1900960zZGLJ = c1901130zZX.LJ();
                noticeListsResponseLIZJ = null;
                if (c1900960zZGLJ != null) {
                    noticeListsResponseLIZJ = c1900960zZGLJ.LIZJ();
                }
            }
            NoticeListsResponse noticeListsResponse = noticeListsResponseLIZJ;
            if (noticeListsResponse != null && (notices = noticeListsResponse.getNotices()) != null && !notices.isEmpty()) {
                EQ2(noticeListsResponse, EnumC1900750zYv.PRELOAD);
                EnumC1599580rjA enumC1599580rjA2 = EnumC1599580rjA.PULL_TO_REFRESH;
                enumC1599580rjA2.setDetail("first_refresh_after_preload");
                super.BQ2(enumC1599580rjA2);
            }
        }
        super.BQ2(enumC1599580rjA);
    }
}
