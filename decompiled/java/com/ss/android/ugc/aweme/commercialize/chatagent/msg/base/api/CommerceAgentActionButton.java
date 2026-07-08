package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentActionButton implements Serializable {

    @C09CT("action_data")
    public final String actionData;

    @C09CT("action_type")
    public final String actionType;

    public CommerceAgentActionButton() {
        this(null, null);
    }

    public CommerceAgentActionButton(String str, String str2) {
        this.actionType = str;
        this.actionData = str2;
    }
}
