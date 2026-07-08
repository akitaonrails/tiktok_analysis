package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownForAllMessage extends AbstractC1136060ffY {

    @C09CT("message_type")
    public int messageType;

    @C09CT("operator_user_info")
    public LinkerMediaChangeOperator operatorUserInfo;

    @C09CT("play_content")
    public CountdownForAllContent playContent;

    @C09CT("play_end_reason")
    public int playEndReason;

    public CountdownForAllMessage() {
        this.type = C001A.COUNTDOWN_FOR_ALL_MESSAGE;
    }
}
