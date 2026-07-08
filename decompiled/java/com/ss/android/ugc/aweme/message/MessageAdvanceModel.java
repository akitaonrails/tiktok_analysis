package com.ss.android.ugc.aweme.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MessageAdvanceModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("handler_list")
    public final List<String> handlerList;

    public MessageAdvanceModel() {
        this(false, new ArrayList());
    }

    public MessageAdvanceModel(boolean z, List<String> list) {
        this.enable = z;
        this.handlerList = list;
    }
}
