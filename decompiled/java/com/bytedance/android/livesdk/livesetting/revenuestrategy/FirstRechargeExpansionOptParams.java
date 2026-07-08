package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class FirstRechargeExpansionOptParams {
    public static final TypeAdapter ADAPTER = new FirstRechargeExpansionOptParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("is_first_recharge")
    public boolean isFirstRecharge;

    @C09CT("move_first_recharge_gift")
    public boolean moveFirstRechargeGift;

    @C09CT("optimized_regular_recharge_panel")
    public boolean optimizedRegularRechargePanel;

    @C09CT("record_entry_panel")
    public RecordEntryPanelParams recordEntryPanel;

    public FirstRechargeExpansionOptParams() {
        this(false, false, false, null);
    }

    public FirstRechargeExpansionOptParams(boolean z, boolean z2, boolean z3, RecordEntryPanelParams recordEntryPanelParams) {
        this.optimizedRegularRechargePanel = z;
        this.moveFirstRechargeGift = z2;
        this.isFirstRecharge = z3;
        this.recordEntryPanel = recordEntryPanelParams;
    }
}
