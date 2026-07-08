package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class DebugToolState implements Serializable {

    @C09CT("can_debug_tool")
    public Boolean canDebugTool;

    public DebugToolState() {
        this(null);
    }

    public DebugToolState(Boolean bool) {
        this.canDebugTool = bool;
    }

    public final void setCanDebugTool(Boolean bool) {
        this.canDebugTool = bool;
    }
}
