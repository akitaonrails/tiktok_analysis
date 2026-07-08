package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuideInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("guide_entry")
        public GuideEntry guideEntry;

        @C09CT("guide_type")
        public String guideType = "";

        @C09CT("schema_url")
        public String schemaUrl = "";

        @C09CT("should_use_config")
        public boolean shouldUseConfig;

        @C09CT("ug_gift_task_info")
        public UGGiftTaskInfo ugGiftTaskInfo;

        @C09CT("user_stats")
        public UserStats userStats;
    }

    public static final class GuideEntry {

        @C09CT("guide_page_resources")
        public List<GuidePageResource> guidePageResources = new ArrayList();
    }

    public static final class GuidePageResource {

        @C09CT("texts")
        public List<Text> texts = new ArrayList();

        @C09CT("icons")
        public List<ImageModel> icons = new ArrayList();

        @C09CT("animations")
        public List<ImageModel> animations = new ArrayList();
    }

    public static final class UserStats {

        @C09CT("gift_guide_popup_show_cnt")
        public long giftGuidePopupShowCnt;

        @C09CT("gift_panel_show_cnt")
        public long giftPanelShowCnt;

        @C09CT("like_cnt")
        public long likeCnt;

        @C09CT("shortcut_gift_click_cnt")
        public long shortcutGiftClickCnt;

        @C09CT("watch_duration")
        public long watchDuration;
    }
}
