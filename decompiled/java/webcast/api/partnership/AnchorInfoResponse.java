package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PartnershipBriefDrops;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class CameraPartnershipInfo {

        @C09CT("permission")
        public boolean permission;

        @C09CT("publish_permission")
        public boolean publishPermission;

        @C09CT("task_permission")
        public boolean taskPermission;
    }

    public static final class DropsBrief {

        @C09CT("begin_timestamp")
        public long beginTimestamp;

        @C09CT("drops_id")
        public String dropsId = "";

        @C09CT("icon")
        public String icon = "";
    }

    public static final class DropsEntrance {

        @C09CT("drops_count")
        public long dropsCount;

        @C09CT("has_sign")
        public boolean hasSign;

        @C09CT("icon")
        public String icon = "";

        @C09CT("permission")
        public boolean permission;

        @C09CT("recent_drops_briefs")
        public List<DropsBrief> recentDropsBriefs;

        @C09CT("rewarded")
        public boolean rewarded;
    }

    public static final class LabelFilterInfo {

        @C09CT("gpppa_account")
        public boolean gpppaAccount;

        @C09CT("gpppa_ban_text")
        public String gpppaBanText = "";

        @C09CT("gpppa_ban_toast")
        public String gpppaBanToast = "";
    }

    public static final class PartnershipInfo {

        @C09CT("has_sign")
        public boolean hasSign;

        @C09CT("partnership_info_update_timestamp")
        public long partnershipInfoUpdateTimestamp;

        @C09CT("permission")
        public boolean permission;

        @C09CT("publish_permission")
        public boolean publishPermission;

        @C09CT("task_permission")
        public boolean taskPermission;
    }

    public static final class PunishInfo {

        @C09CT("punish_event_info")
        public PunishEventInfo punishEventInfo;

        @C09CT("punish_text")
        public String punishText = "";
    }

    public static final class ResponseData {

        @C09CT("business_partnership")
        public boolean businessPartnership;

        @C09CT("camera_partnership_info")
        public CameraPartnershipInfo cameraPartnershipInfo;

        @C09CT("drops_entrance")
        public DropsEntrance dropsEntrance;

        @C09CT("enable_drops_list")
        public List<PartnershipBriefDrops> enableDropsList;

        @C09CT("enable_event_list")
        public List<PartnershipGameEvent> enableEventList;

        @C09CT("is_org_account")
        public boolean isOrgAccount;

        @C09CT("label_filter_info")
        public LabelFilterInfo labelFilterInfo;

        @C09CT("live_take_decouple")
        public boolean liveTakeDecouple;

        @C09CT("partnership_info")
        public PartnershipInfo partnershipInfo;

        @C09CT("price_update_list")
        public List<TaskPriceUpdate> priceUpdateList;

        @C09CT("punish_info")
        public List<PunishInfo> punishInfo;

        @C09CT("shoot_permission")
        public boolean shootPermission;

        @C09CT("TaxPayoutConfirm")
        public boolean taxpayoutconfirm;

        @C09CT("toggle_info")
        public ToggleInfo toggleInfo;

        @C09CT("toggle_status")
        public int toggleStatus;
    }

    public static final class TaskPriceUpdate {

        @C09CT("price_update_timestamp")
        public long priceUpdateTimestamp;

        @C09CT("task_id")
        public String taskId = "";
    }

    public static final class ToggleInfo {

        @C09CT("game_tag_id")
        public long gameTagId;

        @C09CT("toggle_status")
        public int toggleStatus;
    }
}
