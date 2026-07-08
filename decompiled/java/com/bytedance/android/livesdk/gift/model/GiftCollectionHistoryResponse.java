package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GiftCollectionHistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public CollectionUser anchorInfo;

        @C09CT("card_bg")
        public CardBg cardBg;

        @C09CT("history_description")
        public CollectionDescription historyDescription;

        @C09CT("history_rounds")
        public List<EffectList> historyRounds;

        @C09CT("is_host")
        public Boolean isHost;

        @C09CT("panel_bg")
        public PanelBg panelBg;

        @C09CT("title_text")
        public String titleText;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.anchorInfo != null) {
                sb.append(", anchor_info=");
                sb.append(this.anchorInfo);
            }
            List<EffectList> list = this.historyRounds;
            if (list != null && !list.isEmpty()) {
                sb.append(", history_rounds=");
                sb.append(this.historyRounds);
            }
            if (this.isHost != null) {
                sb.append(", is_host=");
                sb.append(this.isHost);
            }
            if (this.titleText != null) {
                sb.append(", title_text=");
                sb.append(this.titleText);
            }
            if (this.historyDescription != null) {
                sb.append(", history_description=");
                sb.append(this.historyDescription);
            }
            sb.replace(0, 2, "Data{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class EffectList {

        @C09CT("effects")
        public List<CollectionEffect> effects;

        @C09CT("round")
        public String round;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.round != null) {
                sb.append(", round=");
                sb.append(this.round);
            }
            List<CollectionEffect> list = this.effects;
            if (list != null && !list.isEmpty()) {
                sb.append(", effects=");
                sb.append(this.effects);
            }
            sb.replace(0, 2, "EffectList{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class PanelBg {

        @C09CT("bg_gradient")
        public List<String> bgGradient;

        @C09CT("round_name_text_class")
        public List<String> roundNameTextClass;

        @C09CT("scrollable_bottom_edge_bg_gradient")
        public List<String> scrollableBottomEdgeBgGradient;

        @C09CT("img_url")
        public String imgUrl = "";

        @C09CT("divider_bg_color")
        public String dividerBgColor = "";

        @C09CT("empty_icon_name")
        public String emptyIconName = "";

        @C09CT("empty_icon_color_name")
        public String emptyIconColorName = "";

        @C09CT("text_color")
        public String textColor = "";

        @C09CT("theme_color")
        public String themeColor = "";

        @C09CT("round_name_text_color")
        public String roundNameTextColor = "";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "GiftCollectionHistoryResponse{");
        sb.append('}');
        return sb.toString();
    }
}
