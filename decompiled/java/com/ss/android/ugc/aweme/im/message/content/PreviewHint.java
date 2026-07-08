package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PreviewHint implements Serializable {

    @C09CT("default_inapp_push_preview")
    public final BaseText defaultInappPushPreview;

    @C09CT("inapp_push_preview")
    public final BaseText inappPushPreview;

    @C09CT("outapp_push_preview")
    public final BaseText outappPushPreview;

    @C09CT("quote_preview_text")
    public final BaseText quotePreviewText;

    @C09CT("receiver_preview_text")
    public final BaseText receiverPreviewText;

    @C09CT("sender_preview_text")
    public final BaseText senderPreviewText;

    public PreviewHint() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewHint)) {
            return false;
        }
        PreviewHint previewHint = (PreviewHint) obj;
        return Intrinsics.LJFF(this.senderPreviewText, previewHint.senderPreviewText) && Intrinsics.LJFF(this.receiverPreviewText, previewHint.receiverPreviewText) && Intrinsics.LJFF(this.quotePreviewText, previewHint.quotePreviewText) && Intrinsics.LJFF(this.outappPushPreview, previewHint.outappPushPreview) && Intrinsics.LJFF(this.inappPushPreview, previewHint.inappPushPreview) && Intrinsics.LJFF(this.defaultInappPushPreview, previewHint.defaultInappPushPreview);
    }

    public int hashCode() {
        BaseText baseText = this.senderPreviewText;
        int iHashCode = (baseText == null ? 0 : baseText.hashCode()) * 31;
        BaseText baseText2 = this.receiverPreviewText;
        int iHashCode2 = (iHashCode + (baseText2 == null ? 0 : baseText2.hashCode())) * 31;
        BaseText baseText3 = this.quotePreviewText;
        int iHashCode3 = (iHashCode2 + (baseText3 == null ? 0 : baseText3.hashCode())) * 31;
        BaseText baseText4 = this.outappPushPreview;
        int iHashCode4 = (iHashCode3 + (baseText4 == null ? 0 : baseText4.hashCode())) * 31;
        BaseText baseText5 = this.inappPushPreview;
        int iHashCode5 = (iHashCode4 + (baseText5 == null ? 0 : baseText5.hashCode())) * 31;
        BaseText baseText6 = this.defaultInappPushPreview;
        return iHashCode5 + (baseText6 != null ? baseText6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewHint(senderPreviewText=");
        sbLIZ.append(this.senderPreviewText);
        sbLIZ.append(", receiverPreviewText=");
        sbLIZ.append(this.receiverPreviewText);
        sbLIZ.append(", quotePreviewText=");
        sbLIZ.append(this.quotePreviewText);
        sbLIZ.append(", outappPushPreview=");
        sbLIZ.append(this.outappPushPreview);
        sbLIZ.append(", inappPushPreview=");
        sbLIZ.append(this.inappPushPreview);
        sbLIZ.append(", defaultInappPushPreview=");
        sbLIZ.append(this.defaultInappPushPreview);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreviewHint(BaseText baseText, BaseText baseText2, BaseText baseText3, BaseText baseText4, BaseText baseText5, BaseText baseText6) {
        this.senderPreviewText = baseText;
        this.receiverPreviewText = baseText2;
        this.quotePreviewText = baseText3;
        this.outappPushPreview = baseText4;
        this.inappPushPreview = baseText5;
        this.defaultInappPushPreview = baseText6;
    }
}
