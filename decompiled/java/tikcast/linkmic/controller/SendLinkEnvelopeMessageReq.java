package tikcast.linkmic.controller;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LinkEnvelopeMessagePayload;
import tikcast.linkmic.common.LinkUserIdentity;

/* JADX INFO: loaded from: classes.dex */
public final class SendLinkEnvelopeMessageReq {

    @C09CT("common")
    public LinkCommon common;

    @C09CT("message_payload")
    public LinkEnvelopeMessagePayload messagePayload;

    @C09CT("myself")
    public LinkUserIdentity myself;

    @C09CT("target")
    public List<LinkUserIdentity> target = new ArrayList();
}
