package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerCommonContent implements Serializable {

    @C09CT("texts")
    public List<BannerCommonText> bannerTexts;

    @C09CT("max_lines")
    public int maxLines;

    public BannerCommonContent() {
        this(null, 1);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerCommonContent(bannerTexts=");
        sbLIZ.append(this.bannerTexts);
        sbLIZ.append(", maxLines=");
        sbLIZ.append(this.maxLines);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBannerTexts(List<BannerCommonText> list) {
        this.bannerTexts = list;
    }

    public BannerCommonContent(List<BannerCommonText> list, int i) {
        this.bannerTexts = list;
        this.maxLines = i;
    }
}
