package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class HighlightNewUserGuide implements Serializable, InterfaceC1891350zJl {
    public static final int $stable = 0;

    @C09CT("guide_text")
    public final HighlightNewUserGuideText guideText;

    @C09CT("image_dark_url")
    public final String imageDarkUrl;

    @C09CT("image_url")
    public final String imageUrl;

    public final HighlightNewUserGuide copy(String str, String str2, HighlightNewUserGuideText highlightNewUserGuideText) {
        return new HighlightNewUserGuide(str, str2, highlightNewUserGuideText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightNewUserGuide)) {
            return false;
        }
        HighlightNewUserGuide highlightNewUserGuide = (HighlightNewUserGuide) obj;
        return Intrinsics.LJFF(this.imageUrl, highlightNewUserGuide.imageUrl) && Intrinsics.LJFF(this.imageDarkUrl, highlightNewUserGuide.imageDarkUrl) && Intrinsics.LJFF(this.guideText, highlightNewUserGuide.guideText);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageDarkUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HighlightNewUserGuideText highlightNewUserGuideText = this.guideText;
        return iHashCode2 + (highlightNewUserGuideText != null ? highlightNewUserGuideText.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightNewUserGuide(imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", imageDarkUrl=");
        sbLIZ.append(this.imageDarkUrl);
        sbLIZ.append(", guideText=");
        sbLIZ.append(this.guideText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final HighlightNewUserGuideText getGuideText() {
        return this.guideText;
    }

    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public HighlightNewUserGuide(String str, String str2, HighlightNewUserGuideText highlightNewUserGuideText) {
        this.imageUrl = str;
        this.imageDarkUrl = str2;
        this.guideText = highlightNewUserGuideText;
    }
}
