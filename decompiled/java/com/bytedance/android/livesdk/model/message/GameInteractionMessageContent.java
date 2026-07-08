package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GameInteractionMessageContent {

    @C09CT("interaction_event")
    public GameInteractionEvent interactionEvent;

    @C09CT("status_event")
    public GameStatusEvent statusEvent;

    @C09CT("user_id")
    public long userId;
}
