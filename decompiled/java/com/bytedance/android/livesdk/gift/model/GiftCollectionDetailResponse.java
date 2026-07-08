package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GiftCollectionDetailResponse {

    @C09CT("data")
    public Data data;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class CollectionProcess {

        @C09CT("collected_num")
        public Long collectedNum;

        @C09CT("period_id")
        public Long periodId;

        @C09CT("round")
        public Long round;

        @C09CT("target_num")
        public Long targetNum;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.periodId != null) {
                sb.append(", period_id=");
                sb.append(this.periodId);
            }
            if (this.round != null) {
                sb.append(", round=");
                sb.append(this.round);
            }
            if (this.targetNum != null) {
                sb.append(", target_num=");
                sb.append(this.targetNum);
            }
            if (this.collectedNum != null) {
                sb.append(", collected_num=");
                sb.append(this.collectedNum);
            }
            sb.replace(0, 2, "CollectionProcess{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class Data {

        @C09CT("anchor_info")
        public CollectionUser anchorInfo;

        @C09CT("card_bg")
        public CardBg cardBg;

        @C09CT("card_description")
        public CollectionDescription cardDescription;

        @C09CT("collection_process")
        public CollectionProcess collectionProcess;

        @C09CT("effects")
        public List<CollectionEffect> effects;

        @C09CT("faq")
        public FAQ faq;

        @C09CT("faq_bg")
        public FAQBg faqBg;

        @C09CT("gift_info")
        public Gift giftInfo;

        @C09CT("hide_animation")
        public boolean hideAnimation;

        @C09CT("is_host")
        public Boolean isHost;

        @C09CT("jump_text")
        public String jumpText;

        @C09CT("panel_bg")
        public PanelBg panelBg;

        @C09CT("progress_round")
        public ProgressRound progressRound;

        @C09CT("rule_url")
        public String ruleUrl;

        @C09CT("send_bg")
        public SendBg sendBg;

        @C09CT("send_text")
        public String sendText;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.anchorInfo != null) {
                sb.append(", anchor_info=");
                sb.append(this.anchorInfo);
            }
            if (this.giftInfo != null) {
                sb.append(", gift_info=");
                sb.append(this.giftInfo);
            }
            if (this.collectionProcess != null) {
                sb.append(", collection_process=");
                sb.append(this.collectionProcess);
            }
            List<CollectionEffect> list = this.effects;
            if (list != null && !list.isEmpty()) {
                sb.append(", effects=");
                sb.append(this.effects);
            }
            if (this.isHost != null) {
                sb.append(", is_host=");
                sb.append(this.isHost);
            }
            if (this.cardDescription != null) {
                sb.append(", card_description=");
                sb.append(this.cardDescription);
            }
            if (this.jumpText != null) {
                sb.append(", jump_text=");
                sb.append(this.jumpText);
            }
            if (this.sendText != null) {
                sb.append(", send_text=");
                sb.append(this.sendText);
            }
            if (this.ruleUrl != null) {
                sb.append(", rule_url=");
                sb.append(this.ruleUrl);
            }
            sb.replace(0, 2, "Data{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class FAQ {

        @C09CT("body")
        public List<FAQBody> body;

        @C09CT("navbar_title")
        public String navbarTitle = "";
    }

    public static final class FAQBg {

        @C09CT("bg_gradient")
        public List<String> bgGradient;

        @C09CT("img_url")
        public String imgUrl = "";

        @C09CT("img_height")
        public String imgHeight = "";

        @C09CT("navbar_text_color")
        public String navbarTextColor = "";

        @C09CT("title_text_color")
        public String titleTextColor = "";

        @C09CT("content_text_color")
        public String contentTextColor = "";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class FAQBody {

        @C09CT("content")
        public List<String> content;

        @C09CT("title")
        public String title = "";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Gift {

        @C09CT("bg_img")
        public ImageModel bgImg;

        @C09CT("diamond_count")
        public Integer diamondCount;

        @C09CT("end_time")
        public Long endTime;

        @C09CT("gift_id")
        public Long giftId;

        @C09CT("gift_type")
        public Integer giftType;

        @C09CT("img")
        public ImageModel img;

        @C09CT("round")
        public Long round;

        @C09CT("round_name")
        public String roundName;

        @C09CT("send_icon")
        public ImageModel sendIcon;

        @C09CT("start_time")
        public Long startTime;

        @C09CT("topic_complete_text")
        public String topicCompleteText;

        @C09CT("topic_text")
        public String topicText;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.giftId != null) {
                sb.append(", gift_id=");
                sb.append(this.giftId);
            }
            if (this.img != null) {
                sb.append(", img=");
                sb.append(this.img);
            }
            if (this.sendIcon != null) {
                sb.append(", send_icon=");
                sb.append(this.sendIcon);
            }
            if (this.bgImg != null) {
                sb.append(", bg_img=");
                sb.append(this.bgImg);
            }
            if (this.roundName != null) {
                sb.append(", round_name=");
                sb.append(this.roundName);
            }
            if (this.topicText != null) {
                sb.append(", topic_text=");
                sb.append(this.topicText);
            }
            if (this.topicCompleteText != null) {
                sb.append(", topic_complete_text=");
                sb.append(this.topicCompleteText);
            }
            if (this.startTime != null) {
                sb.append(", start_time=");
                sb.append(this.startTime);
            }
            if (this.endTime != null) {
                sb.append(", end_time=");
                sb.append(this.endTime);
            }
            if (this.round != null) {
                sb.append(", round=");
                sb.append(this.round);
            }
            if (this.giftType != null) {
                sb.append(", gift_type=");
                sb.append(this.giftType);
            }
            if (this.diamondCount != null) {
                sb.append(", diamond_count=");
                sb.append(this.diamondCount);
            }
            sb.replace(0, 2, "Gift{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class PanelBg {

        @C09CT("bg_gradient")
        public List<String> bgGradient;

        @C09CT("scrollable_top_edge_bg_gradient")
        public List<String> scrollableTopEdgeBgGradient;

        @C09CT("img_url")
        public String imgUrl = "";

        @C09CT("img_height")
        public String imgHeight = "";

        @C09CT("border_radius")
        public String borderRadius = "";

        @C09CT("theme_color")
        public String themeColor = "";

        @C09CT("divider_bg_color")
        public String dividerBgColor = "";

        @C09CT("faq_content_text_color")
        public String faqContentTextColor = "";

        @C09CT("corner_img_width")
        public String cornerImgWidth = "";

        @C09CT("corner_img_height")
        public String cornerImgHeight = "";

        @C09CT("corner_img_top")
        public String cornerImgTop = "";

        @C09CT("corner_img_right")
        public String cornerImgRight = "";
    }

    public static final class ProgressRound {

        @C09CT("progress_filled_bg_gradient")
        public List<String> progressFilledBgGradient;

        @C09CT("round_name_text_class")
        public List<String> roundNameTextClass;

        @C09CT("round_number_alignment_class")
        public List<String> roundNumberAlignmentClass;

        @C09CT("round_number_text_class")
        public List<String> roundNumberTextClass;

        @C09CT("filter_img_height")
        public String filterImgHeight = "";

        @C09CT("filter_img_url")
        public String filterImgUrl = "";

        @C09CT("text_color")
        public String textColor = "";

        @C09CT("bg_img_url")
        public String bgImgUrl = "";

        @C09CT("border_radius")
        public String borderRadius = "";

        @C09CT("border_color")
        public String borderColor = "";

        @C09CT("divider_border_color")
        public String dividerBorderColor = "";

        @C09CT("round_bg_color")
        public String roundBgColor = "";

        @C09CT("progress_unfilled_bg_color")
        public String progressUnfilledBgColor = "";

        @C09CT("bg_color")
        public String bgColor = "";
    }

    public static final class SendBg {

        @C09CT("bg_gradient")
        public List<String> bgGradient;

        @C09CT("inner_bg_gradient")
        public List<String> innerBgGradient;

        @C09CT("img_url")
        public String imgUrl = "";

        @C09CT("border_radius")
        public String borderRadius = "";

        @C09CT("box_shadow")
        public String boxShadow = "";

        @C09CT("text_color")
        public String textColor = "";

        @C09CT("inner_border_radius")
        public String innerBorderRadius = "";

        @C09CT("coin_icon_shadow_color")
        public String coinIconShadowColor = "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "GiftCollectionDetailResponse{");
        sb.append('}');
        return sb.toString();
    }
}
