package com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DMBotInteractOption implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("text")
    public final String text;

    public DMBotInteractOption() {
        this(null, null);
    }

    public DMBotInteractOption(Integer num, String str) {
        this.id = num;
        this.text = str;
    }
}
