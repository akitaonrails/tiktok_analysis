package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipDropsAnchorMessage extends AbstractC1136060ffY {

    @C09CT("anchor_join_drops_notice_type")
    public int anchorJoinDropsNoticeType;

    @C09CT("anchor_uid")
    public long anchorUid;

    @C09CT("change_mode")
    public int changeMode;

    @C09CT("drops_id")
    public String dropsId;

    @C09CT("drops_name")
    public String dropsName;

    public PartnershipDropsAnchorMessage() {
        this.type = C001A.PARTNERSHIP_DROPS_ANCHOR_MESSAGE;
        this.dropsId = "";
        this.dropsName = "";
    }
}
