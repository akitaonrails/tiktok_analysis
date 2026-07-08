package com.ss.android.ugc.aweme.compliance.api.services.consent.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class TextWithInlineLink implements Serializable {
    public static final int $stable = 8;

    @C09CT("links")
    public final List<InlineLink> links;

    @C09CT("text")
    public final String text;

    public TextWithInlineLink() {
        this(null, null);
    }

    public final TextWithInlineLink copy(String str, List<InlineLink> list) {
        return new TextWithInlineLink(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithInlineLink)) {
            return false;
        }
        TextWithInlineLink textWithInlineLink = (TextWithInlineLink) obj;
        return Intrinsics.LJFF(this.text, textWithInlineLink.text) && Intrinsics.LJFF(this.links, textWithInlineLink.links);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<InlineLink> list = this.links;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextWithInlineLink(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", links=");
        sbLIZ.append(this.links);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextWithInlineLink(String str, List<InlineLink> list) {
        this.text = str;
        this.links = list;
    }
}
