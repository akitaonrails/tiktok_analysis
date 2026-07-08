package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes13.dex */
public final class EnterMonitorResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("data")
        public Room data;

        @C09CT("monitor_result")
        public int monitorResult;
    }
}
