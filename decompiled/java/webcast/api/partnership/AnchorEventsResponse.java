package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GamepadPublisherEvent;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorEventsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("event_info_list")
        public List<PartnershipGameEvent> eventInfoList;

        @C09CT("publish_event_list")
        public List<GamepadPublisherEvent> publishEventList;
    }
}
