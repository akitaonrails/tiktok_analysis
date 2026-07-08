package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AnchorLiveReplayFrameResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("req_id")
        public String reqId = "";

        @C09CT("frame_list")
        public List<FrameInfo> frameList = new ArrayList();
    }
}
