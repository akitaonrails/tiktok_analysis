package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.GuestShowdownConfigChange;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownMessage extends AbstractC1136060ffY {

    @C09CT("guest_showdown_config_change")
    public GuestShowdownConfigChange guestShowdownConfigChange;

    @C09CT("message_type")
    public int messageType;

    @C09CT("operator_user_info")
    public LinkerMediaChangeOperator operatorUserInfo;

    @C09CT("play_closed_reason")
    public int playClosedReason;

    @C09CT("play_content")
    public GuestShowdownContent playContent;

    @C09CT("to_calculating_reason")
    public int toCalculatingReason;

    public GuestShowdownMessage() {
        this.type = C001A.GUEST_SHOWDOWN_MESSAGE;
    }
}
