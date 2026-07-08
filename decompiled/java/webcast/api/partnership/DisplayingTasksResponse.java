package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class DisplayingTasksResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("game_tasks")
        public List<BriefGameTask> gameTasks = new ArrayList();
    }
}
