package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes17.dex */
public final class AvatarDeco {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("image")
    public UrlModel image;

    @C09CT("name")
    public String name;
}
