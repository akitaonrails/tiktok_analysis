package com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DMBotInteraction implements Serializable {

    @C09CT("options")
    public final List<DMBotInteractOption> options;

    @C09CT("type")
    public final Integer type;

    public DMBotInteraction() {
        this(null, null);
    }

    public DMBotInteraction(Integer num, List<DMBotInteractOption> list) {
        this.type = num;
        this.options = list;
    }
}
