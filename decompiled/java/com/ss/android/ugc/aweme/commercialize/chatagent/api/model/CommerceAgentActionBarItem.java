package com.ss.android.ugc.aweme.commercialize.chatagent.api.model;

import X.C09CT;
import X.C1076980e8G;
import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentActionBarItem implements Serializable {
    public static final C1076980e8G Companion = new Object() { // from class: X.0e8G
    };

    @C09CT("action_desc")
    public final String actionDesc;

    @C09CT("welecome_text")
    public final String description;

    @C09CT("emoji")
    public final String emoji;

    @C09CT("hint_tip_enter")
    public final String enterHint;

    @C09CT("hint_tip_exit")
    public final String exitHint;

    @C09CT("hint")
    public final CommerceAgentHint hint;

    @C09CT("action_id")
    public final long id;

    @C09CT("action_name")
    public String name;

    @C09CT("action_type")
    public final String type;

    public CommerceAgentActionBarItem() {
        this(0L, "", "", "", "", "", "", "", null);
    }

    public final void setName(String str) {
        this.name = str;
    }

    public CommerceAgentActionBarItem(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, CommerceAgentHint commerceAgentHint) {
        this.id = j;
        this.name = str;
        this.type = str2;
        this.emoji = str3;
        this.enterHint = str4;
        this.exitHint = str5;
        this.description = str6;
        this.actionDesc = str7;
        this.hint = commerceAgentHint;
    }
}
