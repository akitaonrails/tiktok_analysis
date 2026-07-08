package com.ss.android.ugc.aweme.notice.api.open;

import X.C1EIC;

/* JADX INFO: loaded from: classes36.dex */
public interface INoticeCountModule {
    int getUnreadNoticeDotCount();

    void registerChangeListener(C1EIC c1eic);

    void release();
}
