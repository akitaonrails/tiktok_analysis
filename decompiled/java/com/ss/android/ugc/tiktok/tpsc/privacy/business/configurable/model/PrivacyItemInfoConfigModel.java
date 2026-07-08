package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public class PrivacyItemInfoConfigModel {
    public String LIZ;

    @C09CT("item_subtitle")
    public final String itemSubtitle;

    @C09CT("item_subtitle_with_inline_link")
    public final PrivacyTextWithInlineLink itemSubtitleWithInlineLink;

    @C09CT("item_title")
    public final String itemTitle;

    @C09CT("restriction_key")
    public final String restrictionKey;

    @C09CT("setting_key")
    public final String settingKey;

    public PrivacyItemInfoConfigModel() {
        this(null, null, null, null, null);
    }

    public PrivacyItemInfoConfigModel(String str, String str2, PrivacyTextWithInlineLink privacyTextWithInlineLink, String str3, String str4) {
        this.itemTitle = str;
        this.itemSubtitle = str2;
        this.itemSubtitleWithInlineLink = privacyTextWithInlineLink;
        this.restrictionKey = str3;
        this.settingKey = str4;
        this.LIZ = "";
    }
}
