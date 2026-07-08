package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes29.dex */
public final class EmojiSliderResultEntry {

    @C09CT("user")
    public final User user;

    @C09CT("percentage_value")
    public final Integer voteVal;

    public EmojiSliderResultEntry() {
        this(null, null);
    }

    public EmojiSliderResultEntry(User user, Integer num) {
        this.user = user;
        this.voteVal = num;
    }
}
