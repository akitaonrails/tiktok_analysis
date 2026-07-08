package com.ss.android.ugc.aweme.im.b2c.event;

import X.C09CT;
import com.ss.android.ugc.aweme.im.b2c.platformization.ConvContext;

/* JADX INFO: loaded from: classes3.dex */
public final class B2CEventRequestBody {

    @C09CT("chat_event_type")
    public final int chatEventType;

    @C09CT("conv_ctx")
    public final ConvContext context;

    @C09CT("conv_type")
    public final String convType;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("extra")
    public final String extra;

    @C09CT("inbox_type")
    public final String inboxType;

    public B2CEventRequestBody(ConvContext convContext, int i, String str, String str2, String str3, String str4) {
        this.context = convContext;
        this.chatEventType = i;
        this.extra = str;
        this.conversationId = str2;
        this.convType = str3;
        this.inboxType = str4;
    }
}
