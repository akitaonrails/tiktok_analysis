package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;
import com.bytedance.android.livesdk.chatroom.api.Perk;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CustomBenefitEntrance {

    @C09CT("enabled_perks")
    public List<Perk> enabledPerks = C13BV.INSTANCE;

    @C09CT("figures")
    public long figures;

    @C09CT("last_audit_info")
    public AuditInfo lastAuditInfo;

    @C09CT("last_audit_status")
    public int lastAuditStatus;

    @C09CT("last_benefit_id")
    public long lastBenefitId;

    @C09CT("max_perks_cnt")
    public long maxPerksCnt;

    @C09CT("show_entrance")
    public boolean showEntrance;

    @C09CT("show_progressive_benefit_prompt")
    public boolean showProgressiveBenefitPrompt;
}
