package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StageReactionMessage extends AbstractC1136060ffY {

    @C09CT("reaction_id")
    public List<String> reactionId;

    @C09CT("sender_user_id")
    public long senderUserId;

    @C09CT("show_time_ms")
    public long showTimeMs;

    @C09CT("to_user_id")
    public List<Long> toUserId;

    public StageReactionMessage() {
        this.type = C001A.STAGE_REACTION_MESSAGE;
        this.toUserId = new ArrayList();
        this.reactionId = new ArrayList();
    }
}
