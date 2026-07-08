package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftMusicPermissionCheckResultBean {

    @C09CT("origin")
    public Aweme aweme;

    @C09CT("check_type")
    public int checkType;

    @C09CT("id_type")
    public int idType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("allow_current")
    public boolean allowCurrent = true;

    @C09CT("allow_origin")
    public boolean allowOrigin = true;

    @C09CT("reason")
    public String reason = "";
}
