package webcast.data.multi_guest_play;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class ShowListUser {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT("order")
    public int order;

    @C09CT("score")
    public long score;

    @C09CT("show_start_time")
    public long showStartTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("user_id")
    public long userId;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("linkmic_id_str")
    public String linkmicIdStr = "";
}
