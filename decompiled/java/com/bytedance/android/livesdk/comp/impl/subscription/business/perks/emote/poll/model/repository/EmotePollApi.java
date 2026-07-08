package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.model.repository;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import webcast.api.sub.EmotePollCreateRequest;
import webcast.api.sub.EmotePollCreateResponse;
import webcast.api.sub.EmotePollEndRequest;
import webcast.api.sub.EmotePollEndResponse;
import webcast.api.sub.EmotePollInfoResponse;
import webcast.api.sub.EmotePollVoteRequest;
import webcast.api.sub.EmotePollVoteResponse;
import webcast.api.sub.UserEmotePollOptionsResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface EmotePollApi {
    @InterfaceC1501170pAR("/webcast/sub/privilege/emote_poll/create/")
    C11NZ<C470590Icr<EmotePollCreateResponse.Data>> emotePollCreate(@InterfaceC1485405rg EmotePollCreateRequest emotePollCreateRequest);

    @InterfaceC1501170pAR("/webcast/sub/privilege/emote_poll/end/")
    C11NZ<C470590Icr<EmotePollEndResponse.Data>> emotePollEnd(@InterfaceC1485405rg EmotePollEndRequest emotePollEndRequest);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/emote_poll/info/")
    C11NZ<C470590Icr<EmotePollInfoResponse.Data>> emotePollInfo(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("poll_id") long j2, @InterfaceC1501070pAH("sec_anchor_id") String str);

    @InterfaceC1501160pAQ("/webcast/sub/privilege/user_emote/poll_options/")
    C11NZ<C470590Icr<UserEmotePollOptionsResponse.Data>> emotePollOptions(@InterfaceC1501070pAH("sec_anchor_id") String str, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("limit") long j2);

    @InterfaceC1501170pAR("/webcast/sub/privilege/emote_poll/vote/")
    C11NZ<C470590Icr<EmotePollVoteResponse.Data>> emotePollVote(@InterfaceC1485405rg EmotePollVoteRequest emotePollVoteRequest);
}
