package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.message.proto.PerceptionFeedbackOption;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class PerceptionDialogInfo {

    @C09CT("advice_action_text")
    public Text adviceActionText;

    @C09CT("appeal_popup")
    public int appealPopup;

    @C09CT("close_action_text")
    public Text closeActionText;

    @C09CT("count_down_time")
    public long countDownTime;

    @C09CT("default_action_text")
    public Text defaultActionText;

    @C09CT("icon_type")
    public long iconType;

    @C09CT("policy_tip")
    public long policyTip;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("show_feedback")
    public boolean showFeedback;

    @C09CT("sub_title")
    public Text subTitle;

    @C09CT("target_room_id")
    public long targetRoomId;

    @C09CT("target_user_id")
    public long targetUserId;

    @C09CT("title")
    public Text title;

    @C09CT("violation_detail_url")
    public String violationDetailUrl = "";

    @C09CT("feedback_options")
    public List<PerceptionFeedbackOption> feedbackOptions = new ArrayList();
}
