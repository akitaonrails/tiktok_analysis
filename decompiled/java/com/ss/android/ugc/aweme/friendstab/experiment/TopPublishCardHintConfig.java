package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TopPublishCardHintConfig {

    @C09CT("tt_friends_top_publish_card_hint_text")
    public final String content;

    @C09CT("tt_friends_top_publish_card_hint_enable")
    public final boolean enable;

    public TopPublishCardHintConfig() {
        this(false, "");
    }

    public TopPublishCardHintConfig(boolean z, String str) {
        this.enable = z;
        this.content = str;
    }
}
