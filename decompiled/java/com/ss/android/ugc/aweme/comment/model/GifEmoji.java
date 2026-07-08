package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class GifEmoji implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id = "";

    @C09CT("image_id")
    public final long imageId;
    public LogPbBean logPb;

    @C09CT("origin")
    public final UrlModel origin;

    @C09CT("stcker_type")
    public final int stickerType;

    @C09CT("thumbnail")
    public final UrlModel thumbnail;

    public final String getId() {
        return this.id;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final UrlModel getOrigin() {
        return this.origin;
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }
}
