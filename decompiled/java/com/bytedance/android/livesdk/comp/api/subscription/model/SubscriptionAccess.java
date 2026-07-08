package com.bytedance.android.livesdk.comp.api.subscription.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscriptionAccess {

    @C09CT("punish_info")
    public final PunishInfo punishInfo;

    @C09CT("toast")
    public final Text toast;

    public SubscriptionAccess(PunishInfo punishInfo, Text text) {
        this.punishInfo = punishInfo;
        this.toast = text;
    }
}
