package webcast.data.multi_guest_play;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownContributors {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("enigma_info")
    public User.EnigmaInfo enigmaInfo;

    @C09CT("rank")
    public int rank;

    @C09CT("score")
    public long score;

    @C09CT("user_id")
    public long userId;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("display_id")
    public String displayId = "";
}
