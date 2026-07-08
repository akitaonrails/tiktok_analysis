package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskPopText implements Serializable {

    @C09CT("is_list_item")
    public boolean isListItem;

    @C09CT("text")
    public TextWithInlineLink linkText;

    public MaskPopText() {
    }

    public final boolean isListItem() {
        return this.isListItem;
    }

    public MaskPopText(TextWithInlineLink textWithInlineLink, boolean z) {
        this.linkText = textWithInlineLink;
        this.isListItem = z;
    }
}
