package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagingToolsOptionURL {

    @C09CT("business_insights")
    public final String businessInsights;

    @C09CT("chat_intro")
    public final String chatIntro;

    @C09CT("faq_url")
    public final String faqUrl;

    @C09CT("follow_to_dm")
    public final String followToDm;

    @C09CT("message_center_url")
    public final String messageCenterUrl;

    @C09CT("promote_url")
    public final String promoteUrl;

    public MessagingToolsOptionURL() {
        this("aweme://roma_redirect/?spark_page=message_center_dm_b2c&roma_group_key=spark_page_message_center_dm_b2c&roma_page_key=p", "aweme://roma_redirect/?spark_page=message_center_auto_message_suggested_question", "aweme://roma_redirect/?spark_page=promote&roma_group_key=spark_page_promote&roma_page_key=p&page=promote-center&objective=8", "aweme://roma_redirect/?spark_page=im_business_insights", "aweme://roma_redirect/?spark_page=im_business_follow_to_dm", "aweme://roma_redirect/?spark_page=im_creator_chat_intro");
    }

    public MessagingToolsOptionURL(String str, String str2, String str3, String str4, String str5, String str6) {
        this.messageCenterUrl = str;
        this.faqUrl = str2;
        this.promoteUrl = str3;
        this.businessInsights = str4;
        this.followToDm = str5;
        this.chatIntro = str6;
    }
}
