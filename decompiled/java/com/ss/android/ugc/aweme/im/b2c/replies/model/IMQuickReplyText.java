package com.ss.android.ugc.aweme.im.b2c.replies.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IMQuickReplyText {

    @C09CT("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMQuickReplyText) && Intrinsics.LJFF(this.text, ((IMQuickReplyText) obj).text);
    }

    public IMQuickReplyText() {
        this("");
    }

    public IMQuickReplyText(String str) {
        this.text = str;
    }
}
