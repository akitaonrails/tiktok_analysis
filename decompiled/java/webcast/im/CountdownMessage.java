package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.CountdownContent;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownMessage extends AbstractC1136060ffY {

    @C09CT("countdown_content")
    public CountdownContent countdownContent;

    @C09CT("message_type")
    public int messageType;

    @C09CT("operator_user_info")
    public LinkerMediaChangeOperator operatorUserInfo;

    public CountdownMessage() {
        this.type = C001A.COUNTDOWN_MESSAGE;
    }
}
