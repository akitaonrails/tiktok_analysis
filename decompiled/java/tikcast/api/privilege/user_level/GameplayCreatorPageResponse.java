package tikcast.api.privilege.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GameplayCreatorPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("end_time_ms")
        public long endTimeMs;

        @C09CT("gallery_gift_exists")
        public boolean galleryGiftExists;

        @C09CT("gallery_gift_id")
        public long galleryGiftId;

        @C09CT("has_goodybag_permission")
        public boolean hasGoodybagPermission;

        @C09CT("highlight_time")
        public HighlightTime highlightTime;

        @C09CT("start_time_ms")
        public long startTimeMs;

        @C09CT("sticker_type")
        public int stickerType;

        @C09CT("warm_up_tims_ms")
        public long warmUpTimsMs;

        @C09CT("top_user_list")
        public List<TopUser> topUserList = new ArrayList();

        @C09CT("show_id")
        public String showId = "";

        public static final class TopUser {

            @C09CT("description")
            public Text description;

            @C09CT("rank")
            public int rank;

            @C09CT("user")
            public User user;
        }
    }
}
