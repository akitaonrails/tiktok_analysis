package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CategoryCoverStruct implements Serializable {
    public static final long serialVersionUID = 1;

    @C09CT("aweme_id")
    public String awemeId;

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("dynamic_cover")
    public UrlModel dynamicCover;

    public String getAwemeId() {
        return this.awemeId;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }
}
