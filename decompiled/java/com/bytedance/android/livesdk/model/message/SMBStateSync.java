package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;

/* JADX INFO: loaded from: classes.dex */
public final class SMBStateSync extends AbstractC1136060ffY {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("smb_info")
    public SMBInfo smbInfo;

    public SMBStateSync() {
        this.type = C001A.S_M_B_STATE_SYNC;
    }
}
