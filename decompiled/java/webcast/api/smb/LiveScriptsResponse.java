package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveScriptsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("segments")
        public List<LiveScriptsSegment> segments = new ArrayList();

        @C09CT("version")
        public int version;

        @C09CT("video")
        public ImageModel video;
    }
}
