package com.bytedance.android.livesdk.interaction.poll.network;

import X.C09CT;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;

/* JADX INFO: loaded from: classes18.dex */
public final class StartPollResponse {

    @C09CT("end_time")
    public final long endTime;

    @C09CT("sei")
    public LiveMessageSEI liveMessageSEI;

    @C09CT("poll_id")
    public final long pollId;
}
