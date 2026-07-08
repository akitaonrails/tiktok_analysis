package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RepostBubbleTiming implements Serializable {

    @C09CT("disable_client_frequency_control")
    public Boolean disableFrequencyControl;

    @C09CT("triggers")
    public List<RepostBubbleTriggerStruct> triggers;

    public RepostBubbleTiming() {
    }

    public RepostBubbleTiming(Boolean bool, List<RepostBubbleTriggerStruct> list) {
        this.disableFrequencyControl = bool;
        this.triggers = list;
    }
}
