package com.ss.android.ugc.aweme.tag.api;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionRecentContactResponse extends BaseResponse {

    @C09CT("block_results")
    public ArrayList<MentionCheckResult> blockResults;

    @C09CT("user_list")
    public ArrayList<User> userList;
}
