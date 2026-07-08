package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuestInviteGuideMessage extends AbstractC1136060ffY {

    @C09CT("guest_invite_click_action")
    public int guestInviteClickAction;

    @C09CT("guest_invite_display_type")
    public int guestInviteDisplayType;

    @C09CT("invite_user")
    public User inviteUser;

    @C09CT("invitee_avatar")
    public List<ImageModel> inviteeAvatar;

    @C09CT("trigger_type")
    public String triggerType;

    public GuestInviteGuideMessage() {
        this.type = C001A.GUEST_INVITE_GUIDE_MESSAGE;
        this.inviteeAvatar = new ArrayList();
        this.triggerType = "";
    }
}
