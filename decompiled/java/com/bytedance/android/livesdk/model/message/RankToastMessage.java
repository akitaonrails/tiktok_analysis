package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class RankToastMessage extends AbstractC1136060ffY {

    @C09CT("toast")
    public RankToast toast;

    public static class RankToast {

        @C09CT("should_toast")
        public boolean shouldToast;

        @C09CT("user_id")
        public long userId;
    }

    public RankToastMessage() {
        this.type = C001A.RANK_TOAST_MESSAGE;
    }
}
