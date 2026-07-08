package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MiniUser {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT("follow_info")
    public FollowInfo followInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_mini_user")
    public boolean isMiniUser;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("display_id")
    public String displayId = "";

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();

    @C09CT("id_str")
    public String idStr = "";

    public static final class FollowInfo {

        @C09CT("follow_status")
        public long followStatus;
    }
}
