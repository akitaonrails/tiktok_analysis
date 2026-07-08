package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackagePrivilege {

    @C09CT("badge")
    public Badge badge;

    @C09CT("badge_detail")
    public BadgeDetail badgeDetail;

    @C09CT("emote_detail")
    public EmoteListResult emoteDetail;

    @C09CT("package_summary")
    public SubPackageSummary packageSummary;

    @C09CT("progressive_benefit_info")
    public ProgressiveBenefitInfo progressiveBenefitInfo;

    @C09CT("all_levels")
    public List<SubLevel> allLevels = new ArrayList();

    @C09CT("customized_benefits")
    public List<SubCustomizedBenefit> customizedBenefits = new ArrayList();

    @C09CT("smb_perks_combination")
    public List<SMBSubPerkCombination> smbPerksCombination = new ArrayList();
}
