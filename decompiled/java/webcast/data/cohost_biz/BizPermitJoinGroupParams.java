package webcast.data.cohost_biz;

import X.C09CT;
import tikcast.linkmic.common.CohostStreamConfig;

/* JADX INFO: loaded from: classes.dex */
public final class BizPermitJoinGroupParams {

    @C09CT("algo_request_id")
    public String algoRequestId = "";

    @C09CT("matched_preference_tag")
    public int matchedPreferenceTag;

    @C09CT("reply_status")
    public int replyStatus;

    @C09CT("source_type")
    public int sourceType;

    @C09CT("stream_config")
    public CohostStreamConfig streamConfig;
}
