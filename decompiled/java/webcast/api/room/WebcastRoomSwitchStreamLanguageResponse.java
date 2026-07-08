package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;

/* JADX INFO: loaded from: classes8.dex */
public final class WebcastRoomSwitchStreamLanguageResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("stream_url")
        public StreamUrl streamUrl;
    }
}
