package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class DailyChallengesLiveCardMessage extends AbstractC1136060ffY {

    @C09CT("message")
    public String message;

    @C09CT("season")
    public long season;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public DailyChallengesLiveCardMessage() {
        this.type = C001A.DAILY_CHALLENGES_LIVE_CARD_MESSAGE;
        this.message = "";
    }
}
