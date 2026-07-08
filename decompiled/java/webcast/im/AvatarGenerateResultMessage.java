package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarGenerateResultMessage extends AbstractC1136060ffY {

    @C09CT("avatar")
    public Avatar avatar;

    public AvatarGenerateResultMessage() {
        this.type = C001A.AVATAR_GENERATE_RESULT_MESSAGE;
    }
}
