package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionRecentContactResponse extends BaseResponse {

    @C09CT("block_results")
    public final List<MentionCheckResult> blockResults;

    @C09CT("user_list")
    public final List<User> users;

    public MentionRecentContactResponse() {
        C13BV c13bv = C13BV.INSTANCE;
        this.users = c13bv;
        this.blockResults = c13bv;
    }
}
