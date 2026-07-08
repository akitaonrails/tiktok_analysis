package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class SpecialEffectCardInfo {

    @C09CT("card_image")
    public ImageModel cardImage;

    @C09CT("effect_last_duration")
    public long effectLastDuration;

    @C09CT("effect_time_sec")
    public long effectTimeSec;

    @C09CT("send_time_sec")
    public long sendTimeSec;

    @C09CT("send_user")
    public BattleUserInfo sendUser;

    @C09CT("to_anchor_id")
    public long toAnchorId;

    @C09CT("card_name_key")
    public String cardNameKey = "";

    @C09CT("rule_url")
    public String ruleUrl = "";

    @C09CT("to_anchor_id_str")
    public String toAnchorIdStr = "";
}
