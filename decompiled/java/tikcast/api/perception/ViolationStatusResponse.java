package tikcast.api.perception;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class ViolationStatusResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseData {

        @C09CT("perception_dialog")
        public PerceptionDialogInfo perceptionDialog;

        @C09CT("perception_toast")
        public Text perceptionToast;

        @C09CT("punish_event")
        public PunishEventInfo punishEvent;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
