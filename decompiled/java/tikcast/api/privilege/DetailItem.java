package tikcast.api.privilege;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class DetailItem {

    @C09CT("asset_sub_type")
    public int assetSubType;

    @C09CT("asset_type")
    public int assetType;

    @C09CT("badge_scene_type")
    public int badgeSceneType;

    @C09CT("bag_item_type")
    public int bagItemType;

    @C09CT("biz_data")
    public BizData bizData;

    @C09CT("entrance_effect_issue_source")
    public int entranceEffectIssueSource;

    @C09CT("gift_tray_item")
    public GiftTraySponsorItem giftTrayItem;

    @C09CT("grid_view")
    public GridView gridView;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("profit_rank_type")
    public int profitRankType;

    @C09CT("scroll_view")
    public ScrollView scrollView;

    @C09CT("status_data")
    public StatusData statusData;

    @C09CT("user_privilege")
    public UserPrivilege userPrivilege;

    @C09CT("voucher_detail_item")
    public VoucherDetailItem voucherDetailItem;

    public static final class BizData {

        @C09CT("coins")
        public long coins;

        @C09CT("gift_group_in_tab")
        public int giftGroupInTab;

        @C09CT("gift_id")
        public long giftId;
    }

    public static final class Corner {

        @C09CT("end_time")
        public long endTime;

        @C09CT("icon")
        public ImageModel icon;
    }

    public static final class GridView {

        @C09CT("button_text")
        public Line buttonText;

        @C09CT("subtitle")
        public Line subtitle;

        @C09CT("title")
        public Line title;

        @C09CT("top_left")
        public Corner topLeft;

        @C09CT("top_right")
        public Corner topRight;
    }

    public static final class ScrollView {

        @C09CT("button_text")
        public Line buttonText;

        @C09CT("subtitle")
        public Line subtitle;

        @C09CT("title")
        public Line title;

        @C09CT("faq_section")
        public List<Section> faqSection = new ArrayList();

        @C09CT("button_jump_schema")
        public String buttonJumpSchema = "";

        @C09CT("button")
        public List<Button> button = new ArrayList();
    }

    public static final class StatusData {

        @C09CT("end_time")
        public long endTime;

        @C09CT("fans_club_join_status")
        public int fansClubJoinStatus;

        @C09CT("grade_mode")
        public int gradeMode;

        @C09CT("in_use")
        public boolean inUse;

        @C09CT("is_fallback")
        public boolean isFallback;

        @C09CT("is_opt_out")
        public boolean isOptOut;

        @C09CT("is_unlock")
        public boolean isUnlock;

        @C09CT("item_count")
        public int itemCount;

        @C09CT("unlock_level")
        public int unlockLevel;
    }
}
