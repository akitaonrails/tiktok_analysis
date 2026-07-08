package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorToolModificationMessage extends AbstractC1136060ffY {

    @C09CT("modification")
    public AnchorToolModification modification;

    public AnchorToolModificationMessage() {
        this.type = C001A.ANCHOR_TOOL_MODIFICATION_MESSAGE;
        this.modification = new AnchorToolModification();
    }
}
