package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CreateChannelContent {

    @C09CT("owner")
    public Player owner;

    @C09CT("owner_link_mic_id")
    public String ownerLinkMicId;

    @C09CT("owner_linker_session_id")
    public String ownerLinkerSessionId;

    public CreateChannelContent() {
        this(null, null, null);
    }

    public CreateChannelContent(Player player, String str, String str2) {
        this.owner = player;
        this.ownerLinkMicId = str;
        this.ownerLinkerSessionId = str2;
    }
}
