package com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class MessageExt {

    @C09CT("active_action_bar")
    public int activeActionBar;

    @C09CT("active_ai_image_sub_bar")
    public int activeAiImageSubBar;

    @C09CT("log")
    public final long log;

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.log) * 31) + this.activeActionBar) * 31) + this.activeAiImageSubBar;
    }

    public MessageExt() {
        this(0L, 0, 0);
    }

    public MessageExt(long j, int i, int i2) {
        this.log = j;
        this.activeActionBar = i;
        this.activeAiImageSubBar = i2;
    }
}
