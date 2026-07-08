package webcast.data.multi_guest_play;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionInfo {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("linkmic_id_str")
    public String linkmicIdStr = "";

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("transition_duration_of_current")
    public long transitionDurationOfCurrent;

    @C09CT("transition_start_time")
    public long transitionStartTime;

    @C09CT("user_id")
    public long userId;
}
