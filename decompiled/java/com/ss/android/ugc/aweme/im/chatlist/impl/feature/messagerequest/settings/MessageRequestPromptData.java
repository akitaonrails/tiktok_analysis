package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestPromptData {

    @C09CT("days")
    public final Integer days;

    @C09CT("is_enable")
    public final Boolean isEnable;

    @C09CT("leave_times")
    public final Integer leaveTimes;

    @C09CT("rounds")
    public final Integer rounds;

    @C09CT("popup_timing")
    public final Integer timing;

    public MessageRequestPromptData() {
        this(Boolean.FALSE, 0, 0, 0, 0);
    }

    public MessageRequestPromptData(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.isEnable = bool;
        this.timing = num;
        this.days = num2;
        this.rounds = num3;
        this.leaveTimes = num4;
    }
}
