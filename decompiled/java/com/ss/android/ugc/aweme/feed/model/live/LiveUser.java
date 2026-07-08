package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public class LiveUser implements Serializable, Cloneable {

    @C09CT("authentication_info")
    public LiveAuthenticationInfo authenticationInfo;

    @C09CT("avatar_large")
    public UrlModel avatarLarger;

    @C09CT("avatar_medium")
    public UrlModel avatarMedium;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("follow_info")
    public FollowInfo followInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("nickname")
    public String nickname;

    @C09CT("scm_label")
    public String scmLabel;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("secret")
    public int secret;

    @C09CT("short_id")
    public long shortId;

    @C09CT("display_id")
    public String uniqueId;

    public String getSecUid() {
        return this.secUid;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }
}
