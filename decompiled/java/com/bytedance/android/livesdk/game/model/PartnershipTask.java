package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PartnershipTask {

    @C09CT("anchor_show_status")
    public int anchorShowStatus;

    @C09CT("anchor_start_promote_ts")
    public long anchorStartPromoteTs;

    @C09CT("android_age_limit")
    public int androidAgeLimit;

    @C09CT("android_share_ratio")
    public String androidShareRatio;

    @C09CT("android_unit_price")
    public String androidUnitPrice;

    @C09CT("apply_ts")
    public long applyTs;

    @C09CT("attribution_info")
    public TaskAttributionInfo attributionInfo;

    @C09CT("cp_punished_ts")
    public long cpPunishedTs;

    @C09CT("exclusive_task")
    public boolean exclusiveTask;

    @C09CT("game_id")
    public Long gameId;

    @C09CT("game_id_str")
    public String gameIdStr;

    @C09CT("game_link_type")
    public int gameLinkType;

    @C09CT("game_tag_id")
    public long gameTagId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("ios_age_limit")
    public int iosAgeLimit;

    @C09CT("ios_share_ratio")
    public String iosShareRatio;

    @C09CT("ios_unit_price")
    public String iosUnitPrice;

    @C09CT("last_android_share_ratio")
    public String lastAndroidShareRatio;

    @C09CT("last_android_unit_price")
    public String lastAndroidUnitPrice;

    @C09CT("last_ios_share_ratio")
    public String lastIosShareRatio;

    @C09CT("last_ios_unit_price")
    public String lastIosUnitPrice;

    @C09CT("last_price_update_timestamp")
    public long lastPriceUpdateTimestamp;

    @C09CT("open_gll")
    public int openGll;

    @C09CT("recruit_type")
    public int recruitType;

    @C09CT("show_duration")
    public Long showDuration;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("task_description")
    public List<String> taskDescription;

    @C09CT("task_mode")
    public int taskMode;

    @C09CT("task_type")
    public int taskType;

    @C09CT("task_name")
    public String taskName = "";

    @C09CT("last_android_unit_price_usd")
    public String lastAndroidUnitPriceUsd = "";

    @C09CT("cpp_url")
    public String cppUrl = "";

    @C09CT("last_ios_unit_price_usd")
    public String lastIosUnitPriceUsd = "";

    @C09CT("android_unit_price_usd")
    public String androidUnitPriceUsd = "";

    @C09CT("ios_unit_price_usd")
    public String iosUnitPriceUsd = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.idStr != null) {
            sb.append(", id_str=");
            sb.append(this.idStr);
        }
        if (this.gameId != null) {
            sb.append(", game_id=");
            sb.append(this.gameId);
        }
        if (this.gameIdStr != null) {
            sb.append(", game_id_str=");
            sb.append(this.gameIdStr);
        }
        sb.append(", task_mode=");
        sb.append(this.taskMode);
        sb.append(", status=");
        sb.append(this.status);
        if (this.iosUnitPrice != null) {
            sb.append(", ios_unit_price=");
            sb.append(this.iosUnitPrice);
        }
        if (this.androidUnitPrice != null) {
            sb.append(", android_unit_price=");
            sb.append(this.androidUnitPrice);
        }
        if (this.iosShareRatio != null) {
            sb.append(", ios_share_ratio=");
            sb.append(this.iosShareRatio);
        }
        if (this.androidShareRatio != null) {
            sb.append(", android_share_ratio=");
            sb.append(this.androidShareRatio);
        }
        List<String> list = this.taskDescription;
        if (list != null && !list.isEmpty()) {
            sb.append(", task_describtion=");
            sb.append(this.taskDescription);
        }
        if (this.showDuration != null) {
            sb.append(", show_duration=");
            sb.append(this.showDuration);
        }
        sb.replace(0, 2, "PartnershipTask{");
        sb.append('}');
        return sb.toString();
    }
}
