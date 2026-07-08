package tikcast.api.perception;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveStatusPerceptionResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class BannerPerception {

        @C09CT("punish_info")
        public PunishEventInfo punishInfo;

        @C09CT(Scene.SCENE_SERVICE)
        public int scene;

        @C09CT("title")
        public String title = "";

        @C09CT("sub_title")
        public String subTitle = "";

        @C09CT("detail_url")
        public String detailUrl = "";
    }

    public static final class ResponseData {

        @C09CT("banner_perception")
        public BannerPerception bannerPerception;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
