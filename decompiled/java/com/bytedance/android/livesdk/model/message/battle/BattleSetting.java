package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMetaV2;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public class BattleSetting {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("battle_type")
    public int battleType;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("duration")
    public int duration;

    @C09CT("end_time_ms")
    public long endTimeMs;

    @C09CT("extra_duration_second")
    public long extraDurationSecond;

    @C09CT("gameplay_option")
    public int gameplayOption;

    @C09CT("gift_mode_meta")
    public GiftModeMeta giftModeMeta;

    @C09CT("gift_mode_meta_v2")
    public GiftModeMetaV2 giftModeMetaV2;

    @C09CT("ice_showdown_setting")
    public int iceShowdownSetting;

    @C09CT("invite_type")
    public int inviteType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("source_type")
    public long sourceType;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleSetting{channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", battleId=");
        sbLIZ.append(this.battleId);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.startTimeMs);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", inviteType=");
        sbLIZ.append(this.inviteType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
