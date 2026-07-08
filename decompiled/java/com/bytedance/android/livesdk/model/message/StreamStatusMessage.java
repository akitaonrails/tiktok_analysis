package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StreamStatusMessage extends AbstractC1136060ffY {

    @C09CT("streams")
    public List<StreamStatusChangeInfo> streams;

    public StreamStatusMessage() {
        this.type = C001A.STREAM_STATUS_MESSAGE;
        this.streams = new ArrayList();
    }
}
