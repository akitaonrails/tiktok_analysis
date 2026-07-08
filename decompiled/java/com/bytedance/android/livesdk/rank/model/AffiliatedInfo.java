package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AffiliatedInfo {

    @C09CT("anchor_certification_info")
    public RankUserAnchorCertificationInfo anchorCertificationInfo;

    @C09CT("gap_desc")
    public Text gapDesc;

    @C09CT("midday_peak_time_stamp")
    public long middayPeakTimeStamp;

    @C09CT("settle_info")
    public SettleInfo settleInfo;

    @C09CT("sticker_gap_desc")
    public Text stickerGapDesc;

    @C09CT("sticker_settle_show_duration")
    public long stickerSettleShowDuration;

    @C09CT("sticker_show_scene")
    public int stickerShowScene;

    @C09CT("sticker_track_param")
    public Map<String, String> stickerTrackParam = new LinkedHashMap();

    @C09CT("sub_content")
    public Text subContent;

    @C09CT("team_rank_bonus_time")
    public TeamRankBonusTime teamRankBonusTime;
}
