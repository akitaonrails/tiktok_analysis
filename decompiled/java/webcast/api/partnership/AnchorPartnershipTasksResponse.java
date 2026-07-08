package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorPartnershipTasksResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("promoting_tasks")
        public List<BriefGameTask> promotingTasks = new ArrayList();

        @C09CT("promoting_events")
        public List<PartnershipGameEvent> promotingEvents = new ArrayList();

        @C09CT("promoting_publisher_events")
        public List<PartnershipGameEvent> promotingPublisherEvents = new ArrayList();
    }
}
