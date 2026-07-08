package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes21.dex */
public final class ModalInfo {

    @C09CT("image")
    public final UrlModel image;

    @C09CT("message_key")
    public final String messageKey;

    @C09CT("title_key")
    public final String titleKey;

    public ModalInfo(UrlModel urlModel, String str, String str2) {
        this.image = urlModel;
        this.messageKey = str;
        this.titleKey = str2;
    }
}
