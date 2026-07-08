package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.pgcsdk.subscribe.model.PGCPreCheckResult;
import com.bytedance.android.pgcsdk.subscribe.model.PGCRefundInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCTemplateListData {

    @C09CT("active_contract")
    public PGCTemplateInfo activeContract;

    @C09CT("anchor_detail")
    public User anchorDetail;

    @C09CT("emote_config")
    public EmoteConfig emoteConfig;

    @C09CT("m2_tips_info")
    public PGCTipsInfo m2TipsInfo;

    @C09CT("payment_redirect")
    public boolean paymentRedirect;

    @C09CT("pgc_tips_info")
    public PGCTipsInfo pgcTipsInfo;

    @C09CT("plan_change_block_status")
    public int planChangeBlockStatus;

    @C09CT("pre_check_result")
    public PGCPreCheckResult preCheckResult;

    @C09CT("refund_info")
    public PGCRefundInfo refundInfo;

    @C09CT("sub_scenario")
    public int subScenario;

    @C09CT("subscriber_count")
    public long subscriberCount;

    @C09CT("template_version")
    public int templateVersion;

    @C09CT("transition_period_info")
    public PGCSubsTransitionPeriodInfo transitionPeriodInfo;

    @C09CT("webapp_payment")
    public boolean webappPayment;

    @C09CT("template_list")
    public List<PGCTemplateInfo> templateList = new ArrayList();

    @C09CT("balance")
    public String balance = "";

    @C09CT("plan_change_options")
    public List<PGCTemplateInfo> planChangeOptions = new ArrayList();

    @C09CT("fallback_template_list")
    public List<PGCTemplateInfo> fallbackTemplateList = new ArrayList();

    @C09CT("package_privilege_list")
    public List<SubPackagePrivilege> packagePrivilegeList = new ArrayList();

    @C09CT("navigation_text_list")
    public List<PGCNavigationText> navigationTextList = new ArrayList();
}
