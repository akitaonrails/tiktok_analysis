package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendAwemeItem implements Serializable {

    @C09CT("aweme_id")
    public String aid;

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("dynamic_cover")
    public UrlModel dynamicCover;

    @C09CT("media_type")
    public String mediaType;

    public String getAid() {
        return this.aid;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setMediaType(String str) {
        this.mediaType = str;
    }
}
