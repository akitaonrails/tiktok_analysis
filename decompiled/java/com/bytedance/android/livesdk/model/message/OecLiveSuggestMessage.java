package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveSuggestMessage extends AbstractC1136060ffY {

    @C09CT("description")
    public String description;

    @C09CT("message_type")
    public int messageType;

    @C09CT("suggestion_id")
    public String suggestionId;

    public OecLiveSuggestMessage() {
        this.type = C001A.OEC_LIVE_SUGGEST_MESSAGE;
        this.description = "";
        this.suggestionId = "";
    }
}
