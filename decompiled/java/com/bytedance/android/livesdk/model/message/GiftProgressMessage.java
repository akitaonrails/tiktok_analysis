package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftProgressMessage extends AbstractC1136060ffY {

    @C09CT("progress")
    public List<ProgressStruct> progress;

    @C09CT("progress_type")
    public String progressType;

    public static final class ProgressStruct {

        @C09CT("progress_id")
        public long progressId;

        @C09CT("progress_status")
        public int progressStatus;

        @C09CT("progress_value")
        public long progressValue;
    }

    public GiftProgressMessage() {
        this.type = C001A.GIFT_PROGRESS_MESSAGE;
        this.progressType = "";
        this.progress = new ArrayList();
    }
}
