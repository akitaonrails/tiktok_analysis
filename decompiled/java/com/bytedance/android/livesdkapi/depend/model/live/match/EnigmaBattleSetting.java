package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EnigmaBattleSetting {

    @C09CT("enigma_battle_campaign_end")
    public long enigmaBattleCampaignEnd;

    @C09CT("enigma_battle_campaign_start")
    public long enigmaBattleCampaignStart;

    @C09CT("enigma_score_reveal_countdown_sec")
    public List<Long> enigmaScoreRevealCountdownSec = new ArrayList();

    @C09CT("enigma_score_reveal_duration_sec")
    public long enigmaScoreRevealDurationSec;

    @C09CT("is_startable")
    public boolean isStartable;
}
