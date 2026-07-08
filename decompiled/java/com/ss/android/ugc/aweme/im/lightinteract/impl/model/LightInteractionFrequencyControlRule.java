package com.ss.android.ugc.aweme.im.lightinteract.impl.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class LightInteractionFrequencyControlRule {

    @C09CT("enter_chat")
    public final Integer enterChat;

    @C09CT("exit_labels")
    public final List<String> exitLabels;

    @C09CT("message")
    public final Integer message;

    @C09CT("target_light_interactions")
    public final List<String> targetLightInteractions;

    @C09CT("time_delta")
    public final Long timeDelta;

    @C09CT("time_slot")
    public final List<Long> timeSlot;

    public LightInteractionFrequencyControlRule() {
        this(null, null, null, null, null, null);
    }

    public LightInteractionFrequencyControlRule(List<Long> list, Long l, List<String> list2, List<String> list3, Integer num, Integer num2) {
        this.timeSlot = list;
        this.timeDelta = l;
        this.targetLightInteractions = list2;
        this.exitLabels = list3;
        this.enterChat = num;
        this.message = num2;
    }
}
