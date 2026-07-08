package com.ss.android.ugc.aweme.story.note.prompt;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class SocialConfigValue implements Serializable {
    public static final int $stable = 8;

    @C09CT("thoughts_config")
    public final FriendInteractionSettings thoughtsConfig;

    public SocialConfigValue() {
        this(null);
    }

    public SocialConfigValue(FriendInteractionSettings friendInteractionSettings) {
        this.thoughtsConfig = friendInteractionSettings;
    }
}
