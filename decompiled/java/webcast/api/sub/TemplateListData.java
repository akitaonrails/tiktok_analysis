package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.subscribe.model.PreCheckResult;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class TemplateListData {

    @C09CT("active_contract")
    public TemplateInfo activeContract;

    @C09CT("anchor_detail")
    public User anchorDetail;

    @C09CT("emote_config")
    public EmoteConfig emoteConfig;

    @C09CT("m2_tips_info")
    public PaymentTipsInfo m2TipsInfo;

    @C09CT("payment_redirect")
    public boolean paymentRedirect;

    @C09CT("plan_change_block_status")
    public int planChangeBlockStatus;

    @C09CT("pre_check_result")
    public PreCheckResult preCheckResult;

    @C09CT("refund_info")
    public RefundInfo refundInfo;

    @C09CT("sub_scenario")
    public int subScenario;

    @C09CT("subscriber_count")
    public long subscriberCount;

    @C09CT("template_version")
    public int templateVersion;

    @C09CT("webapp_payment")
    public boolean webappPayment;

    @C09CT("template_list")
    public List<TemplateInfo> templateList = new ArrayList();

    @C09CT("balance")
    public String balance = "";

    @C09CT("plan_change_options")
    public List<TemplateInfo> planChangeOptions = new ArrayList();

    @C09CT("fallback_template_list")
    public List<TemplateInfo> fallbackTemplateList = new ArrayList();

    @C09CT("package_privilege_list")
    public List<SubPackagePrivilege> packagePrivilegeList = new ArrayList();

    @C09CT("navigation_text_list")
    public List<NavigationText> navigationTextList = new ArrayList();

    @C09CT("transaction_tips")
    public List<UpdateTips> transactionTips = new ArrayList();
}
