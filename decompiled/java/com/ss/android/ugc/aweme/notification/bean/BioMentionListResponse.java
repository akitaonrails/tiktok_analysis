package com.ss.android.ugc.aweme.notification.bean;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BioMentionListResponse extends BaseResponse {

    @C09CT("user_list")
    public final List<User> users = C13BV.INSTANCE;
}
