package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GameInteractionMultiSourceEvent {

    @C09CT("count")
    public int count;

    @C09CT("source_type")
    public int sourceType;

    @C09CT("interaction_id")
    public String interactionId = "";

    @C09CT("play_id")
    public String playId = "";

    @C09CT("trigger_avatar_url")
    public String triggerAvatarUrl = "";

    @C09CT("trigger_nick_name")
    public String triggerNickName = "";

    @C09CT("timestamp")
    public String timestamp = "";

    @C09CT("instruction")
    public String instruction = "";

    @C09CT("trigger_encrypted_id")
    public String triggerEncryptedId = "";
}
