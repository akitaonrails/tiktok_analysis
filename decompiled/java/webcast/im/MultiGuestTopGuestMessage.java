package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestTopGuestMessage extends AbstractC1136060ffY {

    @C09CT("message_type")
    public int messageType;

    @C09CT("meta_content")
    public TopGuestMetaContent metaContent;

    @C09CT("top_guest_end_content")
    public TopGuestEndContent topGuestEndContent;

    @C09CT("top_guest_start_content")
    public TopGuestStartContent topGuestStartContent;

    public MultiGuestTopGuestMessage() {
        this.type = C001A.MULTI_GUEST_TOP_GUEST_MESSAGE;
    }
}
