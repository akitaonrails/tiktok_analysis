package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpRichText {

    @C09CT("line_height")
    public final Float lineHeight;

    @C09CT("rich_text")
    public final ECRichText richText;

    public SeaPdpRichText() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpRichText)) {
            return false;
        }
        SeaPdpRichText seaPdpRichText = (SeaPdpRichText) obj;
        return Intrinsics.LJFF(this.lineHeight, seaPdpRichText.lineHeight) && Intrinsics.LJFF(this.richText, seaPdpRichText.richText);
    }

    public SeaPdpRichText(Float f, ECRichText eCRichText) {
        this.lineHeight = f;
        this.richText = eCRichText;
    }
}
