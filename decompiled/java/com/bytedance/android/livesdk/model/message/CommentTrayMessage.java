package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CommentTrayMessage extends AbstractC1136060ffY {
    public long LL;
    public Integer LLILLJJLI;
    public Integer LLILLL;
    public String LLILZ;
    public String LLILZIL;

    @C09CT("chat_time")
    public long chatTime;

    @C09CT("content")
    public String content;

    @C09CT("content_type")
    public long contentType;

    @C09CT("count")
    public long count;

    @C09CT("tray_id")
    public long trayId;

    public CommentTrayMessage() {
        this.type = C001A.COMMENT_TRAY_MESSAGE;
        this.content = "";
    }
}
