package webcast.api.interaction;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class GetCommentStatsSummaryRequest {

    @C09CT("identity_type")
    public int identityType;

    @C09CT("page_num")
    public long pageNum;

    @C09CT("page_size")
    public long pageSize;

    @C09CT("room_id")
    public long roomId;

    @C09CT("with_ai_summary")
    public boolean withAiSummary;

    @C09CT("with_all_identity_type")
    public boolean withAllIdentityType;
}
