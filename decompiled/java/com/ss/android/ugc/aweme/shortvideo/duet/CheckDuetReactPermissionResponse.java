package com.ss.android.ugc.aweme.shortvideo.duet;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes9.dex */
public final class CheckDuetReactPermissionResponse extends BaseResponse {

    @C09CT("origin")
    public Aweme aweme;

    @C09CT("allow_current")
    public boolean allowCurrent = true;

    @C09CT("allow_origin")
    public boolean allowOrigin = true;

    @C09CT("reason")
    public String reason = "";
}
