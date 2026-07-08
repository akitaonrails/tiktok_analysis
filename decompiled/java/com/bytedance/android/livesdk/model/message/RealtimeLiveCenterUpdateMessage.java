package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RealtimeLiveCenterUpdateMessage extends AbstractC1136060ffY {

    @C09CT("list")
    public List<RealtimeLiveCenterDataUpdateMessageItemInfo> list;

    public RealtimeLiveCenterUpdateMessage() {
        this.type = C001A.REALTIME_LIVE_CENTER_UPDATE_MESSAGE;
        this.list = new ArrayList();
    }
}
