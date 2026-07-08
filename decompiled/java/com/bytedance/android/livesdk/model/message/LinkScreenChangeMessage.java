package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkScreenChangeMessage extends AbstractC1136060ffY {

    @C09CT("enlarge_pos_status_syn")
    public EnlargePositionStatusSynContent enlargePosStatusSyn;

    @C09CT("enlarge_status_syn")
    public LinkerEnlargeStatusSynContent enlargeStatusSyn;

    @C09CT("guest_cancel_enlarge")
    public LinkerGuestCancelEnlargeContent guestCancelEnlarge;

    @C09CT("message_type")
    public int messageType;

    public LinkScreenChangeMessage() {
        this.type = C001A.LINK_SCREEN_CHANGE_MESSAGE;
    }
}
