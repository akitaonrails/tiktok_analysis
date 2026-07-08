package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveMessage {
    public static final int $stable = 8;

    @C09CT("live_message")
    public final List<CombineLiveNotice> liveNotice;

    public LiveMessage() {
        this(null);
    }

    public LiveMessage(List<CombineLiveNotice> list) {
        this.liveNotice = list;
    }
}
