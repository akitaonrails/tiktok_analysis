package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class MultiGuestFeSchemaConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("feedback")
    public String feedback;

    @C09CT("guest_overview")
    public String guestOverview;

    @C09CT("guest_point_panel")
    public String guestPointPanel;

    @C09CT("guest_review_panel")
    public String guestReviewPanel;

    @C09CT("guest_showdown_faq")
    public String guestShowdownFaq;

    @C09CT("guest_showdown_ranking")
    public String guestShowdownRanking;

    @C09CT("guest_showdown_setting")
    public String guestShowdownSetting;

    @C09CT("playbook_editor")
    public String playbookEditor;

    @C09CT("playbook_faq")
    public String playbookFAQ;

    @C09CT("text_header_faq")
    public String textHeaderFAQ;

    @C09CT("top_guests")
    public String topGuestPanel;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestFeSchemaConfig_OptTypeAdapter();
    }

    public MultiGuestFeSchemaConfig() {
        this("", "", "", "aweme://roma_redirect/?spark_page=guest_point_panel", "", "", "aweme://roma_redirect/?spark_page=top_guest_ranking_list", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ftext-header-faq%2Ftemplate.js&use_spark=1&bdhm_bid=tiktok_live_mg_guest_text_header_faq&height=70%25&gravity=bottom&radius=12&height_mode=fixed_7&use_live_sheet=1 ", "aweme://roma_redirect/?spark_page=guest_showdown_ranking", "aweme://roma_redirect/?spark_page=guest_showdown_settings", "aweme://roma_redirect/?spark_page=guest_showdown_faq");
    }

    public MultiGuestFeSchemaConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.feedback = str;
        this.guestOverview = str2;
        this.guestReviewPanel = str3;
        this.guestPointPanel = str4;
        this.playbookFAQ = str5;
        this.playbookEditor = str6;
        this.topGuestPanel = str7;
        this.textHeaderFAQ = str8;
        this.guestShowdownRanking = str9;
        this.guestShowdownSetting = str10;
        this.guestShowdownFaq = str11;
    }
}
