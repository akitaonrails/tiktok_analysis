package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerCommonUIStruct implements Serializable {

    @C09CT("content")
    public BannerCommonContent content;

    @C09CT("head_icon")
    public String iconName;

    @C09CT("tail_action")
    public BannerCommonTailAction tailAction;

    public BannerCommonUIStruct() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerCommonUIStruct(iconName=");
        sbLIZ.append(this.iconName);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", tailAction=");
        sbLIZ.append(this.tailAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setContent(BannerCommonContent bannerCommonContent) {
        this.content = bannerCommonContent;
    }

    public BannerCommonUIStruct(String str, BannerCommonContent bannerCommonContent, BannerCommonTailAction bannerCommonTailAction) {
        this.iconName = str;
        this.content = bannerCommonContent;
        this.tailAction = bannerCommonTailAction;
    }
}
