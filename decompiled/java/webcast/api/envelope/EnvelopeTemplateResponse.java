package webcast.api.envelope;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EnvelopeTemplateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class AnchorOnBoardPermit {

        @C09CT("anchor_onboard_permit")
        public boolean anchorOnboardPermit;

        @C09CT("permit_tips")
        public String permitTips = "";
    }

    public static final class CustomRule {

        @C09CT("max_countdown_second")
        public int maxCountdownSecond;

        @C09CT("max_diamond")
        public int maxDiamond;

        @C09CT("max_people_count")
        public int maxPeopleCount;

        @C09CT("min_countdown_second")
        public int minCountdownSecond;

        @C09CT("min_diamond")
        public int minDiamond;

        @C09CT("min_people_count")
        public int minPeopleCount;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class EnvelopeChosenSkin {

        @C09CT("expire_at")
        public long expireAt;

        @C09CT("permanent")
        public boolean permanent;

        @C09CT("skin_id")
        public long skinId;

        @C09CT("skin_name_starling_key")
        public String skinNameStarlingKey = "";

        @C09CT("expire_toast")
        public String expireToast = "";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class EnvelopeTemplate {

        @C09CT("business_type")
        public int businessType;

        @C09CT("countdown_second")
        public int countdownSecond;

        @C09CT("diamond_count")
        public int diamondCount;

        @C09CT("envelope_template_id")
        public String envelopeTemplateId = "";

        @C09CT("people_count")
        public int peopleCount;
    }

    public static final class PortalCustomRule {

        @C09CT("max_diamonds")
        public int maxDiamonds;

        @C09CT("min_diamonds")
        public int minDiamonds;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PortalTemplate {

        @C09CT("envelope_diamonds")
        public int envelopeDiamonds;

        @C09CT("portal_diamonds")
        public int portalDiamonds;

        @C09CT("target_touch_count")
        public int targetTouchCount;

        @C09CT("template_id")
        public String templateId = "";

        @C09CT("total_diamonds")
        public int totalDiamonds;
    }

    public static final class ResponseData {

        @C09CT("custom_rule")
        public CustomRule customRule;

        @C09CT("envelope_chosen_skin")
        public EnvelopeChosenSkin envelopeChosenSkin;

        @C09CT("envelope_daily_coin_threshold")
        public long envelopeDailyCoinThreshold;

        @C09CT("envelope_templates")
        public List<EnvelopeTemplate> envelopeTemplates;

        @C09CT("is_gpppa")
        public boolean isGpppa;

        @C09CT("is_news_account")
        public boolean isNewsAccount;

        @C09CT("portal_custom_rule")
        public PortalCustomRule portalCustomRule;

        @C09CT("portal_on_board_permit")
        public AnchorOnBoardPermit portalOnBoardPermit;

        @C09CT("portal_permission_recalled")
        public boolean portalPermissionRecalled;

        @C09CT("portal_template")
        public PortalTemplate portalTemplate;

        @C09CT("portal_templates")
        public List<PortalTemplate> portalTemplates;

        @C09CT("show_portal_red_dot")
        public boolean showPortalRedDot;

        @C09CT("special_room_type")
        public int specialRoomType;

        @C09CT("super_fan_envelope_entrance")
        public boolean superFanEnvelopeEntrance;

        @C09CT("treasure_on_board_permit")
        public AnchorOnBoardPermit treasureOnBoardPermit;
    }
}
