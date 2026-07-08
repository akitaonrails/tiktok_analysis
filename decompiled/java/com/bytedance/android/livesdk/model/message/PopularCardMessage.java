package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public class PopularCardMessage extends AbstractC1136060ffY {

    @C09CT("popular_card_info")
    public PopularCardInfo popularCardInfo;

    public static class PopularCardInfo {

        @C09CT("end_time")
        public long endTime;

        @C09CT("enter_number")
        public int enterNumber;

        @C09CT("startTime")
        public long startTime;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }

    public PopularCardMessage() {
        this.type = C001A.POPULAR_CARD_MESSAGE;
    }
}
