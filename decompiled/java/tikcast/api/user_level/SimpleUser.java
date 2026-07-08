package tikcast.api.user_level;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleUser {

    @C09CT("avatar_frame")
    public ImageModel avatarFrame;

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("is_following")
    public boolean isFollowing;

    @C09CT("is_secret_room")
    public boolean isSecretRoom;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("display_id")
    public String displayId = "";

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("bio_description")
    public String bioDescription = "";
}
