package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarReportDeleteMessage extends AbstractC1136060ffY {

    @C09CT("avatar_id")
    public long avatarId;

    @C09CT("avatar_owner_user_id")
    public long avatarOwnerUserId;

    public AvatarReportDeleteMessage() {
        this.type = C001A.AVATAR_REPORT_DELETE_MESSAGE;
    }
}
