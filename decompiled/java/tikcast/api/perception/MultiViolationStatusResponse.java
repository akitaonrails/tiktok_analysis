package tikcast.api.perception;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiViolationStatusResponse {

    @C09CT("data")
    public List<ViolationData> data = new ArrayList();

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }

    public static final class ViolationData {

        @C09CT("end_time")
        public long endTime;

        @C09CT("end_time_v2")
        public long endTimeV2;

        @C09CT("perception_dialog")
        public PerceptionDialogInfo perceptionDialog;

        @C09CT("perception_toast")
        public Text perceptionToast;

        @C09CT("punish_event")
        public PunishEventInfo punishEvent;

        @C09CT(Scene.SCENE_SERVICE)
        public int scene;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}
