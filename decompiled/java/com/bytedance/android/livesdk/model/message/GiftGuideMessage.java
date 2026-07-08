package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftGuideMessage extends AbstractC1136060ffY {

    @C09CT("biz")
    public String biz;

    @C09CT("content")
    public Text content;

    @C09CT("display_seconds")
    public long displaySeconds;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_ids")
    public List<Long> giftIds;

    @C09CT("guide_message_type")
    public int guideMessageType;

    @C09CT("guide_page_resources")
    public List<GuidePageResource> guidePageResources;

    @C09CT("guide_target")
    public GuideTarget guideTarget;

    @C09CT("guide_type")
    public String guideType;

    @C09CT("has_sent_before")
    public boolean hasSent;

    @C09CT("pop_url")
    public String popUrl;

    @C09CT("recommend_info")
    public RecommendInfo recommendInfo;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("should_use_config")
    public boolean shouldUseConfig;

    @C09CT("style_dictate")
    public boolean styleDictate;

    @C09CT("style_dictate_params")
    public StyleDictateParams styleDictateParams;

    @C09CT("style_id")
    public long styleId;

    @C09CT("sub_trigger_name")
    public String subTriggerName;

    @C09CT("tags")
    public List<String> tags;

    @C09CT("template_type")
    public String templateType;

    @C09CT("trigger_name")
    public String triggerName;

    @C09CT("use_server_config")
    public boolean useServerConfig;

    public GiftGuideMessage() {
        this.type = C001A.GIFT_GUIDE_MESSAGE;
        this.guideType = "";
        this.triggerName = "";
        this.schemaUrl = "";
        this.guidePageResources = new ArrayList();
        this.templateType = "";
        this.biz = "";
        this.tags = new ArrayList();
        this.giftIds = new ArrayList();
        this.subTriggerName = "";
        this.popUrl = "";
    }
}
