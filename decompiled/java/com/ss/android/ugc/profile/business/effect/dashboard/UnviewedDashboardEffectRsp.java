package com.ss.android.ugc.profile.business.effect.dashboard;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class UnviewedDashboardEffectRsp {
    public static final int $stable = 8;

    @C09CT("popup_banner_list")
    public final List<PopupBannerItem> bannerList;

    @C09CT("error_code")
    public final int errorCode;
    public int httpStatusCode;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_message")
    public final String statusMsg;

    public UnviewedDashboardEffectRsp() {
        this(null, -1, 1, null, -1);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnviewedDashboardEffectRsp(bannerList=");
        sbLIZ.append(this.bannerList);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", httpStatusCode=");
        sbLIZ.append(this.httpStatusCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public UnviewedDashboardEffectRsp(List<PopupBannerItem> list, int i, int i2, String str, int i3) {
        this.bannerList = list;
        this.errorCode = i;
        this.statusCode = i2;
        this.statusMsg = str;
        this.httpStatusCode = i3;
    }
}
