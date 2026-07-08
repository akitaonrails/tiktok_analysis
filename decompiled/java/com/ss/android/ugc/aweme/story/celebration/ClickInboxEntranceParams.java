package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class ClickInboxEntranceParams implements Serializable {
    public static final int $stable = 0;

    @C09CT("click_expire_nature_days")
    public final int clickExpireNatureDays;

    public ClickInboxEntranceParams() {
        this(0);
    }

    public ClickInboxEntranceParams(int i) {
        this.clickExpireNatureDays = i;
    }
}
