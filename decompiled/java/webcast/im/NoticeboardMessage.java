package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.NoticeboardContent;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardMessage extends AbstractC1136060ffY {

    @C09CT("message_type")
    public int messageType;

    @C09CT("noticeboard_content")
    public NoticeboardContent noticeboardContent;

    @C09CT("operator_user_info")
    public LinkerMediaChangeOperator operatorUserInfo;

    public NoticeboardMessage() {
        this.type = C001A.NOTICEBOARD_MESSAGE;
    }
}
