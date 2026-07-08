package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBServiceSKU {

    @C09CT("booking_extra")
    public BookingExtra bookingExtra;

    @C09CT("create_at")
    public long createAt;

    @C09CT("desc")
    public ContentAuditStatus desc;

    @C09CT("dm_extra")
    public DmExtra dmExtra;

    @C09CT("form_extra")
    public FormExtra formExtra;

    @C09CT("is_deleted")
    public boolean isDeleted;

    @C09CT("is_full_configured")
    public boolean isFullConfigured;

    @C09CT("is_hidden")
    public boolean isHidden;

    @C09CT("pin_text")
    public ContentAuditStatus pinText;

    @C09CT("service_type")
    public int serviceType;

    @C09CT("sku_id")
    public long skuId;

    @C09CT("sku_id_str")
    public String skuIdStr = "";

    @C09CT("sub_extra")
    public SUbExtra subExtra;

    @C09CT("third_party_link_extra")
    public ThirdPartyLinkExtra thirdPartyLinkExtra;

    @C09CT("title")
    public ContentAuditStatus title;

    @C09CT("updated_at")
    public long updatedAt;

    public static final class BookingExtra {

        @C09CT("audit_status")
        public int auditStatus;

        @C09CT("duration_seconds")
        public int durationSeconds;

        @C09CT("kind")
        public int kind;

        @C09CT("event_template_id")
        public String eventTemplateId = "";

        @C09CT("name")
        public String name = "";

        @C09CT("locations")
        public List<SMBBookingEventTemplateLocation> locations = new ArrayList();

        @C09CT("description")
        public String description = "";

        @C09CT("availability_date")
        public List<Integer> availabilityDate = new ArrayList();

        @C09CT("availability_time_range")
        public String availabilityTimeRange = "";

        @C09CT("availability_time_zone")
        public String availabilityTimeZone = "";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class DmExtra {

        @C09CT("chat_prompt_enabled")
        public boolean chatPromptEnabled;

        @C09CT("keyword_reply_enabled")
        public boolean keywordReplyEnabled;

        @C09CT("preset_greeting")
        public ContentAuditStatus presetGreeting;

        @C09CT("preset_question_title")
        public ContentAuditStatus presetQuestionTitle;

        @C09CT("scope")
        public int scope;

        @C09CT("tip_priority")
        public long tipPriority;

        @C09CT("preset_question_list")
        public List<SMBDMQuestion> presetQuestionList = new ArrayList();

        @C09CT("chat_prompt_list")
        public List<SMBChatPrompt> chatPromptList = new ArrayList();

        @C09CT("keyword_reply_scenario_list")
        public List<SMBKeywordReplyScenario> keywordReplyScenarioList = new ArrayList();
    }

    public static final class FormExtra {

        @C09CT("create_time")
        public long createTime;

        @C09CT("form_id")
        public long formId;

        @C09CT("form_info")
        public SMBFormInfo formInfo;

        @C09CT("form_name")
        public String formName = "";

        @C09CT("form_id_str")
        public String formIdStr = "";
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static final class SUbExtra {

        @C09CT("emote_count")
        public long emoteCount;

        @C09CT("local_price_amount_micros")
        public long localPriceAmountMicros;

        @C09CT("perk_count")
        public long perkCount;

        @C09CT("package_id")
        public String packageId = "";

        @C09CT("package_name")
        public String packageName = "";

        @C09CT("local_currency_symbol")
        public String localCurrencySymbol = "";

        @C09CT("local_currency")
        public String localCurrency = "";
    }

    /* JADX INFO: loaded from: classes36.dex */
    public static final class ThirdPartyLinkExtra {

        @C09CT("expires_at")
        public long expiresAt;

        @C09CT("link_id")
        public long linkId;

        @C09CT("target_url")
        public String targetUrl = "";

        @C09CT("platform_name")
        public String platformName = "";

        @C09CT("icon_url_row")
        public String iconUrlRow = "";

        @C09CT("icon_url_us")
        public String iconUrlUs = "";

        @C09CT("icon_url_eu")
        public String iconUrlEu = "";

        @C09CT("screenshot_url_row")
        public String screenshotUrlRow = "";

        @C09CT("screenshot_url_us")
        public String screenshotUrlUs = "";

        @C09CT("screenshot_url_eu")
        public String screenshotUrlEu = "";

        @C09CT("main_category")
        public String mainCategory = "";

        @C09CT("sub_category")
        public String subCategory = "";

        @C09CT("platform_key")
        public String platformKey = "";
    }
}
