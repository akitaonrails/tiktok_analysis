package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public class ControlMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public int action;

    @C09CT("extra")
    public Extra extraInfo;

    @C09CT("float_style")
    public int floatStyle;

    @C09CT("float_text")
    public Text floatText;

    @C09CT("perception_audience_text")
    public Text perceptionAudienceText;

    @C09CT("perception_dialog")
    public PerceptionDialogInfo perceptionDialogInfo;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("tips")
    public String tips;

    public static class Extra {

        @C09CT("ban_info_url")
        public String banInfoUrl;

        @C09CT("display_text")
        public Text illegalText;

        @C09CT("reason_no")
        public long reasonNo;

        @C09CT("source")
        public String source;

        @C09CT("title")
        public Text title;

        @C09CT("violation_reason")
        public Text violationReason;
    }

    @Override // X.AbstractC1136060ffY, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        int i = this.action;
        return i == 1 || i == 2;
    }

    public ControlMessage() {
        this.type = C001A.CONTROL;
    }
}
