package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CheckPermissionExtra extends Extra {

    @C09CT("link_mic_pay_hint")
    public String payHint;

    @C09CT("pay_options")
    public List<LinkPayPlan> payPlans;
}
