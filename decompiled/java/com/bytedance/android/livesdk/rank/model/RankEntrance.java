package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes28.dex */
public final class RankEntrance {

    @C09CT("affiliated_content")
    public AffiliatedInfo affiliatedContent;

    @C09CT("related_tab_rank_type")
    public int belongRankType;

    @C09CT("block_message")
    public boolean blockMessage;

    @C09CT("class_info")
    public ClassInfo classInfo;

    @C09CT("countdown")
    public long countdown;

    @C09CT("current_score")
    public long currentScore;

    @C09CT("default_content")
    public Text defaultContent;

    @C09CT("entranceIcon")
    public ImageModel entranceicon;

    @C09CT("list_schema")
    public String listSchema = "";

    @C09CT("owner_on_rank")
    public boolean ownerOnRank;

    @C09CT("owner_rank_idx")
    public long ownerRankIdx;

    @C09CT("rank_type")
    public int rankType;

    @C09CT("request_first_show_type")
    public int requestFirstShowType;

    @C09CT("reset_time")
    public long resetTime;

    @C09CT("roll_config")
    public RollCfg rollConfig;

    @C09CT("window_size")
    public long windowSize;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", rank_type=");
        sb.append(this.rankType);
        sb.append(", countdown=");
        sb.append(this.countdown);
        if (this.defaultContent != null) {
            sb.append(", default_content=");
            sb.append(this.defaultContent);
        }
        if (this.rollConfig != null) {
            sb.append(", roll_config=");
            sb.append(this.rollConfig);
        }
        sb.append(", block_message=");
        sb.append(this.blockMessage);
        sb.append(", owner_rank_idx=");
        sb.append(this.ownerRankIdx);
        sb.append(", owner_on_rank=");
        sb.append(this.ownerOnRank);
        sb.replace(0, 2, "RankEntrance{");
        sb.append('}');
        return sb.toString();
    }
}
