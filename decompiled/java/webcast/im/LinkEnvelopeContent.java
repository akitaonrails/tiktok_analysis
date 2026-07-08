package webcast.im;

import X.C09CT;
import tikcast.linkmic.common.LinkEnvelopeMessagePayload;
import tikcast.linkmic.common.LinkUserIdentity;

/* JADX INFO: loaded from: classes.dex */
public final class LinkEnvelopeContent {

    @C09CT("message_payload")
    public LinkEnvelopeMessagePayload messagePayload;

    @C09CT("receiver")
    public LinkUserIdentity receiver;

    @C09CT("sender")
    public LinkUserIdentity sender;
}
