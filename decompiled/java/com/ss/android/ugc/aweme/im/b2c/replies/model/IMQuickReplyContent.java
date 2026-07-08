package com.ss.android.ugc.aweme.im.b2c.replies.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IMQuickReplyContent {

    @C09CT("text")
    public final IMQuickReplyText text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMQuickReplyContent) && Intrinsics.LJFF(this.text, ((IMQuickReplyContent) obj).text);
    }

    public IMQuickReplyContent() {
        this(new IMQuickReplyText(""));
    }

    public IMQuickReplyContent(IMQuickReplyText iMQuickReplyText) {
        this.text = iMQuickReplyText;
    }
}
