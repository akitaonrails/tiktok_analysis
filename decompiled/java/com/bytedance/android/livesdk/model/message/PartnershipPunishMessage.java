package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipPunishMessage extends AbstractC1136060ffY {

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    public PartnershipPunishMessage() {
        this.type = C001A.PARTNERSHIP_PUNISH_MESSAGE;
    }
}
