package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class BriefGameTask {

    @C09CT("accepted_benefit_list")
    public List<BriefBenefitInfo> acceptedBenefitList;

    @C09CT("brief_game")
    public BriefGame briefGame;

    @C09CT("creator_code")
    public BriefCreatorCode creatorCode;

    @C09CT("download_user_info")
    public GameTaskDownloadUserInfo downloadUserInfo;

    @C09CT("game_badge_list")
    public List<GameBadge> gameBadgeList;

    @C09CT("pin_duration")
    public long pinDuration;

    @C09CT("pin_status")
    public int pinStatus;

    @C09CT("sales_cps_info")
    public SalesCPSInfo salesCpsInfo;

    @C09CT("show_status")
    public int showStatus;

    @C09CT("task")
    public PartnershipTask task;

    @C09CT("task_type")
    public int taskType;

    @C09CT("unaccepted_benefit_list")
    public List<BriefBenefitInfo> unacceptedBenefitList;

    @C09CT("extra_params")
    public String extraParams = "";

    @C09CT("game_detail_page_schema")
    public String gameDetailPageSchema = "";

    @C09CT("log_extra")
    public String logExtra = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.briefGame != null) {
            sb.append(", brief_game=");
            sb.append(this.briefGame);
        }
        if (this.task != null) {
            sb.append(", task=");
            sb.append(this.task);
        }
        sb.replace(0, 2, "BriefGameTask{");
        sb.append('}');
        return sb.toString();
    }
}
