package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class AvatarDecoration implements Serializable, Cloneable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("name")
    public String name;

    @C09CT("source_url")
    public UrlModel sourceUrl;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }
}
