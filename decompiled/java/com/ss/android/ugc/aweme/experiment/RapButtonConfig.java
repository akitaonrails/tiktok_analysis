package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class RapButtonConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("btnTextStarlingKey")
    public final String btnTextStarlingKey;

    @C09CT("iconAndroid")
    public final String iconAndroid;

    @C09CT("iconIOS")
    public final String iconIOS;

    @C09CT("jumpUrl")
    public final String jumpUrl;

    @C09CT("position")
    public final String position;

    public RapButtonConfig() {
        this("", "", "Chat with us", "aweme://webview?url=https%3A%2F%2Ffeedback.tiktokv.com%2Ffeedback%2Fim%2Fchat%3Fdisable_ttnet_proxy%3D0%26trans_status_bar%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26container_color_auto_dark%3D1%26_pia_%3D1%26version%3D1.0.0%26bdhm_bid%3Dcsp_im_inapp_hybrid%26is_bot%3Dtrue%26entrance%3Drap_main_na%26enter_from%3Drap_main_na", "sticky");
    }

    public RapButtonConfig(String str, String str2, String str3, String str4, String str5) {
        this.iconIOS = str;
        this.iconAndroid = str2;
        this.btnTextStarlingKey = str3;
        this.jumpUrl = str4;
        this.position = str5;
    }
}
