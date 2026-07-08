package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class RankNoticeMessage extends AbstractC1136060ffY {

    @C09CT("affiliated_content_text")
    public Text affiliatedContentText;

    @C09CT("content_icon")
    public ImageModel contentIcon;

    @C09CT("content_text")
    public Text contentText;

    @C09CT("league_match_extra")
    public LeagueMatchExtra leagueMatchExtra;

    @C09CT("owner_rank_info")
    public OwnerRankInfo ownerRankInfo;

    @C09CT("rank_type")
    public int rankType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    public RankNoticeMessage() {
        this.type = C001A.RANK_NOTICE_MESSAGE;
    }
}
