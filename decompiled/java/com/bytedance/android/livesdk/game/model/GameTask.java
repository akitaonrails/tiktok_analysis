package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameTask {

    @C09CT("accepted_benefit_list")
    public List<BriefBenefitInfo> acceptedBenefitList;

    @C09CT("game")
    public PartnershipGame game;

    @C09CT("task")
    public PartnershipTask task;

    @C09CT("unaccepted_benefit_list")
    public List<BriefBenefitInfo> unacceptedBenefitList;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.game != null) {
            sb.append(", game=");
            sb.append(this.game);
        }
        if (this.task != null) {
            sb.append(", task=");
            sb.append(this.task);
        }
        sb.replace(0, 2, "GameTask{");
        sb.append('}');
        return sb.toString();
    }
}
