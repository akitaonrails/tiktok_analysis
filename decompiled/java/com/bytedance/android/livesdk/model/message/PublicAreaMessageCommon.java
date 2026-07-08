package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PublicAreaMessageCommon {

    @C09CT("admin_fold_type")
    public long adminFoldType;

    @C09CT("anchor_release_to_scroll_area")
    public boolean anchorReleaseToScrollArea;

    @C09CT("anchor_scroll_gap_count")
    public long anchorScrollGapCount;

    @C09CT("creator_success_info")
    public CreatorSuccessInfo creatorSuccessInfo;

    @C09CT("display_info")
    public MessageDisplayInfo displayInfo;

    @C09CT("dynamic_display_text")
    public Text dynamicDisplayText;

    @C09CT("hide_above_scroll_area")
    public boolean hideAboveScrollArea;

    @C09CT("is_anchor_marked")
    public boolean isAnchorMarked;

    @C09CT("operation_info")
    public OperationInfo operationInfo;

    @C09CT("portrait_info")
    public PortraitInfo portraitInfo;

    @C09CT("release_to_scroll_area")
    public boolean releaseToScrollArea;

    @C09CT("scroll_gap_count")
    public long scrollGapCount;

    @C09CT("user_interaction_info")
    public UserInteractionInfo userInteractionInfo;

    public static final class CreatorSuccessInfo {

        @C09CT("frequency_control")
        public FrequencyControl frequencyControl;

        @C09CT("topic")
        public Topic topic;

        @C09CT("tags")
        public List<TagItem> tags = new ArrayList();

        @C09CT("topic_list")
        public List<Topic> topicList = new ArrayList();

        public static final class FrequencyControl {

            @C09CT("frequency_control_key")
            public String frequencyControlKey = "";

            @C09CT("limit_in_window")
            public long limitInWindow;

            @C09CT("window_size")
            public long windowSize;
        }

        public static final class TagItem {

            @C09CT("disable_count_frequency_control")
            public boolean disableCountFrequencyControl;

            @C09CT("disable_crm_click")
            public boolean disableCrmClick;

            @C09CT("display_location")
            public int displayLocation;

            @C09CT("tag_text")
            public Text tagText;

            @C09CT("tag_type")
            public int tagType;

            @C09CT("tag_value")
            public long tagValue;

            @C09CT("event_tracking_fields")
            public Map<String, String> eventTrackingFields = new LinkedHashMap();

            @C09CT("biz_name")
            public String bizName = "";
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Topic {
            public transient boolean LIZ;

            @C09CT("action_button")
            public ActionButton actionButton;

            @C09CT("disable_count_frequency_control")
            public boolean disableCountFrequencyControl;

            @C09CT("display_location")
            public int displayLocation;

            @C09CT("has_button")
            public boolean hasButton;

            @C09CT("tag_type")
            public int tagType;

            @C09CT("topic_action_type")
            public int topicActionType;

            @C09CT("topic_text")
            public Text topicText;

            @C09CT("topic_tips")
            public Text topicTips;

            @C09CT("event_tracking_fields")
            public Map<String, String> eventTrackingFields = new LinkedHashMap();

            @C09CT("biz_name")
            public String bizName = "";

            public static final class ActionButton {

                @C09CT("button_active_text")
                public Text buttonActiveText;

                @C09CT("button_inactive_text")
                public Text buttonInactiveText;

                @C09CT("button_schema")
                public String buttonSchema = "";

                @C09CT("button_type")
                public int buttonType;

                @C09CT("enable_button_inactive_text")
                public boolean enableButtonInactiveText;
            }
        }
    }

    public static final class MessageDisplayInfo {

        @C09CT("duration_type")
        public int durationType;

        @C09CT("incr_duration_ms")
        public long incrDurationMs;

        @C09CT("show_duration_ms")
        public long showDurationMs;

        @C09CT("stay_style")
        public int stayStyle;
    }

    public static final class OperationInfo {

        @C09CT("failure_state")
        public OperationState failureState;

        @C09CT("initial_state")
        public OperationState initialState;

        @C09CT("success_state")
        public OperationState successState;
    }

    public static final class OperationState {

        @C09CT("animation_style")
        public long animationStyle;

        @C09CT("duration")
        public long duration;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT(Scene.SCENE_SERVICE)
        public String scene = "";

        @C09CT("schema")
        public String schema = "";

        @C09CT("text")
        public Text text;
    }

    public static final class PortraitInfo {

        @C09CT("user_metrics")
        public List<UserMetrics> userMetrics = new ArrayList();

        @C09CT("portrait_tag")
        public List<PortraitTag> portraitTag = new ArrayList();

        public static final class PortraitTag {

            @C09CT("priority")
            public long priority;

            @C09CT("tag_id")
            public String tagId = "";

            @C09CT("show_value")
            public String showValue = "";

            @C09CT("show_args")
            public String showArgs = "";
        }

        public static final class UserMetrics {

            @C09CT("metrics_value")
            public String metricsValue = "";

            @C09CT("type")
            public int type;
        }
    }

    public static final class UserInteractionInfo {

        @C09CT("comment_cnt")
        public long commentCnt;

        @C09CT("like_cnt")
        public long likeCnt;

        @C09CT("share_cnt")
        public long shareCnt;
    }
}
