package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameActivity {

    @C09CT("accepted_benefit_list")
    public List<BriefBenefitInfo> acceptedBenefitList = new ArrayList();

    @C09CT("unaccepted_benefit_list")
    public List<BriefBenefitInfo> unacceptedBenefitList = new ArrayList();

    @C09CT("activity_groups")
    public List<OuterActivityGroup> activityGroups = new ArrayList();
}
