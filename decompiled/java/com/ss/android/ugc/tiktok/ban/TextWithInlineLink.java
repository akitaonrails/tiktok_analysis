package com.ss.android.ugc.tiktok.ban;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class TextWithInlineLink implements Serializable {

    @C09CT("links")
    public final List<InlineLink> links;

    @C09CT("text")
    public final String text;

    public TextWithInlineLink() {
        this(null, null, 3, null);
    }

    public TextWithInlineLink(String str, List<InlineLink> list) {
        this.text = str;
        this.links = list;
    }

    public TextWithInlineLink(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
