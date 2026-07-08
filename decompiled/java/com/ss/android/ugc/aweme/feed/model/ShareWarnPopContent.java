package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareWarnPopContent implements Serializable {

    @C09CT("is_list_item")
    public final boolean isListItem;

    @C09CT("text")
    public final TextWithInlineLink linkText;

    public final boolean isListItem() {
        return this.isListItem;
    }

    public ShareWarnPopContent(TextWithInlineLink textWithInlineLink, boolean z) {
        this.linkText = textWithInlineLink;
        this.isListItem = z;
    }
}
