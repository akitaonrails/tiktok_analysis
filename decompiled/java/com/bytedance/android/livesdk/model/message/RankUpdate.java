package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.model.ClassInfo;
import com.bytedance.android.livesdk.rank.model.SettleInfo;
import com.bytedance.android.livesdk.rank.model.TeamRankBonusTime;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RankUpdate {

    @C09CT("affiliated_info")
    public AffiliatedInfo affiliatedInfo;
    public RankAnimationInfo animationInfo;
    public int belongType;

    @C09CT("class_info")
    public ClassInfo classInfo;

    @C09CT("current_score")
    public long currentScore;
    public Text defaultContent;

    @C09CT("entranceIcon")
    public ImageModel entranceicon;
    public long ownRank;

    @C09CT("OwnerOnRank")
    public boolean owneronrank;
    public int rankType;

    @C09CT("request_first_show_type")
    public int requestFirstShowType;

    @C09CT("supported_version")
    public long supportedVersion;
    public long countdown = 1000;

    @C09CT("list_schema")
    public String listSchema = "";

    public static final class AffiliatedInfo {

        @C09CT("gap_desc")
        public Text gapDesc;

        @C09CT("midday_peak_time_stamp")
        public long middayPeakTimeStamp;

        @C09CT("real_time_rank")
        public long realTimeRank;

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

        @C09CT("team_rank_bonus_time")
        public TeamRankBonusTime teamRankBonusTime;

        @C09CT("text_content")
        public Text textContent;
    }
}
