package webcast.data.cohost_biz;

import X.C09CT;
import tikcast.linkmic.common.CohostStreamConfig;

/* JADX INFO: loaded from: classes.dex */
public final class BizJoinGroupParams {

    @C09CT("check_perception_center")
    public boolean checkPerceptionCenter;

    @C09CT("need_withdraw")
    public boolean needWithdraw;

    @C09CT("source_type")
    public int sourceType;

    @C09CT("stream_config")
    public CohostStreamConfig streamConfig;

    @C09CT("tag_type")
    public int tagType;

    @C09CT("tag_value")
    public String tagValue = "";

    @C09CT("algo_request_id")
    public String algoRequestId = "";
}
