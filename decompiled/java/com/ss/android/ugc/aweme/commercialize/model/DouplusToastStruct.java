package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class DouplusToastStruct implements Serializable {

    @C09CT("content")
    public String content;

    @C09CT("content_id")
    public long contentId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("redirect_url")
    public String redirectUrl;

    @C09CT("toast")
    public int type;
}
