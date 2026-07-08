package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.livesdk.message.proto.RankUserEnigmaInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RankUser {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("border")
    public Border border;

    @C09CT("enigma_info")
    public RankUserEnigmaInfo enigmaInfo;

    @C09CT("follow_info")
    public FollowInfo followInfo;

    @C09CT("follow_status")
    public long followStatus;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("secret")
    public int secret;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("display_id")
    public String displayId = "";

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();

    @C09CT("id_str")
    public String idStr = "";

    public static final class Border {

        @C09CT("border_privilege_log_extra")
        public PrivilegeLogExtra borderPrivilegeLogExtra;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("level")
        public long level;

        @C09CT("profile_decoration_ribbon")
        public ImageModel profileDecorationRibbon;

        @C09CT("profile_privilege_log_extra")
        public PrivilegeLogExtra profilePrivilegeLogExtra;

        @C09CT("source")
        public String source = "";
    }

    public static final class FollowInfo {

        @C09CT("follow_status")
        public long followStatus;

        @C09CT("follower_count")
        public long followerCount;

        @C09CT("following_count")
        public long followingCount;

        @C09CT("push_status")
        public long pushStatus;
    }
}
