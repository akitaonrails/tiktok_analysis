package com.bytedance.android.livesdk.game.model;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class AccessRecallMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public Text content;

    @C09CT("duration")
    public long duration;

    @C09CT("end_time")
    public long endTime;

    @C09CT("end_time_v2")
    public long endTimeV2;

    @C09CT("notice")
    public Text notice;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public AccessRecallMessage() {
        this.type = C001A.ACCESS_RECALL_MESSAGE;
        this.scene = "";
    }
}
