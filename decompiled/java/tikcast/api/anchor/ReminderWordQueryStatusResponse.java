package tikcast.api.anchor;

import X.C09CT;
import webcast.data.AnchorReminderWordStatus;

/* JADX INFO: loaded from: classes13.dex */
public final class ReminderWordQueryStatusResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("reminder_word_status")
        public AnchorReminderWordStatus reminderWordStatus;
    }
}
