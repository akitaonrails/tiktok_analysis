package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class CustomizePanel {

    @C09CT("address_pay_icon")
    public final String addressPayIcon;

    @C09CT("desc")
    public final String desc;

    @C09CT("info_list")
    public final List<String> infoList;

    @C09CT("submit_btn_text")
    public final String submitBtnText;

    @C09CT("submit_tips")
    public final String submitTips;

    @C09CT("title")
    public final String title;

    @C09CT("top_title")
    public final String topTitle;

    @C09CT("top_title_with_countdown")
    public final String topTitleWithCountdown;

    public CustomizePanel() {
        this(null, null, null, null, null, null, null, null);
    }

    public CustomizePanel(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7) {
        this.title = str;
        this.desc = str2;
        this.submitBtnText = str3;
        this.submitTips = str4;
        this.infoList = list;
        this.topTitle = str5;
        this.topTitleWithCountdown = str6;
        this.addressPayIcon = str7;
    }
}
