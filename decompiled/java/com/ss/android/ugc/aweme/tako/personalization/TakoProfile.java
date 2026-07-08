package com.ss.android.ugc.aweme.tako.personalization;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoProfile {

    @C09CT("interaction_history")
    public final List<TakoInteractMessageSignal> interactionHistory;

    @C09CT("staytime_history")
    public final List<TakoMessageStaytimeSignal> stayHistory;

    @C09CT("watch_history")
    public final List<AwemeConsumeSignal> watchHistory;

    public TakoProfile() {
        this(null, null, null);
    }

    public TakoProfile(List<TakoInteractMessageSignal> list, List<AwemeConsumeSignal> list2, List<TakoMessageStaytimeSignal> list3) {
        this.interactionHistory = list;
        this.watchHistory = list2;
        this.stayHistory = list3;
    }
}
