package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.download;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.GameStationAttributionInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDownloadCardModel {

    @C09CT("attribution_info")
    public GameStationAttributionInfo attributionInfo;

    @C09CT("game_info")
    public GameStationGameInfo gameInfo;

    @C09CT("reward_list")
    public List<BriefBenefitInfo> rewardList = new ArrayList();
}
