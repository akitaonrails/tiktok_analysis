package com.ss.android.ugc.aweme.notification.open.component.cell;

import X.C1901800zac;
import X.C1901810zad;
import X.C1907040zj4;
import android.view.View;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeTemplateCell extends BaseNoticeCell<C1901800zac, MTTemplateNotificationHolder> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.aaj;
    }

    @Override // com.ss.android.ugc.aweme.notification.open.component.cell.BaseNoticeCell
    public final void I5(C1901810zad c1901810zad) {
        MTTemplateNotificationHolder mTTemplateNotificationHolder = this.LLILZ;
        if (mTTemplateNotificationHolder == null) {
            mTTemplateNotificationHolder = null;
        }
        MusNotice musNotice = c1901810zad.LL;
        String str = (String) this.LLILLJJLI.getValue();
        String str2 = (String) this.LL.getValue();
        MTTemplateNotificationHolder.P5(mTTemplateNotificationHolder, musNotice, getLayoutPosition(), "", str, str2, false, C1907040zj4.LIZ(c1901810zad.LL.type), this.LLILLL, (String) this.LL.getValue(), null, null, null, 7296);
    }

    @Override // com.ss.android.ugc.aweme.notification.open.component.cell.BaseNoticeCell
    public final MTTemplateNotificationHolder L5(View view) {
        return new MTTemplateNotificationHolder(view, null);
    }
}
