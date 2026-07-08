package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.DirectMessageScopeV2Settings;
import com.bytedance.android.livesdk.chatroom.api.IndustrySelection;
import com.bytedance.android.livesdk.chatroom.api.SMBFormInfo;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import com.bytedance.android.livesdk.chatroom.api.UpsellConsultationContent;
import com.bytedance.android.livesdk.chatroom.api.UpsellIndustry;
import com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo;
import com.bytedance.android.livesdk.chatroom.api.WelcomeMessage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class UpsellHomeResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("content")
        public UpsellConsultationContent content;

        @C09CT("direct_message_count")
        public long directMessageCount;

        @C09CT("direct_message_scope")
        public int directMessageScope;

        @C09CT("direct_message_scope_v2")
        public DirectMessageScopeV2Settings directMessageScopeV2;

        @C09CT("display_bottom_banner")
        public boolean displayBottomBanner;

        @C09CT("enable_form_v2")
        public boolean enableFormV2;

        @C09CT("form_info")
        public SMBFormInfo formInfo;

        @C09CT("has_queue")
        public boolean hasQueue;

        @C09CT("has_used_pin_cards")
        public boolean hasUsedPinCards;

        @C09CT("industry_recommendation")
        public UpsellIndustry industryRecommendation;

        @C09CT("industry_selection")
        public IndustrySelection industrySelection;

        @C09CT("is_ba")
        public boolean isBa;

        @C09CT("leads_gen_count")
        public long leadsGenCount;

        @C09CT("leads_gen_red_dot")
        public long leadsGenRedDot;

        @C09CT("permission_list")
        public List<UpsellMethodPermission> permissionList = new ArrayList();

        @C09CT("pin_card_list")
        public List<SimplePinCardInfo> pinCardList = new ArrayList();

        @C09CT("pin_info")
        public PerksPinPanel pinInfo;

        @C09CT("revoke_info")
        public UpsellRevokeInfo revokeInfo;

        @C09CT("sub_upsell_method")
        public int subUpsellMethod;

        @C09CT("sub_upsell_status")
        public int subUpsellStatus;

        @C09CT("switch_info")
        public UpsellSwitch switchInfo;

        @C09CT("welcome_message")
        public WelcomeMessage welcomeMessage;
    }
}
