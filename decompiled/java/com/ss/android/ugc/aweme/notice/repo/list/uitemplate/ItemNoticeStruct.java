package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes29.dex */
public final class ItemNoticeStruct {

    @C09CT("dark_mode_image_url")
    public final UrlModel darkModeImageUrl;

    @C09CT("image_url")
    public final UrlModel imageUrl;

    public ItemNoticeStruct() {
        this(null, null);
    }

    public ItemNoticeStruct(UrlModel urlModel, UrlModel urlModel2) {
        this.imageUrl = urlModel;
        this.darkModeImageUrl = urlModel2;
    }
}
