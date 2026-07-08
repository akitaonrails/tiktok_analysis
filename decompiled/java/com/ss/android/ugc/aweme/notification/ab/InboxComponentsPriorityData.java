package com.ss.android.ugc.aweme.notification.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxComponentsPriorityData {
    public static final int $stable = 8;

    @C09CT("inbox_banner")
    public final List<ComponentData> bannerComponentsData;

    public InboxComponentsPriorityData() {
        this(null);
    }

    public InboxComponentsPriorityData(List<ComponentData> list) {
        this.bannerComponentsData = list;
    }
}
