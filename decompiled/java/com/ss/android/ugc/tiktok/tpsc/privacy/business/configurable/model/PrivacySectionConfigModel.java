package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacySectionConfigModel {

    @C09CT("items")
    public final List<PrivacyItemConfigModel> items;

    @C09CT("section_footer")
    public final String sectionFooter;

    @C09CT("section_footer_with_inline_link")
    public final PrivacyTextWithInlineLink sectionFooterWithInlineLink;

    @C09CT("section_header")
    public final String sectionTitle;

    public PrivacySectionConfigModel() {
        this(null, null, null, null);
    }

    public PrivacySectionConfigModel(String str, List<PrivacyItemConfigModel> list, String str2, PrivacyTextWithInlineLink privacyTextWithInlineLink) {
        this.sectionTitle = str;
        this.items = list;
        this.sectionFooter = str2;
        this.sectionFooterWithInlineLink = privacyTextWithInlineLink;
    }
}
