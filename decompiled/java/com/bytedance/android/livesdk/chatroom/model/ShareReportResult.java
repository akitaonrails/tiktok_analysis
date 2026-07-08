package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes8.dex */
public class ShareReportResult {

    @C09CT("delta_intimacy")
    public long deltaIntimacy;

    @C09CT("display_text")
    public Text displayText;

    public long getDeltaIntimacy() {
        return this.deltaIntimacy;
    }

    public Text getDisplayText() {
        return this.displayText;
    }

    @C09CT("delta_intimacy")
    public void setDeltaIntimacy(long j) {
        this.deltaIntimacy = j;
    }

    @C09CT("display_text")
    public void setDisplayText(Text text) {
        this.displayText = text;
    }
}
