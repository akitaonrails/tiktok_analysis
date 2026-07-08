package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;

/* JADX INFO: loaded from: classes.dex */
public final class LiveInfoGetResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("current_room_cover")
        public ImageModel currentRoomCover;

        @C09CT("current_title")
        public String currentTitle = "";

        @C09CT("game_tag")
        public GameTag gameTag;

        @C09CT("hashtag")
        public Hashtag hashtag;

        @C09CT("use_last_live_tag_by_default")
        public boolean useLastLiveTagByDefault;
    }
}
