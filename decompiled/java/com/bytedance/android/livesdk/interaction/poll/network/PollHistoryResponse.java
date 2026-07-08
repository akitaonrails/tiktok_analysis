package com.bytedance.android.livesdk.interaction.poll.network;

import X.C09CT;
import com.bytedance.android.livesdk.model.PollData;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class PollHistoryResponse {

    @C09CT("all_poll_data")
    public final HashMap<Integer, PollData> allPollData;

    @C09CT("poll_data")
    public final PollData pollData;
}
