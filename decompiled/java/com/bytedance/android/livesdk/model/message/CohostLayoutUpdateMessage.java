package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import tikcast.linkmic.common.LayoutData;

/* JADX INFO: loaded from: classes.dex */
public final class CohostLayoutUpdateMessage extends AbstractC1136060ffY {

    @C09CT("cross_room_layout")
    public LayoutData crossRoomLayout;

    @C09CT("toast_display_text")
    public Text toastDisplayText;

    public CohostLayoutUpdateMessage() {
        this.type = C001A.COHOST_LAYOUT_UPDATE_MESSAGE;
    }
}
