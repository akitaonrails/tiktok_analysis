package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CompetitionPlatformMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("battle_type")
    public int battleType;

    @C09CT("initiate_info")
    public CompetitionInitiateInfo initiateInfo;

    @C09CT("rotate_info")
    public CompetitionRotateInfo rotateInfo;

    public static final class CompetitionInitiateInfo {

        @C09CT("inviter_prompt")
        public Text inviterPrompt;

        @C09CT("performance_duration_sec")
        public long performanceDurationSec;

        @C09CT("performance_order")
        public List<Long> performanceOrder = new ArrayList();
    }

    public static final class CompetitionRotateInfo {

        @C09CT("next_performer_id")
        public long nextPerformerId;
    }

    public CompetitionPlatformMessage() {
        this.type = C001A.COMPETITION_PLATFORM_MESSAGE;
    }
}
