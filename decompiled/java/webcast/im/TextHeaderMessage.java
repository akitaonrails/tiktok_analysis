package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import webcast.data.multi_guest_play.TextHeaderPlayContent;

/* JADX INFO: loaded from: classes.dex */
public final class TextHeaderMessage extends AbstractC1136060ffY {

    @C09CT("message_type")
    public int messageType;

    @C09CT("text_header_play_content")
    public TextHeaderPlayContent textHeaderPlayContent;

    public TextHeaderMessage() {
        this.type = C001A.TEXT_HEADER_MESSAGE;
    }
}
