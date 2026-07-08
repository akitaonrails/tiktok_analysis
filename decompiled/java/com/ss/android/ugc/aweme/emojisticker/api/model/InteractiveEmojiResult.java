package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class InteractiveEmojiResult implements Serializable {

    @C09CT("user")
    public final User user;

    public InteractiveEmojiResult() {
        this(null);
    }

    public InteractiveEmojiResult(User user) {
        this.user = user;
    }
}
