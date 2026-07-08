package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMessageStaytimeSignal {

    @C09CT("message_id")
    public final String messageId;

    @C09CT("duration")
    public final long stayTime;

    public TakoMessageStaytimeSignal() {
        this("", 0L);
    }

    public TakoMessageStaytimeSignal(String str, long j) {
        this.messageId = str;
        this.stayTime = j;
    }
}
