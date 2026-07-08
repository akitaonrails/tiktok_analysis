package com.ss.android.ugc.aweme.relation;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.Friend;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ContactResponse extends BaseResponse {

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("registered_user")
    public final List<Friend> users;
}
