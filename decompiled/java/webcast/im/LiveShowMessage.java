package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.ShowContent;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowMessage extends AbstractC1136060ffY {

    @C09CT("message_type")
    public int messageType;

    @C09CT("operator_user_info")
    public LinkerMediaChangeOperator operatorUserInfo;

    @C09CT("show_content")
    public ShowContent showContent;

    @C09CT("showUserFinishReason")
    public int showuserfinishreason;

    public LiveShowMessage() {
        this.type = C001A.LIVE_SHOW_MESSAGE;
    }
}
