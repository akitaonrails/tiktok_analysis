package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentGiftStruct implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("image")
    public final UrlModel image;

    public final long getId() {
        return this.id;
    }

    public final UrlModel getImage() {
        return this.image;
    }
}
