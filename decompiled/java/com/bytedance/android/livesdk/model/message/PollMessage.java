package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PollMessage extends AbstractC1136060ffY {

    @C09CT("end_content")
    public PollEndContent endContent;

    @C09CT("message_type")
    public long messageType;

    @C09CT("poll_basic_info")
    public PollBasicInfo pollBasicInfo;

    @C09CT("poll_id")
    public long pollId;

    @C09CT("poll_kind")
    public Integer pollKind;

    @C09CT("start_content")
    public PollStartContent startContent;

    @C09CT("template_content")
    public TemplateContent templateContent;

    @C09CT("update_votes_content")
    public PollUpdateVotesContent updateContent;

    public PollMessage() {
        this.type = C001A.LIVE_POLL_MESSAGE;
        this.pollKind = 0;
    }
}
