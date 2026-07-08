package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class PollStyle {

    @C09CT("card_bg_image_url")
    public final String cardBgImageUrl;

    @C09CT("customized_ui_type")
    public final String customizedUiType;

    public PollStyle() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollStyle)) {
            return false;
        }
        PollStyle pollStyle = (PollStyle) obj;
        return Intrinsics.LJFF(this.cardBgImageUrl, pollStyle.cardBgImageUrl) && Intrinsics.LJFF(this.customizedUiType, pollStyle.customizedUiType);
    }

    public int hashCode() {
        String str = this.cardBgImageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customizedUiType;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollStyle(cardBgImageUrl=");
        sbLIZ.append(this.cardBgImageUrl);
        sbLIZ.append(", customizedUiType=");
        sbLIZ.append(this.customizedUiType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PollStyle(String str, String str2) {
        this.cardBgImageUrl = str;
        this.customizedUiType = str2;
    }
}
