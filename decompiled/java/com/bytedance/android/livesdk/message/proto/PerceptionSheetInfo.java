package com.bytedance.android.livesdk.message.proto;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes13.dex */
public final class PerceptionSheetInfo {

    @C09CT("count_down_time")
    public long countDownTime;

    @C09CT("default_action_text")
    public Text defaultActionText;

    @C09CT("icon_type")
    public int iconType;

    @C09CT("not_allowed_text")
    public Text notAllowedText;

    @C09CT("not_allowed_title")
    public Text notAllowedTitle;

    @C09CT("reason_info")
    public Text reasonInfo;

    @C09CT("reason_title")
    public Text reasonTitle;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("sub_title")
    public Text subTitle;

    @C09CT("target_room_id")
    public long targetRoomId;

    @C09CT("target_user_id")
    public long targetUserId;

    @C09CT("title")
    public Text title;
}
