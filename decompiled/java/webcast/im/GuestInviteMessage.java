package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class GuestInviteMessage extends AbstractC1136060ffY {

    @C09CT("inviter_avatar")
    public ImageModel inviterAvatar;

    @C09CT("inviter_nickname")
    public String inviterNickname;

    @C09CT("inviter_user_id")
    public long inviterUserId;

    @C09CT("room_id")
    public long roomId;

    public GuestInviteMessage() {
        this.type = C001A.GUEST_INVITE_MESSAGE;
        this.inviterNickname = "";
    }
}
