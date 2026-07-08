package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubCustomizedBenefit {

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("benefit_media")
    public SubCustomizedBenefitMedia benefitMedia;

    @C09CT("benefit_type")
    public int benefitType;

    @C09CT("block_status")
    public int blockStatus;

    @C09CT("config_status")
    public int configStatus;

    @C09CT("cooling_down_type")
    public int coolingDownType;

    @C09CT("enable_status")
    public int enableStatus;

    @C09CT("is_strategy_recommended")
    public boolean isStrategyRecommended;

    @C09CT("perk_details")
    public PerkDetails perkDetails;

    @C09CT("take_effect_at")
    public long takeEffectAt;

    @C09CT("user_config_status")
    public int userConfigStatus;

    @C09CT("benefit_id_str")
    public String benefitIdStr = "";

    @C09CT("original_benefit_id_str")
    public String originalBenefitIdStr = "";

    @C09CT("official_template_id_str")
    public String officialTemplateIdStr = "";

    @C09CT("perk_tags")
    public List<PerkTag> perkTags = new ArrayList();
}
