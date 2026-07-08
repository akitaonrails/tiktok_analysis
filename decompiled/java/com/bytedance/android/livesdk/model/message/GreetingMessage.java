package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import webcast.data.UserIdentity;

/* JADX INFO: loaded from: classes.dex */
public final class GreetingMessage extends AbstractC1136060ffY {

    @C09CT("enter_msg_id")
    public long enterMsgId;

    @C09CT("greeting_text")
    public Text greetingText;

    @C09CT("guide_text")
    public Text guideText;

    @C09CT("user_identity")
    public UserIdentity userIdentity;

    @C09CT("wave_algorithm_data")
    public WaveAlgorithmData waveAlgorithmData;

    public GreetingMessage() {
        this.type = C001A.GREETING_MESSAGE;
    }
}
