package tikcast.api.anchor_data;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.AnchorReminderWordInfo;
import webcast.data.RealtimeLiveCenterTips;
import webcast.data.TrafficDiagnose;

/* JADX INFO: loaded from: classes.dex */
public final class RealtimeLiveCenterStandardIDL {

    @C09CT("fe_standard_idl")
    public FEStandardIDL feStandardIdl;

    @C09CT("im_standard_idl")
    public IMStandardIDL imStandardIdl;

    public static final class FEStandardIDL {

        @C09CT("live_journey_info")
        public RealtimeLiveCenterLiveJourneyInfo liveJourneyInfo;

        @C09CT("tips")
        public Tips tips;

        @C09CT("traffic_diagnose")
        public TrafficDiagnose trafficDiagnose;

        public static final class Tips {

            @C09CT("reminder_word_info")
            public AnchorReminderWordInfo reminderWordInfo;

            @C09CT("tips_info")
            public RealtimeLiveCenterTips tipsInfo;
        }
    }

    public static final class IMStandardIDL {

        @C09CT("tips")
        public Tips tips;

        public static final class Tips {

            @C09CT("reminder_word_info")
            public AnchorReminderWordInfo reminderWordInfo;
        }
    }
}
