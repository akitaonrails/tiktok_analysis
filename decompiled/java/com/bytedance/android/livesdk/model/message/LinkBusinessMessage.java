package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkBusinessMessage extends AbstractC1136060ffY {

    @C09CT("message_type")
    public int messageType;

    @C09CT("popup_state_change_content")
    public PopupStateChangeContent popupStateChangeContent;

    public LinkBusinessMessage() {
        this.type = C001A.LINK_BUSINESS_MESSAGE;
    }
}
