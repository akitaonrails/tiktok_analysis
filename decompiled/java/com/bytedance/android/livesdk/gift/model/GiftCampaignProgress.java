package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GiftCampaignProgress {

    @C09CT("campaign_progress_list")
    public List<CampaignProgress> campaignProgressList = new ArrayList();

    public static final class CampaignProgress {

        @C09CT("activity_end_time")
        public long activityEndTime;

        @C09CT("activity_start_time")
        public long activityStartTime;

        @C09CT("activity_id")
        public String activityId = "";

        @C09CT("activity_name")
        public String activityName = "";

        @C09CT("condition_progress_list")
        public List<ConditionProgress> conditionProgressList = new ArrayList();

        @C09CT("gift_ids")
        public List<Long> giftIds = new ArrayList();

        @C09CT("gift_icon_map")
        public Map<Long, ImageModel> giftIconMap = new LinkedHashMap();

        @C09CT("activity_page_url")
        public String activityPageUrl = "";
    }

    public static final class ConditionProgress {

        @C09CT("condition_text")
        public Text conditionText;

        @C09CT("condition_type")
        public int conditionType;

        @C09CT("current_value")
        public long currentValue;

        @C09CT("gift_ids")
        public List<Long> giftIds = new ArrayList();

        @C09CT("target_value")
        public long targetValue;
    }
}
