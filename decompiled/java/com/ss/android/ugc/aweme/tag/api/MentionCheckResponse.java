package com.ss.android.ugc.aweme.tag.api;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionCheckResponse extends BaseResponse {

    @C09CT("ba_uids")
    public ArrayList<String> baUidList;

    @C09CT("block_results")
    public ArrayList<MentionCheckResult> blockResults;
}
