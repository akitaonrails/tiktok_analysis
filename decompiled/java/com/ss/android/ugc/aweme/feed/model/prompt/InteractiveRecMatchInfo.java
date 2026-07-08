package com.ss.android.ugc.aweme.feed.model.prompt;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class InteractiveRecMatchInfo implements Serializable {

    @C09CT("is_present")
    public boolean isPresent;

    @C09CT("no_present_reason")
    public int noPresentReason;

    @C09CT("interactive_rec_matched_instruction")
    public long instruction = -1;

    @C09CT("user_query")
    public String userQuery = "";

    public final long getInstruction() {
        return this.instruction;
    }

    public final int getNoPresentReason() {
        return this.noPresentReason;
    }

    public final String getUserQuery() {
        return this.userQuery;
    }

    public final boolean isPresent() {
        return this.isPresent;
    }
}
