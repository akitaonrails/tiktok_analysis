package webcast.api.gift;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GetGiftHubHighlightEventResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("event_banner")
        public EventBanner eventBanner;

        @C09CT("event_reward_info")
        public EventRewardInfo eventRewardInfo;
    }

    public static final class EventBanner {

        @C09CT("tab_ids")
        public List<Long> tabIds = new ArrayList();

        @C09CT("banner_title")
        public String bannerTitle = "";

        @C09CT("banner_subtitle")
        public String bannerSubtitle = "";

        @C09CT("schema_url")
        public String schemaUrl = "";
    }

    public static final class EventRewardInfo {

        @C09CT("reward_icon")
        public ImageModel rewardIcon;

        @C09CT("tab_ids")
        public List<Long> tabIds = new ArrayList();

        @C09CT("banner_text")
        public String bannerText = "";

        @C09CT("notification_text")
        public String notificationText = "";

        @C09CT("schema_url")
        public String schemaUrl = "";

        @C09CT("anchor_nickname")
        public String anchorNickname = "";

        @C09CT("anchor_avatar_url")
        public String anchorAvatarUrl = "";

        @C09CT("page_ids")
        public List<String> pageIds = new ArrayList();
    }
}
