package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentTopBarIcon implements Serializable {

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("is_local")
    public Boolean isLocal;
    public transient Drawable localResDrawable;

    @C09CT("local_type")
    public Integer localType;

    @C09CT("margin")
    public CommentTopBarMargin margin;

    @C09CT("padding")
    public CommentTopBarPadding padding;

    @C09CT("style")
    public CommentTopBarIconStyle style;

    public CommentTopBarIcon() {
        this(null, null, null, null, null, null, null);
    }

    public final Boolean isLocal() {
        return this.isLocal;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setLocal(Boolean bool) {
        this.isLocal = bool;
    }

    public final void setLocalResDrawable(Drawable drawable) {
        this.localResDrawable = drawable;
    }

    public final void setLocalType(Integer num) {
        this.localType = num;
    }

    public final void setMargin(CommentTopBarMargin commentTopBarMargin) {
        this.margin = commentTopBarMargin;
    }

    public final void setPadding(CommentTopBarPadding commentTopBarPadding) {
        this.padding = commentTopBarPadding;
    }

    public final void setStyle(CommentTopBarIconStyle commentTopBarIconStyle) {
        this.style = commentTopBarIconStyle;
    }

    public CommentTopBarIcon(UrlModel urlModel, CommentTopBarIconStyle commentTopBarIconStyle, CommentTopBarMargin commentTopBarMargin, CommentTopBarPadding commentTopBarPadding, Boolean bool, Integer num, Drawable drawable) {
        this.iconUrl = urlModel;
        this.style = commentTopBarIconStyle;
        this.margin = commentTopBarMargin;
        this.padding = commentTopBarPadding;
        this.isLocal = bool;
        this.localType = num;
        this.localResDrawable = drawable;
    }
}
