package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ChangePositionResp extends LinkMicUplinkBaseResp {

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    public ChangePositionResp() {
        super(null);
        this.linkedUserUiPositions = new ArrayList();
    }
}
